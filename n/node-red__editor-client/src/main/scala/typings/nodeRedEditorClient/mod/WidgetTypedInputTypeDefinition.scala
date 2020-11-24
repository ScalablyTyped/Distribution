package typings.nodeRedEditorClient.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WidgetTypedInputTypeDefinition extends js.Object {
  
  /** Set to false if there is no value associated with the type. */
  var hasValue: js.UndefOr[Boolean] = js.native
  
  /** An icon to display in the type menu */
  var icon: js.UndefOr[String] = js.native
  
  /** A label to display in the type menu */
  var label: js.UndefOr[String] = js.native
  
  /** If the type has a fixed set of values, this is an array of string options for the value. For example, ["true","false"] for the boolean type. */
  var options: js.UndefOr[js.Array[String]] = js.native
  
  /** A function to validate the value for the type. */
  var validate: js.UndefOr[(js.Function1[/* v */ String, Boolean]) | RegExp] = js.native
  
  /** The identifier for the type */
  var value: String = js.native
}
object WidgetTypedInputTypeDefinition {
  
  @scala.inline
  def apply(value: String): WidgetTypedInputTypeDefinition = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetTypedInputTypeDefinition]
  }
  
  @scala.inline
  implicit class WidgetTypedInputTypeDefinitionOps[Self <: WidgetTypedInputTypeDefinition] (val x: Self) extends AnyVal {
    
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
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasValue(value: Boolean): Self = this.set("hasValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasValue: Self = this.set("hasValue", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: String*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[String]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setValidateFunction1(value: /* v */ String => Boolean): Self = this.set("validate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidate(value: (js.Function1[/* v */ String, Boolean]) | RegExp): Self = this.set("validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
}
