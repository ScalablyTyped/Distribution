package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiTestOpaBuilderMod {
  
  @JSImport("sap/ui/test/OpaBuilder", JSImport.Default)
  @js.native
  /**
    * Constructor for a new OpaBuilder.
    */
  open class default ()
    extends StObject
       with OpaBuilder {
    def this(/**
      * the Opa5 instance to operate on
      */
    oOpaInstance: typings.openui5.sapUiTestOpa5Mod.default) = this()
    def this(
      /**
      * the Opa5 instance to operate on
      */
    oOpaInstance: Unit,
      /**
      * the initial {@link sap.ui.test.Opa5#waitFor} options
      */
    oOptions: js.Object
    ) = this()
    def this(
      /**
      * the Opa5 instance to operate on
      */
    oOpaInstance: typings.openui5.sapUiTestOpa5Mod.default,
      /**
      * the initial {@link sap.ui.test.Opa5#waitFor} options
      */
    oOptions: js.Object
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/test/OpaBuilder", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Convenience creation and initialization of a new OpaBuilder.
      *
      * @returns a new OpaBuilder instance
      */
    inline def create(
      /**
      * the Opa5 instance to operate on
      */
    oOpaInstance: js.UndefOr[typings.openui5.sapUiTestOpa5Mod.default],
      /**
      * the id of the target control(s)
      */
    vId: js.UndefOr[String | js.RegExp],
      /**
      * the type of the target control(s)
      */
    sControlType: js.UndefOr[String],
      /**
      * if true, only popover and dialogs are searched for
      */
    bDialogElement: js.UndefOr[Boolean],
      /**
      * additional matchers to filter target control(s)
      */
    vMatchers: js.UndefOr[
          typings.openui5.sapUiTestMatchersMatcherMod.default | js.Function | js.Array[Any] | js.Object
        ],
      /**
      * the actions to be performed on target control(s)
      */
    vActions: js.UndefOr[typings.openui5.sapUiTestActionsActionMod.default | js.Function | js.Array[Any]],
      /**
      * oOptions the {@link sap.ui.test.Opa5#waitFor} options to apply
      */
    oOptions: js.UndefOr[js.Object]
    ): OpaBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(oOpaInstance.asInstanceOf[js.Any], vId.asInstanceOf[js.Any], sControlType.asInstanceOf[js.Any], bDialogElement.asInstanceOf[js.Any], vMatchers.asInstanceOf[js.Any], vActions.asInstanceOf[js.Any], oOptions.asInstanceOf[js.Any])).asInstanceOf[OpaBuilder]
    
    /**
      * Set or get the default options to be used as the builder base. If no options are provided, the current
      * default options are returned.
      *
      * @returns the default {@link sap.ui.test.Opa5#waitFor} options
      */
    inline def defaultOptions(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultOptions")().asInstanceOf[js.Object]
    inline def defaultOptions(/**
      * the new default options to be used
      */
    oOptions: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultOptions")(oOptions.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  }
  
  @js.native
  trait Actions extends StObject {
    
    /**
      * Creates an action that is only performed if target control fulfills the conditions.
      *
      * @returns an action function
      */
    def conditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: typings.openui5.sapUiTestMatchersMatcherMod.default | js.Function | js.Array[Any] | js.Object | Boolean,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessBuilderOrOptions: typings.openui5.sapUiTestActionsActionMod.default | js.Function | js.Array[Any] | OpaBuilder,
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseBuilderOptions: js.UndefOr[
          typings.openui5.sapUiTestActionsActionMod.default | js.Function | js.Array[Any] | OpaBuilder
        ]
    ): js.Function = js.native
    
    /**
      * Creates a {@link sap.ui.test.actions.EnterText} action.
      *
      * @returns an instance of the {@link sap.ui.test.actions.EnterText} action
      */
    def enterText(/**
      * defines the {@link sap.ui.test.actions.EnterText#setText} setting
      */
    sText: String): typings.openui5.sapUiTestActionsEnterTextMod.default = js.native
    def enterText(
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setText} setting
      */
    sText: String,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setClearTextFirst} setting
      */
    bClearTextFirst: Boolean
    ): typings.openui5.sapUiTestActionsEnterTextMod.default = js.native
    def enterText(
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setText} setting
      */
    sText: String,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setClearTextFirst} setting
      */
    bClearTextFirst: Boolean,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setKeepFocus} setting
      */
    bKeepFocus: Boolean
    ): typings.openui5.sapUiTestActionsEnterTextMod.default = js.native
    def enterText(
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setText} setting
      */
    sText: String,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setClearTextFirst} setting
      */
    bClearTextFirst: Boolean,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setKeepFocus} setting
      */
    bKeepFocus: Boolean,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setPressEnterKey} setting
      */
    bPressEnterKey: Boolean
    ): typings.openui5.sapUiTestActionsEnterTextMod.default = js.native
    def enterText(
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setText} setting
      */
    sText: String,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setClearTextFirst} setting
      */
    bClearTextFirst: Boolean,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setKeepFocus} setting
      */
    bKeepFocus: Boolean,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setPressEnterKey} setting
      */
    bPressEnterKey: Boolean,
      /**
      * defines the {@link sap.ui.test.actions.Action#setIdSuffix} setting
      */
    sIdSuffix: String
    ): typings.openui5.sapUiTestActionsEnterTextMod.default = js.native
    def enterText(
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setText} setting
      */
    sText: String,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setClearTextFirst} setting
      */
    bClearTextFirst: Boolean,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setKeepFocus} setting
      */
    bKeepFocus: Boolean,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setPressEnterKey} setting
      */
    bPressEnterKey: Unit,
      /**
      * defines the {@link sap.ui.test.actions.Action#setIdSuffix} setting
      */
    sIdSuffix: String
    ): typings.openui5.sapUiTestActionsEnterTextMod.default = js.native
    def enterText(
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setText} setting
      */
    sText: String,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setClearTextFirst} setting
      */
    bClearTextFirst: Boolean,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setKeepFocus} setting
      */
    bKeepFocus: Unit,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setPressEnterKey} setting
      */
    bPressEnterKey: Boolean
    ): typings.openui5.sapUiTestActionsEnterTextMod.default = js.native
    def enterText(
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setText} setting
      */
    sText: String,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setClearTextFirst} setting
      */
    bClearTextFirst: Boolean,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setKeepFocus} setting
      */
    bKeepFocus: Unit,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setPressEnterKey} setting
      */
    bPressEnterKey: Boolean,
      /**
      * defines the {@link sap.ui.test.actions.Action#setIdSuffix} setting
      */
    sIdSuffix: String
    ): typings.openui5.sapUiTestActionsEnterTextMod.default = js.native
    def enterText(
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setText} setting
      */
    sText: String,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setClearTextFirst} setting
      */
    bClearTextFirst: Boolean,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setKeepFocus} setting
      */
    bKeepFocus: Unit,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setPressEnterKey} setting
      */
    bPressEnterKey: Unit,
      /**
      * defines the {@link sap.ui.test.actions.Action#setIdSuffix} setting
      */
    sIdSuffix: String
    ): typings.openui5.sapUiTestActionsEnterTextMod.default = js.native
    def enterText(
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setText} setting
      */
    sText: String,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setClearTextFirst} setting
      */
    bClearTextFirst: Unit,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setKeepFocus} setting
      */
    bKeepFocus: Boolean
    ): typings.openui5.sapUiTestActionsEnterTextMod.default = js.native
    def enterText(
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setText} setting
      */
    sText: String,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setClearTextFirst} setting
      */
    bClearTextFirst: Unit,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setKeepFocus} setting
      */
    bKeepFocus: Boolean,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setPressEnterKey} setting
      */
    bPressEnterKey: Boolean
    ): typings.openui5.sapUiTestActionsEnterTextMod.default = js.native
    def enterText(
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setText} setting
      */
    sText: String,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setClearTextFirst} setting
      */
    bClearTextFirst: Unit,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setKeepFocus} setting
      */
    bKeepFocus: Boolean,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setPressEnterKey} setting
      */
    bPressEnterKey: Boolean,
      /**
      * defines the {@link sap.ui.test.actions.Action#setIdSuffix} setting
      */
    sIdSuffix: String
    ): typings.openui5.sapUiTestActionsEnterTextMod.default = js.native
    def enterText(
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setText} setting
      */
    sText: String,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setClearTextFirst} setting
      */
    bClearTextFirst: Unit,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setKeepFocus} setting
      */
    bKeepFocus: Boolean,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setPressEnterKey} setting
      */
    bPressEnterKey: Unit,
      /**
      * defines the {@link sap.ui.test.actions.Action#setIdSuffix} setting
      */
    sIdSuffix: String
    ): typings.openui5.sapUiTestActionsEnterTextMod.default = js.native
    def enterText(
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setText} setting
      */
    sText: String,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setClearTextFirst} setting
      */
    bClearTextFirst: Unit,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setKeepFocus} setting
      */
    bKeepFocus: Unit,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setPressEnterKey} setting
      */
    bPressEnterKey: Boolean
    ): typings.openui5.sapUiTestActionsEnterTextMod.default = js.native
    def enterText(
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setText} setting
      */
    sText: String,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setClearTextFirst} setting
      */
    bClearTextFirst: Unit,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setKeepFocus} setting
      */
    bKeepFocus: Unit,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setPressEnterKey} setting
      */
    bPressEnterKey: Boolean,
      /**
      * defines the {@link sap.ui.test.actions.Action#setIdSuffix} setting
      */
    sIdSuffix: String
    ): typings.openui5.sapUiTestActionsEnterTextMod.default = js.native
    def enterText(
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setText} setting
      */
    sText: String,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setClearTextFirst} setting
      */
    bClearTextFirst: Unit,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setKeepFocus} setting
      */
    bKeepFocus: Unit,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setPressEnterKey} setting
      */
    bPressEnterKey: Unit,
      /**
      * defines the {@link sap.ui.test.actions.Action#setIdSuffix} setting
      */
    sIdSuffix: String
    ): typings.openui5.sapUiTestActionsEnterTextMod.default = js.native
    
    def executor(/**
      * the actions to be executed
      */
    vActions: js.Array[Any]): js.Function = js.native
    def executor(/**
      * the actions to be executed
      */
    vActions: js.Function): js.Function = js.native
    /**
      * Creates an action function that executes all given actions on a single or an array of controls. This
      * method can be used as a helper for handling the different kinds of action definitions and inputs.
      *
      * @returns an action function
      */
    def executor(
      /**
      * the actions to be executed
      */
    vActions: typings.openui5.sapUiTestActionsActionMod.default
    ): js.Function = js.native
    
    /**
      * Creates a {@link sap.ui.test.actions.Press} action.
      *
      * @returns an instance of the {@link sap.ui.test.actions.Press} action
      */
    def press(): typings.openui5.sapUiTestActionsPressMod.default = js.native
    def press(
      /**
      * the id suffix of the DOM Element the press action will be executed on
      */
    sIdSuffix: String
    ): typings.openui5.sapUiTestActionsPressMod.default = js.native
  }
  @JSImport("sap/ui/test/OpaBuilder", "Actions")
  @js.native
  val Actions: typings.openui5.sapUiTestOpaBuilderMod.Actions = js.native
  
  @js.native
  trait Matchers extends StObject {
    
    /**
      * A matcher function that always returns `false`.
      *
      * `
      * ```javascript
      * var fnFalsyMatcher = OpaBuilder.Matchers.FALSE;```
      *  `
      */
    def FALSE(): Boolean = js.native
    
    /**
      * A matcher function that always returns `true`.
      *
      * `
      * ```javascript
      * var fnTruthyMatcher = OpaBuilder.Matchers.TRUE;```
      *  `
      */
    def TRUE(): Boolean = js.native
    
    /**
      * Creates a matcher function that returns all aggregation items fulfilling given matcher(s). The result
      * will always be an array, even if it is a non-multiple aggregation.
      *
      * @returns matcher function returning all matching aggregation items
      */
    def aggregation(/**
      * the aggregation name
      */
    sAggregationName: String): js.Function = js.native
    def aggregation(
      /**
      * the aggregation name
      */
    sAggregationName: String,
      /**
      * the matchers to filter aggregation items
      */
    vMatchers: js.Array[Any]
    ): js.Function = js.native
    def aggregation(
      /**
      * the aggregation name
      */
    sAggregationName: String,
      /**
      * the matchers to filter aggregation items
      */
    vMatchers: js.Function
    ): js.Function = js.native
    def aggregation(
      /**
      * the aggregation name
      */
    sAggregationName: String,
      /**
      * the matchers to filter aggregation items
      */
    vMatchers: js.Object
    ): js.Function = js.native
    def aggregation(
      /**
      * the aggregation name
      */
    sAggregationName: String,
      /**
      * the matchers to filter aggregation items
      */
    vMatchers: typings.openui5.sapUiTestMatchersMatcherMod.default
    ): js.Function = js.native
    
    /**
      * Creates a matcher function that returns an aggregation element of a control at a given index.
      *
      * @returns the matcher function returns the item at a certain index in the aggregation or `undefined` if
      * index not in range
      */
    def aggregationAtIndex(
      /**
      * the name of the aggregation that is used for matching
      */
    sAggregationName: String,
      /**
      * the index within the aggregation
      */
    iIndex: int
    ): js.Function1[
        /* p1 */ typings.openui5.sapUiCoreControlMod.default, 
        typings.openui5.sapUiBaseManagedObjectMod.default
      ] = js.native
    
    /**
      * Creates a {@link sap.ui.test.matchers.AggregationLengthEquals} matcher.
      *
      * @returns a declarative matcher definition for {@link sap.ui.test.matchers.AggregationLengthEquals}
      */
    def aggregationLength(
      /**
      * the name of the aggregation that is used for matching
      */
    sAggregationName: String,
      /**
      * the length that aggregation name should have
      */
    iLength: int
    ): js.Object = js.native
    
    /**
      * Checks whether at least one aggregation item fulfills given matcher(s).
      *
      * @returns matcher function
      */
    def aggregationMatcher(/**
      * the aggregation name
      */
    sAggregationName: String): js.Function = js.native
    def aggregationMatcher(
      /**
      * the aggregation name
      */
    sAggregationName: String,
      /**
      * the matchers to filter aggregation items
      */
    vMatchers: js.Array[Any]
    ): js.Function = js.native
    def aggregationMatcher(
      /**
      * the aggregation name
      */
    sAggregationName: String,
      /**
      * the matchers to filter aggregation items
      */
    vMatchers: js.Function
    ): js.Function = js.native
    def aggregationMatcher(
      /**
      * the aggregation name
      */
    sAggregationName: String,
      /**
      * the matchers to filter aggregation items
      */
    vMatchers: js.Object
    ): js.Function = js.native
    def aggregationMatcher(
      /**
      * the aggregation name
      */
    sAggregationName: String,
      /**
      * the matchers to filter aggregation items
      */
    vMatchers: typings.openui5.sapUiTestMatchersMatcherMod.default
    ): js.Function = js.native
    
    def ancestor(
      /**
      * the ancestor control to check, if undefined, validates every control to true. Can be a control or a control
      * ID
      */
    vAncestor: String
    ): js.Object = js.native
    def ancestor(
      /**
      * the ancestor control to check, if undefined, validates every control to true. Can be a control or a control
      * ID
      */
    vAncestor: String,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): js.Object = js.native
    /**
      * Creates a declarative matcher definition for {@link sap.ui.test.matchers.Ancestor}.
      *
      * @returns a declarative matcher definition for {@link sap.ui.test.matchers.Ancestor}
      */
    def ancestor(
      /**
      * the ancestor control to check, if undefined, validates every control to true. Can be a control or a control
      * ID
      */
    vAncestor: js.Object
    ): js.Object = js.native
    def ancestor(
      /**
      * the ancestor control to check, if undefined, validates every control to true. Can be a control or a control
      * ID
      */
    vAncestor: js.Object,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): js.Object = js.native
    
    /**
      * Creates a {@link sap.ui.test.matchers.BindingPath} matcher.
      *
      * @returns a declarative matcher definition for {@link sap.ui.test.matchers.BindingPath}
      */
    def bindingPath(
      /**
      * the binding context path (including the model name) that is used for matching
      */
    sModelPropertyPath: String,
      /**
      * the binding property path that is used for matching. If (context) path is also set, propertyPath will
      * be assumed to be relative to the binding context path
      */
    sPropertyPath: String
    ): js.Object = js.native
    
    /**
      * Creates a matcher that checks whether the bound context or model has the given properties.
      *
      * @returns the matcher function checks all path in the properties object against the binding context
      */
    def bindingProperties(/**
      * the property-path map with expected values
      */
    oProperties: js.Object): js.Function = js.native
    /**
      * Creates a matcher that checks whether the bound context or model has the given properties.
      *
      * @returns the matcher function checks all path in the properties object against the binding context
      */
    def bindingProperties(
      /**
      * the name of the model to get the binding context for
      */
    sModelName: String,
      /**
      * the property-path map with expected values
      */
    oProperties: js.Object
    ): js.Function = js.native
    
    /**
      * Creates a matcher function that returns all children fulfilling given matcher(s). The result will always
      * be an array, even if only one child was found.
      *
      * @returns matcher function returning all matching children
      */
    def children(): js.Function = js.native
    def children(/**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: js.Array[Any]): js.Function = js.native
    def children(
      /**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: js.Array[Any],
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): js.Function = js.native
    def children(/**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: js.Function): js.Function = js.native
    def children(
      /**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: js.Function,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): js.Function = js.native
    def children(/**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: js.Object): js.Function = js.native
    def children(
      /**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: js.Object,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): js.Function = js.native
    def children(
      /**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: Unit,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): js.Function = js.native
    def children(
      /**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: typings.openui5.sapUiTestMatchersMatcherMod.default
    ): js.Function = js.native
    def children(
      /**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: typings.openui5.sapUiTestMatchersMatcherMod.default,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): js.Function = js.native
    def children(/**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: OpaBuilder): js.Function = js.native
    def children(
      /**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: OpaBuilder,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): js.Function = js.native
    
    /**
      * Creates a matcher function that checks whether one children fulfilling given matcher(s).
      *
      * @returns matcher function
      */
    def childrenMatcher(): js.Function = js.native
    def childrenMatcher(/**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: js.Array[Any]): js.Function = js.native
    def childrenMatcher(
      /**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: js.Array[Any],
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): js.Function = js.native
    def childrenMatcher(/**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: js.Function): js.Function = js.native
    def childrenMatcher(
      /**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: js.Function,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): js.Function = js.native
    def childrenMatcher(/**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: js.Object): js.Function = js.native
    def childrenMatcher(
      /**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: js.Object,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): js.Function = js.native
    def childrenMatcher(
      /**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: Unit,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): js.Function = js.native
    def childrenMatcher(
      /**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: typings.openui5.sapUiTestMatchersMatcherMod.default
    ): js.Function = js.native
    def childrenMatcher(
      /**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: typings.openui5.sapUiTestMatchersMatcherMod.default,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): js.Function = js.native
    def childrenMatcher(/**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: OpaBuilder): js.Function = js.native
    def childrenMatcher(
      /**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: OpaBuilder,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): js.Function = js.native
    
    /**
      * Creates a matcher that checks states for given conditions.
      *
      * @returns a matcher function
      */
    def conditional(
      /**
      * conditions to pre-check
      */
    vConditions: typings.openui5.sapUiTestMatchersMatcherMod.default | js.Function | js.Array[Any] | js.Object | Boolean,
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: typings.openui5.sapUiTestMatchersMatcherMod.default | js.Function | js.Array[Any] | js.Object,
      /**
      * actual matcher that is executed if conditions are not met
      */
    vElseMatcher: js.UndefOr[
          typings.openui5.sapUiTestMatchersMatcherMod.default | js.Function | js.Array[Any] | js.Object
        ]
    ): js.Function = js.native
    
    /**
      * Creates a matcher that checks whether a control has all given custom data.
      *
      * @returns the matcher function checks for defined custom data
      */
    def customData(/**
      * the map of custom data keys and their values to check against
      */
    oCustomData: js.Object): js.Function = js.native
    
    def descendant(
      /**
      * the descendant control to check. If undefined, it validates every control to true. Can be a control or
      * a control ID
      */
    vDescendent: String
    ): js.Object = js.native
    def descendant(
      /**
      * the descendant control to check. If undefined, it validates every control to true. Can be a control or
      * a control ID
      */
    vDescendent: String,
      /**
      * specifies if the descendant should be a direct child
      */
    bDirect: Boolean
    ): js.Object = js.native
    /**
      * Creates a declarative matcher definition for {@link sap.ui.test.matchers.Descendant}.
      *
      * @returns a declarative matcher definition for {@link sap.ui.test.matchers.Descendant}
      */
    def descendant(
      /**
      * the descendant control to check. If undefined, it validates every control to true. Can be a control or
      * a control ID
      */
    vDescendent: js.Object
    ): js.Object = js.native
    def descendant(
      /**
      * the descendant control to check. If undefined, it validates every control to true. Can be a control or
      * a control ID
      */
    vDescendent: js.Object,
      /**
      * specifies if the descendant should be a direct child
      */
    bDirect: Boolean
    ): js.Object = js.native
    
    /**
      * Creates a matcher that checks all inputs against given matchers. The input can be an array or a single
      * element. The result will always be an array. If the input is a single element, the result will be an
      * array containing the given element (or empty if not matching the matchers).
      *
      * @returns the matcher function returns an array with all matching items
      */
    def filter(): js.Function = js.native
    def filter(/**
      * the matchers to check all items against
      */
    vMatchers: js.Array[Any]): js.Function = js.native
    def filter(/**
      * the matchers to check all items against
      */
    vMatchers: js.Function): js.Function = js.native
    def filter(/**
      * the matchers to check all items against
      */
    vMatchers: js.Object): js.Function = js.native
    def filter(
      /**
      * the matchers to check all items against
      */
    vMatchers: typings.openui5.sapUiTestMatchersMatcherMod.default
    ): js.Function = js.native
    
    /**
      * Creates a matcher that checks whether a control has the focus.
      *
      * @returns a matcher function
      */
    def focused(): js.Function = js.native
    def focused(
      /**
      * set true to check additionally for the focus on any child element
      */
    bCheckChildren: Boolean
    ): js.Function = js.native
    
    /**
      * Creates a {@link sap.ui.test.matchers.I18NText} matcher.
      *
      * @returns a declarative matcher definition for {@link sap.ui.test.matchers.I18NText}
      */
    def i18n(
      /**
      * the name of the control property to match the I18N text with
      */
    sPropertyName: String,
      /**
      * the path to the I18N text. If model is omitted, `i18n` is used as model name.
      */
    sModelTokenPath: String
    ): js.Object = js.native
    def i18n(
      /**
      * the name of the control property to match the I18N text with
      */
    sPropertyName: String,
      /**
      * the path to the I18N text. If model is omitted, `i18n` is used as model name.
      */
    sModelTokenPath: String,
      /**
      * the values to be used instead of the placeholders
      */
    aParameters: js.Array[String]
    ): js.Object = js.native
    
    /**
      * Creates a {@link sap.ui.test.matchers.LabelFor} matcher.
      *
      * @returns a declarative matcher definition for {@link sap.ui.test.matchers.LabelFor}
      */
    def labelFor(
      /**
      * the name of the control property to match the I18N text with
      */
    sPropertyName: String,
      /**
      * define whether check is against plain text
      */
    bText: Boolean,
      /**
      * the path to the I18N text containing the model name. If `bText` set true, contains the plain text to
      * check against
      */
    sModelTokenPathOrText: String
    ): js.Object = js.native
    def labelFor(
      /**
      * the name of the control property to match the I18N text with
      */
    sPropertyName: String,
      /**
      * define whether check is against plain text
      */
    bText: Boolean,
      /**
      * the path to the I18N text containing the model name. If `bText` set true, contains the plain text to
      * check against
      */
    sModelTokenPathOrText: String,
      /**
      * the values to be used instead of the placeholders in case of I18N texts
      */
    aParameters: js.Array[Any]
    ): js.Object = js.native
    /**
      * Creates a {@link sap.ui.test.matchers.LabelFor} matcher.
      *
      * @returns a declarative matcher definition for {@link sap.ui.test.matchers.LabelFor}
      */
    def labelFor(
      /**
      * the name of the control property to match the I18N text with
      */
    sPropertyName: String,
      /**
      * the path to the I18N text containing the model name. If `bText` set true, contains the plain text to
      * check against
      */
    sModelTokenPathOrText: String
    ): js.Object = js.native
    def labelFor(
      /**
      * the name of the control property to match the I18N text with
      */
    sPropertyName: String,
      /**
      * the path to the I18N text containing the model name. If `bText` set true, contains the plain text to
      * check against
      */
    sModelTokenPathOrText: String,
      /**
      * the values to be used instead of the placeholders in case of I18N texts
      */
    aParameters: js.Array[Any]
    ): js.Object = js.native
    
    /**
      * Creates a matcher that checks a single input against all defined matchers.
      *
      * @returns the matcher function returns the result of the matcher chain
      */
    def `match`(): js.Function = js.native
    def `match`(/**
      * the matchers to check all items against
      */
    vMatchers: js.Array[Any]): js.Function = js.native
    def `match`(/**
      * the matchers to check all items against
      */
    vMatchers: js.Function): js.Function = js.native
    def `match`(/**
      * the matchers to check all items against
      */
    vMatchers: js.Object): js.Function = js.native
    def `match`(
      /**
      * the matchers to check all items against
      */
    vMatchers: typings.openui5.sapUiTestMatchersMatcherMod.default
    ): js.Function = js.native
    
    /**
      * Creates a matcher function which is negating the result of provided matchers. The matcher function returns
      * a boolean value but never a control.
      *
      * Example usage for only matching controls without a certain text:
      * ```javascript
      * new OpaBuilder().hasType("sap.m.Text").has(
      *              OpaBuilder.Matchers.not(
      *                  OpaBuilder.Matchers.properties({ text: "Ignore controls with this text"})
      *             )
      *         );
      *     ```
      *
      *
      * @returns the matcher function returns the negated result of the matcher chain
      */
    def not(): js.Function = js.native
    def not(/**
      * the matchers that will actually be executed
      */
    vMatchers: js.Array[Any]): js.Function = js.native
    def not(/**
      * the matchers that will actually be executed
      */
    vMatchers: js.Function): js.Function = js.native
    def not(/**
      * the matchers that will actually be executed
      */
    vMatchers: js.Object): js.Function = js.native
    def not(
      /**
      * the matchers that will actually be executed
      */
    vMatchers: typings.openui5.sapUiTestMatchersMatcherMod.default
    ): js.Function = js.native
    
    /**
      * Creates a {@link sap.ui.test.matchers.Properties} matcher.
      *
      * @returns a declarative matcher definition for {@link sap.ui.test.matchers.Properties}
      */
    def properties(/**
      * the object with the properties to be checked
      */
    oProperties: js.Object): js.Object = js.native
    
    /**
      * Creates a matcher that validates the given property against a token text of a library message bundle.
      *
      * @returns a matcher function
      */
    def resourceBundle(
      /**
      * the name of the control property to match the I18N text with
      */
    sPropertyName: String,
      /**
      * the name of the library to retrieve the resource bundle from
      */
    sLibrary: String,
      /**
      * the text token to validate against
      */
    sToken: String
    ): js.Function = js.native
    def resourceBundle(
      /**
      * the name of the control property to match the I18N text with
      */
    sPropertyName: String,
      /**
      * the name of the library to retrieve the resource bundle from
      */
    sLibrary: String,
      /**
      * the text token to validate against
      */
    sToken: String,
      /**
      * the values to be used instead of the placeholders
      */
    aParameters: js.Array[String]
    ): js.Function = js.native
    
    /**
      * Creates a matcher that checks for at least one successful match from a group of matchers.
      *
      * @returns a matcher function
      */
    def some(): js.Function = js.native
    def some(/**
      * aMatchers list of matchers were one must be met
      */
    aMatchers: js.Array[Any]): js.Function = js.native
    def some(/**
      * aMatchers list of matchers were one must be met
      */
    aMatchers: js.Function): js.Function = js.native
    def some(/**
      * aMatchers list of matchers were one must be met
      */
    aMatchers: js.Object): js.Function = js.native
    def some(
      /**
      * aMatchers list of matchers were one must be met
      */
    aMatchers: typings.openui5.sapUiTestMatchersMatcherMod.default
    ): js.Function = js.native
  }
  @JSImport("sap/ui/test/OpaBuilder", "Matchers")
  @js.native
  val Matchers: typings.openui5.sapUiTestOpaBuilderMod.Matchers = js.native
  
  @js.native
  trait OpaBuilder extends StObject {
    
    /**
      * Build the final {@link sap.ui.test.Opa5#waitFor} options object and returns it.
      *
      * @returns the final options object
      */
    def build(): js.Object = js.native
    
    /**
      * Add a check function. If another check function already exists, the functions are chained.
      *
      * @returns this OpaBuilder instance
      */
    def check(/**
      * the check that is executed on matched controls
      */
    fnCheck: js.Function): this.type = js.native
    def check(
      /**
      * the check that is executed on matched controls
      */
    fnCheck: js.Function,
      /**
      * true to replace all previous defined matchers, false to add it (default)
      */
    bReplace: Boolean
    ): this.type = js.native
    
    /**
      * Adds a check for the expected number of matching controls.
      *
      * @returns this OpaBuilder instance
      */
    def checkNumberOfMatches(/**
      * the number of expected matching controls
      */
    iExpectedNumber: Double): this.type = js.native
    
    /**
      * Sets the `debugTimeout` parameter.
      *
      * @returns this OpaBuilder instance
      */
    def debugTimeout(/**
      * the debug timeout in seconds
      */
    iDebugTimeout: int): this.type = js.native
    
    /**
      * Set a output text that will be used as success and error message base message.
      *
      * @returns this OpaBuilder instance
      */
    def description(/**
      * a descriptive text
      */
    sDescription: String): this.type = js.native
    
    def `do`(/**
      * the action(s) to be performed on matched controls
      */
    vActions: js.Array[Any]): this.type = js.native
    def `do`(
      /**
      * the action(s) to be performed on matched controls
      */
    vActions: js.Array[Any],
      /**
      * true to replace all previous defined actions, false to add it (default)
      */
    bReplace: Boolean
    ): this.type = js.native
    def `do`(/**
      * the action(s) to be performed on matched controls
      */
    vActions: js.Function): this.type = js.native
    def `do`(
      /**
      * the action(s) to be performed on matched controls
      */
    vActions: js.Function,
      /**
      * true to replace all previous defined actions, false to add it (default)
      */
    bReplace: Boolean
    ): this.type = js.native
    /**
      * Add an action to be performed on all matched controls.
      *
      * @returns this OpaBuilder instance
      */
    def `do`(
      /**
      * the action(s) to be performed on matched controls
      */
    vActions: typings.openui5.sapUiTestActionsActionMod.default
    ): this.type = js.native
    def `do`(
      /**
      * the action(s) to be performed on matched controls
      */
    vActions: typings.openui5.sapUiTestActionsActionMod.default,
      /**
      * true to replace all previous defined actions, false to add it (default)
      */
    bReplace: Boolean
    ): this.type = js.native
    
    /**
      * Add an action that is only performed if target control fulfills the conditions. It is internally using
      * {@link sap.ui.test.OpaBuilder.Actions.conditional}.
      *
      * @returns this OpaBuilder instance
      */
    def doConditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: typings.openui5.sapUiTestMatchersMatcherMod.default | js.Function | js.Array[Any] | js.Object | Boolean,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessActions: typings.openui5.sapUiTestActionsActionMod.default | js.Function | js.Array[Any],
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseActions: js.UndefOr[typings.openui5.sapUiTestActionsActionMod.default | js.Function | js.Array[Any]]
    ): this.type = js.native
    
    /**
      * Performs a {@link sap.ui.test.actions.EnterText} on target control(s).
      *
      * @returns this OpaBuilder instance
      */
    def doEnterText(/**
      * defines the {@link sap.ui.test.actions.EnterText#setText} setting
      */
    sText: String): this.type = js.native
    def doEnterText(
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setText} setting
      */
    sText: String,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setClearTextFirst} setting
      */
    bClearTextFirst: Boolean
    ): this.type = js.native
    def doEnterText(
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setText} setting
      */
    sText: String,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setClearTextFirst} setting
      */
    bClearTextFirst: Boolean,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setKeepFocus} setting
      */
    bKeepFocus: Boolean
    ): this.type = js.native
    def doEnterText(
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setText} setting
      */
    sText: String,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setClearTextFirst} setting
      */
    bClearTextFirst: Boolean,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setKeepFocus} setting
      */
    bKeepFocus: Boolean,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setPressEnterKey} setting
      */
    bPressEnterKey: Boolean
    ): this.type = js.native
    def doEnterText(
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setText} setting
      */
    sText: String,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setClearTextFirst} setting
      */
    bClearTextFirst: Boolean,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setKeepFocus} setting
      */
    bKeepFocus: Boolean,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setPressEnterKey} setting
      */
    bPressEnterKey: Boolean,
      /**
      * defines the {@link sap.ui.test.actions.Action#setIdSuffix} setting
      */
    sIdSuffix: String
    ): this.type = js.native
    def doEnterText(
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setText} setting
      */
    sText: String,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setClearTextFirst} setting
      */
    bClearTextFirst: Boolean,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setKeepFocus} setting
      */
    bKeepFocus: Boolean,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setPressEnterKey} setting
      */
    bPressEnterKey: Unit,
      /**
      * defines the {@link sap.ui.test.actions.Action#setIdSuffix} setting
      */
    sIdSuffix: String
    ): this.type = js.native
    def doEnterText(
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setText} setting
      */
    sText: String,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setClearTextFirst} setting
      */
    bClearTextFirst: Boolean,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setKeepFocus} setting
      */
    bKeepFocus: Unit,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setPressEnterKey} setting
      */
    bPressEnterKey: Boolean
    ): this.type = js.native
    def doEnterText(
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setText} setting
      */
    sText: String,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setClearTextFirst} setting
      */
    bClearTextFirst: Boolean,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setKeepFocus} setting
      */
    bKeepFocus: Unit,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setPressEnterKey} setting
      */
    bPressEnterKey: Boolean,
      /**
      * defines the {@link sap.ui.test.actions.Action#setIdSuffix} setting
      */
    sIdSuffix: String
    ): this.type = js.native
    def doEnterText(
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setText} setting
      */
    sText: String,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setClearTextFirst} setting
      */
    bClearTextFirst: Boolean,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setKeepFocus} setting
      */
    bKeepFocus: Unit,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setPressEnterKey} setting
      */
    bPressEnterKey: Unit,
      /**
      * defines the {@link sap.ui.test.actions.Action#setIdSuffix} setting
      */
    sIdSuffix: String
    ): this.type = js.native
    def doEnterText(
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setText} setting
      */
    sText: String,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setClearTextFirst} setting
      */
    bClearTextFirst: Unit,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setKeepFocus} setting
      */
    bKeepFocus: Boolean
    ): this.type = js.native
    def doEnterText(
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setText} setting
      */
    sText: String,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setClearTextFirst} setting
      */
    bClearTextFirst: Unit,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setKeepFocus} setting
      */
    bKeepFocus: Boolean,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setPressEnterKey} setting
      */
    bPressEnterKey: Boolean
    ): this.type = js.native
    def doEnterText(
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setText} setting
      */
    sText: String,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setClearTextFirst} setting
      */
    bClearTextFirst: Unit,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setKeepFocus} setting
      */
    bKeepFocus: Boolean,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setPressEnterKey} setting
      */
    bPressEnterKey: Boolean,
      /**
      * defines the {@link sap.ui.test.actions.Action#setIdSuffix} setting
      */
    sIdSuffix: String
    ): this.type = js.native
    def doEnterText(
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setText} setting
      */
    sText: String,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setClearTextFirst} setting
      */
    bClearTextFirst: Unit,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setKeepFocus} setting
      */
    bKeepFocus: Boolean,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setPressEnterKey} setting
      */
    bPressEnterKey: Unit,
      /**
      * defines the {@link sap.ui.test.actions.Action#setIdSuffix} setting
      */
    sIdSuffix: String
    ): this.type = js.native
    def doEnterText(
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setText} setting
      */
    sText: String,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setClearTextFirst} setting
      */
    bClearTextFirst: Unit,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setKeepFocus} setting
      */
    bKeepFocus: Unit,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setPressEnterKey} setting
      */
    bPressEnterKey: Boolean
    ): this.type = js.native
    def doEnterText(
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setText} setting
      */
    sText: String,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setClearTextFirst} setting
      */
    bClearTextFirst: Unit,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setKeepFocus} setting
      */
    bKeepFocus: Unit,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setPressEnterKey} setting
      */
    bPressEnterKey: Boolean,
      /**
      * defines the {@link sap.ui.test.actions.Action#setIdSuffix} setting
      */
    sIdSuffix: String
    ): this.type = js.native
    def doEnterText(
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setText} setting
      */
    sText: String,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setClearTextFirst} setting
      */
    bClearTextFirst: Unit,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setKeepFocus} setting
      */
    bKeepFocus: Unit,
      /**
      * defines the {@link sap.ui.test.actions.EnterText#setPressEnterKey} setting
      */
    bPressEnterKey: Unit,
      /**
      * defines the {@link sap.ui.test.actions.Action#setIdSuffix} setting
      */
    sIdSuffix: String
    ): this.type = js.native
    
    def doOnAggregation(
      /**
      * the aggregation name
      */
    sAggregationName: String,
      /**
      * the actions to be performed on matching aggregation items
      */
    vActions: js.Array[Any]
    ): this.type = js.native
    def doOnAggregation(
      /**
      * the aggregation name
      */
    sAggregationName: String,
      /**
      * the actions to be performed on matching aggregation items
      */
    vActions: js.Function
    ): this.type = js.native
    /**
      * Performs given actions on all items of an aggregation fulfilling the matchers.
      *
      * @returns this OpaBuilder instance
      */
    def doOnAggregation(
      /**
      * the aggregation name
      */
    sAggregationName: String,
      /**
      * the actions to be performed on matching aggregation items
      */
    vActions: typings.openui5.sapUiTestActionsActionMod.default
    ): this.type = js.native
    def doOnAggregation(
      /**
      * the aggregation name
      */
    sAggregationName: String,
      /**
      * the matchers to filter aggregation items
      */
    vMatchers: js.Array[Any],
      /**
      * the actions to be performed on matching aggregation items
      */
    vActions: js.Array[Any]
    ): this.type = js.native
    def doOnAggregation(
      /**
      * the aggregation name
      */
    sAggregationName: String,
      /**
      * the matchers to filter aggregation items
      */
    vMatchers: js.Array[Any],
      /**
      * the actions to be performed on matching aggregation items
      */
    vActions: js.Function
    ): this.type = js.native
    def doOnAggregation(
      /**
      * the aggregation name
      */
    sAggregationName: String,
      /**
      * the matchers to filter aggregation items
      */
    vMatchers: js.Array[Any],
      /**
      * the actions to be performed on matching aggregation items
      */
    vActions: typings.openui5.sapUiTestActionsActionMod.default
    ): this.type = js.native
    def doOnAggregation(
      /**
      * the aggregation name
      */
    sAggregationName: String,
      /**
      * the matchers to filter aggregation items
      */
    vMatchers: js.Function,
      /**
      * the actions to be performed on matching aggregation items
      */
    vActions: js.Array[Any]
    ): this.type = js.native
    def doOnAggregation(
      /**
      * the aggregation name
      */
    sAggregationName: String,
      /**
      * the matchers to filter aggregation items
      */
    vMatchers: js.Function,
      /**
      * the actions to be performed on matching aggregation items
      */
    vActions: js.Function
    ): this.type = js.native
    def doOnAggregation(
      /**
      * the aggregation name
      */
    sAggregationName: String,
      /**
      * the matchers to filter aggregation items
      */
    vMatchers: js.Function,
      /**
      * the actions to be performed on matching aggregation items
      */
    vActions: typings.openui5.sapUiTestActionsActionMod.default
    ): this.type = js.native
    def doOnAggregation(
      /**
      * the aggregation name
      */
    sAggregationName: String,
      /**
      * the matchers to filter aggregation items
      */
    vMatchers: js.Object,
      /**
      * the actions to be performed on matching aggregation items
      */
    vActions: js.Array[Any]
    ): this.type = js.native
    def doOnAggregation(
      /**
      * the aggregation name
      */
    sAggregationName: String,
      /**
      * the matchers to filter aggregation items
      */
    vMatchers: js.Object,
      /**
      * the actions to be performed on matching aggregation items
      */
    vActions: js.Function
    ): this.type = js.native
    def doOnAggregation(
      /**
      * the aggregation name
      */
    sAggregationName: String,
      /**
      * the matchers to filter aggregation items
      */
    vMatchers: js.Object,
      /**
      * the actions to be performed on matching aggregation items
      */
    vActions: typings.openui5.sapUiTestActionsActionMod.default
    ): this.type = js.native
    def doOnAggregation(
      /**
      * the aggregation name
      */
    sAggregationName: String,
      /**
      * the matchers to filter aggregation items
      */
    vMatchers: typings.openui5.sapUiTestMatchersMatcherMod.default,
      /**
      * the actions to be performed on matching aggregation items
      */
    vActions: js.Array[Any]
    ): this.type = js.native
    def doOnAggregation(
      /**
      * the aggregation name
      */
    sAggregationName: String,
      /**
      * the matchers to filter aggregation items
      */
    vMatchers: typings.openui5.sapUiTestMatchersMatcherMod.default,
      /**
      * the actions to be performed on matching aggregation items
      */
    vActions: js.Function
    ): this.type = js.native
    /**
      * Performs given actions on all items of an aggregation fulfilling the matchers.
      *
      * @returns this OpaBuilder instance
      */
    def doOnAggregation(
      /**
      * the aggregation name
      */
    sAggregationName: String,
      /**
      * the matchers to filter aggregation items
      */
    vMatchers: typings.openui5.sapUiTestMatchersMatcherMod.default,
      /**
      * the actions to be performed on matching aggregation items
      */
    vActions: typings.openui5.sapUiTestActionsActionMod.default
    ): this.type = js.native
    
    /**
      * Executes a builder with matching controls being descendants of matching target control(s). Children are
      * any controls in the control tree beneath this target control(s).
      *
      * @returns this OpaBuilder instance
      */
    def doOnChildren(): this.type = js.native
    def doOnChildren(/**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: js.Array[Any]): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: js.Array[Any],
      /**
      * the actions to be performed on matching child items
      */
    vActions: js.Array[Any]
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: js.Array[Any],
      /**
      * the actions to be performed on matching child items
      */
    vActions: js.Array[Any],
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: js.Array[Any],
      /**
      * the actions to be performed on matching child items
      */
    vActions: js.Function
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: js.Array[Any],
      /**
      * the actions to be performed on matching child items
      */
    vActions: js.Function,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: js.Array[Any],
      /**
      * the actions to be performed on matching child items
      */
    vActions: Unit,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: js.Array[Any],
      /**
      * the actions to be performed on matching child items
      */
    vActions: typings.openui5.sapUiTestActionsActionMod.default
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: js.Array[Any],
      /**
      * the actions to be performed on matching child items
      */
    vActions: typings.openui5.sapUiTestActionsActionMod.default,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): this.type = js.native
    def doOnChildren(/**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: js.Function): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: js.Function,
      /**
      * the actions to be performed on matching child items
      */
    vActions: js.Array[Any]
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: js.Function,
      /**
      * the actions to be performed on matching child items
      */
    vActions: js.Array[Any],
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: js.Function,
      /**
      * the actions to be performed on matching child items
      */
    vActions: js.Function
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: js.Function,
      /**
      * the actions to be performed on matching child items
      */
    vActions: js.Function,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: js.Function,
      /**
      * the actions to be performed on matching child items
      */
    vActions: Unit,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: js.Function,
      /**
      * the actions to be performed on matching child items
      */
    vActions: typings.openui5.sapUiTestActionsActionMod.default
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: js.Function,
      /**
      * the actions to be performed on matching child items
      */
    vActions: typings.openui5.sapUiTestActionsActionMod.default,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): this.type = js.native
    def doOnChildren(/**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: js.Object): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: js.Object,
      /**
      * the actions to be performed on matching child items
      */
    vActions: js.Array[Any]
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: js.Object,
      /**
      * the actions to be performed on matching child items
      */
    vActions: js.Array[Any],
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: js.Object,
      /**
      * the actions to be performed on matching child items
      */
    vActions: js.Function
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: js.Object,
      /**
      * the actions to be performed on matching child items
      */
    vActions: js.Function,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: js.Object,
      /**
      * the actions to be performed on matching child items
      */
    vActions: Unit,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: js.Object,
      /**
      * the actions to be performed on matching child items
      */
    vActions: typings.openui5.sapUiTestActionsActionMod.default
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: js.Object,
      /**
      * the actions to be performed on matching child items
      */
    vActions: typings.openui5.sapUiTestActionsActionMod.default,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: Unit,
      /**
      * the actions to be performed on matching child items
      */
    vActions: js.Array[Any]
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: Unit,
      /**
      * the actions to be performed on matching child items
      */
    vActions: js.Array[Any],
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: Unit,
      /**
      * the actions to be performed on matching child items
      */
    vActions: js.Function
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: Unit,
      /**
      * the actions to be performed on matching child items
      */
    vActions: js.Function,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: Unit,
      /**
      * the actions to be performed on matching child items
      */
    vActions: Unit,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: Unit,
      /**
      * the actions to be performed on matching child items
      */
    vActions: typings.openui5.sapUiTestActionsActionMod.default
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: Unit,
      /**
      * the actions to be performed on matching child items
      */
    vActions: typings.openui5.sapUiTestActionsActionMod.default,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: typings.openui5.sapUiTestMatchersMatcherMod.default
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: typings.openui5.sapUiTestMatchersMatcherMod.default,
      /**
      * the actions to be performed on matching child items
      */
    vActions: js.Array[Any]
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: typings.openui5.sapUiTestMatchersMatcherMod.default,
      /**
      * the actions to be performed on matching child items
      */
    vActions: js.Array[Any],
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: typings.openui5.sapUiTestMatchersMatcherMod.default,
      /**
      * the actions to be performed on matching child items
      */
    vActions: js.Function
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: typings.openui5.sapUiTestMatchersMatcherMod.default,
      /**
      * the actions to be performed on matching child items
      */
    vActions: js.Function,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: typings.openui5.sapUiTestMatchersMatcherMod.default,
      /**
      * the actions to be performed on matching child items
      */
    vActions: Unit,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: typings.openui5.sapUiTestMatchersMatcherMod.default,
      /**
      * the actions to be performed on matching child items
      */
    vActions: typings.openui5.sapUiTestActionsActionMod.default
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: typings.openui5.sapUiTestMatchersMatcherMod.default,
      /**
      * the actions to be performed on matching child items
      */
    vActions: typings.openui5.sapUiTestActionsActionMod.default,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): this.type = js.native
    def doOnChildren(/**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: OpaBuilder): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: OpaBuilder,
      /**
      * the actions to be performed on matching child items
      */
    vActions: js.Array[Any]
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: OpaBuilder,
      /**
      * the actions to be performed on matching child items
      */
    vActions: js.Array[Any],
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: OpaBuilder,
      /**
      * the actions to be performed on matching child items
      */
    vActions: js.Function
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: OpaBuilder,
      /**
      * the actions to be performed on matching child items
      */
    vActions: js.Function,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: OpaBuilder,
      /**
      * the actions to be performed on matching child items
      */
    vActions: Unit,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: OpaBuilder,
      /**
      * the actions to be performed on matching child items
      */
    vActions: typings.openui5.sapUiTestActionsActionMod.default
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: OpaBuilder,
      /**
      * the actions to be performed on matching child items
      */
    vActions: typings.openui5.sapUiTestActionsActionMod.default,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): this.type = js.native
    
    /**
      * Executes a {@link sap.ui.test.actions.Press} action on target control(s).
      *
      * @returns this OpaBuilder instance
      */
    def doPress(): this.type = js.native
    def doPress(
      /**
      * the id suffix of the DOM Element the press action will be executed on
      */
    sIdSuffix: String
    ): this.type = js.native
    
    /**
      * Adds an error message or function.
      *
      * @returns this OpaBuilder instance
      */
    def error(/**
      * the message to be shown (or function executed) on failure
      */
    vErrorMessage: String): this.type = js.native
    def error(
      /**
      * the message to be shown (or function executed) on failure
      */
    vErrorMessage: String,
      /**
      * true to replace all previous defined error functions, false to add it (default)
      */
    bReplace: Boolean
    ): this.type = js.native
    def error(/**
      * the message to be shown (or function executed) on failure
      */
    vErrorMessage: js.Function): this.type = js.native
    def error(
      /**
      * the message to be shown (or function executed) on failure
      */
    vErrorMessage: js.Function,
      /**
      * true to replace all previous defined error functions, false to add it (default)
      */
    bReplace: Boolean
    ): this.type = js.native
    
    /**
      * Executes the definition on the given or previously defined Opa5 instance.
      *
      * @returns an object extending a jQuery promise, corresponding to the result of {@link sap.ui.test.Opa5#waitFor}
      */
    def execute(): js.Object = js.native
    def execute(
      /**
      * the Opa5 instance to call {@link sap.ui.test.Opa5#waitFor} on
      */
    oOpaInstance: typings.openui5.sapUiTestOpa5Mod.default
    ): js.Object = js.native
    
    /**
      * Sets the `fragmentId` parameter.
      *
      * @returns this OpaBuilder instance
      */
    def fragmentId(/**
      * the fragment id
      */
    sFragmentId: String): this.type = js.native
    
    /**
      * Get the Opa5 instance that will be used for {@link sap.ui.test.OpaBuilder#execute}. If no {sap.ui.test.Opa5}
      * instance was set before, this function creates a new one lazily.
      *
      * @returns the Opa5 instance
      */
    def getOpaInstance(): typings.openui5.sapUiTestOpa5Mod.default = js.native
    
    def has(/**
      * additional matchers to filter target control(s)
      */
    vMatchers: js.Array[Any]): this.type = js.native
    def has(
      /**
      * additional matchers to filter target control(s)
      */
    vMatchers: js.Array[Any],
      /**
      * true to replace all previous defined matchers, false to add it (default)
      */
    bReplace: Boolean
    ): this.type = js.native
    def has(/**
      * additional matchers to filter target control(s)
      */
    vMatchers: js.Function): this.type = js.native
    def has(
      /**
      * additional matchers to filter target control(s)
      */
    vMatchers: js.Function,
      /**
      * true to replace all previous defined matchers, false to add it (default)
      */
    bReplace: Boolean
    ): this.type = js.native
    def has(/**
      * additional matchers to filter target control(s)
      */
    vMatchers: js.Object): this.type = js.native
    def has(
      /**
      * additional matchers to filter target control(s)
      */
    vMatchers: js.Object,
      /**
      * true to replace all previous defined matchers, false to add it (default)
      */
    bReplace: Boolean
    ): this.type = js.native
    /**
      * Defines additional matchers for the target control(s).
      *
      * @returns this OpaBuilder instance
      */
    def has(
      /**
      * additional matchers to filter target control(s)
      */
    vMatchers: typings.openui5.sapUiTestMatchersMatcherMod.default
    ): this.type = js.native
    def has(
      /**
      * additional matchers to filter target control(s)
      */
    vMatchers: typings.openui5.sapUiTestMatchersMatcherMod.default,
      /**
      * true to replace all previous defined matchers, false to add it (default)
      */
    bReplace: Boolean
    ): this.type = js.native
    
    /**
      * Adds matchers to aggregation items, that at least one aggregation item must match.
      *
      * @returns this OpaBuilder instance
      */
    def hasAggregation(/**
      * the aggregation name
      */
    sAggregationName: String): this.type = js.native
    def hasAggregation(
      /**
      * the aggregation name
      */
    sAggregationName: String,
      /**
      * matchers to filter aggregation items
      */
    vMatchers: js.Array[Any]
    ): this.type = js.native
    def hasAggregation(
      /**
      * the aggregation name
      */
    sAggregationName: String,
      /**
      * matchers to filter aggregation items
      */
    vMatchers: js.Function
    ): this.type = js.native
    def hasAggregation(
      /**
      * the aggregation name
      */
    sAggregationName: String,
      /**
      * matchers to filter aggregation items
      */
    vMatchers: js.Object
    ): this.type = js.native
    def hasAggregation(
      /**
      * the aggregation name
      */
    sAggregationName: String,
      /**
      * matchers to filter aggregation items
      */
    vMatchers: typings.openui5.sapUiTestMatchersMatcherMod.default
    ): this.type = js.native
    
    /**
      * Adds a matcher that checks for a certain number of aggregation items.
      *
      * @returns this OpaBuilder instance
      */
    def hasAggregationLength(
      /**
      * the aggregation name
      */
    sAggregationName: String,
      /**
      * length to check against
      */
    iNumber: int
    ): this.type = js.native
    
    /**
      * Adds a matcher to aggregation items checking for certain properties. At least one item must match the
      * properties.
      *
      * @returns this OpaBuilder instance
      */
    def hasAggregationProperties(
      /**
      * the aggregation name
      */
    sAggregationName: String,
      /**
      * map of properties that aggregation item must match
      */
    oProperties: js.Object
    ): this.type = js.native
    
    /**
      * Adds a matcher that checks whether at least one child fulfilling given matcher(s).
      *
      * @returns this OpaBuilder instance
      */
    def hasChildren(): this.type = js.native
    def hasChildren(/**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: js.Array[Any]): this.type = js.native
    def hasChildren(
      /**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: js.Array[Any],
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): this.type = js.native
    def hasChildren(/**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: js.Function): this.type = js.native
    def hasChildren(
      /**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: js.Function,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): this.type = js.native
    def hasChildren(/**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: js.Object): this.type = js.native
    def hasChildren(
      /**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: js.Object,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): this.type = js.native
    def hasChildren(
      /**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: Unit,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): this.type = js.native
    def hasChildren(
      /**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: typings.openui5.sapUiTestMatchersMatcherMod.default
    ): this.type = js.native
    def hasChildren(
      /**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: typings.openui5.sapUiTestMatchersMatcherMod.default,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): this.type = js.native
    def hasChildren(/**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: OpaBuilder): this.type = js.native
    def hasChildren(
      /**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: OpaBuilder,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): this.type = js.native
    
    /**
      * Adds a matcher that checks states for given conditions. It is internally using {@link sap.ui.test.OpaBuilder.Matchers.conditional}.
      *
      * @returns this OpaBuilder instance
      */
    def hasConditional(
      /**
      * conditions to pre-check
      */
    vConditions: typings.openui5.sapUiTestMatchersMatcherMod.default | js.Function | js.Array[Any] | js.Object | Boolean,
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: typings.openui5.sapUiTestMatchersMatcherMod.default | js.Function | js.Array[Any] | js.Object,
      /**
      * actual matcher that is executed if conditions are not met
      */
    vElseMatcher: js.UndefOr[
          typings.openui5.sapUiTestMatchersMatcherMod.default | js.Function | js.Array[Any] | js.Object
        ]
    ): this.type = js.native
    
    /**
      * Adds a matcher for given properties.
      *
      * @returns this OpaBuilder instance
      */
    def hasI18NText(
      /**
      * the name of the property to check for i18n text
      */
    sPropertyName: String,
      /**
      * the path to the I18N text. If model is omitted, `i18n` is used as model name.
      */
    sModelTokenPath: String
    ): this.type = js.native
    def hasI18NText(
      /**
      * the name of the property to check for i18n text
      */
    sPropertyName: String,
      /**
      * the path to the I18N text. If model is omitted, `i18n` is used as model name.
      */
    sModelTokenPath: String,
      /**
      * the values to be used instead of the placeholders
      */
    aParameters: js.Array[Any]
    ): this.type = js.native
    
    /**
      * Defines the id of the target control(s).
      *
      * @returns this OpaBuilder instance
      */
    def hasId(/**
      * the id of the target control(s)
      */
    vId: String): this.type = js.native
    def hasId(/**
      * the id of the target control(s)
      */
    vId: js.RegExp): this.type = js.native
    
    /**
      * Adds a matcher for given properties.
      *
      * @returns this OpaBuilder instance
      */
    def hasProperties(/**
      * map of properties that target control(s) must match
      */
    oProperties: js.Object): this.type = js.native
    
    /**
      * Adds a group of matchers that requires only one of them to actually match. It is internally using {@link
      * sap.ui.test.OpaBuilder.Matchers.some}.
      *
      * @returns this OpaBuilder instance
      */
    def hasSome(): this.type = js.native
    def hasSome(/**
      * aMatchers list of matchers were one must be met
      */
    aMatchers: js.Array[Any]): this.type = js.native
    def hasSome(/**
      * aMatchers list of matchers were one must be met
      */
    aMatchers: js.Function): this.type = js.native
    def hasSome(/**
      * aMatchers list of matchers were one must be met
      */
    aMatchers: js.Object): this.type = js.native
    def hasSome(
      /**
      * aMatchers list of matchers were one must be met
      */
    aMatchers: typings.openui5.sapUiTestMatchersMatcherMod.default
    ): this.type = js.native
    
    /**
      * Defines the control type of the target control(s).
      *
      * @returns this OpaBuilder instance
      */
    def hasType(/**
      * the type of the target control(s)
      */
    sControlType: String): this.type = js.native
    
    /**
      * Defines whether target control is part of a popover or dialog (sets `searchOpenDialogs` property).
      *
      * @returns this OpaBuilder instance
      */
    def isDialogElement(): this.type = js.native
    def isDialogElement(
      /**
      * can be set to false to disable `searchOpenDialogs`, set to true if omitted
      */
    bDialog: Boolean
    ): this.type = js.native
    
    /**
      * Sets the `enabled` parameter.
      *
      * @returns this OpaBuilder instance
      */
    def mustBeEnabled(): this.type = js.native
    def mustBeEnabled(
      /**
      * can be set to false to prevent `enabled` check, set to true if omitted
      */
    bEnabled: Boolean
    ): this.type = js.native
    
    /**
      * Sets the `autoWait` parameter.
      *
      * @returns this OpaBuilder instance
      */
    def mustBeReady(): this.type = js.native
    def mustBeReady(/**
      * can be set to false to prevent `autoWait`, set to true if omitted
      */
    bReady: Boolean): this.type = js.native
    
    /**
      * Sets the `visible` parameter.
      *
      * @returns this OpaBuilder instance
      */
    def mustBeVisible(): this.type = js.native
    def mustBeVisible(
      /**
      * can be set to false to prevent `visible` check, set to true if omitted
      */
    bVisible: Boolean
    ): this.type = js.native
    
    /**
      * Apply custom options. The options might override previously defined options of the OpaBuilder.
      *
      * @returns this OpaBuilder instance
      */
    def options(/**
      * the {@link sap.ui.test.Opa5#waitFor} options to apply
      */
    oOptions: js.Object): this.type = js.native
    
    /**
      * Sets the `pollingInterval` parameter.
      *
      * @returns this OpaBuilder instance
      */
    def pollingInterval(/**
      * the polling interval in milliseconds
      */
    iPollingInterval: int): this.type = js.native
    
    /**
      * Set the Opa5 instance to be used for {@link sap.ui.test.OpaBuilder#execute}. Please note that this function
      * does not return the OpaBuilder instance and can therefore not be chained. Use the `oOpaInstance` argument
      * of {@link sap.ui.test.OpaBuilder.create}, {@link sap.ui.test.OpaBuilder#constructor} or {@link sap.ui.test.OpaBuilder#execute}
      * to provide the Opa5 instance within the builder chain.
      */
    def setOpaInstance(): Unit = js.native
    def setOpaInstance(
      /**
      * the Opa5 instance to operate on
      */
    oOpaInstance: typings.openui5.sapUiTestOpa5Mod.default
    ): Unit = js.native
    
    /**
      * Adds a success message or function. When providing an OpaBuilder, the action will execute it.
      *
      * @returns this OpaBuilder instance
      */
    def success(/**
      * the message that will be shown (or function executed) on success
      */
    vSuccess: String): this.type = js.native
    def success(
      /**
      * the message that will be shown (or function executed) on success
      */
    vSuccess: String,
      /**
      * true to replace all previous defined success functions, false to add it (default)
      */
    bReplace: Boolean
    ): this.type = js.native
    def success(
      /**
      * the message that will be shown (or function executed) on success
      */
    vSuccess: js.Function
    ): this.type = js.native
    def success(
      /**
      * the message that will be shown (or function executed) on success
      */
    vSuccess: js.Function,
      /**
      * true to replace all previous defined success functions, false to add it (default)
      */
    bReplace: Boolean
    ): this.type = js.native
    def success(/**
      * the message that will be shown (or function executed) on success
      */
    vSuccess: OpaBuilder): this.type = js.native
    def success(
      /**
      * the message that will be shown (or function executed) on success
      */
    vSuccess: OpaBuilder,
      /**
      * true to replace all previous defined success functions, false to add it (default)
      */
    bReplace: Boolean
    ): this.type = js.native
    
    /**
      * Sets the `timeout` parameter.
      *
      * @returns this OpaBuilder instance
      */
    def timeout(/**
      * the timeout in seconds
      */
    iTimeout: int): this.type = js.native
    
    /**
      * Sets the `viewId` parameter.
      *
      * @returns this OpaBuilder instance
      */
    def viewId(/**
      * the viewId
      */
    sViewId: String): this.type = js.native
    
    /**
      * Sets the `viewName` parameter.
      *
      * @returns this OpaBuilder instance
      */
    def viewName(/**
      * the viewName
      */
    sViewName: String): this.type = js.native
    
    /**
      * Sets the `viewNamespace` parameter.
      *
      * @returns this OpaBuilder instance
      */
    def viewNamespace(/**
      * the viewNamespace
      */
    sViewNamespace: String): this.type = js.native
  }
}
