package typings.atPhosphorDomutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/domutils/lib/platform", JSImport.Namespace)
@js.native
object libPlatformMod extends js.Object {
  @JSName("Platform")
  @js.native
  object PlatformNs extends js.Object {
    /**
      * A flag indicating whether the browser is Edge.
      */
    val IS_EDGE: Boolean = js.native
    /**
      * A flag indicating whether the browser is IE.
      */
    val IS_IE: Boolean = js.native
    /**
      * A flag indicating whether the platform is Mac.
      */
    val IS_MAC: Boolean = js.native
    /**
      * A flag indicating whether the platform is Windows.
      */
    val IS_WIN: Boolean = js.native
  }
  
}

