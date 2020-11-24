package typings.openseadragon.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Placement extends js.Object
@JSImport("openseadragon", "Placement")
@js.native
object Placement extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Placement with Double] = js.native
  
  @js.native
  sealed trait BOTTOM extends Placement
  /* 6 */ @js.native
  object BOTTOM extends TopLevel[BOTTOM with Double]
  
  @js.native
  sealed trait BOTTOM_LEFT extends Placement
  /* 7 */ @js.native
  object BOTTOM_LEFT extends TopLevel[BOTTOM_LEFT with Double]
  
  @js.native
  sealed trait BOTTOM_RIGHT extends Placement
  /* 5 */ @js.native
  object BOTTOM_RIGHT extends TopLevel[BOTTOM_RIGHT with Double]
  
  @js.native
  sealed trait CENTER extends Placement
  /* 0 */ @js.native
  object CENTER extends TopLevel[CENTER with Double]
  
  @js.native
  sealed trait LEFT extends Placement
  /* 8 */ @js.native
  object LEFT extends TopLevel[LEFT with Double]
  
  @js.native
  sealed trait RIGHT extends Placement
  /* 4 */ @js.native
  object RIGHT extends TopLevel[RIGHT with Double]
  
  @js.native
  sealed trait TOP extends Placement
  /* 2 */ @js.native
  object TOP extends TopLevel[TOP with Double]
  
  @js.native
  sealed trait TOP_LEFT extends Placement
  /* 1 */ @js.native
  object TOP_LEFT extends TopLevel[TOP_LEFT with Double]
  
  @js.native
  sealed trait TOP_RIGHT extends Placement
  /* 3 */ @js.native
  object TOP_RIGHT extends TopLevel[TOP_RIGHT with Double]
}
