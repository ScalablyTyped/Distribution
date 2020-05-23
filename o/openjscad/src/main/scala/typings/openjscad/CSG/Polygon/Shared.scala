package typings.openjscad.CSG.Polygon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shared extends js.Object {
  var color: js.Any
  var tag: js.Any
  def getHash(): js.Any
  def getTag(): js.Any
}

object Shared {
  @scala.inline
  def apply(color: js.Any, getHash: () => js.Any, getTag: () => js.Any, tag: js.Any): Shared = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], getHash = js.Any.fromFunction0(getHash), getTag = js.Any.fromFunction0(getTag), tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shared]
  }
}

