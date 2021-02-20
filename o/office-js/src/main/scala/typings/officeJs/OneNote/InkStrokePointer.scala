package typings.officeJs.OneNote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Weak reference to an ink stroke object and its content parent.
  *
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait InkStrokePointer extends StObject {
  
  /**
    *
    * Represents the id of the page content object corresponding to this stroke
    *
    * [Api set: OneNoteApi 1.1]
    */
  var contentId: String = js.native
  
  /**
    *
    * Represents the id of the ink stroke
    *
    * [Api set: OneNoteApi 1.1]
    */
  var inkStrokeId: String = js.native
}
object InkStrokePointer {
  
  @scala.inline
  def apply(contentId: String, inkStrokeId: String): InkStrokePointer = {
    val __obj = js.Dynamic.literal(contentId = contentId.asInstanceOf[js.Any], inkStrokeId = inkStrokeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InkStrokePointer]
  }
  
  @scala.inline
  implicit class InkStrokePointerMutableBuilder[Self <: InkStrokePointer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentId(value: String): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInkStrokeId(value: String): Self = StObject.set(x, "inkStrokeId", value.asInstanceOf[js.Any])
  }
}
