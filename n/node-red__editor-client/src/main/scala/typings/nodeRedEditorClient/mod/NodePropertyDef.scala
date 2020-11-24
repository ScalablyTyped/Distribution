package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.nodeRedEditorClientStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Property definition
  * Read more: https://nodered.org/docs/creating-nodes/properties#property-definitions
  */
@js.native
trait NodePropertyDef[TVal, TInstProps /* <: NodeProperties */] extends js.Object {
  
  /** Whether the property is required. If set to true, the property will be invalid if its value is null or an empty string. */
  var required: js.UndefOr[Boolean] = js.native
  
  /** If this property is a pointer to a configuration node, this identifies the type of the node. */
  var `type`: js.UndefOr[String] = js.native
  
  /** A function that can be used to validate the value of the property. */
  var validate: js.UndefOr[js.ThisFunction1[/* this */ NodeInstance[TInstProps], /* val */ String, Boolean]] = js.native
  
  /** The default value the property takes */
  var value: TVal | _empty = js.native
}
object NodePropertyDef {
  
  @scala.inline
  def apply[TVal, TInstProps /* <: NodeProperties */](value: TVal | _empty): NodePropertyDef[TVal, TInstProps] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodePropertyDef[TVal, TInstProps]]
  }
  
  @scala.inline
  implicit class NodePropertyDefOps[Self <: NodePropertyDef[_, _], TVal, TInstProps /* <: NodeProperties */] (val x: Self with (NodePropertyDef[TVal, TInstProps])) extends AnyVal {
    
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
    def setValue(value: TVal | _empty): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValidate(value: js.ThisFunction1[/* this */ NodeInstance[TInstProps], /* val */ String, Boolean]): Self = this.set("validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
}
