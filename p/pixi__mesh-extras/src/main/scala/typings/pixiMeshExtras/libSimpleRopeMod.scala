package typings.pixiMeshExtras

import typings.pixiCore.libTexturesResourcesResourceMod.Resource
import typings.pixiCore.mod.Texture
import typings.pixiMath.libIpointMod.IPoint
import typings.pixiMesh.libMeshMaterialMod.MeshMaterial
import typings.pixiMesh.mod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSimpleRopeMod {
  
  @JSImport("@pixi/mesh-extras/lib/SimpleRope", "SimpleRope")
  @js.native
  open class SimpleRope protected () extends Mesh[MeshMaterial] {
    /**
      * Note: The wrap mode of the texture is set to REPEAT if `textureScale` is positive.
      * @param texture - The texture to use on the rope.
      * @param points - An array of {@link PIXI.Point} objects to construct this rope.
      * @param {number} textureScale - Optional. Positive values scale rope texture
      * keeping its aspect ratio. You can reduce alpha channel artifacts by providing a larger texture
      * and downsampling here. If set to zero, texture will be stretched instead.
      */
    def this(texture: Texture[Resource], points: js.Array[IPoint]) = this()
    def this(texture: Texture[Resource], points: js.Array[IPoint], textureScale: Double) = this()
    
    var autoUpdate: Boolean = js.native
  }
}
