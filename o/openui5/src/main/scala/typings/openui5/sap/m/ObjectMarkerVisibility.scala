package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ObjectMarkerVisibility with Double] = js.native
  /* 0 */ @js.native
  object IconAndText extends TopLevel[IconAndText with Double]
  
  /* 1 */ @js.native
  object IconOnly extends TopLevel[IconOnly with Double]
  
  /* 2 */ @js.native
  object TextOnly extends TopLevel[TextOnly with Double]
  
}

