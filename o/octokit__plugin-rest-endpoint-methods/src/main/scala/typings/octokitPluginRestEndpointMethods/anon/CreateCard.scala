package typings.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCard extends js.Object {
  
  var addCollaborator: `820` = js.native
  
  var createCard: `821` = js.native
  
  var createColumn: `822` = js.native
  
  var createForAuthenticatedUser: `823` = js.native
  
  var createForOrg: `824` = js.native
  
  var createForRepo: `825` = js.native
  
  var delete: `826` = js.native
  
  var deleteCard: `827` = js.native
  
  var deleteColumn: `828` = js.native
  
  var get: `829` = js.native
  
  var getCard: `830` = js.native
  
  var getColumn: `831` = js.native
  
  var getPermissionForUser: `832` = js.native
  
  var listCards: `833` = js.native
  
  var listCollaborators: `834` = js.native
  
  var listColumns: `835` = js.native
  
  var listForOrg: `836` = js.native
  
  var listForRepo: `837` = js.native
  
  var listForUser: `838` = js.native
  
  var moveCard: `839` = js.native
  
  var moveColumn: `840` = js.native
  
  var removeCollaborator: `841` = js.native
  
  var update: `842` = js.native
  
  var updateCard: `843` = js.native
  
  var updateColumn: `844` = js.native
}
object CreateCard {
  
  @scala.inline
  def apply(
    addCollaborator: `820`,
    createCard: `821`,
    createColumn: `822`,
    createForAuthenticatedUser: `823`,
    createForOrg: `824`,
    createForRepo: `825`,
    delete: `826`,
    deleteCard: `827`,
    deleteColumn: `828`,
    get: `829`,
    getCard: `830`,
    getColumn: `831`,
    getPermissionForUser: `832`,
    listCards: `833`,
    listCollaborators: `834`,
    listColumns: `835`,
    listForOrg: `836`,
    listForRepo: `837`,
    listForUser: `838`,
    moveCard: `839`,
    moveColumn: `840`,
    removeCollaborator: `841`,
    update: `842`,
    updateCard: `843`,
    updateColumn: `844`
  ): CreateCard = {
    val __obj = js.Dynamic.literal(addCollaborator = addCollaborator.asInstanceOf[js.Any], createCard = createCard.asInstanceOf[js.Any], createColumn = createColumn.asInstanceOf[js.Any], createForAuthenticatedUser = createForAuthenticatedUser.asInstanceOf[js.Any], createForOrg = createForOrg.asInstanceOf[js.Any], createForRepo = createForRepo.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], deleteCard = deleteCard.asInstanceOf[js.Any], deleteColumn = deleteColumn.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getCard = getCard.asInstanceOf[js.Any], getColumn = getColumn.asInstanceOf[js.Any], getPermissionForUser = getPermissionForUser.asInstanceOf[js.Any], listCards = listCards.asInstanceOf[js.Any], listCollaborators = listCollaborators.asInstanceOf[js.Any], listColumns = listColumns.asInstanceOf[js.Any], listForOrg = listForOrg.asInstanceOf[js.Any], listForRepo = listForRepo.asInstanceOf[js.Any], listForUser = listForUser.asInstanceOf[js.Any], moveCard = moveCard.asInstanceOf[js.Any], moveColumn = moveColumn.asInstanceOf[js.Any], removeCollaborator = removeCollaborator.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateCard = updateCard.asInstanceOf[js.Any], updateColumn = updateColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCard]
  }
  
  @scala.inline
  implicit class CreateCardOps[Self <: CreateCard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddCollaborator(value: `820`): Self = this.set("addCollaborator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateCard(value: `821`): Self = this.set("createCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateColumn(value: `822`): Self = this.set("createColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateForAuthenticatedUser(value: `823`): Self = this.set("createForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateForOrg(value: `824`): Self = this.set("createForOrg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateForRepo(value: `825`): Self = this.set("createForRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: `826`): Self = this.set("delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteCard(value: `827`): Self = this.set("deleteCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteColumn(value: `828`): Self = this.set("deleteColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: `829`): Self = this.set("get", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCard(value: `830`): Self = this.set("getCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetColumn(value: `831`): Self = this.set("getColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetPermissionForUser(value: `832`): Self = this.set("getPermissionForUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListCards(value: `833`): Self = this.set("listCards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListCollaborators(value: `834`): Self = this.set("listCollaborators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListColumns(value: `835`): Self = this.set("listColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListForOrg(value: `836`): Self = this.set("listForOrg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListForRepo(value: `837`): Self = this.set("listForRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListForUser(value: `838`): Self = this.set("listForUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveCard(value: `839`): Self = this.set("moveCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveColumn(value: `840`): Self = this.set("moveColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveCollaborator(value: `841`): Self = this.set("removeCollaborator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: `842`): Self = this.set("update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateCard(value: `843`): Self = this.set("updateCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateColumn(value: `844`): Self = this.set("updateColumn", value.asInstanceOf[js.Any])
  }
}
