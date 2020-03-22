package typings.nodePgMigrate

import typings.nodePgMigrate.distTypesMod.MigrationOptions
import typings.nodePgMigrate.viewsMaterializedTypesMod.AlterMaterializedView
import typings.nodePgMigrate.viewsMaterializedTypesMod.CreateMaterializedView
import typings.nodePgMigrate.viewsMaterializedTypesMod.DropMaterializedView
import typings.nodePgMigrate.viewsMaterializedTypesMod.RefreshMaterializedView
import typings.nodePgMigrate.viewsMaterializedTypesMod.RenameMaterializedView
import typings.nodePgMigrate.viewsMaterializedTypesMod.RenameMaterializedViewColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-pg-migrate/dist/operations/viewsMaterialized", JSImport.Namespace)
@js.native
object viewsMaterializedMod extends js.Object {
  def alterMaterializedView(mOptions: MigrationOptions): AlterMaterializedView = js.native
  def createMaterializedView(mOptions: MigrationOptions): CreateMaterializedView = js.native
  def dropMaterializedView(mOptions: MigrationOptions): DropMaterializedView = js.native
  def refreshMaterializedView(mOptions: MigrationOptions): RefreshMaterializedView = js.native
  def renameMaterializedView(mOptions: MigrationOptions): RenameMaterializedView = js.native
  def renameMaterializedViewColumn(mOptions: MigrationOptions): RenameMaterializedViewColumn = js.native
}

