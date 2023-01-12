package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapTntLibraryMod {
  
  @js.native
  sealed trait RenderMode extends StObject
  @JSImport("sap/tnt/library", "RenderMode")
  @js.native
  object RenderMode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[RenderMode & String] = js.native
    
    /**
      * When type of the content of `InfoLabel` is text padding are loose
      */
    @js.native
    sealed trait Loose
      extends StObject
         with RenderMode
    /* "Loose" */ val Loose: typings.openui5.sapTntLibraryMod.RenderMode.Loose & String = js.native
    
    /**
      * When type of the content of `InfoLabel` is numeric paddings are narrow
      */
    @js.native
    sealed trait Narrow
      extends StObject
         with RenderMode
    /* "Narrow" */ val Narrow: typings.openui5.sapTntLibraryMod.RenderMode.Narrow & String = js.native
  }
  
  trait IToolHeader extends StObject {
    
    var __implements__sap_tnt_IToolHeader: Boolean
  }
  object IToolHeader {
    
    inline def apply(__implements__sap_tnt_IToolHeader: Boolean): IToolHeader = {
      val __obj = js.Dynamic.literal(__implements__sap_tnt_IToolHeader = __implements__sap_tnt_IToolHeader.asInstanceOf[js.Any])
      __obj.asInstanceOf[IToolHeader]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IToolHeader] (val x: Self) extends AnyVal {
      
      inline def set__implements__sap_tnt_IToolHeader(value: Boolean): Self = StObject.set(x, "__implements__sap_tnt_IToolHeader", value.asInstanceOf[js.Any])
    }
  }
}
