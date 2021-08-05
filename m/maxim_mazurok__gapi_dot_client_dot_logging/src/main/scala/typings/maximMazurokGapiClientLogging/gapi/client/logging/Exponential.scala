package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exponential extends StObject {
  
  /** Must be greater than 1. */
  var growthFactor: js.UndefOr[Double] = js.undefined
  
  /** Must be greater than 0. */
  var numFiniteBuckets: js.UndefOr[Double] = js.undefined
  
  /** Must be greater than 0. */
  var scale: js.UndefOr[Double] = js.undefined
}
object Exponential {
  
  inline def apply(): Exponential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Exponential]
  }
  
  extension [Self <: Exponential](x: Self) {
    
    inline def setGrowthFactor(value: Double): Self = StObject.set(x, "growthFactor", value.asInstanceOf[js.Any])
    
    inline def setGrowthFactorUndefined: Self = StObject.set(x, "growthFactor", js.undefined)
    
    inline def setNumFiniteBuckets(value: Double): Self = StObject.set(x, "numFiniteBuckets", value.asInstanceOf[js.Any])
    
    inline def setNumFiniteBucketsUndefined: Self = StObject.set(x, "numFiniteBuckets", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
