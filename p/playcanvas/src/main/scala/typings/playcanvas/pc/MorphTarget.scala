package typings.playcanvas.pc

import typings.playcanvas.AnonAabb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.MorphTarget
  * @classdesc A Morph Target (also known as Blend Shape) contains deformation data to apply to existing mesh.
  * Multiple morph targets can be blended together on a mesh. This is useful for effects that are hard to achieve with conventional animation and skinning.
  * @param {object} options - Object for passing optional arguments.
  * @param {number[]} options.deltaPositions - An array of 3-dimensional vertex position offsets.
  * @param {number[]} [options.deltaNormals] - An array of 3-dimensional vertex normal offsets.
  * @param {number[]} [options.deltaTangents] - An array of 4-dimensional vertex normal tangents.
  * @param {number[]} [options.indices] - A morph target doesn't have to contain a full copy of the original mesh with added deformations.
  * Instead, only deformed vertices can be stored. This array contains indices to the original mesh's vertices and must be of the same size
  * as other arrays.
  * @param {string} [options.name] - Name.
  * @param {pc.BoundingBox} [options.aabb] - Bounding box. Will be automatically generated, if undefined.
  */
@JSGlobal("pc.MorphTarget")
@js.native
class MorphTarget protected () extends js.Object {
  def this(options: AnonAabb) = this()
}

