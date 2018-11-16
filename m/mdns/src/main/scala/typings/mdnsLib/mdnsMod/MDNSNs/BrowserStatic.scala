package typings
package mdnsLib.mdnsMod.MDNSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserStatic
  extends ScalablyTyped.runtime.Instantiable1[/* serviceType */ ServiceType, Browser]
     with ScalablyTyped.runtime.Instantiable2[/* serviceType */ ServiceType, /* options */ BrowserOptions, Browser] {
  var defaultResolverSequence: js.Array[
    js.Function2[/* service */ Service, /* next */ js.Function0[scala.Unit], scala.Boolean]
  ] = js.native
}

