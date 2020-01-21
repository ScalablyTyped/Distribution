package typings.microsoftAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* Provides static functions that extend the built-in ECMAScript (JavaScript) Function type by including exception
* details and support for application-compilation modes (debug or release).
* @see {@link http://msdn.microsoft.com/en-us/library/dd409270(v=vs.100).aspx}
*/
@js.native
trait FunctionConstructor extends js.Object {
  //#region Extensions
  /**
    * Creates a delegate function that retains the context first used during an objects creation.
    * @see {@link http://msdn.microsoft.com/en-us/library/dd393582(v=vs.100).aspx }
    */
  def createCallback(method: js.Function, context: js.Any*): js.Function = js.native
  /**
    * Creates a callback function that retains the parameter initially used during an object's creation.
    * @see {@link http://msdn.microsoft.com/en-us/library/dd409287(v=vs.100).aspx }
    */
  def createDelegate(instance: js.Any, method: js.Function): js.Function = js.native
  /**
    * A function that does nothing.
    * @see {@link http://msdn.microsoft.com/en-us/library/dd393667(v=vs.100).aspx }
    */
  def emptyMethod(): js.Function = js.native
  /**
    * Validates the parameters to a method are as expected.
    * @see {@link http://msdn.microsoft.com/en-us/library/dd393712(v=vs.100).aspx }
    */
  def validateParameters(parameters: js.Any, expectedParameters: js.Array[js.Object]): js.Any = js.native
  def validateParameters(parameters: js.Any, expectedParameters: js.Array[js.Object], validateParameterCount: Boolean): js.Any = js.native
}

