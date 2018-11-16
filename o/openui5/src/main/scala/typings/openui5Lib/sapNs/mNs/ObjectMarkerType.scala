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
  
  val Draft: Draft with java.lang.String = js.native
  val Favorite: Favorite with java.lang.String = js.native
  val Flagged: Flagged with java.lang.String = js.native
  val Locked: Locked with java.lang.String = js.native
  val Unsaved: Unsaved with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.ObjectMarkerType with java.lang.String] = js.native
}

