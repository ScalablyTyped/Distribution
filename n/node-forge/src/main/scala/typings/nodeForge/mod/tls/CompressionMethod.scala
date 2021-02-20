package typings.nodeForge.mod.tls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompressionMethod extends StObject
@JSImport("node-forge", "tls.CompressionMethod")
@js.native
object CompressionMethod extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompressionMethod with Double] = js.native
  
  @js.native
  sealed trait deflate extends CompressionMethod
  /* 1 */ val deflate: typings.nodeForge.mod.tls.CompressionMethod.deflate with Double = js.native
  
  @js.native
  sealed trait none extends CompressionMethod
  /* 0 */ val none: typings.nodeForge.mod.tls.CompressionMethod.none with Double = js.native
}
