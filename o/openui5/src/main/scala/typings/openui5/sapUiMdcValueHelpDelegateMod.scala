package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.anon.BindingContext
import typings.openui5.anon.Conditions
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiMdcConditionConditionMod.ConditionObject
import typings.openui5.sapUiMdcEnumsValueHelpPropagationReasonMod.ValueHelpPropagationReason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcValueHelpDelegateMod extends Shortcut {
  
  @JSImport("sap/ui/mdc/ValueHelpDelegate", JSImport.Default)
  @js.native
  val default: ValueHelpDelegate = js.native
  
  /**
    * @since 1.95.0
    *
    * Delegate for {@link sap.ui.mdc.ValueHelp ValueHelp}.
    *  **Note:** The class is experimental and the API/behavior is not finalized and hence this should not
    * be used for productive usage.
    */
  @js.native
  trait ValueHelpDelegate extends StObject {
    
    /**
      * Checks if the `ListBinding` is waiting for an update. As long as the context has not been set for `ListBinding`,
      * `ValueHelp` needs to wait.
      *
      * @returns `Promise` that is resolved once `ListBinding` has been updated
      */
    def checkListBindingPending(
      /**
      * The `ValueHelp` control instance
      */
    oValueHelp: typings.openui5.sapUiMdcValueHelpMod.default,
      /**
      * `ListBinding` to check
      */
    oListBinding: typings.openui5.sapUiModelListBindingMod.default,
      /**
      * Number of requested items
      */
    iRequestedItems: int
    ): Boolean | js.Promise[Boolean] = js.native
    
    /**
      * @since 1.101.0
      *
      * Provides the possibility to convey custom data in conditions. This enables an application to enhance
      * conditions with data relevant for combined key or outparameter scenarios.
      *
      * @returns Optionally returns a serializeable object to be stored in the condition payload field.
      */
    def createConditionPayload(
      /**
      * The `ValueHelp` control instance
      */
    oValueHelp: typings.openui5.sapUiMdcValueHelpMod.default,
      /**
      * `ValueHelp` content instance
      */
    oContent: typings.openui5.sapUiMdcValuehelpBaseFilterableListContentMod.default,
      /**
      * key, description pair for the condition which is to be created.
      */
    aValues: js.Array[Any]
    ): js.UndefOr[js.Object] = js.native
    def createConditionPayload(
      /**
      * The `ValueHelp` control instance
      */
    oValueHelp: typings.openui5.sapUiMdcValueHelpMod.default,
      /**
      * `ValueHelp` content instance
      */
    oContent: typings.openui5.sapUiMdcValuehelpBaseFilterableListContentMod.default,
      /**
      * key, description pair for the condition which is to be created.
      */
    aValues: js.Array[Any],
      /**
      * optional additional context
      */
    oContext: typings.openui5.sapUiModelContextMod.default
    ): js.UndefOr[js.Object] = js.native
    
    /**
      * Executes a filter in a `ListBinding`.
      *
      * @returns Promise that is resolved if search is executed
      */
    def executeFilter(
      /**
      * The `ValueHelp` control instance
      */
    oValueHelp: typings.openui5.sapUiMdcValueHelpMod.default,
      /**
      * List binding
      */
    oListBinding: typings.openui5.sapUiModelListBindingMod.default,
      /**
      * Number of requested items
      */
    iRequestedItems: int
    ): js.Promise[typings.openui5.sapUiModelListBindingMod.default] = js.native
    
    /**
      * @since 1.106.0
      *
      * This method should provide a map of conditions for the following situations: 1. Initial set of conditions
      * applied everytime a value help content is shown for the first time since opening it's container. 2. Detailed
      * set of conditions in getItemForValue scenarios allowing to find a specific ValueHelpItem (indicated by
      * oConfig availability)
      *
      * @returns Returns a map of conditions
      */
    def getFilterConditions(
      /**
      * The `ValueHelp` control instance
      */
    oValueHelp: typings.openui5.sapUiMdcValueHelpMod.default,
      /**
      * `ValueHelp` content instance
      */
    oContent: typings.openui5.sapUiMdcValuehelpBaseFilterableListContentMod.default
    ): js.Promise[js.Object] | js.Object = js.native
    def getFilterConditions(
      /**
      * The `ValueHelp` control instance
      */
    oValueHelp: typings.openui5.sapUiMdcValueHelpMod.default,
      /**
      * `ValueHelp` content instance
      */
    oContent: typings.openui5.sapUiMdcValuehelpBaseFilterableListContentMod.default,
      /**
      * Configuration
      */
    oConfig: BindingContext
    ): js.Promise[js.Object] | js.Object = js.native
    
    /**
      * @since 1.101.0
      *
      * Provides type information for listcontent filtering
      *
      * @returns Returns a type map for property paths
      */
    def getTypesForConditions(
      /**
      * The `ValueHelp` control instance
      */
    oValueHelp: typings.openui5.sapUiMdcValueHelpMod.default,
      /**
      * `ValueHelp` content instance
      */
    oContent: typings.openui5.sapUiMdcValuehelpBaseFilterableListContentMod.default,
      /**
      * set of conditions to create filters for
      */
    oConditions: js.Object
    ): js.Object = js.native
    
    /**
      * @since 1.101.0
      *
      * Provides the possibility to customize selections in 'Select from list' scenarios. By default, only condition
      * keys are considered. This may be extended with payload dependent filters.
      *
      * @returns True, if item is selected
      */
    def isFilterableListItemSelected(
      /**
      * The `ValueHelp` control instance
      */
    oValueHelp: typings.openui5.sapUiMdcValueHelpMod.default,
      /**
      * `ValueHelp` content instance
      */
    oContent: typings.openui5.sapUiMdcValuehelpBaseFilterableListContentMod.default,
      /**
      * Entry of a given list
      */
    oItem: typings.openui5.sapUiCoreElementMod.default,
      /**
      * current conditions
      */
    aConditions: js.Array[ConditionObject]
    ): Boolean = js.native
    
    /**
      * Checks if a `ListBinding` supports $Search.
      *
      * @returns true if $search is supported
      */
    def isSearchSupported(
      /**
      * The `ValueHelp` control instance
      */
    oValueHelp: typings.openui5.sapUiMdcValueHelpMod.default,
      /**
      * Content element
      */
    oContent: typings.openui5.sapUiMdcValuehelpBaseContentMod.default,
      /**
      * ListBinding
      */
    oListBinding: typings.openui5.sapUiModelListBindingMod.default
    ): Boolean = js.native
    
    /**
      * @since 1.101.0
      *
      * Provides the possibility to customize selection events in 'Select from list' scenarios. This enables
      * an application to reuse conditions in collective search scenarios, instead of always creating new ones.
      *
      * @returns oRestult Selection event configuration object
      */
    def modifySelectionBehaviour(
      /**
      * The `ValueHelp` control instance
      */
    oValueHelp: typings.openui5.sapUiMdcValueHelpMod.default,
      /**
      * `ValueHelp` content instance
      */
    oContent: typings.openui5.sapUiMdcValuehelpBaseFilterableListContentMod.default,
      /**
      * Selection event configuration
      */
    oChange: Conditions
    ): js.Object = js.native
    
    def onConditionPropagation(
      /**
      * The `ValueHelp` control instance
      */
    oValueHelp: typings.openui5.sapUiMdcValueHelpMod.default,
      /**
      * Reason why the method was invoked
      */
    sReason: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueHelpPropagationReason * / any */ String,
      /**
      * current configuration provided by the calling control
      */
    oConfig: js.Object
    ): Unit = js.native
    /**
      * @since 1.101.0
      *
      * Callback invoked everytime a {@link sap.ui.mdc.ValueHelp ValueHelp} fires a select event or the value
      * of the corresponding field changes This callback may be used to update external fields.
      */
    def onConditionPropagation(
      /**
      * The `ValueHelp` control instance
      */
    oValueHelp: typings.openui5.sapUiMdcValueHelpMod.default,
      /**
      * Reason why the method was invoked
      */
    sReason: ValueHelpPropagationReason,
      /**
      * current configuration provided by the calling control
      */
    oConfig: js.Object
    ): Unit = js.native
    
    /**
      * Requests the content of the value help.
      *
      * This function is called when the value help is opened or a key or description is requested.
      *
      * So, depending on the value help content used, all content controls and data need to be assigned. Once
      * they are assigned and the data is set, the returned `Promise` needs to be resolved. Only then does the
      * value help continue opening or reading data.
      *
      * @returns Promise that is resolved if all content is available
      */
    def retrieveContent(
      /**
      * The `ValueHelp` control instance
      */
    oValueHelp: typings.openui5.sapUiMdcValueHelpMod.default,
      /**
      * Container instance
      */
    oContainer: typings.openui5.sapUiMdcValuehelpBaseContainerMod.default,
      /**
      * id of the content shown after this call to retrieveContent
      */
    sContentId: String
    ): js.Promise[Any] = js.native
    
    /**
      * @since 1.110.0
      *
      * Controls if a typeahead should be opened or closed
      *
      * @returns Boolean or Promise resolving to a boolean indicating the desired behavior
      */
    def showTypeahead(
      /**
      * The `ValueHelp` control instance
      */
    oValueHelp: typings.openui5.sapUiMdcValueHelpMod.default,
      /**
      * ValueHelp content requesting conditions configuration
      */
    oContent: typings.openui5.sapUiMdcValuehelpBaseContentMod.default
    ): js.Promise[Any] | Boolean = js.native
    
    /**
      * @since 1.110.0
      *
      * Executes a filter in a `ListBinding` and resumes it, if suspended.
      */
    def updateBinding(
      /**
      * The `ValueHelp` control instance
      */
    oValueHelp: typings.openui5.sapUiMdcValueHelpMod.default,
      /**
      * List binding
      */
    oListBinding: typings.openui5.sapUiModelListBindingMod.default,
      /**
      * The binding info object to be used to bind the list to the model
      */
    oBindingInfo: AggregationBindingInfo,
      /**
      * ValueHelp content requesting the binding update
      */
    oContent: typings.openui5.sapUiMdcValuehelpBaseFilterableListContentMod.default
    ): Unit = js.native
    
    /**
      * @since 1.110.0
      *
      * Adjustable filtering for list-based contents
      */
    def updateBindingInfo(
      /**
      * The `ValueHelp` control instance
      */
    oValueHelp: typings.openui5.sapUiMdcValueHelpMod.default,
      /**
      * ValueHelp content requesting conditions configuration
      */
    oContent: typings.openui5.sapUiMdcValuehelpBaseFilterableListContentMod.default,
      /**
      * The binding info object to be used to bind the list to the model
      */
    oBindingInfo: AggregationBindingInfo
    ): Unit = js.native
  }
  
  type _To = ValueHelpDelegate
  
  /* This means you don't have to write `default`, but can instead just say `sapUiMdcValueHelpDelegateMod.foo` */
  override def _to: ValueHelpDelegate = default
}
