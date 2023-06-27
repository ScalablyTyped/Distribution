package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcP13nStateUtilMod {
  
  @JSImport("sap/ui/mdc/p13n/StateUtil", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with StateUtil
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/p13n/StateUtil", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and applies the necessary changes for a given control and state. **Note:**The changes are created
      * in the same order as the objects are passed into the state object attributes. For example, by adding
      * two objects into the `items` attribute of the `oState` object, the first entry is created, and the second
      * entry is created on top of the first change. The item state is applied for each provided object in the
      * given order in the array and uses the provided position. If no index or only an invalid index has been
      * provided, the item is added to the array after the last item in the affected control's item
      * aggregation. In addition the following attributes can be used to remove a state:
      *
      *
      * 	 - `filtered` - Set to `false` in the `filter` scope on condition level to remove one specific condition
      *     for the given key.
      * 	 - `sorted` - Set to `false` in the `sorters` scope to remove a sorter/code>.
      * 	 - `grouped` - Set to `false` in the `groupLevels` scope to remove a grouping.
      * 	 - `visible` - Set to `false` to remove an aggregation item.
      * 	 - `aggregated` - Set to `false` to remove an aggregation.
      *
      * **Note:**To improve the performance, you should avoid additional calls of the control’s delegate. To
      * do this, the `propertyInfo` property of the relevant control can be enriched with the properties used
      * in the provided state.
      *
      * @returns `Promise` that resolves after all changes have been applied
      */
    inline def applyExternalState(
      /**
      * The control that is used to create changes and to which changes are made
      */
    oControl: typings.openui5.sapUiMdcControlMod.default,
      /**
      * The state in which the control is represented
      */
    oState: js.Object
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyExternalState")(oControl.asInstanceOf[js.Any], oState.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    /**
      * Attaches an event handler to the `StateUtil`. The event handler may be fired every time a user triggers
      * a personalization change for a control instance during runtime.
      */
    inline def attachStateChange(/**
      * fnFunction The handler function to call when the event occurs
      */
    fnListener: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachStateChange")(fnListener.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Removes a previously attached state change event handler from the `StateUtil` class. The passed parameters
      * must match those used for registration with {@link StateUtil#attachChange} beforehand.
      */
    inline def detachStateChange(/**
      * fnFunction The handler function to detach from the event
      */
    fnListener: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detachStateChange")(fnListener.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Creates a delta between two states.
      *
      * @returns `Promise` that resolves after the current state has been diffed
      */
    inline def diffState(
      /**
      * The control instance implementing IxState
      */
    oControl: typings.openui5.sapUiMdcControlMod.default,
      /**
      * The prior state
      */
    oOldState: js.Object,
      /**
      * The new state
      */
    oNewState: js.Object
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffState")(oControl.asInstanceOf[js.Any], oOldState.asInstanceOf[js.Any], oNewState.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    /**
      * Retrieves the externalized state for a given control instance. The retrieved state is equivalent to the
      * `getCurrentState` API for the given control, after all necessary changes have been applied (for example,
      * variant appliance and `p13n, StateUtil` changes). After the returned `Promise` has been resolved, the
      * returned state is in sync with the according state object of the MDC control (for example, `filterConditions`
      * for the `FilterBar` control).
      *
      * @returns `Promise` that resolves after the current state has been retrieved
      */
    inline def retrieveExternalState(
      /**
      * The control instance implementing IxState to retrieve the externalized state
      */
    oControl: typings.openui5.sapUiMdcControlMod.default
    ): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("retrieveExternalState")(oControl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  }
  
  trait StateUtil extends StObject
}
