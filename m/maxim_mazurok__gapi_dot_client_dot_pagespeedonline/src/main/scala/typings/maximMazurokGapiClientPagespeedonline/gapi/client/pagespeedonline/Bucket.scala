package typings.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bucket extends StObject {
  
  /** Upper bound for a bucket's range. */
  var max: js.UndefOr[Double] = js.undefined
  
  /** Lower bound for a bucket's range. */
  var min: js.UndefOr[Double] = js.undefined
  
  /** The proportion of data in this bucket. */
  var proportion: js.UndefOr[Double] = js.undefined
}
object Bucket {
  
  inline def apply(): Bucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bucket]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bucket] (val x: Self) extends AnyVal {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setProportion(value: Double): Self = StObject.set(x, "proportion", value.asInstanceOf[js.Any])
    
    inline def setProportionUndefined: Self = StObject.set(x, "proportion", js.undefined)
  }
}
