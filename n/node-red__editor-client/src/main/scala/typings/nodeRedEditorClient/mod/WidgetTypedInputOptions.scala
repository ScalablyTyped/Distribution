package typings.nodeRedEditorClient.mod

import typings.jquery.JQuery.Selector
import typings.nodeRedEditorClient.mod.global.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WidgetTypedInputOptions extends js.Object {
  
  /** If defined, sets the default type of the input if typeField is not set. */
  var default: js.UndefOr[WidgetTypedInputType | String] = js.native
  
  /**
    * In some circumstances it is desirable to already have an <input> element to store the type value of the typedInput.
    * This option allows such an existing element to be provided. As the type of the typedInput is changed, the value
    * of the provided input will also change.
    */
  var typeField: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  
  /** Sets the list of types the element will offer. */
  var types: js.Array[WidgetTypedInputType | WidgetTypedInputTypeDefinition] = js.native
}
object WidgetTypedInputOptions {
  
  @scala.inline
  def apply(types: js.Array[WidgetTypedInputType | WidgetTypedInputTypeDefinition]): WidgetTypedInputOptions = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetTypedInputOptions]
  }
  
  @scala.inline
  implicit class WidgetTypedInputOptionsOps[Self <: WidgetTypedInputOptions] (val x: Self) extends AnyVal {
    
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
    def setTypesVarargs(value: (WidgetTypedInputType | WidgetTypedInputTypeDefinition)*): Self = this.set("types", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[WidgetTypedInputType | WidgetTypedInputTypeDefinition]): Self = this.set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: WidgetTypedInputType | String): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setTypeField(value: Selector | JQuery[HTMLElement]): Self = this.set("typeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeField: Self = this.set("typeField", js.undefined)
  }
}
