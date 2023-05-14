package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.distTypesRequestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckRepoIsStarredByAuthenticatedUser extends StObject {
  
  def checkRepoIsStarredByAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/starred/{owner}/{repo}']['response'] */ js.Any
  ]
  def checkRepoIsStarredByAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/starred/{owner}/{repo}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/starred/{owner}/{repo}']['response'] */ js.Any
  ]
  @JSName("checkRepoIsStarredByAuthenticatedUser")
  var checkRepoIsStarredByAuthenticatedUser_Original: `121`
  
  /**
    * This endpoint should only be used to stop watching a repository. To control whether or not you wish to receive notifications from a repository, [set the repository's subscription manually](https://docs.github.com/rest/reference/activity#set-a-repository-subscription).
    */
  def deleteRepoSubscription(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/subscription']['response'] */ js.Any
  ]
  def deleteRepoSubscription(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/subscription']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/subscription']['response'] */ js.Any
  ]
  /**
    * This endpoint should only be used to stop watching a repository. To control whether or not you wish to receive notifications from a repository, [set the repository's subscription manually](https://docs.github.com/rest/reference/activity#set-a-repository-subscription).
    */
  @JSName("deleteRepoSubscription")
  var deleteRepoSubscription_Original: `122`
  
  /**
    * Mutes all future notifications for a conversation until you comment on the thread or get an **@mention**. If you are watching the repository of the thread, you will still receive notifications. To ignore future notifications for a repository you are watching, use the [Set a thread subscription](https://docs.github.com/rest/reference/activity#set-a-thread-subscription) endpoint and set `ignore` to `true`.
    */
  def deleteThreadSubscription(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /notifications/threads/{thread_id}/subscription']['response'] */ js.Any
  ]
  def deleteThreadSubscription(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /notifications/threads/{thread_id}/subscription']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /notifications/threads/{thread_id}/subscription']['response'] */ js.Any
  ]
  /**
    * Mutes all future notifications for a conversation until you comment on the thread or get an **@mention**. If you are watching the repository of the thread, you will still receive notifications. To ignore future notifications for a repository you are watching, use the [Set a thread subscription](https://docs.github.com/rest/reference/activity#set-a-thread-subscription) endpoint and set `ignore` to `true`.
    */
  @JSName("deleteThreadSubscription")
  var deleteThreadSubscription_Original: `123`
  
  /**
    * GitHub provides several timeline resources in [Atom](http://en.wikipedia.org/wiki/Atom_(standard)) format. The Feeds API lists all the feeds available to the authenticated user:
    *
    * *   **Timeline**: The GitHub global public timeline
    * *   **User**: The public timeline for any user, using [URI template](https://docs.github.com/rest/overview/resources-in-the-rest-api#hypermedia)
    * *   **Current user public**: The public timeline for the authenticated user
    * *   **Current user**: The private timeline for the authenticated user
    * *   **Current user actor**: The private timeline for activity created by the authenticated user
    * *   **Current user organizations**: The private timeline for the organizations the authenticated user is a member of.
    * *   **Security advisories**: A collection of public announcements that provide information about security-related vulnerabilities in software on GitHub.
    *
    * **Note**: Private feeds are only returned when [authenticating via Basic Auth](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) since current feed URIs use the older, non revocable auth tokens.
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
    * *   **User**: The public timeline for any user, using [URI template](https://docs.github.com/rest/overview/resources-in-the-rest-api#hypermedia)
    * *   **Current user public**: The public timeline for the authenticated user
    * *   **Current user**: The private timeline for the authenticated user
    * *   **Current user actor**: The private timeline for activity created by the authenticated user
    * *   **Current user organizations**: The private timeline for the organizations the authenticated user is a member of.
    * *   **Security advisories**: A collection of public announcements that provide information about security-related vulnerabilities in software on GitHub.
    *
    * **Note**: Private feeds are only returned when [authenticating via Basic Auth](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) since current feed URIs use the older, non revocable auth tokens.
    */
  @JSName("getFeeds")
  var getFeeds_Original: `124`
  
  def getRepoSubscription(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/subscription']['response'] */ js.Any
  ]
  def getRepoSubscription(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/subscription']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/subscription']['response'] */ js.Any
  ]
  @JSName("getRepoSubscription")
  var getRepoSubscription_Original: `125`
  
  /**
    * Gets information about a notification thread.
    */
  def getThread(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /notifications/threads/{thread_id}']['response'] */ js.Any
  ]
  def getThread(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /notifications/threads/{thread_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /notifications/threads/{thread_id}']['response'] */ js.Any
  ]
  
  /**
    * This checks to see if the current user is subscribed to a thread. You can also [get a repository subscription](https://docs.github.com/rest/reference/activity#get-a-repository-subscription).
    *
    * Note that subscriptions are only generated if a user is participating in a conversation--for example, they've replied to the thread, were **@mentioned**, or manually subscribe to a thread.
    */
  def getThreadSubscriptionForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /notifications/threads/{thread_id}/subscription']['response'] */ js.Any
  ]
  def getThreadSubscriptionForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /notifications/threads/{thread_id}/subscription']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /notifications/threads/{thread_id}/subscription']['response'] */ js.Any
  ]
  /**
    * This checks to see if the current user is subscribed to a thread. You can also [get a repository subscription](https://docs.github.com/rest/reference/activity#get-a-repository-subscription).
    *
    * Note that subscriptions are only generated if a user is participating in a conversation--for example, they've replied to the thread, were **@mentioned**, or manually subscribe to a thread.
    */
  @JSName("getThreadSubscriptionForAuthenticatedUser")
  var getThreadSubscriptionForAuthenticatedUser_Original: `127`
  
  /**
    * Gets information about a notification thread.
    */
  @JSName("getThread")
  var getThread_Original: `126`
  
  /**
    * If you are authenticated as the given user, you will see your private events. Otherwise, you'll only see public events.
    */
  def listEventsForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/events']['response'] */ js.Any
  ]
  def listEventsForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/events']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/events']['response'] */ js.Any
  ]
  /**
    * If you are authenticated as the given user, you will see your private events. Otherwise, you'll only see public events.
    */
  @JSName("listEventsForAuthenticatedUser")
  var listEventsForAuthenticatedUser_Original: `128`
  
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
  var listNotificationsForAuthenticatedUser_Original: `129`
  
  /**
    * This is the user's organization dashboard. You must be authenticated as the user to view this.
    */
  def listOrgEventsForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/events/orgs/{org}']['response'] */ js.Any
  ]
  def listOrgEventsForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/events/orgs/{org}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/events/orgs/{org}']['response'] */ js.Any
  ]
  /**
    * This is the user's organization dashboard. You must be authenticated as the user to view this.
    */
  @JSName("listOrgEventsForAuthenticatedUser")
  var listOrgEventsForAuthenticatedUser_Original: `130`
  
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
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /networks/{owner}/{repo}/events']['response'] */ js.Any
  ]
  def listPublicEventsForRepoNetwork(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /networks/{owner}/{repo}/events']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /networks/{owner}/{repo}/events']['response'] */ js.Any
  ]
  @JSName("listPublicEventsForRepoNetwork")
  var listPublicEventsForRepoNetwork_Original: `132`
  
  def listPublicEventsForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/events/public']['response'] */ js.Any
  ]
  def listPublicEventsForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/events/public']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/events/public']['response'] */ js.Any
  ]
  @JSName("listPublicEventsForUser")
  var listPublicEventsForUser_Original: `133`
  
  /**
    * We delay the public events feed by five minutes, which means the most recent event returned by the public events API actually occurred at least five minutes ago.
    */
  @JSName("listPublicEvents")
  var listPublicEvents_Original: `131`
  
  def listPublicOrgEvents(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/events']['response'] */ js.Any
  ]
  def listPublicOrgEvents(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/events']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/events']['response'] */ js.Any
  ]
  @JSName("listPublicOrgEvents")
  var listPublicOrgEvents_Original: `134`
  
  /**
    * These are events that you've received by watching repos and following users. If you are authenticated as the given user, you will see private events. Otherwise, you'll only see public events.
    */
  def listReceivedEventsForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/received_events']['response'] */ js.Any
  ]
  def listReceivedEventsForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/received_events']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/received_events']['response'] */ js.Any
  ]
  /**
    * These are events that you've received by watching repos and following users. If you are authenticated as the given user, you will see private events. Otherwise, you'll only see public events.
    */
  @JSName("listReceivedEventsForUser")
  var listReceivedEventsForUser_Original: `135`
  
  def listReceivedPublicEventsForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/received_events/public']['response'] */ js.Any
  ]
  def listReceivedPublicEventsForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/received_events/public']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/received_events/public']['response'] */ js.Any
  ]
  @JSName("listReceivedPublicEventsForUser")
  var listReceivedPublicEventsForUser_Original: `136`
  
  /**
    * **Note**: This API is not built to serve real-time use cases. Depending on the time of day, event latency can be anywhere from 30s to 6h.
    */
  def listRepoEvents(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/events']['response'] */ js.Any
  ]
  def listRepoEvents(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/events']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/events']['response'] */ js.Any
  ]
  /**
    * **Note**: This API is not built to serve real-time use cases. Depending on the time of day, event latency can be anywhere from 30s to 6h.
    */
  @JSName("listRepoEvents")
  var listRepoEvents_Original: `137`
  
  /**
    * Lists all notifications for the current user in the specified repository.
    */
  def listRepoNotificationsForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/notifications']['response'] */ js.Any
  ]
  def listRepoNotificationsForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/notifications']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/notifications']['response'] */ js.Any
  ]
  /**
    * Lists all notifications for the current user in the specified repository.
    */
  @JSName("listRepoNotificationsForAuthenticatedUser")
  var listRepoNotificationsForAuthenticatedUser_Original: `138`
  
  /**
    * Lists repositories the authenticated user has starred.
    *
    * You can also find out _when_ stars were created by passing the following custom [media type](https://docs.github.com/rest/overview/media-types/) via the `Accept` header: `application/vnd.github.star+json`.
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
    * You can also find out _when_ stars were created by passing the following custom [media type](https://docs.github.com/rest/overview/media-types/) via the `Accept` header: `application/vnd.github.star+json`.
    */
  @JSName("listReposStarredByAuthenticatedUser")
  var listReposStarredByAuthenticatedUser_Original: `139`
  
  /**
    * Lists repositories a user has starred.
    *
    * You can also find out _when_ stars were created by passing the following custom [media type](https://docs.github.com/rest/overview/media-types/) via the `Accept` header: `application/vnd.github.star+json`.
    */
  def listReposStarredByUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/starred']['response'] */ js.Any
  ]
  def listReposStarredByUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/starred']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/starred']['response'] */ js.Any
  ]
  /**
    * Lists repositories a user has starred.
    *
    * You can also find out _when_ stars were created by passing the following custom [media type](https://docs.github.com/rest/overview/media-types/) via the `Accept` header: `application/vnd.github.star+json`.
    */
  @JSName("listReposStarredByUser")
  var listReposStarredByUser_Original: `140`
  
  /**
    * Lists repositories a user is watching.
    */
  def listReposWatchedByUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/subscriptions']['response'] */ js.Any
  ]
  def listReposWatchedByUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/subscriptions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/subscriptions']['response'] */ js.Any
  ]
  /**
    * Lists repositories a user is watching.
    */
  @JSName("listReposWatchedByUser")
  var listReposWatchedByUser_Original: `141`
  
  /**
    * Lists the people that have starred the repository.
    *
    * You can also find out _when_ stars were created by passing the following custom [media type](https://docs.github.com/rest/overview/media-types/) via the `Accept` header: `application/vnd.github.star+json`.
    */
  def listStargazersForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/stargazers']['response'] */ js.Any
  ]
  def listStargazersForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/stargazers']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/stargazers']['response'] */ js.Any
  ]
  /**
    * Lists the people that have starred the repository.
    *
    * You can also find out _when_ stars were created by passing the following custom [media type](https://docs.github.com/rest/overview/media-types/) via the `Accept` header: `application/vnd.github.star+json`.
    */
  @JSName("listStargazersForRepo")
  var listStargazersForRepo_Original: `142`
  
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
  var listWatchedReposForAuthenticatedUser_Original: `143`
  
  /**
    * Lists the people watching the specified repository.
    */
  def listWatchersForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/subscribers']['response'] */ js.Any
  ]
  def listWatchersForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/subscribers']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/subscribers']['response'] */ js.Any
  ]
  /**
    * Lists the people watching the specified repository.
    */
  @JSName("listWatchersForRepo")
  var listWatchersForRepo_Original: `144`
  
  /**
    * Marks all notifications as "read" for the current user. If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List notifications for the authenticated user](https://docs.github.com/rest/reference/activity#list-notifications-for-the-authenticated-user) endpoint and pass the query parameter `all=false`.
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
    * Marks all notifications as "read" for the current user. If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List notifications for the authenticated user](https://docs.github.com/rest/reference/activity#list-notifications-for-the-authenticated-user) endpoint and pass the query parameter `all=false`.
    */
  @JSName("markNotificationsAsRead")
  var markNotificationsAsRead_Original: `145`
  
  /**
    * Marks all notifications in a repository as "read" for the current user. If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List repository notifications for the authenticated user](https://docs.github.com/rest/reference/activity#list-repository-notifications-for-the-authenticated-user) endpoint and pass the query parameter `all=false`.
    */
  def markRepoNotificationsAsRead(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/notifications']['response'] */ js.Any
  ]
  def markRepoNotificationsAsRead(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/notifications']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/notifications']['response'] */ js.Any
  ]
  /**
    * Marks all notifications in a repository as "read" for the current user. If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List repository notifications for the authenticated user](https://docs.github.com/rest/reference/activity#list-repository-notifications-for-the-authenticated-user) endpoint and pass the query parameter `all=false`.
    */
  @JSName("markRepoNotificationsAsRead")
  var markRepoNotificationsAsRead_Original: `146`
  
  /**
    * Marks a thread as "read." Marking a thread as "read" is equivalent to clicking a notification in your notification inbox on GitHub: https://github.com/notifications.
    */
  def markThreadAsRead(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /notifications/threads/{thread_id}']['response'] */ js.Any
  ]
  def markThreadAsRead(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /notifications/threads/{thread_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /notifications/threads/{thread_id}']['response'] */ js.Any
  ]
  /**
    * Marks a thread as "read." Marking a thread as "read" is equivalent to clicking a notification in your notification inbox on GitHub: https://github.com/notifications.
    */
  @JSName("markThreadAsRead")
  var markThreadAsRead_Original: `147`
  
  /**
    * If you would like to watch a repository, set `subscribed` to `true`. If you would like to ignore notifications made within a repository, set `ignored` to `true`. If you would like to stop watching a repository, [delete the repository's subscription](https://docs.github.com/rest/reference/activity#delete-a-repository-subscription) completely.
    */
  def setRepoSubscription(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/subscription']['response'] */ js.Any
  ]
  def setRepoSubscription(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/subscription']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/subscription']['response'] */ js.Any
  ]
  /**
    * If you would like to watch a repository, set `subscribed` to `true`. If you would like to ignore notifications made within a repository, set `ignored` to `true`. If you would like to stop watching a repository, [delete the repository's subscription](https://docs.github.com/rest/reference/activity#delete-a-repository-subscription) completely.
    */
  @JSName("setRepoSubscription")
  var setRepoSubscription_Original: `148`
  
  /**
    * If you are watching a repository, you receive notifications for all threads by default. Use this endpoint to ignore future notifications for threads until you comment on the thread or get an **@mention**.
    *
    * You can also use this endpoint to subscribe to threads that you are currently not receiving notifications for or to subscribed to threads that you have previously ignored.
    *
    * Unsubscribing from a conversation in a repository that you are not watching is functionally equivalent to the [Delete a thread subscription](https://docs.github.com/rest/reference/activity#delete-a-thread-subscription) endpoint.
    */
  def setThreadSubscription(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /notifications/threads/{thread_id}/subscription']['response'] */ js.Any
  ]
  def setThreadSubscription(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /notifications/threads/{thread_id}/subscription']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /notifications/threads/{thread_id}/subscription']['response'] */ js.Any
  ]
  /**
    * If you are watching a repository, you receive notifications for all threads by default. Use this endpoint to ignore future notifications for threads until you comment on the thread or get an **@mention**.
    *
    * You can also use this endpoint to subscribe to threads that you are currently not receiving notifications for or to subscribed to threads that you have previously ignored.
    *
    * Unsubscribing from a conversation in a repository that you are not watching is functionally equivalent to the [Delete a thread subscription](https://docs.github.com/rest/reference/activity#delete-a-thread-subscription) endpoint.
    */
  @JSName("setThreadSubscription")
  var setThreadSubscription_Original: `149`
  
  /**
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)."
    */
  def starRepoForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /user/starred/{owner}/{repo}']['response'] */ js.Any
  ]
  def starRepoForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /user/starred/{owner}/{repo}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /user/starred/{owner}/{repo}']['response'] */ js.Any
  ]
  /**
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)."
    */
  @JSName("starRepoForAuthenticatedUser")
  var starRepoForAuthenticatedUser_Original: `150`
  
  def unstarRepoForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/starred/{owner}/{repo}']['response'] */ js.Any
  ]
  def unstarRepoForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/starred/{owner}/{repo}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/starred/{owner}/{repo}']['response'] */ js.Any
  ]
  @JSName("unstarRepoForAuthenticatedUser")
  var unstarRepoForAuthenticatedUser_Original: `151`
}
object CheckRepoIsStarredByAuthenticatedUser {
  
  inline def apply(
    checkRepoIsStarredByAuthenticatedUser: `121`,
    deleteRepoSubscription: `122`,
    deleteThreadSubscription: `123`,
    getFeeds: `124`,
    getRepoSubscription: `125`,
    getThread: `126`,
    getThreadSubscriptionForAuthenticatedUser: `127`,
    listEventsForAuthenticatedUser: `128`,
    listNotificationsForAuthenticatedUser: `129`,
    listOrgEventsForAuthenticatedUser: `130`,
    listPublicEvents: `131`,
    listPublicEventsForRepoNetwork: `132`,
    listPublicEventsForUser: `133`,
    listPublicOrgEvents: `134`,
    listReceivedEventsForUser: `135`,
    listReceivedPublicEventsForUser: `136`,
    listRepoEvents: `137`,
    listRepoNotificationsForAuthenticatedUser: `138`,
    listReposStarredByAuthenticatedUser: `139`,
    listReposStarredByUser: `140`,
    listReposWatchedByUser: `141`,
    listStargazersForRepo: `142`,
    listWatchedReposForAuthenticatedUser: `143`,
    listWatchersForRepo: `144`,
    markNotificationsAsRead: `145`,
    markRepoNotificationsAsRead: `146`,
    markThreadAsRead: `147`,
    setRepoSubscription: `148`,
    setThreadSubscription: `149`,
    starRepoForAuthenticatedUser: `150`,
    unstarRepoForAuthenticatedUser: `151`
  ): CheckRepoIsStarredByAuthenticatedUser = {
    val __obj = js.Dynamic.literal(checkRepoIsStarredByAuthenticatedUser = checkRepoIsStarredByAuthenticatedUser.asInstanceOf[js.Any], deleteRepoSubscription = deleteRepoSubscription.asInstanceOf[js.Any], deleteThreadSubscription = deleteThreadSubscription.asInstanceOf[js.Any], getFeeds = getFeeds.asInstanceOf[js.Any], getRepoSubscription = getRepoSubscription.asInstanceOf[js.Any], getThread = getThread.asInstanceOf[js.Any], getThreadSubscriptionForAuthenticatedUser = getThreadSubscriptionForAuthenticatedUser.asInstanceOf[js.Any], listEventsForAuthenticatedUser = listEventsForAuthenticatedUser.asInstanceOf[js.Any], listNotificationsForAuthenticatedUser = listNotificationsForAuthenticatedUser.asInstanceOf[js.Any], listOrgEventsForAuthenticatedUser = listOrgEventsForAuthenticatedUser.asInstanceOf[js.Any], listPublicEvents = listPublicEvents.asInstanceOf[js.Any], listPublicEventsForRepoNetwork = listPublicEventsForRepoNetwork.asInstanceOf[js.Any], listPublicEventsForUser = listPublicEventsForUser.asInstanceOf[js.Any], listPublicOrgEvents = listPublicOrgEvents.asInstanceOf[js.Any], listReceivedEventsForUser = listReceivedEventsForUser.asInstanceOf[js.Any], listReceivedPublicEventsForUser = listReceivedPublicEventsForUser.asInstanceOf[js.Any], listRepoEvents = listRepoEvents.asInstanceOf[js.Any], listRepoNotificationsForAuthenticatedUser = listRepoNotificationsForAuthenticatedUser.asInstanceOf[js.Any], listReposStarredByAuthenticatedUser = listReposStarredByAuthenticatedUser.asInstanceOf[js.Any], listReposStarredByUser = listReposStarredByUser.asInstanceOf[js.Any], listReposWatchedByUser = listReposWatchedByUser.asInstanceOf[js.Any], listStargazersForRepo = listStargazersForRepo.asInstanceOf[js.Any], listWatchedReposForAuthenticatedUser = listWatchedReposForAuthenticatedUser.asInstanceOf[js.Any], listWatchersForRepo = listWatchersForRepo.asInstanceOf[js.Any], markNotificationsAsRead = markNotificationsAsRead.asInstanceOf[js.Any], markRepoNotificationsAsRead = markRepoNotificationsAsRead.asInstanceOf[js.Any], markThreadAsRead = markThreadAsRead.asInstanceOf[js.Any], setRepoSubscription = setRepoSubscription.asInstanceOf[js.Any], setThreadSubscription = setThreadSubscription.asInstanceOf[js.Any], starRepoForAuthenticatedUser = starRepoForAuthenticatedUser.asInstanceOf[js.Any], unstarRepoForAuthenticatedUser = unstarRepoForAuthenticatedUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckRepoIsStarredByAuthenticatedUser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckRepoIsStarredByAuthenticatedUser] (val x: Self) extends AnyVal {
    
    inline def setCheckRepoIsStarredByAuthenticatedUser(value: `121`): Self = StObject.set(x, "checkRepoIsStarredByAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setDeleteRepoSubscription(value: `122`): Self = StObject.set(x, "deleteRepoSubscription", value.asInstanceOf[js.Any])
    
    inline def setDeleteThreadSubscription(value: `123`): Self = StObject.set(x, "deleteThreadSubscription", value.asInstanceOf[js.Any])
    
    inline def setGetFeeds(value: `124`): Self = StObject.set(x, "getFeeds", value.asInstanceOf[js.Any])
    
    inline def setGetRepoSubscription(value: `125`): Self = StObject.set(x, "getRepoSubscription", value.asInstanceOf[js.Any])
    
    inline def setGetThread(value: `126`): Self = StObject.set(x, "getThread", value.asInstanceOf[js.Any])
    
    inline def setGetThreadSubscriptionForAuthenticatedUser(value: `127`): Self = StObject.set(x, "getThreadSubscriptionForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListEventsForAuthenticatedUser(value: `128`): Self = StObject.set(x, "listEventsForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListNotificationsForAuthenticatedUser(value: `129`): Self = StObject.set(x, "listNotificationsForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListOrgEventsForAuthenticatedUser(value: `130`): Self = StObject.set(x, "listOrgEventsForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListPublicEvents(value: `131`): Self = StObject.set(x, "listPublicEvents", value.asInstanceOf[js.Any])
    
    inline def setListPublicEventsForRepoNetwork(value: `132`): Self = StObject.set(x, "listPublicEventsForRepoNetwork", value.asInstanceOf[js.Any])
    
    inline def setListPublicEventsForUser(value: `133`): Self = StObject.set(x, "listPublicEventsForUser", value.asInstanceOf[js.Any])
    
    inline def setListPublicOrgEvents(value: `134`): Self = StObject.set(x, "listPublicOrgEvents", value.asInstanceOf[js.Any])
    
    inline def setListReceivedEventsForUser(value: `135`): Self = StObject.set(x, "listReceivedEventsForUser", value.asInstanceOf[js.Any])
    
    inline def setListReceivedPublicEventsForUser(value: `136`): Self = StObject.set(x, "listReceivedPublicEventsForUser", value.asInstanceOf[js.Any])
    
    inline def setListRepoEvents(value: `137`): Self = StObject.set(x, "listRepoEvents", value.asInstanceOf[js.Any])
    
    inline def setListRepoNotificationsForAuthenticatedUser(value: `138`): Self = StObject.set(x, "listRepoNotificationsForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListReposStarredByAuthenticatedUser(value: `139`): Self = StObject.set(x, "listReposStarredByAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListReposStarredByUser(value: `140`): Self = StObject.set(x, "listReposStarredByUser", value.asInstanceOf[js.Any])
    
    inline def setListReposWatchedByUser(value: `141`): Self = StObject.set(x, "listReposWatchedByUser", value.asInstanceOf[js.Any])
    
    inline def setListStargazersForRepo(value: `142`): Self = StObject.set(x, "listStargazersForRepo", value.asInstanceOf[js.Any])
    
    inline def setListWatchedReposForAuthenticatedUser(value: `143`): Self = StObject.set(x, "listWatchedReposForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListWatchersForRepo(value: `144`): Self = StObject.set(x, "listWatchersForRepo", value.asInstanceOf[js.Any])
    
    inline def setMarkNotificationsAsRead(value: `145`): Self = StObject.set(x, "markNotificationsAsRead", value.asInstanceOf[js.Any])
    
    inline def setMarkRepoNotificationsAsRead(value: `146`): Self = StObject.set(x, "markRepoNotificationsAsRead", value.asInstanceOf[js.Any])
    
    inline def setMarkThreadAsRead(value: `147`): Self = StObject.set(x, "markThreadAsRead", value.asInstanceOf[js.Any])
    
    inline def setSetRepoSubscription(value: `148`): Self = StObject.set(x, "setRepoSubscription", value.asInstanceOf[js.Any])
    
    inline def setSetThreadSubscription(value: `149`): Self = StObject.set(x, "setThreadSubscription", value.asInstanceOf[js.Any])
    
    inline def setStarRepoForAuthenticatedUser(value: `150`): Self = StObject.set(x, "starRepoForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setUnstarRepoForAuthenticatedUser(value: `151`): Self = StObject.set(x, "unstarRepoForAuthenticatedUser", value.asInstanceOf[js.Any])
  }
}
