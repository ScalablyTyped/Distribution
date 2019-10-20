package typings.atOnfleetNodeDashOnfleet.resourcesWorkersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped [@onfleet/node-onfleet.@onfleet/node-onfleet/Resources/Destinations.Longitude, @onfleet/node-onfleet.@onfleet/node-onfleet/Resources/Destinations.Latitude] */ trait GetWorkerByLocationProps extends js.Object {
  var radius: js.UndefOr[Double] = js.undefined
}

object GetWorkerByLocationProps {
  @scala.inline
  def apply(radius: Int | Double = null): GetWorkerByLocationProps = {
    val __obj = js.Dynamic.literal()
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkerByLocationProps]
  }
}

