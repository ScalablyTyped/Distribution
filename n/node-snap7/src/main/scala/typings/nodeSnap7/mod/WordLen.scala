package typings.nodeSnap7.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WordLen extends js.Object
@JSImport("node-snap7", "WordLen")
@js.native
object WordLen extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WordLen with Double] = js.native
  
  @js.native
  sealed trait S7WLBit extends WordLen
  /* 0x01 */ @js.native
  object S7WLBit extends TopLevel[S7WLBit with Double]
  
  @js.native
  sealed trait S7WLByte extends WordLen
  /* 0x02 */ @js.native
  object S7WLByte extends TopLevel[S7WLByte with Double]
  
  @js.native
  sealed trait S7WLCounter extends WordLen
  /* 0x1C */ @js.native
  object S7WLCounter extends TopLevel[S7WLCounter with Double]
  
  @js.native
  sealed trait S7WLDWord extends WordLen
  /* 0x06 */ @js.native
  object S7WLDWord extends TopLevel[S7WLDWord with Double]
  
  @js.native
  sealed trait S7WLReal extends WordLen
  /* 0x08 */ @js.native
  object S7WLReal extends TopLevel[S7WLReal with Double]
  
  @js.native
  sealed trait S7WLTimer extends WordLen
  /* 0x1D */ @js.native
  object S7WLTimer extends TopLevel[S7WLTimer with Double]
  
  @js.native
  sealed trait S7WLWord extends WordLen
  /* 0x04 */ @js.native
  object S7WLWord extends TopLevel[S7WLWord with Double]
}
