package typings.pickadate.Pickadate

import typings.pickadate.JQuery
import typings.pickadate.pickadateStrings.$node
import typings.pickadate.pickadateStrings.$root
import typings.pickadate.pickadateStrings._hidden
import typings.pickadate.pickadateStrings.picker
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pickadate extends StObject {
  
  /**
    * Initialize a date picker.
    */
  def apply(): JQuery = js.native
  /**
    * Access the API object on an initialized date picker element.
    */
  def apply(keyword: picker): DatePicker = js.native
  /**
    * Invoke API methods after date picker initialization.
    */
  def apply(methodName: String, arguments: Any*): Any = js.native
  def apply(objectName: $node): JQuery = js.native
  def apply(objectName: $root): JQuery = js.native
  def apply(objectName: _hidden): HTMLInputElement = js.native
  def apply(options: DateOptions): JQuery = js.native
  
  var defaults: DateOptions = js.native
}
