package typings.mongorito.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ActionTypes extends StObject
@JSImport("mongorito", "ActionTypes")
@js.native
object ActionTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ActionTypes with String] = js.native
  
  @js.native
  sealed trait CALL extends ActionTypes
  /* "@@mongorito/CALL" */ val CALL: typings.mongorito.mod.ActionTypes.CALL with String = js.native
  
  @js.native
  sealed trait CREATE extends ActionTypes
  /* "@@mongorito/CREATE" */ val CREATE: typings.mongorito.mod.ActionTypes.CREATE with String = js.native
  
  @js.native
  sealed trait CREATED extends ActionTypes
  /* "@@mongorito/CREATED" */ val CREATED: typings.mongorito.mod.ActionTypes.CREATED with String = js.native
  
  @js.native
  sealed trait CREATE_INDEX extends ActionTypes
  /* "@@mongorito/CREATE_INDEX" */ val CREATE_INDEX: typings.mongorito.mod.ActionTypes.CREATE_INDEX with String = js.native
  
  @js.native
  sealed trait DROP_INDEX extends ActionTypes
  /* "@@mongorito/DROP_INDEX" */ val DROP_INDEX: typings.mongorito.mod.ActionTypes.DROP_INDEX with String = js.native
  
  @js.native
  sealed trait GET extends ActionTypes
  /* "@@mongorito/GET" */ val GET: typings.mongorito.mod.ActionTypes.GET with String = js.native
  
  @js.native
  sealed trait INCREMENT extends ActionTypes
  /* "@@mongorito/INCREMENT" */ val INCREMENT: typings.mongorito.mod.ActionTypes.INCREMENT with String = js.native
  
  @js.native
  sealed trait LIST_INDEXES extends ActionTypes
  /* "@@mongorito/LIST_INDEXES" */ val LIST_INDEXES: typings.mongorito.mod.ActionTypes.LIST_INDEXES with String = js.native
  
  @js.native
  sealed trait QUERY extends ActionTypes
  /* "@@mongorito/QUERY" */ val QUERY: typings.mongorito.mod.ActionTypes.QUERY with String = js.native
  
  @js.native
  sealed trait REFRESH extends ActionTypes
  /* "@@mongorito/REFRESH" */ val REFRESH: typings.mongorito.mod.ActionTypes.REFRESH with String = js.native
  
  @js.native
  sealed trait REFRESHED extends ActionTypes
  /* "@@mongorito/REFRESHED" */ val REFRESHED: typings.mongorito.mod.ActionTypes.REFRESHED with String = js.native
  
  @js.native
  sealed trait REMOVE extends ActionTypes
  /* "@@mongorito/REMOVE" */ val REMOVE: typings.mongorito.mod.ActionTypes.REMOVE with String = js.native
  
  @js.native
  sealed trait REMOVED extends ActionTypes
  /* "@@mongorito/REMOVED" */ val REMOVED: typings.mongorito.mod.ActionTypes.REMOVED with String = js.native
  
  @js.native
  sealed trait SAVE extends ActionTypes
  /* "@@mongorito/SAVE" */ val SAVE: typings.mongorito.mod.ActionTypes.SAVE with String = js.native
  
  @js.native
  sealed trait SET extends ActionTypes
  /* "@@mongorito/SET" */ val SET: typings.mongorito.mod.ActionTypes.SET with String = js.native
  
  @js.native
  sealed trait UNSET extends ActionTypes
  /* "@@mongorito/UNSET" */ val UNSET: typings.mongorito.mod.ActionTypes.UNSET with String = js.native
  
  @js.native
  sealed trait UPDATE extends ActionTypes
  /* "@@mongorito/UPDATE" */ val UPDATE: typings.mongorito.mod.ActionTypes.UPDATE with String = js.native
  
  @js.native
  sealed trait UPDATED extends ActionTypes
  /* "@@mongorito/UPDATED" */ val UPDATED: typings.mongorito.mod.ActionTypes.UPDATED with String = js.native
}
