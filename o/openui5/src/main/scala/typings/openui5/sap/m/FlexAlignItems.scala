package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FlexAlignItems extends js.Object

/**
  * Available options for the layout of all elements along the cross axis of the flexbox layout.
  */
@JSGlobal("sap.m.FlexAlignItems")
@js.native
object FlexAlignItems extends js.Object {
  @js.native
  sealed trait Baseline extends FlexAlignItems
  
  @js.native
  sealed trait Center extends FlexAlignItems
  
  @js.native
  sealed trait End extends FlexAlignItems
  
  @js.native
  sealed trait Inherit extends FlexAlignItems
  
  @js.native
  sealed trait Start extends FlexAlignItems
  
  @js.native
  sealed trait Stretch extends FlexAlignItems
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FlexAlignItems with Double] = js.native
  /* 0 */ @js.native
  object Baseline extends TopLevel[Baseline with Double]
  
  /* 1 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 2 */ @js.native
  object End extends TopLevel[End with Double]
  
  /* 3 */ @js.native
  object Inherit extends TopLevel[Inherit with Double]
  
  /* 4 */ @js.native
  object Start extends TopLevel[Start with Double]
  
  /* 5 */ @js.native
  object Stretch extends TopLevel[Stretch with Double]
  
}

