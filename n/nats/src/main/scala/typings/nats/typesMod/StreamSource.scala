package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamSource extends StObject {
  
  var filter_subject: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var opt_start_seq: js.UndefOr[Double] = js.undefined
  
  var opt_start_time: js.UndefOr[String] = js.undefined
}
object StreamSource {
  
  inline def apply(name: String): StreamSource = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamSource]
  }
  
  extension [Self <: StreamSource](x: Self) {
    
    inline def setFilter_subject(value: String): Self = StObject.set(x, "filter_subject", value.asInstanceOf[js.Any])
    
    inline def setFilter_subjectUndefined: Self = StObject.set(x, "filter_subject", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOpt_start_seq(value: Double): Self = StObject.set(x, "opt_start_seq", value.asInstanceOf[js.Any])
    
    inline def setOpt_start_seqUndefined: Self = StObject.set(x, "opt_start_seq", js.undefined)
    
    inline def setOpt_start_time(value: String): Self = StObject.set(x, "opt_start_time", value.asInstanceOf[js.Any])
    
    inline def setOpt_start_timeUndefined: Self = StObject.set(x, "opt_start_time", js.undefined)
  }
}
