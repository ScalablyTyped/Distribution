package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ObjectMarkerType extends js.Object
/**
  * Predefined types for ObjectMarker.
  */
@JSGlobal("sap.m.ObjectMarkerType")
@js.native
object ObjectMarkerType extends js.Object {
  
  @js.native
  sealed trait Draft extends ObjectMarkerType
  
  @js.native
  sealed trait Favorite extends ObjectMarkerType
  
  @js.native
  sealed trait Flagged extends ObjectMarkerType
  
  @js.native
  sealed trait Locked extends ObjectMarkerType
  
  @js.native
  sealed trait Unsaved extends ObjectMarkerType
}
