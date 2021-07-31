package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PopinDisplay extends StObject
/**
  * Defines the display of table pop-ins
  */
@JSGlobal("sap.m.PopinDisplay")
@js.native
object PopinDisplay extends StObject {
  
  @js.native
  sealed trait Block
    extends StObject
       with PopinDisplay
  
  @js.native
  sealed trait Inline
    extends StObject
       with PopinDisplay
  
  @js.native
  sealed trait WithoutHeader
    extends StObject
       with PopinDisplay
}
