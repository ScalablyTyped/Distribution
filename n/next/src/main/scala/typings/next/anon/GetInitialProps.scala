package typings.next.anon

import typings.next.utilsMod.BaseContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInitialProps[C /* <: BaseContext */, IP] extends js.Object {
  /**
    * Used for initial page load data population. Data returned from `getInitialProps` is serialized when server rendered.
    * Make sure to return plain `Object` without using `Date`, `Map`, `Set`.
    * @param ctx Context of `page`
    */
  var getInitialProps: js.UndefOr[js.Function1[/* context */ C, IP | js.Promise[IP]]] = js.undefined
}

object GetInitialProps {
  @scala.inline
  def apply[C, IP](getInitialProps: /* context */ C => IP | js.Promise[IP] = null): GetInitialProps[C, IP] = {
    val __obj = js.Dynamic.literal()
    if (getInitialProps != null) __obj.updateDynamic("getInitialProps")(js.Any.fromFunction1(getInitialProps))
    __obj.asInstanceOf[GetInitialProps[C, IP]]
  }
}

