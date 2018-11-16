package typings
package nodeDashSnap7Lib.nodeDashSnap7Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WordLen extends js.Object

@JSImport("node-snap7", "WordLen")
@js.native
object WordLen extends js.Object {
  @js.native
  sealed trait S7WLBit
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.WordLen
  
  @js.native
  sealed trait S7WLByte
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.WordLen
  
  @js.native
  sealed trait S7WLCounter
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.WordLen
  
  @js.native
  sealed trait S7WLDWord
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.WordLen
  
  @js.native
  sealed trait S7WLReal
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.WordLen
  
  @js.native
  sealed trait S7WLTimer
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.WordLen
  
  @js.native
  sealed trait S7WLWord
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.WordLen
  
  /* 0x01 */ val S7WLBit: S7WLBit with scala.Double = js.native
  /* 0x02 */ val S7WLByte: S7WLByte with scala.Double = js.native
  /* 0x1C */ val S7WLCounter: S7WLCounter with scala.Double = js.native
  /* 0x06 */ val S7WLDWord: S7WLDWord with scala.Double = js.native
  /* 0x08 */ val S7WLReal: S7WLReal with scala.Double = js.native
  /* 0x1D */ val S7WLTimer: S7WLTimer with scala.Double = js.native
  /* 0x04 */ val S7WLWord: S7WLWord with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[nodeDashSnap7Lib.nodeDashSnap7Mod.WordLen with scala.Double] = js.native
}

