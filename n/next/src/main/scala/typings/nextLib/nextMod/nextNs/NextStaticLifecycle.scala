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
  var getInitialProps: js.UndefOr[js.Function1[/* ctx */ C, js.Promise[IP] | IP]] = js.undefined
}

object NextStaticLifecycle {
  @scala.inline
  def apply[IP, C](getInitialProps: js.Function1[/* ctx */ C, js.Promise[IP] | IP] = null): NextStaticLifecycle[IP, C] = {
    val __obj = js.Dynamic.literal()
    if (getInitialProps != null) __obj.updateDynamic("getInitialProps")(getInitialProps)
    __obj.asInstanceOf[NextStaticLifecycle[IP, C]]
  }
}

