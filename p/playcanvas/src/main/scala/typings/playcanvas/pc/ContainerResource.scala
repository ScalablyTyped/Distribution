package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Container for a list of animations, textures, materials and a model.
  * @property animations - Array of assets of animations in the GLB container.
  * @property textures - Array of assets of textures in the GLB container.
  * @property materials - Array of assets of materials in the GLB container.
  * @param data - The loaded GLB data.
  */
trait ContainerResource extends StObject {
  
  /**
    * Array of assets of animations in the GLB container.
    */
  var animations: js.Array[Asset]
  
  /**
    * Array of assets of materials in the GLB container.
    */
  var materials: js.Array[Asset]
  
  /**
    * Array of assets of textures in the GLB container.
    */
  var textures: js.Array[Asset]
}
object ContainerResource {
  
  @scala.inline
  def apply(animations: js.Array[Asset], materials: js.Array[Asset], textures: js.Array[Asset]): ContainerResource = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], materials = materials.asInstanceOf[js.Any], textures = textures.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerResource]
  }
  
  @scala.inline
  implicit class ContainerResourceMutableBuilder[Self <: ContainerResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimations(value: js.Array[Asset]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationsVarargs(value: Asset*): Self = StObject.set(x, "animations", js.Array(value :_*))
    
    @scala.inline
    def setMaterials(value: js.Array[Asset]): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialsVarargs(value: Asset*): Self = StObject.set(x, "materials", js.Array(value :_*))
    
    @scala.inline
    def setTextures(value: js.Array[Asset]): Self = StObject.set(x, "textures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTexturesVarargs(value: Asset*): Self = StObject.set(x, "textures", js.Array(value :_*))
  }
}
