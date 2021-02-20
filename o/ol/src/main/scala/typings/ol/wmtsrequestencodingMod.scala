package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wmtsrequestencodingMod {
  
  @JSImport("ol/source/WMTSRequestEncoding", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[WMTSRequestEncoding with String] = js.native
    
    /* "KVP" */ val KVP: typings.ol.wmtsrequestencodingMod.WMTSRequestEncoding.KVP with String = js.native
    
    /* "REST" */ val REST: typings.ol.wmtsrequestencodingMod.WMTSRequestEncoding.REST with String = js.native
  }
  
  @js.native
  sealed trait WMTSRequestEncoding extends StObject
  @JSImport("ol/source/WMTSRequestEncoding", "WMTSRequestEncoding")
  @js.native
  object WMTSRequestEncoding extends StObject {
    
    @js.native
    sealed trait KVP extends WMTSRequestEncoding
    
    @js.native
    sealed trait REST extends WMTSRequestEncoding
  }
}
