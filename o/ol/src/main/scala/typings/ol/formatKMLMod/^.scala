package typings.ol.formatKMLMod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/KML", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getDefaultFillStyle(): typings.ol.styleFillMod.default = js.native
  def getDefaultImageStyle(): typings.ol.styleImageMod.default = js.native
  def getDefaultStrokeStyle(): typings.ol.styleStrokeMod.default = js.native
  def getDefaultStyle(): typings.ol.styleStyleMod.default = js.native
  def getDefaultStyleArray(): js.Array[typings.ol.styleStyleMod.default] = js.native
  def getDefaultTextStyle(): typings.ol.styleTextMod.default = js.native
  def readFlatCoordinates(node: Node): js.UndefOr[js.Array[Double]] = js.native
}

