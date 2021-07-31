package typings.microsoftAjax

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
* Provides static functions that extend the built-in ECMAScript (JavaScript) Error type by including exception details and support for application-compilation modes (debug or release).
* Error Type Extensions
* @see {@link http://msdn.microsoft.com/en-us/library/bb310947(v=vs.100).aspx}
*/
@js.native
trait ErrorConstructor extends StObject {
  
  /**
    * Creates an Error object that represents the Sys.ArgumentException exception.
    */
  def argument(): Error = js.native
  def argument(paramName: js.Any): Error = js.native
  def argument(paramName: js.Any, message: java.lang.String): Error = js.native
  def argument(paramName: Unit, message: java.lang.String): Error = js.native
  
  /**
    * Creates an Error object that represents the Sys.ArgumentNullException exception.
    */
  def argumentNull(): Error = js.native
  def argumentNull(paramName: js.Any): Error = js.native
  def argumentNull(paramName: js.Any, message: java.lang.String): Error = js.native
  def argumentNull(paramName: Unit, message: java.lang.String): Error = js.native
  
  /**
    * Creates an Error object that represents the Sys.ArgumentOutOfRangeException exception.
    */
  def argumentOutOfRange(): Error = js.native
  def argumentOutOfRange(paramName: java.lang.String): Error = js.native
  def argumentOutOfRange(paramName: java.lang.String, actualValue: js.Any): Error = js.native
  def argumentOutOfRange(paramName: java.lang.String, actualValue: js.Any, message: java.lang.String): Error = js.native
  def argumentOutOfRange(paramName: java.lang.String, actualValue: Unit, message: java.lang.String): Error = js.native
  def argumentOutOfRange(paramName: Unit, actualValue: js.Any): Error = js.native
  def argumentOutOfRange(paramName: Unit, actualValue: js.Any, message: java.lang.String): Error = js.native
  def argumentOutOfRange(paramName: Unit, actualValue: Unit, message: java.lang.String): Error = js.native
  
  /**
    * Creates an Error object that represents the Sys.ArgumentTypeException exception.
    */
  def argumentType(): Error = js.native
  def argumentType(paramName: java.lang.String): Error = js.native
  def argumentType(paramName: java.lang.String, actualType: js.Any): Error = js.native
  def argumentType(paramName: java.lang.String, actualType: js.Any, expectedType: js.Any): Error = js.native
  def argumentType(paramName: java.lang.String, actualType: js.Any, expectedType: js.Any, message: java.lang.String): Error = js.native
  def argumentType(paramName: java.lang.String, actualType: js.Any, expectedType: Unit, message: java.lang.String): Error = js.native
  def argumentType(paramName: java.lang.String, actualType: Unit, expectedType: js.Any): Error = js.native
  def argumentType(paramName: java.lang.String, actualType: Unit, expectedType: js.Any, message: java.lang.String): Error = js.native
  def argumentType(paramName: java.lang.String, actualType: Unit, expectedType: Unit, message: java.lang.String): Error = js.native
  def argumentType(paramName: Unit, actualType: js.Any): Error = js.native
  def argumentType(paramName: Unit, actualType: js.Any, expectedType: js.Any): Error = js.native
  def argumentType(paramName: Unit, actualType: js.Any, expectedType: js.Any, message: java.lang.String): Error = js.native
  def argumentType(paramName: Unit, actualType: js.Any, expectedType: Unit, message: java.lang.String): Error = js.native
  def argumentType(paramName: Unit, actualType: Unit, expectedType: js.Any): Error = js.native
  def argumentType(paramName: Unit, actualType: Unit, expectedType: js.Any, message: java.lang.String): Error = js.native
  def argumentType(paramName: Unit, actualType: Unit, expectedType: Unit, message: java.lang.String): Error = js.native
  
  /**
    * Creates an Error object that represents the Sys.ArgumentUndefinedException exception.
    */
  def argumentUndefined(): Error = js.native
  def argumentUndefined(paramName: java.lang.String): Error = js.native
  def argumentUndefined(paramName: java.lang.String, message: java.lang.String): Error = js.native
  def argumentUndefined(paramName: Unit, message: java.lang.String): Error = js.native
  
  /**
    * Creates an Error object that can contain additional error information.
    */
  def create(): Error = js.native
  def create(message: java.lang.String): Error = js.native
  def create(message: java.lang.String, errorInfo: js.Object): Error = js.native
  def create(message: Unit, errorInfo: js.Object): Error = js.native
  
  /**
    * Creates an Error object that represents the Sys.FormatException exception.
    */
  def format(): Error = js.native
  def format(message: java.lang.String): Error = js.native
  
  /**
    * Creates an Error object that represents the Sys.InvalidOperationException exception.
    */
  def invalidOperation(): Error = js.native
  def invalidOperation(message: java.lang.String): Error = js.native
  
  /**
    * Creates an Error object that represents the Sys.NotImplementedException exception.
    */
  def notImplemented(): Error = js.native
  def notImplemented(message: java.lang.String): Error = js.native
  
  //#region Extensions
  /**
    * Creates an Error object that represents the Sys.ParameterCountException exception.
    */
  def parameterCount(): Error = js.native
  def parameterCount(message: java.lang.String): Error = js.native
}
