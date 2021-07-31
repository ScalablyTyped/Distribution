package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Document
  extends StObject
     with IdentifiedDocument
     with RevisionedDocument
object Document {
  
  @scala.inline
  def apply(_id: String, _rev: String): Document = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _rev = _rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
}
