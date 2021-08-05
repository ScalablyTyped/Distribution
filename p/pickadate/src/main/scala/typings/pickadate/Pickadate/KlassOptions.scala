package typings.pickadate.Pickadate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// KlassOptions shared between date and time pickers
trait KlassOptions extends StObject {
  
  // default 'picker__input'
  var active: js.UndefOr[String] = js.undefined
  
  // default 'picker__wrap'
  var box: js.UndefOr[String] = js.undefined
  
  // default 'picker__day--today' or 'picker__list-item--now'
  // Clear button
  var buttonClear: js.UndefOr[String] = js.undefined
  
  // default 'picker__box'
  // Day/Time states
  var disabled: js.UndefOr[String] = js.undefined
  
  // default 'picker--opened'
  var focused: js.UndefOr[String] = js.undefined
  
  // default 'picker__holder'
  // The picker frame, wrapper, and box
  var frame: js.UndefOr[String] = js.undefined
  
  // default 'picker__day--selected' or 'picker__list-item--selected'
  var highlighted: js.UndefOr[String] = js.undefined
  
  // default 'picker--focused'
  // The picker holder
  var holder: js.UndefOr[String] = js.undefined
  
  // The element states
  var input: js.UndefOr[String] = js.undefined
  
  // default 'picker__day--highlighted' or 'picker__list-item--highlighted'
  var now: js.UndefOr[String] = js.undefined
  
  // default 'picker' or 'picker picker--time'
  var opened: js.UndefOr[String] = js.undefined
  
  // default 'picker__input--active'
  // The root picker and states
  var picker: js.UndefOr[String] = js.undefined
  
  // default 'picker__day--disabled' or 'picker__list-item--disabled'
  var selected: js.UndefOr[String] = js.undefined
  
  // default 'picker__frame'
  var wrap: js.UndefOr[String] = js.undefined
}
object KlassOptions {
  
  inline def apply(): KlassOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KlassOptions]
  }
  
  extension [Self <: KlassOptions](x: Self) {
    
    inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setBox(value: String): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
    
    inline def setBoxUndefined: Self = StObject.set(x, "box", js.undefined)
    
    inline def setButtonClear(value: String): Self = StObject.set(x, "buttonClear", value.asInstanceOf[js.Any])
    
    inline def setButtonClearUndefined: Self = StObject.set(x, "buttonClear", js.undefined)
    
    inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFocused(value: String): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
    
    inline def setFrame(value: String): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
    
    inline def setHighlighted(value: String): Self = StObject.set(x, "highlighted", value.asInstanceOf[js.Any])
    
    inline def setHighlightedUndefined: Self = StObject.set(x, "highlighted", js.undefined)
    
    inline def setHolder(value: String): Self = StObject.set(x, "holder", value.asInstanceOf[js.Any])
    
    inline def setHolderUndefined: Self = StObject.set(x, "holder", js.undefined)
    
    inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setNow(value: String): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
    
    inline def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
    
    inline def setOpened(value: String): Self = StObject.set(x, "opened", value.asInstanceOf[js.Any])
    
    inline def setOpenedUndefined: Self = StObject.set(x, "opened", js.undefined)
    
    inline def setPicker(value: String): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
    
    inline def setPickerUndefined: Self = StObject.set(x, "picker", js.undefined)
    
    inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setWrap(value: String): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
  }
}
