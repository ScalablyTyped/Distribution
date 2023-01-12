package typings.ntqdm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<ntqdm.ntqdm.TqdmOptions> */
  trait PartialTqdmOptions extends StObject {
    
    var desc: js.UndefOr[String] = js.undefined
    
    var logging: js.UndefOr[Boolean] = js.undefined
    
    var minInterval: js.UndefOr[Double] = js.undefined
    
    var minIter: js.UndefOr[Double] = js.undefined
    
    var total: js.UndefOr[Double] = js.undefined
  }
  object PartialTqdmOptions {
    
    inline def apply(): PartialTqdmOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialTqdmOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialTqdmOptions] (val x: Self) extends AnyVal {
      
      inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
      
      inline def setLogging(value: Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      inline def setMinInterval(value: Double): Self = StObject.set(x, "minInterval", value.asInstanceOf[js.Any])
      
      inline def setMinIntervalUndefined: Self = StObject.set(x, "minInterval", js.undefined)
      
      inline def setMinIter(value: Double): Self = StObject.set(x, "minIter", value.asInstanceOf[js.Any])
      
      inline def setMinIterUndefined: Self = StObject.set(x, "minIter", js.undefined)
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
}
