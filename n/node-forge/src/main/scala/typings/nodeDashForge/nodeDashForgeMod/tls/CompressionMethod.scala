package typings.nodeDashForge.nodeDashForgeMod.tls

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompressionMethod with Double] = js.native
  /* 1 */ @js.native
  object deflate extends TopLevel[deflate with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

