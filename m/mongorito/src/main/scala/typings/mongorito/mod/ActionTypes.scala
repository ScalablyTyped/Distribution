package typings.mongorito.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ActionTypes extends StObject
@JSImport("mongorito", "ActionTypes")
@js.native
object ActionTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ActionTypes & String] = js.native
  
  @js.native
  sealed trait CALL
    extends StObject
       with ActionTypes
  /* "@@mongorito/CALL" */ val CALL: typings.mongorito.mod.ActionTypes.CALL & String = js.native
  
  @js.native
  sealed trait CREATE
    extends StObject
       with ActionTypes
  /* "@@mongorito/CREATE" */ val CREATE: typings.mongorito.mod.ActionTypes.CREATE & String = js.native
  
  @js.native
  sealed trait CREATED
    extends StObject
       with ActionTypes
  /* "@@mongorito/CREATED" */ val CREATED: typings.mongorito.mod.ActionTypes.CREATED & String = js.native
  
  @js.native
  sealed trait CREATE_INDEX
    extends StObject
       with ActionTypes
  /* "@@mongorito/CREATE_INDEX" */ val CREATE_INDEX: typings.mongorito.mod.ActionTypes.CREATE_INDEX & String = js.native
  
  @js.native
  sealed trait DROP_INDEX
    extends StObject
       with ActionTypes
  /* "@@mongorito/DROP_INDEX" */ val DROP_INDEX: typings.mongorito.mod.ActionTypes.DROP_INDEX & String = js.native
  
  @js.native
  sealed trait GET
    extends StObject
       with ActionTypes
  /* "@@mongorito/GET" */ val GET: typings.mongorito.mod.ActionTypes.GET & String = js.native
  
  @js.native
  sealed trait INCREMENT
    extends StObject
       with ActionTypes
  /* "@@mongorito/INCREMENT" */ val INCREMENT: typings.mongorito.mod.ActionTypes.INCREMENT & String = js.native
  
  @js.native
  sealed trait LIST_INDEXES
    extends StObject
       with ActionTypes
  /* "@@mongorito/LIST_INDEXES" */ val LIST_INDEXES: typings.mongorito.mod.ActionTypes.LIST_INDEXES & String = js.native
  
  @js.native
  sealed trait QUERY
    extends StObject
       with ActionTypes
  /* "@@mongorito/QUERY" */ val QUERY: typings.mongorito.mod.ActionTypes.QUERY & String = js.native
  
  @js.native
  sealed trait REFRESH
    extends StObject
       with ActionTypes
  /* "@@mongorito/REFRESH" */ val REFRESH: typings.mongorito.mod.ActionTypes.REFRESH & String = js.native
  
  @js.native
  sealed trait REFRESHED
    extends StObject
       with ActionTypes
  /* "@@mongorito/REFRESHED" */ val REFRESHED: typings.mongorito.mod.ActionTypes.REFRESHED & String = js.native
  
  @js.native
  sealed trait REMOVE
    extends StObject
       with ActionTypes
  /* "@@mongorito/REMOVE" */ val REMOVE: typings.mongorito.mod.ActionTypes.REMOVE & String = js.native
  
  @js.native
  sealed trait REMOVED
    extends StObject
       with ActionTypes
  /* "@@mongorito/REMOVED" */ val REMOVED: typings.mongorito.mod.ActionTypes.REMOVED & String = js.native
  
  @js.native
  sealed trait SAVE
    extends StObject
       with ActionTypes
  /* "@@mongorito/SAVE" */ val SAVE: typings.mongorito.mod.ActionTypes.SAVE & String = js.native
  
  @js.native
  sealed trait SET
    extends StObject
       with ActionTypes
  /* "@@mongorito/SET" */ val SET: typings.mongorito.mod.ActionTypes.SET & String = js.native
  
  @js.native
  sealed trait UNSET
    extends StObject
       with ActionTypes
  /* "@@mongorito/UNSET" */ val UNSET: typings.mongorito.mod.ActionTypes.UNSET & String = js.native
  
  @js.native
  sealed trait UPDATE
    extends StObject
       with ActionTypes
  /* "@@mongorito/UPDATE" */ val UPDATE: typings.mongorito.mod.ActionTypes.UPDATE & String = js.native
  
  @js.native
  sealed trait UPDATED
    extends StObject
       with ActionTypes
  /* "@@mongorito/UPDATED" */ val UPDATED: typings.mongorito.mod.ActionTypes.UPDATED & String = js.native
}
