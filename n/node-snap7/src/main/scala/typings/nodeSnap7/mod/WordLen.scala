package typings.nodeSnap7.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WordLen extends StObject
@JSImport("node-snap7", "WordLen")
@js.native
object WordLen extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WordLen with Double] = js.native
  
  @js.native
  sealed trait S7WLBit extends WordLen
  /* 0x01 */ val S7WLBit: typings.nodeSnap7.mod.WordLen.S7WLBit with Double = js.native
  
  @js.native
  sealed trait S7WLByte extends WordLen
  /* 0x02 */ val S7WLByte: typings.nodeSnap7.mod.WordLen.S7WLByte with Double = js.native
  
  @js.native
  sealed trait S7WLCounter extends WordLen
  /* 0x1C */ val S7WLCounter: typings.nodeSnap7.mod.WordLen.S7WLCounter with Double = js.native
  
  @js.native
  sealed trait S7WLDWord extends WordLen
  /* 0x06 */ val S7WLDWord: typings.nodeSnap7.mod.WordLen.S7WLDWord with Double = js.native
  
  @js.native
  sealed trait S7WLReal extends WordLen
  /* 0x08 */ val S7WLReal: typings.nodeSnap7.mod.WordLen.S7WLReal with Double = js.native
  
  @js.native
  sealed trait S7WLTimer extends WordLen
  /* 0x1D */ val S7WLTimer: typings.nodeSnap7.mod.WordLen.S7WLTimer with Double = js.native
  
  @js.native
  sealed trait S7WLWord extends WordLen
  /* 0x04 */ val S7WLWord: typings.nodeSnap7.mod.WordLen.S7WLWord with Double = js.native
}
