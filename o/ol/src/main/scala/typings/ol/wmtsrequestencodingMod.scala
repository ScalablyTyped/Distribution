package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/source/WMTSRequestEncoding", JSImport.Namespace)
@js.native
object wmtsrequestencodingMod extends js.Object {
  
  @js.native
  sealed trait WMTSRequestEncoding extends js.Object
  @js.native
  object WMTSRequestEncoding extends js.Object {
    
    @js.native
    sealed trait KVP extends WMTSRequestEncoding
    
    @js.native
    sealed trait REST extends WMTSRequestEncoding
  }
  
  @js.native
  object default extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[WMTSRequestEncoding with String] = js.native
    
    /* "KVP" */ val KVP: typings.ol.wmtsrequestencodingMod.WMTSRequestEncoding.KVP with String = js.native
    
    /* "REST" */ val REST: typings.ol.wmtsrequestencodingMod.WMTSRequestEncoding.REST with String = js.native
  }
}
