package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecentNotebookLinks extends StObject {
  
  // Opens the notebook in the OneNote native client if it's installed.
  var oneNoteClientUrl: js.UndefOr[NullableOption[ExternalLink]] = js.native
  
  // Opens the notebook in OneNote on the web.
  var oneNoteWebUrl: js.UndefOr[NullableOption[ExternalLink]] = js.native
}
object RecentNotebookLinks {
  
  @scala.inline
  def apply(): RecentNotebookLinks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecentNotebookLinks]
  }
  
  @scala.inline
  implicit class RecentNotebookLinksMutableBuilder[Self <: RecentNotebookLinks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOneNoteClientUrl(value: NullableOption[ExternalLink]): Self = StObject.set(x, "oneNoteClientUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneNoteClientUrlNull: Self = StObject.set(x, "oneNoteClientUrl", null)
    
    @scala.inline
    def setOneNoteClientUrlUndefined: Self = StObject.set(x, "oneNoteClientUrl", js.undefined)
    
    @scala.inline
    def setOneNoteWebUrl(value: NullableOption[ExternalLink]): Self = StObject.set(x, "oneNoteWebUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneNoteWebUrlNull: Self = StObject.set(x, "oneNoteWebUrl", null)
    
    @scala.inline
    def setOneNoteWebUrlUndefined: Self = StObject.set(x, "oneNoteWebUrl", js.undefined)
  }
}
