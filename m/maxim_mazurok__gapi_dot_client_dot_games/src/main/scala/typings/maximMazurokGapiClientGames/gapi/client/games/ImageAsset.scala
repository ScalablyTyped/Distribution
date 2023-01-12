package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageAsset extends StObject {
  
  /** The height of the asset. */
  var height: js.UndefOr[Double] = js.undefined
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#imageAsset`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The name of the asset. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The URL of the asset. */
  var url: js.UndefOr[String] = js.undefined
  
  /** The width of the asset. */
  var width: js.UndefOr[Double] = js.undefined
}
object ImageAsset {
  
  inline def apply(): ImageAsset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageAsset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageAsset] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
