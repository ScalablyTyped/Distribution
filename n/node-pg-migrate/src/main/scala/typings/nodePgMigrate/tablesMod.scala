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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tablesMod {
  
  @JSImport("node-pg-migrate/dist/operations/tables", "addColumns")
  @js.native
  def addColumns(mOptions: MigrationOptions): AddColumns = js.native
  
  @JSImport("node-pg-migrate/dist/operations/tables", "addConstraint")
  @js.native
  def addConstraint(mOptions: MigrationOptions): CreateConstraint = js.native
  
  @JSImport("node-pg-migrate/dist/operations/tables", "alterColumn")
  @js.native
  def alterColumn(mOptions: MigrationOptions): AlterColumn = js.native
  
  @JSImport("node-pg-migrate/dist/operations/tables", "alterTable")
  @js.native
  def alterTable(mOptions: MigrationOptions): AlterTable = js.native
  
  @JSImport("node-pg-migrate/dist/operations/tables", "createTable")
  @js.native
  def createTable(mOptions: MigrationOptions): CreateTable = js.native
  
  @JSImport("node-pg-migrate/dist/operations/tables", "dropColumns")
  @js.native
  def dropColumns(mOptions: MigrationOptions): DropColumns = js.native
  
  @JSImport("node-pg-migrate/dist/operations/tables", "dropConstraint")
  @js.native
  def dropConstraint(mOptions: MigrationOptions): DropConstraint = js.native
  
  @JSImport("node-pg-migrate/dist/operations/tables", "dropTable")
  @js.native
  def dropTable(mOptions: MigrationOptions): DropTable = js.native
  
  @JSImport("node-pg-migrate/dist/operations/tables", "renameColumn")
  @js.native
  def renameColumn(mOptions: MigrationOptions): RenameColumn = js.native
  
  @JSImport("node-pg-migrate/dist/operations/tables", "renameConstraint")
  @js.native
  def renameConstraint(mOptions: MigrationOptions): RenameConstraint = js.native
  
  @JSImport("node-pg-migrate/dist/operations/tables", "renameTable")
  @js.native
  def renameTable(mOptions: MigrationOptions): RenameTable = js.native
}
