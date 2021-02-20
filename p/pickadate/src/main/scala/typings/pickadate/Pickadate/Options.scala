package typings.pickadate.Pickadate

import typings.pickadate.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// options shared between date and time pickers
@js.native
trait Options extends StObject {
  
  /**
    * Set the clear button text.
    * Defaults to 'Clear'
    */
  var clear: js.UndefOr[String] = js.native
  
  /**
    * Whether or not to close the picker when the "clear" button is pressed.
    * Defaults to `true`.
    */
  var closeOnClear: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not to close the picker when a date is selected.
    * Defaults to `true`.
    */
  var closeOnSelect: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify where to insert the picker's root element by passing any
    * valid CSS selector to this option. Defaults to undefined.
    */
  var container: js.UndefOr[String | JQuery] = js.native
  
  /**
    * The hidden input container.
    * Defaults to undefined.
    */
  var containerHidden: js.UndefOr[String] = js.native
  
  /**
    * By default, typing into the input is disabled by giving it a readOnly
    * attribute. Setting the editable option to true allows the input field
    * to be edited directly.
    */
  var editable: js.UndefOr[Boolean] = js.native
  
  /**
    * The human-friendly display format.
    * Escape any "rule" characters with an exclamation mark (!).
    * Defaults to 'd mmmm, yyyy'
    */
  var format: js.UndefOr[String] = js.native
  
  /**
    * An alternate format to submit to the server.
    * Defaults to undefined.
    */
  var formatSubmit: js.UndefOr[String] = js.native
  
  /**
    * A majority of the time, the value that needs to be sent to the server
    * is just the hidden value and not the visible one. To make this happen,
    * use the hiddenName option. This essentially nullifies the hiddenPrefix
    * and hiddenSuffix, strips the name attribute from the source input, and
    * then sets it as the name of the hidden input. Defaults to undefined.
    */
  var hiddenName: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional name prefix for the new hidden input element used
    * when a custom human-friendly display format is specified.
    * Defaults to undefined.
    */
  var hiddenPrefix: js.UndefOr[String] = js.native
  
  /**
    * An optional name suffix for the new hidden input element used
    * when a custom human-friendly display format is specified.
    * Defaults to '_submit'
    */
  var hiddenSuffix: js.UndefOr[String] = js.native
  
  var onClose: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  
  var onOpen: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  
  var onRender: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  
  var onSet: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  
  // Events
  var onStart: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  
  var onStop: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClear(value: String): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    @scala.inline
    def setCloseOnClear(value: Boolean): Self = StObject.set(x, "closeOnClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnClearUndefined: Self = StObject.set(x, "closeOnClear", js.undefined)
    
    @scala.inline
    def setCloseOnSelect(value: Boolean): Self = StObject.set(x, "closeOnSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnSelectUndefined: Self = StObject.set(x, "closeOnSelect", js.undefined)
    
    @scala.inline
    def setContainer(value: String | JQuery): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerHidden(value: String): Self = StObject.set(x, "containerHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerHiddenUndefined: Self = StObject.set(x, "containerHidden", js.undefined)
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatSubmit(value: String): Self = StObject.set(x, "formatSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatSubmitUndefined: Self = StObject.set(x, "formatSubmit", js.undefined)
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setHiddenName(value: Boolean): Self = StObject.set(x, "hiddenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenNameUndefined: Self = StObject.set(x, "hiddenName", js.undefined)
    
    @scala.inline
    def setHiddenPrefix(value: String): Self = StObject.set(x, "hiddenPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenPrefixUndefined: Self = StObject.set(x, "hiddenPrefix", js.undefined)
    
    @scala.inline
    def setHiddenSuffix(value: String): Self = StObject.set(x, "hiddenSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenSuffixUndefined: Self = StObject.set(x, "hiddenSuffix", js.undefined)
    
    @scala.inline
    def setOnClose(value: /* event */ js.Any => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    @scala.inline
    def setOnOpen(value: /* event */ js.Any => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
    
    @scala.inline
    def setOnRender(value: /* event */ js.Any => Unit): Self = StObject.set(x, "onRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
    
    @scala.inline
    def setOnSet(value: /* event */ js.Any => Unit): Self = StObject.set(x, "onSet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSetUndefined: Self = StObject.set(x, "onSet", js.undefined)
    
    @scala.inline
    def setOnStart(value: /* event */ js.Any => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    
    @scala.inline
    def setOnStop(value: /* event */ js.Any => Unit): Self = StObject.set(x, "onStop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
  }
}
