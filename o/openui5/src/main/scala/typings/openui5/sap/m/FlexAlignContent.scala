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
  
}

