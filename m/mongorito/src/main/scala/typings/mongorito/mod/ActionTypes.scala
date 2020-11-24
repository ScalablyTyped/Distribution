package typings.mongorito.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ActionTypes extends js.Object
@JSImport("mongorito", "ActionTypes")
@js.native
object ActionTypes extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ActionTypes with String] = js.native
  
  @js.native
  sealed trait CALL extends ActionTypes
  /* "@@mongorito/CALL" */ @js.native
  object CALL extends TopLevel[CALL with String]
  
  @js.native
  sealed trait CREATE extends ActionTypes
  /* "@@mongorito/CREATE" */ @js.native
  object CREATE extends TopLevel[CREATE with String]
  
  @js.native
  sealed trait CREATED extends ActionTypes
  /* "@@mongorito/CREATED" */ @js.native
  object CREATED extends TopLevel[CREATED with String]
  
  @js.native
  sealed trait CREATE_INDEX extends ActionTypes
  /* "@@mongorito/CREATE_INDEX" */ @js.native
  object CREATE_INDEX extends TopLevel[CREATE_INDEX with String]
  
  @js.native
  sealed trait DROP_INDEX extends ActionTypes
  /* "@@mongorito/DROP_INDEX" */ @js.native
  object DROP_INDEX extends TopLevel[DROP_INDEX with String]
  
  @js.native
  sealed trait GET extends ActionTypes
  /* "@@mongorito/GET" */ @js.native
  object GET extends TopLevel[GET with String]
  
  @js.native
  sealed trait INCREMENT extends ActionTypes
  /* "@@mongorito/INCREMENT" */ @js.native
  object INCREMENT extends TopLevel[INCREMENT with String]
  
  @js.native
  sealed trait LIST_INDEXES extends ActionTypes
  /* "@@mongorito/LIST_INDEXES" */ @js.native
  object LIST_INDEXES extends TopLevel[LIST_INDEXES with String]
  
  @js.native
  sealed trait QUERY extends ActionTypes
  /* "@@mongorito/QUERY" */ @js.native
  object QUERY extends TopLevel[QUERY with String]
  
  @js.native
  sealed trait REFRESH extends ActionTypes
  /* "@@mongorito/REFRESH" */ @js.native
  object REFRESH extends TopLevel[REFRESH with String]
  
  @js.native
  sealed trait REFRESHED extends ActionTypes
  /* "@@mongorito/REFRESHED" */ @js.native
  object REFRESHED extends TopLevel[REFRESHED with String]
  
  @js.native
  sealed trait REMOVE extends ActionTypes
  /* "@@mongorito/REMOVE" */ @js.native
  object REMOVE extends TopLevel[REMOVE with String]
  
  @js.native
  sealed trait REMOVED extends ActionTypes
  /* "@@mongorito/REMOVED" */ @js.native
  object REMOVED extends TopLevel[REMOVED with String]
  
  @js.native
  sealed trait SAVE extends ActionTypes
  /* "@@mongorito/SAVE" */ @js.native
  object SAVE extends TopLevel[SAVE with String]
  
  @js.native
  sealed trait SET extends ActionTypes
  /* "@@mongorito/SET" */ @js.native
  object SET extends TopLevel[SET with String]
  
  @js.native
  sealed trait UNSET extends ActionTypes
  /* "@@mongorito/UNSET" */ @js.native
  object UNSET extends TopLevel[UNSET with String]
  
  @js.native
  sealed trait UPDATE extends ActionTypes
  /* "@@mongorito/UPDATE" */ @js.native
  object UPDATE extends TopLevel[UPDATE with String]
  
  @js.native
  sealed trait UPDATED extends ActionTypes
  /* "@@mongorito/UPDATED" */ @js.native
  object UPDATED extends TopLevel[UPDATED with String]
}
