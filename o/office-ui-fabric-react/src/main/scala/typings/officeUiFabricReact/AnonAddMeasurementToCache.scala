package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddMeasurementToCache extends js.Object {
  /**
    * Should be called whenever there is a new measurement associated with a given data object.
    * If the data has a cacheKey, store that measurement in the measurementsCache.
    */
  def addMeasurementToCache(data: js.Any, measurement: Double): Unit
  /**
    * Checks if the provided data has a cacheKey. If it has a cacheKey and there is a
    * corresponding entry in the measurementsCache, then it will return that value.
    * Returns undefined otherwise.
    */
  def getCachedMeasurement(data: js.Any): js.UndefOr[Double]
}

object AnonAddMeasurementToCache {
  @scala.inline
  def apply(
    addMeasurementToCache: (js.Any, Double) => Unit,
    getCachedMeasurement: js.Any => js.UndefOr[Double]
  ): AnonAddMeasurementToCache = {
    val __obj = js.Dynamic.literal(addMeasurementToCache = js.Any.fromFunction2(addMeasurementToCache), getCachedMeasurement = js.Any.fromFunction1(getCachedMeasurement))
    __obj.asInstanceOf[AnonAddMeasurementToCache]
  }
}

