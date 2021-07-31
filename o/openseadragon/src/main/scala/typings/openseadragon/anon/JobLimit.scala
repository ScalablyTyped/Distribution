package typings.openseadragon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobLimit extends StObject {
  
  var jobLimit: js.UndefOr[Double] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object JobLimit {
  
  @scala.inline
  def apply(): JobLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobLimit]
  }
  
  @scala.inline
  implicit class JobLimitMutableBuilder[Self <: JobLimit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobLimit(value: Double): Self = StObject.set(x, "jobLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobLimitUndefined: Self = StObject.set(x, "jobLimit", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
