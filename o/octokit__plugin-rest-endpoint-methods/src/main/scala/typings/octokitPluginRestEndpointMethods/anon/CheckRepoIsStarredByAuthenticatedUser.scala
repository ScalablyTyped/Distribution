package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckRepoIsStarredByAuthenticatedUser extends StObject {
  
  def checkRepoIsStarredByAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/starred/:owner/:repo']['response'] */ js.Any
  ]
  def checkRepoIsStarredByAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/starred/:owner/:repo']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/starred/:owner/:repo']['response'] */ js.Any
  ]
  @JSName("checkRepoIsStarredByAuthenticatedUser")
  var checkRepoIsStarredByAuthenticatedUser_Original: `36`
  
  /**
    * This endpoint should only be used to stop watching a repository. To control whether or not you wish to receive notifications from a repository, [set the repository's subscription manually](https://developer.github.com/v3/activity/watching/#set-a-repository-subscription).
    */
  def deleteRepoSubscription(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/subscription']['response'] */ js.Any
  ]
  def deleteRepoSubscription(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/subscription']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/subscription']['response'] */ js.Any
  ]
  /**
    * This endpoint should only be used to stop watching a repository. To control whether or not you wish to receive notifications from a repository, [set the repository's subscription manually](https://developer.github.com/v3/activity/watching/#set-a-repository-subscription).
    */
  @JSName("deleteRepoSubscription")
  var deleteRepoSubscription_Original: `37`
  
  /**
    * Mutes all future notifications for a conversation until you comment on the thread or get an **@mention**. If you are watching the repository of the thread, you will still receive notifications. To ignore future notifications for a repository you are watching, use the [Set a thread subscription](https://developer.github.com/v3/activity/notifications/#set-a-thread-subscription) endpoint and set `ignore` to `true`.
    */
  def deleteThreadSubscription(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /notifications/threads/:thread_id/subscription']['response'] */ js.Any
  ]
  def deleteThreadSubscription(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /notifications/threads/:thread_id/subscription']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /notifications/threads/:thread_id/subscription']['response'] */ js.Any
  ]
  /**
    * Mutes all future notifications for a conversation until you comment on the thread or get an **@mention**. If you are watching the repository of the thread, you will still receive notifications. To ignore future notifications for a repository you are watching, use the [Set a thread subscription](https://developer.github.com/v3/activity/notifications/#set-a-thread-subscription) endpoint and set `ignore` to `true`.
    */
  @JSName("deleteThreadSubscription")
  var deleteThreadSubscription_Original: `38`
  
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
  ]
  def getFeeds(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /feeds']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /feeds']['response'] */ js.Any
  ]
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
  var getFeeds_Original: `39`
  
  def getRepoSubscription(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/subscription']['response'] */ js.Any
  ]
  def getRepoSubscription(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/subscription']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/subscription']['response'] */ js.Any
  ]
  @JSName("getRepoSubscription")
  var getRepoSubscription_Original: `40`
  
  def getThread(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /notifications/threads/:thread_id']['response'] */ js.Any
  ]
  def getThread(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /notifications/threads/:thread_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /notifications/threads/:thread_id']['response'] */ js.Any
  ]
  
  /**
    * This checks to see if the current user is subscribed to a thread. You can also [get a repository subscription](https://developer.github.com/v3/activity/watching/#get-a-repository-subscription).
    *
    * Note that subscriptions are only generated if a user is participating in a conversation--for example, they've replied to the thread, were **@mentioned**, or manually subscribe to a thread.
    */
  def getThreadSubscriptionForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /notifications/threads/:thread_id/subscription']['response'] */ js.Any
  ]
  def getThreadSubscriptionForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /notifications/threads/:thread_id/subscription']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /notifications/threads/:thread_id/subscription']['response'] */ js.Any
  ]
  /**
    * This checks to see if the current user is subscribed to a thread. You can also [get a repository subscription](https://developer.github.com/v3/activity/watching/#get-a-repository-subscription).
    *
    * Note that subscriptions are only generated if a user is participating in a conversation--for example, they've replied to the thread, were **@mentioned**, or manually subscribe to a thread.
    */
  @JSName("getThreadSubscriptionForAuthenticatedUser")
  var getThreadSubscriptionForAuthenticatedUser_Original: `42`
  
  @JSName("getThread")
  var getThread_Original: `41`
  
  /**
    * If you are authenticated as the given user, you will see your private events. Otherwise, you'll only see public events.
    */
  def listEventsForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/events']['response'] */ js.Any
  ]
  def listEventsForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/events']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/events']['response'] */ js.Any
  ]
  /**
    * If you are authenticated as the given user, you will see your private events. Otherwise, you'll only see public events.
    */
  @JSName("listEventsForAuthenticatedUser")
  var listEventsForAuthenticatedUser_Original: `43`
  
  /**
    * List all notifications for the current user, sorted by most recently updated.
    */
  def listNotificationsForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /notifications']['response'] */ js.Any
  ]
  def listNotificationsForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /notifications']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /notifications']['response'] */ js.Any
  ]
  /**
    * List all notifications for the current user, sorted by most recently updated.
    */
  @JSName("listNotificationsForAuthenticatedUser")
  var listNotificationsForAuthenticatedUser_Original: `44`
  
  /**
    * This is the user's organization dashboard. You must be authenticated as the user to view this.
    */
  def listOrgEventsForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/events/orgs/:org']['response'] */ js.Any
  ]
  def listOrgEventsForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/events/orgs/:org']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/events/orgs/:org']['response'] */ js.Any
  ]
  /**
    * This is the user's organization dashboard. You must be authenticated as the user to view this.
    */
  @JSName("listOrgEventsForAuthenticatedUser")
  var listOrgEventsForAuthenticatedUser_Original: `45`
  
  /**
    * We delay the public events feed by five minutes, which means the most recent event returned by the public events API actually occurred at least five minutes ago.
    */
  def listPublicEvents(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /events']['response'] */ js.Any
  ]
  def listPublicEvents(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /events']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /events']['response'] */ js.Any
  ]
  
  def listPublicEventsForRepoNetwork(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /networks/:owner/:repo/events']['response'] */ js.Any
  ]
  def listPublicEventsForRepoNetwork(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /networks/:owner/:repo/events']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /networks/:owner/:repo/events']['response'] */ js.Any
  ]
  @JSName("listPublicEventsForRepoNetwork")
  var listPublicEventsForRepoNetwork_Original: `47`
  
  def listPublicEventsForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/events/public']['response'] */ js.Any
  ]
  def listPublicEventsForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/events/public']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/events/public']['response'] */ js.Any
  ]
  @JSName("listPublicEventsForUser")
  var listPublicEventsForUser_Original: `48`
  
  /**
    * We delay the public events feed by five minutes, which means the most recent event returned by the public events API actually occurred at least five minutes ago.
    */
  @JSName("listPublicEvents")
  var listPublicEvents_Original: `46`
  
  def listPublicOrgEvents(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/events']['response'] */ js.Any
  ]
  def listPublicOrgEvents(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/events']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/events']['response'] */ js.Any
  ]
  @JSName("listPublicOrgEvents")
  var listPublicOrgEvents_Original: `49`
  
  /**
    * These are events that you've received by watching repos and following users. If you are authenticated as the given user, you will see private events. Otherwise, you'll only see public events.
    */
  def listReceivedEventsForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/received_events']['response'] */ js.Any
  ]
  def listReceivedEventsForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/received_events']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/received_events']['response'] */ js.Any
  ]
  /**
    * These are events that you've received by watching repos and following users. If you are authenticated as the given user, you will see private events. Otherwise, you'll only see public events.
    */
  @JSName("listReceivedEventsForUser")
  var listReceivedEventsForUser_Original: `50`
  
  def listReceivedPublicEventsForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/received_events/public']['response'] */ js.Any
  ]
  def listReceivedPublicEventsForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/received_events/public']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/received_events/public']['response'] */ js.Any
  ]
  @JSName("listReceivedPublicEventsForUser")
  var listReceivedPublicEventsForUser_Original: `51`
  
  def listRepoEvents(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/events']['response'] */ js.Any
  ]
  def listRepoEvents(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/events']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/events']['response'] */ js.Any
  ]
  @JSName("listRepoEvents")
  var listRepoEvents_Original: `52`
  
  /**
    * List all notifications for the current user.
    */
  def listRepoNotificationsForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/notifications']['response'] */ js.Any
  ]
  def listRepoNotificationsForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/notifications']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/notifications']['response'] */ js.Any
  ]
  /**
    * List all notifications for the current user.
    */
  @JSName("listRepoNotificationsForAuthenticatedUser")
  var listRepoNotificationsForAuthenticatedUser_Original: `53`
  
  /**
    * Lists repositories the authenticated user has starred.
    *
    * You can also find out _when_ stars were created by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  def listReposStarredByAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/starred']['response'] */ js.Any
  ]
  def listReposStarredByAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/starred']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/starred']['response'] */ js.Any
  ]
  /**
    * Lists repositories the authenticated user has starred.
    *
    * You can also find out _when_ stars were created by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  @JSName("listReposStarredByAuthenticatedUser")
  var listReposStarredByAuthenticatedUser_Original: `54`
  
  /**
    * Lists repositories a user has starred.
    *
    * You can also find out _when_ stars were created by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  def listReposStarredByUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/starred']['response'] */ js.Any
  ]
  def listReposStarredByUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/starred']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/starred']['response'] */ js.Any
  ]
  /**
    * Lists repositories a user has starred.
    *
    * You can also find out _when_ stars were created by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  @JSName("listReposStarredByUser")
  var listReposStarredByUser_Original: `55`
  
  /**
    * Lists repositories a user is watching.
    */
  def listReposWatchedByUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/subscriptions']['response'] */ js.Any
  ]
  def listReposWatchedByUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/subscriptions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/subscriptions']['response'] */ js.Any
  ]
  /**
    * Lists repositories a user is watching.
    */
  @JSName("listReposWatchedByUser")
  var listReposWatchedByUser_Original: `56`
  
  /**
    * Lists the people that have starred the repository.
    *
    * You can also find out _when_ stars were created by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  def listStargazersForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/stargazers']['response'] */ js.Any
  ]
  def listStargazersForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/stargazers']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/stargazers']['response'] */ js.Any
  ]
  /**
    * Lists the people that have starred the repository.
    *
    * You can also find out _when_ stars were created by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  @JSName("listStargazersForRepo")
  var listStargazersForRepo_Original: `57`
  
  /**
    * Lists repositories the authenticated user is watching.
    */
  def listWatchedReposForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/subscriptions']['response'] */ js.Any
  ]
  def listWatchedReposForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/subscriptions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/subscriptions']['response'] */ js.Any
  ]
  /**
    * Lists repositories the authenticated user is watching.
    */
  @JSName("listWatchedReposForAuthenticatedUser")
  var listWatchedReposForAuthenticatedUser_Original: `58`
  
  /**
    * Lists the people watching the specified repository.
    */
  def listWatchersForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/subscribers']['response'] */ js.Any
  ]
  def listWatchersForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/subscribers']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/subscribers']['response'] */ js.Any
  ]
  /**
    * Lists the people watching the specified repository.
    */
  @JSName("listWatchersForRepo")
  var listWatchersForRepo_Original: `59`
  
  /**
    * Marks all notifications as "read" removes it from the [default view on GitHub](https://github.com/notifications). If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List notifications for the authenticated user](https://developer.github.com/v3/activity/notifications/#list-notifications-for-the-authenticated-user) endpoint and pass the query parameter `all=false`.
    */
  def markNotificationsAsRead(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /notifications']['response'] */ js.Any
  ]
  def markNotificationsAsRead(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /notifications']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /notifications']['response'] */ js.Any
  ]
  /**
    * Marks all notifications as "read" removes it from the [default view on GitHub](https://github.com/notifications). If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List notifications for the authenticated user](https://developer.github.com/v3/activity/notifications/#list-notifications-for-the-authenticated-user) endpoint and pass the query parameter `all=false`.
    */
  @JSName("markNotificationsAsRead")
  var markNotificationsAsRead_Original: `60`
  
  /**
    * Marks all notifications in a repository as "read" removes them from the [default view on GitHub](https://github.com/notifications). If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List repository notifications for the authenticated user](https://developer.github.com/v3/activity/notifications/#list-repository-notifications-for-the-authenticated-user) endpoint and pass the query parameter `all=false`.
    */
  def markRepoNotificationsAsRead(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/notifications']['response'] */ js.Any
  ]
  def markRepoNotificationsAsRead(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/notifications']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/notifications']['response'] */ js.Any
  ]
  /**
    * Marks all notifications in a repository as "read" removes them from the [default view on GitHub](https://github.com/notifications). If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List repository notifications for the authenticated user](https://developer.github.com/v3/activity/notifications/#list-repository-notifications-for-the-authenticated-user) endpoint and pass the query parameter `all=false`.
    */
  @JSName("markRepoNotificationsAsRead")
  var markRepoNotificationsAsRead_Original: `61`
  
  def markThreadAsRead(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /notifications/threads/:thread_id']['response'] */ js.Any
  ]
  def markThreadAsRead(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /notifications/threads/:thread_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /notifications/threads/:thread_id']['response'] */ js.Any
  ]
  @JSName("markThreadAsRead")
  var markThreadAsRead_Original: `62`
  
  /**
    * If you would like to watch a repository, set `subscribed` to `true`. If you would like to ignore notifications made within a repository, set `ignored` to `true`. If you would like to stop watching a repository, [delete the repository's subscription](https://developer.github.com/v3/activity/watching/#delete-a-repository-subscription) completely.
    */
  def setRepoSubscription(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/subscription']['response'] */ js.Any
  ]
  def setRepoSubscription(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/subscription']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/subscription']['response'] */ js.Any
  ]
  /**
    * If you would like to watch a repository, set `subscribed` to `true`. If you would like to ignore notifications made within a repository, set `ignored` to `true`. If you would like to stop watching a repository, [delete the repository's subscription](https://developer.github.com/v3/activity/watching/#delete-a-repository-subscription) completely.
    */
  @JSName("setRepoSubscription")
  var setRepoSubscription_Original: `63`
  
  /**
    * If you are watching a repository, you receive notifications for all threads by default. Use this endpoint to ignore future notifications for threads until you comment on the thread or get an **@mention**.
    *
    * You can also use this endpoint to subscribe to threads that you are currently not receiving notifications for or to subscribed to threads that you have previously ignored.
    *
    * Unsubscribing from a conversation in a repository that you are not watching is functionally equivalent to the [Delete a thread subscription](https://developer.github.com/v3/activity/notifications/#delete-a-thread-subscription) endpoint.
    */
  def setThreadSubscription(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /notifications/threads/:thread_id/subscription']['response'] */ js.Any
  ]
  def setThreadSubscription(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /notifications/threads/:thread_id/subscription']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /notifications/threads/:thread_id/subscription']['response'] */ js.Any
  ]
  /**
    * If you are watching a repository, you receive notifications for all threads by default. Use this endpoint to ignore future notifications for threads until you comment on the thread or get an **@mention**.
    *
    * You can also use this endpoint to subscribe to threads that you are currently not receiving notifications for or to subscribed to threads that you have previously ignored.
    *
    * Unsubscribing from a conversation in a repository that you are not watching is functionally equivalent to the [Delete a thread subscription](https://developer.github.com/v3/activity/notifications/#delete-a-thread-subscription) endpoint.
    */
  @JSName("setThreadSubscription")
  var setThreadSubscription_Original: `64`
  
  /**
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  def starRepoForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /user/starred/:owner/:repo']['response'] */ js.Any
  ]
  def starRepoForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /user/starred/:owner/:repo']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /user/starred/:owner/:repo']['response'] */ js.Any
  ]
  /**
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  @JSName("starRepoForAuthenticatedUser")
  var starRepoForAuthenticatedUser_Original: `65`
  
  def unstarRepoForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/starred/:owner/:repo']['response'] */ js.Any
  ]
  def unstarRepoForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/starred/:owner/:repo']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/starred/:owner/:repo']['response'] */ js.Any
  ]
  @JSName("unstarRepoForAuthenticatedUser")
  var unstarRepoForAuthenticatedUser_Original: `66`
}
object CheckRepoIsStarredByAuthenticatedUser {
  
  inline def apply(
    checkRepoIsStarredByAuthenticatedUser: `36`,
    deleteRepoSubscription: `37`,
    deleteThreadSubscription: `38`,
    getFeeds: `39`,
    getRepoSubscription: `40`,
    getThread: `41`,
    getThreadSubscriptionForAuthenticatedUser: `42`,
    listEventsForAuthenticatedUser: `43`,
    listNotificationsForAuthenticatedUser: `44`,
    listOrgEventsForAuthenticatedUser: `45`,
    listPublicEvents: `46`,
    listPublicEventsForRepoNetwork: `47`,
    listPublicEventsForUser: `48`,
    listPublicOrgEvents: `49`,
    listReceivedEventsForUser: `50`,
    listReceivedPublicEventsForUser: `51`,
    listRepoEvents: `52`,
    listRepoNotificationsForAuthenticatedUser: `53`,
    listReposStarredByAuthenticatedUser: `54`,
    listReposStarredByUser: `55`,
    listReposWatchedByUser: `56`,
    listStargazersForRepo: `57`,
    listWatchedReposForAuthenticatedUser: `58`,
    listWatchersForRepo: `59`,
    markNotificationsAsRead: `60`,
    markRepoNotificationsAsRead: `61`,
    markThreadAsRead: `62`,
    setRepoSubscription: `63`,
    setThreadSubscription: `64`,
    starRepoForAuthenticatedUser: `65`,
    unstarRepoForAuthenticatedUser: `66`
  ): CheckRepoIsStarredByAuthenticatedUser = {
    val __obj = js.Dynamic.literal(checkRepoIsStarredByAuthenticatedUser = checkRepoIsStarredByAuthenticatedUser.asInstanceOf[js.Any], deleteRepoSubscription = deleteRepoSubscription.asInstanceOf[js.Any], deleteThreadSubscription = deleteThreadSubscription.asInstanceOf[js.Any], getFeeds = getFeeds.asInstanceOf[js.Any], getRepoSubscription = getRepoSubscription.asInstanceOf[js.Any], getThread = getThread.asInstanceOf[js.Any], getThreadSubscriptionForAuthenticatedUser = getThreadSubscriptionForAuthenticatedUser.asInstanceOf[js.Any], listEventsForAuthenticatedUser = listEventsForAuthenticatedUser.asInstanceOf[js.Any], listNotificationsForAuthenticatedUser = listNotificationsForAuthenticatedUser.asInstanceOf[js.Any], listOrgEventsForAuthenticatedUser = listOrgEventsForAuthenticatedUser.asInstanceOf[js.Any], listPublicEvents = listPublicEvents.asInstanceOf[js.Any], listPublicEventsForRepoNetwork = listPublicEventsForRepoNetwork.asInstanceOf[js.Any], listPublicEventsForUser = listPublicEventsForUser.asInstanceOf[js.Any], listPublicOrgEvents = listPublicOrgEvents.asInstanceOf[js.Any], listReceivedEventsForUser = listReceivedEventsForUser.asInstanceOf[js.Any], listReceivedPublicEventsForUser = listReceivedPublicEventsForUser.asInstanceOf[js.Any], listRepoEvents = listRepoEvents.asInstanceOf[js.Any], listRepoNotificationsForAuthenticatedUser = listRepoNotificationsForAuthenticatedUser.asInstanceOf[js.Any], listReposStarredByAuthenticatedUser = listReposStarredByAuthenticatedUser.asInstanceOf[js.Any], listReposStarredByUser = listReposStarredByUser.asInstanceOf[js.Any], listReposWatchedByUser = listReposWatchedByUser.asInstanceOf[js.Any], listStargazersForRepo = listStargazersForRepo.asInstanceOf[js.Any], listWatchedReposForAuthenticatedUser = listWatchedReposForAuthenticatedUser.asInstanceOf[js.Any], listWatchersForRepo = listWatchersForRepo.asInstanceOf[js.Any], markNotificationsAsRead = markNotificationsAsRead.asInstanceOf[js.Any], markRepoNotificationsAsRead = markRepoNotificationsAsRead.asInstanceOf[js.Any], markThreadAsRead = markThreadAsRead.asInstanceOf[js.Any], setRepoSubscription = setRepoSubscription.asInstanceOf[js.Any], setThreadSubscription = setThreadSubscription.asInstanceOf[js.Any], starRepoForAuthenticatedUser = starRepoForAuthenticatedUser.asInstanceOf[js.Any], unstarRepoForAuthenticatedUser = unstarRepoForAuthenticatedUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckRepoIsStarredByAuthenticatedUser]
  }
  
  extension [Self <: CheckRepoIsStarredByAuthenticatedUser](x: Self) {
    
    inline def setCheckRepoIsStarredByAuthenticatedUser(value: `36`): Self = StObject.set(x, "checkRepoIsStarredByAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setDeleteRepoSubscription(value: `37`): Self = StObject.set(x, "deleteRepoSubscription", value.asInstanceOf[js.Any])
    
    inline def setDeleteThreadSubscription(value: `38`): Self = StObject.set(x, "deleteThreadSubscription", value.asInstanceOf[js.Any])
    
    inline def setGetFeeds(value: `39`): Self = StObject.set(x, "getFeeds", value.asInstanceOf[js.Any])
    
    inline def setGetRepoSubscription(value: `40`): Self = StObject.set(x, "getRepoSubscription", value.asInstanceOf[js.Any])
    
    inline def setGetThread(value: `41`): Self = StObject.set(x, "getThread", value.asInstanceOf[js.Any])
    
    inline def setGetThreadSubscriptionForAuthenticatedUser(value: `42`): Self = StObject.set(x, "getThreadSubscriptionForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListEventsForAuthenticatedUser(value: `43`): Self = StObject.set(x, "listEventsForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListNotificationsForAuthenticatedUser(value: `44`): Self = StObject.set(x, "listNotificationsForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListOrgEventsForAuthenticatedUser(value: `45`): Self = StObject.set(x, "listOrgEventsForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListPublicEvents(value: `46`): Self = StObject.set(x, "listPublicEvents", value.asInstanceOf[js.Any])
    
    inline def setListPublicEventsForRepoNetwork(value: `47`): Self = StObject.set(x, "listPublicEventsForRepoNetwork", value.asInstanceOf[js.Any])
    
    inline def setListPublicEventsForUser(value: `48`): Self = StObject.set(x, "listPublicEventsForUser", value.asInstanceOf[js.Any])
    
    inline def setListPublicOrgEvents(value: `49`): Self = StObject.set(x, "listPublicOrgEvents", value.asInstanceOf[js.Any])
    
    inline def setListReceivedEventsForUser(value: `50`): Self = StObject.set(x, "listReceivedEventsForUser", value.asInstanceOf[js.Any])
    
    inline def setListReceivedPublicEventsForUser(value: `51`): Self = StObject.set(x, "listReceivedPublicEventsForUser", value.asInstanceOf[js.Any])
    
    inline def setListRepoEvents(value: `52`): Self = StObject.set(x, "listRepoEvents", value.asInstanceOf[js.Any])
    
    inline def setListRepoNotificationsForAuthenticatedUser(value: `53`): Self = StObject.set(x, "listRepoNotificationsForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListReposStarredByAuthenticatedUser(value: `54`): Self = StObject.set(x, "listReposStarredByAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListReposStarredByUser(value: `55`): Self = StObject.set(x, "listReposStarredByUser", value.asInstanceOf[js.Any])
    
    inline def setListReposWatchedByUser(value: `56`): Self = StObject.set(x, "listReposWatchedByUser", value.asInstanceOf[js.Any])
    
    inline def setListStargazersForRepo(value: `57`): Self = StObject.set(x, "listStargazersForRepo", value.asInstanceOf[js.Any])
    
    inline def setListWatchedReposForAuthenticatedUser(value: `58`): Self = StObject.set(x, "listWatchedReposForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListWatchersForRepo(value: `59`): Self = StObject.set(x, "listWatchersForRepo", value.asInstanceOf[js.Any])
    
    inline def setMarkNotificationsAsRead(value: `60`): Self = StObject.set(x, "markNotificationsAsRead", value.asInstanceOf[js.Any])
    
    inline def setMarkRepoNotificationsAsRead(value: `61`): Self = StObject.set(x, "markRepoNotificationsAsRead", value.asInstanceOf[js.Any])
    
    inline def setMarkThreadAsRead(value: `62`): Self = StObject.set(x, "markThreadAsRead", value.asInstanceOf[js.Any])
    
    inline def setSetRepoSubscription(value: `63`): Self = StObject.set(x, "setRepoSubscription", value.asInstanceOf[js.Any])
    
    inline def setSetThreadSubscription(value: `64`): Self = StObject.set(x, "setThreadSubscription", value.asInstanceOf[js.Any])
    
    inline def setStarRepoForAuthenticatedUser(value: `65`): Self = StObject.set(x, "starRepoForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setUnstarRepoForAuthenticatedUser(value: `66`): Self = StObject.set(x, "unstarRepoForAuthenticatedUser", value.asInstanceOf[js.Any])
  }
}
