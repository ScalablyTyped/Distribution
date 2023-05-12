package typings.paypalPaypalJs.typesComponentsHostedFieldsMod

import typings.paypalPaypalJs.anon.Attribute
import typings.paypalPaypalJs.anon.ClassName
import typings.paypalPaypalJs.anon.Field
import typings.paypalPaypalJs.paypalPaypalJsStrings.blur
import typings.paypalPaypalJs.paypalPaypalJsStrings.cardTypeChange
import typings.paypalPaypalJs.paypalPaypalJsStrings.empty
import typings.paypalPaypalJs.paypalPaypalJsStrings.focus
import typings.paypalPaypalJs.paypalPaypalJsStrings.inputSubmitRequest
import typings.paypalPaypalJs.paypalPaypalJsStrings.notEmpty
import typings.paypalPaypalJs.paypalPaypalJsStrings.validityChange
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostedFieldsHandler extends StObject {
  
  /**
    * Add a class to a field. Useful for updating field styles when events occur elsewhere in your checkout.
    */
  def addClass(field: String, className: String): js.Promise[Unit] = js.native
  
  /**
    * Clear the value of a field.
    */
  def clear(field: String): js.Promise[Unit] = js.native
  
  /**
    * Programmatically focus a field.
    */
  def focus(field: String): js.Promise[Unit] = js.native
  
  /**
    * Get supported card types configured in the Braintree Control Panel.
    */
  def getCardTypes(): HostedFieldsCardTypes = js.native
  
  /**
    * Get the state of all the rendered fields.
    */
  def getState(): HostedFieldsState = js.native
  
  @JSName("off")
  def off_blur(event: blur, handler: js.Function1[/* event */ HostedFieldsEvent, Unit]): Unit = js.native
  @JSName("off")
  def off_cardTypeChange(event: cardTypeChange, handler: js.Function1[/* event */ HostedFieldsEvent, Unit]): Unit = js.native
  @JSName("off")
  def off_empty(event: empty, handler: js.Function1[/* event */ HostedFieldsEvent, Unit]): Unit = js.native
  @JSName("off")
  def off_focus(event: focus, handler: js.Function1[/* event */ HostedFieldsEvent, Unit]): Unit = js.native
  @JSName("off")
  def off_inputSubmitRequest(event: inputSubmitRequest, handler: js.Function1[/* event */ HostedFieldsEvent, Unit]): Unit = js.native
  @JSName("off")
  def off_notEmpty(event: notEmpty, handler: js.Function1[/* event */ HostedFieldsEvent, Unit]): Unit = js.native
  @JSName("off")
  def off_validityChange(event: validityChange, handler: js.Function1[/* event */ HostedFieldsEvent, Unit]): Unit = js.native
  
  @JSName("on")
  def on_blur(event: blur, handler: js.Function1[/* event */ HostedFieldsEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_cardTypeChange(event: cardTypeChange, handler: js.Function1[/* event */ HostedFieldsEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_empty(event: empty, handler: js.Function1[/* event */ HostedFieldsEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_focus(event: focus, handler: js.Function1[/* event */ HostedFieldsEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_inputSubmitRequest(event: inputSubmitRequest, handler: js.Function1[/* event */ HostedFieldsEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_notEmpty(event: notEmpty, handler: js.Function1[/* event */ HostedFieldsEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_validityChange(event: validityChange, handler: js.Function1[/* event */ HostedFieldsEvent, Unit]): Unit = js.native
  
  /**
    * Removes a supported attribute from a field.
    */
  def removeAttribute(options: Attribute): js.Promise[Unit] = js.native
  
  /**
    * Removes a class to a field. Useful for updating field styles when events occur elsewhere in your checkout.
    */
  def removeClass(options: ClassName): js.Promise[Unit] = js.native
  
  /**
    * Sets an attribute of a field. Supported attributes are aria-invalid,
    * aria-required, disabled, and placeholder.
    */
  def setAttribute(options: Field): js.Promise[Unit] = js.native
  
  /**
    * Sets a visually hidden message (for screen readers) on a field.
    */
  def setMessage(options: Attribute): Unit = js.native
  
  /**
    * Sets the month options for the expiration month field when presented as a select element.
    */
  def setMonthOptions(options: Any): js.Promise[Unit] = js.native
  
  /**
    * Sets the placeholder from a field.
    */
  def setPlaceholder(field: String, placeholder: String): js.Promise[Unit] = js.native
  
  /**
    * Submit the form if is valid
    */
  def submit(): js.Promise[HostedFieldsSubmitResponse] = js.native
  def submit(options: Record[String, Any]): js.Promise[HostedFieldsSubmitResponse] = js.native
  
  /**
    * Clean all the fields from the DOM
    */
  def teardown(): js.Promise[Unit] = js.native
  
  /**
    * Tokenize fields and returns a nonce payload.
    */
  def tokenize(options: HostedFieldsTokenize): js.Promise[Record[String, Any]] = js.native
}
