package typings
package openui5Lib.sapNs.mNs

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
  sealed trait Draft
    extends openui5Lib.sapNs.mNs.ObjectMarkerType
  
  @js.native
  sealed trait Favorite
    extends openui5Lib.sapNs.mNs.ObjectMarkerType
  
  @js.native
  sealed trait Flagged
    extends openui5Lib.sapNs.mNs.ObjectMarkerType
  
  @js.native
  sealed trait Locked
    extends openui5Lib.sapNs.mNs.ObjectMarkerType
  
  @js.native
  sealed trait Unsaved
    extends openui5Lib.sapNs.mNs.ObjectMarkerType
  
  /* 0 */ val Draft: Draft with scala.Double = js.native
  /* 1 */ val Favorite: Favorite with scala.Double = js.native
  /* 2 */ val Flagged: Flagged with scala.Double = js.native
  /* 3 */ val Locked: Locked with scala.Double = js.native
  /* 4 */ val Unsaved: Unsaved with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.ObjectMarkerType with scala.Double] = js.native
}

