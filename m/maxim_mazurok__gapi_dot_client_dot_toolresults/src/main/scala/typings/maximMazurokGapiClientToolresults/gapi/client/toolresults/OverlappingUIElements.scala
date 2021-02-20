package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverlappingUIElements extends StObject {
  
  /** Resource names of the overlapping screen elements */
  var resourceName: js.UndefOr[js.Array[String]] = js.native
  
  /** The screen id of the elements */
  var screenId: js.UndefOr[String] = js.native
}
object OverlappingUIElements {
  
  @scala.inline
  def apply(): OverlappingUIElements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlappingUIElements]
  }
  
  @scala.inline
  implicit class OverlappingUIElementsMutableBuilder[Self <: OverlappingUIElements] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceName(value: js.Array[String]): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    @scala.inline
    def setResourceNameVarargs(value: String*): Self = StObject.set(x, "resourceName", js.Array(value :_*))
    
    @scala.inline
    def setScreenId(value: String): Self = StObject.set(x, "screenId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenIdUndefined: Self = StObject.set(x, "screenId", js.undefined)
  }
}
