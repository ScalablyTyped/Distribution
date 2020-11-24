package typings.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteRepoSubscription extends js.Object {
  
  var checkRepoIsStarredByAuthenticatedUser: `589` = js.native
  
  var deleteRepoSubscription: `590` = js.native
  
  var deleteThreadSubscription: `591` = js.native
  
  var getFeeds: `592` = js.native
  
  var getRepoSubscription: `593` = js.native
  
  var getThread: `594` = js.native
  
  var getThreadSubscriptionForAuthenticatedUser: `595` = js.native
  
  var listEventsForAuthenticatedUser: `596` = js.native
  
  var listNotificationsForAuthenticatedUser: `597` = js.native
  
  var listOrgEventsForAuthenticatedUser: `598` = js.native
  
  var listPublicEvents: `599` = js.native
  
  var listPublicEventsForRepoNetwork: `600` = js.native
  
  var listPublicEventsForUser: `601` = js.native
  
  var listPublicOrgEvents: `602` = js.native
  
  var listReceivedEventsForUser: `603` = js.native
  
  var listReceivedPublicEventsForUser: `604` = js.native
  
  var listRepoEvents: `605` = js.native
  
  var listRepoNotificationsForAuthenticatedUser: `606` = js.native
  
  var listReposStarredByAuthenticatedUser: `607` = js.native
  
  var listReposStarredByUser: `608` = js.native
  
  var listReposWatchedByUser: `609` = js.native
  
  var listStargazersForRepo: `610` = js.native
  
  var listWatchedReposForAuthenticatedUser: `611` = js.native
  
  var listWatchersForRepo: `612` = js.native
  
  var markNotificationsAsRead: `613` = js.native
  
  var markRepoNotificationsAsRead: `614` = js.native
  
  var markThreadAsRead: `615` = js.native
  
  var setRepoSubscription: `616` = js.native
  
  var setThreadSubscription: `617` = js.native
  
  var starRepoForAuthenticatedUser: `618` = js.native
  
  var unstarRepoForAuthenticatedUser: `619` = js.native
}
object DeleteRepoSubscription {
  
  @scala.inline
  def apply(
    checkRepoIsStarredByAuthenticatedUser: `589`,
    deleteRepoSubscription: `590`,
    deleteThreadSubscription: `591`,
    getFeeds: `592`,
    getRepoSubscription: `593`,
    getThread: `594`,
    getThreadSubscriptionForAuthenticatedUser: `595`,
    listEventsForAuthenticatedUser: `596`,
    listNotificationsForAuthenticatedUser: `597`,
    listOrgEventsForAuthenticatedUser: `598`,
    listPublicEvents: `599`,
    listPublicEventsForRepoNetwork: `600`,
    listPublicEventsForUser: `601`,
    listPublicOrgEvents: `602`,
    listReceivedEventsForUser: `603`,
    listReceivedPublicEventsForUser: `604`,
    listRepoEvents: `605`,
    listRepoNotificationsForAuthenticatedUser: `606`,
    listReposStarredByAuthenticatedUser: `607`,
    listReposStarredByUser: `608`,
    listReposWatchedByUser: `609`,
    listStargazersForRepo: `610`,
    listWatchedReposForAuthenticatedUser: `611`,
    listWatchersForRepo: `612`,
    markNotificationsAsRead: `613`,
    markRepoNotificationsAsRead: `614`,
    markThreadAsRead: `615`,
    setRepoSubscription: `616`,
    setThreadSubscription: `617`,
    starRepoForAuthenticatedUser: `618`,
    unstarRepoForAuthenticatedUser: `619`
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
    def setCheckRepoIsStarredByAuthenticatedUser(value: `589`): Self = this.set("checkRepoIsStarredByAuthenticatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteRepoSubscription(value: `590`): Self = this.set("deleteRepoSubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteThreadSubscription(value: `591`): Self = this.set("deleteThreadSubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFeeds(value: `592`): Self = this.set("getFeeds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetRepoSubscription(value: `593`): Self = this.set("getRepoSubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetThread(value: `594`): Self = this.set("getThread", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetThreadSubscriptionForAuthenticatedUser(value: `595`): Self = this.set("getThreadSubscriptionForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListEventsForAuthenticatedUser(value: `596`): Self = this.set("listEventsForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListNotificationsForAuthenticatedUser(value: `597`): Self = this.set("listNotificationsForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListOrgEventsForAuthenticatedUser(value: `598`): Self = this.set("listOrgEventsForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListPublicEvents(value: `599`): Self = this.set("listPublicEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListPublicEventsForRepoNetwork(value: `600`): Self = this.set("listPublicEventsForRepoNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListPublicEventsForUser(value: `601`): Self = this.set("listPublicEventsForUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListPublicOrgEvents(value: `602`): Self = this.set("listPublicOrgEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListReceivedEventsForUser(value: `603`): Self = this.set("listReceivedEventsForUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListReceivedPublicEventsForUser(value: `604`): Self = this.set("listReceivedPublicEventsForUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListRepoEvents(value: `605`): Self = this.set("listRepoEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListRepoNotificationsForAuthenticatedUser(value: `606`): Self = this.set("listRepoNotificationsForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListReposStarredByAuthenticatedUser(value: `607`): Self = this.set("listReposStarredByAuthenticatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListReposStarredByUser(value: `608`): Self = this.set("listReposStarredByUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListReposWatchedByUser(value: `609`): Self = this.set("listReposWatchedByUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListStargazersForRepo(value: `610`): Self = this.set("listStargazersForRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListWatchedReposForAuthenticatedUser(value: `611`): Self = this.set("listWatchedReposForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListWatchersForRepo(value: `612`): Self = this.set("listWatchersForRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkNotificationsAsRead(value: `613`): Self = this.set("markNotificationsAsRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkRepoNotificationsAsRead(value: `614`): Self = this.set("markRepoNotificationsAsRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkThreadAsRead(value: `615`): Self = this.set("markThreadAsRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetRepoSubscription(value: `616`): Self = this.set("setRepoSubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetThreadSubscription(value: `617`): Self = this.set("setThreadSubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarRepoForAuthenticatedUser(value: `618`): Self = this.set("starRepoForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnstarRepoForAuthenticatedUser(value: `619`): Self = this.set("unstarRepoForAuthenticatedUser", value.asInstanceOf[js.Any])
  }
}
