package typings
package ngDashGridLib.ngGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlugin extends js.Object {
  def init(childScope: IGridScope, gridInstance: IGridInstance, services: js.Any): scala.Unit
}

object IPlugin {
  @scala.inline
  def apply(init: js.Function3[IGridScope, IGridInstance, js.Any, scala.Unit]): IPlugin = {
    val __obj = js.Dynamic.literal(init = init)
  
    __obj.asInstanceOf[IPlugin]
  }
}

