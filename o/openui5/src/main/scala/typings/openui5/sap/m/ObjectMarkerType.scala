package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ObjectMarkerType with Double] = js.native
  /* 0 */ @js.native
  object Draft extends TopLevel[Draft with Double]
  
  /* 1 */ @js.native
  object Favorite extends TopLevel[Favorite with Double]
  
  /* 2 */ @js.native
  object Flagged extends TopLevel[Flagged with Double]
  
  /* 3 */ @js.native
  object Locked extends TopLevel[Locked with Double]
  
  /* 4 */ @js.native
  object Unsaved extends TopLevel[Unsaved with Double]
  
}

