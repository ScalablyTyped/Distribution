package typings.nodeDashForge.nodeDashForgeMod.tls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CompressionMethod extends js.Object

@JSImport("node-forge", "tls.CompressionMethod")
@js.native
object CompressionMethod extends js.Object {
  @js.native
  sealed trait deflate extends CompressionMethod
  
  @js.native
  sealed trait none extends CompressionMethod
  
  /* 1 */ val deflate: typings.nodeDashForge.nodeDashForgeMod.tls.CompressionMethod.deflate with Double = js.native
  /* 0 */ val none: typings.nodeDashForge.nodeDashForgeMod.tls.CompressionMethod.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompressionMethod with Double] = js.native
}

