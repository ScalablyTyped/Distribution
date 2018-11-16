package typings
package pngDashAsyncLib.pngDashAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EDeflateStrategy extends js.Object

@JSImport("png-async", "EDeflateStrategy")
@js.native
object EDeflateStrategy extends js.Object {
  @js.native
  sealed trait DEFAULT_STRATEGY
    extends pngDashAsyncLib.pngDashAsyncMod.EDeflateStrategy
  
  @js.native
  sealed trait FILTERED
    extends pngDashAsyncLib.pngDashAsyncMod.EDeflateStrategy
  
  @js.native
  sealed trait FIXED
    extends pngDashAsyncLib.pngDashAsyncMod.EDeflateStrategy
  
  @js.native
  sealed trait HUFFMAN_ONLY
    extends pngDashAsyncLib.pngDashAsyncMod.EDeflateStrategy
  
  @js.native
  sealed trait RLE
    extends pngDashAsyncLib.pngDashAsyncMod.EDeflateStrategy
  
  /* 0 */ val DEFAULT_STRATEGY: DEFAULT_STRATEGY with scala.Double = js.native
  /* 1 */ val FILTERED: FILTERED with scala.Double = js.native
  /* 4 */ val FIXED: FIXED with scala.Double = js.native
  /* 2 */ val HUFFMAN_ONLY: HUFFMAN_ONLY with scala.Double = js.native
  /* 3 */ val RLE: RLE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[pngDashAsyncLib.pngDashAsyncMod.EDeflateStrategy with scala.Double] = js.native
}

