package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcEnumFilterBarValidationStatusMod {
  
  /**
    * @SINCE 1.110
    *
    * Enumeration of the possible validation types.
    */
  @JSImport("sap/ui/mdc/enum/FilterBarValidationStatus", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FilterBarValidationStatus & String] = js.native
    
    /* "undefined" */ val FieldInErrorState: typings.openui5.sapUiMdcEnumFilterBarValidationStatusMod.FilterBarValidationStatus.FieldInErrorState & String = js.native
    
    /* "undefined" */ val NoError: typings.openui5.sapUiMdcEnumFilterBarValidationStatusMod.FilterBarValidationStatus.NoError & String = js.native
    
    /* "undefined" */ val RequiredHasNoValue: typings.openui5.sapUiMdcEnumFilterBarValidationStatusMod.FilterBarValidationStatus.RequiredHasNoValue & String = js.native
  }
  
  @js.native
  sealed trait FilterBarValidationStatus extends StObject
  /**
    * @SINCE 1.110
    *
    * Enumeration of the possible validation types.
    */
  @JSImport("sap/ui/mdc/enum/FilterBarValidationStatus", "FilterBarValidationStatus")
  @js.native
  object FilterBarValidationStatus extends StObject {
    
    /**
      * Filter field in error state.
      */
    @js.native
    sealed trait FieldInErrorState
      extends StObject
         with FilterBarValidationStatus
    
    /**
      * No errors detected.
      */
    @js.native
    sealed trait NoError
      extends StObject
         with FilterBarValidationStatus
    
    /**
      * Required filter filed without a value.
      */
    @js.native
    sealed trait RequiredHasNoValue
      extends StObject
         with FilterBarValidationStatus
  }
}
