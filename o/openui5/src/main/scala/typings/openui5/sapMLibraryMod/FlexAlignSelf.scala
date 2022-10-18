package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FlexAlignSelf extends StObject
@JSImport("sap/m/library", "FlexAlignSelf")
@js.native
object FlexAlignSelf extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FlexAlignSelf & String] = js.native
  
  /**
    * Takes up the value of alignItems from the parent FlexBox
    */
  @js.native
  sealed trait Auto
    extends StObject
       with FlexAlignSelf
  /* "Auto" */ val Auto: typings.openui5.sapMLibraryMod.FlexAlignSelf.Auto & String = js.native
  
  /**
    * If the flex item's inline axis is the same as the cross axis, this value is identical to "Start".
    *
    * Otherwise, it participates in baseline alignment: all participating box items on the line are aligned
    * such that their baselines align, and the item with the largest distance between its baseline and its
    * cross-start margin edge is placed flush against the cross-start edge of the line.
    */
  @js.native
  sealed trait Baseline
    extends StObject
       with FlexAlignSelf
  /* "Baseline" */ val Baseline: typings.openui5.sapMLibraryMod.FlexAlignSelf.Baseline & String = js.native
  
  /**
    * The flex item's margin box is centered in the cross axis within the line.
    */
  @js.native
  sealed trait Center
    extends StObject
       with FlexAlignSelf
  /* "Center" */ val Center: typings.openui5.sapMLibraryMod.FlexAlignSelf.Center & String = js.native
  
  /**
    * The cross-start margin edges of the flex item is placed flush with the cross-end edge of the line.
    */
  @js.native
  sealed trait End
    extends StObject
       with FlexAlignSelf
  /* "End" */ val End: typings.openui5.sapMLibraryMod.FlexAlignSelf.End & String = js.native
  
  /**
    * Inherits the value from its parent.
    */
  @js.native
  sealed trait Inherit
    extends StObject
       with FlexAlignSelf
  /* "Inherit" */ val Inherit: typings.openui5.sapMLibraryMod.FlexAlignSelf.Inherit & String = js.native
  
  /**
    * The cross-start margin edges of the flex item is placed flush with the cross-start edge of the line.
    */
  @js.native
  sealed trait Start
    extends StObject
       with FlexAlignSelf
  /* "Start" */ val Start: typings.openui5.sapMLibraryMod.FlexAlignSelf.Start & String = js.native
  
  /**
    * Make the cross size of the item's margin box as close to the same size as the line as possible.
    */
  @js.native
  sealed trait Stretch
    extends StObject
       with FlexAlignSelf
  /* "Stretch" */ val Stretch: typings.openui5.sapMLibraryMod.FlexAlignSelf.Stretch & String = js.native
}
