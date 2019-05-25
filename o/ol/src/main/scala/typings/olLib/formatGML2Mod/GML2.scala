package typings
package olLib.formatGML2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GML2
  extends olLib.formatGMLBaseMod.default {
  def writeFeatureElement(node: stdLib.Element, feature: olLib.featureMod.default, objectStack: js.Array[_]): scala.Unit = js.native
  def writeGeometryElement(node: stdLib.Node, geometry: olLib.extentMod.Extent, objectStack: js.Array[_]): scala.Unit = js.native
  def writeGeometryElement(node: stdLib.Node, geometry: olLib.geomGeometryMod.default, objectStack: js.Array[_]): scala.Unit = js.native
}

