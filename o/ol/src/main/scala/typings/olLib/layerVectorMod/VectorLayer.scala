package typings
package olLib.layerVectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorLayer
  extends olLib.layerLayerMod.default {
  var `type`: olLib.layerTypeMod.LayerType = js.native
  def getDeclutter(): scala.Boolean = js.native
  def getRenderBuffer(): scala.Double = js.native
  def getRenderMode(): olLib.layerVectorRenderTypeMod.VectorRenderType | java.lang.String = js.native
  def getRenderOrder(): js.Function2[
    /* param0 */ olLib.featureMod.default, 
    /* param1 */ olLib.featureMod.default, 
    scala.Double
  ] = js.native
  @JSName("getSource")
  def getSource_default(): olLib.sourceSourceMod.default = js.native
  def getStyle(): olLib.styleStyleMod.StyleLike = js.native
  def getStyleFunction(): olLib.styleStyleMod.StyleFunction = js.native
  def getUpdateWhileAnimating(): scala.Boolean = js.native
  def getUpdateWhileInteracting(): scala.Boolean = js.native
  def setDeclutter(declutter: scala.Boolean): scala.Unit = js.native
  def setRenderOrder(renderOrder: olLib.renderMod.OrderFunction): scala.Unit = js.native
  def setStyle(style: js.Array[olLib.styleStyleMod.default]): scala.Unit = js.native
  def setStyle(style: olLib.styleStyleMod.StyleFunction): scala.Unit = js.native
  def setStyle(style: olLib.styleStyleMod.default): scala.Unit = js.native
}

