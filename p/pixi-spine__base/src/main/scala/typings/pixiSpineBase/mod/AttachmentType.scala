package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AttachmentType extends StObject
@JSImport("@pixi-spine/base", "AttachmentType")
@js.native
object AttachmentType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AttachmentType & Double] = js.native
  
  @js.native
  sealed trait BoundingBox
    extends StObject
       with AttachmentType
  /* 1 */ val BoundingBox: typings.pixiSpineBase.mod.AttachmentType.BoundingBox & Double = js.native
  
  @js.native
  sealed trait Clipping
    extends StObject
       with AttachmentType
  /* 6 */ val Clipping: typings.pixiSpineBase.mod.AttachmentType.Clipping & Double = js.native
  
  @js.native
  sealed trait LinkedMesh
    extends StObject
       with AttachmentType
  /* 3 */ val LinkedMesh: typings.pixiSpineBase.mod.AttachmentType.LinkedMesh & Double = js.native
  
  @js.native
  sealed trait Mesh
    extends StObject
       with AttachmentType
  /* 2 */ val Mesh: typings.pixiSpineBase.mod.AttachmentType.Mesh & Double = js.native
  
  @js.native
  sealed trait Path
    extends StObject
       with AttachmentType
  /* 4 */ val Path: typings.pixiSpineBase.mod.AttachmentType.Path & Double = js.native
  
  @js.native
  sealed trait Point
    extends StObject
       with AttachmentType
  /* 5 */ val Point: typings.pixiSpineBase.mod.AttachmentType.Point & Double = js.native
  
  @js.native
  sealed trait Region
    extends StObject
       with AttachmentType
  /* 0 */ val Region: typings.pixiSpineBase.mod.AttachmentType.Region & Double = js.native
}
