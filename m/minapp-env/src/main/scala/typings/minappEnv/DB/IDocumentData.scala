package typings.minappEnv.DB

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDocumentData
  extends /* key */ StringDictionary[js.Any] {
  
  var _id: js.UndefOr[DocumentId] = js.native
}
object IDocumentData {
  
  @scala.inline
  def apply(): IDocumentData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDocumentData]
  }
  
  @scala.inline
  implicit class IDocumentDataMutableBuilder[Self <: IDocumentData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_id(value: DocumentId): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
  }
}
