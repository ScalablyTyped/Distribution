package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.sapUiMdcEnumsBaseTypeMod.BaseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcConditionFilterOperatorUtilMod extends Shortcut {
  
  @JSImport("sap/ui/mdc/condition/FilterOperatorUtil", JSImport.Default)
  @js.native
  val default: FilterOperatorUtil = js.native
  
  /**
    * @since 1.73.0
    *
    * Utilities to handle {@link sap.ui.mdc.condition.Operator Operators} and {@link sap.ui.mdc.condition.ConditionObject conditions}.
    */
  @js.native
  trait FilterOperatorUtil extends StObject {
    
    /**
      * Adds an operator to the list of known operators.
      */
    def addOperator(/**
      * Operator
      */
    oOperator: typings.openui5.sapUiMdcConditionOperatorMod.default): Unit = js.native
    
    def addOperatorForType(
      /**
      * Basic type
      */
    sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BaseType * / any */ String,
      /**
      * The operator instance or operator name
      */
    vOperator: String
    ): Unit = js.native
    def addOperatorForType(
      /**
      * Basic type
      */
    sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BaseType * / any */ String,
      /**
      * The operator instance or operator name
      */
    vOperator: typings.openui5.sapUiMdcConditionOperatorMod.default
    ): Unit = js.native
    def addOperatorForType(
      /**
      * Basic type
      */
    sType: BaseType,
      /**
      * The operator instance or operator name
      */
    vOperator: String
    ): Unit = js.native
    /**
      * Adds an operator to the list of valid operators for a type.
      */
    def addOperatorForType(
      /**
      * Basic type
      */
    sType: BaseType,
      /**
      * The operator instance or operator name
      */
    vOperator: typings.openui5.sapUiMdcConditionOperatorMod.default
    ): Unit = js.native
    
    /**
      * Adds an array of operators to the list of known operators.
      */
    def addOperators(
      /**
      * Array of operators
      */
    aOperators: js.Array[typings.openui5.sapUiMdcConditionOperatorMod.default]
    ): Unit = js.native
    
    def getDefaultOperator(
      /**
      * Basic type
      */
    sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BaseType * / any */ String
    ): typings.openui5.sapUiMdcConditionOperatorMod.default = js.native
    /**
      * Returns the default operator for the given basic type.
      *
      * @returns the default operator for the given type
      */
    def getDefaultOperator(/**
      * Basic type
      */
    sType: BaseType): typings.openui5.sapUiMdcConditionOperatorMod.default = js.native
    
    /**
      * Returns the operator object for the given operator name.
      *
      * @returns the operator object, or undefined if the operator with the requested name does not
      * exist
      */
    def getOperator(/**
      * Name of the operator
      */
    sOperator: String): js.UndefOr[typings.openui5.sapUiMdcConditionOperatorMod.default] = js.native
    
    def getOperatorsForType(
      /**
      * Basic type
      */
    sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BaseType * / any */ String
    ): js.Array[String] = js.native
    /**
      * Returns all available default operators for the given type.
      *
      * @returns an array with the supported filter operator names
      */
    def getOperatorsForType(/**
      * Basic type
      */
    sType: BaseType): js.Array[String] = js.native
    
    def insertOperatorForType(
      /**
      * Basic type
      */
    sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BaseType * / any */ String,
      /**
      * The operator instance or operator name
      */
    vOperator: String,
      /**
      * Index of the operator in the list of operators for this type
      */
    idx: int
    ): Unit = js.native
    def insertOperatorForType(
      /**
      * Basic type
      */
    sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BaseType * / any */ String,
      /**
      * The operator instance or operator name
      */
    vOperator: typings.openui5.sapUiMdcConditionOperatorMod.default,
      /**
      * Index of the operator in the list of operators for this type
      */
    idx: int
    ): Unit = js.native
    def insertOperatorForType(
      /**
      * Basic type
      */
    sType: BaseType,
      /**
      * The operator instance or operator name
      */
    vOperator: String,
      /**
      * Index of the operator in the list of operators for this type
      */
    idx: int
    ): Unit = js.native
    /**
      * Inserts an operator into the list of valid operators for a type.
      */
    def insertOperatorForType(
      /**
      * Basic type
      */
    sType: BaseType,
      /**
      * The operator instance or operator name
      */
    vOperator: typings.openui5.sapUiMdcConditionOperatorMod.default,
      /**
      * Index of the operator in the list of operators for this type
      */
    idx: int
    ): Unit = js.native
    
    def removeOperator(/**
      * The operator instance or operator name
      */
    vOperator: String): Unit = js.native
    /**
      * Removes an operator from the list of known operators.
      */
    def removeOperator(
      /**
      * The operator instance or operator name
      */
    vOperator: typings.openui5.sapUiMdcConditionOperatorMod.default
    ): Unit = js.native
    
    def removeOperatorForType(
      /**
      * Basic type
      */
    sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BaseType * / any */ String,
      /**
      * The operator instance or operator name
      */
    vOperator: String
    ): Unit = js.native
    def removeOperatorForType(
      /**
      * Basic type
      */
    sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BaseType * / any */ String,
      /**
      * The operator instance or operator name
      */
    vOperator: typings.openui5.sapUiMdcConditionOperatorMod.default
    ): Unit = js.native
    def removeOperatorForType(
      /**
      * Basic type
      */
    sType: BaseType,
      /**
      * The operator instance or operator name
      */
    vOperator: String
    ): Unit = js.native
    /**
      * Removes an operator from the list of valid operators for a type.
      */
    def removeOperatorForType(
      /**
      * Basic type
      */
    sType: BaseType,
      /**
      * The operator instance or operator name
      */
    vOperator: typings.openui5.sapUiMdcConditionOperatorMod.default
    ): Unit = js.native
    
    /**
      * Removes all given operators from the list of known operators.
      */
    def removeOperators(
      /**
      * Array of operators
      *
      * **Note**: `aOperators` can be the name of an {@link sap.ui.mdc.condition.Operator Operator}, the instance
      * itself, or multiple operators inside an array.
      */
    aOperators: js.Array[typings.openui5.sapUiMdcConditionOperatorMod.default]
    ): Unit = js.native
    
    def setDefaultOperatorForType(
      /**
      * Basic type
      */
    sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BaseType * / any */ String,
      /**
      * The default operator instance or default operator name
      *
      * **Note**: `vDefaultOperator` must exist as a valid operator for the type.
      */
    vDefaultOperator: String
    ): Unit = js.native
    def setDefaultOperatorForType(
      /**
      * Basic type
      */
    sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BaseType * / any */ String,
      /**
      * The default operator instance or default operator name
      *
      * **Note**: `vDefaultOperator` must exist as a valid operator for the type.
      */
    vDefaultOperator: typings.openui5.sapUiMdcConditionOperatorMod.default
    ): Unit = js.native
    def setDefaultOperatorForType(
      /**
      * Basic type
      */
    sType: BaseType,
      /**
      * The default operator instance or default operator name
      *
      * **Note**: `vDefaultOperator` must exist as a valid operator for the type.
      */
    vDefaultOperator: String
    ): Unit = js.native
    /**
      * Sets the default operator for the list of operators for a type.
      */
    def setDefaultOperatorForType(
      /**
      * Basic type
      */
    sType: BaseType,
      /**
      * The default operator instance or default operator name
      *
      * **Note**: `vDefaultOperator` must exist as a valid operator for the type.
      */
    vDefaultOperator: typings.openui5.sapUiMdcConditionOperatorMod.default
    ): Unit = js.native
    
    def setOperatorsForType(
      /**
      * Basic type
      */
    sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BaseType * / any */ String,
      /**
      * Operators
      */
    aOperators: js.Array[typings.openui5.sapUiMdcConditionOperatorMod.default],
      /**
      * The default operator instance or default operator name
      *
      * **Note**: `aOperators` can be the name of an {@link sap.ui.mdc.condition.Operator Operator}, the instance
      * itself, or multiple operators inside an array. **Note**: `vDefaultOperator` must exist as a valid operator
      * for the type.
      */
    vDefaultOperator: String
    ): Unit = js.native
    def setOperatorsForType(
      /**
      * Basic type
      */
    sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BaseType * / any */ String,
      /**
      * Operators
      */
    aOperators: js.Array[typings.openui5.sapUiMdcConditionOperatorMod.default],
      /**
      * The default operator instance or default operator name
      *
      * **Note**: `aOperators` can be the name of an {@link sap.ui.mdc.condition.Operator Operator}, the instance
      * itself, or multiple operators inside an array. **Note**: `vDefaultOperator` must exist as a valid operator
      * for the type.
      */
    vDefaultOperator: typings.openui5.sapUiMdcConditionOperatorMod.default
    ): Unit = js.native
    def setOperatorsForType(
      /**
      * Basic type
      */
    sType: BaseType,
      /**
      * Operators
      */
    aOperators: js.Array[typings.openui5.sapUiMdcConditionOperatorMod.default],
      /**
      * The default operator instance or default operator name
      *
      * **Note**: `aOperators` can be the name of an {@link sap.ui.mdc.condition.Operator Operator}, the instance
      * itself, or multiple operators inside an array. **Note**: `vDefaultOperator` must exist as a valid operator
      * for the type.
      */
    vDefaultOperator: String
    ): Unit = js.native
    /**
      * Adds operators to the list of valid operators for a type.
      */
    def setOperatorsForType(
      /**
      * Basic type
      */
    sType: BaseType,
      /**
      * Operators
      */
    aOperators: js.Array[typings.openui5.sapUiMdcConditionOperatorMod.default],
      /**
      * The default operator instance or default operator name
      *
      * **Note**: `aOperators` can be the name of an {@link sap.ui.mdc.condition.Operator Operator}, the instance
      * itself, or multiple operators inside an array. **Note**: `vDefaultOperator` must exist as a valid operator
      * for the type.
      */
    vDefaultOperator: typings.openui5.sapUiMdcConditionOperatorMod.default
    ): Unit = js.native
  }
  
  type _To = FilterOperatorUtil
  
  /* This means you don't have to write `default`, but can instead just say `sapUiMdcConditionFilterOperatorUtilMod.foo` */
  override def _to: FilterOperatorUtil = default
}
