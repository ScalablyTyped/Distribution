package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FlexAlignItems extends StObject
@JSImport("sap/m/library", "FlexAlignItems")
@js.native
object FlexAlignItems extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FlexAlignItems & String] = js.native
  
  /**
    * If the flex item`s inline axes are the same as the cross axis, this value is identical to "Start".
    *
    * Otherwise, it participates in baseline alignment: all participating box items on the line are aligned
    * such that their baselines align, and the item with the largest distance between its baseline and its
    * cross-start margin edge is placed flush against the cross-start edge of the line.
    */
  @js.native
  sealed trait Baseline
    extends StObject
       with FlexAlignItems
  /* "Baseline" */ val Baseline: typings.openui5.sapMLibraryMod.FlexAlignItems.Baseline & String = js.native
  
  /**
    * The flex item's margin boxes are centered in the cross axis within the line.
    */
  @js.native
  sealed trait Center
    extends StObject
       with FlexAlignItems
  /* "Center" */ val Center: typings.openui5.sapMLibraryMod.FlexAlignItems.Center & String = js.native
  
  /**
    * The cross-start margin edges of the flex items are placed flush with the cross-end edge of the line.
    */
  @js.native
  sealed trait End
    extends StObject
       with FlexAlignItems
  /* "End" */ val End: typings.openui5.sapMLibraryMod.FlexAlignItems.End & String = js.native
  
  /**
    * Inherits the value from its parent.
    */
  @js.native
  sealed trait Inherit
    extends StObject
       with FlexAlignItems
  /* "Inherit" */ val Inherit: typings.openui5.sapMLibraryMod.FlexAlignItems.Inherit & String = js.native
  
  /**
    * The cross-start margin edges of the flex items are placed flush with the cross-start edge of the line.
    */
  @js.native
  sealed trait Start
    extends StObject
       with FlexAlignItems
  /* "Start" */ val Start: typings.openui5.sapMLibraryMod.FlexAlignItems.Start & String = js.native
  
  /**
    * Make the cross size of the item's margin boxes as close to the same size as the line as possible.
    */
  @js.native
  sealed trait Stretch
    extends StObject
       with FlexAlignItems
  /* "Stretch" */ val Stretch: typings.openui5.sapMLibraryMod.FlexAlignItems.Stretch & String = js.native
}
