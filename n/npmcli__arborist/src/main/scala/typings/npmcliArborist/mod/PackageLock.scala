package typings.npmcliArborist.mod

import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.npmcliArborist.mod.PackageLockV1
  - typings.npmcliArborist.mod.PackageLockV2
  - typings.npmcliArborist.mod.PackageLockV3
*/
trait PackageLock extends StObject
object PackageLock {
  
  inline def PackageLockV1(
    dependencies: NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: @npmcli/arborist.@npmcli/arborist.PackageLockBase['dependencies'] */ js.Any
    ]
  ): typings.npmcliArborist.mod.PackageLockV1 = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], lockfileVersion = 1)
    __obj.asInstanceOf[typings.npmcliArborist.mod.PackageLockV1]
  }
  
  inline def PackageLockV2(
    dependencies: NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: @npmcli/arborist.@npmcli/arborist.PackageLockBase['dependencies'] */ js.Any
    ]
  ): typings.npmcliArborist.mod.PackageLockV2 = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], lockfileVersion = 2)
    __obj.asInstanceOf[typings.npmcliArborist.mod.PackageLockV2]
  }
  
  inline def PackageLockV3(): typings.npmcliArborist.mod.PackageLockV3 = {
    val __obj = js.Dynamic.literal(lockfileVersion = 3)
    __obj.asInstanceOf[typings.npmcliArborist.mod.PackageLockV3]
  }
}
