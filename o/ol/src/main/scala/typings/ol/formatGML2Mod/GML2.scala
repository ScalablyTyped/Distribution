package typings.ol.formatGML2Mod

import typings.ol.extentMod.Extent
import typings.std.Element
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GML2
  extends typings.ol.formatGMLBaseMod.default {
  def writeFeatureElement(node: Element, feature: typings.ol.featureMod.default, objectStack: js.Array[_]): Unit = js.native
  def writeGeometryElement(node: Node, geometry: Extent, objectStack: js.Array[_]): Unit = js.native
  def writeGeometryElement(node: Node, geometry: typings.ol.geomGeometryMod.default, objectStack: js.Array[_]): Unit = js.native
}

