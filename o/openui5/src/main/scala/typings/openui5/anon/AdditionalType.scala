package typings.openui5.anon

import typings.openui5.int
import typings.openui5.sapUiMdcConditionConditionMod.ConditionObject
import typings.openui5.sapUiMdcEnumsFieldDisplayMod.FieldDisplay
import typings.openui5.sapUiModelTypeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalType extends StObject {
  
  /**
    * additional type used on other part of a field. (For example, for unit fields.)
    */
  var additionalType: js.UndefOr[default] = js.undefined
  
  /**
    * Callback function to tell the `Field` the parsing is asynchronous.
    */
  var asyncParsing: js.UndefOr[js.Function] = js.undefined
  
  /**
    * `BindingContext` of field. Used to get a key or description from the value help using in/out parameters.
    * (In a table, the value help might be connected to a different row)
    */
  var bindingContext: js.UndefOr[typings.openui5.sapUiModelContextMod.default] = js.undefined
  
  /**
    * additional types used for parts of a `CompositeType`
    */
  var compositeTypes: js.UndefOr[js.Array[default]] = js.undefined
  
  /**
    * Instance of the calling control
    */
  var control: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
  
  /**
    * If set, whitespaces will be replaced by special characters to display whitespaces in HTML
    */
  var convertWhitespaces: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Name of the default `Operator`
    */
  var defaultOperatorName: js.UndefOr[String] = js.undefined
  
  /**
    * Field delegate to handle model-specific logic
    */
  var delegate: js.UndefOr[js.Object] = js.undefined
  
  /**
    * DisplayFormat used to visualize a value
    */
  var display: js.UndefOr[
    FieldDisplay | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FieldDisplay * / any */ String)
  ] = js.undefined
  
  /**
    * Function to get the existing conditions of the field.
    */
  var getConditions: js.UndefOr[js.Function] = js.undefined
  
  /**
    * If set, only the value of the condition is shown, but no operator. (Use it only if just one operator
    * is supported.)
    */
  var hideOperator: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If noFormatting is set, this value is used as output (To keep typed value during value help selection)
    */
  var keepValue: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of allowed conditions
    */
  var maxConditions: js.UndefOr[int] = js.undefined
  
  /**
    * Condition of keyboard navigation. If this is filled, no real parsing is needed as the condition has already
    * been determined and is just returned
    */
  var navigateCondition: js.UndefOr[ConditionObject] = js.undefined
  
  /**
    * If set, the conditions will not be formatted (MultiInput value-property case)
    */
  var noFormatting: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Possible operators to be used in the condition
    */
  var operators: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Type used on field, for example, for date types; a different type is used internally to have different
    * `formatOptions`
    */
  var originalDateType: js.UndefOr[default] = js.undefined
  
  /**
    * Payload of the delegate
    */
  var payload: js.UndefOr[js.Object] = js.undefined
  
  /**
    * If set, description is not read by `formatValue` as it is known that no description exists or might be
    * set later
    */
  var preventGetDescription: js.UndefOr[Boolean] = js.undefined
  
  /**
    * ID of the value help to determine the key and description
    */
  var valueHelpID: js.UndefOr[String] = js.undefined
  
  /**
    * Type of the value of the condition (used for formatting, parsing and validating)
    */
  var valueType: js.UndefOr[default] = js.undefined
}
object AdditionalType {
  
  inline def apply(): AdditionalType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdditionalType] (val x: Self) extends AnyVal {
    
    inline def setAdditionalType(value: default): Self = StObject.set(x, "additionalType", value.asInstanceOf[js.Any])
    
    inline def setAdditionalTypeUndefined: Self = StObject.set(x, "additionalType", js.undefined)
    
    inline def setAsyncParsing(value: js.Function): Self = StObject.set(x, "asyncParsing", value.asInstanceOf[js.Any])
    
    inline def setAsyncParsingUndefined: Self = StObject.set(x, "asyncParsing", js.undefined)
    
    inline def setBindingContext(value: typings.openui5.sapUiModelContextMod.default): Self = StObject.set(x, "bindingContext", value.asInstanceOf[js.Any])
    
    inline def setBindingContextUndefined: Self = StObject.set(x, "bindingContext", js.undefined)
    
    inline def setCompositeTypes(value: js.Array[default]): Self = StObject.set(x, "compositeTypes", value.asInstanceOf[js.Any])
    
    inline def setCompositeTypesUndefined: Self = StObject.set(x, "compositeTypes", js.undefined)
    
    inline def setCompositeTypesVarargs(value: default*): Self = StObject.set(x, "compositeTypes", js.Array(value*))
    
    inline def setControl(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    inline def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
    
    inline def setConvertWhitespaces(value: Boolean): Self = StObject.set(x, "convertWhitespaces", value.asInstanceOf[js.Any])
    
    inline def setConvertWhitespacesUndefined: Self = StObject.set(x, "convertWhitespaces", js.undefined)
    
    inline def setDefaultOperatorName(value: String): Self = StObject.set(x, "defaultOperatorName", value.asInstanceOf[js.Any])
    
    inline def setDefaultOperatorNameUndefined: Self = StObject.set(x, "defaultOperatorName", js.undefined)
    
    inline def setDelegate(value: js.Object): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
    
    inline def setDelegateUndefined: Self = StObject.set(x, "delegate", js.undefined)
    
    inline def setDisplay(
      value: FieldDisplay | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FieldDisplay * / any */ String)
    ): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setGetConditions(value: js.Function): Self = StObject.set(x, "getConditions", value.asInstanceOf[js.Any])
    
    inline def setGetConditionsUndefined: Self = StObject.set(x, "getConditions", js.undefined)
    
    inline def setHideOperator(value: Boolean): Self = StObject.set(x, "hideOperator", value.asInstanceOf[js.Any])
    
    inline def setHideOperatorUndefined: Self = StObject.set(x, "hideOperator", js.undefined)
    
    inline def setKeepValue(value: String): Self = StObject.set(x, "keepValue", value.asInstanceOf[js.Any])
    
    inline def setKeepValueUndefined: Self = StObject.set(x, "keepValue", js.undefined)
    
    inline def setMaxConditions(value: int): Self = StObject.set(x, "maxConditions", value.asInstanceOf[js.Any])
    
    inline def setMaxConditionsUndefined: Self = StObject.set(x, "maxConditions", js.undefined)
    
    inline def setNavigateCondition(value: ConditionObject): Self = StObject.set(x, "navigateCondition", value.asInstanceOf[js.Any])
    
    inline def setNavigateConditionUndefined: Self = StObject.set(x, "navigateCondition", js.undefined)
    
    inline def setNoFormatting(value: Boolean): Self = StObject.set(x, "noFormatting", value.asInstanceOf[js.Any])
    
    inline def setNoFormattingUndefined: Self = StObject.set(x, "noFormatting", js.undefined)
    
    inline def setOperators(value: js.Array[String]): Self = StObject.set(x, "operators", value.asInstanceOf[js.Any])
    
    inline def setOperatorsUndefined: Self = StObject.set(x, "operators", js.undefined)
    
    inline def setOperatorsVarargs(value: String*): Self = StObject.set(x, "operators", js.Array(value*))
    
    inline def setOriginalDateType(value: default): Self = StObject.set(x, "originalDateType", value.asInstanceOf[js.Any])
    
    inline def setOriginalDateTypeUndefined: Self = StObject.set(x, "originalDateType", js.undefined)
    
    inline def setPayload(value: js.Object): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setPreventGetDescription(value: Boolean): Self = StObject.set(x, "preventGetDescription", value.asInstanceOf[js.Any])
    
    inline def setPreventGetDescriptionUndefined: Self = StObject.set(x, "preventGetDescription", js.undefined)
    
    inline def setValueHelpID(value: String): Self = StObject.set(x, "valueHelpID", value.asInstanceOf[js.Any])
    
    inline def setValueHelpIDUndefined: Self = StObject.set(x, "valueHelpID", js.undefined)
    
    inline def setValueType(value: default): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    
    inline def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
  }
}
