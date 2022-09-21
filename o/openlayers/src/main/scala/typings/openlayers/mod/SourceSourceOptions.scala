package typings.openlayers.mod

import typings.openlayers.mod.olx.LogoOptions
import typings.openlayers.mod.source.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceSourceOptions extends StObject {
  
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  
  var logo: js.UndefOr[String | LogoOptions] = js.undefined
  
  var projection: ProjectionLike
  
  var state: js.UndefOr[State] = js.undefined
  
  var wrapX: js.UndefOr[Boolean] = js.undefined
}
object SourceSourceOptions {
  
  inline def apply(): SourceSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceSourceOptions]
  }
  
  extension [Self <: SourceSourceOptions](x: Self) {
    
    inline def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
    
    inline def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
    
    inline def setAttributionsVarargs(value: (Attribution | String)*): Self = StObject.set(x, "attributions", js.Array(value*))
    
    inline def setLogo(value: String | LogoOptions): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
    
    inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
  }
}
