package typings.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddMeasurementToCache extends js.Object {
  
  /**
    * Should be called whenever there is a new measurement associated with a given data object.
    * If the data has a cacheKey, store that measurement in the measurementsCache.
    */
  def addMeasurementToCache(data: js.Any, measurement: Double): scala.Unit = js.native
  
  /**
    * Checks if the provided data has a cacheKey. If it has a cacheKey and there is a
    * corresponding entry in the measurementsCache, then it will return that value.
    * Returns undefined otherwise.
    */
  def getCachedMeasurement(data: js.Any): js.UndefOr[Double] = js.native
}
object AddMeasurementToCache {
  
  @scala.inline
  def apply(
    addMeasurementToCache: (js.Any, Double) => scala.Unit,
    getCachedMeasurement: js.Any => js.UndefOr[Double]
  ): AddMeasurementToCache = {
    val __obj = js.Dynamic.literal(addMeasurementToCache = js.Any.fromFunction2(addMeasurementToCache), getCachedMeasurement = js.Any.fromFunction1(getCachedMeasurement))
    __obj.asInstanceOf[AddMeasurementToCache]
  }
  
  @scala.inline
  implicit class AddMeasurementToCacheOps[Self <: AddMeasurementToCache] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddMeasurementToCache(value: (js.Any, Double) => scala.Unit): Self = this.set("addMeasurementToCache", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetCachedMeasurement(value: js.Any => js.UndefOr[Double]): Self = this.set("getCachedMeasurement", js.Any.fromFunction1(value))
  }
}
