package typings
package polyfillDashServiceLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object polyfillDashServiceLibStrings {
  @js.native
  sealed trait always
    extends polyfillDashServiceLib.polyfillDashServiceMod.PolyfillFlag
  
  @js.native
  sealed trait gated
    extends polyfillDashServiceLib.polyfillDashServiceMod.PolyfillFlag
  
  @js.native
  sealed trait ignore
    extends polyfillDashServiceLib.polyfillDashServiceMod.Unknown
  
  @js.native
  sealed trait polyfill
    extends polyfillDashServiceLib.polyfillDashServiceMod.Unknown
  
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  @scala.inline
  def gated: gated = "gated".asInstanceOf[gated]
  @scala.inline
  def ignore: ignore = "ignore".asInstanceOf[ignore]
  @scala.inline
  def polyfill: polyfill = "polyfill".asInstanceOf[polyfill]
}

