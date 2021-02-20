package typings.nodePgMigrate.anon

import typings.nodePgMigrate.functionsTypesMod.FunctionOptions
import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.generalTypesMod.Value
import typings.nodePgMigrate.triggersTypesMod.CreateTriggerFn
import typings.nodePgMigrate.triggersTypesMod.TriggerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseCreateTriggerFn extends StObject {
  
  var reverse: CreateTriggerFn = js.native
}
object ReverseCreateTriggerFn {
  
  @scala.inline
  def apply(reverse: CreateTriggerFn): ReverseCreateTriggerFn = {
    val __obj = js.Dynamic.literal(reverse = reverse.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReverseCreateTriggerFn]
  }
  
  @scala.inline
  implicit class ReverseCreateTriggerFnMutableBuilder[Self <: ReverseCreateTriggerFn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReverse(value: CreateTriggerFn): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseFunction3(
      value: (/* tableName */ typings.nodePgMigrate.generalTypesMod.Name, /* triggerName */ String, /* triggerOptions */ TriggerOptions with DropOptions) => String | js.Array[String]
    ): Self = StObject.set(x, "reverse", js.Any.fromFunction3(value))
    
    @scala.inline
    def setReverseFunction4(
      value: (/* tableName */ typings.nodePgMigrate.generalTypesMod.Name, /* triggerName */ String, /* triggerOptions */ TriggerOptions with FunctionOptions with DropOptions, /* definition */ Value) => String | js.Array[String]
    ): Self = StObject.set(x, "reverse", js.Any.fromFunction4(value))
  }
}
