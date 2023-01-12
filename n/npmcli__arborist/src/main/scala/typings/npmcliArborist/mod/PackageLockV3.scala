package typings.npmcliArborist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.npmcliArborist.anon.Workspaces
import typings.npmcliArborist.npmcliArboristInts.`3`
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageLockV3
  extends StObject
     with PackageLockBase
     with PackageLock {
  
  var dependencies: js.UndefOr[scala.Nothing] = js.undefined
  
  var lockfileVersion: `3`
  
  @JSName("packages")
  var packages_PackageLockV3: NonNullable[
    js.UndefOr[
      StringDictionary[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LockDependency */ Any) & Workspaces
      ]
    ]
  ]
}
object PackageLockV3 {
  
  inline def apply(): PackageLockV3 = {
    val __obj = js.Dynamic.literal(lockfileVersion = 3)
    __obj.asInstanceOf[PackageLockV3]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PackageLockV3] (val x: Self) extends AnyVal {
    
    inline def setLockfileVersion(value: `3`): Self = StObject.set(x, "lockfileVersion", value.asInstanceOf[js.Any])
    
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
