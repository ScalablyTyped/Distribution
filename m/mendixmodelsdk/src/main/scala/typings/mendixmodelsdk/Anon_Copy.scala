package typings.mendixmodelsdk

import typings.mendixmodelsdk.distSdkInternalElementsMod.Element
import typings.mendixmodelsdk.distSdkInternalStructuresMod.Structure
import typings.mendixmodelsdk.distSdkUtilsMod.utilsNs.IMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Copy extends js.Object {
  var copy: Element
  var idMap: IMap[Structure]
}

object Anon_Copy {
  @scala.inline
  def apply(copy: Element, idMap: IMap[Structure]): Anon_Copy = {
    val __obj = js.Dynamic.literal(copy = copy, idMap = idMap)
  
    __obj.asInstanceOf[Anon_Copy]
  }
}

