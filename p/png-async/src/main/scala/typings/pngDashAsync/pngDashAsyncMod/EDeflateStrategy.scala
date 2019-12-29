package typings.pngDashAsync.pngDashAsyncMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EDeflateStrategy extends js.Object

@JSImport("png-async", "EDeflateStrategy")
@js.native
object EDeflateStrategy extends js.Object {
  @js.native
  sealed trait DEFAULT_STRATEGY extends EDeflateStrategy
  
  @js.native
  sealed trait FILTERED extends EDeflateStrategy
  
  @js.native
  sealed trait FIXED extends EDeflateStrategy
  
  @js.native
  sealed trait HUFFMAN_ONLY extends EDeflateStrategy
  
  @js.native
  sealed trait RLE extends EDeflateStrategy
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDeflateStrategy with Double] = js.native
  /* 0 */ @js.native
  object DEFAULT_STRATEGY extends TopLevel[DEFAULT_STRATEGY with Double]
  
  /* 1 */ @js.native
  object FILTERED extends TopLevel[FILTERED with Double]
  
  /* 4 */ @js.native
  object FIXED extends TopLevel[FIXED with Double]
  
  /* 2 */ @js.native
  object HUFFMAN_ONLY extends TopLevel[HUFFMAN_ONLY with Double]
  
  /* 3 */ @js.native
  object RLE extends TopLevel[RLE with Double]
  
}

