package typings.popperDotJs.popperDotJsMod.Popper

import typings.std.ClientRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceObject extends js.Object {
  var clientHeight: Double
  var clientWidth: Double
  def getBoundingClientRect(): ClientRect
}

object ReferenceObject {
  @scala.inline
  def apply(clientHeight: Double, clientWidth: Double, getBoundingClientRect: () => ClientRect): ReferenceObject = {
    val __obj = js.Dynamic.literal(clientHeight = clientHeight, clientWidth = clientWidth, getBoundingClientRect = js.Any.fromFunction0(getBoundingClientRect))
  
    __obj.asInstanceOf[ReferenceObject]
  }
}

