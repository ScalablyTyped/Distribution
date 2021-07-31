package typings.nodePgMigrate

import typings.nodePgMigrate.distTypesMod.MigrationOptions
import typings.nodePgMigrate.triggersTypesMod.CreateTrigger
import typings.nodePgMigrate.triggersTypesMod.DropTrigger
import typings.nodePgMigrate.triggersTypesMod.RenameTrigger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggersMod {
  
  @JSImport("node-pg-migrate/dist/operations/triggers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createTrigger(mOptions: MigrationOptions): CreateTrigger = ^.asInstanceOf[js.Dynamic].applyDynamic("createTrigger")(mOptions.asInstanceOf[js.Any]).asInstanceOf[CreateTrigger]
  
  @scala.inline
  def dropTrigger(mOptions: MigrationOptions): DropTrigger = ^.asInstanceOf[js.Dynamic].applyDynamic("dropTrigger")(mOptions.asInstanceOf[js.Any]).asInstanceOf[DropTrigger]
  
  @scala.inline
  def renameTrigger(mOptions: MigrationOptions): RenameTrigger = ^.asInstanceOf[js.Dynamic].applyDynamic("renameTrigger")(mOptions.asInstanceOf[js.Any]).asInstanceOf[RenameTrigger]
}
