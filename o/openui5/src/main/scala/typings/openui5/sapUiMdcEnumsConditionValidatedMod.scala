package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcEnumsConditionValidatedMod {
  
  /**
    * @since 1.115
    *
    * Enumeration of the validated state of conditions
    *
    * If a `Condition` is chosen from a field help or validated against a field help it is set to be validated.
    * In this case the corresponding item in the value help is shown as selected.
    *
    * If the validated state of the `Condition` is undefined this means it is not defined if it is validated
    * or not.
    */
  @JSImport("sap/ui/mdc/enums/ConditionValidated", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ConditionValidated & String] = js.native
    
    /* "NotValidated" */ val NotValidated: typings.openui5.sapUiMdcEnumsConditionValidatedMod.ConditionValidated.NotValidated & String = js.native
    
    /* "Validated" */ val Validated: typings.openui5.sapUiMdcEnumsConditionValidatedMod.ConditionValidated.Validated & String = js.native
  }
  
  @js.native
  sealed trait ConditionValidated extends StObject
  /**
    * @since 1.115
    *
    * Enumeration of the validated state of conditions
    *
    * If a `Condition` is chosen from a field help or validated against a field help it is set to be validated.
    * In this case the corresponding item in the value help is shown as selected.
    *
    * If the validated state of the `Condition` is undefined this means it is not defined if it is validated
    * or not.
    */
  @JSImport("sap/ui/mdc/enums/ConditionValidated", "ConditionValidated")
  @js.native
  object ConditionValidated extends StObject {
    
    /**
      * Condition is not validated
      */
    @js.native
    sealed trait NotValidated
      extends StObject
         with ConditionValidated
    
    /**
      * Condition is validated
      */
    @js.native
    sealed trait Validated
      extends StObject
         with ConditionValidated
  }
}
