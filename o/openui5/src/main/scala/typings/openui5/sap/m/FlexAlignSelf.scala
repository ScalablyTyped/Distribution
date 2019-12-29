package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FlexAlignSelf extends js.Object

/**
  * Available options for the layout of individual elements along the cross axis of the flexbox layout
  * overriding the default alignment.
  */
@JSGlobal("sap.m.FlexAlignSelf")
@js.native
object FlexAlignSelf extends js.Object {
  @js.native
  sealed trait Auto extends FlexAlignSelf
  
  @js.native
  sealed trait Baseline extends FlexAlignSelf
  
  @js.native
  sealed trait Center extends FlexAlignSelf
  
  @js.native
  sealed trait End extends FlexAlignSelf
  
  @js.native
  sealed trait Inherit extends FlexAlignSelf
  
  @js.native
  sealed trait Start extends FlexAlignSelf
  
  @js.native
  sealed trait Stretch extends FlexAlignSelf
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FlexAlignSelf with Double] = js.native
  /* 0 */ @js.native
  object Auto extends TopLevel[Auto with Double]
  
  /* 1 */ @js.native
  object Baseline extends TopLevel[Baseline with Double]
  
  /* 2 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 3 */ @js.native
  object End extends TopLevel[End with Double]
  
  /* 4 */ @js.native
  object Inherit extends TopLevel[Inherit with Double]
  
  /* 5 */ @js.native
  object Start extends TopLevel[Start with Double]
  
  /* 6 */ @js.native
  object Stretch extends TopLevel[Stretch with Double]
  
}

