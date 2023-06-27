package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.sapUiMdcConditionConditionMod.ConditionObject
import typings.openui5.sapUiMdcValueHelpMod.ItemForValueConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcFieldFieldBaseDelegateMod extends Shortcut {
  
  @JSImport("sap/ui/mdc/field/FieldBaseDelegate", JSImport.Default)
  @js.native
  val default: FieldBaseDelegate = js.native
  
  /**
    * @since 1.72.0
    *
    * Delegate for {@link sap.ui.mdc.field.FieldBase FieldBase}.
    *  **Note:** The class is experimental and the API/behavior is not finalized and hence this should not
    * be used for productive usage.
    */
  @js.native
  trait FieldBaseDelegate extends StObject {
    
    /**
      * @since 1.107.0
      *
      * Enables applications to control condition updates based on `value` / `additionalvalue` property changes.
      *
      * **Note:** Use with care! Custom implementations of this method may lead to intransparency as a field's
      * condition may then differ from the state of the `value` / `additionalvalue` properties. Please also avoid
      * expensive operations, as this can delay the rendering of the output!
      *
      * @returns Returns a condition object to be set on the control
      */
    def createCondition(
      /**
      * `Field` control instance
      */
    oField: typings.openui5.sapUiMdcFieldFieldBaseMod.default,
      /**
      * key, description pair for the condition which is to be created.
      */
    aValues: js.Array[Any]
    ): js.UndefOr[ConditionObject] = js.native
    def createCondition(
      /**
      * `Field` control instance
      */
    oField: typings.openui5.sapUiMdcFieldFieldBaseMod.default,
      /**
      * key, description pair for the condition which is to be created.
      */
    aValues: js.Array[Any],
      /**
      * currently available condition before the property change
      */
    oCurrentCondition: ConditionObject
    ): js.UndefOr[ConditionObject] = js.native
    /**
      * @since 1.107.0
      *
      * Enables applications to control condition updates based on `value` / `additionalvalue` property changes.
      *
      * **Note:** Use with care! Custom implementations of this method may lead to intransparency as a field's
      * condition may then differ from the state of the `value` / `additionalvalue` properties. Please also avoid
      * expensive operations, as this can delay the rendering of the output!
      *
      * @returns Returns a condition object to be set on the control
      */
    def createCondition(
      /**
      * `Field` control instance
      */
    oField: typings.openui5.sapUiMdcFieldFieldBaseMod.default,
      /**
      * Instance of the calling control
      */
    oControl: typings.openui5.sapUiCoreControlMod.default,
      /**
      * key, description pair for the condition which is to be created.
      */
    aValues: js.Array[Any]
    ): js.UndefOr[ConditionObject] = js.native
    def createCondition(
      /**
      * `Field` control instance
      */
    oField: typings.openui5.sapUiMdcFieldFieldBaseMod.default,
      /**
      * Instance of the calling control
      */
    oControl: typings.openui5.sapUiCoreControlMod.default,
      /**
      * key, description pair for the condition which is to be created.
      */
    aValues: js.Array[Any],
      /**
      * currently available condition before the property change
      */
    oCurrentCondition: ConditionObject
    ): js.UndefOr[ConditionObject] = js.native
    
    /**
      * @since 1.107.0
      *
      * Provides the possibility to convey custom data in conditions. This enables an application to enhance
      * conditions with data relevant for combined key or outparameter scenarios.
      *
      * @returns Optionally returns a serializeable object to be stored in the condition payload field.
      */
    def createConditionPayload(
      /**
      * `Field` control instance
      */
    oField: typings.openui5.sapUiMdcFieldFieldBaseMod.default,
      /**
      * key, description pair for the condition which is to be created.
      */
    aValues: js.Array[Any]
    ): js.UndefOr[js.Object] = js.native
    /**
      * @since 1.107.0
      *
      * Provides the possibility to convey custom data in conditions. This enables an application to enhance
      * conditions with data relevant for combined key or outparameter scenarios.
      *
      * @returns Optionally returns a serializeable object to be stored in the condition payload field.
      */
    def createConditionPayload(
      /**
      * `Field` control instance
      */
    oField: typings.openui5.sapUiMdcFieldFieldBaseMod.default,
      /**
      * Instance of the calling control
      */
    oControl: typings.openui5.sapUiCoreControlMod.default,
      /**
      * key, description pair for the condition which is to be created.
      */
    aValues: js.Array[Any]
    ): js.UndefOr[js.Object] = js.native
    
    /**
      * Determines the description for a given key.
      *
      * This function is called while formatting the output of a {@link sap.ui.mdc.Field Field} or {@link sap.ui.mdc.FilterField FilterField }
      * control in case a description is to be displayed but only a key is given.
      *
      * If this needs to be determined asynchronously, a `Promise` is returned.
      *
      * As the key might change (uppercase), an object with key and description can be returned.
      *
      * If the description cannot be determined, a corresponding FormatException is thrown.
      *
      * @returns Description for key or object containing description, key and payload. If it is not available
      * right away (must be requested), a `Promise` is returned.
      */
    def getDescription(
      /**
      * `Field` control instance
      */
    oField: typings.openui5.sapUiMdcFieldFieldBaseMod.default,
      /**
      * Field help assigned to the {@link sap.ui.mdc.Field Field} or {@link sap.ui.mdc.FilterField FilterField }
      * control
      */
    oValueHelp: typings.openui5.sapUiMdcValueHelpMod.default,
      /**
      * Key
      */
    vKey: Any,
      /**
      * In parameters for the key (as a key must not be unique.) (Only filled in conditions of old variants.)
      */
    oInParameters: js.Object,
      /**
      * Out parameters for the key (as a key must not be unique.) (Only filled in conditions of old variants.)
      */
    oOutParameters: js.Object,
      /**
      * `BindingContext` of the checked field. Inside a table the `ValueHelp` element might be connected to a
      * different row.
      */
    oBindingContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * `ConditionModel`, if bound to one - NOT LONGER USED
      */
    oConditionModel: Unit,
      /**
      * Name of the `ConditionModel`, if bound to one - NOT LONGER USED
      */
    sConditionModelName: Unit,
      /**
      * Additional context information for this key
      */
    oConditionPayload: js.Object,
      /**
      * Instance if the calling control is not the field itself
      */
    oControl: typings.openui5.sapUiCoreControlMod.default,
      /**
      * Type of the value
      */
    oType: typings.openui5.sapUiModelTypeMod.default
    ): String | (/* was: sap.ui.mdc.valuehelp.ValueHelpItem */ Any) | (js.Promise[String | (/* was: sap.ui.mdc.valuehelp.ValueHelpItem */ Any)]) = js.native
    
    /**
      * Determines the key, description, and payload of a user input.
      *
      * If this needs to be determined asynchronously, a `Promise` is returned.
      *
      * If the item cannot be determined, a corresponding ParseException is thrown.
      *
      * @returns Object containing description, key, and payload. If it is not available right now (must be requested),
      * a `Promise` is returned.
      */
    def getItemForValue(
      /**
      * `Field` control instance
      */
    oField: typings.openui5.sapUiMdcFieldFieldBaseMod.default,
      /**
      * Field help assigned to the {@link sap.ui.mdc.Field Field} or {@link sap.ui.mdc.FilterField FilterField }
      * control
      */
    oValueHelp: typings.openui5.sapUiMdcValueHelpMod.default
    ): Any | (js.Promise[/* was: sap.ui.mdc.valuehelp.ValueHelpItem */ Any]) = js.native
    def getItemForValue(
      /**
      * `Field` control instance
      */
    oField: typings.openui5.sapUiMdcFieldFieldBaseMod.default,
      /**
      * Field help assigned to the {@link sap.ui.mdc.Field Field} or {@link sap.ui.mdc.FilterField FilterField }
      * control
      */
    oValueHelp: typings.openui5.sapUiMdcValueHelpMod.default,
      /**
      * Configuration
      */
    oConfig: ItemForValueConfiguration
    ): Any | (js.Promise[/* was: sap.ui.mdc.valuehelp.ValueHelpItem */ Any]) = js.native
  }
  
  type _To = FieldBaseDelegate
  
  /* This means you don't have to write `default`, but can instead just say `sapUiMdcFieldFieldBaseDelegateMod.foo` */
  override def _to: FieldBaseDelegate = default
}
