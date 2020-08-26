package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckRepoIsStarredByAuthenticatedUser extends js.Object {
  @JSName("checkRepoIsStarredByAuthenticatedUser")
  var checkRepoIsStarredByAuthenticatedUser_Original: `36` = js.native
  /**
    * This endpoint should only be used to stop watching a repository. To control whether or not you wish to receive notifications from a repository, [set the repository's subscription manually](https://developer.github.com/v3/activity/watching/#set-a-repository-subscription).
    */
  @JSName("deleteRepoSubscription")
  var deleteRepoSubscription_Original: `37` = js.native
  /**
    * Mutes all future notifications for a conversation until you comment on the thread or get an **@mention**. If you are watching the repository of the thread, you will still receive notifications. To ignore future notifications for a repository you are watching, use the [Set a thread subscription](https://developer.github.com/v3/activity/notifications/#set-a-thread-subscription) endpoint and set `ignore` to `true`.
    */
  @JSName("deleteThreadSubscription")
  var deleteThreadSubscription_Original: `38` = js.native
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
  var getFeeds_Original: `39` = js.native
  @JSName("getRepoSubscription")
  var getRepoSubscription_Original: `40` = js.native
  /**
    * This checks to see if the current user is subscribed to a thread. You can also [get a repository subscription](https://developer.github.com/v3/activity/watching/#get-a-repository-subscription).
    *
    * Note that subscriptions are only generated if a user is participating in a conversation--for example, they've replied to the thread, were **@mentioned**, or manually subscribe to a thread.
    */
  @JSName("getThreadSubscriptionForAuthenticatedUser")
  var getThreadSubscriptionForAuthenticatedUser_Original: `42` = js.native
  @JSName("getThread")
  var getThread_Original: `41` = js.native
  /**
    * If you are authenticated as the given user, you will see your private events. Otherwise, you'll only see public events.
    */
  @JSName("listEventsForAuthenticatedUser")
  var listEventsForAuthenticatedUser_Original: `43` = js.native
  /**
    * List all notifications for the current user, sorted by most recently updated.
    */
  @JSName("listNotificationsForAuthenticatedUser")
  var listNotificationsForAuthenticatedUser_Original: `44` = js.native
  /**
    * This is the user's organization dashboard. You must be authenticated as the user to view this.
    */
  @JSName("listOrgEventsForAuthenticatedUser")
  var listOrgEventsForAuthenticatedUser_Original: `45` = js.native
  @JSName("listPublicEventsForRepoNetwork")
  var listPublicEventsForRepoNetwork_Original: `47` = js.native
  @JSName("listPublicEventsForUser")
  var listPublicEventsForUser_Original: `48` = js.native
  /**
    * We delay the public events feed by five minutes, which means the most recent event returned by the public events API actually occurred at least five minutes ago.
    */
  @JSName("listPublicEvents")
  var listPublicEvents_Original: `46` = js.native
  @JSName("listPublicOrgEvents")
  var listPublicOrgEvents_Original: `49` = js.native
  /**
    * These are events that you've received by watching repos and following users. If you are authenticated as the given user, you will see private events. Otherwise, you'll only see public events.
    */
  @JSName("listReceivedEventsForUser")
  var listReceivedEventsForUser_Original: `50` = js.native
  @JSName("listReceivedPublicEventsForUser")
  var listReceivedPublicEventsForUser_Original: `51` = js.native
  @JSName("listRepoEvents")
  var listRepoEvents_Original: `52` = js.native
  /**
    * List all notifications for the current user.
    */
  @JSName("listRepoNotificationsForAuthenticatedUser")
  var listRepoNotificationsForAuthenticatedUser_Original: `53` = js.native
  /**
    * Lists repositories the authenticated user has starred.
    *
    * You can also find out _when_ stars were created by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  @JSName("listReposStarredByAuthenticatedUser")
  var listReposStarredByAuthenticatedUser_Original: `54` = js.native
  /**
    * Lists repositories a user has starred.
    *
    * You can also find out _when_ stars were created by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  @JSName("listReposStarredByUser")
  var listReposStarredByUser_Original: `55` = js.native
  /**
    * Lists repositories a user is watching.
    */
  @JSName("listReposWatchedByUser")
  var listReposWatchedByUser_Original: `56` = js.native
  /**
    * Lists the people that have starred the repository.
    *
    * You can also find out _when_ stars were created by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  @JSName("listStargazersForRepo")
  var listStargazersForRepo_Original: `57` = js.native
  /**
    * Lists repositories the authenticated user is watching.
    */
  @JSName("listWatchedReposForAuthenticatedUser")
  var listWatchedReposForAuthenticatedUser_Original: `58` = js.native
  /**
    * Lists the people watching the specified repository.
    */
  @JSName("listWatchersForRepo")
  var listWatchersForRepo_Original: `59` = js.native
  /**
    * Marks all notifications as "read" removes it from the [default view on GitHub](https://github.com/notifications). If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List notifications for the authenticated user](https://developer.github.com/v3/activity/notifications/#list-notifications-for-the-authenticated-user) endpoint and pass the query parameter `all=false`.
    */
  @JSName("markNotificationsAsRead")
  var markNotificationsAsRead_Original: `60` = js.native
  /**
    * Marks all notifications in a repository as "read" removes them from the [default view on GitHub](https://github.com/notifications). If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List repository notifications for the authenticated user](https://developer.github.com/v3/activity/notifications/#list-repository-notifications-for-the-authenticated-user) endpoint and pass the query parameter `all=false`.
    */
  @JSName("markRepoNotificationsAsRead")
  var markRepoNotificationsAsRead_Original: `61` = js.native
  @JSName("markThreadAsRead")
  var markThreadAsRead_Original: `62` = js.native
  /**
    * If you would like to watch a repository, set `subscribed` to `true`. If you would like to ignore notifications made within a repository, set `ignored` to `true`. If you would like to stop watching a repository, [delete the repository's subscription](https://developer.github.com/v3/activity/watching/#delete-a-repository-subscription) completely.
    */
  @JSName("setRepoSubscription")
  var setRepoSubscription_Original: `63` = js.native
  /**
    * If you are watching a repository, you receive notifications for all threads by default. Use this endpoint to ignore future notifications for threads until you comment on the thread or get an **@mention**.
    *
    * You can also use this endpoint to subscribe to threads that you are currently not receiving notifications for or to subscribed to threads that you have previously ignored.
    *
    * Unsubscribing from a conversation in a repository that you are not watching is functionally equivalent to the [Delete a thread subscription](https://developer.github.com/v3/activity/notifications/#delete-a-thread-subscription) endpoint.
    */
  @JSName("setThreadSubscription")
  var setThreadSubscription_Original: `64` = js.native
  /**
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  @JSName("starRepoForAuthenticatedUser")
  var starRepoForAuthenticatedUser_Original: `65` = js.native
  @JSName("unstarRepoForAuthenticatedUser")
  var unstarRepoForAuthenticatedUser_Original: `66` = js.native
  def checkRepoIsStarredByAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/starred/:owner/:repo']['response'] */ js.Any
  ] = js.native
  def checkRepoIsStarredByAuthenticatedUser(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/starred/:owner/:repo']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/starred/:owner/:repo']['response'] */ js.Any
  ] = js.native
  /**
    * This endpoint should only be used to stop watching a repository. To control whether or not you wish to receive notifications from a repository, [set the repository's subscription manually](https://developer.github.com/v3/activity/watching/#set-a-repository-subscription).
    */
  def deleteRepoSubscription(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/subscription']['response'] */ js.Any
  ] = js.native
  def deleteRepoSubscription(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/subscription']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/subscription']['response'] */ js.Any
  ] = js.native
  /**
    * Mutes all future notifications for a conversation until you comment on the thread or get an **@mention**. If you are watching the repository of the thread, you will still receive notifications. To ignore future notifications for a repository you are watching, use the [Set a thread subscription](https://developer.github.com/v3/activity/notifications/#set-a-thread-subscription) endpoint and set `ignore` to `true`.
    */
  def deleteThreadSubscription(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /notifications/threads/:thread_id/subscription']['response'] */ js.Any
  ] = js.native
  def deleteThreadSubscription(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /notifications/threads/:thread_id/subscription']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /notifications/threads/:thread_id/subscription']['response'] */ js.Any
  ] = js.native
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
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /feeds']['response'] */ js.Any
  ] = js.native
  def getFeeds(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /feeds']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /feeds']['response'] */ js.Any
  ] = js.native
  def getRepoSubscription(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/subscription']['response'] */ js.Any
  ] = js.native
  def getRepoSubscription(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/subscription']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/subscription']['response'] */ js.Any
  ] = js.native
  def getThread(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /notifications/threads/:thread_id']['response'] */ js.Any
  ] = js.native
  def getThread(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /notifications/threads/:thread_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /notifications/threads/:thread_id']['response'] */ js.Any
  ] = js.native
  /**
    * This checks to see if the current user is subscribed to a thread. You can also [get a repository subscription](https://developer.github.com/v3/activity/watching/#get-a-repository-subscription).
    *
    * Note that subscriptions are only generated if a user is participating in a conversation--for example, they've replied to the thread, were **@mentioned**, or manually subscribe to a thread.
    */
  def getThreadSubscriptionForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /notifications/threads/:thread_id/subscription']['response'] */ js.Any
  ] = js.native
  def getThreadSubscriptionForAuthenticatedUser(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /notifications/threads/:thread_id/subscription']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /notifications/threads/:thread_id/subscription']['response'] */ js.Any
  ] = js.native
  /**
    * If you are authenticated as the given user, you will see your private events. Otherwise, you'll only see public events.
    */
  def listEventsForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/events']['response'] */ js.Any
  ] = js.native
  def listEventsForAuthenticatedUser(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/events']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/events']['response'] */ js.Any
  ] = js.native
  /**
    * List all notifications for the current user, sorted by most recently updated.
    */
  def listNotificationsForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /notifications']['response'] */ js.Any
  ] = js.native
  def listNotificationsForAuthenticatedUser(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /notifications']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /notifications']['response'] */ js.Any
  ] = js.native
  /**
    * This is the user's organization dashboard. You must be authenticated as the user to view this.
    */
  def listOrgEventsForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/events/orgs/:org']['response'] */ js.Any
  ] = js.native
  def listOrgEventsForAuthenticatedUser(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/events/orgs/:org']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/events/orgs/:org']['response'] */ js.Any
  ] = js.native
  /**
    * We delay the public events feed by five minutes, which means the most recent event returned by the public events API actually occurred at least five minutes ago.
    */
  def listPublicEvents(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /events']['response'] */ js.Any
  ] = js.native
  def listPublicEvents(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /events']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /events']['response'] */ js.Any
  ] = js.native
  def listPublicEventsForRepoNetwork(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /networks/:owner/:repo/events']['response'] */ js.Any
  ] = js.native
  def listPublicEventsForRepoNetwork(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /networks/:owner/:repo/events']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /networks/:owner/:repo/events']['response'] */ js.Any
  ] = js.native
  def listPublicEventsForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/events/public']['response'] */ js.Any
  ] = js.native
  def listPublicEventsForUser(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/events/public']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/events/public']['response'] */ js.Any
  ] = js.native
  def listPublicOrgEvents(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/events']['response'] */ js.Any
  ] = js.native
  def listPublicOrgEvents(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/events']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/events']['response'] */ js.Any
  ] = js.native
  /**
    * These are events that you've received by watching repos and following users. If you are authenticated as the given user, you will see private events. Otherwise, you'll only see public events.
    */
  def listReceivedEventsForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/received_events']['response'] */ js.Any
  ] = js.native
  def listReceivedEventsForUser(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/received_events']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/received_events']['response'] */ js.Any
  ] = js.native
  def listReceivedPublicEventsForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/received_events/public']['response'] */ js.Any
  ] = js.native
  def listReceivedPublicEventsForUser(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/received_events/public']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/received_events/public']['response'] */ js.Any
  ] = js.native
  def listRepoEvents(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/events']['response'] */ js.Any
  ] = js.native
  def listRepoEvents(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/events']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/events']['response'] */ js.Any
  ] = js.native
  /**
    * List all notifications for the current user.
    */
  def listRepoNotificationsForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/notifications']['response'] */ js.Any
  ] = js.native
  def listRepoNotificationsForAuthenticatedUser(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/notifications']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/notifications']['response'] */ js.Any
  ] = js.native
  /**
    * Lists repositories the authenticated user has starred.
    *
    * You can also find out _when_ stars were created by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  def listReposStarredByAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/starred']['response'] */ js.Any
  ] = js.native
  def listReposStarredByAuthenticatedUser(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/starred']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/starred']['response'] */ js.Any
  ] = js.native
  /**
    * Lists repositories a user has starred.
    *
    * You can also find out _when_ stars were created by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  def listReposStarredByUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/starred']['response'] */ js.Any
  ] = js.native
  def listReposStarredByUser(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/starred']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/starred']['response'] */ js.Any
  ] = js.native
  /**
    * Lists repositories a user is watching.
    */
  def listReposWatchedByUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/subscriptions']['response'] */ js.Any
  ] = js.native
  def listReposWatchedByUser(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/subscriptions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/subscriptions']['response'] */ js.Any
  ] = js.native
  /**
    * Lists the people that have starred the repository.
    *
    * You can also find out _when_ stars were created by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  def listStargazersForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/stargazers']['response'] */ js.Any
  ] = js.native
  def listStargazersForRepo(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/stargazers']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/stargazers']['response'] */ js.Any
  ] = js.native
  /**
    * Lists repositories the authenticated user is watching.
    */
  def listWatchedReposForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/subscriptions']['response'] */ js.Any
  ] = js.native
  def listWatchedReposForAuthenticatedUser(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/subscriptions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/subscriptions']['response'] */ js.Any
  ] = js.native
  /**
    * Lists the people watching the specified repository.
    */
  def listWatchersForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/subscribers']['response'] */ js.Any
  ] = js.native
  def listWatchersForRepo(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/subscribers']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/subscribers']['response'] */ js.Any
  ] = js.native
  /**
    * Marks all notifications as "read" removes it from the [default view on GitHub](https://github.com/notifications). If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List notifications for the authenticated user](https://developer.github.com/v3/activity/notifications/#list-notifications-for-the-authenticated-user) endpoint and pass the query parameter `all=false`.
    */
  def markNotificationsAsRead(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /notifications']['response'] */ js.Any
  ] = js.native
  def markNotificationsAsRead(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /notifications']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /notifications']['response'] */ js.Any
  ] = js.native
  /**
    * Marks all notifications in a repository as "read" removes them from the [default view on GitHub](https://github.com/notifications). If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List repository notifications for the authenticated user](https://developer.github.com/v3/activity/notifications/#list-repository-notifications-for-the-authenticated-user) endpoint and pass the query parameter `all=false`.
    */
  def markRepoNotificationsAsRead(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/notifications']['response'] */ js.Any
  ] = js.native
  def markRepoNotificationsAsRead(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/notifications']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/notifications']['response'] */ js.Any
  ] = js.native
  def markThreadAsRead(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /notifications/threads/:thread_id']['response'] */ js.Any
  ] = js.native
  def markThreadAsRead(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /notifications/threads/:thread_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /notifications/threads/:thread_id']['response'] */ js.Any
  ] = js.native
  /**
    * If you would like to watch a repository, set `subscribed` to `true`. If you would like to ignore notifications made within a repository, set `ignored` to `true`. If you would like to stop watching a repository, [delete the repository's subscription](https://developer.github.com/v3/activity/watching/#delete-a-repository-subscription) completely.
    */
  def setRepoSubscription(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/subscription']['response'] */ js.Any
  ] = js.native
  def setRepoSubscription(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/subscription']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/subscription']['response'] */ js.Any
  ] = js.native
  /**
    * If you are watching a repository, you receive notifications for all threads by default. Use this endpoint to ignore future notifications for threads until you comment on the thread or get an **@mention**.
    *
    * You can also use this endpoint to subscribe to threads that you are currently not receiving notifications for or to subscribed to threads that you have previously ignored.
    *
    * Unsubscribing from a conversation in a repository that you are not watching is functionally equivalent to the [Delete a thread subscription](https://developer.github.com/v3/activity/notifications/#delete-a-thread-subscription) endpoint.
    */
  def setThreadSubscription(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /notifications/threads/:thread_id/subscription']['response'] */ js.Any
  ] = js.native
  def setThreadSubscription(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /notifications/threads/:thread_id/subscription']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /notifications/threads/:thread_id/subscription']['response'] */ js.Any
  ] = js.native
  /**
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  def starRepoForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /user/starred/:owner/:repo']['response'] */ js.Any
  ] = js.native
  def starRepoForAuthenticatedUser(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /user/starred/:owner/:repo']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /user/starred/:owner/:repo']['response'] */ js.Any
  ] = js.native
  def unstarRepoForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/starred/:owner/:repo']['response'] */ js.Any
  ] = js.native
  def unstarRepoForAuthenticatedUser(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/starred/:owner/:repo']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/starred/:owner/:repo']['response'] */ js.Any
  ] = js.native
}

