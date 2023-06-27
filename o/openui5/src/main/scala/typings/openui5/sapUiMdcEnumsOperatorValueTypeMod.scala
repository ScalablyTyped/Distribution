package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcEnumsOperatorValueTypeMod {
  
  /**
    * @since 1.115
    *
    * Defines what data type is used for parse or format the condition values on a {@link sap.ui.mdc.condition.Operator Operator}.
    */
  @JSImport("sap/ui/mdc/enums/OperatorValueType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[OperatorValueType & String] = js.native
    
    /* "self" */ val Self: typings.openui5.sapUiMdcEnumsOperatorValueTypeMod.OperatorValueType.Self & String = js.native
    
    /* "selfNoParse" */ val SelfNoParse: typings.openui5.sapUiMdcEnumsOperatorValueTypeMod.OperatorValueType.SelfNoParse & String = js.native
    
    /* "static" */ val Static: typings.openui5.sapUiMdcEnumsOperatorValueTypeMod.OperatorValueType.Static & String = js.native
  }
  
  @js.native
  sealed trait OperatorValueType extends StObject
  /**
    * @since 1.115
    *
    * Defines what data type is used for parse or format the condition values on a {@link sap.ui.mdc.condition.Operator Operator}.
    */
  @JSImport("sap/ui/mdc/enums/OperatorValueType", "OperatorValueType")
  @js.native
  object OperatorValueType extends StObject {
    
    /**
      * The `Type` of the `Field` or `FilterField` using the `Operator` is used.
      */
    @js.native
    sealed trait Self
      extends StObject
         with OperatorValueType
    
    /**
      * The `Type` of the `Field` or `FilterField` using the `Operator` is used for validation, but the user
      * input is used as value.
      */
    @js.native
    sealed trait SelfNoParse
      extends StObject
         with OperatorValueType
    
    /**
      * A simple string type is used to display static text.
      */
    @js.native
    sealed trait Static
      extends StObject
         with OperatorValueType
  }
}
