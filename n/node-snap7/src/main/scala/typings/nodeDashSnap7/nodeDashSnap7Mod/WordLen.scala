package typings.nodeDashSnap7.nodeDashSnap7Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WordLen extends js.Object

@JSImport("node-snap7", "WordLen")
@js.native
object WordLen extends js.Object {
  @js.native
  sealed trait S7WLBit extends WordLen
  
  @js.native
  sealed trait S7WLByte extends WordLen
  
  @js.native
  sealed trait S7WLCounter extends WordLen
  
  @js.native
  sealed trait S7WLDWord extends WordLen
  
  @js.native
  sealed trait S7WLReal extends WordLen
  
  @js.native
  sealed trait S7WLTimer extends WordLen
  
  @js.native
  sealed trait S7WLWord extends WordLen
  
  /* 0x01 */ val S7WLBit: typings.nodeDashSnap7.nodeDashSnap7Mod.WordLen.S7WLBit with Double = js.native
  /* 0x02 */ val S7WLByte: typings.nodeDashSnap7.nodeDashSnap7Mod.WordLen.S7WLByte with Double = js.native
  /* 0x1C */ val S7WLCounter: typings.nodeDashSnap7.nodeDashSnap7Mod.WordLen.S7WLCounter with Double = js.native
  /* 0x06 */ val S7WLDWord: typings.nodeDashSnap7.nodeDashSnap7Mod.WordLen.S7WLDWord with Double = js.native
  /* 0x08 */ val S7WLReal: typings.nodeDashSnap7.nodeDashSnap7Mod.WordLen.S7WLReal with Double = js.native
  /* 0x1D */ val S7WLTimer: typings.nodeDashSnap7.nodeDashSnap7Mod.WordLen.S7WLTimer with Double = js.native
  /* 0x04 */ val S7WLWord: typings.nodeDashSnap7.nodeDashSnap7Mod.WordLen.S7WLWord with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WordLen with Double] = js.native
}

