package typings.nodePgMigrate

import typings.nodePgMigrate.distTypesMod.MigrationOptions
import typings.nodePgMigrate.rolesTypesMod.AlterRole
import typings.nodePgMigrate.rolesTypesMod.CreateRole
import typings.nodePgMigrate.rolesTypesMod.DropRole
import typings.nodePgMigrate.rolesTypesMod.RenameRole
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rolesMod {
  
  @JSImport("node-pg-migrate/dist/operations/roles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def alterRole(mOptions: MigrationOptions): AlterRole = ^.asInstanceOf[js.Dynamic].applyDynamic("alterRole")(mOptions.asInstanceOf[js.Any]).asInstanceOf[AlterRole]
  
  inline def createRole(mOptions: MigrationOptions): CreateRole = ^.asInstanceOf[js.Dynamic].applyDynamic("createRole")(mOptions.asInstanceOf[js.Any]).asInstanceOf[CreateRole]
  
  inline def dropRole(mOptions: MigrationOptions): DropRole = ^.asInstanceOf[js.Dynamic].applyDynamic("dropRole")(mOptions.asInstanceOf[js.Any]).asInstanceOf[DropRole]
  
  inline def renameRole(mOptions: MigrationOptions): RenameRole = ^.asInstanceOf[js.Dynamic].applyDynamic("renameRole")(mOptions.asInstanceOf[js.Any]).asInstanceOf[RenameRole]
}
