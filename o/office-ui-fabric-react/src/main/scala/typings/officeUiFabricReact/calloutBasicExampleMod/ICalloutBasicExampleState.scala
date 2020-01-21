package typings.officeUiFabricReact.calloutBasicExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalloutBasicExampleState extends js.Object {
  var isCalloutVisible: js.UndefOr[Boolean] = js.undefined
}

object ICalloutBasicExampleState {
  @scala.inline
  def apply(isCalloutVisible: js.UndefOr[Boolean] = js.undefined): ICalloutBasicExampleState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isCalloutVisible)) __obj.updateDynamic("isCalloutVisible")(isCalloutVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalloutBasicExampleState]
  }
}

