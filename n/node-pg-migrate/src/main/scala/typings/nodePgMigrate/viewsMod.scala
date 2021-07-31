package typings.nodePgMigrate

import typings.nodePgMigrate.distTypesMod.MigrationOptions
import typings.nodePgMigrate.viewsTypesMod.AlterView
import typings.nodePgMigrate.viewsTypesMod.AlterViewColumn
import typings.nodePgMigrate.viewsTypesMod.CreateView
import typings.nodePgMigrate.viewsTypesMod.DropView
import typings.nodePgMigrate.viewsTypesMod.RenameView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewsMod {
  
  @JSImport("node-pg-migrate/dist/operations/views", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def alterView(mOptions: MigrationOptions): AlterView = ^.asInstanceOf[js.Dynamic].applyDynamic("alterView")(mOptions.asInstanceOf[js.Any]).asInstanceOf[AlterView]
  
  @scala.inline
  def alterViewColumn(mOptions: MigrationOptions): AlterViewColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("alterViewColumn")(mOptions.asInstanceOf[js.Any]).asInstanceOf[AlterViewColumn]
  
  @scala.inline
  def createView(mOptions: MigrationOptions): CreateView = ^.asInstanceOf[js.Dynamic].applyDynamic("createView")(mOptions.asInstanceOf[js.Any]).asInstanceOf[CreateView]
  
  @scala.inline
  def dropView(mOptions: MigrationOptions): DropView = ^.asInstanceOf[js.Dynamic].applyDynamic("dropView")(mOptions.asInstanceOf[js.Any]).asInstanceOf[DropView]
  
  @scala.inline
  def renameView(mOptions: MigrationOptions): RenameView = ^.asInstanceOf[js.Dynamic].applyDynamic("renameView")(mOptions.asInstanceOf[js.Any]).asInstanceOf[RenameView]
}
