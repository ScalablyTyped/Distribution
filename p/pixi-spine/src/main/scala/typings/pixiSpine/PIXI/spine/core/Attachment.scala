package typings.pixiSpine.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attachment extends StObject {
  
  def copy(): Attachment = js.native
  
  var name: String = js.native
}
object Attachment {
  
  @scala.inline
  def apply(copy: () => Attachment, name: String): Attachment = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
  
  @scala.inline
  implicit class AttachmentMutableBuilder[Self <: Attachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopy(value: () => Attachment): Self = StObject.set(x, "copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
