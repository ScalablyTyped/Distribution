package typings.nodePgMigrate

import typings.nodePgMigrate.distOperationsPoliciesTypesMod.AlterPolicy
import typings.nodePgMigrate.distOperationsPoliciesTypesMod.CreatePolicy
import typings.nodePgMigrate.distOperationsPoliciesTypesMod.DropPolicy
import typings.nodePgMigrate.distOperationsPoliciesTypesMod.RenamePolicy
import typings.nodePgMigrate.distTypesMod.MigrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOperationsPoliciesMod {
  
  @JSImport("node-pg-migrate/dist/operations/policies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def alterPolicy(mOptions: MigrationOptions): AlterPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("alterPolicy")(mOptions.asInstanceOf[js.Any]).asInstanceOf[AlterPolicy]
  
  inline def createPolicy(mOptions: MigrationOptions): CreatePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("createPolicy")(mOptions.asInstanceOf[js.Any]).asInstanceOf[CreatePolicy]
  
  inline def dropPolicy(mOptions: MigrationOptions): DropPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("dropPolicy")(mOptions.asInstanceOf[js.Any]).asInstanceOf[DropPolicy]
  
  inline def renamePolicy(mOptions: MigrationOptions): RenamePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("renamePolicy")(mOptions.asInstanceOf[js.Any]).asInstanceOf[RenamePolicy]
}
