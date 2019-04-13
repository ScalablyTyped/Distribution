package typings
package mdnsLib.mdnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserStatic
  extends org.scalablytyped.runtime.Instantiable1[/* serviceType */ ServiceType, Browser]
     with org.scalablytyped.runtime.Instantiable2[/* serviceType */ ServiceType, /* options */ BrowserOptions, Browser] {
  var defaultResolverSequence: js.Array[
    js.Function2[/* service */ Service, /* next */ js.Function0[scala.Unit], scala.Boolean]
  ] = js.native
}

