package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlacementType extends StObject
@JSImport("sap/m/library", "PlacementType")
@js.native
object PlacementType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PlacementType & String] = js.native
  
  /**
    * Popover will be placed automatically at the reference control.
    */
  @js.native
  sealed trait Auto
    extends StObject
       with PlacementType
  /* "Auto" */ val Auto: typings.openui5.sapMLibraryMod.PlacementType.Auto & String = js.native
  
  /**
    * Popover will be placed at the bottom of the reference control.
    */
  @js.native
  sealed trait Bottom
    extends StObject
       with PlacementType
  /* "Bottom" */ val Bottom: typings.openui5.sapMLibraryMod.PlacementType.Bottom & String = js.native
  
  /**
    * Popover will be placed at the right or left side of the reference control.
    */
  @js.native
  sealed trait Horizontal
    extends StObject
       with PlacementType
  /* "Horizontal" */ val Horizontal: typings.openui5.sapMLibraryMod.PlacementType.Horizontal & String = js.native
  
  /**
    * @SINCE 1.29
    * @deprecated (since 1.36) - Instead, use `sap.m.PlacementType.HorizontalPreferredLeft` type.
    *
    * Deprecated - use `sap.m.PlacementType.HorizontalPreferredLeft` type.
    */
  @js.native
  sealed trait HorizontalPreferedLeft
    extends StObject
       with PlacementType
  /* "HorizontalPreferedLeft" */ val HorizontalPreferedLeft: typings.openui5.sapMLibraryMod.PlacementType.HorizontalPreferedLeft & String = js.native
  
  /**
    * @SINCE 1.29
    * @deprecated (since 1.36) - Instead, use `sap.m.PlacementType.HorizontalPreferredRight` type.
    *
    * Deprecated - use `sap.m.PlacementType.HorizontalPreferredRight` type.
    */
  @js.native
  sealed trait HorizontalPreferedRight
    extends StObject
       with PlacementType
  /* "HorizontalPreferedRight" */ val HorizontalPreferedRight: typings.openui5.sapMLibraryMod.PlacementType.HorizontalPreferedRight & String = js.native
  
  /**
    * @SINCE 1.36
    *
    * Popover will be placed at the right or left side of the reference control but will try to position on
    * the left side if the space is greater than the Popover's width.
    */
  @js.native
  sealed trait HorizontalPreferredLeft
    extends StObject
       with PlacementType
  /* "HorizontalPreferredLeft" */ val HorizontalPreferredLeft: typings.openui5.sapMLibraryMod.PlacementType.HorizontalPreferredLeft & String = js.native
  
  /**
    * @SINCE 1.36
    *
    * Popover will be placed at the right or left side of the reference control but will try to position on
    * the right side if the space is greater than the Popover's width.
    */
  @js.native
  sealed trait HorizontalPreferredRight
    extends StObject
       with PlacementType
  /* "HorizontalPreferredRight" */ val HorizontalPreferredRight: typings.openui5.sapMLibraryMod.PlacementType.HorizontalPreferredRight & String = js.native
  
  /**
    * Popover will be placed at the left side of the reference control.
    */
  @js.native
  sealed trait Left
    extends StObject
       with PlacementType
  /* "Left" */ val Left: typings.openui5.sapMLibraryMod.PlacementType.Left & String = js.native
  
  /**
    * @SINCE 1.38
    *
    * Popover will be placed to the bottom of the reference control. If the available space is less than the
    * Popover's height, it will appear to the top of the same reference control bottom border.
    */
  @js.native
  sealed trait PreferredBottomOrFlip
    extends StObject
       with PlacementType
  /* "PreferredBottomOrFlip" */ val PreferredBottomOrFlip: typings.openui5.sapMLibraryMod.PlacementType.PreferredBottomOrFlip & String = js.native
  
  /**
    * @SINCE 1.38
    *
    * Popover will be placed to the left of the reference control. If the available space is less than the
    * Popover's width, it will appear to the right of the same reference control left border.
    */
  @js.native
  sealed trait PreferredLeftOrFlip
    extends StObject
       with PlacementType
  /* "PreferredLeftOrFlip" */ val PreferredLeftOrFlip: typings.openui5.sapMLibraryMod.PlacementType.PreferredLeftOrFlip & String = js.native
  
  /**
    * @SINCE 1.38
    *
    * Popover will be placed to the right of the reference control. If the available space is less than the
    * Popover's width, it will appear to the left of the same reference control right border.
    */
  @js.native
  sealed trait PreferredRightOrFlip
    extends StObject
       with PlacementType
  /* "PreferredRightOrFlip" */ val PreferredRightOrFlip: typings.openui5.sapMLibraryMod.PlacementType.PreferredRightOrFlip & String = js.native
  
  /**
    * @SINCE 1.38
    *
    * Popover will be placed to the top of the reference control. If the available space is less than the Popover's
    * height, it will appear to the bottom of the same reference control top border.
    */
  @js.native
  sealed trait PreferredTopOrFlip
    extends StObject
       with PlacementType
  /* "PreferredTopOrFlip" */ val PreferredTopOrFlip: typings.openui5.sapMLibraryMod.PlacementType.PreferredTopOrFlip & String = js.native
  
  /**
    * Popover will be placed at the right side of the reference control.
    */
  @js.native
  sealed trait Right
    extends StObject
       with PlacementType
  /* "Right" */ val Right: typings.openui5.sapMLibraryMod.PlacementType.Right & String = js.native
  
  /**
    * Popover will be placed at the top of the reference control.
    */
  @js.native
  sealed trait Top
    extends StObject
       with PlacementType
  /* "Top" */ val Top: typings.openui5.sapMLibraryMod.PlacementType.Top & String = js.native
  
  /**
    * Popover will be placed at the top or bottom of the reference control.
    */
  @js.native
  sealed trait Vertical
    extends StObject
       with PlacementType
  /* "Vertical" */ val Vertical: typings.openui5.sapMLibraryMod.PlacementType.Vertical & String = js.native
  
  /**
    * @SINCE 1.29
    * @deprecated (since 1.36) - Instead, use `sap.m.PlacementType.VerticalPreferredBottom` type.
    *
    * Deprecated - use `sap.m.PlacementType.VerticalPreferredBottom` type.
    */
  @js.native
  sealed trait VerticalPreferedBottom
    extends StObject
       with PlacementType
  /* "VerticalPreferedBottom" */ val VerticalPreferedBottom: typings.openui5.sapMLibraryMod.PlacementType.VerticalPreferedBottom & String = js.native
  
  /**
    * @SINCE 1.29
    * @deprecated (since 1.36) - Instead, use `sap.m.PlacementType.VerticalPreferredTop` type.
    *
    * Deprecated - use `sap.m.PlacementType.VerticalPreferredTop` type.
    */
  @js.native
  sealed trait VerticalPreferedTop
    extends StObject
       with PlacementType
  /* "VerticalPreferedTop" */ val VerticalPreferedTop: typings.openui5.sapMLibraryMod.PlacementType.VerticalPreferedTop & String = js.native
  
  /**
    * @SINCE 1.36
    *
    * Popover will be placed at the top or bottom of the reference control but will try to position on the
    * bottom side if the space is greater than the Popover's height.
    */
  @js.native
  sealed trait VerticalPreferredBottom
    extends StObject
       with PlacementType
  /* "VerticalPreferredBottom" */ val VerticalPreferredBottom: typings.openui5.sapMLibraryMod.PlacementType.VerticalPreferredBottom & String = js.native
  
  /**
    * @SINCE 1.36
    *
    * Popover will be placed at the top or bottom of the reference control but will try to position on the
    * top side if the space is greater than the Popover's height.
    */
  @js.native
  sealed trait VerticalPreferredTop
    extends StObject
       with PlacementType
  /* "VerticalPreferredTop" */ val VerticalPreferredTop: typings.openui5.sapMLibraryMod.PlacementType.VerticalPreferredTop & String = js.native
}
