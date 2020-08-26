package typings.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddLabels extends js.Object {
  var addAssignees: `712` = js.native
  var addLabels: `713` = js.native
  var checkUserCanBeAssigned: `714` = js.native
  var create: `715` = js.native
  var createComment: `716` = js.native
  var createLabel: `717` = js.native
  var createMilestone: `718` = js.native
  var deleteComment: `719` = js.native
  var deleteLabel: `720` = js.native
  var deleteMilestone: `721` = js.native
  var get: `722` = js.native
  var getComment: `723` = js.native
  var getEvent: `724` = js.native
  var getLabel: `725` = js.native
  var getMilestone: `726` = js.native
  var list: `727` = js.native
  var listAssignees: `728` = js.native
  var listComments: `729` = js.native
  var listCommentsForRepo: `730` = js.native
  var listEvents: `731` = js.native
  var listEventsForRepo: `732` = js.native
  var listEventsForTimeline: `733` = js.native
  var listForAuthenticatedUser: `734` = js.native
  var listForOrg: `735` = js.native
  var listForRepo: `736` = js.native
  var listLabelsForMilestone: `737` = js.native
  var listLabelsForRepo: `738` = js.native
  var listLabelsOnIssue: `739` = js.native
  var listMilestones: `740` = js.native
  var lock: `741` = js.native
  var removeAllLabels: `742` = js.native
  var removeAssignees: `743` = js.native
  var removeLabel: `744` = js.native
  var setLabels: `745` = js.native
  var unlock: `746` = js.native
  var update: `747` = js.native
  var updateComment: `748` = js.native
  var updateLabel: `749` = js.native
  var updateMilestone: `750` = js.native
}

object AddLabels {
  @scala.inline
  def apply(
    addAssignees: `712`,
    addLabels: `713`,
    checkUserCanBeAssigned: `714`,
    create: `715`,
    createComment: `716`,
    createLabel: `717`,
    createMilestone: `718`,
    deleteComment: `719`,
    deleteLabel: `720`,
    deleteMilestone: `721`,
    get: `722`,
    getComment: `723`,
    getEvent: `724`,
    getLabel: `725`,
    getMilestone: `726`,
    list: `727`,
    listAssignees: `728`,
    listComments: `729`,
    listCommentsForRepo: `730`,
    listEvents: `731`,
    listEventsForRepo: `732`,
    listEventsForTimeline: `733`,
    listForAuthenticatedUser: `734`,
    listForOrg: `735`,
    listForRepo: `736`,
    listLabelsForMilestone: `737`,
    listLabelsForRepo: `738`,
    listLabelsOnIssue: `739`,
    listMilestones: `740`,
    lock: `741`,
    removeAllLabels: `742`,
    removeAssignees: `743`,
    removeLabel: `744`,
    setLabels: `745`,
    unlock: `746`,
    update: `747`,
    updateComment: `748`,
    updateLabel: `749`,
    updateMilestone: `750`
  ): AddLabels = {
    val __obj = js.Dynamic.literal(addAssignees = addAssignees.asInstanceOf[js.Any], addLabels = addLabels.asInstanceOf[js.Any], checkUserCanBeAssigned = checkUserCanBeAssigned.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], createComment = createComment.asInstanceOf[js.Any], createLabel = createLabel.asInstanceOf[js.Any], createMilestone = createMilestone.asInstanceOf[js.Any], deleteComment = deleteComment.asInstanceOf[js.Any], deleteLabel = deleteLabel.asInstanceOf[js.Any], deleteMilestone = deleteMilestone.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getComment = getComment.asInstanceOf[js.Any], getEvent = getEvent.asInstanceOf[js.Any], getLabel = getLabel.asInstanceOf[js.Any], getMilestone = getMilestone.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listAssignees = listAssignees.asInstanceOf[js.Any], listComments = listComments.asInstanceOf[js.Any], listCommentsForRepo = listCommentsForRepo.asInstanceOf[js.Any], listEvents = listEvents.asInstanceOf[js.Any], listEventsForRepo = listEventsForRepo.asInstanceOf[js.Any], listEventsForTimeline = listEventsForTimeline.asInstanceOf[js.Any], listForAuthenticatedUser = listForAuthenticatedUser.asInstanceOf[js.Any], listForOrg = listForOrg.asInstanceOf[js.Any], listForRepo = listForRepo.asInstanceOf[js.Any], listLabelsForMilestone = listLabelsForMilestone.asInstanceOf[js.Any], listLabelsForRepo = listLabelsForRepo.asInstanceOf[js.Any], listLabelsOnIssue = listLabelsOnIssue.asInstanceOf[js.Any], listMilestones = listMilestones.asInstanceOf[js.Any], lock = lock.asInstanceOf[js.Any], removeAllLabels = removeAllLabels.asInstanceOf[js.Any], removeAssignees = removeAssignees.asInstanceOf[js.Any], removeLabel = removeLabel.asInstanceOf[js.Any], setLabels = setLabels.asInstanceOf[js.Any], unlock = unlock.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateComment = updateComment.asInstanceOf[js.Any], updateLabel = updateLabel.asInstanceOf[js.Any], updateMilestone = updateMilestone.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddLabels]
  }
  @scala.inline
  implicit class AddLabelsOps[Self <: AddLabels] (val x: Self) extends AnyVal {
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
    def setAddAssignees(value: `712`): Self = this.set("addAssignees", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddLabels(value: `713`): Self = this.set("addLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckUserCanBeAssigned(value: `714`): Self = this.set("checkUserCanBeAssigned", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreate(value: `715`): Self = this.set("create", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateComment(value: `716`): Self = this.set("createComment", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateLabel(value: `717`): Self = this.set("createLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateMilestone(value: `718`): Self = this.set("createMilestone", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteComment(value: `719`): Self = this.set("deleteComment", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteLabel(value: `720`): Self = this.set("deleteLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteMilestone(value: `721`): Self = this.set("deleteMilestone", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet(value: `722`): Self = this.set("get", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetComment(value: `723`): Self = this.set("getComment", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetEvent(value: `724`): Self = this.set("getEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetLabel(value: `725`): Self = this.set("getLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetMilestone(value: `726`): Self = this.set("getMilestone", value.asInstanceOf[js.Any])
    @scala.inline
    def setList(value: `727`): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def setListAssignees(value: `728`): Self = this.set("listAssignees", value.asInstanceOf[js.Any])
    @scala.inline
    def setListComments(value: `729`): Self = this.set("listComments", value.asInstanceOf[js.Any])
    @scala.inline
    def setListCommentsForRepo(value: `730`): Self = this.set("listCommentsForRepo", value.asInstanceOf[js.Any])
    @scala.inline
    def setListEvents(value: `731`): Self = this.set("listEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def setListEventsForRepo(value: `732`): Self = this.set("listEventsForRepo", value.asInstanceOf[js.Any])
    @scala.inline
    def setListEventsForTimeline(value: `733`): Self = this.set("listEventsForTimeline", value.asInstanceOf[js.Any])
    @scala.inline
    def setListForAuthenticatedUser(value: `734`): Self = this.set("listForAuthenticatedUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setListForOrg(value: `735`): Self = this.set("listForOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setListForRepo(value: `736`): Self = this.set("listForRepo", value.asInstanceOf[js.Any])
    @scala.inline
    def setListLabelsForMilestone(value: `737`): Self = this.set("listLabelsForMilestone", value.asInstanceOf[js.Any])
    @scala.inline
    def setListLabelsForRepo(value: `738`): Self = this.set("listLabelsForRepo", value.asInstanceOf[js.Any])
    @scala.inline
    def setListLabelsOnIssue(value: `739`): Self = this.set("listLabelsOnIssue", value.asInstanceOf[js.Any])
    @scala.inline
    def setListMilestones(value: `740`): Self = this.set("listMilestones", value.asInstanceOf[js.Any])
    @scala.inline
    def setLock(value: `741`): Self = this.set("lock", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveAllLabels(value: `742`): Self = this.set("removeAllLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveAssignees(value: `743`): Self = this.set("removeAssignees", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveLabel(value: `744`): Self = this.set("removeLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetLabels(value: `745`): Self = this.set("setLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnlock(value: `746`): Self = this.set("unlock", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: `747`): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateComment(value: `748`): Self = this.set("updateComment", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateLabel(value: `749`): Self = this.set("updateLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateMilestone(value: `750`): Self = this.set("updateMilestone", value.asInstanceOf[js.Any])
  }
  
}

