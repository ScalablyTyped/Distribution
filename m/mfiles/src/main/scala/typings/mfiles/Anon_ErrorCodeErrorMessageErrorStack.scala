package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorCodeErrorMessageErrorStack extends js.Object {
  var Finally: js.UndefOr[js.Function0[Unit]] = js.undefined
  var OnError: js.UndefOr[
    js.Function3[/* errorCode */ Double, /* errorMessage */ String, /* errorStack */ String, Unit]
  ] = js.undefined
  var OnSuccess: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.undefined
}

object Anon_ErrorCodeErrorMessageErrorStack {
  @scala.inline
  def apply(
    Finally: () => Unit = null,
    OnError: (/* errorCode */ Double, /* errorMessage */ String, /* errorStack */ String) => Unit = null,
    OnSuccess: /* objectVersion */ IObjectVersion => Unit = null
  ): Anon_ErrorCodeErrorMessageErrorStack = {
    val __obj = js.Dynamic.literal()
    if (Finally != null) __obj.updateDynamic("Finally")(js.Any.fromFunction0(Finally))
    if (OnError != null) __obj.updateDynamic("OnError")(js.Any.fromFunction3(OnError))
    if (OnSuccess != null) __obj.updateDynamic("OnSuccess")(js.Any.fromFunction1(OnSuccess))
    __obj.asInstanceOf[Anon_ErrorCodeErrorMessageErrorStack]
  }
}

