package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @private
  * @name pc.MorphTarget
  * @class A Morph Target (also known as Blend Shape) contains deformation data to apply to existing mesh.
  * Multiple morph targets can be blended together on a mesh. This is useful for effects that are hard to achieve with conventional animation and skinning.
  * @param {Object} options Object for passing optional arguments.
  * @param {Number[]} deltaPositions An array of 3-dimensional vertex position offsets.
  * @param {Number[]} [deltaNormals] An array of 3-dimensional vertex normal offsets.
  * @param {Number[]} [deltaTangents] An array of 4-dimensional vertex normal tangents.
  * @param {Number[]} [options.indices] A morph target doesn't have to contain a full copy of the original mesh with added deformations.
  * Instead, only deformed vertices can be stored. This array contains indices to the original mesh's vertices and must be of the same size
  * as other arrays.
  * @param {String} [name] Name
  * @param {pc.BoundingBox} [aabb] Bounding box. Will be automatically generated, if undefined.
  */
@JSGlobal("pc.MorphTarget")
@js.native
class MorphTarget protected () extends js.Object {
  def this(optionsi: MorphTargetOptions) = this()
  var aabb: BoundingBox = js.native
  var deltaNormals: js.Array[scala.Double] = js.native
  var deltaPositions: js.Array[scala.Double] = js.native
  var deltaTangents: js.Array[scala.Double] = js.native
  var indices: js.Array[scala.Double] = js.native
  var name: java.lang.String = js.native
}

