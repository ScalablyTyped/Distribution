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

