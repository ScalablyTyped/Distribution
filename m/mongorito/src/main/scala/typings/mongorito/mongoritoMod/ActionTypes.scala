package typings.mongorito.mongoritoMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ActionTypes extends js.Object

@JSImport("mongorito", "ActionTypes")
@js.native
object ActionTypes extends js.Object {
  @js.native
  sealed trait CALL extends ActionTypes
  
  @js.native
  sealed trait CREATE extends ActionTypes
  
  @js.native
  sealed trait CREATED extends ActionTypes
  
  @js.native
  sealed trait CREATE_INDEX extends ActionTypes
  
  @js.native
  sealed trait DROP_INDEX extends ActionTypes
  
  @js.native
  sealed trait GET extends ActionTypes
  
  @js.native
  sealed trait INCREMENT extends ActionTypes
  
  @js.native
  sealed trait LIST_INDEXES extends ActionTypes
  
  @js.native
  sealed trait QUERY extends ActionTypes
  
  @js.native
  sealed trait REFRESH extends ActionTypes
  
  @js.native
  sealed trait REFRESHED extends ActionTypes
  
  @js.native
  sealed trait REMOVE extends ActionTypes
  
  @js.native
  sealed trait REMOVED extends ActionTypes
  
  @js.native
  sealed trait SAVE extends ActionTypes
  
  @js.native
  sealed trait SET extends ActionTypes
  
  @js.native
  sealed trait UNSET extends ActionTypes
  
  @js.native
  sealed trait UPDATE extends ActionTypes
  
  @js.native
  sealed trait UPDATED extends ActionTypes
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ActionTypes with String] = js.native
  /* "@@mongorito/CALL" */ @js.native
  object CALL extends TopLevel[CALL with String]
  
  /* "@@mongorito/CREATE" */ @js.native
  object CREATE extends TopLevel[CREATE with String]
  
  /* "@@mongorito/CREATED" */ @js.native
  object CREATED extends TopLevel[CREATED with String]
  
  /* "@@mongorito/CREATE_INDEX" */ @js.native
  object CREATE_INDEX extends TopLevel[CREATE_INDEX with String]
  
  /* "@@mongorito/DROP_INDEX" */ @js.native
  object DROP_INDEX extends TopLevel[DROP_INDEX with String]
  
  /* "@@mongorito/GET" */ @js.native
  object GET extends TopLevel[GET with String]
  
  /* "@@mongorito/INCREMENT" */ @js.native
  object INCREMENT extends TopLevel[INCREMENT with String]
  
  /* "@@mongorito/LIST_INDEXES" */ @js.native
  object LIST_INDEXES extends TopLevel[LIST_INDEXES with String]
  
  /* "@@mongorito/QUERY" */ @js.native
  object QUERY extends TopLevel[QUERY with String]
  
  /* "@@mongorito/REFRESH" */ @js.native
  object REFRESH extends TopLevel[REFRESH with String]
  
  /* "@@mongorito/REFRESHED" */ @js.native
  object REFRESHED extends TopLevel[REFRESHED with String]
  
  /* "@@mongorito/REMOVE" */ @js.native
  object REMOVE extends TopLevel[REMOVE with String]
  
  /* "@@mongorito/REMOVED" */ @js.native
  object REMOVED extends TopLevel[REMOVED with String]
  
  /* "@@mongorito/SAVE" */ @js.native
  object SAVE extends TopLevel[SAVE with String]
  
  /* "@@mongorito/SET" */ @js.native
  object SET extends TopLevel[SET with String]
  
  /* "@@mongorito/UNSET" */ @js.native
  object UNSET extends TopLevel[UNSET with String]
  
  /* "@@mongorito/UPDATE" */ @js.native
  object UPDATE extends TopLevel[UPDATE with String]
  
  /* "@@mongorito/UPDATED" */ @js.native
  object UPDATED extends TopLevel[UPDATED with String]
  
}

