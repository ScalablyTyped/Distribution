package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AttachmentType extends js.Object

@JSGlobal("PIXI.spine.core.AttachmentType")
@js.native
object AttachmentType extends js.Object {
  @js.native
  sealed trait BoundingBox
    extends pixiDashSpineLib.PIXINs.spineNs.coreNs.AttachmentType
  
  @js.native
  sealed trait LinkedMesh
    extends pixiDashSpineLib.PIXINs.spineNs.coreNs.AttachmentType
  
  @js.native
  sealed trait Mesh
    extends pixiDashSpineLib.PIXINs.spineNs.coreNs.AttachmentType
  
  @js.native
  sealed trait Path
    extends pixiDashSpineLib.PIXINs.spineNs.coreNs.AttachmentType
  
  @js.native
  sealed trait Point
    extends pixiDashSpineLib.PIXINs.spineNs.coreNs.AttachmentType
  
  @js.native
  sealed trait Region
    extends pixiDashSpineLib.PIXINs.spineNs.coreNs.AttachmentType
  
  /* 1 */ val BoundingBox: BoundingBox with scala.Double = js.native
  /* 3 */ val LinkedMesh: LinkedMesh with scala.Double = js.native
  /* 2 */ val Mesh: Mesh with scala.Double = js.native
  /* 4 */ val Path: Path with scala.Double = js.native
  /* 5 */ val Point: Point with scala.Double = js.native
  /* 0 */ val Region: Region with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[pixiDashSpineLib.PIXINs.spineNs.coreNs.AttachmentType with scala.Double] = js.native
}

