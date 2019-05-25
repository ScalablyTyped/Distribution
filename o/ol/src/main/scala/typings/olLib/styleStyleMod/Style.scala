package typings
package olLib.styleStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Style extends js.Object {
  def getFill(): olLib.styleFillMod.default = js.native
  def getGeometry(): java.lang.String | olLib.geomGeometryMod.default | GeometryFunction = js.native
  def getGeometryFunction(): GeometryFunction = js.native
  def getImage(): olLib.styleImageMod.default = js.native
  def getRenderer(): RenderFunction = js.native
  def getStroke(): olLib.styleStrokeMod.default = js.native
  def getText(): olLib.styleTextMod.default = js.native
  def getZIndex(): scala.Double = js.native
  def setFill(fill: olLib.styleFillMod.default): scala.Unit = js.native
  def setGeometry(geometry: java.lang.String): scala.Unit = js.native
  def setGeometry(geometry: olLib.geomGeometryMod.default): scala.Unit = js.native
  def setGeometry(geometry: GeometryFunction): scala.Unit = js.native
  def setImage(image: olLib.styleImageMod.default): scala.Unit = js.native
  def setRenderer(renderer: RenderFunction): scala.Unit = js.native
  def setStroke(stroke: olLib.styleStrokeMod.default): scala.Unit = js.native
  def setText(text: olLib.styleTextMod.default): scala.Unit = js.native
  def setZIndex(zIndex: scala.Double): scala.Unit = js.native
}

