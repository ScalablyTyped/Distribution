package typings.nodePgMigrate

import typings.nodePgMigrate.distOperationsViewsMaterializedTypesMod.AlterMaterializedView
import typings.nodePgMigrate.distOperationsViewsMaterializedTypesMod.CreateMaterializedView
import typings.nodePgMigrate.distOperationsViewsMaterializedTypesMod.DropMaterializedView
import typings.nodePgMigrate.distOperationsViewsMaterializedTypesMod.RefreshMaterializedView
import typings.nodePgMigrate.distOperationsViewsMaterializedTypesMod.RenameMaterializedView
import typings.nodePgMigrate.distOperationsViewsMaterializedTypesMod.RenameMaterializedViewColumn
import typings.nodePgMigrate.distTypesMod.MigrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOperationsViewsMaterializedMod {
  
  @JSImport("node-pg-migrate/dist/operations/viewsMaterialized", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def alterMaterializedView(mOptions: MigrationOptions): AlterMaterializedView = ^.asInstanceOf[js.Dynamic].applyDynamic("alterMaterializedView")(mOptions.asInstanceOf[js.Any]).asInstanceOf[AlterMaterializedView]
  
  inline def createMaterializedView(mOptions: MigrationOptions): CreateMaterializedView = ^.asInstanceOf[js.Dynamic].applyDynamic("createMaterializedView")(mOptions.asInstanceOf[js.Any]).asInstanceOf[CreateMaterializedView]
  
  inline def dropMaterializedView(mOptions: MigrationOptions): DropMaterializedView = ^.asInstanceOf[js.Dynamic].applyDynamic("dropMaterializedView")(mOptions.asInstanceOf[js.Any]).asInstanceOf[DropMaterializedView]
  
  inline def refreshMaterializedView(mOptions: MigrationOptions): RefreshMaterializedView = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshMaterializedView")(mOptions.asInstanceOf[js.Any]).asInstanceOf[RefreshMaterializedView]
  
  inline def renameMaterializedView(mOptions: MigrationOptions): RenameMaterializedView = ^.asInstanceOf[js.Dynamic].applyDynamic("renameMaterializedView")(mOptions.asInstanceOf[js.Any]).asInstanceOf[RenameMaterializedView]
  
  inline def renameMaterializedViewColumn(mOptions: MigrationOptions): RenameMaterializedViewColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("renameMaterializedViewColumn")(mOptions.asInstanceOf[js.Any]).asInstanceOf[RenameMaterializedViewColumn]
}
