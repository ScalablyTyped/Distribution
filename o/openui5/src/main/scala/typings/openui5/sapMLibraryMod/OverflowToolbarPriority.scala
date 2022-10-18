package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OverflowToolbarPriority extends StObject
@JSImport("sap/m/library", "OverflowToolbarPriority")
@js.native
object OverflowToolbarPriority extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OverflowToolbarPriority & String] = js.native
  
  /**
    * @deprecated (since 1.48)
    *
    * Deprecated - Use `sap.m.OverflowToolbarPriority.AlwaysOverflow` instead
    */
  @js.native
  sealed trait Always
    extends StObject
       with OverflowToolbarPriority
  /* "Always" */ val Always: typings.openui5.sapMLibraryMod.OverflowToolbarPriority.Always & String = js.native
  
  /**
    * Forces `OverflowToolbar` items to remain always in the overflow area.
    */
  @js.native
  sealed trait AlwaysOverflow
    extends StObject
       with OverflowToolbarPriority
  /* "AlwaysOverflow" */ val AlwaysOverflow: typings.openui5.sapMLibraryMod.OverflowToolbarPriority.AlwaysOverflow & String = js.native
  
  /**
    * Items with priority `Disappear` overflow before the items with higher priority, such as `Low` and `High`,
    * and remain hidden in the overflow area.
    */
  @js.native
  sealed trait Disappear
    extends StObject
       with OverflowToolbarPriority
  /* "Disappear" */ val Disappear: typings.openui5.sapMLibraryMod.OverflowToolbarPriority.Disappear & String = js.native
  
  /**
    * Items with priority `High` overflow after the items with lower priority.
    */
  @js.native
  sealed trait High
    extends StObject
       with OverflowToolbarPriority
  /* "High" */ val High: typings.openui5.sapMLibraryMod.OverflowToolbarPriority.High & String = js.native
  
  /**
    * Items with priority `Low` overflow before the items with higher priority, such as `High` priority items.
    */
  @js.native
  sealed trait Low
    extends StObject
       with OverflowToolbarPriority
  /* "Low" */ val Low: typings.openui5.sapMLibraryMod.OverflowToolbarPriority.Low & String = js.native
  
  /**
    * @deprecated (since 1.48)
    *
    * Deprecated - Use `sap.m.OverflowToolbarPriority.NeverOverflow` instead.
    */
  @js.native
  sealed trait Never
    extends StObject
       with OverflowToolbarPriority
  /* "Never" */ val Never: typings.openui5.sapMLibraryMod.OverflowToolbarPriority.Never & String = js.native
  
  /**
    * Forces `OverflowToolbar` items to remain always in the toolbar.
    */
  @js.native
  sealed trait NeverOverflow
    extends StObject
       with OverflowToolbarPriority
  /* "NeverOverflow" */ val NeverOverflow: typings.openui5.sapMLibraryMod.OverflowToolbarPriority.NeverOverflow & String = js.native
}
