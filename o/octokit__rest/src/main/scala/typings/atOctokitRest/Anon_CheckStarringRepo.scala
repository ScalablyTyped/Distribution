package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.ActivityCheckStarringRepoParams
import typings.atOctokitRest.atOctokitRestMod.ActivityDeleteRepoSubscriptionParams
import typings.atOctokitRest.atOctokitRestMod.ActivityDeleteRepoSubscriptionResponse
import typings.atOctokitRest.atOctokitRestMod.ActivityDeleteThreadSubscriptionParams
import typings.atOctokitRest.atOctokitRestMod.ActivityDeleteThreadSubscriptionResponse
import typings.atOctokitRest.atOctokitRestMod.ActivityGetRepoSubscriptionParams
import typings.atOctokitRest.atOctokitRestMod.ActivityGetThreadParams
import typings.atOctokitRest.atOctokitRestMod.ActivityGetThreadResponse
import typings.atOctokitRest.atOctokitRestMod.ActivityGetThreadSubscriptionParams
import typings.atOctokitRest.atOctokitRestMod.ActivityGetThreadSubscriptionResponse
import typings.atOctokitRest.atOctokitRestMod.ActivityListEventsForOrgParams
import typings.atOctokitRest.atOctokitRestMod.ActivityListEventsForUserParams
import typings.atOctokitRest.atOctokitRestMod.ActivityListFeedsResponse
import typings.atOctokitRest.atOctokitRestMod.ActivityListNotificationsForRepoParams
import typings.atOctokitRest.atOctokitRestMod.ActivityListNotificationsForRepoResponse
import typings.atOctokitRest.atOctokitRestMod.ActivityListNotificationsParams
import typings.atOctokitRest.atOctokitRestMod.ActivityListNotificationsResponse
import typings.atOctokitRest.atOctokitRestMod.ActivityListPublicEventsForOrgParams
import typings.atOctokitRest.atOctokitRestMod.ActivityListPublicEventsForRepoNetworkParams
import typings.atOctokitRest.atOctokitRestMod.ActivityListPublicEventsForUserParams
import typings.atOctokitRest.atOctokitRestMod.ActivityListPublicEventsParams
import typings.atOctokitRest.atOctokitRestMod.ActivityListReceivedEventsForUserParams
import typings.atOctokitRest.atOctokitRestMod.ActivityListReceivedPublicEventsForUserParams
import typings.atOctokitRest.atOctokitRestMod.ActivityListRepoEventsParams
import typings.atOctokitRest.atOctokitRestMod.ActivityListReposStarredByAuthenticatedUserParams
import typings.atOctokitRest.atOctokitRestMod.ActivityListReposStarredByAuthenticatedUserResponse
import typings.atOctokitRest.atOctokitRestMod.ActivityListReposStarredByUserParams
import typings.atOctokitRest.atOctokitRestMod.ActivityListReposStarredByUserResponse
import typings.atOctokitRest.atOctokitRestMod.ActivityListReposWatchedByUserParams
import typings.atOctokitRest.atOctokitRestMod.ActivityListReposWatchedByUserResponse
import typings.atOctokitRest.atOctokitRestMod.ActivityListStargazersForRepoParams
import typings.atOctokitRest.atOctokitRestMod.ActivityListStargazersForRepoResponse
import typings.atOctokitRest.atOctokitRestMod.ActivityListWatchedReposForAuthenticatedUserParams
import typings.atOctokitRest.atOctokitRestMod.ActivityListWatchedReposForAuthenticatedUserResponse
import typings.atOctokitRest.atOctokitRestMod.ActivityListWatchersForRepoParams
import typings.atOctokitRest.atOctokitRestMod.ActivityListWatchersForRepoResponse
import typings.atOctokitRest.atOctokitRestMod.ActivityMarkAsReadParams
import typings.atOctokitRest.atOctokitRestMod.ActivityMarkAsReadResponse
import typings.atOctokitRest.atOctokitRestMod.ActivityMarkNotificationsAsReadForRepoParams
import typings.atOctokitRest.atOctokitRestMod.ActivityMarkNotificationsAsReadForRepoResponse
import typings.atOctokitRest.atOctokitRestMod.ActivityMarkThreadAsReadParams
import typings.atOctokitRest.atOctokitRestMod.ActivityMarkThreadAsReadResponse
import typings.atOctokitRest.atOctokitRestMod.ActivitySetRepoSubscriptionParams
import typings.atOctokitRest.atOctokitRestMod.ActivitySetRepoSubscriptionResponse
import typings.atOctokitRest.atOctokitRestMod.ActivitySetThreadSubscriptionParams
import typings.atOctokitRest.atOctokitRestMod.ActivitySetThreadSubscriptionResponse
import typings.atOctokitRest.atOctokitRestMod.ActivityStarRepoParams
import typings.atOctokitRest.atOctokitRestMod.ActivityStarRepoResponse
import typings.atOctokitRest.atOctokitRestMod.ActivityUnstarRepoParams
import typings.atOctokitRest.atOctokitRestMod.ActivityUnstarRepoResponse
import typings.atOctokitRest.atOctokitRestMod.AnyResponse
import typings.atOctokitRest.atOctokitRestMod.EmptyParams
import typings.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CheckStarringRepo extends js.Object {
  /**
    * Requires for the user to be authenticated.
    */
  @JSName("checkStarringRepo")
  var checkStarringRepo_Original: Anon_EndpointParamsActivityCheckStarringRepoParams = js.native
  /**
    * This endpoint should only be used to stop watching a repository. To control whether or not you wish to receive notifications from a repository, [set the repository's subscription manually](https://developer.github.com/v3/activity/watching/#set-a-repository-subscription).
    */
  @JSName("deleteRepoSubscription")
  var deleteRepoSubscription_Original: Anon_EndpointParamsActivityDeleteRepoSubscriptionParams = js.native
  /**
    * Mutes all future notifications for a conversation until you comment on the thread or get **@mention**ed.
    */
  @JSName("deleteThreadSubscription")
  var deleteThreadSubscription_Original: Anon_EndpointParamsActivityDeleteThreadSubscriptionParams = js.native
  @JSName("getRepoSubscription")
  var getRepoSubscription_Original: Anon_EndpointParamsActivityGetRepoSubscriptionParams = js.native
  /**
    * This checks to see if the current user is subscribed to a thread. You can also [get a repository subscription](https://developer.github.com/v3/activity/watching/#get-a-repository-subscription).
    *
    * Note that subscriptions are only generated if a user is participating in a conversation--for example, they've replied to the thread, were **@mentioned**, or manually subscribe to a thread.
    */
  @JSName("getThreadSubscription")
  var getThreadSubscription_Original: Anon_EndpointParamsActivityGetThreadSubscriptionParams = js.native
  @JSName("getThread")
  var getThread_Original: Anon_EndpointParamsActivityGetThreadParams = js.native
  /**
    * This is the user's organization dashboard. You must be authenticated as the user to view this.
    */
  @JSName("listEventsForOrg")
  var listEventsForOrg_Original: Anon_EndpointParamsActivityListEventsForOrgParams = js.native
  /**
    * If you are authenticated as the given user, you will see your private events. Otherwise, you'll only see public events.
    */
  @JSName("listEventsForUser")
  var listEventsForUser_Original: Anon_EndpointParamsActivityListEventsForUserParams = js.native
  /**
    * GitHub provides several timeline resources in [Atom](http://en.wikipedia.org/wiki/Atom_(standard)) format. The Feeds API lists all the feeds available to the authenticated user:
    *
    * *   **Timeline**: The GitHub global public timeline
    * *   **User**: The public timeline for any user, using [URI template](https://developer.github.com/v3/#hypermedia)
    * *   **Current user public**: The public timeline for the authenticated user
    * *   **Current user**: The private timeline for the authenticated user
    * *   **Current user actor**: The private timeline for activity created by the authenticated user
    * *   **Current user organizations**: The private timeline for the organizations the authenticated user is a member of.
    * *   **Security advisories**: A collection of public announcements that provide information about security-related vulnerabilities in software on GitHub.
    *
    * **Note**: Private feeds are only returned when [authenticating via Basic Auth](https://developer.github.com/v3/#basic-authentication) since current feed URIs use the older, non revocable auth tokens.
    */
  @JSName("listFeeds")
  var listFeeds_Original: Anon_EndpointParamsActivityListFeedsResponse = js.native
  /**
    * List all notifications for the current user.
    */
  @JSName("listNotificationsForRepo")
  var listNotificationsForRepo_Original: Anon_EndpointParamsActivityListNotificationsForRepoParams = js.native
  /**
    * List all notifications for the current user, sorted by most recently updated.
    *
    * The following example uses the `since` parameter to list notifications that have been updated after the specified time.
    */
  @JSName("listNotifications")
  var listNotifications_Original: Anon_EndpointParamsActivityListNotificationsParams = js.native
  @JSName("listPublicEventsForOrg")
  var listPublicEventsForOrg_Original: Anon_EndpointParamsActivityListPublicEventsForOrgParams = js.native
  @JSName("listPublicEventsForRepoNetwork")
  var listPublicEventsForRepoNetwork_Original: Anon_EndpointParamsActivityListPublicEventsForRepoNetworkParams = js.native
  @JSName("listPublicEventsForUser")
  var listPublicEventsForUser_Original: Anon_EndpointParamsActivityListPublicEventsForUserParams = js.native
  /**
    * We delay the public events feed by five minutes, which means the most recent event returned by the public events API actually occurred at least five minutes ago.
    */
  @JSName("listPublicEvents")
  var listPublicEvents_Original: Anon_Endpoint = js.native
  /**
    * These are events that you've received by watching repos and following users. If you are authenticated as the given user, you will see private events. Otherwise, you'll only see public events.
    */
  @JSName("listReceivedEventsForUser")
  var listReceivedEventsForUser_Original: Anon_EndpointParamsActivityListReceivedEventsForUserParams = js.native
  @JSName("listReceivedPublicEventsForUser")
  var listReceivedPublicEventsForUser_Original: Anon_EndpointParamsActivityListReceivedPublicEventsForUserParams = js.native
  @JSName("listRepoEvents")
  var listRepoEvents_Original: Anon_EndpointParams = js.native
  /**
    * You can also find out _when_ stars were created by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  @JSName("listReposStarredByAuthenticatedUser")
  var listReposStarredByAuthenticatedUser_Original: Anon_EndpointParamsActivityListReposStarredByAuthenticatedUserParams = js.native
  /**
    * You can also find out _when_ stars were created by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  @JSName("listReposStarredByUser")
  var listReposStarredByUser_Original: Anon_EndpointParamsActivityListReposStarredByUserParams = js.native
  @JSName("listReposWatchedByUser")
  var listReposWatchedByUser_Original: Anon_EndpointParamsActivityListReposWatchedByUserParams = js.native
  /**
    * You can also find out _when_ stars were created by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  @JSName("listStargazersForRepo")
  var listStargazersForRepo_Original: Anon_EndpointParamsActivityListStargazersForRepoParams = js.native
  @JSName("listWatchedReposForAuthenticatedUser")
  var listWatchedReposForAuthenticatedUser_Original: Anon_EndpointParamsActivityListWatchedReposForAuthenticatedUserParams = js.native
  @JSName("listWatchersForRepo")
  var listWatchersForRepo_Original: Anon_EndpointParamsActivityListWatchersForRepoParams = js.native
  /**
    * Marking a notification as "read" removes it from the [default view on GitHub](https://github.com/notifications). If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List your notifications](https://developer.github.com/v3/activity/notifications/#list-your-notifications) endpoint and pass the query parameter `all=false`.
    */
  @JSName("markAsRead")
  var markAsRead_Original: Anon_EndpointParamsActivityMarkAsReadParams = js.native
  /**
    * Marking all notifications in a repository as "read" removes them from the [default view on GitHub](https://github.com/notifications). If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List your notifications in a repository](https://developer.github.com/v3/activity/notifications/#list-your-notifications-in-a-repository) endpoint and pass the query parameter `all=false`.
    */
  @JSName("markNotificationsAsReadForRepo")
  var markNotificationsAsReadForRepo_Original: Anon_EndpointParamsActivityMarkNotificationsAsReadForRepoParams = js.native
  @JSName("markThreadAsRead")
  var markThreadAsRead_Original: Anon_EndpointParamsActivityMarkThreadAsReadParams = js.native
  /**
    * If you would like to watch a repository, set `subscribed` to `true`. If you would like to ignore notifications made within a repository, set `ignored` to `true`. If you would like to stop watching a repository, [delete the repository's subscription](https://developer.github.com/v3/activity/watching/#delete-a-repository-subscription) completely.
    */
  @JSName("setRepoSubscription")
  var setRepoSubscription_Original: Anon_EndpointParamsActivitySetRepoSubscriptionParams = js.native
  /**
    * This lets you subscribe or unsubscribe from a conversation.
    */
  @JSName("setThreadSubscription")
  var setThreadSubscription_Original: Anon_EndpointParamsActivitySetThreadSubscriptionParams = js.native
  /**
    * Requires for the user to be authenticated.
    *
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  @JSName("starRepo")
  var starRepo_Original: Anon_EndpointParamsActivityStarRepoParams = js.native
  /**
    * Requires for the user to be authenticated.
    */
  @JSName("unstarRepo")
  var unstarRepo_Original: Anon_EndpointParamsActivityUnstarRepoParams = js.native
  /**
    * Requires for the user to be authenticated.
    */
  def checkStarringRepo(): js.Promise[AnyResponse] = js.native
  def checkStarringRepo(params: ActivityCheckStarringRepoParams): js.Promise[AnyResponse] = js.native
  /**
    * This endpoint should only be used to stop watching a repository. To control whether or not you wish to receive notifications from a repository, [set the repository's subscription manually](https://developer.github.com/v3/activity/watching/#set-a-repository-subscription).
    */
  def deleteRepoSubscription(): js.Promise[Response[ActivityDeleteRepoSubscriptionResponse]] = js.native
  def deleteRepoSubscription(params: ActivityDeleteRepoSubscriptionParams): js.Promise[Response[ActivityDeleteRepoSubscriptionResponse]] = js.native
  /**
    * Mutes all future notifications for a conversation until you comment on the thread or get **@mention**ed.
    */
  def deleteThreadSubscription(): js.Promise[Response[ActivityDeleteThreadSubscriptionResponse]] = js.native
  def deleteThreadSubscription(params: ActivityDeleteThreadSubscriptionParams): js.Promise[Response[ActivityDeleteThreadSubscriptionResponse]] = js.native
  def getRepoSubscription(): js.Promise[AnyResponse] = js.native
  def getRepoSubscription(params: ActivityGetRepoSubscriptionParams): js.Promise[AnyResponse] = js.native
  def getThread(): js.Promise[Response[ActivityGetThreadResponse]] = js.native
  def getThread(params: ActivityGetThreadParams): js.Promise[Response[ActivityGetThreadResponse]] = js.native
  /**
    * This checks to see if the current user is subscribed to a thread. You can also [get a repository subscription](https://developer.github.com/v3/activity/watching/#get-a-repository-subscription).
    *
    * Note that subscriptions are only generated if a user is participating in a conversation--for example, they've replied to the thread, were **@mentioned**, or manually subscribe to a thread.
    */
  def getThreadSubscription(): js.Promise[Response[ActivityGetThreadSubscriptionResponse]] = js.native
  def getThreadSubscription(params: ActivityGetThreadSubscriptionParams): js.Promise[Response[ActivityGetThreadSubscriptionResponse]] = js.native
  /**
    * This is the user's organization dashboard. You must be authenticated as the user to view this.
    */
  def listEventsForOrg(): js.Promise[AnyResponse] = js.native
  def listEventsForOrg(params: ActivityListEventsForOrgParams): js.Promise[AnyResponse] = js.native
  /**
    * If you are authenticated as the given user, you will see your private events. Otherwise, you'll only see public events.
    */
  def listEventsForUser(): js.Promise[AnyResponse] = js.native
  def listEventsForUser(params: ActivityListEventsForUserParams): js.Promise[AnyResponse] = js.native
  /**
    * GitHub provides several timeline resources in [Atom](http://en.wikipedia.org/wiki/Atom_(standard)) format. The Feeds API lists all the feeds available to the authenticated user:
    *
    * *   **Timeline**: The GitHub global public timeline
    * *   **User**: The public timeline for any user, using [URI template](https://developer.github.com/v3/#hypermedia)
    * *   **Current user public**: The public timeline for the authenticated user
    * *   **Current user**: The private timeline for the authenticated user
    * *   **Current user actor**: The private timeline for activity created by the authenticated user
    * *   **Current user organizations**: The private timeline for the organizations the authenticated user is a member of.
    * *   **Security advisories**: A collection of public announcements that provide information about security-related vulnerabilities in software on GitHub.
    *
    * **Note**: Private feeds are only returned when [authenticating via Basic Auth](https://developer.github.com/v3/#basic-authentication) since current feed URIs use the older, non revocable auth tokens.
    */
  def listFeeds(): js.Promise[Response[ActivityListFeedsResponse]] = js.native
  def listFeeds(params: EmptyParams): js.Promise[Response[ActivityListFeedsResponse]] = js.native
  /**
    * List all notifications for the current user, sorted by most recently updated.
    *
    * The following example uses the `since` parameter to list notifications that have been updated after the specified time.
    */
  def listNotifications(): js.Promise[Response[ActivityListNotificationsResponse]] = js.native
  def listNotifications(params: ActivityListNotificationsParams): js.Promise[Response[ActivityListNotificationsResponse]] = js.native
  /**
    * List all notifications for the current user.
    */
  def listNotificationsForRepo(): js.Promise[Response[ActivityListNotificationsForRepoResponse]] = js.native
  def listNotificationsForRepo(params: ActivityListNotificationsForRepoParams): js.Promise[Response[ActivityListNotificationsForRepoResponse]] = js.native
  /**
    * We delay the public events feed by five minutes, which means the most recent event returned by the public events API actually occurred at least five minutes ago.
    */
  def listPublicEvents(): js.Promise[AnyResponse] = js.native
  def listPublicEvents(params: ActivityListPublicEventsParams): js.Promise[AnyResponse] = js.native
  def listPublicEventsForOrg(): js.Promise[AnyResponse] = js.native
  def listPublicEventsForOrg(params: ActivityListPublicEventsForOrgParams): js.Promise[AnyResponse] = js.native
  def listPublicEventsForRepoNetwork(): js.Promise[AnyResponse] = js.native
  def listPublicEventsForRepoNetwork(params: ActivityListPublicEventsForRepoNetworkParams): js.Promise[AnyResponse] = js.native
  def listPublicEventsForUser(): js.Promise[AnyResponse] = js.native
  def listPublicEventsForUser(params: ActivityListPublicEventsForUserParams): js.Promise[AnyResponse] = js.native
  /**
    * These are events that you've received by watching repos and following users. If you are authenticated as the given user, you will see private events. Otherwise, you'll only see public events.
    */
  def listReceivedEventsForUser(): js.Promise[AnyResponse] = js.native
  def listReceivedEventsForUser(params: ActivityListReceivedEventsForUserParams): js.Promise[AnyResponse] = js.native
  def listReceivedPublicEventsForUser(): js.Promise[AnyResponse] = js.native
  def listReceivedPublicEventsForUser(params: ActivityListReceivedPublicEventsForUserParams): js.Promise[AnyResponse] = js.native
  def listRepoEvents(): js.Promise[AnyResponse] = js.native
  def listRepoEvents(params: ActivityListRepoEventsParams): js.Promise[AnyResponse] = js.native
  /**
    * You can also find out _when_ stars were created by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  def listReposStarredByAuthenticatedUser(): js.Promise[Response[ActivityListReposStarredByAuthenticatedUserResponse]] = js.native
  def listReposStarredByAuthenticatedUser(params: ActivityListReposStarredByAuthenticatedUserParams): js.Promise[Response[ActivityListReposStarredByAuthenticatedUserResponse]] = js.native
  /**
    * You can also find out _when_ stars were created by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  def listReposStarredByUser(): js.Promise[Response[ActivityListReposStarredByUserResponse]] = js.native
  def listReposStarredByUser(params: ActivityListReposStarredByUserParams): js.Promise[Response[ActivityListReposStarredByUserResponse]] = js.native
  def listReposWatchedByUser(): js.Promise[Response[ActivityListReposWatchedByUserResponse]] = js.native
  def listReposWatchedByUser(params: ActivityListReposWatchedByUserParams): js.Promise[Response[ActivityListReposWatchedByUserResponse]] = js.native
  /**
    * You can also find out _when_ stars were created by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  def listStargazersForRepo(): js.Promise[Response[ActivityListStargazersForRepoResponse]] = js.native
  def listStargazersForRepo(params: ActivityListStargazersForRepoParams): js.Promise[Response[ActivityListStargazersForRepoResponse]] = js.native
  def listWatchedReposForAuthenticatedUser(): js.Promise[Response[ActivityListWatchedReposForAuthenticatedUserResponse]] = js.native
  def listWatchedReposForAuthenticatedUser(params: ActivityListWatchedReposForAuthenticatedUserParams): js.Promise[Response[ActivityListWatchedReposForAuthenticatedUserResponse]] = js.native
  def listWatchersForRepo(): js.Promise[Response[ActivityListWatchersForRepoResponse]] = js.native
  def listWatchersForRepo(params: ActivityListWatchersForRepoParams): js.Promise[Response[ActivityListWatchersForRepoResponse]] = js.native
  /**
    * Marking a notification as "read" removes it from the [default view on GitHub](https://github.com/notifications). If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List your notifications](https://developer.github.com/v3/activity/notifications/#list-your-notifications) endpoint and pass the query parameter `all=false`.
    */
  def markAsRead(): js.Promise[Response[ActivityMarkAsReadResponse]] = js.native
  def markAsRead(params: ActivityMarkAsReadParams): js.Promise[Response[ActivityMarkAsReadResponse]] = js.native
  /**
    * Marking all notifications in a repository as "read" removes them from the [default view on GitHub](https://github.com/notifications). If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List your notifications in a repository](https://developer.github.com/v3/activity/notifications/#list-your-notifications-in-a-repository) endpoint and pass the query parameter `all=false`.
    */
  def markNotificationsAsReadForRepo(): js.Promise[Response[ActivityMarkNotificationsAsReadForRepoResponse]] = js.native
  def markNotificationsAsReadForRepo(params: ActivityMarkNotificationsAsReadForRepoParams): js.Promise[Response[ActivityMarkNotificationsAsReadForRepoResponse]] = js.native
  def markThreadAsRead(): js.Promise[Response[ActivityMarkThreadAsReadResponse]] = js.native
  def markThreadAsRead(params: ActivityMarkThreadAsReadParams): js.Promise[Response[ActivityMarkThreadAsReadResponse]] = js.native
  /**
    * If you would like to watch a repository, set `subscribed` to `true`. If you would like to ignore notifications made within a repository, set `ignored` to `true`. If you would like to stop watching a repository, [delete the repository's subscription](https://developer.github.com/v3/activity/watching/#delete-a-repository-subscription) completely.
    */
  def setRepoSubscription(): js.Promise[Response[ActivitySetRepoSubscriptionResponse]] = js.native
  def setRepoSubscription(params: ActivitySetRepoSubscriptionParams): js.Promise[Response[ActivitySetRepoSubscriptionResponse]] = js.native
  /**
    * This lets you subscribe or unsubscribe from a conversation.
    */
  def setThreadSubscription(): js.Promise[Response[ActivitySetThreadSubscriptionResponse]] = js.native
  def setThreadSubscription(params: ActivitySetThreadSubscriptionParams): js.Promise[Response[ActivitySetThreadSubscriptionResponse]] = js.native
  /**
    * Requires for the user to be authenticated.
    *
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  def starRepo(): js.Promise[Response[ActivityStarRepoResponse]] = js.native
  def starRepo(params: ActivityStarRepoParams): js.Promise[Response[ActivityStarRepoResponse]] = js.native
  /**
    * Requires for the user to be authenticated.
    */
  def unstarRepo(): js.Promise[Response[ActivityUnstarRepoResponse]] = js.native
  def unstarRepo(params: ActivityUnstarRepoParams): js.Promise[Response[ActivityUnstarRepoResponse]] = js.native
}

