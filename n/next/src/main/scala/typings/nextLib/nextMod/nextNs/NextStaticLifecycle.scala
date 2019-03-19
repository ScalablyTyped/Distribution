package typings
package nextLib.nextMod.nextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Next.js specific lifecycle methods.
  *
  * @template IP Initial props returned from getInitialProps and passed to the component.
  * @template C Context passed to getInitialProps.
  */
trait NextStaticLifecycle[IP, C] extends js.Object {
  var getInitialProps: js.UndefOr[GetInitialProps[IP, C]] = js.undefined
}

object NextStaticLifecycle {
  @scala.inline
  def apply[IP, C](getInitialProps: GetInitialProps[IP, C] = null): NextStaticLifecycle[IP, C] = {
    val __obj = js.Dynamic.literal()
    if (getInitialProps != null) __obj.updateDynamic("getInitialProps")(getInitialProps)
    __obj.asInstanceOf[NextStaticLifecycle[IP, C]]
  }
}

