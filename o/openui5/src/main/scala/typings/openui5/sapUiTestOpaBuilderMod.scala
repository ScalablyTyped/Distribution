package typings.openui5

import typings.openui5.anon.AggregationLengthEquals
import typings.openui5.anon.Ancestor
import typings.openui5.anon.BindingPath
import typings.openui5.anon.Descendant
import typings.openui5.anon.I18NText
import typings.openui5.anon.LabelFor
import typings.openui5.anon.Properties
import typings.openui5.sapUiTestOpa5Mod.Action
import typings.openui5.sapUiTestOpa5Mod.Matcher
import typings.openui5.sapUiTestOpa5Mod.MultiControlSelector
import typings.openui5.sapUiTestOpa5Mod.SingleControlSelector
import typings.std.Record
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
    oOptions: MultiControlSelector
    ) = this()
    def this(
      /**
      * the Opa5 instance to operate on
      */
    oOpaInstance: Unit,
      /**
      * the initial {@link sap.ui.test.Opa5#waitFor} options
      */
    oOptions: SingleControlSelector
    ) = this()
    def this(
      /**
      * the Opa5 instance to operate on
      */
    oOpaInstance: typings.openui5.sapUiTestOpa5Mod.default,
      /**
      * the initial {@link sap.ui.test.Opa5#waitFor} options
      */
    oOptions: MultiControlSelector
    ) = this()
    def this(
      /**
      * the Opa5 instance to operate on
      */
    oOpaInstance: typings.openui5.sapUiTestOpa5Mod.default,
      /**
      * the initial {@link sap.ui.test.Opa5#waitFor} options
      */
    oOptions: SingleControlSelector
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/test/OpaBuilder", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A collection of predefined actions. See also {@link sap.ui.test.actions}.
      */
    @JSImport("sap/ui/test/OpaBuilder", "default.Actions")
    @js.native
    def Actions: typings.openui5.sapUiTestOpaBuilderMod.Actions = js.native
    inline def Actions_=(x: typings.openui5.sapUiTestOpaBuilderMod.Actions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Actions")(x.asInstanceOf[js.Any])
    
    /**
      * A collection of predefined matchers. See also {@link sap.ui.test.matchers}
      */
    @JSImport("sap/ui/test/OpaBuilder", "default.Matchers")
    @js.native
    def Matchers: typings.openui5.sapUiTestOpaBuilderMod.Matchers = js.native
    inline def Matchers_=(x: typings.openui5.sapUiTestOpaBuilderMod.Matchers): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Matchers")(x.asInstanceOf[js.Any])
    
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
    vMatchers: js.UndefOr[Matcher | js.Array[Matcher]],
      /**
      * the actions to be performed on target control(s)
      */
    vActions: js.UndefOr[Action | js.Array[Action]],
      /**
      * oOptions the {@link sap.ui.test.Opa5#waitFor} options to apply
      */
    oOptions: js.UndefOr[SingleControlSelector | MultiControlSelector]
    ): OpaBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(oOpaInstance.asInstanceOf[js.Any], vId.asInstanceOf[js.Any], sControlType.asInstanceOf[js.Any], bDialogElement.asInstanceOf[js.Any], vMatchers.asInstanceOf[js.Any], vActions.asInstanceOf[js.Any], oOptions.asInstanceOf[js.Any])).asInstanceOf[OpaBuilder]
    
    /**
      * Set or get the default options to be used as the builder base. If no options are provided, the current
      * default options are returned.
      *
      * @returns the default {@link sap.ui.test.Opa5#waitFor} options
      */
    inline def defaultOptions(): SingleControlSelector | MultiControlSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultOptions")().asInstanceOf[SingleControlSelector | MultiControlSelector]
    inline def defaultOptions(/**
      * the new default options to be used
      */
    oOptions: MultiControlSelector): SingleControlSelector | MultiControlSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultOptions")(oOptions.asInstanceOf[js.Any]).asInstanceOf[SingleControlSelector | MultiControlSelector]
    inline def defaultOptions(/**
      * the new default options to be used
      */
    oOptions: SingleControlSelector): SingleControlSelector | MultiControlSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultOptions")(oOptions.asInstanceOf[js.Any]).asInstanceOf[SingleControlSelector | MultiControlSelector]
  }
  
  /**
    * A collection of predefined actions. See also {@link sap.ui.test.actions}.
    */
  @js.native
  trait Actions extends StObject {
    
    def conditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: js.Array[Matcher],
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessBuilderOrOptions: js.Array[Action]
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: js.Array[Matcher],
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessBuilderOrOptions: js.Array[Action],
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseBuilderOptions: js.Array[Action]
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: js.Array[Matcher],
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessBuilderOrOptions: js.Array[Action],
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseBuilderOptions: Action
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: js.Array[Matcher],
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessBuilderOrOptions: js.Array[Action],
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseBuilderOptions: OpaBuilder
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: js.Array[Matcher],
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessBuilderOrOptions: Action
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: js.Array[Matcher],
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessBuilderOrOptions: Action,
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseBuilderOptions: js.Array[Action]
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: js.Array[Matcher],
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessBuilderOrOptions: Action,
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseBuilderOptions: Action
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: js.Array[Matcher],
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessBuilderOrOptions: Action,
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseBuilderOptions: OpaBuilder
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: js.Array[Matcher],
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessBuilderOrOptions: OpaBuilder
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: js.Array[Matcher],
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessBuilderOrOptions: OpaBuilder,
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseBuilderOptions: js.Array[Action]
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: js.Array[Matcher],
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessBuilderOrOptions: OpaBuilder,
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseBuilderOptions: Action
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: js.Array[Matcher],
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessBuilderOrOptions: OpaBuilder,
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseBuilderOptions: OpaBuilder
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: Boolean,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessBuilderOrOptions: js.Array[Action]
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: Boolean,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessBuilderOrOptions: js.Array[Action],
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseBuilderOptions: js.Array[Action]
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: Boolean,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessBuilderOrOptions: js.Array[Action],
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseBuilderOptions: Action
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: Boolean,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessBuilderOrOptions: js.Array[Action],
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseBuilderOptions: OpaBuilder
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: Boolean,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessBuilderOrOptions: Action
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: Boolean,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessBuilderOrOptions: Action,
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseBuilderOptions: js.Array[Action]
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: Boolean,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessBuilderOrOptions: Action,
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseBuilderOptions: Action
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: Boolean,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessBuilderOrOptions: Action,
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseBuilderOptions: OpaBuilder
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: Boolean,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessBuilderOrOptions: OpaBuilder
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: Boolean,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessBuilderOrOptions: OpaBuilder,
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseBuilderOptions: js.Array[Action]
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: Boolean,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessBuilderOrOptions: OpaBuilder,
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseBuilderOptions: Action
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: Boolean,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessBuilderOrOptions: OpaBuilder,
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseBuilderOptions: OpaBuilder
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: Matcher,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessBuilderOrOptions: js.Array[Action]
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: Matcher,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessBuilderOrOptions: js.Array[Action],
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseBuilderOptions: js.Array[Action]
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: Matcher,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessBuilderOrOptions: js.Array[Action],
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseBuilderOptions: Action
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: Matcher,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessBuilderOrOptions: js.Array[Action],
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseBuilderOptions: OpaBuilder
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    /**
      * Creates an action that is only performed if target control fulfills the conditions.
      *
      * @returns an action function
      */
    def conditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: Matcher,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessBuilderOrOptions: Action
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: Matcher,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessBuilderOrOptions: Action,
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseBuilderOptions: js.Array[Action]
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: Matcher,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessBuilderOrOptions: Action,
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseBuilderOptions: Action
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: Matcher,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessBuilderOrOptions: Action,
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseBuilderOptions: OpaBuilder
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: Matcher,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessBuilderOrOptions: OpaBuilder
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: Matcher,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessBuilderOrOptions: OpaBuilder,
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseBuilderOptions: js.Array[Action]
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: Matcher,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessBuilderOrOptions: OpaBuilder,
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseBuilderOptions: Action
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: Matcher,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessBuilderOrOptions: OpaBuilder,
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseBuilderOptions: OpaBuilder
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    
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
    vActions: js.Array[Action]): js.Function1[
        /* p1 */ typings.openui5.sapUiCoreElementMod.default | js.Array[typings.openui5.sapUiCoreElementMod.default], 
        Unit
      ] = js.native
    /**
      * Creates an action function that executes all given actions on a single or an array of controls. This
      * method can be used as a helper for handling the different kinds of action definitions and inputs.
      *
      * @returns an action function
      */
    def executor(/**
      * the actions to be executed
      */
    vActions: Action): js.Function1[
        /* p1 */ typings.openui5.sapUiCoreElementMod.default | js.Array[typings.openui5.sapUiCoreElementMod.default], 
        Unit
      ] = js.native
    
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
  
  /**
    * A collection of predefined matchers. See also {@link sap.ui.test.matchers}
    */
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
    sAggregationName: String): js.Function1[
        /* p1 */ typings.openui5.sapUiCoreElementMod.default, 
        js.Array[typings.openui5.sapUiCoreElementMod.default]
      ] = js.native
    def aggregation(
      /**
      * the aggregation name
      */
    sAggregationName: String,
      /**
      * the matchers to filter aggregation items
      */
    vMatchers: js.Array[Matcher]
    ): js.Function1[
        /* p1 */ typings.openui5.sapUiCoreElementMod.default, 
        js.Array[typings.openui5.sapUiCoreElementMod.default]
      ] = js.native
    def aggregation(
      /**
      * the aggregation name
      */
    sAggregationName: String,
      /**
      * the matchers to filter aggregation items
      */
    vMatchers: Matcher
    ): js.Function1[
        /* p1 */ typings.openui5.sapUiCoreElementMod.default, 
        js.Array[typings.openui5.sapUiCoreElementMod.default]
      ] = js.native
    
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
    ): AggregationLengthEquals = js.native
    
    /**
      * Checks whether at least one aggregation item fulfills given matcher(s).
      *
      * @returns matcher function
      */
    def aggregationMatcher(/**
      * the aggregation name
      */
    sAggregationName: String): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Boolean] = js.native
    def aggregationMatcher(
      /**
      * the aggregation name
      */
    sAggregationName: String,
      /**
      * the matchers to filter aggregation items
      */
    vMatchers: js.Array[Matcher]
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Boolean] = js.native
    def aggregationMatcher(
      /**
      * the aggregation name
      */
    sAggregationName: String,
      /**
      * the matchers to filter aggregation items
      */
    vMatchers: Matcher
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Boolean] = js.native
    
    def ancestor(
      /**
      * the ancestor control to check, if undefined, validates every control to true. Can be a control or a control
      * ID
      */
    vAncestor: String
    ): Ancestor = js.native
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
    ): Ancestor = js.native
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
    ): Ancestor = js.native
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
    ): Ancestor = js.native
    
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
    ): BindingPath = js.native
    
    /**
      * Creates a matcher that checks whether the bound context or model has the given properties.
      *
      * @returns the matcher function checks all path in the properties object against the binding context
      */
    def bindingProperties(/**
      * the property-path map with expected values
      */
    oProperties: Record[String, Any]): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Boolean] = js.native
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
    oProperties: Record[String, Any]
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Boolean] = js.native
    
    /**
      * Creates a matcher function that returns all children fulfilling given matcher(s). The result will always
      * be an array, even if only one child was found.
      *
      * @returns matcher function returning all matching children
      */
    def children(): js.Function1[
        /* p1 */ typings.openui5.sapUiCoreElementMod.default, 
        js.Array[typings.openui5.sapUiCoreElementMod.default]
      ] = js.native
    def children(/**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: js.Array[Matcher]): js.Function1[
        /* p1 */ typings.openui5.sapUiCoreElementMod.default, 
        js.Array[typings.openui5.sapUiCoreElementMod.default]
      ] = js.native
    def children(
      /**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: js.Array[Matcher],
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): js.Function1[
        /* p1 */ typings.openui5.sapUiCoreElementMod.default, 
        js.Array[typings.openui5.sapUiCoreElementMod.default]
      ] = js.native
    def children(
      /**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: Unit,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): js.Function1[
        /* p1 */ typings.openui5.sapUiCoreElementMod.default, 
        js.Array[typings.openui5.sapUiCoreElementMod.default]
      ] = js.native
    def children(/**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: Matcher): js.Function1[
        /* p1 */ typings.openui5.sapUiCoreElementMod.default, 
        js.Array[typings.openui5.sapUiCoreElementMod.default]
      ] = js.native
    def children(
      /**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: Matcher,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): js.Function1[
        /* p1 */ typings.openui5.sapUiCoreElementMod.default, 
        js.Array[typings.openui5.sapUiCoreElementMod.default]
      ] = js.native
    def children(/**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: OpaBuilder): js.Function1[
        /* p1 */ typings.openui5.sapUiCoreElementMod.default, 
        js.Array[typings.openui5.sapUiCoreElementMod.default]
      ] = js.native
    def children(
      /**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: OpaBuilder,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): js.Function1[
        /* p1 */ typings.openui5.sapUiCoreElementMod.default, 
        js.Array[typings.openui5.sapUiCoreElementMod.default]
      ] = js.native
    
    /**
      * Creates a matcher function that checks whether one children fulfilling given matcher(s).
      *
      * @returns matcher function
      */
    def childrenMatcher(): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Boolean] = js.native
    def childrenMatcher(/**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: js.Array[Matcher]): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Boolean] = js.native
    def childrenMatcher(
      /**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: js.Array[Matcher],
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Boolean] = js.native
    def childrenMatcher(
      /**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: Unit,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Boolean] = js.native
    def childrenMatcher(/**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: Matcher): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Boolean] = js.native
    def childrenMatcher(
      /**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: Matcher,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Boolean] = js.native
    def childrenMatcher(/**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: OpaBuilder): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Boolean] = js.native
    def childrenMatcher(
      /**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: OpaBuilder,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Boolean] = js.native
    
    def conditional(
      /**
      * conditions to pre-check
      */
    vConditions: js.Array[Matcher],
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: js.Array[Matcher]
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * conditions to pre-check
      */
    vConditions: js.Array[Matcher],
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: js.Array[Matcher],
      /**
      * actual matcher that is executed if conditions are not met
      */
    vElseMatcher: js.Array[Matcher]
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * conditions to pre-check
      */
    vConditions: js.Array[Matcher],
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: js.Array[Matcher],
      /**
      * actual matcher that is executed if conditions are not met
      */
    vElseMatcher: Matcher
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * conditions to pre-check
      */
    vConditions: js.Array[Matcher],
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: Matcher
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * conditions to pre-check
      */
    vConditions: js.Array[Matcher],
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: Matcher,
      /**
      * actual matcher that is executed if conditions are not met
      */
    vElseMatcher: js.Array[Matcher]
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * conditions to pre-check
      */
    vConditions: js.Array[Matcher],
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: Matcher,
      /**
      * actual matcher that is executed if conditions are not met
      */
    vElseMatcher: Matcher
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * conditions to pre-check
      */
    vConditions: Boolean,
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: js.Array[Matcher]
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * conditions to pre-check
      */
    vConditions: Boolean,
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: js.Array[Matcher],
      /**
      * actual matcher that is executed if conditions are not met
      */
    vElseMatcher: js.Array[Matcher]
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * conditions to pre-check
      */
    vConditions: Boolean,
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: js.Array[Matcher],
      /**
      * actual matcher that is executed if conditions are not met
      */
    vElseMatcher: Matcher
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * conditions to pre-check
      */
    vConditions: Boolean,
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: Matcher
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * conditions to pre-check
      */
    vConditions: Boolean,
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: Matcher,
      /**
      * actual matcher that is executed if conditions are not met
      */
    vElseMatcher: js.Array[Matcher]
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * conditions to pre-check
      */
    vConditions: Boolean,
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: Matcher,
      /**
      * actual matcher that is executed if conditions are not met
      */
    vElseMatcher: Matcher
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * conditions to pre-check
      */
    vConditions: Matcher,
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: js.Array[Matcher]
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * conditions to pre-check
      */
    vConditions: Matcher,
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: js.Array[Matcher],
      /**
      * actual matcher that is executed if conditions are not met
      */
    vElseMatcher: js.Array[Matcher]
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * conditions to pre-check
      */
    vConditions: Matcher,
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: js.Array[Matcher],
      /**
      * actual matcher that is executed if conditions are not met
      */
    vElseMatcher: Matcher
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    /**
      * Creates a matcher that checks states for given conditions.
      *
      * @returns a matcher function
      */
    def conditional(
      /**
      * conditions to pre-check
      */
    vConditions: Matcher,
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: Matcher
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * conditions to pre-check
      */
    vConditions: Matcher,
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: Matcher,
      /**
      * actual matcher that is executed if conditions are not met
      */
    vElseMatcher: js.Array[Matcher]
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    def conditional(
      /**
      * conditions to pre-check
      */
    vConditions: Matcher,
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: Matcher,
      /**
      * actual matcher that is executed if conditions are not met
      */
    vElseMatcher: Matcher
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    
    /**
      * Creates a matcher that checks whether a control has all given custom data.
      *
      * @returns the matcher function checks for defined custom data
      */
    def customData(): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Boolean] = js.native
    def customData(
      /**
      * the map of custom data keys and their values to check against
      */
    oCustomData: Record[String, Any]
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Boolean] = js.native
    
    def descendant(
      /**
      * the descendant control to check. If undefined, it validates every control to true. Can be a control or
      * a control ID
      */
    vDescendent: String
    ): Descendant = js.native
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
    ): Descendant = js.native
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
    ): Descendant = js.native
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
    ): Descendant = js.native
    
    /**
      * Creates a matcher that checks all inputs against given matchers. The input can be an array or a single
      * element. The result will always be an array. If the input is a single element, the result will be an
      * array containing the given element (or empty if not matching the matchers).
      *
      * @returns the matcher function returns an array with all matching items
      */
    def filter(): js.Function1[
        /* p1 */ typings.openui5.sapUiCoreElementMod.default | js.Array[typings.openui5.sapUiCoreElementMod.default], 
        js.Array[typings.openui5.sapUiCoreElementMod.default]
      ] = js.native
    def filter(/**
      * the matchers to check all items against
      */
    vMatchers: js.Array[Matcher]): js.Function1[
        /* p1 */ typings.openui5.sapUiCoreElementMod.default | js.Array[typings.openui5.sapUiCoreElementMod.default], 
        js.Array[typings.openui5.sapUiCoreElementMod.default]
      ] = js.native
    def filter(/**
      * the matchers to check all items against
      */
    vMatchers: Matcher): js.Function1[
        /* p1 */ typings.openui5.sapUiCoreElementMod.default | js.Array[typings.openui5.sapUiCoreElementMod.default], 
        js.Array[typings.openui5.sapUiCoreElementMod.default]
      ] = js.native
    
    /**
      * Creates a matcher that checks whether a control has the focus.
      *
      * @returns a matcher function
      */
    def focused(): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Boolean] = js.native
    def focused(
      /**
      * set true to check additionally for the focus on any child element
      */
    bCheckChildren: Boolean
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Boolean] = js.native
    
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
    ): I18NText = js.native
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
    ): I18NText = js.native
    
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
    ): LabelFor = js.native
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
    ): LabelFor = js.native
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
    ): LabelFor = js.native
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
    ): LabelFor = js.native
    
    /**
      * Creates a matcher that checks a single input against all defined matchers.
      *
      * @returns the matcher function returns the result of the matcher chain
      */
    def `match`(): js.Function1[
        /* p1 */ typings.openui5.sapUiCoreElementMod.default | js.Array[typings.openui5.sapUiCoreElementMod.default], 
        Boolean
      ] = js.native
    def `match`(/**
      * the matchers to check all items against
      */
    vMatchers: js.Array[Matcher]): js.Function1[
        /* p1 */ typings.openui5.sapUiCoreElementMod.default | js.Array[typings.openui5.sapUiCoreElementMod.default], 
        Boolean
      ] = js.native
    def `match`(/**
      * the matchers to check all items against
      */
    vMatchers: Matcher): js.Function1[
        /* p1 */ typings.openui5.sapUiCoreElementMod.default | js.Array[typings.openui5.sapUiCoreElementMod.default], 
        Boolean
      ] = js.native
    
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
    def not(): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Boolean] = js.native
    def not(/**
      * the matchers that will actually be executed
      */
    vMatchers: js.Array[Matcher]): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Boolean] = js.native
    def not(/**
      * the matchers that will actually be executed
      */
    vMatchers: Matcher): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Boolean] = js.native
    
    /**
      * Creates a {@link sap.ui.test.matchers.Properties} matcher.
      *
      * @returns a declarative matcher definition for {@link sap.ui.test.matchers.Properties}
      */
    def properties(/**
      * the object with the properties to be checked
      */
    oProperties: Record[String, Any]): Properties = js.native
    
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
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
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
    ): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit] = js.native
    
    /**
      * Creates a matcher that checks for at least one successful match from a group of matchers.
      *
      * @returns a matcher function
      */
    def some(): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Boolean | Any] = js.native
    def some(/**
      * aMatchers list of matchers were one must be met
      */
    aMatchers: js.Array[Matcher]): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Boolean | Any] = js.native
    def some(/**
      * aMatchers list of matchers were one must be met
      */
    aMatchers: Matcher): js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Boolean | Any] = js.native
  }
  @JSImport("sap/ui/test/OpaBuilder", "Matchers")
  @js.native
  val Matchers: typings.openui5.sapUiTestOpaBuilderMod.Matchers = js.native
  
  type AncestorDefinition = js.Array[js.Object | String | Boolean]
  
  type DescendantDefinition = js.Array[js.Object | String | Boolean]
  
  trait I18NTextDefinition extends StObject {
    
    var key: String
    
    var modelName: String
    
    var parameters: js.UndefOr[js.Array[String]] = js.undefined
    
    var propertyName: String
  }
  object I18NTextDefinition {
    
    inline def apply(key: String, modelName: String, propertyName: String): I18NTextDefinition = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[I18NTextDefinition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: I18NTextDefinition] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setModelName(value: String): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
      
      inline def setParameters(value: js.Array[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setParametersVarargs(value: String*): Self = StObject.set(x, "parameters", js.Array(value*))
      
      inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    }
  }
  
  trait LabelForDefinition extends StObject {
    
    var key: js.UndefOr[String] = js.undefined
    
    var modelName: js.UndefOr[String] = js.undefined
    
    var parameters: js.UndefOr[js.Array[Any]] = js.undefined
    
    var propertyName: String
    
    var text: js.UndefOr[String] = js.undefined
  }
  object LabelForDefinition {
    
    inline def apply(propertyName: String): LabelForDefinition = {
      val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[LabelForDefinition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LabelForDefinition] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setModelName(value: String): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
      
      inline def setModelNameUndefined: Self = StObject.set(x, "modelName", js.undefined)
      
      inline def setParameters(value: js.Array[Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setParametersVarargs(value: Any*): Self = StObject.set(x, "parameters", js.Array(value*))
      
      inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait OpaBuilder extends StObject {
    
    /**
      * Build the final {@link sap.ui.test.Opa5#waitFor} options object and returns it.
      *
      * @returns the final options object
      */
    def build(): SingleControlSelector | MultiControlSelector = js.native
    
    /**
      * Add a check function. If another check function already exists, the functions are chained.
      *
      * @returns this OpaBuilder instance
      */
    def check(
      /**
      * the check that is executed on matched controls
      */
    fnCheck: js.Function1[
          /* p1 */ typings.openui5.sapUiCoreElementMod.default | js.Array[typings.openui5.sapUiCoreElementMod.default], 
          Boolean
        ]
    ): this.type = js.native
    def check(
      /**
      * the check that is executed on matched controls
      */
    fnCheck: js.Function1[
          /* p1 */ typings.openui5.sapUiCoreElementMod.default | js.Array[typings.openui5.sapUiCoreElementMod.default], 
          Boolean
        ],
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
    vActions: js.Array[Action]): this.type = js.native
    def `do`(
      /**
      * the action(s) to be performed on matched controls
      */
    vActions: js.Array[Action],
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
    def `do`(/**
      * the action(s) to be performed on matched controls
      */
    vActions: Action): this.type = js.native
    def `do`(
      /**
      * the action(s) to be performed on matched controls
      */
    vActions: Action,
      /**
      * true to replace all previous defined actions, false to add it (default)
      */
    bReplace: Boolean
    ): this.type = js.native
    
    def doConditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: js.Array[Matcher],
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessActions: js.Array[Action]
    ): this.type = js.native
    def doConditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: js.Array[Matcher],
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessActions: js.Array[Action],
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseActions: js.Array[Action]
    ): this.type = js.native
    def doConditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: js.Array[Matcher],
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessActions: js.Array[Action],
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseActions: Action
    ): this.type = js.native
    def doConditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: js.Array[Matcher],
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessActions: Action
    ): this.type = js.native
    def doConditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: js.Array[Matcher],
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessActions: Action,
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseActions: js.Array[Action]
    ): this.type = js.native
    def doConditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: js.Array[Matcher],
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessActions: Action,
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseActions: Action
    ): this.type = js.native
    def doConditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: Boolean,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessActions: js.Array[Action]
    ): this.type = js.native
    def doConditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: Boolean,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessActions: js.Array[Action],
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseActions: js.Array[Action]
    ): this.type = js.native
    def doConditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: Boolean,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessActions: js.Array[Action],
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseActions: Action
    ): this.type = js.native
    def doConditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: Boolean,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessActions: Action
    ): this.type = js.native
    def doConditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: Boolean,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessActions: Action,
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseActions: js.Array[Action]
    ): this.type = js.native
    def doConditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: Boolean,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessActions: Action,
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseActions: Action
    ): this.type = js.native
    def doConditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: Matcher,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessActions: js.Array[Action]
    ): this.type = js.native
    def doConditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: Matcher,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessActions: js.Array[Action],
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseActions: js.Array[Action]
    ): this.type = js.native
    def doConditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: Matcher,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessActions: js.Array[Action],
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseActions: Action
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
    vConditions: Matcher,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessActions: Action
    ): this.type = js.native
    def doConditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: Matcher,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessActions: Action,
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseActions: js.Array[Action]
    ): this.type = js.native
    def doConditional(
      /**
      * target control is checked against these given conditions
      */
    vConditions: Matcher,
      /**
      * the actions to be performed when conditions are fulfilled
      */
    vSuccessActions: Action,
      /**
      * the action(s) to be performed when conditions are not fulfilled
      */
    vElseActions: Action
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
    vActions: js.Array[Action]
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
    vActions: Action
    ): this.type = js.native
    def doOnAggregation(
      /**
      * the aggregation name
      */
    sAggregationName: String,
      /**
      * the matchers to filter aggregation items
      */
    vMatchers: js.Array[Matcher],
      /**
      * the actions to be performed on matching aggregation items
      */
    vActions: js.Array[Action]
    ): this.type = js.native
    def doOnAggregation(
      /**
      * the aggregation name
      */
    sAggregationName: String,
      /**
      * the matchers to filter aggregation items
      */
    vMatchers: js.Array[Matcher],
      /**
      * the actions to be performed on matching aggregation items
      */
    vActions: Action
    ): this.type = js.native
    def doOnAggregation(
      /**
      * the aggregation name
      */
    sAggregationName: String,
      /**
      * the matchers to filter aggregation items
      */
    vMatchers: Matcher,
      /**
      * the actions to be performed on matching aggregation items
      */
    vActions: js.Array[Action]
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
    vMatchers: Matcher,
      /**
      * the actions to be performed on matching aggregation items
      */
    vActions: Action
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
    vChildBuilderOrMatcher: js.Array[Matcher]): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: js.Array[Matcher],
      /**
      * the actions to be performed on matching child items
      */
    vActions: js.Array[Action]
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: js.Array[Matcher],
      /**
      * the actions to be performed on matching child items
      */
    vActions: js.Array[Action],
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: js.Array[Matcher],
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
    vChildBuilderOrMatcher: js.Array[Matcher],
      /**
      * the actions to be performed on matching child items
      */
    vActions: Action
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: js.Array[Matcher],
      /**
      * the actions to be performed on matching child items
      */
    vActions: Action,
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
    vActions: js.Array[Action]
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: Unit,
      /**
      * the actions to be performed on matching child items
      */
    vActions: js.Array[Action],
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
    vActions: Action
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: Unit,
      /**
      * the actions to be performed on matching child items
      */
    vActions: Action,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): this.type = js.native
    def doOnChildren(/**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: Matcher): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: Matcher,
      /**
      * the actions to be performed on matching child items
      */
    vActions: js.Array[Action]
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: Matcher,
      /**
      * the actions to be performed on matching child items
      */
    vActions: js.Array[Action],
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: Matcher,
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
    vChildBuilderOrMatcher: Matcher,
      /**
      * the actions to be performed on matching child items
      */
    vActions: Action
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: Matcher,
      /**
      * the actions to be performed on matching child items
      */
    vActions: Action,
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
    vActions: js.Array[Action]
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: OpaBuilder,
      /**
      * the actions to be performed on matching child items
      */
    vActions: js.Array[Action],
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
    vActions: Action
    ): this.type = js.native
    def doOnChildren(
      /**
      * the child builder or child matcher
      */
    vChildBuilderOrMatcher: OpaBuilder,
      /**
      * the actions to be performed on matching child items
      */
    vActions: Action,
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
    def execute(): Any = js.native
    def execute(
      /**
      * the Opa5 instance to call {@link sap.ui.test.Opa5#waitFor} on
      */
    oOpaInstance: typings.openui5.sapUiTestOpa5Mod.default
    ): Any = js.native
    
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
      * Get the Opa5 instance that will be used for {@link sap.ui.test.OpaBuilder#execute}. If no {sap.ui.test.Opa5 }
      * instance was set before, this function creates a new one lazily.
      *
      * @returns the Opa5 instance
      */
    def getOpaInstance(): typings.openui5.sapUiTestOpa5Mod.default = js.native
    
    def has(/**
      * additional matchers to filter target control(s)
      */
    vMatchers: js.Array[Matcher]): this.type = js.native
    def has(
      /**
      * additional matchers to filter target control(s)
      */
    vMatchers: js.Array[Matcher],
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
    def has(/**
      * additional matchers to filter target control(s)
      */
    vMatchers: Matcher): this.type = js.native
    def has(
      /**
      * additional matchers to filter target control(s)
      */
    vMatchers: Matcher,
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
    vMatchers: js.Array[Matcher]
    ): this.type = js.native
    def hasAggregation(
      /**
      * the aggregation name
      */
    sAggregationName: String,
      /**
      * matchers to filter aggregation items
      */
    vMatchers: Matcher
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
    oProperties: Record[String, Any]
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
    vBuilderOrMatcher: js.Array[Matcher]): this.type = js.native
    def hasChildren(
      /**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: js.Array[Matcher],
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
    def hasChildren(/**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: Matcher): this.type = js.native
    def hasChildren(
      /**
      * the matchers to filter child items
      */
    vBuilderOrMatcher: Matcher,
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
    
    def hasConditional(
      /**
      * conditions to pre-check
      */
    vConditions: js.Array[Matcher],
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: Matcher | js.Object
    ): this.type = js.native
    def hasConditional(
      /**
      * conditions to pre-check
      */
    vConditions: js.Array[Matcher],
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: Matcher | js.Object,
      /**
      * actual matcher that is executed if conditions are not met
      */
    vElseMatcher: Matcher | js.Object
    ): this.type = js.native
    def hasConditional(
      /**
      * conditions to pre-check
      */
    vConditions: js.Array[Matcher],
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: Matcher | js.Object,
      /**
      * actual matcher that is executed if conditions are not met
      */
    vElseMatcher: js.Array[Matcher]
    ): this.type = js.native
    def hasConditional(
      /**
      * conditions to pre-check
      */
    vConditions: js.Array[Matcher],
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: js.Array[Matcher]
    ): this.type = js.native
    def hasConditional(
      /**
      * conditions to pre-check
      */
    vConditions: js.Array[Matcher],
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: js.Array[Matcher],
      /**
      * actual matcher that is executed if conditions are not met
      */
    vElseMatcher: Matcher | js.Object
    ): this.type = js.native
    def hasConditional(
      /**
      * conditions to pre-check
      */
    vConditions: js.Array[Matcher],
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: js.Array[Matcher],
      /**
      * actual matcher that is executed if conditions are not met
      */
    vElseMatcher: js.Array[Matcher]
    ): this.type = js.native
    def hasConditional(
      /**
      * conditions to pre-check
      */
    vConditions: Boolean,
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: Matcher | js.Object
    ): this.type = js.native
    def hasConditional(
      /**
      * conditions to pre-check
      */
    vConditions: Boolean,
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: Matcher | js.Object,
      /**
      * actual matcher that is executed if conditions are not met
      */
    vElseMatcher: Matcher | js.Object
    ): this.type = js.native
    def hasConditional(
      /**
      * conditions to pre-check
      */
    vConditions: Boolean,
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: Matcher | js.Object,
      /**
      * actual matcher that is executed if conditions are not met
      */
    vElseMatcher: js.Array[Matcher]
    ): this.type = js.native
    def hasConditional(
      /**
      * conditions to pre-check
      */
    vConditions: Boolean,
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: js.Array[Matcher]
    ): this.type = js.native
    def hasConditional(
      /**
      * conditions to pre-check
      */
    vConditions: Boolean,
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: js.Array[Matcher],
      /**
      * actual matcher that is executed if conditions are not met
      */
    vElseMatcher: Matcher | js.Object
    ): this.type = js.native
    def hasConditional(
      /**
      * conditions to pre-check
      */
    vConditions: Boolean,
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: js.Array[Matcher],
      /**
      * actual matcher that is executed if conditions are not met
      */
    vElseMatcher: js.Array[Matcher]
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
    vConditions: Matcher,
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: Matcher | js.Object
    ): this.type = js.native
    def hasConditional(
      /**
      * conditions to pre-check
      */
    vConditions: Matcher,
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: Matcher | js.Object,
      /**
      * actual matcher that is executed if conditions are not met
      */
    vElseMatcher: Matcher | js.Object
    ): this.type = js.native
    def hasConditional(
      /**
      * conditions to pre-check
      */
    vConditions: Matcher,
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: Matcher | js.Object,
      /**
      * actual matcher that is executed if conditions are not met
      */
    vElseMatcher: js.Array[Matcher]
    ): this.type = js.native
    def hasConditional(
      /**
      * conditions to pre-check
      */
    vConditions: Matcher,
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: js.Array[Matcher]
    ): this.type = js.native
    def hasConditional(
      /**
      * conditions to pre-check
      */
    vConditions: Matcher,
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: js.Array[Matcher],
      /**
      * actual matcher that is executed if conditions are not met
      */
    vElseMatcher: Matcher | js.Object
    ): this.type = js.native
    def hasConditional(
      /**
      * conditions to pre-check
      */
    vConditions: Matcher,
      /**
      * actual matcher that is executed if conditions are met
      */
    vSuccessMatcher: js.Array[Matcher],
      /**
      * actual matcher that is executed if conditions are not met
      */
    vElseMatcher: js.Array[Matcher]
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
    oProperties: Record[String, Any]): this.type = js.native
    
    /**
      * Adds a group of matchers that requires only one of them to actually match. It is internally using {@link sap.ui.test.OpaBuilder.Matchers.some}.
      *
      * @returns this OpaBuilder instance
      */
    def hasSome(): this.type = js.native
    def hasSome(/**
      * aMatchers list of matchers where one must be met
      */
    aMatchers: js.Array[Matcher]): this.type = js.native
    def hasSome(/**
      * aMatchers list of matchers where one must be met
      */
    aMatchers: Matcher): this.type = js.native
    
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
    def options(): this.type = js.native
    def options(/**
      * the {@link sap.ui.test.Opa5#waitFor} options to apply
      */
    oOptions: MultiControlSelector): this.type = js.native
    def options(/**
      * the {@link sap.ui.test.Opa5#waitFor} options to apply
      */
    oOptions: SingleControlSelector): this.type = js.native
    
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
      * of {@link sap.ui.test.OpaBuilder.create}, {@link sap.ui.test.OpaBuilder#constructor} or {@link sap.ui.test.OpaBuilder#execute }
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
