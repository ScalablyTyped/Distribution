package typings.officeJsPreview.OneNote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InsertLocation extends StObject
/**
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.InsertLocation")
@js.native
object InsertLocation extends StObject {
  
  @js.native
  sealed trait after
    extends StObject
       with InsertLocation
  
  @js.native
  sealed trait before
    extends StObject
       with InsertLocation
}
