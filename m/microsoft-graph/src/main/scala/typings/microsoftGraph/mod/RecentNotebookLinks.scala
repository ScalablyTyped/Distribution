package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecentNotebookLinks extends StObject {
  
  // Opens the notebook in the OneNote native client if it's installed.
  var oneNoteClientUrl: js.UndefOr[NullableOption[ExternalLink]] = js.undefined
  
  // Opens the notebook in OneNote on the web.
  var oneNoteWebUrl: js.UndefOr[NullableOption[ExternalLink]] = js.undefined
}
object RecentNotebookLinks {
  
  inline def apply(): RecentNotebookLinks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecentNotebookLinks]
  }
  
  extension [Self <: RecentNotebookLinks](x: Self) {
    
    inline def setOneNoteClientUrl(value: NullableOption[ExternalLink]): Self = StObject.set(x, "oneNoteClientUrl", value.asInstanceOf[js.Any])
    
    inline def setOneNoteClientUrlNull: Self = StObject.set(x, "oneNoteClientUrl", null)
    
    inline def setOneNoteClientUrlUndefined: Self = StObject.set(x, "oneNoteClientUrl", js.undefined)
    
    inline def setOneNoteWebUrl(value: NullableOption[ExternalLink]): Self = StObject.set(x, "oneNoteWebUrl", value.asInstanceOf[js.Any])
    
    inline def setOneNoteWebUrlNull: Self = StObject.set(x, "oneNoteWebUrl", null)
    
    inline def setOneNoteWebUrlUndefined: Self = StObject.set(x, "oneNoteWebUrl", js.undefined)
  }
}
