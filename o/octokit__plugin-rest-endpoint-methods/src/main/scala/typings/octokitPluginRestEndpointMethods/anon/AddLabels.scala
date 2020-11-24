package typings.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddLabels extends js.Object {
  
  var addAssignees: `718` = js.native
  
  var addLabels: `719` = js.native
  
  var checkUserCanBeAssigned: `720` = js.native
  
  var create: `721` = js.native
  
  var createComment: `722` = js.native
  
  var createLabel: `723` = js.native
  
  var createMilestone: `724` = js.native
  
  var deleteComment: `725` = js.native
  
  var deleteLabel: `726` = js.native
  
  var deleteMilestone: `727` = js.native
  
  var get: `728` = js.native
  
  var getComment: `729` = js.native
  
  var getEvent: `730` = js.native
  
  var getLabel: `731` = js.native
  
  var getMilestone: `732` = js.native
  
  var list: `733` = js.native
  
  var listAssignees: `734` = js.native
  
  var listComments: `735` = js.native
  
  var listCommentsForRepo: `736` = js.native
  
  var listEvents: `737` = js.native
  
  var listEventsForRepo: `738` = js.native
  
  var listEventsForTimeline: `739` = js.native
  
  var listForAuthenticatedUser: `740` = js.native
  
  var listForOrg: `741` = js.native
  
  var listForRepo: `742` = js.native
  
  var listLabelsForMilestone: `743` = js.native
  
  var listLabelsForRepo: `744` = js.native
  
  var listLabelsOnIssue: `745` = js.native
  
  var listMilestones: `746` = js.native
  
  var lock: `747` = js.native
  
  var removeAllLabels: `748` = js.native
  
  var removeAssignees: `749` = js.native
  
  var removeLabel: `750` = js.native
  
  var setLabels: `751` = js.native
  
  var unlock: `752` = js.native
  
  var update: `753` = js.native
  
  var updateComment: `754` = js.native
  
  var updateLabel: `755` = js.native
  
  var updateMilestone: `756` = js.native
}
object AddLabels {
  
  @scala.inline
  def apply(
    addAssignees: `718`,
    addLabels: `719`,
    checkUserCanBeAssigned: `720`,
    create: `721`,
    createComment: `722`,
    createLabel: `723`,
    createMilestone: `724`,
    deleteComment: `725`,
    deleteLabel: `726`,
    deleteMilestone: `727`,
    get: `728`,
    getComment: `729`,
    getEvent: `730`,
    getLabel: `731`,
    getMilestone: `732`,
    list: `733`,
    listAssignees: `734`,
    listComments: `735`,
    listCommentsForRepo: `736`,
    listEvents: `737`,
    listEventsForRepo: `738`,
    listEventsForTimeline: `739`,
    listForAuthenticatedUser: `740`,
    listForOrg: `741`,
    listForRepo: `742`,
    listLabelsForMilestone: `743`,
    listLabelsForRepo: `744`,
    listLabelsOnIssue: `745`,
    listMilestones: `746`,
    lock: `747`,
    removeAllLabels: `748`,
    removeAssignees: `749`,
    removeLabel: `750`,
    setLabels: `751`,
    unlock: `752`,
    update: `753`,
    updateComment: `754`,
    updateLabel: `755`,
    updateMilestone: `756`
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
    def setAddAssignees(value: `718`): Self = this.set("addAssignees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddLabels(value: `719`): Self = this.set("addLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckUserCanBeAssigned(value: `720`): Self = this.set("checkUserCanBeAssigned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreate(value: `721`): Self = this.set("create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateComment(value: `722`): Self = this.set("createComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateLabel(value: `723`): Self = this.set("createLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateMilestone(value: `724`): Self = this.set("createMilestone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteComment(value: `725`): Self = this.set("deleteComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteLabel(value: `726`): Self = this.set("deleteLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteMilestone(value: `727`): Self = this.set("deleteMilestone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: `728`): Self = this.set("get", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetComment(value: `729`): Self = this.set("getComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetEvent(value: `730`): Self = this.set("getEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetLabel(value: `731`): Self = this.set("getLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetMilestone(value: `732`): Self = this.set("getMilestone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setList(value: `733`): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListAssignees(value: `734`): Self = this.set("listAssignees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListComments(value: `735`): Self = this.set("listComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListCommentsForRepo(value: `736`): Self = this.set("listCommentsForRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListEvents(value: `737`): Self = this.set("listEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListEventsForRepo(value: `738`): Self = this.set("listEventsForRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListEventsForTimeline(value: `739`): Self = this.set("listEventsForTimeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListForAuthenticatedUser(value: `740`): Self = this.set("listForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListForOrg(value: `741`): Self = this.set("listForOrg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListForRepo(value: `742`): Self = this.set("listForRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListLabelsForMilestone(value: `743`): Self = this.set("listLabelsForMilestone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListLabelsForRepo(value: `744`): Self = this.set("listLabelsForRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListLabelsOnIssue(value: `745`): Self = this.set("listLabelsOnIssue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListMilestones(value: `746`): Self = this.set("listMilestones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLock(value: `747`): Self = this.set("lock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveAllLabels(value: `748`): Self = this.set("removeAllLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveAssignees(value: `749`): Self = this.set("removeAssignees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveLabel(value: `750`): Self = this.set("removeLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetLabels(value: `751`): Self = this.set("setLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnlock(value: `752`): Self = this.set("unlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: `753`): Self = this.set("update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateComment(value: `754`): Self = this.set("updateComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateLabel(value: `755`): Self = this.set("updateLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMilestone(value: `756`): Self = this.set("updateMilestone", value.asInstanceOf[js.Any])
  }
}
