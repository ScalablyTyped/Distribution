package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FlexAlignContent extends js.Object

/**
  * Available options for the layout of container lines along the cross axis of the flexbox layout.
  * <b>Note:</b> This property has no effect in Internet Explorer 10.
  */
@JSGlobal("sap.m.FlexAlignContent")
@js.native
object FlexAlignContent extends js.Object {
  @js.native
  sealed trait Center extends FlexAlignContent
  
  @js.native
  sealed trait End extends FlexAlignContent
  
  @js.native
  sealed trait Inherit extends FlexAlignContent
  
  @js.native
  sealed trait SpaceAround extends FlexAlignContent
  
  @js.native
  sealed trait SpaceBetween extends FlexAlignContent
  
  @js.native
  sealed trait Start extends FlexAlignContent
  
  @js.native
  sealed trait Stretch extends FlexAlignContent
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FlexAlignContent with Double] = js.native
  /* 0 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 1 */ @js.native
  object End extends TopLevel[End with Double]
  
  /* 2 */ @js.native
  object Inherit extends TopLevel[Inherit with Double]
  
  /* 3 */ @js.native
  object SpaceAround extends TopLevel[SpaceAround with Double]
  
  /* 4 */ @js.native
  object SpaceBetween extends TopLevel[SpaceBetween with Double]
  
  /* 5 */ @js.native
  object Start extends TopLevel[Start with Double]
  
  /* 6 */ @js.native
  object Stretch extends TopLevel[Stretch with Double]
  
}

