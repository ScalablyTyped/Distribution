package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MessageType extends StObject
/**
  * Defines the different message types of a message
  */
@JSGlobal("sap.ui.core.MessageType")
@js.native
object MessageType extends StObject {
  
  @js.native
  sealed trait Error
    extends StObject
       with MessageType
  
  @js.native
  sealed trait Information
    extends StObject
       with MessageType
  
  @js.native
  sealed trait None
    extends StObject
       with MessageType
  
  @js.native
  sealed trait Success
    extends StObject
       with MessageType
  
  @js.native
  sealed trait Warning
    extends StObject
       with MessageType
}
