package typings.openui5.sap.m

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
  
}

