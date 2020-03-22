package typings.nodePgMigrate

import typings.nodePgMigrate.distTypesMod.MigrationOptions
import typings.nodePgMigrate.triggersTypesMod.CreateTrigger
import typings.nodePgMigrate.triggersTypesMod.DropTrigger
import typings.nodePgMigrate.triggersTypesMod.RenameTrigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-pg-migrate/dist/operations/triggers", JSImport.Namespace)
@js.native
object triggersMod extends js.Object {
  def createTrigger(mOptions: MigrationOptions): CreateTrigger = js.native
  def dropTrigger(mOptions: MigrationOptions): DropTrigger = js.native
  def renameTrigger(mOptions: MigrationOptions): RenameTrigger = js.native
}

