package typings
package microsoftDashAjaxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* Provides static functions that extend the built-in ECMAScript (JavaScript) Error type by including exception details and support for application-compilation modes (debug or release).
* Error Type Extensions
* @see {@link http://msdn.microsoft.com/en-us/library/bb310947(v=vs.100).aspx}
*/
@js.native
trait ErrorConstructor extends js.Object {
  /**
    * Creates an Error object that represents the Sys.ArgumentException exception.
    */
  def argument(): stdLib.Error = js.native
  def argument(paramName: js.Any): stdLib.Error = js.native
  def argument(paramName: js.Any, message: java.lang.String): stdLib.Error = js.native
  /**
    * Creates an Error object that represents the Sys.ArgumentNullException exception.
    */
  def argumentNull(): stdLib.Error = js.native
  def argumentNull(paramName: js.Any): stdLib.Error = js.native
  def argumentNull(paramName: js.Any, message: java.lang.String): stdLib.Error = js.native
  /**
    * Creates an Error object that represents the Sys.ArgumentOutOfRangeException exception.
    */
  def argumentOutOfRange(): stdLib.Error = js.native
  def argumentOutOfRange(paramName: java.lang.String): stdLib.Error = js.native
  def argumentOutOfRange(paramName: java.lang.String, actualValue: js.Any): stdLib.Error = js.native
  def argumentOutOfRange(paramName: java.lang.String, actualValue: js.Any, message: java.lang.String): stdLib.Error = js.native
  /**
    * Creates an Error object that represents the Sys.ArgumentTypeException exception.
    */
  def argumentType(): stdLib.Error = js.native
  def argumentType(paramName: java.lang.String): stdLib.Error = js.native
  def argumentType(paramName: java.lang.String, actualType: js.Any): stdLib.Error = js.native
  def argumentType(paramName: java.lang.String, actualType: js.Any, expectedType: js.Any): stdLib.Error = js.native
  def argumentType(paramName: java.lang.String, actualType: js.Any, expectedType: js.Any, message: java.lang.String): stdLib.Error = js.native
  /**
    * Creates an Error object that represents the Sys.ArgumentUndefinedException exception.
    */
  def argumentUndefined(): stdLib.Error = js.native
  def argumentUndefined(paramName: java.lang.String): stdLib.Error = js.native
  def argumentUndefined(paramName: java.lang.String, message: java.lang.String): stdLib.Error = js.native
  /**
    * Creates an Error object that can contain additional error information.
    */
  def create(): stdLib.Error = js.native
  def create(message: java.lang.String): stdLib.Error = js.native
  def create(message: java.lang.String, errorInfo: js.Object): stdLib.Error = js.native
  /**
    * Creates an Error object that represents the Sys.FormatException exception.
    */
  def format(): stdLib.Error = js.native
  def format(message: java.lang.String): stdLib.Error = js.native
  /**
    * Creates an Error object that represents the Sys.InvalidOperationException exception.
    */
  def invalidOperation(): stdLib.Error = js.native
  def invalidOperation(message: java.lang.String): stdLib.Error = js.native
  /**
    * Creates an Error object that represents the Sys.NotImplementedException exception.
    */
  def notImplemented(): stdLib.Error = js.native
  def notImplemented(message: java.lang.String): stdLib.Error = js.native
  //#region Extensions
  /**
    * Creates an Error object that represents the Sys.ParameterCountException exception.
    */
  def parameterCount(): stdLib.Error = js.native
  def parameterCount(message: java.lang.String): stdLib.Error = js.native
}

