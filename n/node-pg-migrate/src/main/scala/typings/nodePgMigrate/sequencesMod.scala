package typings.nodePgMigrate

import typings.nodePgMigrate.distTypesMod.MigrationOptions
import typings.nodePgMigrate.sequencesTypesMod.AlterSequence
import typings.nodePgMigrate.sequencesTypesMod.CreateSequence
import typings.nodePgMigrate.sequencesTypesMod.DropSequence
import typings.nodePgMigrate.sequencesTypesMod.RenameSequence
import typings.nodePgMigrate.sequencesTypesMod.SequenceOptions
import typings.nodePgMigrate.tablesTypesMod.ColumnDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-pg-migrate/dist/operations/sequences", JSImport.Namespace)
@js.native
object sequencesMod extends js.Object {
  def alterSequence(mOptions: MigrationOptions): AlterSequence = js.native
  def createSequence(mOptions: MigrationOptions): CreateSequence = js.native
  def dropSequence(mOptions: MigrationOptions): DropSequence = js.native
  def parseSequenceOptions(typeShorthands: js.UndefOr[ColumnDefinitions], options: SequenceOptions): js.Array[String] = js.native
  def renameSequence(mOptions: MigrationOptions): RenameSequence = js.native
}

