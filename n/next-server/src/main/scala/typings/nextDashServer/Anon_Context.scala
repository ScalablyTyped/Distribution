package typings.nextDashServer

import typings.nextDashServer.distLibUtilsMod.BaseContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context[C /* <: BaseContext */, IP] extends js.Object {
  var getInitialProps: js.UndefOr[js.Function1[/* context */ C, IP | js.Promise[IP]]] = js.undefined
}

object Anon_Context {
  @scala.inline
  def apply[C /* <: BaseContext */, IP](getInitialProps: /* context */ C => IP | js.Promise[IP] = null): Anon_Context[C, IP] = {
    val __obj = js.Dynamic.literal()
    if (getInitialProps != null) __obj.updateDynamic("getInitialProps")(js.Any.fromFunction1(getInitialProps))
    __obj.asInstanceOf[Anon_Context[C, IP]]
  }
}

