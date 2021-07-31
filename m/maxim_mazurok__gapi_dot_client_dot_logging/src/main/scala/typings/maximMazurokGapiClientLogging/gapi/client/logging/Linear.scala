package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Linear extends StObject {
  
  /** Must be greater than 0. */
  var numFiniteBuckets: js.UndefOr[Double] = js.undefined
  
  /** Lower bound of the first bucket. */
  var offset: js.UndefOr[Double] = js.undefined
  
  /** Must be greater than 0. */
  var width: js.UndefOr[Double] = js.undefined
}
object Linear {
  
  @scala.inline
  def apply(): Linear = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Linear]
  }
  
  @scala.inline
  implicit class LinearMutableBuilder[Self <: Linear] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumFiniteBuckets(value: Double): Self = StObject.set(x, "numFiniteBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumFiniteBucketsUndefined: Self = StObject.set(x, "numFiniteBuckets", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
