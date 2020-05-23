package typings.mendixmodelsdk.anon

import typings.mendixmodelsdk.elementsMod.Element
import typings.mendixmodelsdk.structuresMod.Structure
import typings.mendixmodelsdk.utilsMod.utils.IMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Copy extends js.Object {
  var copy: Element
  var idMap: IMap[Structure]
}

object Copy {
  @scala.inline
  def apply(copy: Element, idMap: IMap[Structure]): Copy = {
    val __obj = js.Dynamic.literal(copy = copy.asInstanceOf[js.Any], idMap = idMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Copy]
  }
}

