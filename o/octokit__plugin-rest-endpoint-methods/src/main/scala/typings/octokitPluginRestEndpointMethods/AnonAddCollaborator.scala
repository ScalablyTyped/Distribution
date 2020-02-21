package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddCollaborator extends js.Object {
  var addCollaborator: AnonHeadersMethodParamsUrlAnonAcceptAnonPermission
  var createCard: AnonHeadersMethodParamsUrlAnonAcceptAnonColumnid
  var createColumn: AnonHeadersMethodParamsUrlAnonAcceptAnonNameProjectid
  var createForAuthenticatedUser: AnonHeadersMethodParamsUrlAnonAcceptAnonBodyName
  var createForOrg: AnonHeadersMethodParamsUrlAnonAcceptAnonBodyNameOrg
  var createForRepo: AnonHeadersMethodParamsUrlAnonAcceptAnonBodyNameOwner
  var delete: AnonHeadersMethodParamsUrlAnonAcceptAnonProjectid
  var deleteCard: AnonHeadersMethodParamsUrlAnonAcceptAnonCardid
  var deleteColumn: AnonHeadersMethodParamsUrlAnonAcceptAnonColumnidAnonRequired
  var get: AnonHeadersMethodParamsUrlAnonAcceptAnonProjectid
  var getCard: AnonHeadersMethodParamsUrlAnonAcceptAnonCardid
  var getColumn: AnonHeadersMethodParamsUrlAnonAcceptAnonColumnidAnonRequired
  var listCards: AnonHeadersMethodParamsUrlAnonAcceptAnonArchivedstate
  var listCollaborators: AnonHeadersMethodParamsUrlAnonAcceptAnonAffiliation
  var listColumns: AnonHeadersMethodParamsUrlAnonAcceptAnonPagePerpageProjectid
  var listForOrg: AnonHeadersMethodParamsUrlAnonAcceptAnonOrgPagePerpage
  var listForRepo: AnonHeadersMethodParamsUrlAnonAcceptAnonOwnerPagePerpageRepo
  var listForUser: AnonHeadersMethodParamsUrlAnonAcceptAnonPagePerpageStateUsername
  var moveCard: AnonHeadersMethodParamsUrlAnonAcceptAnonCardidColumnid
  var moveColumn: AnonHeadersMethodParamsUrlAnonAcceptAnonColumnidPosition
  var removeCollaborator: AnonHeadersMethodParamsUrlAnonAcceptAnonProjectidUsername
  var reviewUserPermissionLevel: AnonHeadersMethodParamsUrlAnonAcceptAnonProjectidUsername
  var update: AnonHeadersMethodParamsUrlAnonAcceptAnonBodyNameOrganizationpermission
  var updateCard: AnonHeadersMethodParamsUrlAnonAcceptAnonArchived
  var updateColumn: AnonHeadersMethodParamsUrlAnonAcceptAnonColumnidName
}

object AnonAddCollaborator {
  @scala.inline
  def apply(
    addCollaborator: AnonHeadersMethodParamsUrlAnonAcceptAnonPermission,
    createCard: AnonHeadersMethodParamsUrlAnonAcceptAnonColumnid,
    createColumn: AnonHeadersMethodParamsUrlAnonAcceptAnonNameProjectid,
    createForAuthenticatedUser: AnonHeadersMethodParamsUrlAnonAcceptAnonBodyName,
    createForOrg: AnonHeadersMethodParamsUrlAnonAcceptAnonBodyNameOrg,
    createForRepo: AnonHeadersMethodParamsUrlAnonAcceptAnonBodyNameOwner,
    delete: AnonHeadersMethodParamsUrlAnonAcceptAnonProjectid,
    deleteCard: AnonHeadersMethodParamsUrlAnonAcceptAnonCardid,
    deleteColumn: AnonHeadersMethodParamsUrlAnonAcceptAnonColumnidAnonRequired,
    get: AnonHeadersMethodParamsUrlAnonAcceptAnonProjectid,
    getCard: AnonHeadersMethodParamsUrlAnonAcceptAnonCardid,
    getColumn: AnonHeadersMethodParamsUrlAnonAcceptAnonColumnidAnonRequired,
    listCards: AnonHeadersMethodParamsUrlAnonAcceptAnonArchivedstate,
    listCollaborators: AnonHeadersMethodParamsUrlAnonAcceptAnonAffiliation,
    listColumns: AnonHeadersMethodParamsUrlAnonAcceptAnonPagePerpageProjectid,
    listForOrg: AnonHeadersMethodParamsUrlAnonAcceptAnonOrgPagePerpage,
    listForRepo: AnonHeadersMethodParamsUrlAnonAcceptAnonOwnerPagePerpageRepo,
    listForUser: AnonHeadersMethodParamsUrlAnonAcceptAnonPagePerpageStateUsername,
    moveCard: AnonHeadersMethodParamsUrlAnonAcceptAnonCardidColumnid,
    moveColumn: AnonHeadersMethodParamsUrlAnonAcceptAnonColumnidPosition,
    removeCollaborator: AnonHeadersMethodParamsUrlAnonAcceptAnonProjectidUsername,
    reviewUserPermissionLevel: AnonHeadersMethodParamsUrlAnonAcceptAnonProjectidUsername,
    update: AnonHeadersMethodParamsUrlAnonAcceptAnonBodyNameOrganizationpermission,
    updateCard: AnonHeadersMethodParamsUrlAnonAcceptAnonArchived,
    updateColumn: AnonHeadersMethodParamsUrlAnonAcceptAnonColumnidName
  ): AnonAddCollaborator = {
    val __obj = js.Dynamic.literal(addCollaborator = addCollaborator.asInstanceOf[js.Any], createCard = createCard.asInstanceOf[js.Any], createColumn = createColumn.asInstanceOf[js.Any], createForAuthenticatedUser = createForAuthenticatedUser.asInstanceOf[js.Any], createForOrg = createForOrg.asInstanceOf[js.Any], createForRepo = createForRepo.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], deleteCard = deleteCard.asInstanceOf[js.Any], deleteColumn = deleteColumn.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getCard = getCard.asInstanceOf[js.Any], getColumn = getColumn.asInstanceOf[js.Any], listCards = listCards.asInstanceOf[js.Any], listCollaborators = listCollaborators.asInstanceOf[js.Any], listColumns = listColumns.asInstanceOf[js.Any], listForOrg = listForOrg.asInstanceOf[js.Any], listForRepo = listForRepo.asInstanceOf[js.Any], listForUser = listForUser.asInstanceOf[js.Any], moveCard = moveCard.asInstanceOf[js.Any], moveColumn = moveColumn.asInstanceOf[js.Any], removeCollaborator = removeCollaborator.asInstanceOf[js.Any], reviewUserPermissionLevel = reviewUserPermissionLevel.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateCard = updateCard.asInstanceOf[js.Any], updateColumn = updateColumn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAddCollaborator]
  }
}

