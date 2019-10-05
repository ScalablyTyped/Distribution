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
  
  /* 0 */ val Auto: typings.openui5.sap.m.FlexAlignSelf.Auto with Double = js.native
  /* 1 */ val Baseline: typings.openui5.sap.m.FlexAlignSelf.Baseline with Double = js.native
  /* 2 */ val Center: typings.openui5.sap.m.FlexAlignSelf.Center with Double = js.native
  /* 3 */ val End: typings.openui5.sap.m.FlexAlignSelf.End with Double = js.native
  /* 4 */ val Inherit: typings.openui5.sap.m.FlexAlignSelf.Inherit with Double = js.native
  /* 5 */ val Start: typings.openui5.sap.m.FlexAlignSelf.Start with Double = js.native
  /* 6 */ val Stretch: typings.openui5.sap.m.FlexAlignSelf.Stretch with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FlexAlignSelf with Double] = js.native
}

