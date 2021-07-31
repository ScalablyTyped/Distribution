package typings.nodePgMigrate

import typings.nodePgMigrate.distTypesMod.MigrationOptions
import typings.nodePgMigrate.sequencesTypesMod.AlterSequence
import typings.nodePgMigrate.sequencesTypesMod.CreateSequence
import typings.nodePgMigrate.sequencesTypesMod.DropSequence
import typings.nodePgMigrate.sequencesTypesMod.RenameSequence
import typings.nodePgMigrate.sequencesTypesMod.SequenceOptions
import typings.nodePgMigrate.tablesTypesMod.ColumnDefinitions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sequencesMod {
  
  @JSImport("node-pg-migrate/dist/operations/sequences", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def alterSequence(mOptions: MigrationOptions): AlterSequence = ^.asInstanceOf[js.Dynamic].applyDynamic("alterSequence")(mOptions.asInstanceOf[js.Any]).asInstanceOf[AlterSequence]
  
  @scala.inline
  def createSequence(mOptions: MigrationOptions): CreateSequence = ^.asInstanceOf[js.Dynamic].applyDynamic("createSequence")(mOptions.asInstanceOf[js.Any]).asInstanceOf[CreateSequence]
  
  @scala.inline
  def dropSequence(mOptions: MigrationOptions): DropSequence = ^.asInstanceOf[js.Dynamic].applyDynamic("dropSequence")(mOptions.asInstanceOf[js.Any]).asInstanceOf[DropSequence]
  
  @scala.inline
  def parseSequenceOptions(typeShorthands: Unit, options: SequenceOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSequenceOptions")(typeShorthands.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def parseSequenceOptions(typeShorthands: ColumnDefinitions, options: SequenceOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSequenceOptions")(typeShorthands.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def renameSequence(mOptions: MigrationOptions): RenameSequence = ^.asInstanceOf[js.Dynamic].applyDynamic("renameSequence")(mOptions.asInstanceOf[js.Any]).asInstanceOf[RenameSequence]
}
