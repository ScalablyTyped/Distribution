package typings.nodePgMigrate.anon

import typings.nodePgMigrate.triggersTypesMod.RenameTriggerFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseRenameTriggerFn extends StObject {
  
  def reverse(
    tableName: typings.nodePgMigrate.generalTypesMod.Name,
    oldTriggerName: String,
    newTriggerName: String
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: RenameTriggerFn = js.native
}
