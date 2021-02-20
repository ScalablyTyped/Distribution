package typings.phaser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofVertexAttachment extends StObject {
  
  /* static member */
  var nextID: js.Any = js.native
}
object TypeofVertexAttachment {
  
  @scala.inline
  def apply(nextID: js.Any): TypeofVertexAttachment = {
    val __obj = js.Dynamic.literal(nextID = nextID.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofVertexAttachment]
  }
  
  @scala.inline
  implicit class TypeofVertexAttachmentMutableBuilder[Self <: TypeofVertexAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextID(value: js.Any): Self = StObject.set(x, "nextID", value.asInstanceOf[js.Any])
  }
}
