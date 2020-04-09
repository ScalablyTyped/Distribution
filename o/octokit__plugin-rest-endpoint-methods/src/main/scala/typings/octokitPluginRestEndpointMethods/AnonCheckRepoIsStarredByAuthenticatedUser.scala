package typings.octokitPluginRestEndpointMethods

import typings.octokitPluginRestEndpointMethods.typesMod.ActivityCheckRepoIsStarredByAuthenticatedUserParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityCheckStarringRepoParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityDeleteRepoSubscriptionParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityDeleteThreadSubscriptionParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityGetRepoSubscriptionParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityGetThreadParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityGetThreadSubscriptionForAuthenticatedUserParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityGetThreadSubscriptionParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityListEventsForAuthenticatedUserParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityListEventsForOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityListEventsForUserParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityListNotificationsForAuthenticatedUserParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityListNotificationsForRepoParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityListNotificationsParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityListOrgEventsForAuthenticatedUserParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityListPublicEventsForOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityListPublicEventsForRepoNetworkParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityListPublicEventsForUserParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityListPublicEventsParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityListPublicOrgEventsParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityListReceivedEventsForUserParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityListReceivedPublicEventsForUserParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityListRepoEventsParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityListRepoNotificationsForAuthenticatedUserParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityListReposStarredByAuthenticatedUserParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityListReposStarredByUserParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityListReposWatchedByUserParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityListStargazersForRepoParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityListWatchedReposForAuthenticatedUserParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityListWatchersForRepoParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityMarkAsReadParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityMarkNotificationsAsReadForRepoParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityMarkNotificationsAsReadParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityMarkRepoNotificationsAsReadParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityMarkThreadAsReadParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivitySetRepoSubscriptionParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivitySetThreadSubscriptionParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityStarRepoForAuthenticatedUserParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityStarRepoParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityUnstarRepoForAuthenticatedUserParams
import typings.octokitPluginRestEndpointMethods.typesMod.ActivityUnstarRepoParams
import typings.octokitPluginRestEndpointMethods.typesMod.AnyResponse
import typings.octokitPluginRestEndpointMethods.typesMod.EmptyParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCheckRepoIsStarredByAuthenticatedUser extends js.Object {
  @JSName("checkRepoIsStarredByAuthenticatedUser")
  var checkRepoIsStarredByAuthenticatedUser_Original: Anon21 = js.native
  /**
    * @deprecated octokit.activity.checkStarringRepo() has been renamed to octokit.activity.checkRepoIsStarredByAuthenticatedUser() (2020-03-25)
    */
  @JSName("checkStarringRepo")
  var checkStarringRepo_Original: Anon22 = js.native
  /**
    * This endpoint should only be used to stop watching a repository. To control whether or not you wish to receive notifications from a repository, [set the repository's subscription manually](https://developer.github.com/v3/activity/watching/#set-a-repository-subscription).
    */
  @JSName("deleteRepoSubscription")
  var deleteRepoSubscription_Original: Anon23 = js.native
  /**
    * Mutes all future notifications for a conversation until you comment on the thread or get an **@mention**. If you are watching the repository of the thread, you will still receive notifications. To ignore future notifications for a repository you are watching, use the [Set a thread subscription](https://developer.github.com/v3/activity/notifications/#set-a-thread-subscription) endpoint and set `ignore` to `true`.
    */
  @JSName("deleteThreadSubscription")
  var deleteThreadSubscription_Original: Anon24 = js.native
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
  @JSName("getFeeds")
  var getFeeds_Original: Anon25 = js.native
  @JSName("getRepoSubscription")
  var getRepoSubscription_Original: Anon26 = js.native
  /**
    * This checks to see if the current user is subscribed to a thread. You can also [get a repository subscription](https://developer.github.com/v3/activity/watching/#get-a-repository-subscription).
    *
    * Note that subscriptions are only generated if a user is participating in a conversation--for example, they've replied to the thread, were **@mentioned**, or manually subscribe to a thread.
    */
  @JSName("getThreadSubscriptionForAuthenticatedUser")
  var getThreadSubscriptionForAuthenticatedUser_Original: Anon29 = js.native
  /**
    * Marks all notifications as "read" removes it from the [default view on GitHub](https://github.com/notifications). If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List notifications for the authenticated user](https://developer.github.com/v3/activity/notifications/#list-notifications-for-the-authenticated-user) endpoint and pass the query parameter `all=false`.
    * @deprecated octokit.activity.getThreadSubscription() has been renamed to octokit.activity.getThreadSubscriptionForAuthenticatedUser() (2020-03-25)
    */
  @JSName("getThreadSubscription")
  var getThreadSubscription_Original: Anon28 = js.native
  @JSName("getThread")
  var getThread_Original: Anon27 = js.native
  /**
    * If you are authenticated as the given user, you will see your private events. Otherwise, you'll only see public events.
    */
  @JSName("listEventsForAuthenticatedUser")
  var listEventsForAuthenticatedUser_Original: Anon30 = js.native
  /**
    * This is the user's organization dashboard. You must be authenticated as the user to view this.
    * @deprecated octokit.activity.listEventsForOrg() has been renamed to octokit.activity.listOrgEventsForAuthenticatedUser() (2020-03-25)
    */
  @JSName("listEventsForOrg")
  var listEventsForOrg_Original: Anon31 = js.native
  /**
    * If you are authenticated as the given user, you will see your private events. Otherwise, you'll only see public events.
    * @deprecated octokit.activity.listEventsForUser() has been renamed to octokit.activity.listEventsForAuthenticatedUser() (2020-03-25)
    */
  @JSName("listEventsForUser")
  var listEventsForUser_Original: Anon32 = js.native
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
    * @deprecated octokit.activity.listFeeds() has been renamed to octokit.activity.getFeeds() (2020-03-25)
    */
  @JSName("listFeeds")
  var listFeeds_Original: Anon25 = js.native
  /**
    * List all notifications for the current user, sorted by most recently updated.
    *
    * The following example uses the `since` parameter to list notifications that have been updated after the specified time.
    */
  @JSName("listNotificationsForAuthenticatedUser")
  var listNotificationsForAuthenticatedUser_Original: Anon34 = js.native
  /**
    * List all notifications for the current user.
    * @deprecated octokit.activity.listNotificationsForRepo() has been renamed to octokit.activity.listRepoNotificationsForAuthenticatedUser() (2020-03-25)
    */
  @JSName("listNotificationsForRepo")
  var listNotificationsForRepo_Original: Anon35 = js.native
  /**
    * List all notifications for the current user, sorted by most recently updated.
    *
    * The following example uses the `since` parameter to list notifications that have been updated after the specified time.
    * @deprecated octokit.activity.listNotifications() has been renamed to octokit.activity.listNotificationsForAuthenticatedUser() (2020-03-25)
    */
  @JSName("listNotifications")
  var listNotifications_Original: Anon33 = js.native
  /**
    * This is the user's organization dashboard. You must be authenticated as the user to view this.
    */
  @JSName("listOrgEventsForAuthenticatedUser")
  var listOrgEventsForAuthenticatedUser_Original: Anon36 = js.native
  /**
    * @deprecated octokit.activity.listPublicEventsForOrg() has been renamed to octokit.activity.listPublicOrgEvents() (2020-03-25)
    */
  @JSName("listPublicEventsForOrg")
  var listPublicEventsForOrg_Original: Anon38 = js.native
  @JSName("listPublicEventsForRepoNetwork")
  var listPublicEventsForRepoNetwork_Original: Anon39 = js.native
  @JSName("listPublicEventsForUser")
  var listPublicEventsForUser_Original: Anon40 = js.native
  /**
    * We delay the public events feed by five minutes, which means the most recent event returned by the public events API actually occurred at least five minutes ago.
    */
  @JSName("listPublicEvents")
  var listPublicEvents_Original: Anon37 = js.native
  @JSName("listPublicOrgEvents")
  var listPublicOrgEvents_Original: Anon41 = js.native
  /**
    * These are events that you've received by watching repos and following users. If you are authenticated as the given user, you will see private events. Otherwise, you'll only see public events.
    */
  @JSName("listReceivedEventsForUser")
  var listReceivedEventsForUser_Original: Anon42 = js.native
  @JSName("listReceivedPublicEventsForUser")
  var listReceivedPublicEventsForUser_Original: Anon43 = js.native
  @JSName("listRepoEvents")
  var listRepoEvents_Original: Anon44 = js.native
  /**
    * List all notifications for the current user.
    */
  @JSName("listRepoNotificationsForAuthenticatedUser")
  var listRepoNotificationsForAuthenticatedUser_Original: Anon45 = js.native
  /**
    * Lists repositories the authenticated user has starred.
    *
    * You can also find out _when_ stars were created by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  @JSName("listReposStarredByAuthenticatedUser")
  var listReposStarredByAuthenticatedUser_Original: Anon46 = js.native
  /**
    * Lists repositories a user has starred.
    *
    * You can also find out _when_ stars were created by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  @JSName("listReposStarredByUser")
  var listReposStarredByUser_Original: Anon47 = js.native
  /**
    * Lists repositories a user is watching.
    */
  @JSName("listReposWatchedByUser")
  var listReposWatchedByUser_Original: Anon48 = js.native
  /**
    * Lists the people that have starred the repository.
    *
    * You can also find out _when_ stars were created by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  @JSName("listStargazersForRepo")
  var listStargazersForRepo_Original: Anon49 = js.native
  /**
    * Lists repositories the authenticated user is watching.
    */
  @JSName("listWatchedReposForAuthenticatedUser")
  var listWatchedReposForAuthenticatedUser_Original: Anon50 = js.native
  /**
    * Lists the people watching the specified repository.
    */
  @JSName("listWatchersForRepo")
  var listWatchersForRepo_Original: Anon51 = js.native
  /**
    * Marks all notifications as "read" removes it from the [default view on GitHub](https://github.com/notifications). If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List notifications for the authenticated user](https://developer.github.com/v3/activity/notifications/#list-notifications-for-the-authenticated-user) endpoint and pass the query parameter `all=false`.
    * @deprecated octokit.activity.markAsRead() has been renamed to octokit.activity.markNotificationsAsRead() (2020-03-25)
    */
  @JSName("markAsRead")
  var markAsRead_Original: Anon52 = js.native
  /**
    * Marks all notifications in a repository as "read" removes them from the [default view on GitHub](https://github.com/notifications). If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List repository notifications for the authenticated user](https://developer.github.com/v3/activity/notifications/#list-repository-notifications-for-the-authenticated-user) endpoint and pass the query parameter `all=false`.
    * @deprecated octokit.activity.markNotificationsAsReadForRepo() has been renamed to octokit.activity.markRepoNotificationsAsRead() (2020-03-25)
    */
  @JSName("markNotificationsAsReadForRepo")
  var markNotificationsAsReadForRepo_Original: Anon54 = js.native
  /**
    * Marks all notifications as "read" removes it from the [default view on GitHub](https://github.com/notifications). If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List notifications for the authenticated user](https://developer.github.com/v3/activity/notifications/#list-notifications-for-the-authenticated-user) endpoint and pass the query parameter `all=false`.
    */
  @JSName("markNotificationsAsRead")
  var markNotificationsAsRead_Original: Anon53 = js.native
  /**
    * Marks all notifications in a repository as "read" removes them from the [default view on GitHub](https://github.com/notifications). If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List repository notifications for the authenticated user](https://developer.github.com/v3/activity/notifications/#list-repository-notifications-for-the-authenticated-user) endpoint and pass the query parameter `all=false`.
    */
  @JSName("markRepoNotificationsAsRead")
  var markRepoNotificationsAsRead_Original: Anon55 = js.native
  @JSName("markThreadAsRead")
  var markThreadAsRead_Original: Anon56 = js.native
  /**
    * If you would like to watch a repository, set `subscribed` to `true`. If you would like to ignore notifications made within a repository, set `ignored` to `true`. If you would like to stop watching a repository, [delete the repository's subscription](https://developer.github.com/v3/activity/watching/#delete-a-repository-subscription) completely.
    */
  @JSName("setRepoSubscription")
  var setRepoSubscription_Original: Anon57 = js.native
  /**
    * If you are watching a repository, you receive notifications for all threads by default. Use this endpoint to ignore future notifications for threads until you comment on the thread or get an **@mention**.
    *
    * You can also use this endpoint to subscribe to threads that you are currently not receiving notifications for or to subscribed to threads that you have previously ignored.
    *
    * Unsubscribing from a conversation in a repository that you are not watching is functionally equivalent to the [Delete a thread subscription](https://developer.github.com/v3/activity/notifications/#delete-a-thread-subscription) endpoint.
    */
  @JSName("setThreadSubscription")
  var setThreadSubscription_Original: Anon58 = js.native
  /**
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  @JSName("starRepoForAuthenticatedUser")
  var starRepoForAuthenticatedUser_Original: Anon60 = js.native
  /**
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    * @deprecated octokit.activity.starRepo() has been renamed to octokit.activity.starRepoForAuthenticatedUser() (2020-03-25)
    */
  @JSName("starRepo")
  var starRepo_Original: Anon59 = js.native
  @JSName("unstarRepoForAuthenticatedUser")
  var unstarRepoForAuthenticatedUser_Original: Anon62 = js.native
  /**
    * @deprecated octokit.activity.unstarRepo() has been renamed to octokit.activity.unstarRepoForAuthenticatedUser() (2020-03-25)
    */
  @JSName("unstarRepo")
  var unstarRepo_Original: Anon61 = js.native
  def checkRepoIsStarredByAuthenticatedUser(): js.Promise[AnyResponse] = js.native
  def checkRepoIsStarredByAuthenticatedUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityCheckRepoIsStarredByAuthenticatedUserParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * @deprecated octokit.activity.checkStarringRepo() has been renamed to octokit.activity.checkRepoIsStarredByAuthenticatedUser() (2020-03-25)
    */
  def checkStarringRepo(): js.Promise[AnyResponse] = js.native
  def checkStarringRepo(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityCheckStarringRepoParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * This endpoint should only be used to stop watching a repository. To control whether or not you wish to receive notifications from a repository, [set the repository's subscription manually](https://developer.github.com/v3/activity/watching/#set-a-repository-subscription).
    */
  def deleteRepoSubscription(): js.Promise[AnyResponse] = js.native
  def deleteRepoSubscription(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityDeleteRepoSubscriptionParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Mutes all future notifications for a conversation until you comment on the thread or get an **@mention**. If you are watching the repository of the thread, you will still receive notifications. To ignore future notifications for a repository you are watching, use the [Set a thread subscription](https://developer.github.com/v3/activity/notifications/#set-a-thread-subscription) endpoint and set `ignore` to `true`.
    */
  def deleteThreadSubscription(): js.Promise[AnyResponse] = js.native
  def deleteThreadSubscription(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityDeleteThreadSubscriptionParams
  ): js.Promise[AnyResponse] = js.native
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
  def getFeeds(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListBlockedResponse> */ _
  ] = js.native
  def getFeeds(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with EmptyParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListBlockedResponse> */ _
  ] = js.native
  def getRepoSubscription(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActivityGetRepoSubscriptionResponse> */ _
  ] = js.native
  def getRepoSubscription(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityGetRepoSubscriptionParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActivityGetRepoSubscriptionResponse> */ _
  ] = js.native
  def getThread(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActivityGetThreadResponse> */ _
  ] = js.native
  def getThread(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityGetThreadParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActivityGetThreadResponse> */ _
  ] = js.native
  /**
    * Marks all notifications as "read" removes it from the [default view on GitHub](https://github.com/notifications). If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List notifications for the authenticated user](https://developer.github.com/v3/activity/notifications/#list-notifications-for-the-authenticated-user) endpoint and pass the query parameter `all=false`.
    * @deprecated octokit.activity.getThreadSubscription() has been renamed to octokit.activity.getThreadSubscriptionForAuthenticatedUser() (2020-03-25)
    */
  def getThreadSubscription(): js.Promise[AnyResponse] = js.native
  def getThreadSubscription(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityGetThreadSubscriptionParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * This checks to see if the current user is subscribed to a thread. You can also [get a repository subscription](https://developer.github.com/v3/activity/watching/#get-a-repository-subscription).
    *
    * Note that subscriptions are only generated if a user is participating in a conversation--for example, they've replied to the thread, were **@mentioned**, or manually subscribe to a thread.
    */
  def getThreadSubscriptionForAuthenticatedUser(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActivityGetThreadSubscriptionForAuthenticatedUserResponse> */ _
  ] = js.native
  def getThreadSubscriptionForAuthenticatedUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityGetThreadSubscriptionForAuthenticatedUserParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActivityGetThreadSubscriptionForAuthenticatedUserResponse> */ _
  ] = js.native
  /**
    * If you are authenticated as the given user, you will see your private events. Otherwise, you'll only see public events.
    */
  def listEventsForAuthenticatedUser(): js.Promise[AnyResponse] = js.native
  def listEventsForAuthenticatedUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityListEventsForAuthenticatedUserParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * This is the user's organization dashboard. You must be authenticated as the user to view this.
    * @deprecated octokit.activity.listEventsForOrg() has been renamed to octokit.activity.listOrgEventsForAuthenticatedUser() (2020-03-25)
    */
  def listEventsForOrg(): js.Promise[AnyResponse] = js.native
  def listEventsForOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityListEventsForOrgParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * If you are authenticated as the given user, you will see your private events. Otherwise, you'll only see public events.
    * @deprecated octokit.activity.listEventsForUser() has been renamed to octokit.activity.listEventsForAuthenticatedUser() (2020-03-25)
    */
  def listEventsForUser(): js.Promise[AnyResponse] = js.native
  def listEventsForUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityListEventsForUserParams
  ): js.Promise[AnyResponse] = js.native
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
    * @deprecated octokit.activity.listFeeds() has been renamed to octokit.activity.getFeeds() (2020-03-25)
    */
  def listFeeds(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListBlockedResponse> */ _
  ] = js.native
  def listFeeds(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with EmptyParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListBlockedResponse> */ _
  ] = js.native
  /**
    * List all notifications for the current user, sorted by most recently updated.
    *
    * The following example uses the `since` parameter to list notifications that have been updated after the specified time.
    * @deprecated octokit.activity.listNotifications() has been renamed to octokit.activity.listNotificationsForAuthenticatedUser() (2020-03-25)
    */
  def listNotifications(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActivityListNotificationsResponse> */ _
  ] = js.native
  def listNotifications(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityListNotificationsParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActivityListNotificationsResponse> */ _
  ] = js.native
  /**
    * List all notifications for the current user, sorted by most recently updated.
    *
    * The following example uses the `since` parameter to list notifications that have been updated after the specified time.
    */
  def listNotificationsForAuthenticatedUser(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActivityListNotificationsForAuthenticatedUserResponse> */ _
  ] = js.native
  def listNotificationsForAuthenticatedUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityListNotificationsForAuthenticatedUserParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActivityListNotificationsForAuthenticatedUserResponse> */ _
  ] = js.native
  /**
    * List all notifications for the current user.
    * @deprecated octokit.activity.listNotificationsForRepo() has been renamed to octokit.activity.listRepoNotificationsForAuthenticatedUser() (2020-03-25)
    */
  def listNotificationsForRepo(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActivityListNotificationsForRepoResponse> */ _
  ] = js.native
  def listNotificationsForRepo(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityListNotificationsForRepoParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActivityListNotificationsForRepoResponse> */ _
  ] = js.native
  /**
    * This is the user's organization dashboard. You must be authenticated as the user to view this.
    */
  def listOrgEventsForAuthenticatedUser(): js.Promise[AnyResponse] = js.native
  def listOrgEventsForAuthenticatedUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityListOrgEventsForAuthenticatedUserParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * We delay the public events feed by five minutes, which means the most recent event returned by the public events API actually occurred at least five minutes ago.
    */
  def listPublicEvents(): js.Promise[AnyResponse] = js.native
  def listPublicEvents(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityListPublicEventsParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * @deprecated octokit.activity.listPublicEventsForOrg() has been renamed to octokit.activity.listPublicOrgEvents() (2020-03-25)
    */
  def listPublicEventsForOrg(): js.Promise[AnyResponse] = js.native
  def listPublicEventsForOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityListPublicEventsForOrgParams
  ): js.Promise[AnyResponse] = js.native
  def listPublicEventsForRepoNetwork(): js.Promise[AnyResponse] = js.native
  def listPublicEventsForRepoNetwork(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityListPublicEventsForRepoNetworkParams
  ): js.Promise[AnyResponse] = js.native
  def listPublicEventsForUser(): js.Promise[AnyResponse] = js.native
  def listPublicEventsForUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityListPublicEventsForUserParams
  ): js.Promise[AnyResponse] = js.native
  def listPublicOrgEvents(): js.Promise[AnyResponse] = js.native
  def listPublicOrgEvents(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityListPublicOrgEventsParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * These are events that you've received by watching repos and following users. If you are authenticated as the given user, you will see private events. Otherwise, you'll only see public events.
    */
  def listReceivedEventsForUser(): js.Promise[AnyResponse] = js.native
  def listReceivedEventsForUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityListReceivedEventsForUserParams
  ): js.Promise[AnyResponse] = js.native
  def listReceivedPublicEventsForUser(): js.Promise[AnyResponse] = js.native
  def listReceivedPublicEventsForUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityListReceivedPublicEventsForUserParams
  ): js.Promise[AnyResponse] = js.native
  def listRepoEvents(): js.Promise[AnyResponse] = js.native
  def listRepoEvents(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityListRepoEventsParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * List all notifications for the current user.
    */
  def listRepoNotificationsForAuthenticatedUser(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActivityListRepoNotificationsForAuthenticatedUserResponse> */ _
  ] = js.native
  def listRepoNotificationsForAuthenticatedUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityListRepoNotificationsForAuthenticatedUserParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActivityListRepoNotificationsForAuthenticatedUserResponse> */ _
  ] = js.native
  /**
    * Lists repositories the authenticated user has starred.
    *
    * You can also find out _when_ stars were created by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  def listReposStarredByAuthenticatedUser(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActivityListReposStarredByAuthenticatedUserResponse> */ _
  ] = js.native
  def listReposStarredByAuthenticatedUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityListReposStarredByAuthenticatedUserParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActivityListReposStarredByAuthenticatedUserResponse> */ _
  ] = js.native
  /**
    * Lists repositories a user has starred.
    *
    * You can also find out _when_ stars were created by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  def listReposStarredByUser(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActivityListReposStarredByUserResponse> */ _
  ] = js.native
  def listReposStarredByUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityListReposStarredByUserParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActivityListReposStarredByUserResponse> */ _
  ] = js.native
  /**
    * Lists repositories a user is watching.
    */
  def listReposWatchedByUser(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActivityListReposWatchedByUserResponse> */ _
  ] = js.native
  def listReposWatchedByUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityListReposWatchedByUserParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActivityListReposWatchedByUserResponse> */ _
  ] = js.native
  /**
    * Lists the people that have starred the repository.
    *
    * You can also find out _when_ stars were created by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  def listStargazersForRepo(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActivityListStargazersForRepoResponse> */ _
  ] = js.native
  def listStargazersForRepo(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityListStargazersForRepoParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActivityListStargazersForRepoResponse> */ _
  ] = js.native
  /**
    * Lists repositories the authenticated user is watching.
    */
  def listWatchedReposForAuthenticatedUser(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActivityListWatchedReposForAuthenticatedUserResponse> */ _
  ] = js.native
  def listWatchedReposForAuthenticatedUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityListWatchedReposForAuthenticatedUserParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActivityListWatchedReposForAuthenticatedUserResponse> */ _
  ] = js.native
  /**
    * Lists the people watching the specified repository.
    */
  def listWatchersForRepo(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActivityListWatchersForRepoResponse> */ _
  ] = js.native
  def listWatchersForRepo(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityListWatchersForRepoParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActivityListWatchersForRepoResponse> */ _
  ] = js.native
  /**
    * Marks all notifications as "read" removes it from the [default view on GitHub](https://github.com/notifications). If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List notifications for the authenticated user](https://developer.github.com/v3/activity/notifications/#list-notifications-for-the-authenticated-user) endpoint and pass the query parameter `all=false`.
    * @deprecated octokit.activity.markAsRead() has been renamed to octokit.activity.markNotificationsAsRead() (2020-03-25)
    */
  def markAsRead(): js.Promise[AnyResponse] = js.native
  def markAsRead(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityMarkAsReadParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Marks all notifications as "read" removes it from the [default view on GitHub](https://github.com/notifications). If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List notifications for the authenticated user](https://developer.github.com/v3/activity/notifications/#list-notifications-for-the-authenticated-user) endpoint and pass the query parameter `all=false`.
    */
  def markNotificationsAsRead(): js.Promise[AnyResponse] = js.native
  def markNotificationsAsRead(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityMarkNotificationsAsReadParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Marks all notifications in a repository as "read" removes them from the [default view on GitHub](https://github.com/notifications). If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List repository notifications for the authenticated user](https://developer.github.com/v3/activity/notifications/#list-repository-notifications-for-the-authenticated-user) endpoint and pass the query parameter `all=false`.
    * @deprecated octokit.activity.markNotificationsAsReadForRepo() has been renamed to octokit.activity.markRepoNotificationsAsRead() (2020-03-25)
    */
  def markNotificationsAsReadForRepo(): js.Promise[AnyResponse] = js.native
  def markNotificationsAsReadForRepo(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityMarkNotificationsAsReadForRepoParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Marks all notifications in a repository as "read" removes them from the [default view on GitHub](https://github.com/notifications). If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List repository notifications for the authenticated user](https://developer.github.com/v3/activity/notifications/#list-repository-notifications-for-the-authenticated-user) endpoint and pass the query parameter `all=false`.
    */
  def markRepoNotificationsAsRead(): js.Promise[AnyResponse] = js.native
  def markRepoNotificationsAsRead(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityMarkRepoNotificationsAsReadParams
  ): js.Promise[AnyResponse] = js.native
  def markThreadAsRead(): js.Promise[AnyResponse] = js.native
  def markThreadAsRead(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityMarkThreadAsReadParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * If you would like to watch a repository, set `subscribed` to `true`. If you would like to ignore notifications made within a repository, set `ignored` to `true`. If you would like to stop watching a repository, [delete the repository's subscription](https://developer.github.com/v3/activity/watching/#delete-a-repository-subscription) completely.
    */
  def setRepoSubscription(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActivitySetRepoSubscriptionResponse> */ _
  ] = js.native
  def setRepoSubscription(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivitySetRepoSubscriptionParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActivitySetRepoSubscriptionResponse> */ _
  ] = js.native
  /**
    * If you are watching a repository, you receive notifications for all threads by default. Use this endpoint to ignore future notifications for threads until you comment on the thread or get an **@mention**.
    *
    * You can also use this endpoint to subscribe to threads that you are currently not receiving notifications for or to subscribed to threads that you have previously ignored.
    *
    * Unsubscribing from a conversation in a repository that you are not watching is functionally equivalent to the [Delete a thread subscription](https://developer.github.com/v3/activity/notifications/#delete-a-thread-subscription) endpoint.
    */
  def setThreadSubscription(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActivitySetThreadSubscriptionResponse> */ _
  ] = js.native
  def setThreadSubscription(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivitySetThreadSubscriptionParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActivitySetThreadSubscriptionResponse> */ _
  ] = js.native
  /**
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    * @deprecated octokit.activity.starRepo() has been renamed to octokit.activity.starRepoForAuthenticatedUser() (2020-03-25)
    */
  def starRepo(): js.Promise[AnyResponse] = js.native
  def starRepo(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityStarRepoParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  def starRepoForAuthenticatedUser(): js.Promise[AnyResponse] = js.native
  def starRepoForAuthenticatedUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityStarRepoForAuthenticatedUserParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * @deprecated octokit.activity.unstarRepo() has been renamed to octokit.activity.unstarRepoForAuthenticatedUser() (2020-03-25)
    */
  def unstarRepo(): js.Promise[AnyResponse] = js.native
  def unstarRepo(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityUnstarRepoParams
  ): js.Promise[AnyResponse] = js.native
  def unstarRepoForAuthenticatedUser(): js.Promise[AnyResponse] = js.native
  def unstarRepoForAuthenticatedUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActivityUnstarRepoForAuthenticatedUserParams
  ): js.Promise[AnyResponse] = js.native
}

