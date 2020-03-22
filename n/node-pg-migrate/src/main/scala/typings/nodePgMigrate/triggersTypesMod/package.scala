package typings.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object triggersTypesMod {
  type CreateTrigger = typings.nodePgMigrate.triggersTypesMod.CreateTriggerFn with typings.nodePgMigrate.AnonReverseCreateTriggerFn
  type CreateTriggerFn = typings.nodePgMigrate.triggersTypesMod.CreateTriggerFn1 | typings.nodePgMigrate.triggersTypesMod.CreateTriggerFn2
  type CreateTriggerFn1 = js.Function3[
    /* tableName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* triggerName */ java.lang.String, 
    /* triggerOptions */ typings.nodePgMigrate.triggersTypesMod.TriggerOptions with typings.nodePgMigrate.generalTypesMod.DropOptions, 
    java.lang.String | js.Array[java.lang.String]
  ]
  type CreateTriggerFn2 = js.Function4[
    /* tableName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* triggerName */ java.lang.String, 
    /* triggerOptions */ typings.nodePgMigrate.triggersTypesMod.TriggerOptions with typings.nodePgMigrate.functionsTypesMod.FunctionOptions with typings.nodePgMigrate.generalTypesMod.DropOptions, 
    /* definition */ typings.nodePgMigrate.generalTypesMod.Value, 
    java.lang.String | js.Array[java.lang.String]
  ]
  type DropTrigger = js.Function3[
    /* tableName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* triggerName */ java.lang.String, 
    /* dropOptions */ js.UndefOr[typings.nodePgMigrate.generalTypesMod.DropOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  type RenameTrigger = typings.nodePgMigrate.triggersTypesMod.RenameTriggerFn with typings.nodePgMigrate.AnonReverseRenameTriggerFn
  type RenameTriggerFn = js.Function3[
    /* tableName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* oldTriggerName */ java.lang.String, 
    /* newTriggerName */ java.lang.String, 
    java.lang.String | js.Array[java.lang.String]
  ]
}
