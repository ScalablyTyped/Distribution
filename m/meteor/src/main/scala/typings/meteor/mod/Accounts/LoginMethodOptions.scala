package typings.meteor.mod.Accounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginMethodOptions extends js.Object {
  /**
    * The arguments for the method
    */
  var methodArguments: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The method to call (default 'login')
    */
  var methodName: js.UndefOr[String] = js.undefined
  /**
    * Will be called with no arguments once the user is fully
    * logged in, or with the error on error.
    */
  var userCallback: js.UndefOr[js.Function1[/* err */ js.UndefOr[js.Any], Unit]] = js.undefined
  /**
    * If provided, will be called with the result of the
    * method. If it throws, the client will not be logged in (and
    * its error will be passed to the callback).
    */
  var validateResult: js.UndefOr[js.Function] = js.undefined
}

object LoginMethodOptions {
  @scala.inline
  def apply(
    methodArguments: js.Array[_] = null,
    methodName: String = null,
    userCallback: /* err */ js.UndefOr[js.Any] => Unit = null,
    validateResult: js.Function = null
  ): LoginMethodOptions = {
    val __obj = js.Dynamic.literal()
    if (methodArguments != null) __obj.updateDynamic("methodArguments")(methodArguments.asInstanceOf[js.Any])
    if (methodName != null) __obj.updateDynamic("methodName")(methodName.asInstanceOf[js.Any])
    if (userCallback != null) __obj.updateDynamic("userCallback")(js.Any.fromFunction1(userCallback))
    if (validateResult != null) __obj.updateDynamic("validateResult")(validateResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginMethodOptions]
  }
}

