package typings.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRepoSubscription extends js.Object {
  var checkRepoIsStarredByAuthenticatedUser: `586` = js.native
  var deleteRepoSubscription: `587` = js.native
  var deleteThreadSubscription: `588` = js.native
  var getFeeds: `589` = js.native
  var getRepoSubscription: `590` = js.native
  var getThread: `591` = js.native
  var getThreadSubscriptionForAuthenticatedUser: `592` = js.native
  var listEventsForAuthenticatedUser: `593` = js.native
  var listNotificationsForAuthenticatedUser: `594` = js.native
  var listOrgEventsForAuthenticatedUser: `595` = js.native
  var listPublicEvents: `596` = js.native
  var listPublicEventsForRepoNetwork: `597` = js.native
  var listPublicEventsForUser: `598` = js.native
  var listPublicOrgEvents: `599` = js.native
  var listReceivedEventsForUser: `600` = js.native
  var listReceivedPublicEventsForUser: `601` = js.native
  var listRepoEvents: `602` = js.native
  var listRepoNotificationsForAuthenticatedUser: `603` = js.native
  var listReposStarredByAuthenticatedUser: `604` = js.native
  var listReposStarredByUser: `605` = js.native
  var listReposWatchedByUser: `606` = js.native
  var listStargazersForRepo: `607` = js.native
  var listWatchedReposForAuthenticatedUser: `608` = js.native
  var listWatchersForRepo: `609` = js.native
  var markNotificationsAsRead: `610` = js.native
  var markRepoNotificationsAsRead: `611` = js.native
  var markThreadAsRead: `612` = js.native
  var setRepoSubscription: `613` = js.native
  var setThreadSubscription: `614` = js.native
  var starRepoForAuthenticatedUser: `615` = js.native
  var unstarRepoForAuthenticatedUser: `616` = js.native
}

object DeleteRepoSubscription {
  @scala.inline
  def apply(
    checkRepoIsStarredByAuthenticatedUser: `586`,
    deleteRepoSubscription: `587`,
    deleteThreadSubscription: `588`,
    getFeeds: `589`,
    getRepoSubscription: `590`,
    getThread: `591`,
    getThreadSubscriptionForAuthenticatedUser: `592`,
    listEventsForAuthenticatedUser: `593`,
    listNotificationsForAuthenticatedUser: `594`,
    listOrgEventsForAuthenticatedUser: `595`,
    listPublicEvents: `596`,
    listPublicEventsForRepoNetwork: `597`,
    listPublicEventsForUser: `598`,
    listPublicOrgEvents: `599`,
    listReceivedEventsForUser: `600`,
    listReceivedPublicEventsForUser: `601`,
    listRepoEvents: `602`,
    listRepoNotificationsForAuthenticatedUser: `603`,
    listReposStarredByAuthenticatedUser: `604`,
    listReposStarredByUser: `605`,
    listReposWatchedByUser: `606`,
    listStargazersForRepo: `607`,
    listWatchedReposForAuthenticatedUser: `608`,
    listWatchersForRepo: `609`,
    markNotificationsAsRead: `610`,
    markRepoNotificationsAsRead: `611`,
    markThreadAsRead: `612`,
    setRepoSubscription: `613`,
    setThreadSubscription: `614`,
    starRepoForAuthenticatedUser: `615`,
    unstarRepoForAuthenticatedUser: `616`
  ): DeleteRepoSubscription = {
    val __obj = js.Dynamic.literal(checkRepoIsStarredByAuthenticatedUser = checkRepoIsStarredByAuthenticatedUser.asInstanceOf[js.Any], deleteRepoSubscription = deleteRepoSubscription.asInstanceOf[js.Any], deleteThreadSubscription = deleteThreadSubscription.asInstanceOf[js.Any], getFeeds = getFeeds.asInstanceOf[js.Any], getRepoSubscription = getRepoSubscription.asInstanceOf[js.Any], getThread = getThread.asInstanceOf[js.Any], getThreadSubscriptionForAuthenticatedUser = getThreadSubscriptionForAuthenticatedUser.asInstanceOf[js.Any], listEventsForAuthenticatedUser = listEventsForAuthenticatedUser.asInstanceOf[js.Any], listNotificationsForAuthenticatedUser = listNotificationsForAuthenticatedUser.asInstanceOf[js.Any], listOrgEventsForAuthenticatedUser = listOrgEventsForAuthenticatedUser.asInstanceOf[js.Any], listPublicEvents = listPublicEvents.asInstanceOf[js.Any], listPublicEventsForRepoNetwork = listPublicEventsForRepoNetwork.asInstanceOf[js.Any], listPublicEventsForUser = listPublicEventsForUser.asInstanceOf[js.Any], listPublicOrgEvents = listPublicOrgEvents.asInstanceOf[js.Any], listReceivedEventsForUser = listReceivedEventsForUser.asInstanceOf[js.Any], listReceivedPublicEventsForUser = listReceivedPublicEventsForUser.asInstanceOf[js.Any], listRepoEvents = listRepoEvents.asInstanceOf[js.Any], listRepoNotificationsForAuthenticatedUser = listRepoNotificationsForAuthenticatedUser.asInstanceOf[js.Any], listReposStarredByAuthenticatedUser = listReposStarredByAuthenticatedUser.asInstanceOf[js.Any], listReposStarredByUser = listReposStarredByUser.asInstanceOf[js.Any], listReposWatchedByUser = listReposWatchedByUser.asInstanceOf[js.Any], listStargazersForRepo = listStargazersForRepo.asInstanceOf[js.Any], listWatchedReposForAuthenticatedUser = listWatchedReposForAuthenticatedUser.asInstanceOf[js.Any], listWatchersForRepo = listWatchersForRepo.asInstanceOf[js.Any], markNotificationsAsRead = markNotificationsAsRead.asInstanceOf[js.Any], markRepoNotificationsAsRead = markRepoNotificationsAsRead.asInstanceOf[js.Any], markThreadAsRead = markThreadAsRead.asInstanceOf[js.Any], setRepoSubscription = setRepoSubscription.asInstanceOf[js.Any], setThreadSubscription = setThreadSubscription.asInstanceOf[js.Any], starRepoForAuthenticatedUser = starRepoForAuthenticatedUser.asInstanceOf[js.Any], unstarRepoForAuthenticatedUser = unstarRepoForAuthenticatedUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRepoSubscription]
  }
  @scala.inline
  implicit class DeleteRepoSubscriptionOps[Self <: DeleteRepoSubscription] (val x: Self) extends AnyVal {
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
    def setCheckRepoIsStarredByAuthenticatedUser(value: `586`): Self = this.set("checkRepoIsStarredByAuthenticatedUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteRepoSubscription(value: `587`): Self = this.set("deleteRepoSubscription", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteThreadSubscription(value: `588`): Self = this.set("deleteThreadSubscription", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetFeeds(value: `589`): Self = this.set("getFeeds", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetRepoSubscription(value: `590`): Self = this.set("getRepoSubscription", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetThread(value: `591`): Self = this.set("getThread", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetThreadSubscriptionForAuthenticatedUser(value: `592`): Self = this.set("getThreadSubscriptionForAuthenticatedUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setListEventsForAuthenticatedUser(value: `593`): Self = this.set("listEventsForAuthenticatedUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setListNotificationsForAuthenticatedUser(value: `594`): Self = this.set("listNotificationsForAuthenticatedUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setListOrgEventsForAuthenticatedUser(value: `595`): Self = this.set("listOrgEventsForAuthenticatedUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setListPublicEvents(value: `596`): Self = this.set("listPublicEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def setListPublicEventsForRepoNetwork(value: `597`): Self = this.set("listPublicEventsForRepoNetwork", value.asInstanceOf[js.Any])
    @scala.inline
    def setListPublicEventsForUser(value: `598`): Self = this.set("listPublicEventsForUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setListPublicOrgEvents(value: `599`): Self = this.set("listPublicOrgEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def setListReceivedEventsForUser(value: `600`): Self = this.set("listReceivedEventsForUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setListReceivedPublicEventsForUser(value: `601`): Self = this.set("listReceivedPublicEventsForUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setListRepoEvents(value: `602`): Self = this.set("listRepoEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def setListRepoNotificationsForAuthenticatedUser(value: `603`): Self = this.set("listRepoNotificationsForAuthenticatedUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setListReposStarredByAuthenticatedUser(value: `604`): Self = this.set("listReposStarredByAuthenticatedUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setListReposStarredByUser(value: `605`): Self = this.set("listReposStarredByUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setListReposWatchedByUser(value: `606`): Self = this.set("listReposWatchedByUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setListStargazersForRepo(value: `607`): Self = this.set("listStargazersForRepo", value.asInstanceOf[js.Any])
    @scala.inline
    def setListWatchedReposForAuthenticatedUser(value: `608`): Self = this.set("listWatchedReposForAuthenticatedUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setListWatchersForRepo(value: `609`): Self = this.set("listWatchersForRepo", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkNotificationsAsRead(value: `610`): Self = this.set("markNotificationsAsRead", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkRepoNotificationsAsRead(value: `611`): Self = this.set("markRepoNotificationsAsRead", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkThreadAsRead(value: `612`): Self = this.set("markThreadAsRead", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetRepoSubscription(value: `613`): Self = this.set("setRepoSubscription", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetThreadSubscription(value: `614`): Self = this.set("setThreadSubscription", value.asInstanceOf[js.Any])
    @scala.inline
    def setStarRepoForAuthenticatedUser(value: `615`): Self = this.set("starRepoForAuthenticatedUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnstarRepoForAuthenticatedUser(value: `616`): Self = this.set("unstarRepoForAuthenticatedUser", value.asInstanceOf[js.Any])
  }
  
}

