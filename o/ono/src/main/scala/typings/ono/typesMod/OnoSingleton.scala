package typings.ono.typesMod

import typings.std.Error
import typings.std.EvalError
import typings.std.RangeError
import typings.std.ReferenceError
import typings.std.SyntaxError
import typings.std.TypeError
import typings.std.URIError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnoSingleton extends Ono[Error] {
  @JSName("error")
  var error_Original: Ono[Error] = js.native
  @JSName("eval")
  var eval_Original: Ono[EvalError] = js.native
  @JSName("range")
  var range_Original: Ono[RangeError] = js.native
  @JSName("reference")
  var reference_Original: Ono[ReferenceError] = js.native
  @JSName("syntax")
  var syntax_Original: Ono[SyntaxError] = js.native
  @JSName("type")
  var type_Original: Ono[TypeError] = js.native
  @JSName("uri")
  var uri_Original: Ono[URIError] = js.native
  def error(error: ErrorPOJO): Error with ErrorPOJO with (OnoError[Error with ErrorPOJO]) = js.native
  def error(error: ErrorPOJO, message: String, params: js.Any*): Error with ErrorPOJO with (OnoError[Error with ErrorPOJO]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error.
    *
    * @param error - The original error
    */
  def error(error: Error): Error with OnoError[Error] = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error.
    *
    * @param error - The original error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def error(error: Error, message: String, params: js.Any*): Error with OnoError[Error] = js.native
  /**
    * Creates an error with a formatted message.
    *
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def error(message: String, params: js.Any*): Error with OnoError[Error] = js.native
  def error[P /* <: js.Object */](error: ErrorPOJO, props: P): Error with ErrorPOJO with P with (OnoError[Error with ErrorPOJO with P]) = js.native
  def error[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): Error with ErrorPOJO with P with (OnoError[Error with ErrorPOJO with P]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error,
    * as well as aditional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    */
  def error[P /* <: js.Object */](error: Error, props: P): Error with P with (OnoError[Error with P]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error,
    * as well as additional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def error[P /* <: js.Object */](error: Error, props: P, message: String, params: js.Any*): Error with P with (OnoError[Error with P]) = js.native
  /**
    * Creates an error with additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    */
  def error[P /* <: js.Object */](props: P): Error with P with (OnoError[Error with P]) = js.native
  /**
    * Creates an error with a formatted message and additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def error[P /* <: js.Object */](props: P, message: String, params: js.Any*): Error with P with (OnoError[Error with P]) = js.native
  def eval(error: ErrorPOJO): EvalError with ErrorPOJO with (OnoError[EvalError with ErrorPOJO]) = js.native
  def eval(error: ErrorPOJO, message: String, params: js.Any*): EvalError with ErrorPOJO with (OnoError[EvalError with ErrorPOJO]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error.
    *
    * @param error - The original error
    */
  def eval(error: Error): EvalError with Error with (OnoError[EvalError with Error]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error.
    *
    * @param error - The original error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def eval(error: Error, message: String, params: js.Any*): EvalError with Error with (OnoError[EvalError with Error]) = js.native
  /**
    * Creates an error with a formatted message.
    *
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def eval(message: String, params: js.Any*): EvalError with OnoError[EvalError] = js.native
  def eval[P /* <: js.Object */](error: ErrorPOJO, props: P): EvalError with ErrorPOJO with P with (OnoError[EvalError with ErrorPOJO with P]) = js.native
  def eval[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): EvalError with ErrorPOJO with P with (OnoError[EvalError with ErrorPOJO with P]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error,
    * as well as aditional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    */
  def eval[P /* <: js.Object */](error: Error, props: P): EvalError with Error with P with (OnoError[EvalError with Error with P]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error,
    * as well as additional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def eval[P /* <: js.Object */](error: Error, props: P, message: String, params: js.Any*): EvalError with Error with P with (OnoError[EvalError with Error with P]) = js.native
  /**
    * Creates an error with additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    */
  def eval[P /* <: js.Object */](props: P): EvalError with P with (OnoError[EvalError with P]) = js.native
  /**
    * Creates an error with a formatted message and additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def eval[P /* <: js.Object */](props: P, message: String, params: js.Any*): EvalError with P with (OnoError[EvalError with P]) = js.native
  def range(error: ErrorPOJO): RangeError with ErrorPOJO with (OnoError[RangeError with ErrorPOJO]) = js.native
  def range(error: ErrorPOJO, message: String, params: js.Any*): RangeError with ErrorPOJO with (OnoError[RangeError with ErrorPOJO]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error.
    *
    * @param error - The original error
    */
  def range(error: Error): RangeError with Error with (OnoError[RangeError with Error]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error.
    *
    * @param error - The original error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def range(error: Error, message: String, params: js.Any*): RangeError with Error with (OnoError[RangeError with Error]) = js.native
  /**
    * Creates an error with a formatted message.
    *
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def range(message: String, params: js.Any*): RangeError with OnoError[RangeError] = js.native
  def range[P /* <: js.Object */](error: ErrorPOJO, props: P): RangeError with ErrorPOJO with P with (OnoError[RangeError with ErrorPOJO with P]) = js.native
  def range[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): RangeError with ErrorPOJO with P with (OnoError[RangeError with ErrorPOJO with P]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error,
    * as well as aditional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    */
  def range[P /* <: js.Object */](error: Error, props: P): RangeError with Error with P with (OnoError[RangeError with Error with P]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error,
    * as well as additional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def range[P /* <: js.Object */](error: Error, props: P, message: String, params: js.Any*): RangeError with Error with P with (OnoError[RangeError with Error with P]) = js.native
  /**
    * Creates an error with additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    */
  def range[P /* <: js.Object */](props: P): RangeError with P with (OnoError[RangeError with P]) = js.native
  /**
    * Creates an error with a formatted message and additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def range[P /* <: js.Object */](props: P, message: String, params: js.Any*): RangeError with P with (OnoError[RangeError with P]) = js.native
  def reference(error: ErrorPOJO): ReferenceError with ErrorPOJO with (OnoError[ReferenceError with ErrorPOJO]) = js.native
  def reference(error: ErrorPOJO, message: String, params: js.Any*): ReferenceError with ErrorPOJO with (OnoError[ReferenceError with ErrorPOJO]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error.
    *
    * @param error - The original error
    */
  def reference(error: Error): ReferenceError with Error with (OnoError[ReferenceError with Error]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error.
    *
    * @param error - The original error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def reference(error: Error, message: String, params: js.Any*): ReferenceError with Error with (OnoError[ReferenceError with Error]) = js.native
  /**
    * Creates an error with a formatted message.
    *
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def reference(message: String, params: js.Any*): ReferenceError with OnoError[ReferenceError] = js.native
  def reference[P /* <: js.Object */](error: ErrorPOJO, props: P): ReferenceError with ErrorPOJO with P with (OnoError[ReferenceError with ErrorPOJO with P]) = js.native
  def reference[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): ReferenceError with ErrorPOJO with P with (OnoError[ReferenceError with ErrorPOJO with P]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error,
    * as well as aditional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    */
  def reference[P /* <: js.Object */](error: Error, props: P): ReferenceError with Error with P with (OnoError[ReferenceError with Error with P]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error,
    * as well as additional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def reference[P /* <: js.Object */](error: Error, props: P, message: String, params: js.Any*): ReferenceError with Error with P with (OnoError[ReferenceError with Error with P]) = js.native
  /**
    * Creates an error with additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    */
  def reference[P /* <: js.Object */](props: P): ReferenceError with P with (OnoError[ReferenceError with P]) = js.native
  /**
    * Creates an error with a formatted message and additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def reference[P /* <: js.Object */](props: P, message: String, params: js.Any*): ReferenceError with P with (OnoError[ReferenceError with P]) = js.native
  def syntax(error: ErrorPOJO): SyntaxError with ErrorPOJO with (OnoError[SyntaxError with ErrorPOJO]) = js.native
  def syntax(error: ErrorPOJO, message: String, params: js.Any*): SyntaxError with ErrorPOJO with (OnoError[SyntaxError with ErrorPOJO]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error.
    *
    * @param error - The original error
    */
  def syntax(error: Error): SyntaxError with Error with (OnoError[SyntaxError with Error]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error.
    *
    * @param error - The original error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def syntax(error: Error, message: String, params: js.Any*): SyntaxError with Error with (OnoError[SyntaxError with Error]) = js.native
  /**
    * Creates an error with a formatted message.
    *
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def syntax(message: String, params: js.Any*): SyntaxError with OnoError[SyntaxError] = js.native
  def syntax[P /* <: js.Object */](error: ErrorPOJO, props: P): SyntaxError with ErrorPOJO with P with (OnoError[SyntaxError with ErrorPOJO with P]) = js.native
  def syntax[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): SyntaxError with ErrorPOJO with P with (OnoError[SyntaxError with ErrorPOJO with P]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error,
    * as well as aditional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    */
  def syntax[P /* <: js.Object */](error: Error, props: P): SyntaxError with Error with P with (OnoError[SyntaxError with Error with P]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error,
    * as well as additional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def syntax[P /* <: js.Object */](error: Error, props: P, message: String, params: js.Any*): SyntaxError with Error with P with (OnoError[SyntaxError with Error with P]) = js.native
  /**
    * Creates an error with additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    */
  def syntax[P /* <: js.Object */](props: P): SyntaxError with P with (OnoError[SyntaxError with P]) = js.native
  /**
    * Creates an error with a formatted message and additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def syntax[P /* <: js.Object */](props: P, message: String, params: js.Any*): SyntaxError with P with (OnoError[SyntaxError with P]) = js.native
  def `type`(error: ErrorPOJO): TypeError with ErrorPOJO with (OnoError[TypeError with ErrorPOJO]) = js.native
  def `type`(error: ErrorPOJO, message: String, params: js.Any*): TypeError with ErrorPOJO with (OnoError[TypeError with ErrorPOJO]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error.
    *
    * @param error - The original error
    */
  def `type`(error: Error): TypeError with Error with (OnoError[TypeError with Error]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error.
    *
    * @param error - The original error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def `type`(error: Error, message: String, params: js.Any*): TypeError with Error with (OnoError[TypeError with Error]) = js.native
  /**
    * Creates an error with a formatted message.
    *
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def `type`(message: String, params: js.Any*): TypeError with OnoError[TypeError] = js.native
  def `type`[P /* <: js.Object */](error: ErrorPOJO, props: P): TypeError with ErrorPOJO with P with (OnoError[TypeError with ErrorPOJO with P]) = js.native
  def `type`[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): TypeError with ErrorPOJO with P with (OnoError[TypeError with ErrorPOJO with P]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error,
    * as well as aditional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    */
  def `type`[P /* <: js.Object */](error: Error, props: P): TypeError with Error with P with (OnoError[TypeError with Error with P]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error,
    * as well as additional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def `type`[P /* <: js.Object */](error: Error, props: P, message: String, params: js.Any*): TypeError with Error with P with (OnoError[TypeError with Error with P]) = js.native
  /**
    * Creates an error with additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    */
  def `type`[P /* <: js.Object */](props: P): TypeError with P with (OnoError[TypeError with P]) = js.native
  /**
    * Creates an error with a formatted message and additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def `type`[P /* <: js.Object */](props: P, message: String, params: js.Any*): TypeError with P with (OnoError[TypeError with P]) = js.native
  def uri(error: ErrorPOJO): URIError with ErrorPOJO with (OnoError[URIError with ErrorPOJO]) = js.native
  def uri(error: ErrorPOJO, message: String, params: js.Any*): URIError with ErrorPOJO with (OnoError[URIError with ErrorPOJO]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error.
    *
    * @param error - The original error
    */
  def uri(error: Error): URIError with Error with (OnoError[URIError with Error]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error.
    *
    * @param error - The original error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def uri(error: Error, message: String, params: js.Any*): URIError with Error with (OnoError[URIError with Error]) = js.native
  /**
    * Creates an error with a formatted message.
    *
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def uri(message: String, params: js.Any*): URIError with OnoError[URIError] = js.native
  def uri[P /* <: js.Object */](error: ErrorPOJO, props: P): URIError with ErrorPOJO with P with (OnoError[URIError with ErrorPOJO with P]) = js.native
  def uri[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): URIError with ErrorPOJO with P with (OnoError[URIError with ErrorPOJO with P]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error,
    * as well as aditional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    */
  def uri[P /* <: js.Object */](error: Error, props: P): URIError with Error with P with (OnoError[URIError with Error with P]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error,
    * as well as additional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def uri[P /* <: js.Object */](error: Error, props: P, message: String, params: js.Any*): URIError with Error with P with (OnoError[URIError with Error with P]) = js.native
  /**
    * Creates an error with additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    */
  def uri[P /* <: js.Object */](props: P): URIError with P with (OnoError[URIError with P]) = js.native
  /**
    * Creates an error with a formatted message and additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def uri[P /* <: js.Object */](props: P, message: String, params: js.Any*): URIError with P with (OnoError[URIError with P]) = js.native
}

