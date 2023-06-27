package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcEnumsLinkTypeMod {
  
  /**
    * @since 1.115
    *
    * Defines the behavior of the {@link sap.ui.mdc.Link}.
    */
  @JSImport("sap/ui/mdc/enums/LinkType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LinkType & String] = js.native
    
    /* "1" */ val DirectLink: typings.openui5.sapUiMdcEnumsLinkTypeMod.LinkType.DirectLink & String = js.native
    
    /* "2" */ val Popover: typings.openui5.sapUiMdcEnumsLinkTypeMod.LinkType.Popover & String = js.native
    
    /* "0" */ val Text: typings.openui5.sapUiMdcEnumsLinkTypeMod.LinkType.Text & String = js.native
  }
  
  @js.native
  sealed trait LinkType extends StObject
  /**
    * @since 1.115
    *
    * Defines the behavior of the {@link sap.ui.mdc.Link}.
    */
  @JSImport("sap/ui/mdc/enums/LinkType", "LinkType")
  @js.native
  object LinkType extends StObject {
    
    /**
      * {@link sap.ui.mdc.Link} is rendered as a {@link sap.m.Link} that works as a direct link
      */
    @js.native
    sealed trait DirectLink
      extends StObject
         with LinkType
    
    /**
      * {@link sap.ui.mdc.Link} is rendered as a {@link sap.m.Link} that opens a popover when pressed
      */
    @js.native
    sealed trait Popover
      extends StObject
         with LinkType
    
    /**
      * {@link sap.ui.mdc.Link} is rendered as a {@link sap.m.Text}
      */
    @js.native
    sealed trait Text
      extends StObject
         with LinkType
  }
}
