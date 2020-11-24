package typings.nodePgMigrate

import typings.nodePgMigrate.distTypesMod.MigrationOptions
import typings.nodePgMigrate.rolesTypesMod.AlterRole
import typings.nodePgMigrate.rolesTypesMod.CreateRole
import typings.nodePgMigrate.rolesTypesMod.DropRole
import typings.nodePgMigrate.rolesTypesMod.RenameRole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-pg-migrate/dist/operations/roles", JSImport.Namespace)
@js.native
object rolesMod extends js.Object {
  
  def alterRole(mOptions: MigrationOptions): AlterRole = js.native
  
  def createRole(mOptions: MigrationOptions): CreateRole = js.native
  
  def dropRole(mOptions: MigrationOptions): DropRole = js.native
  
  def renameRole(mOptions: MigrationOptions): RenameRole = js.native
}
