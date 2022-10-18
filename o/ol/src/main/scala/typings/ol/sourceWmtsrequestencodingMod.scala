package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceWmtsrequestencodingMod {
  
  @JSImport("ol/source/WMTSRequestEncoding", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[WMTSRequestEncoding & String] = js.native
    
    /* "KVP" */ val KVP: typings.ol.sourceWmtsrequestencodingMod.WMTSRequestEncoding.KVP & String = js.native
    
    /* "REST" */ val REST: typings.ol.sourceWmtsrequestencodingMod.WMTSRequestEncoding.REST & String = js.native
  }
  
  @js.native
  sealed trait WMTSRequestEncoding extends StObject
  @JSImport("ol/source/WMTSRequestEncoding", "WMTSRequestEncoding")
  @js.native
  object WMTSRequestEncoding extends StObject {
    
    @js.native
    sealed trait KVP
      extends StObject
         with WMTSRequestEncoding
    
    @js.native
    sealed trait REST
      extends StObject
         with WMTSRequestEncoding
  }
}
