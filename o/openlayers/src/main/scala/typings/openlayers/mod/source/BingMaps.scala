package typings.openlayers.mod.source

import typings.openlayers.mod.Attribution
import typings.openlayers.mod.olx.source.BingMapsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Layer source for Bing Maps tile data.
  *
  * @param options Bing Maps options.
  * @api stable
  */
@JSImport("openlayers", "source.BingMaps")
@js.native
class BingMaps protected () extends TileImage {
  /**
    * @classdesc
    * Layer source for Bing Maps tile data.
    *
    * @param options Bing Maps options.
    * @api stable
    */
  def this(options: BingMapsOptions) = this()
}
object BingMaps {
  
  @JSImport("openlayers", "source.BingMaps")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The attribution containing a link to the Microsoft® Bing™ Maps Platform APIs’
    * Terms Of Use.
    * @const
    * @api
    */
  /* static member */
  @JSImport("openlayers", "source.BingMaps.TOS_ATTRIBUTION")
  @js.native
  def TOS_ATTRIBUTION: Attribution = js.native
  @scala.inline
  def TOS_ATTRIBUTION_=(x: Attribution): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOS_ATTRIBUTION")(x.asInstanceOf[js.Any])
}
