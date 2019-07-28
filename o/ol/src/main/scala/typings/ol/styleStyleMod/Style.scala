package typings.ol.styleStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Style extends js.Object {
  def getFill(): typings.ol.styleFillMod.default = js.native
  def getGeometry(): String | typings.ol.geomGeometryMod.default | GeometryFunction = js.native
  def getGeometryFunction(): GeometryFunction = js.native
  def getImage(): typings.ol.styleImageMod.default = js.native
  def getRenderer(): RenderFunction = js.native
  def getStroke(): typings.ol.styleStrokeMod.default = js.native
  def getText(): typings.ol.styleTextMod.default = js.native
  def getZIndex(): Double = js.native
  def setFill(fill: typings.ol.styleFillMod.default): Unit = js.native
  def setGeometry(geometry: String): Unit = js.native
  def setGeometry(geometry: typings.ol.geomGeometryMod.default): Unit = js.native
  def setGeometry(geometry: GeometryFunction): Unit = js.native
  def setImage(image: typings.ol.styleImageMod.default): Unit = js.native
  def setRenderer(renderer: RenderFunction): Unit = js.native
  def setStroke(stroke: typings.ol.styleStrokeMod.default): Unit = js.native
  def setText(text: typings.ol.styleTextMod.default): Unit = js.native
  def setZIndex(zIndex: Double): Unit = js.native
}

