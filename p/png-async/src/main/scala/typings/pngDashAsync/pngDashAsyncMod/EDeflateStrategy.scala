package typings.pngDashAsync.pngDashAsyncMod

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
  
  /* 0 */ val DEFAULT_STRATEGY: typings.pngDashAsync.pngDashAsyncMod.EDeflateStrategy.DEFAULT_STRATEGY with Double = js.native
  /* 1 */ val FILTERED: typings.pngDashAsync.pngDashAsyncMod.EDeflateStrategy.FILTERED with Double = js.native
  /* 4 */ val FIXED: typings.pngDashAsync.pngDashAsyncMod.EDeflateStrategy.FIXED with Double = js.native
  /* 2 */ val HUFFMAN_ONLY: typings.pngDashAsync.pngDashAsyncMod.EDeflateStrategy.HUFFMAN_ONLY with Double = js.native
  /* 3 */ val RLE: typings.pngDashAsync.pngDashAsyncMod.EDeflateStrategy.RLE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDeflateStrategy with Double] = js.native
}

