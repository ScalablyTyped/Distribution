package typings.microsoftAjax.global.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Exception Types
// Really not a types
///**
//* Raised when a function or method is invoked and at least one of the passed arguments does not meet the parameter specification of the called function or method.
//**/
//class ArgumentException {
//}
///**
//* Raised when an argument has an invalid value of null.
//**/
//class ArgumentNullException {
//}
///**
//* Raised when an argument value is outside an acceptable range.
//**/
//class ArgumentOutOfRangeException {
//}
///**
//* Raised when a parameter is not an allowed type.
//**/
//class ArgumentTypeException {
//}
///**
//* Raised when an argument for a required method parameter is undefined.
//**/
//class ArgumentUndefinedException {
//}
///**
//*
//**/
//class FormatException {
//}
///**
//* Raised when a call to a method has failed, but the reason was not invalid arguments.
//**/
//class InvalidOperationException {
//}
///**
//* Raised when a requested method is not supported by an object.
//**/
//class NotImplementedException {
//}
///**
//* Raised when an invalid number of arguments have been passed to a function.
//**/
//class ParameterCountException {
//}
///**
//* Raised by the Microsoft Ajax Library framework when a script does not load successfully. This exception should not be thrown by the developer.
//**/
//class ScriptLoadFailedException {
//}
//#endregion
//#region Sys.Net Namespace
/**
  * The Sys.Net namespace contains classes that manage communication between AJAX-enabled ASP.NET client applications and Web services on the server. For more information, see Using Web Services in ASP.NET AJAX. The Sys.Net namespace is part of the Microsoft Ajax Library.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb310860(v=vs.100).aspx}
  */
@JSGlobal("Sys.Net")
@js.native
object Net extends js.Object {
  
  var WebRequestManager: typings.microsoftAjax.Sys.Net.IWebRequestManager = js.native
  
  /**
    * Manages the flow of the Web requests issued by the Sys.Net.WebRequest object to the associated executor object.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb397435(v=vs.100).aspx}
    */
  @js.native
  //#region Constructor
  /**
    * Initializes a new instance of the Sys.Net.WebRequestManager class when implemented in a derived class.
    */
  class IWebRequestManager ()
    extends typings.microsoftAjax.Sys.Net.IWebRequestManager
  
  /**
    * Contains information about a Web request that is ready to be sent to the current Sys.Net.WebRequestExecutor instance.
    * This class represents the type for the second parameter of the callback function added by the add_invokingRequest method.
    * The callback function is called before the Web request is routed to the current instance of the WebRequestExecutor class.
    *
    * @see {@link http://msdn.microsoft.com/en-us/library/bb397488(v=vs.100).aspx}
    */
  @js.native
  class NetworkRequestEventArgs protected ()
    extends typings.microsoftAjax.Sys.Net.NetworkRequestEventArgs {
    //#region Constructors
    /**
      * Initializes a new instance of the Sys.Net.NetworkRequestEventArgs. class.
      * @param value
      *      The current WebRequest instance.
      */
    def this(value: typings.microsoftAjax.Sys.Net.WebRequest) = this()
  }
  
  /**
    * Provides the script API to make a Web request.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb310979(v=vs.100).aspx}
    */
  @js.native
  //#region Constructors
  /**
    * Initializes a new instance of the Sys.Net.WebRequest class.
    */
  class WebRequest ()
    extends typings.microsoftAjax.Sys.Net.WebRequest
  
  /**
    * Provides the abstract base class from which network executors derive.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb397434(v=vs.100).aspx}
    */
  @js.native
  //#region Constructors
  /**
    * Initializes a Sys.Net.WebRequestExecutor instance when implemented in a derived class.
    */
  class WebRequestExecutor ()
    extends typings.microsoftAjax.Sys.Net.WebRequestExecutor
  
  @js.native
  class WebServiceError ()
    extends typings.microsoftAjax.Sys.Net.WebServiceError
  
  /**
    * Generated Proxy Classes
    * Enables your application to call Web services asynchronously by using ECMAScript (JavaScript).
    * @see {@link http://msdn.microsoft.com/en-us/library/bb310823(v=vs.100).aspx}
    */
  @js.native
  class WebServiceProxy ()
    extends typings.microsoftAjax.Sys.Net.WebServiceProxy
  /* static members */
  @js.native
  object WebServiceProxy extends js.Object {
    
    def invoke(
      servicePath: String,
      methodName: String,
      useGet: js.UndefOr[Boolean],
      params: js.UndefOr[js.Any],
      onSuccess: js.UndefOr[
          js.Function2[/* result */ String, /* eventArgs */ typings.microsoftAjax.Sys.EventArgs, Unit]
        ],
      onFailure: js.UndefOr[js.Function1[/* error */ typings.microsoftAjax.Sys.Net.WebServiceError, Unit]],
      userContext: js.UndefOr[js.Any],
      timeout: js.UndefOr[Double],
      enableJsonp: js.UndefOr[Boolean],
      jsonpCallbackParameter: js.UndefOr[String]
    ): typings.microsoftAjax.Sys.Net.WebRequest = js.native
  }
}
