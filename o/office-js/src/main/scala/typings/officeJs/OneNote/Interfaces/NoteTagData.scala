package typings.officeJs.OneNote.Interfaces

import typings.officeJs.OneNote.NoteTagStatus
import typings.officeJs.OneNote.NoteTagType
import typings.officeJs.officeJsStrings.Address
import typings.officeJs.officeJsStrings.Completed
import typings.officeJs.officeJsStrings.Contact
import typings.officeJs.officeJsStrings.Critical
import typings.officeJs.officeJsStrings.Disabled
import typings.officeJs.officeJsStrings.Idea
import typings.officeJs.officeJsStrings.Important
import typings.officeJs.officeJsStrings.Normal
import typings.officeJs.officeJsStrings.OutlookTask
import typings.officeJs.officeJsStrings.PhoneNumber
import typings.officeJs.officeJsStrings.Question
import typings.officeJs.officeJsStrings.TaskNotSyncedYet
import typings.officeJs.officeJsStrings.TaskRemoved
import typings.officeJs.officeJsStrings.ToDo
import typings.officeJs.officeJsStrings.ToDoPriority1
import typings.officeJs.officeJsStrings.ToDoPriority2
import typings.officeJs.officeJsStrings.Unknown_
import typings.officeJs.officeJsStrings.Website
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `noteTag.toJSON()`. */
trait NoteTagData extends StObject {
  
  /**
    * Gets the Id of the NoteTag object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the status of the NoteTag object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var status: js.UndefOr[
    NoteTagStatus | Unknown_ | Normal | Completed | Disabled | OutlookTask | TaskNotSyncedYet | TaskRemoved
  ] = js.undefined
  
  /**
    * Gets the type of the NoteTag object. Read-only.
    *
    * @remarks
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NoteTagData] (val x: Self) extends AnyVal {
    
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
