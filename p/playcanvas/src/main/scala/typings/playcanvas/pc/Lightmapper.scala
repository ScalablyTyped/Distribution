package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The lightmapper is used to bake scene lights into textures.
  * @param device - The grahpics device used by the lightmapper.
  * @param root - The root entity of the scene.
  * @param scene - The scene to lightmap.
  * @param renderer - The renderer.
  * @param assets - Registry of assets to lightmap.
  */
@js.native
trait Lightmapper extends StObject {
  
  /**
    * Generates and applies the lightmaps.
    * @param nodes - An array of entities (with model components) to render
    * lightmaps for. If not supplied, the entire scene will be baked.
    * @param [mode] - Baking mode. Can be:
    *
    * * {@link pc.BAKE_COLOR}: single color lightmap
    * * {@link pc.BAKE_COLORDIR}: single color lightmap + dominant light direction (used for bump/specular)
    *
    * Only lights with bakeDir=true will be used for generating the dominant light direction. Defaults to
    * pc.BAKE_COLORDIR.
    */
  def bake(): Unit = js.native
  def bake(nodes: js.Array[Entity]): Unit = js.native
  def bake(nodes: js.Array[Entity], mode: Double): Unit = js.native
  def bake(nodes: Null, mode: Double): Unit = js.native
}
