package typings.onfleetNodeOnfleet.workersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped [@onfleet/node-onfleet.@onfleet/node-onfleet/Resources/Destinations.Longitude, @onfleet/node-onfleet.@onfleet/node-onfleet/Resources/Destinations.Latitude] */ trait GetWorkerByLocationProps extends js.Object {
  var radius: js.UndefOr[Double] = js.undefined
}

object GetWorkerByLocationProps {
  @scala.inline
  def apply(radius: js.UndefOr[Double] = js.undefined): GetWorkerByLocationProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkerByLocationProps]
  }
}

