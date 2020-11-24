package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents function call argument. Either remote object id <code>objectId</code>, primitive <code>value</code>, unserializable primitive value or neither of (for undefined) them should be specified.
  */
@js.native
trait CallArgument extends js.Object {
  
  /**
    * Remote object handle.
    */
  var objectId: js.UndefOr[RemoteObjectId] = js.native
  
  /**
    * Primitive value which can not be JSON-stringified.
    */
  var unserializableValue: js.UndefOr[UnserializableValue] = js.native
  
  /**
    * Primitive value or serializable javascript object.
    */
  var value: js.UndefOr[js.Any] = js.native
}
object CallArgument {
  
  @scala.inline
  def apply(): CallArgument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallArgument]
  }
  
  @scala.inline
  implicit class CallArgumentOps[Self <: CallArgument] (val x: Self) extends AnyVal {
    
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
    def setObjectId(value: RemoteObjectId): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    
    @scala.inline
    def setUnserializableValue(value: UnserializableValue): Self = this.set("unserializableValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnserializableValue: Self = this.set("unserializableValue", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
