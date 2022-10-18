package typings.nodePgMigrate

import typings.nodePgMigrate.distOperationsRolesTypesMod.AlterRole
import typings.nodePgMigrate.distOperationsRolesTypesMod.CreateRole
import typings.nodePgMigrate.distOperationsRolesTypesMod.DropRole
import typings.nodePgMigrate.distOperationsRolesTypesMod.RenameRole
import typings.nodePgMigrate.distTypesMod.MigrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOperationsRolesMod {
  
  @JSImport("node-pg-migrate/dist/operations/roles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def alterRole(mOptions: MigrationOptions): AlterRole = ^.asInstanceOf[js.Dynamic].applyDynamic("alterRole")(mOptions.asInstanceOf[js.Any]).asInstanceOf[AlterRole]
  
  inline def createRole(mOptions: MigrationOptions): CreateRole = ^.asInstanceOf[js.Dynamic].applyDynamic("createRole")(mOptions.asInstanceOf[js.Any]).asInstanceOf[CreateRole]
  
  inline def dropRole(mOptions: MigrationOptions): DropRole = ^.asInstanceOf[js.Dynamic].applyDynamic("dropRole")(mOptions.asInstanceOf[js.Any]).asInstanceOf[DropRole]
  
  inline def renameRole(mOptions: MigrationOptions): RenameRole = ^.asInstanceOf[js.Dynamic].applyDynamic("renameRole")(mOptions.asInstanceOf[js.Any]).asInstanceOf[RenameRole]
}
