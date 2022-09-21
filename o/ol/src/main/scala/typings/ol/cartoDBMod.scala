package typings.ol

import typings.ol.pluggableMapMod.FrameState
import typings.ol.projMod.ProjectionLike
import typings.ol.sourceSourceMod.AttributionLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cartoDBMod {
  
  @JSImport("ol/source/CartoDB", JSImport.Default)
  @js.native
  open class default protected () extends CartoDB {
    def this(options: Options) = this()
  }
  
  @js.native
  trait CartoDB
    extends typings.ol.xyzMod.default {
    
    /**
      * Returns the current config.
      */
    def getConfig(): Any = js.native
    
    /**
      * Sets the CartoDB config
      */
    def setConfig(config: Any): Unit = js.native
    
    /**
      * Updates the carto db config.
      */
    def updateConfig(config: Any): Unit = js.native
  }
  
  trait CartoDBLayerInfo extends StObject {
    
    var cdn_url: Any
    
    var layergroupid: String
  }
  object CartoDBLayerInfo {
    
    inline def apply(cdn_url: Any, layergroupid: String): CartoDBLayerInfo = {
      val __obj = js.Dynamic.literal(cdn_url = cdn_url.asInstanceOf[js.Any], layergroupid = layergroupid.asInstanceOf[js.Any])
      __obj.asInstanceOf[CartoDBLayerInfo]
    }
    
    extension [Self <: CartoDBLayerInfo](x: Self) {
      
      inline def setCdn_url(value: Any): Self = StObject.set(x, "cdn_url", value.asInstanceOf[js.Any])
      
      inline def setLayergroupid(value: String): Self = StObject.set(x, "layergroupid", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var account: String
    
    var attributions: js.UndefOr[AttributionLike] = js.undefined
    
    var cacheSize: js.UndefOr[Double] = js.undefined
    
    var config: js.UndefOr[Any] = js.undefined
    
    var crossOrigin: js.UndefOr[Null | String] = js.undefined
    
    var map: js.UndefOr[String] = js.undefined
    
    var maxZoom: js.UndefOr[Double] = js.undefined
    
    var minZoom: js.UndefOr[Double] = js.undefined
    
    var projection: js.UndefOr[ProjectionLike] = js.undefined
    
    var transition: js.UndefOr[Double] = js.undefined
    
    var wrapX: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(account: String): Options = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
      
      inline def setAttributionsFunction1(value: /* p0 */ FrameState => String | js.Array[String]): Self = StObject.set(x, "attributions", js.Any.fromFunction1(value))
      
      inline def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
      
      inline def setAttributionsVarargs(value: String*): Self = StObject.set(x, "attributions", js.Array(value*))
      
      inline def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
      
      inline def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
      
      inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginNull: Self = StObject.set(x, "crossOrigin", null)
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setMap(value: String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
      
      inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setTransition(value: Double): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
    }
  }
}
