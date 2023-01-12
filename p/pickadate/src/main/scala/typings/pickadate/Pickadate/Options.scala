package typings.pickadate.Pickadate

import typings.pickadate.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// options shared between date and time pickers
trait Options extends StObject {
  
  /**
    * Set the clear button text.
    * Defaults to 'Clear'
    */
  var clear: js.UndefOr[String] = js.undefined
  
  /**
    * Whether or not to close the picker when the "clear" button is pressed.
    * Defaults to `true`.
    */
  var closeOnClear: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether or not to close the picker when a date is selected.
    * Defaults to `true`.
    */
  var closeOnSelect: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify where to insert the picker's root element by passing any
    * valid CSS selector to this option. Defaults to undefined.
    */
  var container: js.UndefOr[String | JQuery] = js.undefined
  
  /**
    * The hidden input container.
    * Defaults to undefined.
    */
  var containerHidden: js.UndefOr[String] = js.undefined
  
  /**
    * By default, typing into the input is disabled by giving it a readOnly
    * attribute. Setting the editable option to true allows the input field
    * to be edited directly.
    */
  var editable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The human-friendly display format.
    * Escape any "rule" characters with an exclamation mark (!).
    * Defaults to 'd mmmm, yyyy'
    */
  var format: js.UndefOr[String] = js.undefined
  
  /**
    * An alternate format to submit to the server.
    * Defaults to undefined.
    */
  var formatSubmit: js.UndefOr[String] = js.undefined
  
  /**
    * A majority of the time, the value that needs to be sent to the server
    * is just the hidden value and not the visible one. To make this happen,
    * use the hiddenName option. This essentially nullifies the hiddenPrefix
    * and hiddenSuffix, strips the name attribute from the source input, and
    * then sets it as the name of the hidden input. Defaults to undefined.
    */
  var hiddenName: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An optional name prefix for the new hidden input element used
    * when a custom human-friendly display format is specified.
    * Defaults to undefined.
    */
  var hiddenPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * An optional name suffix for the new hidden input element used
    * when a custom human-friendly display format is specified.
    * Defaults to '_submit'
    */
  var hiddenSuffix: js.UndefOr[String] = js.undefined
  
  var onClose: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
  
  var onOpen: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
  
  var onRender: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
  
  var onSet: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
  
  // Events
  var onStart: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
  
  var onStop: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    inline def setClear(value: String): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    inline def setCloseOnClear(value: Boolean): Self = StObject.set(x, "closeOnClear", value.asInstanceOf[js.Any])
    
    inline def setCloseOnClearUndefined: Self = StObject.set(x, "closeOnClear", js.undefined)
    
    inline def setCloseOnSelect(value: Boolean): Self = StObject.set(x, "closeOnSelect", value.asInstanceOf[js.Any])
    
    inline def setCloseOnSelectUndefined: Self = StObject.set(x, "closeOnSelect", js.undefined)
    
    inline def setContainer(value: String | JQuery): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerHidden(value: String): Self = StObject.set(x, "containerHidden", value.asInstanceOf[js.Any])
    
    inline def setContainerHiddenUndefined: Self = StObject.set(x, "containerHidden", js.undefined)
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatSubmit(value: String): Self = StObject.set(x, "formatSubmit", value.asInstanceOf[js.Any])
    
    inline def setFormatSubmitUndefined: Self = StObject.set(x, "formatSubmit", js.undefined)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHiddenName(value: Boolean): Self = StObject.set(x, "hiddenName", value.asInstanceOf[js.Any])
    
    inline def setHiddenNameUndefined: Self = StObject.set(x, "hiddenName", js.undefined)
    
    inline def setHiddenPrefix(value: String): Self = StObject.set(x, "hiddenPrefix", value.asInstanceOf[js.Any])
    
    inline def setHiddenPrefixUndefined: Self = StObject.set(x, "hiddenPrefix", js.undefined)
    
    inline def setHiddenSuffix(value: String): Self = StObject.set(x, "hiddenSuffix", value.asInstanceOf[js.Any])
    
    inline def setHiddenSuffixUndefined: Self = StObject.set(x, "hiddenSuffix", js.undefined)
    
    inline def setOnClose(value: /* event */ Any => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnOpen(value: /* event */ Any => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
    
    inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
    
    inline def setOnRender(value: /* event */ Any => Unit): Self = StObject.set(x, "onRender", js.Any.fromFunction1(value))
    
    inline def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
    
    inline def setOnSet(value: /* event */ Any => Unit): Self = StObject.set(x, "onSet", js.Any.fromFunction1(value))
    
    inline def setOnSetUndefined: Self = StObject.set(x, "onSet", js.undefined)
    
    inline def setOnStart(value: /* event */ Any => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
    
    inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    
    inline def setOnStop(value: /* event */ Any => Unit): Self = StObject.set(x, "onStop", js.Any.fromFunction1(value))
    
    inline def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
  }
}
