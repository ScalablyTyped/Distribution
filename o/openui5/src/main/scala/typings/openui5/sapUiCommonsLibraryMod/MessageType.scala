package typings.openui5.sapUiCommonsLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MessageType extends StObject
@JSImport("sap/ui/commons/library", "MessageType")
@js.native
object MessageType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MessageType & String] = js.native
  
  /**
    * Error message
    */
  @js.native
  sealed trait Error
    extends StObject
       with MessageType
  /* "Error" */ val Error: typings.openui5.sapUiCommonsLibraryMod.MessageType.Error & String = js.native
  
  /**
    * Successful message
    */
  @js.native
  sealed trait Success
    extends StObject
       with MessageType
  /* "Success" */ val Success: typings.openui5.sapUiCommonsLibraryMod.MessageType.Success & String = js.native
  
  /**
    * Warning message
    */
  @js.native
  sealed trait Warning
    extends StObject
       with MessageType
  /* "Warning" */ val Warning: typings.openui5.sapUiCommonsLibraryMod.MessageType.Warning & String = js.native
}
