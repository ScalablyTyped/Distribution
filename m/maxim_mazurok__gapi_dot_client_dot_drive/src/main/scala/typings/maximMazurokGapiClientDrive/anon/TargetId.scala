package typings.maximMazurokGapiClientDrive.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetId extends StObject {
  
  /** The ID of the file that this shortcut points to. */
  var targetId: js.UndefOr[String] = js.undefined
  
  /** The MIME type of the file that this shortcut points to. The value of this field is a snapshot of the target's MIME type, captured when the shortcut is created. */
  var targetMimeType: js.UndefOr[String] = js.undefined
}
object TargetId {
  
  @scala.inline
  def apply(): TargetId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetId]
  }
  
  @scala.inline
  implicit class TargetIdMutableBuilder[Self <: TargetId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
    
    @scala.inline
    def setTargetMimeType(value: String): Self = StObject.set(x, "targetMimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetMimeTypeUndefined: Self = StObject.set(x, "targetMimeType", js.undefined)
  }
}
