package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ObjectMarkerVisibility extends js.Object
/**
  * Predefined visibility for ObjectMarker.
  */
@JSGlobal("sap.m.ObjectMarkerVisibility")
@js.native
object ObjectMarkerVisibility extends js.Object {
  
  @js.native
  sealed trait IconAndText extends ObjectMarkerVisibility
  
  @js.native
  sealed trait IconOnly extends ObjectMarkerVisibility
  
  @js.native
  sealed trait TextOnly extends ObjectMarkerVisibility
}
