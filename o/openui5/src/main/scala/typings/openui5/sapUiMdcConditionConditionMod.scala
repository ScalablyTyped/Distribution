package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.sapUiMdcEnumsConditionValidatedMod.ConditionValidated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcConditionConditionMod extends Shortcut {
  
  @JSImport("sap/ui/mdc/condition/Condition", JSImport.Default)
  @js.native
  val default: Condition = js.native
  
  /**
    * @since 1.61.0
    *
    * Utilities to create conditions to be used in {@link sap.ui.mdc.FilterField FilterField}, {@link sap.ui.mdc.FilterBar FilterBar }
    * or {@link sap.ui.mdc.condition.ConditionModel ConditionModel}
    */
  @js.native
  trait Condition extends StObject {
    
    def createCondition(
      /**
      * Operator for the condition
      */
    sOperator: String,
      /**
      * Array of values for the condition
      */
    aValues: js.Array[Any],
      /**
      * In parameters of the condition. (Do not use it for new conditions, use payload instead.)
      */
    oInParameters: js.Object,
      /**
      * Out parameters of the condition. (Do not use it for new conditions, use payload instead.)
      */
    oOutParameters: js.Object,
      /**
      * If set to `ConditionValidated.Validated`, the condition is validated (by the field help) and not shown
      * in the `DefineConditionPanel` control
      */
    sValidated: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ConditionValidated * / any */ String
    ): ConditionObject = js.native
    def createCondition(
      /**
      * Operator for the condition
      */
    sOperator: String,
      /**
      * Array of values for the condition
      */
    aValues: js.Array[Any],
      /**
      * In parameters of the condition. (Do not use it for new conditions, use payload instead.)
      */
    oInParameters: js.Object,
      /**
      * Out parameters of the condition. (Do not use it for new conditions, use payload instead.)
      */
    oOutParameters: js.Object,
      /**
      * If set to `ConditionValidated.Validated`, the condition is validated (by the field help) and not shown
      * in the `DefineConditionPanel` control
      */
    sValidated: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ConditionValidated * / any */ String,
      /**
      * Payload of the condition
      */
    oPayload: js.Object
    ): ConditionObject = js.native
    /**
      * Creates a condition object.
      *
      * @returns The new condition object with the given operator and values
      */
    def createCondition(
      /**
      * Operator for the condition
      */
    sOperator: String,
      /**
      * Array of values for the condition
      */
    aValues: js.Array[Any],
      /**
      * In parameters of the condition. (Do not use it for new conditions, use payload instead.)
      */
    oInParameters: js.Object,
      /**
      * Out parameters of the condition. (Do not use it for new conditions, use payload instead.)
      */
    oOutParameters: js.Object,
      /**
      * If set to `ConditionValidated.Validated`, the condition is validated (by the field help) and not shown
      * in the `DefineConditionPanel` control
      */
    sValidated: ConditionValidated
    ): ConditionObject = js.native
    def createCondition(
      /**
      * Operator for the condition
      */
    sOperator: String,
      /**
      * Array of values for the condition
      */
    aValues: js.Array[Any],
      /**
      * In parameters of the condition. (Do not use it for new conditions, use payload instead.)
      */
    oInParameters: js.Object,
      /**
      * Out parameters of the condition. (Do not use it for new conditions, use payload instead.)
      */
    oOutParameters: js.Object,
      /**
      * If set to `ConditionValidated.Validated`, the condition is validated (by the field help) and not shown
      * in the `DefineConditionPanel` control
      */
    sValidated: ConditionValidated,
      /**
      * Payload of the condition
      */
    oPayload: js.Object
    ): ConditionObject = js.native
    def createCondition(
      /**
      * Operator for the condition
      */
    sOperator: String,
      /**
      * Array of values for the condition
      */
    aValues: js.Array[Any],
      /**
      * In parameters of the condition. (Do not use it for new conditions, use payload instead.)
      */
    oInParameters: js.Object,
      /**
      * If set to `ConditionValidated.Validated`, the condition is validated (by the field help) and not shown
      * in the `DefineConditionPanel` control
      */
    sValidated: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ConditionValidated * / any */ String
    ): ConditionObject = js.native
    def createCondition(
      /**
      * Operator for the condition
      */
    sOperator: String,
      /**
      * Array of values for the condition
      */
    aValues: js.Array[Any],
      /**
      * In parameters of the condition. (Do not use it for new conditions, use payload instead.)
      */
    oInParameters: js.Object,
      /**
      * If set to `ConditionValidated.Validated`, the condition is validated (by the field help) and not shown
      * in the `DefineConditionPanel` control
      */
    sValidated: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ConditionValidated * / any */ String,
      /**
      * Payload of the condition
      */
    oPayload: js.Object
    ): ConditionObject = js.native
    /**
      * Creates a condition object.
      *
      * @returns The new condition object with the given operator and values
      */
    def createCondition(
      /**
      * Operator for the condition
      */
    sOperator: String,
      /**
      * Array of values for the condition
      */
    aValues: js.Array[Any],
      /**
      * In parameters of the condition. (Do not use it for new conditions, use payload instead.)
      */
    oInParameters: js.Object,
      /**
      * If set to `ConditionValidated.Validated`, the condition is validated (by the field help) and not shown
      * in the `DefineConditionPanel` control
      */
    sValidated: ConditionValidated
    ): ConditionObject = js.native
    def createCondition(
      /**
      * Operator for the condition
      */
    sOperator: String,
      /**
      * Array of values for the condition
      */
    aValues: js.Array[Any],
      /**
      * In parameters of the condition. (Do not use it for new conditions, use payload instead.)
      */
    oInParameters: js.Object,
      /**
      * If set to `ConditionValidated.Validated`, the condition is validated (by the field help) and not shown
      * in the `DefineConditionPanel` control
      */
    sValidated: ConditionValidated,
      /**
      * Payload of the condition
      */
    oPayload: js.Object
    ): ConditionObject = js.native
    def createCondition(
      /**
      * Operator for the condition
      */
    sOperator: String,
      /**
      * Array of values for the condition
      */
    aValues: js.Array[Any],
      /**
      * If set to `ConditionValidated.Validated`, the condition is validated (by the field help) and not shown
      * in the `DefineConditionPanel` control
      */
    sValidated: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ConditionValidated * / any */ String
    ): ConditionObject = js.native
    def createCondition(
      /**
      * Operator for the condition
      */
    sOperator: String,
      /**
      * Array of values for the condition
      */
    aValues: js.Array[Any],
      /**
      * If set to `ConditionValidated.Validated`, the condition is validated (by the field help) and not shown
      * in the `DefineConditionPanel` control
      */
    sValidated: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ConditionValidated * / any */ String,
      /**
      * Payload of the condition
      */
    oPayload: js.Object
    ): ConditionObject = js.native
    /**
      * Creates a condition object.
      *
      * @returns The new condition object with the given operator and values
      */
    def createCondition(
      /**
      * Operator for the condition
      */
    sOperator: String,
      /**
      * Array of values for the condition
      */
    aValues: js.Array[Any],
      /**
      * If set to `ConditionValidated.Validated`, the condition is validated (by the field help) and not shown
      * in the `DefineConditionPanel` control
      */
    sValidated: ConditionValidated
    ): ConditionObject = js.native
    def createCondition(
      /**
      * Operator for the condition
      */
    sOperator: String,
      /**
      * Array of values for the condition
      */
    aValues: js.Array[Any],
      /**
      * If set to `ConditionValidated.Validated`, the condition is validated (by the field help) and not shown
      * in the `DefineConditionPanel` control
      */
    sValidated: ConditionValidated,
      /**
      * Payload of the condition
      */
    oPayload: js.Object
    ): ConditionObject = js.native
    
    /**
      * Creates a condition instance for a condition representing a item chosen from the value help.
      *
      * This is a "equal to" (EQ) condition with key and description. It is used for entries selected in the
      * field help and for everything entered in the {@link sap.ui.mdc.Field Field} control.
      *
      * @returns The new condition object with the EQ operator along with `sKey` and `sDescription` as `aValues`
      */
    def createItemCondition(
      /**
      * Operator for the condition
      */
    sKey: String,
      /**
      * Description of the operator
      */
    sDescription: String
    ): ConditionObject = js.native
    def createItemCondition(
      /**
      * Operator for the condition
      */
    sKey: String,
      /**
      * Description of the operator
      */
    sDescription: String,
      /**
      * In parameters of the condition. (Do not use it for new conditions, use payload instead.)
      */
    oInParameters: js.Object
    ): ConditionObject = js.native
    def createItemCondition(
      /**
      * Operator for the condition
      */
    sKey: String,
      /**
      * Description of the operator
      */
    sDescription: String,
      /**
      * In parameters of the condition. (Do not use it for new conditions, use payload instead.)
      */
    oInParameters: js.Object,
      /**
      * Out parameters of the condition. (Do not use it for new conditions, use payload instead.)
      */
    oOutParameters: js.Object
    ): ConditionObject = js.native
    def createItemCondition(
      /**
      * Operator for the condition
      */
    sKey: String,
      /**
      * Description of the operator
      */
    sDescription: String,
      /**
      * In parameters of the condition. (Do not use it for new conditions, use payload instead.)
      */
    oInParameters: js.Object,
      /**
      * Out parameters of the condition. (Do not use it for new conditions, use payload instead.)
      */
    oOutParameters: js.Object,
      /**
      * Payload of the condition
      */
    oPayload: js.Object
    ): ConditionObject = js.native
    def createItemCondition(
      /**
      * Operator for the condition
      */
    sKey: String,
      /**
      * Description of the operator
      */
    sDescription: String,
      /**
      * In parameters of the condition. (Do not use it for new conditions, use payload instead.)
      */
    oInParameters: js.Object,
      /**
      * Out parameters of the condition. (Do not use it for new conditions, use payload instead.)
      */
    oOutParameters: Unit,
      /**
      * Payload of the condition
      */
    oPayload: js.Object
    ): ConditionObject = js.native
    def createItemCondition(
      /**
      * Operator for the condition
      */
    sKey: String,
      /**
      * Description of the operator
      */
    sDescription: String,
      /**
      * In parameters of the condition. (Do not use it for new conditions, use payload instead.)
      */
    oInParameters: Unit,
      /**
      * Out parameters of the condition. (Do not use it for new conditions, use payload instead.)
      */
    oOutParameters: js.Object
    ): ConditionObject = js.native
    def createItemCondition(
      /**
      * Operator for the condition
      */
    sKey: String,
      /**
      * Description of the operator
      */
    sDescription: String,
      /**
      * In parameters of the condition. (Do not use it for new conditions, use payload instead.)
      */
    oInParameters: Unit,
      /**
      * Out parameters of the condition. (Do not use it for new conditions, use payload instead.)
      */
    oOutParameters: js.Object,
      /**
      * Payload of the condition
      */
    oPayload: js.Object
    ): ConditionObject = js.native
    def createItemCondition(
      /**
      * Operator for the condition
      */
    sKey: String,
      /**
      * Description of the operator
      */
    sDescription: String,
      /**
      * In parameters of the condition. (Do not use it for new conditions, use payload instead.)
      */
    oInParameters: Unit,
      /**
      * Out parameters of the condition. (Do not use it for new conditions, use payload instead.)
      */
    oOutParameters: Unit,
      /**
      * Payload of the condition
      */
    oPayload: js.Object
    ): ConditionObject = js.native
  }
  
  trait ConditionObject extends StObject {
    
    /**
      * In parameters of the condition. For each field path, a value is stored. (It is obsolete and only filled
      * for conditions stored on old user-variants.)
      */
    var inParameters: js.UndefOr[js.Object] = js.undefined
    
    /**
      * If set, the condition is empty (used as dummy condition in {@link sap.ui.mdc.valuehelp.base.DefineConditionPanel DefineConditionPanel})
      */
    var isEmpty: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Operator of the condition
      */
    var operator: String
    
    /**
      * Out parameters of the condition. For each field path, a value is stored. (It is obsolete and only filled
      * for conditions stored on old user-variants.)
      */
    var outParameters: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Payload of the condition. Set by application. Data needs to be stringified. (as stored and loaded in
      * variants)
      */
    var payload: js.UndefOr[js.Object] = js.undefined
    
    /**
      * If set to `ConditionValidated.Validated`, the condition is validated (by the value help) and not shown
      * in the {@link sap.ui.mdc.valuehelp.base.DefineConditionPanel DefineConditionPanel} control
      */
    var validated: ConditionValidated | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ConditionValidated * / any */ String)
    
    /**
      * Array of values of the condition. Depending on the `operator`, this contains one or more entries. The
      * entries are sored in internal format regarding the used data type.
      */
    var values: js.Array[Any]
  }
  object ConditionObject {
    
    inline def apply(
      operator: String,
      validated: ConditionValidated | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ConditionValidated * / any */ String),
      values: js.Array[Any]
    ): ConditionObject = {
      val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], validated = validated.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConditionObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConditionObject] (val x: Self) extends AnyVal {
      
      inline def setInParameters(value: js.Object): Self = StObject.set(x, "inParameters", value.asInstanceOf[js.Any])
      
      inline def setInParametersUndefined: Self = StObject.set(x, "inParameters", js.undefined)
      
      inline def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
      
      inline def setIsEmptyUndefined: Self = StObject.set(x, "isEmpty", js.undefined)
      
      inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setOutParameters(value: js.Object): Self = StObject.set(x, "outParameters", value.asInstanceOf[js.Any])
      
      inline def setOutParametersUndefined: Self = StObject.set(x, "outParameters", js.undefined)
      
      inline def setPayload(value: js.Object): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      inline def setValidated(
        value: ConditionValidated | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ConditionValidated * / any */ String)
      ): Self = StObject.set(x, "validated", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  type _To = Condition
  
  /* This means you don't have to write `default`, but can instead just say `sapUiMdcConditionConditionMod.foo` */
  override def _to: Condition = default
}
