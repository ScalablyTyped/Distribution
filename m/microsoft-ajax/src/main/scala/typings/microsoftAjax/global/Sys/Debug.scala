package typings.microsoftAjax.global.Sys

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides debugging and tracing functionality for client ECMAScript (JavaScript) code. This class is static and can be invoked directly without creating an instance of the class.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb397422(v=vs.100).aspx}
  */
@JSGlobal("Sys.Debug")
@js.native
//#region Constructors
/**
  * Initializes a new instance of the Sys.Debug class.
  */
open class Debug ()
  extends StObject
     with typings.microsoftAjax.Sys.Debug
object Debug {
  
  @JSGlobal("Sys.Debug")
  @js.native
  val ^ : js.Any = js.native
  
  //#endregion
  //#region Methods
  /**
    * Checks for a condition, and if the condition is false, displays a message and prompts the user to break into the debugger.
    * When you call the assert method in your code, express the success of an operation as true or false and use that value for condition. If the operation fails (if condition is false), the assert logic is executed.
    * The assert method should be used to catch developer errors. To respond to user errors and to run-time error conditions such as network errors or permission failures, throw an exception.
    * Debugging behavior, requirements, and the output of trace messages vary with different browsers. For more information, see Debugging and Tracing Ajax Applications Overview.
    *
    * @param condition
    *      true to continue to execute code; false to display message and break into the debugger.
    * @param message
    *      (Optional) The message to display. The default is an empty string ("").
    * @param displayCaller
    *      (Optional) true to indicate that the name of the function that is calling assert should be displayed in the message. The default is false.
    */
  /* static member */
  inline def assert(condition: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assert")(condition.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def assert(condition: Boolean, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def assert(condition: Boolean, message: String, displayCaller: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any], displayCaller.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def assert(condition: Boolean, message: Unit, displayCaller: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any], displayCaller.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Clears all trace messages from the trace console.
    */
  /* static member */
  inline def clearTrace(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTrace")().asInstanceOf[Unit]
  
  /**
    * Displays a message in the debugger's output window and breaks into the debugger.
    * @param message
    *           The message to display.
    */
  /* static member */
  inline def fail(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Appends a text line to the debugger console and to the trace console, if available.
    * @param text
    *       The text to display.
    */
  /* static member */
  inline def trace(text: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(text.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Dumps an object to the debugger console and to the trace console, if available.
    * @param object
    *      The object to dump.
    * @param name
    *      (Optional) The name of the object.
    */
  /* static member */
  inline def traceDump(`object`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("traceDump")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def traceDump(`object`: Any, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traceDump")(`object`.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
