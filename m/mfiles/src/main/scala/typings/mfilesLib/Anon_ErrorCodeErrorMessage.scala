package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorCodeErrorMessage extends js.Object {
  var Finally: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var OnError: js.UndefOr[
    js.Function3[
      /* errorCode */ scala.Double, 
      /* errorMessage */ java.lang.String, 
      /* errorStack */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var OnSuccess: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object Anon_ErrorCodeErrorMessage {
  @scala.inline
  def apply(
    Finally: () => scala.Unit = null,
    OnError: (/* errorCode */ scala.Double, /* errorMessage */ java.lang.String, /* errorStack */ java.lang.String) => scala.Unit = null,
    OnSuccess: () => scala.Unit = null
  ): Anon_ErrorCodeErrorMessage = {
    val __obj = js.Dynamic.literal()
    if (Finally != null) __obj.updateDynamic("Finally")(js.Any.fromFunction0(Finally))
    if (OnError != null) __obj.updateDynamic("OnError")(js.Any.fromFunction3(OnError))
    if (OnSuccess != null) __obj.updateDynamic("OnSuccess")(js.Any.fromFunction0(OnSuccess))
    __obj.asInstanceOf[Anon_ErrorCodeErrorMessage]
  }
}

