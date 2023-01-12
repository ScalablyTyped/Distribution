package typings.openseadragon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobLimit extends StObject {
  
  var jobLimit: js.UndefOr[Double] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object JobLimit {
  
  inline def apply(): JobLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobLimit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobLimit] (val x: Self) extends AnyVal {
    
    inline def setJobLimit(value: Double): Self = StObject.set(x, "jobLimit", value.asInstanceOf[js.Any])
    
    inline def setJobLimitUndefined: Self = StObject.set(x, "jobLimit", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
