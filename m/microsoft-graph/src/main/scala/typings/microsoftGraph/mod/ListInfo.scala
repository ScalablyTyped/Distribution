package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInfo extends StObject {
  
  // If true, indicates that content types are enabled for this list.
  var contentTypesEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // If true, indicates that the list is not normally visible in the SharePoint user experience.
  var hidden: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * An enumerated value that represents the base list template used in creating the list. Possible values include
    * documentLibrary, genericList, task, survey, announcements, contacts, and more.
    */
  var template: js.UndefOr[NullableOption[String]] = js.undefined
}
object ListInfo {
  
  inline def apply(): ListInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInfo]
  }
  
  extension [Self <: ListInfo](x: Self) {
    
    inline def setContentTypesEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "contentTypesEnabled", value.asInstanceOf[js.Any])
    
    inline def setContentTypesEnabledNull: Self = StObject.set(x, "contentTypesEnabled", null)
    
    inline def setContentTypesEnabledUndefined: Self = StObject.set(x, "contentTypesEnabled", js.undefined)
    
    inline def setHidden(value: NullableOption[Boolean]): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenNull: Self = StObject.set(x, "hidden", null)
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setTemplate(value: NullableOption[String]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateNull: Self = StObject.set(x, "template", null)
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
