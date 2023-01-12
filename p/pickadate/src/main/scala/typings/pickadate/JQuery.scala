package typings.pickadate

import typings.pickadate.Pickadate.DateOptions
import typings.pickadate.Pickadate.DatePicker
import typings.pickadate.Pickadate.Pickatime
import typings.pickadate.Pickadate.TimeOptions
import typings.pickadate.Pickadate.TimePicker
import typings.pickadate.pickadateStrings.$node
import typings.pickadate.pickadateStrings.$root
import typings.pickadate.pickadateStrings._hidden
import typings.pickadate.pickadateStrings.picker
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  /**
    * Initialize a date picker.
    */
  def pickadate(): JQuery
  /**
    * Invoke API methods after date picker initialization.
    */
  def pickadate(methodName: String, arguments: Any*): Any
  def pickadate(options: DateOptions): JQuery
  @JSName("pickadate")
  var pickadate_Original: typings.pickadate.Pickadate.Pickadate
  @JSName("pickadate")
  def pickadate_hidden(objectName: _hidden): HTMLInputElement
  @JSName("pickadate")
  def pickadate_node(objectName: $node): JQuery
  /**
    * Access the API object on an initialized date picker element.
    */
  @JSName("pickadate")
  def pickadate_picker(keyword: picker): DatePicker
  @JSName("pickadate")
  def pickadate_root(objectName: $root): JQuery
  
  /**
    * Initialize a time picker.
    */
  def pickatime(): JQuery
  /**
    * Invoke API methods after time picker initialization.
    */
  def pickatime(methodName: String, arguments: Any*): Any
  def pickatime(options: TimeOptions): JQuery
  @JSName("pickatime")
  var pickatime_Original: Pickatime
  @JSName("pickatime")
  def pickatime_hidden(objectName: _hidden): HTMLInputElement
  @JSName("pickatime")
  def pickatime_node(objectName: $node): JQuery
  /**
    * Access the API object on an initialized time picker element.
    */
  @JSName("pickatime")
  def pickatime_picker(keyword: picker): TimePicker
  @JSName("pickatime")
  def pickatime_root(objectName: $root): JQuery
}
object JQuery {
  
  inline def apply(pickadate: typings.pickadate.Pickadate.Pickadate, pickatime: Pickatime): JQuery = {
    val __obj = js.Dynamic.literal(pickadate = pickadate.asInstanceOf[js.Any], pickatime = pickatime.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
    
    inline def setPickadate(value: typings.pickadate.Pickadate.Pickadate): Self = StObject.set(x, "pickadate", value.asInstanceOf[js.Any])
    
    inline def setPickatime(value: Pickatime): Self = StObject.set(x, "pickatime", value.asInstanceOf[js.Any])
  }
}
