package typings
package olLib.layerBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseLayer
  extends olLib.objectMod.default {
  def getExtent(): olLib.extentMod.Extent = js.native
  def getLayerState(): olLib.layerLayerMod.State = js.native
  def getLayerStatesArray(): js.Array[olLib.layerLayerMod.State] = js.native
  def getLayerStatesArray(opt_states: js.Array[olLib.layerLayerMod.State]): js.Array[olLib.layerLayerMod.State] = js.native
  def getLayersArray(): js.Array[olLib.layerLayerMod.default] = js.native
  def getLayersArray(opt_array: js.Array[olLib.layerLayerMod.default]): js.Array[olLib.layerLayerMod.default] = js.native
  def getMaxResolution(): scala.Double = js.native
  def getMinResolution(): scala.Double = js.native
  def getOpacity(): scala.Double = js.native
  def getSourceState(): olLib.sourceStateMod.State = js.native
  def getType(): olLib.layerTypeMod.LayerType = js.native
  def getVisible(): scala.Boolean = js.native
  def getZIndex(): scala.Double = js.native
  @JSName("on")
  def `on_change:extent`(
    `type`: olLib.olLibStrings.`change:extent`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def `on_change:maxResolution`(
    `type`: olLib.olLibStrings.`change:maxResolution`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def `on_change:minResolution`(
    `type`: olLib.olLibStrings.`change:minResolution`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def `on_change:opacity`(
    `type`: olLib.olLibStrings.`change:opacity`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def `on_change:visible`(
    `type`: olLib.olLibStrings.`change:visible`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def `on_change:zIndex`(
    `type`: olLib.olLibStrings.`change:zIndex`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def `once_change:extent`(
    `type`: olLib.olLibStrings.`change:extent`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def `once_change:maxResolution`(
    `type`: olLib.olLibStrings.`change:maxResolution`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def `once_change:minResolution`(
    `type`: olLib.olLibStrings.`change:minResolution`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def `once_change:opacity`(
    `type`: olLib.olLibStrings.`change:opacity`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def `once_change:visible`(
    `type`: olLib.olLibStrings.`change:visible`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def `once_change:zIndex`(
    `type`: olLib.olLibStrings.`change:zIndex`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  def setExtent(extent: olLib.extentMod.Extent): scala.Unit = js.native
  def setMaxResolution(maxResolution: scala.Double): scala.Unit = js.native
  def setMinResolution(minResolution: scala.Double): scala.Unit = js.native
  def setOpacity(opacity: scala.Double): scala.Unit = js.native
  def setVisible(visible: scala.Boolean): scala.Unit = js.native
  def setZIndex(zindex: scala.Double): scala.Unit = js.native
  @JSName("un")
  def `un_change:extent`(
    `type`: olLib.olLibStrings.`change:extent`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def `un_change:maxResolution`(
    `type`: olLib.olLibStrings.`change:maxResolution`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def `un_change:minResolution`(
    `type`: olLib.olLibStrings.`change:minResolution`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def `un_change:opacity`(
    `type`: olLib.olLibStrings.`change:opacity`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def `un_change:visible`(
    `type`: olLib.olLibStrings.`change:visible`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def `un_change:zIndex`(
    `type`: olLib.olLibStrings.`change:zIndex`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
}

