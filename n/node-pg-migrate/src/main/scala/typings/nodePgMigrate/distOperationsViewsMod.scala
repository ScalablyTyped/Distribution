package typings.nodePgMigrate

import typings.nodePgMigrate.distOperationsViewsTypesMod.AlterView
import typings.nodePgMigrate.distOperationsViewsTypesMod.AlterViewColumn
import typings.nodePgMigrate.distOperationsViewsTypesMod.CreateView
import typings.nodePgMigrate.distOperationsViewsTypesMod.DropView
import typings.nodePgMigrate.distOperationsViewsTypesMod.RenameView
import typings.nodePgMigrate.distTypesMod.MigrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOperationsViewsMod {
  
  @JSImport("node-pg-migrate/dist/operations/views", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def alterView(mOptions: MigrationOptions): AlterView = ^.asInstanceOf[js.Dynamic].applyDynamic("alterView")(mOptions.asInstanceOf[js.Any]).asInstanceOf[AlterView]
  
  inline def alterViewColumn(mOptions: MigrationOptions): AlterViewColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("alterViewColumn")(mOptions.asInstanceOf[js.Any]).asInstanceOf[AlterViewColumn]
  
  inline def createView(mOptions: MigrationOptions): CreateView = ^.asInstanceOf[js.Dynamic].applyDynamic("createView")(mOptions.asInstanceOf[js.Any]).asInstanceOf[CreateView]
  
  inline def dropView(mOptions: MigrationOptions): DropView = ^.asInstanceOf[js.Dynamic].applyDynamic("dropView")(mOptions.asInstanceOf[js.Any]).asInstanceOf[DropView]
  
  inline def renameView(mOptions: MigrationOptions): RenameView = ^.asInstanceOf[js.Dynamic].applyDynamic("renameView")(mOptions.asInstanceOf[js.Any]).asInstanceOf[RenameView]
}
