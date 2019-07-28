package typings.mongorito.mongoritoMod

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
  
  /* "@@mongorito/CALL" */ val CALL: typings.mongorito.mongoritoMod.ActionTypes.CALL with String = js.native
  /* "@@mongorito/CREATE" */ val CREATE: typings.mongorito.mongoritoMod.ActionTypes.CREATE with String = js.native
  /* "@@mongorito/CREATED" */ val CREATED: typings.mongorito.mongoritoMod.ActionTypes.CREATED with String = js.native
  /* "@@mongorito/CREATE_INDEX" */ val CREATE_INDEX: typings.mongorito.mongoritoMod.ActionTypes.CREATE_INDEX with String = js.native
  /* "@@mongorito/DROP_INDEX" */ val DROP_INDEX: typings.mongorito.mongoritoMod.ActionTypes.DROP_INDEX with String = js.native
  /* "@@mongorito/GET" */ val GET: typings.mongorito.mongoritoMod.ActionTypes.GET with String = js.native
  /* "@@mongorito/INCREMENT" */ val INCREMENT: typings.mongorito.mongoritoMod.ActionTypes.INCREMENT with String = js.native
  /* "@@mongorito/LIST_INDEXES" */ val LIST_INDEXES: typings.mongorito.mongoritoMod.ActionTypes.LIST_INDEXES with String = js.native
  /* "@@mongorito/QUERY" */ val QUERY: typings.mongorito.mongoritoMod.ActionTypes.QUERY with String = js.native
  /* "@@mongorito/REFRESH" */ val REFRESH: typings.mongorito.mongoritoMod.ActionTypes.REFRESH with String = js.native
  /* "@@mongorito/REFRESHED" */ val REFRESHED: typings.mongorito.mongoritoMod.ActionTypes.REFRESHED with String = js.native
  /* "@@mongorito/REMOVE" */ val REMOVE: typings.mongorito.mongoritoMod.ActionTypes.REMOVE with String = js.native
  /* "@@mongorito/REMOVED" */ val REMOVED: typings.mongorito.mongoritoMod.ActionTypes.REMOVED with String = js.native
  /* "@@mongorito/SAVE" */ val SAVE: typings.mongorito.mongoritoMod.ActionTypes.SAVE with String = js.native
  /* "@@mongorito/SET" */ val SET: typings.mongorito.mongoritoMod.ActionTypes.SET with String = js.native
  /* "@@mongorito/UNSET" */ val UNSET: typings.mongorito.mongoritoMod.ActionTypes.UNSET with String = js.native
  /* "@@mongorito/UPDATE" */ val UPDATE: typings.mongorito.mongoritoMod.ActionTypes.UPDATE with String = js.native
  /* "@@mongorito/UPDATED" */ val UPDATED: typings.mongorito.mongoritoMod.ActionTypes.UPDATED with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ActionTypes with String] = js.native
}

