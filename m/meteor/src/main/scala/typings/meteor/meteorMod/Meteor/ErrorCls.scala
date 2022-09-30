package typings.meteor.meteorMod.Meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("meteor/meteor", "Meteor.Error")
@js.native
open class ErrorCls protected ()
  extends StObject
     with Error {
  /**
    * @param error A string code uniquely identifying this kind of error.
    * This string should be used by callers of the method to determine the
    * appropriate action to take, instead of attempting to parse the reason
    * or details fields. For example:
    *
    * ```
    * // on the server, pick a code unique to this error
    * // the reason field should be a useful debug message
    * throw new Meteor.Error("logged-out",
    *   "The user must be logged in to post a comment.");
    *
    * // on the client
    * Meteor.call("methodName", function (error) {
    *   // identify the error
    *   if (error && error.error === "logged-out") {
    *     // show a nice error message
    *     Session.set("errorMessage", "Please log in to post a comment.");
    *   }
    * });
    * ```
    *
    * For legacy reasons, some built-in Meteor functions such as `check` throw
    * errors with a number in this field.
    *
    * @param reason Optional. A short human-readable summary of the
    * error, like 'Not Found'.
    * @param details Optional. Additional information about the error,
    * like a textual stack trace.
    */
  def this(error: String) = this()
  def this(error: Double) = this()
  def this(error: String, reason: String) = this()
  def this(error: Double, reason: String) = this()
  def this(error: String, reason: String, details: String) = this()
  def this(error: String, reason: Unit, details: String) = this()
  def this(error: Double, reason: String, details: String) = this()
  def this(error: Double, reason: Unit, details: String) = this()
  
  /* CompleteClass */
  var error: String | Double = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
}
