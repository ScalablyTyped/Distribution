package typings.openui5.sapUiCoreLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MessageType extends StObject
@JSImport("sap/ui/core/library", "MessageType")
@js.native
object MessageType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MessageType & String] = js.native
  
  /**
    * Message is an error
    */
  @js.native
  sealed trait Error
    extends StObject
       with MessageType
  /* "Error" */ val Error: typings.openui5.sapUiCoreLibraryMod.MessageType.Error & String = js.native
  
  /**
    * Message should be just an information
    */
  @js.native
  sealed trait Information
    extends StObject
       with MessageType
  /* "Information" */ val Information: typings.openui5.sapUiCoreLibraryMod.MessageType.Information & String = js.native
  
  /**
    * Message has no specific level
    */
  @js.native
  sealed trait None
    extends StObject
       with MessageType
  /* "None" */ val None: typings.openui5.sapUiCoreLibraryMod.MessageType.None & String = js.native
  
  /**
    * Message is a success message
    */
  @js.native
  sealed trait Success
    extends StObject
       with MessageType
  /* "Success" */ val Success: typings.openui5.sapUiCoreLibraryMod.MessageType.Success & String = js.native
  
  /**
    * Message is a warning
    */
  @js.native
  sealed trait Warning
    extends StObject
       with MessageType
  /* "Warning" */ val Warning: typings.openui5.sapUiCoreLibraryMod.MessageType.Warning & String = js.native
}
