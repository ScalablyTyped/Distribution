package typings.nodePgMigrate

import typings.nodePgMigrate.distOperationsTriggersTypesMod.CreateTrigger
import typings.nodePgMigrate.distOperationsTriggersTypesMod.DropTrigger
import typings.nodePgMigrate.distOperationsTriggersTypesMod.RenameTrigger
import typings.nodePgMigrate.distTypesMod.MigrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOperationsTriggersMod {
  
  @JSImport("node-pg-migrate/dist/operations/triggers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTrigger(mOptions: MigrationOptions): CreateTrigger = ^.asInstanceOf[js.Dynamic].applyDynamic("createTrigger")(mOptions.asInstanceOf[js.Any]).asInstanceOf[CreateTrigger]
  
  inline def dropTrigger(mOptions: MigrationOptions): DropTrigger = ^.asInstanceOf[js.Dynamic].applyDynamic("dropTrigger")(mOptions.asInstanceOf[js.Any]).asInstanceOf[DropTrigger]
  
  inline def renameTrigger(mOptions: MigrationOptions): RenameTrigger = ^.asInstanceOf[js.Dynamic].applyDynamic("renameTrigger")(mOptions.asInstanceOf[js.Any]).asInstanceOf[RenameTrigger]
}
