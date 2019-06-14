package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ObjectMarkerVisibility extends js.Object

/**
  * Predefined visibility for ObjectMarker.
  */
@JSGlobal("sap.m.ObjectMarkerVisibility")
@js.native
object ObjectMarkerVisibility extends js.Object {
  @js.native
  sealed trait IconAndText
    extends openui5Lib.sapNs.mNs.ObjectMarkerVisibility
  
  @js.native
  sealed trait IconOnly
    extends openui5Lib.sapNs.mNs.ObjectMarkerVisibility
  
  @js.native
  sealed trait TextOnly
    extends openui5Lib.sapNs.mNs.ObjectMarkerVisibility
  
  /* 0 */ val IconAndText: IconAndText with scala.Double = js.native
  /* 1 */ val IconOnly: IconOnly with scala.Double = js.native
  /* 2 */ val TextOnly: TextOnly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.ObjectMarkerVisibility with scala.Double] = js.native
}

