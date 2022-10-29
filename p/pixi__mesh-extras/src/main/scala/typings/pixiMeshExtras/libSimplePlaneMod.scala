package typings.pixiMeshExtras

import typings.pixiCore.libTexturesResourcesResourceMod.Resource
import typings.pixiCore.mod.Texture
import typings.pixiMesh.libMeshMaterialMod.MeshMaterial
import typings.pixiMesh.mod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSimplePlaneMod {
  
  @JSImport("@pixi/mesh-extras/lib/SimplePlane", "SimplePlane")
  @js.native
  open class SimplePlane protected () extends Mesh[MeshMaterial] {
    /**
      * @param texture - The texture to use on the SimplePlane.
      * @param verticesX - The number of vertices in the x-axis
      * @param verticesY - The number of vertices in the y-axis
      */
    def this(texture: Texture[Resource]) = this()
    def this(texture: Texture[Resource], verticesX: Double) = this()
    def this(texture: Texture[Resource], verticesX: Double, verticesY: Double) = this()
    def this(texture: Texture[Resource], verticesX: Unit, verticesY: Double) = this()
    
    /* protected */ var _textureID: Double = js.native
    
    /** The geometry is automatically updated when the texture size changes. */
    var autoResize: Boolean = js.native
    
    /**
      * Method used for overrides, to do something in case texture frame was changed.
      * Meshes based on plane can override it and change more details based on texture.
      */
    def textureUpdated(): Unit = js.native
  }
}
