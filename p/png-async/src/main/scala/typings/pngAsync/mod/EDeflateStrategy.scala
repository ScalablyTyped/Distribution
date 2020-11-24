package typings.pngAsync.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EDeflateStrategy extends js.Object
@JSImport("png-async", "EDeflateStrategy")
@js.native
object EDeflateStrategy extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDeflateStrategy with Double] = js.native
  
  @js.native
  sealed trait DEFAULT_STRATEGY extends EDeflateStrategy
  /* 0 */ @js.native
  object DEFAULT_STRATEGY extends TopLevel[DEFAULT_STRATEGY with Double]
  
  @js.native
  sealed trait FILTERED extends EDeflateStrategy
  /* 1 */ @js.native
  object FILTERED extends TopLevel[FILTERED with Double]
  
  @js.native
  sealed trait FIXED extends EDeflateStrategy
  /* 4 */ @js.native
  object FIXED extends TopLevel[FIXED with Double]
  
  @js.native
  sealed trait HUFFMAN_ONLY extends EDeflateStrategy
  /* 2 */ @js.native
  object HUFFMAN_ONLY extends TopLevel[HUFFMAN_ONLY with Double]
  
  @js.native
  sealed trait RLE extends EDeflateStrategy
  /* 3 */ @js.native
  object RLE extends TopLevel[RLE with Double]
}
