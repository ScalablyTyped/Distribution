package typings.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProjectRequest extends StObject {
  
  /**
    * The Drive ID of a parent file that the created script project is bound to. This is usually the ID of a Google Doc, Google Sheet, Google Form, or Google Slides file. If not set, a
    * standalone script project is created.
    */
  var parentId: js.UndefOr[String] = js.undefined
  
  /** The title for the project. */
  var title: js.UndefOr[String] = js.undefined
}
object CreateProjectRequest {
  
  inline def apply(): CreateProjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProjectRequest]
  }
  
  extension [Self <: CreateProjectRequest](x: Self) {
    
    inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
