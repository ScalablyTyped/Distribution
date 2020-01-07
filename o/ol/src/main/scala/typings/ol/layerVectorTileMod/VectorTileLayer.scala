package typings.ol.layerVectorTileMod

import typings.ol.eventsMod.EventsKey
import typings.ol.layerVectorTileRenderTypeMod.VectorTileRenderType
import typings.ol.objectMod.ObjectEvent
import typings.ol.olStrings.changeColonpreload
import typings.ol.olStrings.changeColonuseInterimTilesOnError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorTileLayer
  extends typings.ol.layerBaseVectorMod.default[typings.ol.sourceVectorTileMod.default] {
  def getPreload(): Double = js.native
  def getRenderMode(): VectorTileRenderType = js.native
  def getUseInterimTilesOnError(): Boolean = js.native
  @JSName("on")
  def on_changepreload(`type`: changeColonpreload, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeuseInterimTilesOnError(`type`: changeColonuseInterimTilesOnError, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changepreload(`type`: changeColonpreload, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeuseInterimTilesOnError(`type`: changeColonuseInterimTilesOnError, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  def setPreload(preload: Double): Unit = js.native
  def setUseInterimTilesOnError(useInterimTilesOnError: Boolean): Unit = js.native
  @JSName("un")
  def un_changepreload(`type`: changeColonpreload, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeuseInterimTilesOnError(`type`: changeColonuseInterimTilesOnError, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
}

