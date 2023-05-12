package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverflowToolbarConfig extends StObject {
  
  /**
    * An array of strings, listing all of the control's events that should trigger the closing of the overflow
    * menu, when fired.
    */
  var autoCloseEvents: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A boolean that tells whether the control can move to the overflow menu or not. **Note:** Even if `canOverflow`
    * is set to `false`, the `propsUnrelatedToSize` field is taken into account, allowing to optimize the behavior
    * of controls that do not need to overflow, but are used in an `sap.m.OverflowToolbar` regardless.
    */
  var canOverflow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A function that, if provided, will be called to determine the priority of the control. This function
    * must return a value of type `sap.m.OverflowToolbarPriority`. The string "Medium" is also accepted and
    * interpreted as priority between `Low` and `High`. **Note:** Normally priority in `sap.m.OverflowToolbar`
    * is managed with the `priority` property of `sap.m.OverflowToolbarLayoutData`. However, some controls
    * may have other means of defining priority, such as dedicated properties or other types of layout data
    * for that purpose. In summary, implementing this function allows a control to override the default priority
    * logic (`sap.m.OverflowToolbarLayoutData`) by providing its own.
    */
  var getCustomImportance: js.UndefOr[js.Function] = js.undefined
  
  /**
    * An array of strings, listing all of the control's events that should trigger the invalidation of the
    * `sap.m.OverflowToolbar`, when fired. **Note:** By default `sap.m.OverflowToolbar` invalidates whenever
    * any property of a child control changes. This is to ensure that whenever the size of a child control
    * changes, the overflow toolbar's layout is recalculated. Some properties however do not affect control
    * size, making it unnecessary to invalidate the overflow toolbar when they change. You can list them here
    * for optimization purposes.
    */
  var invalidationEvents: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A callback function that will be invoked after taking the control out of the overflow menu (before moving
    * it back to the toolbar itself). The control instance will be passed as an argument. **Note:** See: `onBeforeEnterOverflow`
    * for details about the function's context.
    */
  var onAfterExitOverflow: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A callback function that will be invoked before moving the control into the overflow menu. The control
    * instance will be passed as an argument. **Note:** The context of the function is not the control instance
    * (use the `oControl` parameter for this purpose), but rather an internal helper object, associated with
    * the current `sap.m.OverflowToolbar` instance. This object only needs to be manipulated in special cases
    * (e.g. when you want to store state on it, rather than on the control instance).
    */
  var onBeforeEnterOverflow: js.UndefOr[js.Function] = js.undefined
  
  /**
    * An array of strings, listing all of the control's properties that, when changed, should not cause the
    * overflow toolbar to invalidate.
    */
  var propsUnrelatedToSize: js.UndefOr[js.Array[String]] = js.undefined
}
object OverflowToolbarConfig {
  
  inline def apply(): OverflowToolbarConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverflowToolbarConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OverflowToolbarConfig] (val x: Self) extends AnyVal {
    
    inline def setAutoCloseEvents(value: js.Array[String]): Self = StObject.set(x, "autoCloseEvents", value.asInstanceOf[js.Any])
    
    inline def setAutoCloseEventsUndefined: Self = StObject.set(x, "autoCloseEvents", js.undefined)
    
    inline def setAutoCloseEventsVarargs(value: String*): Self = StObject.set(x, "autoCloseEvents", js.Array(value*))
    
    inline def setCanOverflow(value: Boolean): Self = StObject.set(x, "canOverflow", value.asInstanceOf[js.Any])
    
    inline def setCanOverflowUndefined: Self = StObject.set(x, "canOverflow", js.undefined)
    
    inline def setGetCustomImportance(value: js.Function): Self = StObject.set(x, "getCustomImportance", value.asInstanceOf[js.Any])
    
    inline def setGetCustomImportanceUndefined: Self = StObject.set(x, "getCustomImportance", js.undefined)
    
    inline def setInvalidationEvents(value: js.Array[String]): Self = StObject.set(x, "invalidationEvents", value.asInstanceOf[js.Any])
    
    inline def setInvalidationEventsUndefined: Self = StObject.set(x, "invalidationEvents", js.undefined)
    
    inline def setInvalidationEventsVarargs(value: String*): Self = StObject.set(x, "invalidationEvents", js.Array(value*))
    
    inline def setOnAfterExitOverflow(value: js.Function): Self = StObject.set(x, "onAfterExitOverflow", value.asInstanceOf[js.Any])
    
    inline def setOnAfterExitOverflowUndefined: Self = StObject.set(x, "onAfterExitOverflow", js.undefined)
    
    inline def setOnBeforeEnterOverflow(value: js.Function): Self = StObject.set(x, "onBeforeEnterOverflow", value.asInstanceOf[js.Any])
    
    inline def setOnBeforeEnterOverflowUndefined: Self = StObject.set(x, "onBeforeEnterOverflow", js.undefined)
    
    inline def setPropsUnrelatedToSize(value: js.Array[String]): Self = StObject.set(x, "propsUnrelatedToSize", value.asInstanceOf[js.Any])
    
    inline def setPropsUnrelatedToSizeUndefined: Self = StObject.set(x, "propsUnrelatedToSize", js.undefined)
    
    inline def setPropsUnrelatedToSizeVarargs(value: String*): Self = StObject.set(x, "propsUnrelatedToSize", js.Array(value*))
  }
}
