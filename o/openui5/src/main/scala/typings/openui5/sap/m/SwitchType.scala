package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SwitchType extends StObject
/**
  * Enumaration for different switch types.
  */
@JSGlobal("sap.m.SwitchType")
@js.native
object SwitchType extends StObject {
  
  @js.native
  sealed trait AcceptReject
    extends StObject
       with SwitchType
  
  @js.native
  sealed trait Default
    extends StObject
       with SwitchType
}
