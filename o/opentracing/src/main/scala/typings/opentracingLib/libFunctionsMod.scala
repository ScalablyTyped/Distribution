package typings
package opentracingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing/lib/functions", JSImport.Namespace)
@js.native
object libFunctionsMod extends js.Object {
  def childOf(
    spanContext: opentracingLib.libSpanUnderscoreContextMod.default | opentracingLib.libSpanMod.default
  ): opentracingLib.libReferenceMod.default = js.native
  def followsFrom(spanContext: opentracingLib.libSpanUnderscoreContextMod.default): opentracingLib.libReferenceMod.default = js.native
}

