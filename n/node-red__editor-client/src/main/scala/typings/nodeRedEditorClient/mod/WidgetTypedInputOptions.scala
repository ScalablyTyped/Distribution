package typings.nodeRedEditorClient.mod

import typings.jquery.JQuery.Selector
import typings.nodeRedEditorClient.mod.global.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WidgetTypedInputOptions extends StObject {
  
  /** If defined, sets the default type of the input if typeField is not set. */
  var default: js.UndefOr[WidgetTypedInputType | String] = js.undefined
  
  /**
    * In some circumstances it is desirable to already have an <input> element to store the type value of the typedInput.
    * This option allows such an existing element to be provided. As the type of the typedInput is changed, the value
    * of the provided input will also change.
    */
  var typeField: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
  
  /** Sets the list of types the element will offer. */
  var types: js.Array[WidgetTypedInputType | WidgetTypedInputTypeDefinition]
}
object WidgetTypedInputOptions {
  
  inline def apply(types: js.Array[WidgetTypedInputType | WidgetTypedInputTypeDefinition]): WidgetTypedInputOptions = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetTypedInputOptions]
  }
  
  extension [Self <: WidgetTypedInputOptions](x: Self) {
    
    inline def setDefault(value: WidgetTypedInputType | String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setTypeField(value: Selector | JQuery[HTMLElement]): Self = StObject.set(x, "typeField", value.asInstanceOf[js.Any])
    
    inline def setTypeFieldUndefined: Self = StObject.set(x, "typeField", js.undefined)
    
    inline def setTypes(value: js.Array[WidgetTypedInputType | WidgetTypedInputTypeDefinition]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: (WidgetTypedInputType | WidgetTypedInputTypeDefinition)*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
