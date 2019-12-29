package typings.mongorito.mongoritoMod

import typings.mongorito.Anon_Args
import typings.mongorito.mongoritoMod.ActionTypes.CALL
import typings.mongorito.mongoritoMod.ActionTypes.CREATE
import typings.mongorito.mongoritoMod.ActionTypes.CREATED
import typings.mongorito.mongoritoMod.ActionTypes.CREATE_INDEX
import typings.mongorito.mongoritoMod.ActionTypes.DROP_INDEX
import typings.mongorito.mongoritoMod.ActionTypes.GET
import typings.mongorito.mongoritoMod.ActionTypes.INCREMENT
import typings.mongorito.mongoritoMod.ActionTypes.LIST_INDEXES
import typings.mongorito.mongoritoMod.ActionTypes.QUERY
import typings.mongorito.mongoritoMod.ActionTypes.REFRESH
import typings.mongorito.mongoritoMod.ActionTypes.REFRESHED
import typings.mongorito.mongoritoMod.ActionTypes.REMOVE
import typings.mongorito.mongoritoMod.ActionTypes.REMOVED
import typings.mongorito.mongoritoMod.ActionTypes.SAVE
import typings.mongorito.mongoritoMod.ActionTypes.SET
import typings.mongorito.mongoritoMod.ActionTypes.UNSET
import typings.mongorito.mongoritoMod.ActionTypes.UPDATE
import typings.mongorito.mongoritoMod.ActionTypes.UPDATED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mongorito.mongoritoMod.GetAction
  - typings.mongorito.mongoritoMod.SetAction
  - typings.mongorito.mongoritoMod.UnsetAction
  - typings.mongorito.mongoritoMod.RefreshAction
  - typings.mongorito.mongoritoMod.RefreshedAction
  - typings.mongorito.mongoritoMod.SaveAction
  - typings.mongorito.mongoritoMod.CreateAction
  - typings.mongorito.mongoritoMod.CreatedAction
  - typings.mongorito.mongoritoMod.UpdateAction
  - typings.mongorito.mongoritoMod.UpdatedAction
  - typings.mongorito.mongoritoMod.RemoveAction
  - typings.mongorito.mongoritoMod.RemovedAction
  - typings.mongorito.mongoritoMod.IncrementAction
  - typings.mongorito.mongoritoMod.CreateIndexAction
  - typings.mongorito.mongoritoMod.DropIndexAction
  - typings.mongorito.mongoritoMod.ListIndexesAction
  - typings.mongorito.mongoritoMod.QueryAction
  - typings.mongorito.mongoritoMod.CallAction
*/
trait Action extends js.Object

object Action {
  @scala.inline
  def UnsetAction(keys: String | js.Array[String], `type`: UNSET): Action = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def RefreshedAction(fields: js.Object, `type`: REFRESHED): Action = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def GetAction(`type`: GET, key: String = null): Action = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def CreateAction(id: js.Object, `type`: CREATE): Action = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def RemovedAction(`type`: REMOVED): Action = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def SaveAction(fields: js.Object, `type`: SAVE): Action = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def CreatedAction(id: js.Object, `type`: CREATED): Action = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def DropIndexAction(args: js.Array[_], `type`: DROP_INDEX): Action = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def UpdateAction(fields: js.Object, `type`: UPDATE): Action = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def CreateIndexAction(args: js.Array[_], `type`: CREATE_INDEX): Action = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def UpdatedAction(fields: js.Object, `type`: UPDATED): Action = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def SetAction(fields: js.Object, `type`: SET): Action = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def CallAction(args: js.Array[Anon_Args], method: String, `type`: CALL): Action = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def RefreshAction(`type`: REFRESH): Action = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def IncrementAction(fields: js.Object, `type`: INCREMENT): Action = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def ListIndexesAction(args: js.Array[_], `type`: LIST_INDEXES): Action = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def QueryAction(method: String, query: js.Array[Anon_Args], `type`: QUERY): Action = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def RemoveAction(`type`: REMOVE): Action = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

