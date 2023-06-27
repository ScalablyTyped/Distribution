package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcEnumsTableGrowingModeMod {
  
  /**
    * @since 1.115
    *
    * Defines the growing options of the responsive table.
    */
  @JSImport("sap/ui/mdc/enums/TableGrowingMode", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TableGrowingMode & String] = js.native
    
    /* "Basic" */ val Basic: typings.openui5.sapUiMdcEnumsTableGrowingModeMod.TableGrowingMode.Basic & String = js.native
    
    /* "None" */ val None: typings.openui5.sapUiMdcEnumsTableGrowingModeMod.TableGrowingMode.None & String = js.native
    
    /* "Scroll" */ val Scroll: typings.openui5.sapUiMdcEnumsTableGrowingModeMod.TableGrowingMode.Scroll & String = js.native
  }
  
  @js.native
  sealed trait TableGrowingMode extends StObject
  /**
    * @since 1.115
    *
    * Defines the growing options of the responsive table.
    */
  @JSImport("sap/ui/mdc/enums/TableGrowingMode", "TableGrowingMode")
  @js.native
  object TableGrowingMode extends StObject {
    
    /**
      * Basic growing takes place (`growing` is set in the responsive table)
      */
    @js.native
    sealed trait Basic
      extends StObject
         with TableGrowingMode
    
    /**
      * Growing does not take place (`growing` is not set in the responsive table)
      */
    @js.native
    sealed trait None
      extends StObject
         with TableGrowingMode
    
    /**
      * Growing with `scroll` takes place (`growing` and `growingScrollToLoad` are set in the responsive table)
      */
    @js.native
    sealed trait Scroll
      extends StObject
         with TableGrowingMode
  }
}
