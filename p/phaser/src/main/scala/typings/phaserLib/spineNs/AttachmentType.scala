package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AttachmentType extends js.Object

@JSGlobal("spine.AttachmentType")
@js.native
object AttachmentType extends js.Object {
  @js.native
  sealed trait BoundingBox
    extends phaserLib.spineNs.AttachmentType
  
  @js.native
  sealed trait LinkedMesh
    extends phaserLib.spineNs.AttachmentType
  
  @js.native
  sealed trait Mesh
    extends phaserLib.spineNs.AttachmentType
  
  @js.native
  sealed trait Path
    extends phaserLib.spineNs.AttachmentType
  
  @js.native
  sealed trait Point
    extends phaserLib.spineNs.AttachmentType
  
  @js.native
  sealed trait Region
    extends phaserLib.spineNs.AttachmentType
  
  /* 1 */ val BoundingBox: BoundingBox with scala.Double = js.native
  /* 3 */ val LinkedMesh: LinkedMesh with scala.Double = js.native
  /* 2 */ val Mesh: Mesh with scala.Double = js.native
  /* 4 */ val Path: Path with scala.Double = js.native
  /* 5 */ val Point: Point with scala.Double = js.native
  /* 0 */ val Region: Region with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[phaserLib.spineNs.AttachmentType with scala.Double] = js.native
}

