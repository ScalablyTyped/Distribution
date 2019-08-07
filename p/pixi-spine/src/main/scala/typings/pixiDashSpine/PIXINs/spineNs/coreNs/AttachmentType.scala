package typings.pixiDashSpine.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AttachmentType extends js.Object

@JSGlobal("PIXI.spine.core.AttachmentType")
@js.native
object AttachmentType extends js.Object {
  @js.native
  sealed trait BoundingBox extends AttachmentType
  
  @js.native
  sealed trait Clipping extends AttachmentType
  
  @js.native
  sealed trait LinkedMesh extends AttachmentType
  
  @js.native
  sealed trait Mesh extends AttachmentType
  
  @js.native
  sealed trait Path extends AttachmentType
  
  @js.native
  sealed trait Point extends AttachmentType
  
  @js.native
  sealed trait Region extends AttachmentType
  
  /* 1 */ val BoundingBox: typings.pixiDashSpine.PIXINs.spineNs.coreNs.AttachmentType.BoundingBox with Double = js.native
  /* 6 */ val Clipping: typings.pixiDashSpine.PIXINs.spineNs.coreNs.AttachmentType.Clipping with Double = js.native
  /* 3 */ val LinkedMesh: typings.pixiDashSpine.PIXINs.spineNs.coreNs.AttachmentType.LinkedMesh with Double = js.native
  /* 2 */ val Mesh: typings.pixiDashSpine.PIXINs.spineNs.coreNs.AttachmentType.Mesh with Double = js.native
  /* 4 */ val Path: typings.pixiDashSpine.PIXINs.spineNs.coreNs.AttachmentType.Path with Double = js.native
  /* 5 */ val Point: typings.pixiDashSpine.PIXINs.spineNs.coreNs.AttachmentType.Point with Double = js.native
  /* 0 */ val Region: typings.pixiDashSpine.PIXINs.spineNs.coreNs.AttachmentType.Region with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AttachmentType with Double] = js.native
}

