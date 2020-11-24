package typings.nodePgMigrate.anon

import typings.nodePgMigrate.functionsTypesMod.FunctionOptions
import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.generalTypesMod.Value
import typings.nodePgMigrate.triggersTypesMod.CreateTriggerFn
import typings.nodePgMigrate.triggersTypesMod.TriggerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseCreateTriggerFn extends js.Object {
  
  var reverse: CreateTriggerFn = js.native
}
object ReverseCreateTriggerFn {
  
  @scala.inline
  def apply(reverse: CreateTriggerFn): ReverseCreateTriggerFn = {
    val __obj = js.Dynamic.literal(reverse = reverse.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReverseCreateTriggerFn]
  }
  
  @scala.inline
  implicit class ReverseCreateTriggerFnOps[Self <: ReverseCreateTriggerFn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReverseFunction4(
      value: (/* tableName */ typings.nodePgMigrate.generalTypesMod.Name, /* triggerName */ String, /* triggerOptions */ TriggerOptions with FunctionOptions with DropOptions, /* definition */ Value) => String | js.Array[String]
    ): Self = this.set("reverse", js.Any.fromFunction4(value))
    
    @scala.inline
    def setReverseFunction3(
      value: (/* tableName */ typings.nodePgMigrate.generalTypesMod.Name, /* triggerName */ String, /* triggerOptions */ TriggerOptions with DropOptions) => String | js.Array[String]
    ): Self = this.set("reverse", js.Any.fromFunction3(value))
    
    @scala.inline
    def setReverse(value: CreateTriggerFn): Self = this.set("reverse", value.asInstanceOf[js.Any])
  }
}
