package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcEnumsOperatorOverwriteMod {
  
  /**
    * @since 1.115
    *
    * Enumeration of the `OperatorOverwrite` in `Operator`.
    */
  @JSImport("sap/ui/mdc/enums/OperatorOverwrite", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[OperatorOverwrite & String] = js.native
    
    /* "getLongText" */ val getLongText: typings.openui5.sapUiMdcEnumsOperatorOverwriteMod.OperatorOverwrite.getLongText & String = js.native
    
    /* "getModelFilter" */ val getModelFilter: typings.openui5.sapUiMdcEnumsOperatorOverwriteMod.OperatorOverwrite.getModelFilter & String = js.native
  }
  
  @js.native
  sealed trait OperatorOverwrite extends StObject
  /**
    * @since 1.115
    *
    * Enumeration of the `OperatorOverwrite` in `Operator`.
    */
  @JSImport("sap/ui/mdc/enums/OperatorOverwrite", "OperatorOverwrite")
  @js.native
  object OperatorOverwrite extends StObject {
    
    /**
      * Overwrite the `getTypeText` function of the operator.
      */
    @js.native
    sealed trait getLongText
      extends StObject
         with OperatorOverwrite
    
    /**
      * Overwrite the `getModelFilter` function of the operator.
      */
    @js.native
    sealed trait getModelFilter
      extends StObject
         with OperatorOverwrite
  }
}
