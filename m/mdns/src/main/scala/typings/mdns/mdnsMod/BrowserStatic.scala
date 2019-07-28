package typings.mdns.mdnsMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserStatic
  extends Instantiable1[/* serviceType */ ServiceType, Browser]
     with Instantiable2[/* serviceType */ ServiceType, /* options */ BrowserOptions, Browser] {
  var defaultResolverSequence: js.Array[js.Function2[/* service */ Service, /* next */ js.Function0[Unit], Boolean]] = js.native
}

