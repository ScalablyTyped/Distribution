package typings.openseadragon.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ControlAnchor extends js.Object

@JSImport("openseadragon", "ControlAnchor")
@js.native
object ControlAnchor extends js.Object {
  @js.native
  sealed trait ABSOLUTE extends ControlAnchor
  
  @js.native
  sealed trait BOTTOM_LEFT extends ControlAnchor
  
  @js.native
  sealed trait BOTTOM_RIGHT extends ControlAnchor
  
  @js.native
  sealed trait NONE extends ControlAnchor
  
  @js.native
  sealed trait TOP_LEFT extends ControlAnchor
  
  @js.native
  sealed trait TOP_RIGHT extends ControlAnchor
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ControlAnchor with Double] = js.native
  /* 5 */ @js.native
  object ABSOLUTE extends TopLevel[ABSOLUTE with Double]
  
  /* 3 */ @js.native
  object BOTTOM_LEFT extends TopLevel[BOTTOM_LEFT with Double]
  
  /* 4 */ @js.native
  object BOTTOM_RIGHT extends TopLevel[BOTTOM_RIGHT with Double]
  
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  /* 1 */ @js.native
  object TOP_LEFT extends TopLevel[TOP_LEFT with Double]
  
  /* 2 */ @js.native
  object TOP_RIGHT extends TopLevel[TOP_RIGHT with Double]
  
}

