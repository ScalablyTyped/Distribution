package typings
package minecraftDashScriptingDashTypesDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered whenever the weather changes. It contains information about the weather it is changing to.
  */
trait IWeatherChangedEventData extends js.Object {
  /**
    * The name of the dimension where the weather change happened
    */
  var dimension: minecraftDashScriptingDashTypesDashSharedLib.Dimension
  /**
    * Tells if the new weather has lightning
    */
  var lightning: scala.Boolean
  /**
    * Tells if the new weather has rain
    */
  var raining: scala.Boolean
}

object IWeatherChangedEventData {
  @scala.inline
  def apply(
    dimension: minecraftDashScriptingDashTypesDashSharedLib.Dimension,
    lightning: scala.Boolean,
    raining: scala.Boolean
  ): IWeatherChangedEventData = {
    val __obj = js.Dynamic.literal(dimension = dimension.asInstanceOf[js.Any], lightning = lightning, raining = raining)
  
    __obj.asInstanceOf[IWeatherChangedEventData]
  }
}

