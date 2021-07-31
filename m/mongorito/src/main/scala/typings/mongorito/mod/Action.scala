package typings.mongorito.mod

import typings.mongorito.anon.Args
import typings.mongorito.mod.ActionTypes.CALL
import typings.mongorito.mod.ActionTypes.CREATE
import typings.mongorito.mod.ActionTypes.CREATED
import typings.mongorito.mod.ActionTypes.CREATE_INDEX
import typings.mongorito.mod.ActionTypes.DROP_INDEX
import typings.mongorito.mod.ActionTypes.GET
import typings.mongorito.mod.ActionTypes.INCREMENT
import typings.mongorito.mod.ActionTypes.LIST_INDEXES
import typings.mongorito.mod.ActionTypes.QUERY
import typings.mongorito.mod.ActionTypes.REFRESH
import typings.mongorito.mod.ActionTypes.REFRESHED
import typings.mongorito.mod.ActionTypes.REMOVE
import typings.mongorito.mod.ActionTypes.REMOVED
import typings.mongorito.mod.ActionTypes.SAVE
import typings.mongorito.mod.ActionTypes.SET
import typings.mongorito.mod.ActionTypes.UNSET
import typings.mongorito.mod.ActionTypes.UPDATE
import typings.mongorito.mod.ActionTypes.UPDATED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mongorito.mod.GetAction
  - typings.mongorito.mod.SetAction
  - typings.mongorito.mod.UnsetAction
  - typings.mongorito.mod.RefreshAction
  - typings.mongorito.mod.RefreshedAction
  - typings.mongorito.mod.SaveAction
  - typings.mongorito.mod.CreateAction
  - typings.mongorito.mod.CreatedAction
  - typings.mongorito.mod.UpdateAction
  - typings.mongorito.mod.UpdatedAction
  - typings.mongorito.mod.RemoveAction
  - typings.mongorito.mod.RemovedAction
  - typings.mongorito.mod.IncrementAction
  - typings.mongorito.mod.CreateIndexAction
  - typings.mongorito.mod.DropIndexAction
  - typings.mongorito.mod.ListIndexesAction
  - typings.mongorito.mod.QueryAction
  - typings.mongorito.mod.CallAction
*/
trait Action extends StObject
object Action {
  
  @scala.inline
  def CallAction(args: js.Array[Args], method: String, `type`: CALL): typings.mongorito.mod.CallAction = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongorito.mod.CallAction]
  }
  
  @scala.inline
  def CreateAction(id: js.Object, `type`: CREATE): typings.mongorito.mod.CreateAction = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongorito.mod.CreateAction]
  }
  
  @scala.inline
  def CreateIndexAction(args: js.Array[js.Any], `type`: CREATE_INDEX): typings.mongorito.mod.CreateIndexAction = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongorito.mod.CreateIndexAction]
  }
  
  @scala.inline
  def CreatedAction(id: js.Object, `type`: CREATED): typings.mongorito.mod.CreatedAction = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongorito.mod.CreatedAction]
  }
  
  @scala.inline
  def DropIndexAction(args: js.Array[js.Any], `type`: DROP_INDEX): typings.mongorito.mod.DropIndexAction = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongorito.mod.DropIndexAction]
  }
  
  @scala.inline
  def GetAction(`type`: GET): typings.mongorito.mod.GetAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongorito.mod.GetAction]
  }
  
  @scala.inline
  def IncrementAction(fields: js.Object, `type`: INCREMENT): typings.mongorito.mod.IncrementAction = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongorito.mod.IncrementAction]
  }
  
  @scala.inline
  def ListIndexesAction(args: js.Array[js.Any], `type`: LIST_INDEXES): typings.mongorito.mod.ListIndexesAction = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongorito.mod.ListIndexesAction]
  }
  
  @scala.inline
  def QueryAction(method: String, query: js.Array[Args], `type`: QUERY): typings.mongorito.mod.QueryAction = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongorito.mod.QueryAction]
  }
  
  @scala.inline
  def RefreshAction(`type`: REFRESH): typings.mongorito.mod.RefreshAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongorito.mod.RefreshAction]
  }
  
  @scala.inline
  def RefreshedAction(fields: js.Object, `type`: REFRESHED): typings.mongorito.mod.RefreshedAction = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongorito.mod.RefreshedAction]
  }
  
  @scala.inline
  def RemoveAction(`type`: REMOVE): typings.mongorito.mod.RemoveAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongorito.mod.RemoveAction]
  }
  
  @scala.inline
  def RemovedAction(`type`: REMOVED): typings.mongorito.mod.RemovedAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongorito.mod.RemovedAction]
  }
  
  @scala.inline
  def SaveAction(fields: js.Object, `type`: SAVE): typings.mongorito.mod.SaveAction = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongorito.mod.SaveAction]
  }
  
  @scala.inline
  def SetAction(fields: js.Object, `type`: SET): typings.mongorito.mod.SetAction = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongorito.mod.SetAction]
  }
  
  @scala.inline
  def UnsetAction(keys: String | js.Array[String], `type`: UNSET): typings.mongorito.mod.UnsetAction = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongorito.mod.UnsetAction]
  }
  
  @scala.inline
  def UpdateAction(fields: js.Object, `type`: UPDATE): typings.mongorito.mod.UpdateAction = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongorito.mod.UpdateAction]
  }
  
  @scala.inline
  def UpdatedAction(fields: js.Object, `type`: UPDATED): typings.mongorito.mod.UpdatedAction = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongorito.mod.UpdatedAction]
  }
}
