package typings.pickadate.Pickadate

import typings.pickadate.JQuery
import typings.pickadate.pickadateStrings.disable
import typings.pickadate.pickadateStrings.highlight
import typings.pickadate.pickadateStrings.id
import typings.pickadate.pickadateStrings.max
import typings.pickadate.pickadateStrings.min
import typings.pickadate.pickadateStrings.open
import typings.pickadate.pickadateStrings.select
import typings.pickadate.pickadateStrings.start
import typings.pickadate.pickadateStrings.value
import typings.pickadate.pickadateStrings.view
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Picker[TPickerObject, TItemObject /* <: Item */, TOptions /* <: SetObject */] extends StObject {
  
  /**
    * The picker's relative input element wrapped as a jQuery object.
    */
  @JSName("$node")
  var $node: JQuery = js.native
  
  /**
    * The picker's relative root holder element wrapped as a jQuery object.
    */
  @JSName("$root")
  var $root: JQuery = js.native
  
  /**
    * This is the picker’s relative hidden element, which is undefined if
    * there’s no formatSubmit option. There should be no reason to use this
    * – it's mostly for internal use. If you have a valid reason for using
    * this, please mention it in the issues.
    */
  var _hidden: HTMLInputElement = js.native
  
  /**
    * Clear the value in the picker's input element.
    */
  def clear(): TPickerObject = js.native
  
  def close(): TPickerObject = js.native
  def close(withFocus: Boolean): TPickerObject = js.native
  
  /**
    * Short for picker.get('value')
    */
  def get(): String = js.native
  /**
    * Get the properties, objects, and states that make up the current
    * state of the picker.
    */
  def get(thing: String): js.Any = js.native
  /**
    * Returns a formatted string for the item object specified by `thing`
    */
  def get(thing: String, format: String): String = js.native
  /**
    * Returns an array of items that determine which item objects to
    * disable on the picker.
    */
  @JSName("get")
  def get_disable(thing: disable): js.Array[js.Any] = js.native
  /**
    * Returns the item object that is visually highlighted.
    */
  @JSName("get")
  def get_highlight(thing: highlight): TItemObject = js.native
  /**
    * Returns a unique 9-digit integer that is the ID of the picker.
    */
  @JSName("get")
  def get_id(thing: id): Double = js.native
  /**
    * Returns the item object that limits the picker's upper range.
    */
  @JSName("get")
  def get_max(thing: max): TItemObject = js.native
  /**
    * Returns the item object that limits the picker's lower range.
    */
  @JSName("get")
  def get_min(thing: min): TItemObject = js.native
  /**
    * Returns a boolean value of whether the picker is open or not.
    */
  @JSName("get")
  def get_open(thing: open): Boolean = js.native
  /**
    * Returns the item object that is visually selected.
    */
  @JSName("get")
  def get_select(thing: select): TItemObject = js.native
  /**
    * Returns a boolean value of whether the picker has started or not.
    */
  @JSName("get")
  def get_start(thing: start): Boolean = js.native
  /**
    * Returns the string value of the picker's input element.
    */
  @JSName("get")
  def get_value(thing: value): String = js.native
  /**
    * Returns the item object that sets the current view.
    */
  @JSName("get")
  def get_view(thing: view): TItemObject = js.native
  
  /**
    * Unbind callbacks that are bound using the on method.
    */
  def off(methodName: String*): TPickerObject = js.native
  
  /**
    * Bind multiple callbacks at once to get fired off when the relative
    * picker method is called.
    */
  def on(callbackObject: CallbackObject): TPickerObject = js.native
  /**
    * Bind callbacks to get fired off when the relative picker method is called.
    */
  def on(methodName: String, callback: js.Function1[/* data */ js.UndefOr[js.Any], Unit]): TPickerObject = js.native
  
  def open(): TPickerObject = js.native
  def open(withoutFocus: Boolean): TPickerObject = js.native
  
  /**
    * Refresh the picker box after adding something to the holder.
    * By default, only the "face" of the picker (i.e. the box element)
    * has it’s contents re-rendered. To render the entire picker from
    * the root up, pass true as the first argument.
    */
  def render(): TPickerObject = js.native
  def render(entirePicker: Boolean): TPickerObject = js.native
  
  /**
    * Set the properties, objects, and states to change the state of the picker.
    */
  def set(thing: String): TPickerObject = js.native
  def set(thing: String, value: js.Any): TPickerObject = js.native
  def set(thing: String, value: js.Any, options: SetOptions): TPickerObject = js.native
  def set(thing: String, value: Unit, options: SetOptions): TPickerObject = js.native
  def set(things: TOptions): TPickerObject = js.native
  def set(things: TOptions, options: SetOptions): TPickerObject = js.native
  
  /**
    * Rebuild the picker.
    */
  def start(): TPickerObject = js.native
  
  /**
    * Destroy the picker.
    */
  def stop(): TPickerObject = js.native
  
  /**
    * Trigger callbacks that have been queued up using the the on method.
    */
  def trigger(event: String): TPickerObject = js.native
  def trigger(event: String, data: js.Any): TPickerObject = js.native
}
