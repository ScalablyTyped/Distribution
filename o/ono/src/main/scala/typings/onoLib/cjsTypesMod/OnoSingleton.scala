package typings
package onoLib.cjsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnoSingleton
  extends Ono[stdLib.Error] {
  @JSName("error")
  var error_Original: Ono[stdLib.Error] = js.native
  @JSName("eval")
  var eval_Original: Ono[stdLib.EvalError] = js.native
  @JSName("formatter")
  var formatter_Original: MessageFormatter = js.native
  @JSName("range")
  var range_Original: Ono[stdLib.RangeError] = js.native
  @JSName("reference")
  var reference_Original: Ono[stdLib.ReferenceError] = js.native
  @JSName("syntax")
  var syntax_Original: Ono[stdLib.SyntaxError] = js.native
  @JSName("type")
  var type_Original: Ono[stdLib.TypeError] = js.native
  @JSName("uri")
  var uri_Original: Ono[stdLib.URIError] = js.native
  def error(error: ErrorPOJO): stdLib.Error with ErrorPOJO with (OnoError[stdLib.Error with ErrorPOJO]) = js.native
  def error(error: ErrorPOJO, message: java.lang.String, params: js.Any*): stdLib.Error with ErrorPOJO with (OnoError[stdLib.Error with ErrorPOJO]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error.
    *
    * @param error - The original error
    */
  def error(error: stdLib.Error): stdLib.Error with OnoError[stdLib.Error] = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error.
    *
    * @param error - The original error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def error(error: stdLib.Error, message: java.lang.String, params: js.Any*): stdLib.Error with OnoError[stdLib.Error] = js.native
  /**
    * Creates an error with a formatted message.
    *
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def error(message: java.lang.String, params: js.Any*): stdLib.Error with OnoError[stdLib.Error] = js.native
  def error[P /* <: js.Object */](error: ErrorPOJO, props: P): stdLib.Error with ErrorPOJO with P with (OnoError[stdLib.Error with ErrorPOJO with P]) = js.native
  def error[P /* <: js.Object */](error: ErrorPOJO, props: P, message: java.lang.String, params: js.Any*): stdLib.Error with ErrorPOJO with P with (OnoError[stdLib.Error with ErrorPOJO with P]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error,
    * as well as aditional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    */
  def error[P /* <: js.Object */](error: stdLib.Error, props: P): stdLib.Error with P with (OnoError[stdLib.Error with P]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error,
    * as well as additional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def error[P /* <: js.Object */](error: stdLib.Error, props: P, message: java.lang.String, params: js.Any*): stdLib.Error with P with (OnoError[stdLib.Error with P]) = js.native
  /**
    * Creates an error with additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    */
  def error[P /* <: js.Object */](props: P): stdLib.Error with P with (OnoError[stdLib.Error with P]) = js.native
  /**
    * Creates an error with a formatted message and additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def error[P /* <: js.Object */](props: P, message: java.lang.String, params: js.Any*): stdLib.Error with P with (OnoError[stdLib.Error with P]) = js.native
  def eval(error: ErrorPOJO): stdLib.EvalError with ErrorPOJO with (OnoError[stdLib.EvalError with ErrorPOJO]) = js.native
  def eval(error: ErrorPOJO, message: java.lang.String, params: js.Any*): stdLib.EvalError with ErrorPOJO with (OnoError[stdLib.EvalError with ErrorPOJO]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error.
    *
    * @param error - The original error
    */
  def eval(error: stdLib.Error): stdLib.EvalError with stdLib.Error with (OnoError[stdLib.EvalError with stdLib.Error]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error.
    *
    * @param error - The original error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def eval(error: stdLib.Error, message: java.lang.String, params: js.Any*): stdLib.EvalError with stdLib.Error with (OnoError[stdLib.EvalError with stdLib.Error]) = js.native
  /**
    * Creates an error with a formatted message.
    *
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def eval(message: java.lang.String, params: js.Any*): stdLib.EvalError with OnoError[stdLib.EvalError] = js.native
  def eval[P /* <: js.Object */](error: ErrorPOJO, props: P): stdLib.EvalError with ErrorPOJO with P with (OnoError[stdLib.EvalError with ErrorPOJO with P]) = js.native
  def eval[P /* <: js.Object */](error: ErrorPOJO, props: P, message: java.lang.String, params: js.Any*): stdLib.EvalError with ErrorPOJO with P with (OnoError[stdLib.EvalError with ErrorPOJO with P]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error,
    * as well as aditional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    */
  def eval[P /* <: js.Object */](error: stdLib.Error, props: P): stdLib.EvalError with stdLib.Error with P with (OnoError[stdLib.EvalError with stdLib.Error with P]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error,
    * as well as additional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def eval[P /* <: js.Object */](error: stdLib.Error, props: P, message: java.lang.String, params: js.Any*): stdLib.EvalError with stdLib.Error with P with (OnoError[stdLib.EvalError with stdLib.Error with P]) = js.native
  /**
    * Creates an error with additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    */
  def eval[P /* <: js.Object */](props: P): stdLib.EvalError with P with (OnoError[stdLib.EvalError with P]) = js.native
  /**
    * Creates an error with a formatted message and additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def eval[P /* <: js.Object */](props: P, message: java.lang.String, params: js.Any*): stdLib.EvalError with P with (OnoError[stdLib.EvalError with P]) = js.native
  def formatter(message: java.lang.String, args: js.Any*): java.lang.String = js.native
  def range(error: ErrorPOJO): stdLib.RangeError with ErrorPOJO with (OnoError[stdLib.RangeError with ErrorPOJO]) = js.native
  def range(error: ErrorPOJO, message: java.lang.String, params: js.Any*): stdLib.RangeError with ErrorPOJO with (OnoError[stdLib.RangeError with ErrorPOJO]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error.
    *
    * @param error - The original error
    */
  def range(error: stdLib.Error): stdLib.RangeError with stdLib.Error with (OnoError[stdLib.RangeError with stdLib.Error]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error.
    *
    * @param error - The original error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def range(error: stdLib.Error, message: java.lang.String, params: js.Any*): stdLib.RangeError with stdLib.Error with (OnoError[stdLib.RangeError with stdLib.Error]) = js.native
  /**
    * Creates an error with a formatted message.
    *
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def range(message: java.lang.String, params: js.Any*): stdLib.RangeError with OnoError[stdLib.RangeError] = js.native
  def range[P /* <: js.Object */](error: ErrorPOJO, props: P): stdLib.RangeError with ErrorPOJO with P with (OnoError[stdLib.RangeError with ErrorPOJO with P]) = js.native
  def range[P /* <: js.Object */](error: ErrorPOJO, props: P, message: java.lang.String, params: js.Any*): stdLib.RangeError with ErrorPOJO with P with (OnoError[stdLib.RangeError with ErrorPOJO with P]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error,
    * as well as aditional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    */
  def range[P /* <: js.Object */](error: stdLib.Error, props: P): stdLib.RangeError with stdLib.Error with P with (OnoError[stdLib.RangeError with stdLib.Error with P]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error,
    * as well as additional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def range[P /* <: js.Object */](error: stdLib.Error, props: P, message: java.lang.String, params: js.Any*): stdLib.RangeError with stdLib.Error with P with (OnoError[stdLib.RangeError with stdLib.Error with P]) = js.native
  /**
    * Creates an error with additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    */
  def range[P /* <: js.Object */](props: P): stdLib.RangeError with P with (OnoError[stdLib.RangeError with P]) = js.native
  /**
    * Creates an error with a formatted message and additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def range[P /* <: js.Object */](props: P, message: java.lang.String, params: js.Any*): stdLib.RangeError with P with (OnoError[stdLib.RangeError with P]) = js.native
  def reference(error: ErrorPOJO): stdLib.ReferenceError with ErrorPOJO with (OnoError[stdLib.ReferenceError with ErrorPOJO]) = js.native
  def reference(error: ErrorPOJO, message: java.lang.String, params: js.Any*): stdLib.ReferenceError with ErrorPOJO with (OnoError[stdLib.ReferenceError with ErrorPOJO]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error.
    *
    * @param error - The original error
    */
  def reference(error: stdLib.Error): stdLib.ReferenceError with stdLib.Error with (OnoError[stdLib.ReferenceError with stdLib.Error]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error.
    *
    * @param error - The original error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def reference(error: stdLib.Error, message: java.lang.String, params: js.Any*): stdLib.ReferenceError with stdLib.Error with (OnoError[stdLib.ReferenceError with stdLib.Error]) = js.native
  /**
    * Creates an error with a formatted message.
    *
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def reference(message: java.lang.String, params: js.Any*): stdLib.ReferenceError with OnoError[stdLib.ReferenceError] = js.native
  def reference[P /* <: js.Object */](error: ErrorPOJO, props: P): stdLib.ReferenceError with ErrorPOJO with P with (OnoError[stdLib.ReferenceError with ErrorPOJO with P]) = js.native
  def reference[P /* <: js.Object */](error: ErrorPOJO, props: P, message: java.lang.String, params: js.Any*): stdLib.ReferenceError with ErrorPOJO with P with (OnoError[stdLib.ReferenceError with ErrorPOJO with P]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error,
    * as well as aditional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    */
  def reference[P /* <: js.Object */](error: stdLib.Error, props: P): stdLib.ReferenceError with stdLib.Error with P with (OnoError[stdLib.ReferenceError with stdLib.Error with P]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error,
    * as well as additional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def reference[P /* <: js.Object */](error: stdLib.Error, props: P, message: java.lang.String, params: js.Any*): stdLib.ReferenceError with stdLib.Error with P with (OnoError[stdLib.ReferenceError with stdLib.Error with P]) = js.native
  /**
    * Creates an error with additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    */
  def reference[P /* <: js.Object */](props: P): stdLib.ReferenceError with P with (OnoError[stdLib.ReferenceError with P]) = js.native
  /**
    * Creates an error with a formatted message and additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def reference[P /* <: js.Object */](props: P, message: java.lang.String, params: js.Any*): stdLib.ReferenceError with P with (OnoError[stdLib.ReferenceError with P]) = js.native
  def syntax(error: ErrorPOJO): stdLib.SyntaxError with ErrorPOJO with (OnoError[stdLib.SyntaxError with ErrorPOJO]) = js.native
  def syntax(error: ErrorPOJO, message: java.lang.String, params: js.Any*): stdLib.SyntaxError with ErrorPOJO with (OnoError[stdLib.SyntaxError with ErrorPOJO]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error.
    *
    * @param error - The original error
    */
  def syntax(error: stdLib.Error): stdLib.SyntaxError with stdLib.Error with (OnoError[stdLib.SyntaxError with stdLib.Error]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error.
    *
    * @param error - The original error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def syntax(error: stdLib.Error, message: java.lang.String, params: js.Any*): stdLib.SyntaxError with stdLib.Error with (OnoError[stdLib.SyntaxError with stdLib.Error]) = js.native
  /**
    * Creates an error with a formatted message.
    *
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def syntax(message: java.lang.String, params: js.Any*): stdLib.SyntaxError with OnoError[stdLib.SyntaxError] = js.native
  def syntax[P /* <: js.Object */](error: ErrorPOJO, props: P): stdLib.SyntaxError with ErrorPOJO with P with (OnoError[stdLib.SyntaxError with ErrorPOJO with P]) = js.native
  def syntax[P /* <: js.Object */](error: ErrorPOJO, props: P, message: java.lang.String, params: js.Any*): stdLib.SyntaxError with ErrorPOJO with P with (OnoError[stdLib.SyntaxError with ErrorPOJO with P]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error,
    * as well as aditional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    */
  def syntax[P /* <: js.Object */](error: stdLib.Error, props: P): stdLib.SyntaxError with stdLib.Error with P with (OnoError[stdLib.SyntaxError with stdLib.Error with P]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error,
    * as well as additional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def syntax[P /* <: js.Object */](error: stdLib.Error, props: P, message: java.lang.String, params: js.Any*): stdLib.SyntaxError with stdLib.Error with P with (OnoError[stdLib.SyntaxError with stdLib.Error with P]) = js.native
  /**
    * Creates an error with additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    */
  def syntax[P /* <: js.Object */](props: P): stdLib.SyntaxError with P with (OnoError[stdLib.SyntaxError with P]) = js.native
  /**
    * Creates an error with a formatted message and additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def syntax[P /* <: js.Object */](props: P, message: java.lang.String, params: js.Any*): stdLib.SyntaxError with P with (OnoError[stdLib.SyntaxError with P]) = js.native
  def `type`(error: ErrorPOJO): stdLib.TypeError with ErrorPOJO with (OnoError[stdLib.TypeError with ErrorPOJO]) = js.native
  def `type`(error: ErrorPOJO, message: java.lang.String, params: js.Any*): stdLib.TypeError with ErrorPOJO with (OnoError[stdLib.TypeError with ErrorPOJO]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error.
    *
    * @param error - The original error
    */
  def `type`(error: stdLib.Error): stdLib.TypeError with stdLib.Error with (OnoError[stdLib.TypeError with stdLib.Error]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error.
    *
    * @param error - The original error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def `type`(error: stdLib.Error, message: java.lang.String, params: js.Any*): stdLib.TypeError with stdLib.Error with (OnoError[stdLib.TypeError with stdLib.Error]) = js.native
  /**
    * Creates an error with a formatted message.
    *
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def `type`(message: java.lang.String, params: js.Any*): stdLib.TypeError with OnoError[stdLib.TypeError] = js.native
  def `type`[P /* <: js.Object */](error: ErrorPOJO, props: P): stdLib.TypeError with ErrorPOJO with P with (OnoError[stdLib.TypeError with ErrorPOJO with P]) = js.native
  def `type`[P /* <: js.Object */](error: ErrorPOJO, props: P, message: java.lang.String, params: js.Any*): stdLib.TypeError with ErrorPOJO with P with (OnoError[stdLib.TypeError with ErrorPOJO with P]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error,
    * as well as aditional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    */
  def `type`[P /* <: js.Object */](error: stdLib.Error, props: P): stdLib.TypeError with stdLib.Error with P with (OnoError[stdLib.TypeError with stdLib.Error with P]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error,
    * as well as additional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def `type`[P /* <: js.Object */](error: stdLib.Error, props: P, message: java.lang.String, params: js.Any*): stdLib.TypeError with stdLib.Error with P with (OnoError[stdLib.TypeError with stdLib.Error with P]) = js.native
  /**
    * Creates an error with additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    */
  def `type`[P /* <: js.Object */](props: P): stdLib.TypeError with P with (OnoError[stdLib.TypeError with P]) = js.native
  /**
    * Creates an error with a formatted message and additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def `type`[P /* <: js.Object */](props: P, message: java.lang.String, params: js.Any*): stdLib.TypeError with P with (OnoError[stdLib.TypeError with P]) = js.native
  def uri(error: ErrorPOJO): stdLib.URIError with ErrorPOJO with (OnoError[stdLib.URIError with ErrorPOJO]) = js.native
  def uri(error: ErrorPOJO, message: java.lang.String, params: js.Any*): stdLib.URIError with ErrorPOJO with (OnoError[stdLib.URIError with ErrorPOJO]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error.
    *
    * @param error - The original error
    */
  def uri(error: stdLib.Error): stdLib.URIError with stdLib.Error with (OnoError[stdLib.URIError with stdLib.Error]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error.
    *
    * @param error - The original error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def uri(error: stdLib.Error, message: java.lang.String, params: js.Any*): stdLib.URIError with stdLib.Error with (OnoError[stdLib.URIError with stdLib.Error]) = js.native
  /**
    * Creates an error with a formatted message.
    *
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def uri(message: java.lang.String, params: js.Any*): stdLib.URIError with OnoError[stdLib.URIError] = js.native
  def uri[P /* <: js.Object */](error: ErrorPOJO, props: P): stdLib.URIError with ErrorPOJO with P with (OnoError[stdLib.URIError with ErrorPOJO with P]) = js.native
  def uri[P /* <: js.Object */](error: ErrorPOJO, props: P, message: java.lang.String, params: js.Any*): stdLib.URIError with ErrorPOJO with P with (OnoError[stdLib.URIError with ErrorPOJO with P]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error,
    * as well as aditional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    */
  def uri[P /* <: js.Object */](error: stdLib.Error, props: P): stdLib.URIError with stdLib.Error with P with (OnoError[stdLib.URIError with stdLib.Error with P]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error,
    * as well as additional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def uri[P /* <: js.Object */](error: stdLib.Error, props: P, message: java.lang.String, params: js.Any*): stdLib.URIError with stdLib.Error with P with (OnoError[stdLib.URIError with stdLib.Error with P]) = js.native
  /**
    * Creates an error with additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    */
  def uri[P /* <: js.Object */](props: P): stdLib.URIError with P with (OnoError[stdLib.URIError with P]) = js.native
  /**
    * Creates an error with a formatted message and additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def uri[P /* <: js.Object */](props: P, message: java.lang.String, params: js.Any*): stdLib.URIError with P with (OnoError[stdLib.URIError with P]) = js.native
}

