package typings.playcanvas.global.pc

import typings.playcanvas.anon.Aabb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Morph Target (also known as Blend Shape) contains deformation data to apply to existing mesh.
  * Multiple morph targets can be blended together on a mesh. This is useful for effects that are
  * hard to achieve with conventional animation and skinning.
  */
@JSGlobal("pc.MorphTarget")
@js.native
open class MorphTarget protected ()
  extends typings.playcanvas.mod.MorphTarget {
  /**
    * Create a new MorphTarget instance.
    *
    * @param {object} options - Object for passing optional arguments.
    * @param {ArrayBuffer} options.deltaPositions - An array of 3-dimensional vertex position
    * offsets.
    * @param {number} options.deltaPositionsType - A format to store position offsets inside
    * {@link VertexBuffer}. Defaults to {@link TYPE_FLOAT32} if not provided.
    * @param {ArrayBuffer} [options.deltaNormals] - An array of 3-dimensional vertex normal
    * offsets.
    * @param {number} options.deltaNormalsType - A format to store normal offsets inside
    * {@link VertexBuffer}. Defaults to {@link TYPE_FLOAT32} if not provided.
    * @param {string} [options.name] - Name.
    * @param {BoundingBox} [options.aabb] - Bounding box. Will be automatically generated, if
    * undefined.
    * @param {number} [options.defaultWeight] - Default blend weight to use for this morph target.
    * @param {boolean} [options.preserveData] - When true, the morph target keeps its data passed using the options,
    * allowing the clone operation.
    */
  def this(options: Aabb, args: Any*) = this()
}
