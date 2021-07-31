package typings.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CategoryGroupV5 extends StObject {
  
  /** The description of what the category is grouping */
  var description: js.UndefOr[String] = js.undefined
  
  /** The human readable title of the group */
  var title: js.UndefOr[String] = js.undefined
}
object CategoryGroupV5 {
  
  @scala.inline
  def apply(): CategoryGroupV5 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CategoryGroupV5]
  }
  
  @scala.inline
  implicit class CategoryGroupV5MutableBuilder[Self <: CategoryGroupV5] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
