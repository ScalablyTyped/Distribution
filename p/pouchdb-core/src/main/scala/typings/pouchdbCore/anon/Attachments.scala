package typings.pouchdbCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.pouchdbCore.PouchDB.Core.RevisionId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attachments extends StObject {
  
  var _attachments: js.UndefOr[typings.pouchdbCore.PouchDB.Core.Attachments] = js.native
  
  /** You can update an existing doc using _rev */
  var _rev: js.UndefOr[RevisionId] = js.native
  
  var filters: js.UndefOr[StringDictionary[String]] = js.native
  
  var views: js.UndefOr[StringDictionary[Map]] = js.native
}
object Attachments {
  
  @scala.inline
  def apply(): Attachments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attachments]
  }
  
  @scala.inline
  implicit class AttachmentsMutableBuilder[Self <: Attachments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: StringDictionary[String]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setViews(value: StringDictionary[Map]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    
    @scala.inline
    def set_attachments(value: typings.pouchdbCore.PouchDB.Core.Attachments): Self = StObject.set(x, "_attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_attachmentsUndefined: Self = StObject.set(x, "_attachments", js.undefined)
    
    @scala.inline
    def set_rev(value: RevisionId): Self = StObject.set(x, "_rev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_revUndefined: Self = StObject.set(x, "_rev", js.undefined)
  }
}
