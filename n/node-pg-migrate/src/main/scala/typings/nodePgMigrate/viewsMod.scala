package typings.nodePgMigrate

import typings.nodePgMigrate.distTypesMod.MigrationOptions
import typings.nodePgMigrate.viewsTypesMod.AlterView
import typings.nodePgMigrate.viewsTypesMod.AlterViewColumn
import typings.nodePgMigrate.viewsTypesMod.CreateView
import typings.nodePgMigrate.viewsTypesMod.DropView
import typings.nodePgMigrate.viewsTypesMod.RenameView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-pg-migrate/dist/operations/views", JSImport.Namespace)
@js.native
object viewsMod extends js.Object {
  def alterView(mOptions: MigrationOptions): AlterView = js.native
  def alterViewColumn(mOptions: MigrationOptions): AlterViewColumn = js.native
  def createView(mOptions: MigrationOptions): CreateView = js.native
  def dropView(mOptions: MigrationOptions): DropView = js.native
  def renameView(mOptions: MigrationOptions): RenameView = js.native
}

