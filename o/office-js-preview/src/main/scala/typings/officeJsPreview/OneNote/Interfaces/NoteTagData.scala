package typings.officeJsPreview.OneNote.Interfaces

import typings.officeJsPreview.OneNote.NoteTagStatus
import typings.officeJsPreview.OneNote.NoteTagType
import typings.officeJsPreview.officeJsPreviewStrings.Address
import typings.officeJsPreview.officeJsPreviewStrings.Completed
import typings.officeJsPreview.officeJsPreviewStrings.Contact
import typings.officeJsPreview.officeJsPreviewStrings.Critical
import typings.officeJsPreview.officeJsPreviewStrings.Disabled
import typings.officeJsPreview.officeJsPreviewStrings.Idea
import typings.officeJsPreview.officeJsPreviewStrings.Important
import typings.officeJsPreview.officeJsPreviewStrings.Normal
import typings.officeJsPreview.officeJsPreviewStrings.OutlookTask
import typings.officeJsPreview.officeJsPreviewStrings.PhoneNumber
import typings.officeJsPreview.officeJsPreviewStrings.Question
import typings.officeJsPreview.officeJsPreviewStrings.TaskNotSyncedYet
import typings.officeJsPreview.officeJsPreviewStrings.TaskRemoved
import typings.officeJsPreview.officeJsPreviewStrings.ToDo
import typings.officeJsPreview.officeJsPreviewStrings.ToDoPriority1
import typings.officeJsPreview.officeJsPreviewStrings.ToDoPriority2
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
import typings.officeJsPreview.officeJsPreviewStrings.Website
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "noteTag.toJSON()". */
trait NoteTagData extends StObject {
  
  /**
    *
    * Gets the Id of the NoteTag object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Gets the status of the NoteTag object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var status: js.UndefOr[
    NoteTagStatus | Unknown_ | Normal | Completed | Disabled | OutlookTask | TaskNotSyncedYet | TaskRemoved
  ] = js.undefined
  
  /**
    *
    * Gets the type of the NoteTag object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var `type`: js.UndefOr[
    NoteTagType | Unknown_ | ToDo | Important | Question | Contact | Address | PhoneNumber | Website | Idea | Critical | ToDoPriority1 | ToDoPriority2
  ] = js.undefined
}
object NoteTagData {
  
  inline def apply(): NoteTagData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoteTagData]
  }
  
  extension [Self <: NoteTagData](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setStatus(
      value: NoteTagStatus | Unknown_ | Normal | Completed | Disabled | OutlookTask | TaskNotSyncedYet | TaskRemoved
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(
      value: NoteTagType | Unknown_ | ToDo | Important | Question | Contact | Address | PhoneNumber | Website | Idea | Critical | ToDoPriority1 | ToDoPriority2
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
