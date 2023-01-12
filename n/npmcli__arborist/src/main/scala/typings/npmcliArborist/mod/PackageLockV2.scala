package typings.npmcliArborist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.npmcliArborist.anon.Workspaces
import typings.npmcliArborist.npmcliArboristInts.`2`
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageLockV2
  extends StObject
     with PackageLockBase
     with PackageLock {
  
  var dependencies: NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: @npmcli/arborist.@npmcli/arborist.PackageLockBase['dependencies'] */ js.Any
  ]
  
  var lockfileVersion: `2`
  
  @JSName("packages")
  var packages_PackageLockV2: NonNullable[
    js.UndefOr[
      StringDictionary[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LockDependency */ Any) & Workspaces
      ]
    ]
  ]
}
object PackageLockV2 {
  
  inline def apply(
    dependencies: NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: @npmcli/arborist.@npmcli/arborist.PackageLockBase['dependencies'] */ js.Any
    ]
  ): PackageLockV2 = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], lockfileVersion = 2)
    __obj.asInstanceOf[PackageLockV2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PackageLockV2] (val x: Self) extends AnyVal {
    
    inline def setDependencies(
      value: NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: @npmcli/arborist.@npmcli/arborist.PackageLockBase['dependencies'] */ js.Any
        ]
    ): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setLockfileVersion(value: `2`): Self = StObject.set(x, "lockfileVersion", value.asInstanceOf[js.Any])
    
    inline def setPackages(
      value: NonNullable[
          js.UndefOr[
            StringDictionary[
              (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LockDependency */ Any) & Workspaces
            ]
          ]
        ]
    ): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
    
    inline def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
  }
}
