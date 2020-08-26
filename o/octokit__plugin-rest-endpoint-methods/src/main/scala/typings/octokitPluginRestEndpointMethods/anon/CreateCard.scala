package typings.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCard extends js.Object {
  var addCollaborator: `814` = js.native
  var createCard: `815` = js.native
  var createColumn: `816` = js.native
  var createForAuthenticatedUser: `817` = js.native
  var createForOrg: `818` = js.native
  var createForRepo: `819` = js.native
  var delete: `820` = js.native
  var deleteCard: `821` = js.native
  var deleteColumn: `822` = js.native
  var get: `823` = js.native
  var getCard: `824` = js.native
  var getColumn: `825` = js.native
  var getPermissionForUser: `826` = js.native
  var listCards: `827` = js.native
  var listCollaborators: `828` = js.native
  var listColumns: `829` = js.native
  var listForOrg: `830` = js.native
  var listForRepo: `831` = js.native
  var listForUser: `832` = js.native
  var moveCard: `833` = js.native
  var moveColumn: `834` = js.native
  var removeCollaborator: `835` = js.native
  var update: `836` = js.native
  var updateCard: `837` = js.native
  var updateColumn: `838` = js.native
}

object CreateCard {
  @scala.inline
  def apply(
    addCollaborator: `814`,
    createCard: `815`,
    createColumn: `816`,
    createForAuthenticatedUser: `817`,
    createForOrg: `818`,
    createForRepo: `819`,
    delete: `820`,
    deleteCard: `821`,
    deleteColumn: `822`,
    get: `823`,
    getCard: `824`,
    getColumn: `825`,
    getPermissionForUser: `826`,
    listCards: `827`,
    listCollaborators: `828`,
    listColumns: `829`,
    listForOrg: `830`,
    listForRepo: `831`,
    listForUser: `832`,
    moveCard: `833`,
    moveColumn: `834`,
    removeCollaborator: `835`,
    update: `836`,
    updateCard: `837`,
    updateColumn: `838`
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
    def setAddCollaborator(value: `814`): Self = this.set("addCollaborator", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateCard(value: `815`): Self = this.set("createCard", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateColumn(value: `816`): Self = this.set("createColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateForAuthenticatedUser(value: `817`): Self = this.set("createForAuthenticatedUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateForOrg(value: `818`): Self = this.set("createForOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateForRepo(value: `819`): Self = this.set("createForRepo", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: `820`): Self = this.set("delete", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteCard(value: `821`): Self = this.set("deleteCard", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteColumn(value: `822`): Self = this.set("deleteColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet(value: `823`): Self = this.set("get", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetCard(value: `824`): Self = this.set("getCard", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetColumn(value: `825`): Self = this.set("getColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetPermissionForUser(value: `826`): Self = this.set("getPermissionForUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setListCards(value: `827`): Self = this.set("listCards", value.asInstanceOf[js.Any])
    @scala.inline
    def setListCollaborators(value: `828`): Self = this.set("listCollaborators", value.asInstanceOf[js.Any])
    @scala.inline
    def setListColumns(value: `829`): Self = this.set("listColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def setListForOrg(value: `830`): Self = this.set("listForOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setListForRepo(value: `831`): Self = this.set("listForRepo", value.asInstanceOf[js.Any])
    @scala.inline
    def setListForUser(value: `832`): Self = this.set("listForUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setMoveCard(value: `833`): Self = this.set("moveCard", value.asInstanceOf[js.Any])
    @scala.inline
    def setMoveColumn(value: `834`): Self = this.set("moveColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveCollaborator(value: `835`): Self = this.set("removeCollaborator", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: `836`): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateCard(value: `837`): Self = this.set("updateCard", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateColumn(value: `838`): Self = this.set("updateColumn", value.asInstanceOf[js.Any])
  }
  
}

