package typings.nodePgMigrate

import typings.nodePgMigrate.distTypesMod.MigrationOptions
import typings.nodePgMigrate.viewsTypesMod.AlterView
import typings.nodePgMigrate.viewsTypesMod.AlterViewColumn
import typings.nodePgMigrate.viewsTypesMod.CreateView
import typings.nodePgMigrate.viewsTypesMod.DropView
import typings.nodePgMigrate.viewsTypesMod.RenameView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewsMod {
  
  @JSImport("node-pg-migrate/dist/operations/views", "alterView")
  @js.native
  def alterView(mOptions: MigrationOptions): AlterView = js.native
  
  @JSImport("node-pg-migrate/dist/operations/views", "alterViewColumn")
  @js.native
  def alterViewColumn(mOptions: MigrationOptions): AlterViewColumn = js.native
  
  @JSImport("node-pg-migrate/dist/operations/views", "createView")
  @js.native
  def createView(mOptions: MigrationOptions): CreateView = js.native
  
  @JSImport("node-pg-migrate/dist/operations/views", "dropView")
  @js.native
  def dropView(mOptions: MigrationOptions): DropView = js.native
  
  @JSImport("node-pg-migrate/dist/operations/views", "renameView")
  @js.native
  def renameView(mOptions: MigrationOptions): RenameView = js.native
}
