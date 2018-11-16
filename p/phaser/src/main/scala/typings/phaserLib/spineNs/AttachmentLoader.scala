package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AttachmentLoader extends js.Object {
  def newBoundingBoxAttachment(skin: Skin, name: java.lang.String): BoundingBoxAttachment
  def newClippingAttachment(skin: Skin, name: java.lang.String): ClippingAttachment
  def newMeshAttachment(skin: Skin, name: java.lang.String, path: java.lang.String): MeshAttachment
  def newPathAttachment(skin: Skin, name: java.lang.String): PathAttachment
  def newPointAttachment(skin: Skin, name: java.lang.String): PointAttachment
  def newRegionAttachment(skin: Skin, name: java.lang.String, path: java.lang.String): RegionAttachment
}

