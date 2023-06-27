package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcEnumsFilterBarP13nModeMod {
  
  /**
    * @since 1.115
    *
    * Defines the personalization mode of the filter bar.
    */
  @JSImport("sap/ui/mdc/enums/FilterBarP13nMode", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FilterBarP13nMode & String] = js.native
    
    /* "Item" */ val Item: typings.openui5.sapUiMdcEnumsFilterBarP13nModeMod.FilterBarP13nMode.Item & String = js.native
    
    /* "Value" */ val Value: typings.openui5.sapUiMdcEnumsFilterBarP13nModeMod.FilterBarP13nMode.Value & String = js.native
  }
  
  @js.native
  sealed trait FilterBarP13nMode extends StObject
  /**
    * @since 1.115
    *
    * Defines the personalization mode of the filter bar.
    */
  @JSImport("sap/ui/mdc/enums/FilterBarP13nMode", "FilterBarP13nMode")
  @js.native
  object FilterBarP13nMode extends StObject {
    
    /**
      * Filter item personalization is enabled.
      */
    @js.native
    sealed trait Item
      extends StObject
         with FilterBarP13nMode
    
    /**
      * Condition personalization is enabled.
      */
    @js.native
    sealed trait Value
      extends StObject
         with FilterBarP13nMode
  }
}
