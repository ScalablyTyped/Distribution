package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ActionTypes extends js.Object

@JSImport("mongorito", "ActionTypes")
@js.native
object ActionTypes extends js.Object {
  @js.native
  sealed trait CALL
    extends mongoritoLib.mongoritoMod.ActionTypes
  
  @js.native
  sealed trait CREATE
    extends mongoritoLib.mongoritoMod.ActionTypes
  
  @js.native
  sealed trait CREATED
    extends mongoritoLib.mongoritoMod.ActionTypes
  
  @js.native
  sealed trait CREATE_INDEX
    extends mongoritoLib.mongoritoMod.ActionTypes
  
  @js.native
  sealed trait DROP_INDEX
    extends mongoritoLib.mongoritoMod.ActionTypes
  
  @js.native
  sealed trait GET
    extends mongoritoLib.mongoritoMod.ActionTypes
  
  @js.native
  sealed trait INCREMENT
    extends mongoritoLib.mongoritoMod.ActionTypes
  
  @js.native
  sealed trait LIST_INDEXES
    extends mongoritoLib.mongoritoMod.ActionTypes
  
  @js.native
  sealed trait QUERY
    extends mongoritoLib.mongoritoMod.ActionTypes
  
  @js.native
  sealed trait REFRESH
    extends mongoritoLib.mongoritoMod.ActionTypes
  
  @js.native
  sealed trait REFRESHED
    extends mongoritoLib.mongoritoMod.ActionTypes
  
  @js.native
  sealed trait REMOVE
    extends mongoritoLib.mongoritoMod.ActionTypes
  
  @js.native
  sealed trait REMOVED
    extends mongoritoLib.mongoritoMod.ActionTypes
  
  @js.native
  sealed trait SAVE
    extends mongoritoLib.mongoritoMod.ActionTypes
  
  @js.native
  sealed trait SET
    extends mongoritoLib.mongoritoMod.ActionTypes
  
  @js.native
  sealed trait UNSET
    extends mongoritoLib.mongoritoMod.ActionTypes
  
  @js.native
  sealed trait UPDATE
    extends mongoritoLib.mongoritoMod.ActionTypes
  
  @js.native
  sealed trait UPDATED
    extends mongoritoLib.mongoritoMod.ActionTypes
  
  /* "@@mongorito/CALL" */ val CALL: CALL with java.lang.String = js.native
  /* "@@mongorito/CREATE" */ val CREATE: CREATE with java.lang.String = js.native
  /* "@@mongorito/CREATED" */ val CREATED: CREATED with java.lang.String = js.native
  /* "@@mongorito/CREATE_INDEX" */ val CREATE_INDEX: CREATE_INDEX with java.lang.String = js.native
  /* "@@mongorito/DROP_INDEX" */ val DROP_INDEX: DROP_INDEX with java.lang.String = js.native
  /* "@@mongorito/GET" */ val GET: GET with java.lang.String = js.native
  /* "@@mongorito/INCREMENT" */ val INCREMENT: INCREMENT with java.lang.String = js.native
  /* "@@mongorito/LIST_INDEXES" */ val LIST_INDEXES: LIST_INDEXES with java.lang.String = js.native
  /* "@@mongorito/QUERY" */ val QUERY: QUERY with java.lang.String = js.native
  /* "@@mongorito/REFRESH" */ val REFRESH: REFRESH with java.lang.String = js.native
  /* "@@mongorito/REFRESHED" */ val REFRESHED: REFRESHED with java.lang.String = js.native
  /* "@@mongorito/REMOVE" */ val REMOVE: REMOVE with java.lang.String = js.native
  /* "@@mongorito/REMOVED" */ val REMOVED: REMOVED with java.lang.String = js.native
  /* "@@mongorito/SAVE" */ val SAVE: SAVE with java.lang.String = js.native
  /* "@@mongorito/SET" */ val SET: SET with java.lang.String = js.native
  /* "@@mongorito/UNSET" */ val UNSET: UNSET with java.lang.String = js.native
  /* "@@mongorito/UPDATE" */ val UPDATE: UPDATE with java.lang.String = js.native
  /* "@@mongorito/UPDATED" */ val UPDATED: UPDATED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[mongoritoLib.mongoritoMod.ActionTypes with java.lang.String] = js.native
}

