package typings.officeUiFabricReact.positioningContainerStylesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPositioningContainerNames extends js.Object {
  var beak: js.UndefOr[String] = js.undefined
  var beakCurtain: js.UndefOr[String] = js.undefined
  var container: String
  var main: String
  var overFlowYHidden: String
  /**
    * Root html container for this component.
    */
  var root: String
}

object IPositioningContainerNames {
  @scala.inline
  def apply(
    container: String,
    main: String,
    overFlowYHidden: String,
    root: String,
    beak: String = null,
    beakCurtain: String = null
  ): IPositioningContainerNames = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], overFlowYHidden = overFlowYHidden.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    if (beak != null) __obj.updateDynamic("beak")(beak.asInstanceOf[js.Any])
    if (beakCurtain != null) __obj.updateDynamic("beakCurtain")(beakCurtain.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPositioningContainerNames]
  }
}

