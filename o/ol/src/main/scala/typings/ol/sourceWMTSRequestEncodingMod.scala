package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/source/WMTSRequestEncoding", JSImport.Namespace)
@js.native
object sourceWMTSRequestEncodingMod extends js.Object {
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
    /* "KVP" */ val KVP: typings.ol.sourceWMTSRequestEncodingMod.WMTSRequestEncoding.KVP with String = js.native
    /* "REST" */ val REST: typings.ol.sourceWMTSRequestEncodingMod.WMTSRequestEncoding.REST with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[WMTSRequestEncoding with String] = js.native
  }
  
}

