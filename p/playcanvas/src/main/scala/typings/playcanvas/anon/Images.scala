package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Images extends StObject {
  
  var asset: Generator
  
  var images: js.Array[Any]
  
  var samplers: js.Array[Any]
  
  var scene: Double
  
  var scenes: js.Array[Nodes]
  
  var textures: js.Array[Any]
}
object Images {
  
  inline def apply(
    asset: Generator,
    images: js.Array[Any],
    samplers: js.Array[Any],
    scene: Double,
    scenes: js.Array[Nodes],
    textures: js.Array[Any]
  ): Images = {
    val __obj = js.Dynamic.literal(asset = asset.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], samplers = samplers.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], scenes = scenes.asInstanceOf[js.Any], textures = textures.asInstanceOf[js.Any])
    __obj.asInstanceOf[Images]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Images] (val x: Self) extends AnyVal {
    
    inline def setAsset(value: Generator): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    inline def setImages(value: js.Array[Any]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesVarargs(value: Any*): Self = StObject.set(x, "images", js.Array(value*))
    
    inline def setSamplers(value: js.Array[Any]): Self = StObject.set(x, "samplers", value.asInstanceOf[js.Any])
    
    inline def setSamplersVarargs(value: Any*): Self = StObject.set(x, "samplers", js.Array(value*))
    
    inline def setScene(value: Double): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    inline def setScenes(value: js.Array[Nodes]): Self = StObject.set(x, "scenes", value.asInstanceOf[js.Any])
    
    inline def setScenesVarargs(value: Nodes*): Self = StObject.set(x, "scenes", js.Array(value*))
    
    inline def setTextures(value: js.Array[Any]): Self = StObject.set(x, "textures", value.asInstanceOf[js.Any])
    
    inline def setTexturesVarargs(value: Any*): Self = StObject.set(x, "textures", js.Array(value*))
  }
}
