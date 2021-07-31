package typings.playcanvas.mod

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
@JSImport("playcanvas", "ContainerResource")
@js.native
class ContainerResource protected ()
  extends StObject
     with typings.playcanvas.pc.ContainerResource {
  def this(data: js.Any) = this()
  
  /**
    * Array of assets of animations in the GLB container.
    */
  /* CompleteClass */
  var animations: js.Array[typings.playcanvas.pc.Asset] = js.native
  
  /**
    * Array of assets of materials in the GLB container.
    */
  /* CompleteClass */
  var materials: js.Array[typings.playcanvas.pc.Asset] = js.native
  
  /**
    * Array of assets of textures in the GLB container.
    */
  /* CompleteClass */
  var textures: js.Array[typings.playcanvas.pc.Asset] = js.native
}
