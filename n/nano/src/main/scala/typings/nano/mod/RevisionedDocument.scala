package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevisionedDocument extends StObject {
  
  var _rev: String = js.native
}
object RevisionedDocument {
  
  @scala.inline
  def apply(_rev: String): RevisionedDocument = {
    val __obj = js.Dynamic.literal(_rev = _rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevisionedDocument]
  }
  
  @scala.inline
  implicit class RevisionedDocumentMutableBuilder[Self <: RevisionedDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_rev(value: String): Self = StObject.set(x, "_rev", value.asInstanceOf[js.Any])
  }
}
