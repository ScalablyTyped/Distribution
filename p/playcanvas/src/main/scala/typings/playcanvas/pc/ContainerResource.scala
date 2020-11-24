package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Container for a list of animations, textures, materials and a model.
  * @property animations - Array of assets of animations in the GLB container.
  * @property textures - Array of assets of textures in the GLB container.
  * @property materials - Array of assets of materials in the GLB container.
  * @param data - The loaded GLB data.
  */
@js.native
trait ContainerResource extends js.Object {
  
  /**
    * Array of assets of animations in the GLB container.
    */
  var animations: js.Array[Asset] = js.native
  
  /**
    * Array of assets of materials in the GLB container.
    */
  var materials: js.Array[Asset] = js.native
  
  /**
    * Array of assets of textures in the GLB container.
    */
  var textures: js.Array[Asset] = js.native
}
object ContainerResource {
  
  @scala.inline
  def apply(animations: js.Array[Asset], materials: js.Array[Asset], textures: js.Array[Asset]): ContainerResource = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], materials = materials.asInstanceOf[js.Any], textures = textures.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerResource]
  }
  
  @scala.inline
  implicit class ContainerResourceOps[Self <: ContainerResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnimationsVarargs(value: Asset*): Self = this.set("animations", js.Array(value :_*))
    
    @scala.inline
    def setAnimations(value: js.Array[Asset]): Self = this.set("animations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialsVarargs(value: Asset*): Self = this.set("materials", js.Array(value :_*))
    
    @scala.inline
    def setMaterials(value: js.Array[Asset]): Self = this.set("materials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTexturesVarargs(value: Asset*): Self = this.set("textures", js.Array(value :_*))
    
    @scala.inline
    def setTextures(value: js.Array[Asset]): Self = this.set("textures", value.asInstanceOf[js.Any])
  }
}
