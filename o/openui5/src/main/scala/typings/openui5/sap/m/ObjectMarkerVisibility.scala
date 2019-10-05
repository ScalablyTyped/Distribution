package typings.openui5.sap.m

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
  sealed trait IconAndText extends ObjectMarkerVisibility
  
  @js.native
  sealed trait IconOnly extends ObjectMarkerVisibility
  
  @js.native
  sealed trait TextOnly extends ObjectMarkerVisibility
  
  /* 0 */ val IconAndText: typings.openui5.sap.m.ObjectMarkerVisibility.IconAndText with Double = js.native
  /* 1 */ val IconOnly: typings.openui5.sap.m.ObjectMarkerVisibility.IconOnly with Double = js.native
  /* 2 */ val TextOnly: typings.openui5.sap.m.ObjectMarkerVisibility.TextOnly with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ObjectMarkerVisibility with Double] = js.native
}

