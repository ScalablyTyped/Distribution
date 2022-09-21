package typings.orbitUiReactComponents.anon

import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.email
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.number
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.password
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.search
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.tel
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.text
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.url
import typings.orbitUiReactComponents.useMergedRefsMod.MergedRef
import typings.react.mod.ChangeEvent
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ariainvalid extends StObject {
  
  var `aria-invalid`: Boolean
  
  var `aria-required`: Boolean
  
  var disabled: Boolean
  
  var id: String
  
  def onChange(event: ChangeEvent[HTMLInputElement | HTMLTextAreaElement]): Unit
  
  var placeholder: String
  
  var readOnly: Boolean
  
  var ref: MergedRef[Any]
  
  var `type`: number | search | text | tel | url | email | password
  
  var value: String | Double
}
object Ariainvalid {
  
  inline def apply(
    `aria-invalid`: Boolean,
    `aria-required`: Boolean,
    disabled: Boolean,
    id: String,
    onChange: ChangeEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
    placeholder: String,
    readOnly: Boolean,
    ref: MergedRef[Any],
    `type`: number | search | text | tel | url | email | password,
    value: String | Double
  ): Ariainvalid = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), placeholder = placeholder.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-required")(`aria-required`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ariainvalid]
  }
  
  extension [Self <: Ariainvalid](x: Self) {
    
    inline def `setAria-invalid`(value: Boolean): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
    
    inline def `setAria-required`(value: Boolean): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: ChangeEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setRef(value: MergedRef[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setType(value: number | search | text | tel | url | email | password): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
