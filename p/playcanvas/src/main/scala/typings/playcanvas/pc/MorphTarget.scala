package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Morph Target (also known as Blend Shape) contains deformation data to apply to existing mesh.
  * Multiple morph targets can be blended together on a mesh. This is useful for effects that are hard to achieve with conventional animation and skinning.
  * @param options - Object for passing optional arguments.
  * @param options.deltaPositions - An array of 3-dimensional vertex position offsets.
  * @param options.deltaPositionsType - A format to store position offsets inside {@link pc.VertexBuffer}. Defaults to {@link pc.TYPE_FLOAT32} if not provided.
  * @param [options.deltaNormals] - An array of 3-dimensional vertex normal offsets.
  * @param options.deltaNormalsType - A format to store normal offsets inside {@link pc.VertexBuffer}. Defaults to {@link pc.TYPE_FLOAT32} if not provided.
  * @param [options.name] - Name.
  * @param [options.aabb] - Bounding box. Will be automatically generated, if undefined.
  * @param [options.defaultWeight] - Default blend weight to use for this morph target.
  */
@js.native
trait MorphTarget extends StObject
