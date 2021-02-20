package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ObjectMarkerType extends StObject
/**
  * Predefined types for ObjectMarker.
  */
@JSGlobal("sap.m.ObjectMarkerType")
@js.native
object ObjectMarkerType extends StObject {
  
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
