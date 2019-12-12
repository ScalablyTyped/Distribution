package typings.pixiDashSpine.PIXI.spine.core

import org.scalablytyped.runtime.TopLevel
import typings.pixiDashSpine.PIXI.spine.core.AttachmentType.BoundingBox
import typings.pixiDashSpine.PIXI.spine.core.AttachmentType.Clipping
import typings.pixiDashSpine.PIXI.spine.core.AttachmentType.LinkedMesh
import typings.pixiDashSpine.PIXI.spine.core.AttachmentType.Mesh
import typings.pixiDashSpine.PIXI.spine.core.AttachmentType.Path
import typings.pixiDashSpine.PIXI.spine.core.AttachmentType.Point
import typings.pixiDashSpine.PIXI.spine.core.AttachmentType.Region
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AttachmentType with Double] = js.native
  /* 1 */ @js.native
  object BoundingBox extends TopLevel[BoundingBox with Double]
  
  /* 6 */ @js.native
  object Clipping extends TopLevel[Clipping with Double]
  
  /* 3 */ @js.native
  object LinkedMesh extends TopLevel[LinkedMesh with Double]
  
  /* 2 */ @js.native
  object Mesh extends TopLevel[Mesh with Double]
  
  /* 4 */ @js.native
  object Path extends TopLevel[Path with Double]
  
  /* 5 */ @js.native
  object Point extends TopLevel[Point with Double]
  
  /* 0 */ @js.native
  object Region extends TopLevel[Region with Double]
  
}

