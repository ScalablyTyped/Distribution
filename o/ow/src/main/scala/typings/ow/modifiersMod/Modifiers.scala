package typings.ow.modifiersMod

import typings.ow.predicatesMod.Predicates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Modifiers extends js.Object {
  
  /**
    Make the following predicate optional so it doesn't fail when the value is `undefined`.
    */
  val optional: Predicates = js.native
}
object Modifiers {
  
  @scala.inline
  def apply(optional: Predicates): Modifiers = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modifiers]
  }
  
  @scala.inline
  implicit class ModifiersOps[Self <: Modifiers] (val x: Self) extends AnyVal {
    
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
    def setOptional(value: Predicates): Self = this.set("optional", value.asInstanceOf[js.Any])
  }
}
