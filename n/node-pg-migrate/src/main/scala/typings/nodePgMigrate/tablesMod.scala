package typings.nodePgMigrate

import typings.nodePgMigrate.distTypesMod.MigrationOptions
import typings.nodePgMigrate.tablesTypesMod.AddColumns
import typings.nodePgMigrate.tablesTypesMod.AlterColumn
import typings.nodePgMigrate.tablesTypesMod.AlterTable
import typings.nodePgMigrate.tablesTypesMod.CreateConstraint
import typings.nodePgMigrate.tablesTypesMod.CreateTable
import typings.nodePgMigrate.tablesTypesMod.DropColumns
import typings.nodePgMigrate.tablesTypesMod.DropConstraint
import typings.nodePgMigrate.tablesTypesMod.DropTable
import typings.nodePgMigrate.tablesTypesMod.RenameColumn
import typings.nodePgMigrate.tablesTypesMod.RenameConstraint
import typings.nodePgMigrate.tablesTypesMod.RenameTable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tablesMod {
  
  @JSImport("node-pg-migrate/dist/operations/tables", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addColumns(mOptions: MigrationOptions): AddColumns = ^.asInstanceOf[js.Dynamic].applyDynamic("addColumns")(mOptions.asInstanceOf[js.Any]).asInstanceOf[AddColumns]
  
  @scala.inline
  def addConstraint(mOptions: MigrationOptions): CreateConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("addConstraint")(mOptions.asInstanceOf[js.Any]).asInstanceOf[CreateConstraint]
  
  @scala.inline
  def alterColumn(mOptions: MigrationOptions): AlterColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("alterColumn")(mOptions.asInstanceOf[js.Any]).asInstanceOf[AlterColumn]
  
  @scala.inline
  def alterTable(mOptions: MigrationOptions): AlterTable = ^.asInstanceOf[js.Dynamic].applyDynamic("alterTable")(mOptions.asInstanceOf[js.Any]).asInstanceOf[AlterTable]
  
  @scala.inline
  def createTable(mOptions: MigrationOptions): CreateTable = ^.asInstanceOf[js.Dynamic].applyDynamic("createTable")(mOptions.asInstanceOf[js.Any]).asInstanceOf[CreateTable]
  
  @scala.inline
  def dropColumns(mOptions: MigrationOptions): DropColumns = ^.asInstanceOf[js.Dynamic].applyDynamic("dropColumns")(mOptions.asInstanceOf[js.Any]).asInstanceOf[DropColumns]
  
  @scala.inline
  def dropConstraint(mOptions: MigrationOptions): DropConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("dropConstraint")(mOptions.asInstanceOf[js.Any]).asInstanceOf[DropConstraint]
  
  @scala.inline
  def dropTable(mOptions: MigrationOptions): DropTable = ^.asInstanceOf[js.Dynamic].applyDynamic("dropTable")(mOptions.asInstanceOf[js.Any]).asInstanceOf[DropTable]
  
  @scala.inline
  def renameColumn(mOptions: MigrationOptions): RenameColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("renameColumn")(mOptions.asInstanceOf[js.Any]).asInstanceOf[RenameColumn]
  
  @scala.inline
  def renameConstraint(mOptions: MigrationOptions): RenameConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("renameConstraint")(mOptions.asInstanceOf[js.Any]).asInstanceOf[RenameConstraint]
  
  @scala.inline
  def renameTable(mOptions: MigrationOptions): RenameTable = ^.asInstanceOf[js.Dynamic].applyDynamic("renameTable")(mOptions.asInstanceOf[js.Any]).asInstanceOf[RenameTable]
}
