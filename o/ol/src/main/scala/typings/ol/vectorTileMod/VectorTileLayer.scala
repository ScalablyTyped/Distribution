package typings.ol.vectorTileMod

import typings.ol.eventsMod.EventsKey
import typings.ol.objectMod.ObjectEvent
import typings.ol.olStrings.changeColonpreload
import typings.ol.olStrings.changeColonuseInterimTilesOnError
import typings.ol.vectorTileRenderTypeMod.VectorTileRenderType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VectorTileLayer
  extends typings.ol.baseVectorMod.default[typings.ol.sourceVectorTileMod.default] {
  
  /**
    * Return the level as number to which we will preload tiles up to.
    */
  def getPreload(): Double = js.native
  
  def getRenderMode(): VectorTileRenderType = js.native
  
  /**
    * Whether we use interim tiles on error.
    */
  def getUseInterimTilesOnError(): Boolean = js.native
  
  @JSName("on")
  def on_changepreload(`type`: changeColonpreload, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeuseInterimTilesOnError(`type`: changeColonuseInterimTilesOnError, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  
  @JSName("once")
  def once_changepreload(`type`: changeColonpreload, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeuseInterimTilesOnError(`type`: changeColonuseInterimTilesOnError, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  
  /**
    * Set the level as number to which we will preload tiles up to.
    */
  def setPreload(preload: Double): Unit = js.native
  
  /**
    * Set whether we use interim tiles on error.
    */
  def setUseInterimTilesOnError(useInterimTilesOnError: Boolean): Unit = js.native
  
  @JSName("un")
  def un_changepreload(`type`: changeColonpreload, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeuseInterimTilesOnError(`type`: changeColonuseInterimTilesOnError, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
}
