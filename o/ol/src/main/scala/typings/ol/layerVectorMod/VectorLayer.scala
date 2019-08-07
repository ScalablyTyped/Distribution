package typings.ol.layerVectorMod

import typings.ol.layerTypeMod.LayerType
import typings.ol.layerVectorRenderTypeMod.VectorRenderType
import typings.ol.renderMod.OrderFunction
import typings.ol.styleStyleMod.StyleFunction
import typings.ol.styleStyleMod.StyleLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorLayer
  extends typings.ol.layerLayerMod.default {
  var `type`: LayerType = js.native
  def getDeclutter(): Boolean = js.native
  def getRenderBuffer(): Double = js.native
  def getRenderMode(): VectorRenderType | String = js.native
  def getRenderOrder(): js.Function2[
    /* p0 */ typings.ol.featureMod.default, 
    /* p1 */ typings.ol.featureMod.default, 
    Double
  ] = js.native
  @JSName("getSource")
  def getSource_default(): typings.ol.sourceSourceMod.default = js.native
  def getStyle(): StyleLike = js.native
  def getStyleFunction(): StyleFunction = js.native
  def getUpdateWhileAnimating(): Boolean = js.native
  def getUpdateWhileInteracting(): Boolean = js.native
  def setDeclutter(declutter: Boolean): Unit = js.native
  def setRenderOrder(): Unit = js.native
  def setRenderOrder(renderOrder: OrderFunction): Unit = js.native
  def setStyle(): Unit = js.native
  def setStyle(style: js.Array[typings.ol.styleStyleMod.default]): Unit = js.native
  def setStyle(style: StyleFunction): Unit = js.native
  def setStyle(style: typings.ol.styleStyleMod.default): Unit = js.native
}

