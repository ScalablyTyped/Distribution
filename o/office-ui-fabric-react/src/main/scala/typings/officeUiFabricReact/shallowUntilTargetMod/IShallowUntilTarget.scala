package typings.officeUiFabricReact.shallowUntilTargetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShallowUntilTarget extends js.Object {
  var maxTries: Double
  var shallowOptions: IShallowRendererProps
}

object IShallowUntilTarget {
  @scala.inline
  def apply(maxTries: Double, shallowOptions: IShallowRendererProps): IShallowUntilTarget = {
    val __obj = js.Dynamic.literal(maxTries = maxTries.asInstanceOf[js.Any], shallowOptions = shallowOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShallowUntilTarget]
  }
}

