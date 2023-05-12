package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A render contains an array of meshes that are referenced by a single hierarchy node in a GLB
  * model, and are accessible using {@link ContainerResource#renders} property. The render is the
  * resource of a Render Asset.
  *
  * @augments EventHandler
  * @ignore
  */
@js.native
trait Render extends EventHandler {
  
  /**
    * Meshes are reference counted, and this class owns the references and is responsible for
    * releasing the meshes when they are no longer referenced.
    *
    * @type {import('./mesh.js').Mesh[]}
    * @private
    */
  /* private */ var _meshes: Any = js.native
  
  def decRefMeshes(): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def incRefMeshes(): Unit = js.native
  
  def meshes: js.Array[Mesh] = js.native
  /**
    * Fired when the meshes are set.
    *
    * @event Render#set:meshes
    * @param {import('./mesh.js').Mesh[]} meshes - The meshes.
    * @ignore
    */
  /**
    * The meshes that the render contains.
    *
    * @type {import('./mesh.js').Mesh[]}
    */
  def meshes_=(arg: js.Array[Mesh]): Unit = js.native
}
