package typings.openui5

import typings.openui5.anon.Status
import typings.openui5.anon.StatusFilterBarValidationStatus
import typings.openui5.sapUiMdcEnumsFilterBarValidationStatusMod.FilterBarValidationStatus
import typings.openui5.sapUiMdcLibraryMod.filterbar.PropertyInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcFilterBarDelegateMod {
  
  @JSImport("sap/ui/mdc/FilterBarDelegate", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with FilterBarDelegate
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/FilterBarDelegate", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This method is called during the appliance of the add condition change. The intention is to update the
      * {@link sap.ui.mdc.FilterBar#propertyInfo} property.
      *
      * @returns `Promise` that is resolved once the propertyInfo property has been updated
      */
    inline def addCondition(
      /**
      * The name of a property
      */
    sPropertyName: String,
      /**
      * The instance of a filter bar
      */
    oControl: typings.openui5.sapUiMdcControlMod.default,
      /**
      * Instance of a property bag from the SAPUI5 flexibility change API
      */
    mPropertyBag: js.Object
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("addCondition")(sPropertyName.asInstanceOf[js.Any], oControl.asInstanceOf[js.Any], mPropertyBag.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    /**
      * Creates an instance of a filter field control. **Note:** The `addItem` hook can be used during the processing
      * of an SAPUI5 flexibility change. Consequently the parameter `mPropertyBag` is only passed during preprocessing.
      * In runtime scenarios (such as opening a personalization dialog), this method might be called without
      * the parameter `mPropertyBag`.
      *
      * @returns `Promise` that resolves with an instance of the implementing {@link sap.ui.mdc.FilterField Control}.
      * **Note:** This method always requires a return value once it has been called. If an item for a given
      * property `sPropertyName` has already been created, it must to either return the existing instance or
      * create a new instance.
      */
    inline def addItem(
      /**
      * The name of the property info object/JSON
      */
    sPropertyName: String,
      /**
      * Instance of an `sap.ui.mdc.Control`
      */
    oControl: typings.openui5.sapUiMdcControlMod.default
    ): js.Promise[typings.openui5.sapUiMdcFilterFieldMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("addItem")(sPropertyName.asInstanceOf[js.Any], oControl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.openui5.sapUiMdcFilterFieldMod.default]]
    inline def addItem(
      /**
      * The name of the property info object/JSON
      */
    sPropertyName: String,
      /**
      * Instance of an `sap.ui.mdc.Control`
      */
    oControl: typings.openui5.sapUiMdcControlMod.default,
      /**
      * Instance of property bag from SAPUI5 flexibility change API
      */
    mPropertyBag: js.Object
    ): js.Promise[typings.openui5.sapUiMdcFilterFieldMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("addItem")(sPropertyName.asInstanceOf[js.Any], oControl.asInstanceOf[js.Any], mPropertyBag.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.openui5.sapUiMdcFilterFieldMod.default]]
    
    /**
      * This method is called when the Clear button is pressed.
      *
      * @returns `Promise` that is resolved once the action has been completed
      */
    inline def clearFilters(/**
      * The instance of a filter bar
      */
    oControl: typings.openui5.sapUiMdcControlMod.default): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearFilters")(oControl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    
    /**
      * A validator to evaluate the filter bar state.
      *
      * @returns The inner filter bar state
      */
    inline def determineValidationState(
      /**
      * Instance of an `sap.ui.mdc.FilterBar`
      */
    oFilterBar: typings.openui5.sapUiMdcFilterBarMod.default
    ): FilterBarValidationStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("determineValidationState")(oFilterBar.asInstanceOf[js.Any]).asInstanceOf[FilterBarValidationStatus]
    inline def determineValidationState(
      /**
      * Instance of an `sap.ui.mdc.FilterBar`
      */
    oFilterBar: typings.openui5.sapUiMdcFilterBarMod.default,
      /**
      * Object describing the validation result. This object is only provided when called from the {@link sap.ui.mdc.FilterBar FilterBar}
      */
    mValidation: Status
    ): FilterBarValidationStatus = (^.asInstanceOf[js.Dynamic].applyDynamic("determineValidationState")(oFilterBar.asInstanceOf[js.Any], mValidation.asInstanceOf[js.Any])).asInstanceOf[FilterBarValidationStatus]
    
    /**
      * Retrieves the relevant metadata for a given payload and returns the property info array.
      *
      * @returns Once resolved, an array of property info objects is returned
      */
    inline def fetchProperties(
      /**
      * Instance of an `sap.ui.mdc.Control`
      */
    oControl: typings.openui5.sapUiMdcControlMod.default
    ): js.Promise[js.Array[PropertyInfo]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchProperties")(oControl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[PropertyInfo]]]
    
    /**
      * This method is called during the appliance of the remove condition change. The intention is to update
      * the {@link sap.ui.mdc.FilterBar#propertyInfo} property.
      *
      * @returns `Promise` that is resolved once the propertyInfo property has been updated
      */
    inline def removeCondition(
      /**
      * The name of a property
      */
    sPropertyName: String,
      /**
      * The instance of a filter bar
      */
    oControl: typings.openui5.sapUiMdcControlMod.default,
      /**
      * Instance of a property bag from the SAPUI5 flexibility change API
      */
    mPropertyBag: js.Object
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeCondition")(sPropertyName.asInstanceOf[js.Any], oControl.asInstanceOf[js.Any], mPropertyBag.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    /**
      * Triggers any necessary follow-up steps that need to be taken after the removal of created items via `removeItem`.
      * The returned Boolean value inside the `Promise` can be used to prevent the default follow-up behavior
      * of the SAPUI5 flexibility handling.
      *
      * **Note:**The `removeItem` hook can be used during the processing of an SAPUI5 flexibility change. Consequently
      * the parameter `mPropertyBag` is only passed during preprocessing. In runtime scenarios (such as opening
      * a personalization dialog), this method can be called without the parameter `mPropertyBag`.
      *
      * @returns `Promise` that resolved with `true`, `false` to allow/prevent default behavior of the change
      */
    inline def removeItem(
      /**
      * The control instance that was removed
      */
    oItem: typings.openui5.sapUiCoreControlMod.default,
      /**
      * Instance of an `sap.ui.mdc.Control`
      */
    oControl: typings.openui5.sapUiMdcControlMod.default
    ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeItem")(oItem.asInstanceOf[js.Any], oControl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def removeItem(
      /**
      * The control instance that was removed
      */
    oItem: typings.openui5.sapUiCoreControlMod.default,
      /**
      * Instance of an `sap.ui.mdc.Control`
      */
    oControl: typings.openui5.sapUiMdcControlMod.default,
      /**
      * Instance of property bag from SAPUI5 flexibility
      */
    mPropertyBag: js.Object
    ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeItem")(oItem.asInstanceOf[js.Any], oControl.asInstanceOf[js.Any], mPropertyBag.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
    /**
      * Visualizes the filter bar validation state.
      */
    inline def visualizeValidationState(
      /**
      * Instance of an `sap.ui.mdc.FilterBar`
      */
    oFilterBar: typings.openui5.sapUiMdcFilterBarMod.default,
      /**
      * Describes the validation result. This object is only provided when called from the {@link sap.ui.mdc.FilterBar FilterBar}
      */
    mValidation: StatusFilterBarValidationStatus
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visualizeValidationState")(oFilterBar.asInstanceOf[js.Any], mValidation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  trait FilterBarDelegate extends StObject
}
