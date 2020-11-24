package typings.officeUiFabricReact.ikeytiptransitionkeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKeytipTransitionKey extends js.Object {
  
  var key: String = js.native
  
  var modifierKeys: js.UndefOr[js.Array[KeytipTransitionModifier]] = js.native
}
object IKeytipTransitionKey {
  
  @scala.inline
  def apply(key: String): IKeytipTransitionKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeytipTransitionKey]
  }
  
  @scala.inline
  implicit class IKeytipTransitionKeyOps[Self <: IKeytipTransitionKey] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifierKeysVarargs(value: KeytipTransitionModifier*): Self = this.set("modifierKeys", js.Array(value :_*))
    
    @scala.inline
    def setModifierKeys(value: js.Array[KeytipTransitionModifier]): Self = this.set("modifierKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifierKeys: Self = this.set("modifierKeys", js.undefined)
  }
}
