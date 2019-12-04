package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.formatGML3Mod.GML3
import typings.ol.formatGMLBaseMod.Options
import typings.std.Element
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/GML3", JSImport.Namespace)
@js.native
object formatGML3Mod extends js.Object {
  @js.native
  trait GML3
    extends typings.ol.formatGMLBaseMod.default {
    def writeEnvelope(node: Element, extent: Extent, objectStack: js.Array[_]): Unit = js.native
    def writeFeatureElement(node: Element, feature: typings.ol.featureMod.default, objectStack: js.Array[_]): Unit = js.native
    def writeGeometryElement(node: Node, geometry: Extent, objectStack: js.Array[_]): Unit = js.native
    def writeGeometryElement(node: Node, geometry: typings.ol.geomGeometryMod.default, objectStack: js.Array[_]): Unit = js.native
  }
  
  @js.native
  class default () extends GML3 {
    def this(opt_options: Options) = this()
  }
  
}

