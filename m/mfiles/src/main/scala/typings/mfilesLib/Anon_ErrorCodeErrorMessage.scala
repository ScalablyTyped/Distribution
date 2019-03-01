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
    Finally: js.Function0[scala.Unit] = null,
    OnError: js.Function3[
      /* errorCode */ scala.Double, 
      /* errorMessage */ java.lang.String, 
      /* errorStack */ java.lang.String, 
      scala.Unit
    ] = null,
    OnSuccess: js.Function0[scala.Unit] = null
  ): Anon_ErrorCodeErrorMessage = {
    val __obj = js.Dynamic.literal()
    if (Finally != null) __obj.updateDynamic("Finally")(Finally)
    if (OnError != null) __obj.updateDynamic("OnError")(OnError)
    if (OnSuccess != null) __obj.updateDynamic("OnSuccess")(OnSuccess)
    __obj.asInstanceOf[Anon_ErrorCodeErrorMessage]
  }
}

