package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ImeMode extends StObject
/**
  * State of the Input Method Editor (IME) for the control.Depending on its value, it allows users to
  * enter and edit for example Chinese characters.
  */
@JSGlobal("sap.ui.core.ImeMode")
@js.native
object ImeMode extends StObject {
  
  @js.native
  sealed trait Active
    extends StObject
       with ImeMode
  
  @js.native
  sealed trait Auto
    extends StObject
       with ImeMode
  
  @js.native
  sealed trait Disabled
    extends StObject
       with ImeMode
  
  @js.native
  sealed trait Inactive
    extends StObject
       with ImeMode
}
