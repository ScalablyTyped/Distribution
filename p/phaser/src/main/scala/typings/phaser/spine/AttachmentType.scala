package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AttachmentType extends StObject
@JSGlobal("spine.AttachmentType")
@js.native
object AttachmentType extends StObject {
  
  @js.native
  sealed trait BoundingBox
    extends StObject
       with AttachmentType
  
  @js.native
  sealed trait Clipping
    extends StObject
       with AttachmentType
  
  @js.native
  sealed trait LinkedMesh
    extends StObject
       with AttachmentType
  
  @js.native
  sealed trait Mesh
    extends StObject
       with AttachmentType
  
  @js.native
  sealed trait Path
    extends StObject
       with AttachmentType
  
  @js.native
  sealed trait Point
    extends StObject
       with AttachmentType
  
  @js.native
  sealed trait Region
    extends StObject
       with AttachmentType
}
