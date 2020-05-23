package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Morph Target (also known as Blend Shape) contains deformation data to apply to existing mesh.
  Multiple morph targets can be blended together on a mesh. This is useful for effects that are hard to achieve with conventional animation and skinning.
  * @param options - Object for passing optional arguments.
  * @param options.deltaPositions - An array of 3-dimensional vertex position offsets.
  * @param [options.deltaNormals] - An array of 3-dimensional vertex normal offsets.
  * @param [options.deltaTangents] - An array of 4-dimensional vertex normal tangents.
  * @param [options.indices] - A morph target doesn't have to contain a full copy of the original mesh with added deformations.
  Instead, only deformed vertices can be stored. This array contains indices to the original mesh's vertices and must be of the same size
  as other arrays.
  * @param [options.name] - Name.
  * @param [options.aabb] - Bounding box. Will be automatically generated, if undefined.
  * @param [options.defaultWeight] - Default blend weight to use for this morph target.
  */
trait MorphTarget extends js.Object

