package typings.npmcliArborist.mod

import typings.npmcliArborist.npmcliArboristInts.`1`
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageLockV1
  extends StObject
     with PackageLockBase
     with PackageLock {
  
  var dependencies: NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: @npmcli/arborist.@npmcli/arborist.PackageLockBase['dependencies'] */ js.Any
  ]
  
  var lockfileVersion: `1`
  
  @JSName("packages")
  var packages_PackageLockV1: js.UndefOr[scala.Nothing] = js.undefined
}
object PackageLockV1 {
  
  inline def apply(
    dependencies: NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: @npmcli/arborist.@npmcli/arborist.PackageLockBase['dependencies'] */ js.Any
    ]
  ): PackageLockV1 = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], lockfileVersion = 1)
    __obj.asInstanceOf[PackageLockV1]
  }
  
  extension [Self <: PackageLockV1](x: Self) {
    
    inline def setDependencies(
      value: NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: @npmcli/arborist.@npmcli/arborist.PackageLockBase['dependencies'] */ js.Any
        ]
    ): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setLockfileVersion(value: `1`): Self = StObject.set(x, "lockfileVersion", value.asInstanceOf[js.Any])
  }
}
