package typings
package mobxDashReactLib.mobxDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWrappedComponent[P] extends js.Object {
  var wrappedComponent: IReactComponent[P]
  var wrappedInstance: js.UndefOr[reactLib.reactMod.ReactNs.ReactInstance]
}

object IWrappedComponent {
  @scala.inline
  def apply[P](
    wrappedComponent: IReactComponent[P],
    wrappedInstance: reactLib.reactMod.ReactNs.ReactInstance = null
  ): IWrappedComponent[P] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("wrappedComponent")(wrappedComponent.asInstanceOf[js.Any])
    if (wrappedInstance != null) __obj.updateDynamic("wrappedInstance")(wrappedInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWrappedComponent[P]]
  }
}

