package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AttachmentType extends js.Object

@JSGlobal("spine.AttachmentType")
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
  
}

