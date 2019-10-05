package typings.openui5.sap.m

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
  
  /* 0 */ val Center: typings.openui5.sap.m.FlexAlignContent.Center with Double = js.native
  /* 1 */ val End: typings.openui5.sap.m.FlexAlignContent.End with Double = js.native
  /* 2 */ val Inherit: typings.openui5.sap.m.FlexAlignContent.Inherit with Double = js.native
  /* 3 */ val SpaceAround: typings.openui5.sap.m.FlexAlignContent.SpaceAround with Double = js.native
  /* 4 */ val SpaceBetween: typings.openui5.sap.m.FlexAlignContent.SpaceBetween with Double = js.native
  /* 5 */ val Start: typings.openui5.sap.m.FlexAlignContent.Start with Double = js.native
  /* 6 */ val Stretch: typings.openui5.sap.m.FlexAlignContent.Stretch with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FlexAlignContent with Double] = js.native
}

