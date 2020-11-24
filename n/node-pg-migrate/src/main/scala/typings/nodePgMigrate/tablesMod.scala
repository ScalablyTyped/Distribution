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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-pg-migrate/dist/operations/tables", JSImport.Namespace)
@js.native
object tablesMod extends js.Object {
  
  def addColumns(mOptions: MigrationOptions): AddColumns = js.native
  
  def addConstraint(mOptions: MigrationOptions): CreateConstraint = js.native
  
  def alterColumn(mOptions: MigrationOptions): AlterColumn = js.native
  
  def alterTable(mOptions: MigrationOptions): AlterTable = js.native
  
  def createTable(mOptions: MigrationOptions): CreateTable = js.native
  
  def dropColumns(mOptions: MigrationOptions): DropColumns = js.native
  
  def dropConstraint(mOptions: MigrationOptions): DropConstraint = js.native
  
  def dropTable(mOptions: MigrationOptions): DropTable = js.native
  
  def renameColumn(mOptions: MigrationOptions): RenameColumn = js.native
  
  def renameConstraint(mOptions: MigrationOptions): RenameConstraint = js.native
  
  def renameTable(mOptions: MigrationOptions): RenameTable = js.native
}
