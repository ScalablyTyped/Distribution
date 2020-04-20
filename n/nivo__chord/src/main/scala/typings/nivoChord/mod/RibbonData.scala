package typings.nivoChord.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RibbonData extends js.Object {
  var id: String
  var source: RibbonSubject
  var target: RibbonSubject
}

object RibbonData {
  @scala.inline
  def apply(id: String, source: RibbonSubject, target: RibbonSubject): RibbonData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[RibbonData]
  }
}

