package typings.openlayers.mod.source

import typings.openlayers.mod.GlobalObject
import typings.openlayers.mod.olx.source.CartoDBOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Layer source for the CartoDB tiles.
  *
  * @param options CartoDB options.
  * @api
  */
@JSImport("openlayers", "source.CartoDB")
@js.native
open class CartoDB protected () extends XYZ {
  /**
    * @classdesc
    * Layer source for the CartoDB tiles.
    *
    * @param options CartoDB options.
    * @api
    */
  def this(options: CartoDBOptions) = this()
  
  /**
    * Returns the current config.
    * @return The current configuration.
    * @api
    */
  def getConfig(): GlobalObject = js.native
  
  /**
    * Sets the CartoDB config
    * @param config In the case of anonymous maps, a CartoDB configuration
    *     object.
    * If using named maps, a key-value lookup with the template parameters.
    * @api
    */
  def setConfig(config: GlobalObject): Unit = js.native
  
  /**
    * Updates the carto db config.
    * @param config a key-value lookup. Values will replace current values
    *     in the config.
    * @api
    */
  def updateConfig(config: GlobalObject): Unit = js.native
}
