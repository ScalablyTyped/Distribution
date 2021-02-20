package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactFindOptions extends StObject {
  
  var filter: js.UndefOr[String] = js.native
  
  var multiple: js.UndefOr[Boolean] = js.native
}
object ContactFindOptions {
  
  @scala.inline
  def apply(): ContactFindOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactFindOptions]
  }
  
  @scala.inline
  implicit class ContactFindOptionsMutableBuilder[Self <: ContactFindOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
  }
}
