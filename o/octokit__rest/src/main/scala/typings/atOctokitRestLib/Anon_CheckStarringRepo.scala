package typings
package atOctokitRestLib

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
    * This endpoint should only be used to stop watching a repository. To control whether or not you wish to receive notifications from a repository, [set the repository's subscription manually](#set-a-repository-subscription).
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
    * If you would like to watch a repository, set `subscribed` to `true`. If you would like to ignore notifications made within a repository, set `ignored` to `true`. If you would like to stop watching a repository, [delete the repository's subscription](#delete-a-repository-subscription) completely.
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
  def checkStarringRepo(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def checkStarringRepo(params: atOctokitRestLib.atOctokitRestMod.ActivityCheckStarringRepoParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  /**
    * This endpoint should only be used to stop watching a repository. To control whether or not you wish to receive notifications from a repository, [set the repository's subscription manually](#set-a-repository-subscription).
    */
  def deleteRepoSubscription(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ActivityDeleteRepoSubscriptionResponse]
  ] = js.native
  def deleteRepoSubscription(params: atOctokitRestLib.atOctokitRestMod.ActivityDeleteRepoSubscriptionParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ActivityDeleteRepoSubscriptionResponse]
  ] = js.native
  /**
    * Mutes all future notifications for a conversation until you comment on the thread or get **@mention**ed.
    */
  def deleteThreadSubscription(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ActivityDeleteThreadSubscriptionResponse]
  ] = js.native
  def deleteThreadSubscription(params: atOctokitRestLib.atOctokitRestMod.ActivityDeleteThreadSubscriptionParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ActivityDeleteThreadSubscriptionResponse]
  ] = js.native
  def getRepoSubscription(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def getRepoSubscription(params: atOctokitRestLib.atOctokitRestMod.ActivityGetRepoSubscriptionParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def getThread(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ActivityGetThreadResponse]
  ] = js.native
  def getThread(params: atOctokitRestLib.atOctokitRestMod.ActivityGetThreadParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ActivityGetThreadResponse]
  ] = js.native
  /**
    * This checks to see if the current user is subscribed to a thread. You can also [get a repository subscription](https://developer.github.com/v3/activity/watching/#get-a-repository-subscription).
    *
    * Note that subscriptions are only generated if a user is participating in a conversation--for example, they've replied to the thread, were **@mentioned**, or manually subscribe to a thread.
    */
  def getThreadSubscription(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ActivityGetThreadSubscriptionResponse]
  ] = js.native
  def getThreadSubscription(params: atOctokitRestLib.atOctokitRestMod.ActivityGetThreadSubscriptionParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ActivityGetThreadSubscriptionResponse]
  ] = js.native
  /**
    * This is the user's organization dashboard. You must be authenticated as the user to view this.
    */
  def listEventsForOrg(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def listEventsForOrg(params: atOctokitRestLib.atOctokitRestMod.ActivityListEventsForOrgParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  /**
    * If you are authenticated as the given user, you will see your private events. Otherwise, you'll only see public events.
    */
  def listEventsForUser(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def listEventsForUser(params: atOctokitRestLib.atOctokitRestMod.ActivityListEventsForUserParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
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
  def listFeeds(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ActivityListFeedsResponse]
  ] = js.native
  def listFeeds(params: atOctokitRestLib.atOctokitRestMod.EmptyParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ActivityListFeedsResponse]
  ] = js.native
  /**
    * List all notifications for the current user, sorted by most recently updated.
    *
    * The following example uses the `since` parameter to list notifications that have been updated after the specified time.
    */
  def listNotifications(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ActivityListNotificationsResponse]
  ] = js.native
  def listNotifications(params: atOctokitRestLib.atOctokitRestMod.ActivityListNotificationsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ActivityListNotificationsResponse]
  ] = js.native
  /**
    * List all notifications for the current user.
    */
  def listNotificationsForRepo(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ActivityListNotificationsForRepoResponse]
  ] = js.native
  def listNotificationsForRepo(params: atOctokitRestLib.atOctokitRestMod.ActivityListNotificationsForRepoParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ActivityListNotificationsForRepoResponse]
  ] = js.native
  /**
    * We delay the public events feed by five minutes, which means the most recent event returned by the public events API actually occurred at least five minutes ago.
    */
  def listPublicEvents(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def listPublicEvents(params: atOctokitRestLib.atOctokitRestMod.ActivityListPublicEventsParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def listPublicEventsForOrg(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def listPublicEventsForOrg(params: atOctokitRestLib.atOctokitRestMod.ActivityListPublicEventsForOrgParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def listPublicEventsForRepoNetwork(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def listPublicEventsForRepoNetwork(params: atOctokitRestLib.atOctokitRestMod.ActivityListPublicEventsForRepoNetworkParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def listPublicEventsForUser(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def listPublicEventsForUser(params: atOctokitRestLib.atOctokitRestMod.ActivityListPublicEventsForUserParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  /**
    * These are events that you've received by watching repos and following users. If you are authenticated as the given user, you will see private events. Otherwise, you'll only see public events.
    */
  def listReceivedEventsForUser(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def listReceivedEventsForUser(params: atOctokitRestLib.atOctokitRestMod.ActivityListReceivedEventsForUserParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def listReceivedPublicEventsForUser(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def listReceivedPublicEventsForUser(params: atOctokitRestLib.atOctokitRestMod.ActivityListReceivedPublicEventsForUserParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def listRepoEvents(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def listRepoEvents(params: atOctokitRestLib.atOctokitRestMod.ActivityListRepoEventsParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  /**
    * You can also find out _when_ stars were created by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  def listReposStarredByAuthenticatedUser(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ActivityListReposStarredByAuthenticatedUserResponse
    ]
  ] = js.native
  def listReposStarredByAuthenticatedUser(params: atOctokitRestLib.atOctokitRestMod.ActivityListReposStarredByAuthenticatedUserParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ActivityListReposStarredByAuthenticatedUserResponse
    ]
  ] = js.native
  /**
    * You can also find out _when_ stars were created by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  def listReposStarredByUser(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ActivityListReposStarredByUserResponse]
  ] = js.native
  def listReposStarredByUser(params: atOctokitRestLib.atOctokitRestMod.ActivityListReposStarredByUserParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ActivityListReposStarredByUserResponse]
  ] = js.native
  def listReposWatchedByUser(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ActivityListReposWatchedByUserResponse]
  ] = js.native
  def listReposWatchedByUser(params: atOctokitRestLib.atOctokitRestMod.ActivityListReposWatchedByUserParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ActivityListReposWatchedByUserResponse]
  ] = js.native
  /**
    * You can also find out _when_ stars were created by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  def listStargazersForRepo(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ActivityListStargazersForRepoResponse]
  ] = js.native
  def listStargazersForRepo(params: atOctokitRestLib.atOctokitRestMod.ActivityListStargazersForRepoParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ActivityListStargazersForRepoResponse]
  ] = js.native
  def listWatchedReposForAuthenticatedUser(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ActivityListWatchedReposForAuthenticatedUserResponse
    ]
  ] = js.native
  def listWatchedReposForAuthenticatedUser(params: atOctokitRestLib.atOctokitRestMod.ActivityListWatchedReposForAuthenticatedUserParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ActivityListWatchedReposForAuthenticatedUserResponse
    ]
  ] = js.native
  def listWatchersForRepo(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ActivityListWatchersForRepoResponse]
  ] = js.native
  def listWatchersForRepo(params: atOctokitRestLib.atOctokitRestMod.ActivityListWatchersForRepoParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ActivityListWatchersForRepoResponse]
  ] = js.native
  /**
    * Marking a notification as "read" removes it from the [default view on GitHub](https://github.com/notifications). If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List your notifications](https://developer.github.com/v3/activity/notifications/#list-your-notifications) endpoint and pass the query parameter `all=false`.
    */
  def markAsRead(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ActivityMarkAsReadResponse]
  ] = js.native
  def markAsRead(params: atOctokitRestLib.atOctokitRestMod.ActivityMarkAsReadParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ActivityMarkAsReadResponse]
  ] = js.native
  /**
    * Marking all notifications in a repository as "read" removes them from the [default view on GitHub](https://github.com/notifications). If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List your notifications in a repository](https://developer.github.com/v3/activity/notifications/#list-your-notifications-in-a-repository) endpoint and pass the query parameter `all=false`.
    */
  def markNotificationsAsReadForRepo(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ActivityMarkNotificationsAsReadForRepoResponse]
  ] = js.native
  def markNotificationsAsReadForRepo(params: atOctokitRestLib.atOctokitRestMod.ActivityMarkNotificationsAsReadForRepoParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ActivityMarkNotificationsAsReadForRepoResponse]
  ] = js.native
  def markThreadAsRead(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ActivityMarkThreadAsReadResponse]
  ] = js.native
  def markThreadAsRead(params: atOctokitRestLib.atOctokitRestMod.ActivityMarkThreadAsReadParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ActivityMarkThreadAsReadResponse]
  ] = js.native
  /**
    * If you would like to watch a repository, set `subscribed` to `true`. If you would like to ignore notifications made within a repository, set `ignored` to `true`. If you would like to stop watching a repository, [delete the repository's subscription](#delete-a-repository-subscription) completely.
    */
  def setRepoSubscription(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ActivitySetRepoSubscriptionResponse]
  ] = js.native
  def setRepoSubscription(params: atOctokitRestLib.atOctokitRestMod.ActivitySetRepoSubscriptionParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ActivitySetRepoSubscriptionResponse]
  ] = js.native
  /**
    * This lets you subscribe or unsubscribe from a conversation.
    */
  def setThreadSubscription(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ActivitySetThreadSubscriptionResponse]
  ] = js.native
  def setThreadSubscription(params: atOctokitRestLib.atOctokitRestMod.ActivitySetThreadSubscriptionParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ActivitySetThreadSubscriptionResponse]
  ] = js.native
  /**
    * Requires for the user to be authenticated.
    *
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  def starRepo(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ActivityStarRepoResponse]
  ] = js.native
  def starRepo(params: atOctokitRestLib.atOctokitRestMod.ActivityStarRepoParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ActivityStarRepoResponse]
  ] = js.native
  /**
    * Requires for the user to be authenticated.
    */
  def unstarRepo(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ActivityUnstarRepoResponse]
  ] = js.native
  def unstarRepo(params: atOctokitRestLib.atOctokitRestMod.ActivityUnstarRepoParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ActivityUnstarRepoResponse]
  ] = js.native
}

