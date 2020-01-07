package typings.ol.layerBaseVectorMod

import typings.ol.renderMod.OrderFunction
import typings.ol.styleStyleMod.StyleFunction
import typings.ol.styleStyleMod.StyleLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseVectorLayer[VectorSourceType /* <: typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default] | typings.ol.sourceVectorTileMod.default */]
  extends typings.ol.layerLayerMod.default[VectorSourceType] {
  def getDeclutter(): Boolean = js.native
  def getRenderBuffer(): Double = js.native
  def getRenderOrder(): js.Function2[
    /* p0 */ typings.ol.featureMod.default[typings.ol.geomGeometryMod.default], 
    /* p1 */ typings.ol.featureMod.default[typings.ol.geomGeometryMod.default], 
    Double
  ] = js.native
  def getStyle(): StyleLike = js.native
  def getStyleFunction(): StyleFunction = js.native
  def getUpdateWhileAnimating(): Boolean = js.native
  def getUpdateWhileInteracting(): Boolean = js.native
  def setRenderOrder(): Unit = js.native
  def setRenderOrder(renderOrder: OrderFunction): Unit = js.native
  def setStyle(): Unit = js.native
  def setStyle(style: StyleLike): Unit = js.native
}

