package typings.pickadate.Pickadate

import typings.pickadate.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// options shared between date and time pickers
@js.native
trait Options extends js.Object {
  
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
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setClear(value: String): Self = this.set("clear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    
    @scala.inline
    def setCloseOnClear(value: Boolean): Self = this.set("closeOnClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnClear: Self = this.set("closeOnClear", js.undefined)
    
    @scala.inline
    def setCloseOnSelect(value: Boolean): Self = this.set("closeOnSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnSelect: Self = this.set("closeOnSelect", js.undefined)
    
    @scala.inline
    def setContainer(value: String | JQuery): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setContainerHidden(value: String): Self = this.set("containerHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerHidden: Self = this.set("containerHidden", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFormatSubmit(value: String): Self = this.set("formatSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatSubmit: Self = this.set("formatSubmit", js.undefined)
    
    @scala.inline
    def setHiddenName(value: Boolean): Self = this.set("hiddenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiddenName: Self = this.set("hiddenName", js.undefined)
    
    @scala.inline
    def setHiddenPrefix(value: String): Self = this.set("hiddenPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiddenPrefix: Self = this.set("hiddenPrefix", js.undefined)
    
    @scala.inline
    def setHiddenSuffix(value: String): Self = this.set("hiddenSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiddenSuffix: Self = this.set("hiddenSuffix", js.undefined)
    
    @scala.inline
    def setOnClose(value: /* event */ js.Any => Unit): Self = this.set("onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnOpen(value: /* event */ js.Any => Unit): Self = this.set("onOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    
    @scala.inline
    def setOnRender(value: /* event */ js.Any => Unit): Self = this.set("onRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRender: Self = this.set("onRender", js.undefined)
    
    @scala.inline
    def setOnSet(value: /* event */ js.Any => Unit): Self = this.set("onSet", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSet: Self = this.set("onSet", js.undefined)
    
    @scala.inline
    def setOnStart(value: /* event */ js.Any => Unit): Self = this.set("onStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStart: Self = this.set("onStart", js.undefined)
    
    @scala.inline
    def setOnStop(value: /* event */ js.Any => Unit): Self = this.set("onStop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStop: Self = this.set("onStop", js.undefined)
  }
}
