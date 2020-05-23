package typings.microsoftAjax.global.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides static, culture-neutral exception messages that are used by the Microsoft Ajax Library framework.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb397705(v=vs.100).aspx}
  * This type supports the .NET Framework infrastructure and is not intended to be used directly from your code.
  */
@JSGlobal("Sys.Res")
@js.native
class Res ()
  extends typings.microsoftAjax.Sys.Res

/* static members */
@JSGlobal("Sys.Res")
@js.native
object Res extends js.Object {
  //#region Fields
  /**
    * @return "Actual value was {0}."
    */
  var actualValue: String = js.native
  /**
    * @return "The application failed to load within the specified time out period."
    */
  var appLoadTimedout: String = js.native
  /**
    * @return "Value does not fall within the expected range."
    */
  var argument: String = js.native
  /**
    * @return "Value cannot be null."
    */
  var argumentNull: String = js.native
  /**
    * @return "Specified argument was out of the range of valid values.
    */
  var argumentOutOfRange: String = js.native
  /**
    * @return "Object cannot be converted to the required type."
    */
  var argumentType: String = js.native
  /**
    * @return "Object of type '{0}' cannot be converted to type '{1}'."
    */
  var argumentTypeWithTypes: String = js.native
  /**
    * @return "Value cannot be undefined."
    */
  var argumentUndefined: String = js.native
  /**
    * @return "Assertion Failed: {0}"
    */
  var assertFailed: String = js.native
  /**
    * @return "Assertion Failed: {0}\r\nat {1}"
    */
  var assetFailedCaller: String = js.native
  /**
    * @return "Base URL does not contain ://."
    */
  var badBaseUrl1: String = js.native
  /**
    * @return "Base URL does not contain another /."
    */
  var badBaseUrl2: String = js.native
  /**
    * @return "Cannot find last / in base URL."
    */
  var badBaseUrl3: String = js.native
  /**
    * @return "{0}\r\n\r\nBreak into debugger?"
    */
  var breakIntoDebugger: String = js.native
  /**
    * @return "Cannot abort when executor has not started."
    */
  var cannotAbortBeforeStart: String = js.native
  /**
    * @return "Cannot call {0} when responseAvailable is false."
    */
  var cannotCallBeforeResponse: String = js.native
  /**
    * @return "Cannot call {0} once started."
    */
  var cannotCallOnceStarted: String = js.native
  /**
    * @return "Cannot call {0} outside of a completed event handler."
    */
  var cannotCallOutsideHandler: String = js.native
  /**
    * @return "Cannot deserialize empty string."
    */
  var cannotDeserializeEmptyString: String = js.native
  /**
    * @return "Cannot serialize non-finite numbers."
    */
  var cannotSerializeNonFiniteNumbers: String = js.native
  /**
    * @return "The id property can't be set on a control."
    */
  var controlCantSetId: String = js.native
  /**
    * @return "'{0}' is not a valid value for enum {1}."
    */
  var enumInvalidValue: String = js.native
  /**
    * @return "Handler was not added through the Sys.UI.DomEvent.addHandler method.
    */
  var eventHandlerInvalid: String = js.native
  /**
    * @return "Handler must be a function."
    */
  var eventHandlerNotFunction: String = js.native
  /**
    * @return "One of the identified items was in an invalid format."
    */
  var format: String = js.native
  /**
    * @return "The string was not recognized as a valid Date."
    */
  var formatBadDate: String = js.native
  /**
    * @return "Format specifier was invalid."
    */
  var formatBadFormatSpecifier: String = js.native
  /**
    * @return "Input string was not in a correct format."
    */
  var formatInvalidString: String = js.native
  /**
    * @return "Could not create a valid Sys.Net.WebRequestExecutor from: {0}."
    */
  var invalidExecutorType: String = js.native
  /**
    * @return "httpVerb cannot be set to an empty or null string."
    */
  var invalidHttpVerb: String = js.native
  /**
    * @return "Operation is not valid due to the current state of the object."
    */
  var invalidOperation: String = js.native
  /**
    * @return "Value must be greater than or equal to zero."
    */
  var invalidTimeout: String = js.native
  /**
    * @return "Cannot call invoke more than once."
    */
  var invokeCalledTwice: String = js.native
  /**
    * @return "The method or operation is not implemented."
    */
  var notImplemented: String = js.native
  /**
    * @return "Cannot call executeRequest with a null webRequest."
    */
  var nullWebRequest: String = js.native
  /**
    * @return "'{0}' is not an Array property."
    */
  var propertyNotAnArray: String = js.native
  /**
    * @return "'{0}' is not a writable property."
    */
  var propertyNotWritable: String = js.native
  /**
    * @return "'{0}' is not a property or an existing field."
    */
  var propertyUndefined: String = js.native
  /**
    * @return "'{0}' is not an event."
    */
  var undefinedEvent: String = js.native
}

