package typings.openui5.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 0 */ val Draft: typings.openui5.sapNs.mNs.ObjectMarkerType.Draft with Double = js.native
  /* 1 */ val Favorite: typings.openui5.sapNs.mNs.ObjectMarkerType.Favorite with Double = js.native
  /* 2 */ val Flagged: typings.openui5.sapNs.mNs.ObjectMarkerType.Flagged with Double = js.native
  /* 3 */ val Locked: typings.openui5.sapNs.mNs.ObjectMarkerType.Locked with Double = js.native
  /* 4 */ val Unsaved: typings.openui5.sapNs.mNs.ObjectMarkerType.Unsaved with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ObjectMarkerType with Double] = js.native
}

