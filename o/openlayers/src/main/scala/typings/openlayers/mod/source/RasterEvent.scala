package typings.openlayers.mod.source

import typings.openlayers.mod.Extent_
import typings.openlayers.mod.GlobalObject
import typings.openlayers.mod.events.Event
import typings.openlayers.mod.olx.FrameState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Events emitted by {@link ol.source.Raster} instances are instances of this
  * type.
  *
  * @param type Type.
  * @param frameState The frame state.
  * @param data An object made available to operations.
  */
@JSImport("openlayers", "source.RasterEvent")
@js.native
open class RasterEvent protected () extends Event {
  /**
    * @classdesc
    * Events emitted by {@link ol.source.Raster} instances are instances of this
    * type.
    *
    * @param type Type.
    * @param frameState The frame state.
    * @param data An object made available to operations.
    */
  def this(`type`: String, frameState: FrameState, data: GlobalObject) = this()
  
  /**
    * An object made available to all operations.  This can be used by operations
    * as a storage object (e.g. for calculating statistics).
    * @api
    */
  var data: GlobalObject = js.native
  
  /**
    * The raster extent.
    * @api
    */
  var extent: Extent_ = js.native
  
  /**
    * The pixel resolution (map units per pixel).
    * @api
    */
  var resolution: Double = js.native
}
