package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaceOneOptions extends CommonOptions {
  
  var bypassDocumentValidation: js.UndefOr[Boolean] = js.native
  
  var upsert: js.UndefOr[Boolean] = js.native
}
object ReplaceOneOptions {
  
  @scala.inline
  def apply(): ReplaceOneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceOneOptions]
  }
  
  @scala.inline
  implicit class ReplaceOneOptionsMutableBuilder[Self <: ReplaceOneOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBypassDocumentValidation(value: Boolean): Self = StObject.set(x, "bypassDocumentValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBypassDocumentValidationUndefined: Self = StObject.set(x, "bypassDocumentValidation", js.undefined)
    
    @scala.inline
    def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
  }
}
