package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestItem extends StObject {
  
  var gaia: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var snippet: js.UndefOr[js.Any] = js.native
}
object TestItem {
  
  @scala.inline
  def apply(): TestItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestItem]
  }
  
  @scala.inline
  implicit class TestItemMutableBuilder[Self <: TestItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGaia(value: String): Self = StObject.set(x, "gaia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGaiaUndefined: Self = StObject.set(x, "gaia", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setSnippet(value: js.Any): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
  }
}
