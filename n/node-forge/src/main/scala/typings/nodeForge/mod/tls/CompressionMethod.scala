package typings.nodeForge.mod.tls

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompressionMethod extends js.Object
@JSImport("node-forge", "tls.CompressionMethod")
@js.native
object CompressionMethod extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompressionMethod with Double] = js.native
  
  @js.native
  sealed trait deflate extends CompressionMethod
  /* 1 */ @js.native
  object deflate extends TopLevel[deflate with Double]
  
  @js.native
  sealed trait none extends CompressionMethod
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
}
