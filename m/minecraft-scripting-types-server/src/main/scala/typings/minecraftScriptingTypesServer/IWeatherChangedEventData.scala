package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.Dimension
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
  var dimension: Dimension
  /**
    * Tells if the new weather has lightning
    */
  var lightning: Boolean
  /**
    * Tells if the new weather has rain
    */
  var raining: Boolean
}

object IWeatherChangedEventData {
  @scala.inline
  def apply(dimension: Dimension, lightning: Boolean, raining: Boolean): IWeatherChangedEventData = {
    val __obj = js.Dynamic.literal(dimension = dimension.asInstanceOf[js.Any], lightning = lightning.asInstanceOf[js.Any], raining = raining.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWeatherChangedEventData]
  }
}

