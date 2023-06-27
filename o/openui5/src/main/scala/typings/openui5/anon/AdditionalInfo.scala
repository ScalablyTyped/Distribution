package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalInfo extends StObject {
  
  /**
    * additionalInfo text for the operator. Will be shown in the operator suggest as second column. If not
    * used (undefined) the Include or Exclude information of the operator is used.
    */
  var additionalInfo: js.UndefOr[String] = js.undefined
  
  /**
    * Alias names based on `BaseType`, used to map to `DynamicDateOption` if `DynamicDateRange` is used
    */
  var alias: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Function to check if a condition is validated (sets the `validated` property)
    */
  var checkValidated: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Function to create a control to be used in {@link sap.ui.mdc.valuehelp.base.DefineConditionPanel DefineConditionPanel}
    */
  var createControl: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Pattern how different {@link sap.ui.mdc.enums.FieldDisplay displayFormats} are rendered
    */
  var displayFormats: js.UndefOr[js.Object] = js.undefined
  
  /**
    * If set, the operator is handled as exclude filter when creating the filters of all conditions
    */
  var exclude: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The operator's default filter operator that is created as defined in {@link sap.ui.model.FilterOperator FilterOperator}
    */
  var filterOperator: String
  
  /**
    * Function to format condition
    */
  var format: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Function to get the value for condition compare
    */
  var getCheckValue: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Function create filter for a condition
    */
  var getModelFilter: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Function to get the real values without operator symbol
    */
  var getValues: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Function to check if condition is empty
    */
  var isEmpty: js.UndefOr[js.Function] = js.undefined
  
  /**
    * String representation of the operator as a long text.
    *  If longText is not given , it is looked up in the resource bundle of the `sap.ui.mdc` library by the
    * key `operators.{oConfiguration.name}.longText`
    */
  var longText: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the operator used in the condition
    */
  var name: String
  
  /**
    * Array of type parameters regexp
    */
  var paramTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Function to parse input into condition
    */
  var parse: js.UndefOr[js.Function] = js.undefined
  
  /**
    * The string representation that is used by the operator to format a value into an output string. For the
    * value placeholder `{0}` and `{1}` are used. A placeholder that refers to the translated tokenText can
    * be used. `#tokenText#` refers to the `oConfiguration.tokenText` property if given.
    */
  var tokenFormat: String
  
  /**
    * The string representation of the regular expression that is used by the operator to parse a value to
    * eliminate the operator and get the data string. A placeholder that refers to the translated tokenText
    * can be used. `#tokenText#` refers to the `oConfiguration.tokenText` property if given.
    */
  var tokenParse: String
  
  /**
    * String representation of the operator as a short text.
    *  If the token text is not given, it is looked up in the resource bundle of the `sap.ui.mdc` library by
    * the key `operators.{oConfiguration.name}.tokenText`
    */
  var tokenText: js.UndefOr[String] = js.undefined
  
  /**
    * Function to validate condition
    */
  var validate: js.UndefOr[js.Function] = js.undefined
  
  /**
    * If set, the user input for this operator needs to be validated using a field help
    */
  var validateInput: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Array of type to be used. The length of the array defines the number of values that need to be entered
    * with the operator.
    *  If set to {@link sap.ui.mdc.enums.OperatorValueType.Self OperatorValueType.Self} the `Type` of the `Field`
    * or `FilterField` using the `Operator` is used.
    *  If set to {@link sap.ui.mdc.enums.OperatorValueType.SelfNoParse OperatorValueType.SelfNoParse} same
    * as {@link sap.ui.mdc.enums.OperatorValueType.Self OperatorValueType.Self}, except that the input value
    * parsing will not be called.
    *  If set to {@link sap.ui.mdc.enums.OperatorValueType.Static OperatorValueType.Static} a simple string
    * type is used to display static text.
    *  If set to a name of a data type an instance of this data type will be used.
    *  If set to an object with structure {@link sap.ui.mdc.condition.ValueType} an instance of the corresponding
    * data type will be used. The type given via `name` must be loaded by the application.
    */
  var valueTypes: js.Array[js.Object | String]
}
object AdditionalInfo {
  
  inline def apply(
    filterOperator: String,
    name: String,
    tokenFormat: String,
    tokenParse: String,
    valueTypes: js.Array[js.Object | String]
  ): AdditionalInfo = {
    val __obj = js.Dynamic.literal(filterOperator = filterOperator.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tokenFormat = tokenFormat.asInstanceOf[js.Any], tokenParse = tokenParse.asInstanceOf[js.Any], valueTypes = valueTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdditionalInfo] (val x: Self) extends AnyVal {
    
    inline def setAdditionalInfo(value: String): Self = StObject.set(x, "additionalInfo", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoUndefined: Self = StObject.set(x, "additionalInfo", js.undefined)
    
    inline def setAlias(value: js.Object): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setCheckValidated(value: js.Function): Self = StObject.set(x, "checkValidated", value.asInstanceOf[js.Any])
    
    inline def setCheckValidatedUndefined: Self = StObject.set(x, "checkValidated", js.undefined)
    
    inline def setCreateControl(value: js.Function): Self = StObject.set(x, "createControl", value.asInstanceOf[js.Any])
    
    inline def setCreateControlUndefined: Self = StObject.set(x, "createControl", js.undefined)
    
    inline def setDisplayFormats(value: js.Object): Self = StObject.set(x, "displayFormats", value.asInstanceOf[js.Any])
    
    inline def setDisplayFormatsUndefined: Self = StObject.set(x, "displayFormats", js.undefined)
    
    inline def setExclude(value: Boolean): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setFilterOperator(value: String): Self = StObject.set(x, "filterOperator", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: js.Function): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setGetCheckValue(value: js.Function): Self = StObject.set(x, "getCheckValue", value.asInstanceOf[js.Any])
    
    inline def setGetCheckValueUndefined: Self = StObject.set(x, "getCheckValue", js.undefined)
    
    inline def setGetModelFilter(value: js.Function): Self = StObject.set(x, "getModelFilter", value.asInstanceOf[js.Any])
    
    inline def setGetModelFilterUndefined: Self = StObject.set(x, "getModelFilter", js.undefined)
    
    inline def setGetValues(value: js.Function): Self = StObject.set(x, "getValues", value.asInstanceOf[js.Any])
    
    inline def setGetValuesUndefined: Self = StObject.set(x, "getValues", js.undefined)
    
    inline def setIsEmpty(value: js.Function): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
    
    inline def setIsEmptyUndefined: Self = StObject.set(x, "isEmpty", js.undefined)
    
    inline def setLongText(value: String): Self = StObject.set(x, "longText", value.asInstanceOf[js.Any])
    
    inline def setLongTextUndefined: Self = StObject.set(x, "longText", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParamTypes(value: js.Array[String]): Self = StObject.set(x, "paramTypes", value.asInstanceOf[js.Any])
    
    inline def setParamTypesUndefined: Self = StObject.set(x, "paramTypes", js.undefined)
    
    inline def setParamTypesVarargs(value: String*): Self = StObject.set(x, "paramTypes", js.Array(value*))
    
    inline def setParse(value: js.Function): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
    
    inline def setTokenFormat(value: String): Self = StObject.set(x, "tokenFormat", value.asInstanceOf[js.Any])
    
    inline def setTokenParse(value: String): Self = StObject.set(x, "tokenParse", value.asInstanceOf[js.Any])
    
    inline def setTokenText(value: String): Self = StObject.set(x, "tokenText", value.asInstanceOf[js.Any])
    
    inline def setTokenTextUndefined: Self = StObject.set(x, "tokenText", js.undefined)
    
    inline def setValidate(value: js.Function): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    inline def setValidateInput(value: Boolean): Self = StObject.set(x, "validateInput", value.asInstanceOf[js.Any])
    
    inline def setValidateInputUndefined: Self = StObject.set(x, "validateInput", js.undefined)
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    
    inline def setValueTypes(value: js.Array[js.Object | String]): Self = StObject.set(x, "valueTypes", value.asInstanceOf[js.Any])
    
    inline def setValueTypesVarargs(value: (js.Object | String)*): Self = StObject.set(x, "valueTypes", js.Array(value*))
  }
}
