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
  
  val IconAndText: IconAndText with java.lang.String = js.native
  val IconOnly: IconOnly with java.lang.String = js.native
  val TextOnly: TextOnly with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.ObjectMarkerVisibility with java.lang.String] = js.native
}

