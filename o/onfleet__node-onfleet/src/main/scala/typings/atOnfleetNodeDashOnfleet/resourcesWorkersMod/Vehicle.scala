package typings.atOnfleetNodeDashOnfleet.resourcesWorkersMod

import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetStrings.BICYCLE
import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetStrings.CAR
import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetStrings.MOTORCYCLE
import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetStrings.TRUCK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vehicle extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var licensePlate: js.UndefOr[String] = js.undefined
  var `type`: BICYCLE | CAR | MOTORCYCLE | TRUCK
}

object Vehicle {
  @scala.inline
  def apply(
    `type`: BICYCLE | CAR | MOTORCYCLE | TRUCK,
    color: String = null,
    description: String = null,
    licensePlate: String = null
  ): Vehicle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (licensePlate != null) __obj.updateDynamic("licensePlate")(licensePlate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vehicle]
  }
}

