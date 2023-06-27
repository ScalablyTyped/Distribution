package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.distTypesRequestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckIfMerged extends StObject {
  
  /**
    * Checks if a pull request has been merged into the base branch. The HTTP status of the response indicates whether or not the pull request has been merged; the response body is empty.
    */
  def checkIfMerged(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls/{pull_number}/merge']['response'] */ js.Any
  ]
  def checkIfMerged(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls/{pull_number}/merge']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls/{pull_number}/merge']['response'] */ js.Any
  ]
  /**
    * Checks if a pull request has been merged into the base branch. The HTTP status of the response indicates whether or not the pull request has been merged; the response body is empty.
    */
  @JSName("checkIfMerged")
  var checkIfMerged_Original: `518`
  
  /**
    * Draft pull requests are available in public repositories with GitHub Free and GitHub Free for organizations, GitHub Pro, and legacy per-repository billing plans, and in public and private repositories with GitHub Team and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * To open or update a pull request in a public repository, you must have write access to the head or the source branch. For organization-owned repositories, you must be a member of the organization that owns the repository to open or update a pull request.
    *
    * This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-rate-limits)" for details.
    */
  def create(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/pulls']['response'] */ js.Any
  ]
  def create(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/pulls']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/pulls']['response'] */ js.Any
  ]
  
  /**
    * Creates a reply to a review comment for a pull request. For the `comment_id`, provide the ID of the review comment you are replying to. This must be the ID of a _top-level review comment_, not a reply to that comment. Replies to replies are not supported.
    *
    * This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.
    */
  def createReplyForReviewComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/pulls/{pull_number}/comments/{comment_id}/replies']['response'] */ js.Any
  ]
  def createReplyForReviewComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/pulls/{pull_number}/comments/{comment_id}/replies']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/pulls/{pull_number}/comments/{comment_id}/replies']['response'] */ js.Any
  ]
  /**
    * Creates a reply to a review comment for a pull request. For the `comment_id`, provide the ID of the review comment you are replying to. This must be the ID of a _top-level review comment_, not a reply to that comment. Replies to replies are not supported.
    *
    * This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.
    */
  @JSName("createReplyForReviewComment")
  var createReplyForReviewComment_Original: `520`
  
  /**
    * This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.
    *
    * Pull request reviews created in the `PENDING` state are not submitted and therefore do not include the `submitted_at` property in the response. To create a pending review for a pull request, leave the `event` parameter blank. For more information about submitting a `PENDING` review, see "[Submit a review for a pull request](https://docs.github.com/rest/pulls#submit-a-review-for-a-pull-request)."
    *
    * **Note:** To comment on a specific line in a file, you need to first determine the _position_ of that line in the diff. The GitHub REST API offers the `application/vnd.github.v3.diff` [media type](https://docs.github.com/rest/overview/media-types#commits-commit-comparison-and-pull-requests). To see a pull request diff, add this media type to the `Accept` header of a call to the [single pull request](https://docs.github.com/rest/reference/pulls#get-a-pull-request) endpoint.
    *
    * The `position` value equals the number of lines down from the first "@@" hunk header in the file you want to add a comment. The line just below the "@@" line is position 1, the next line is position 2, and so on. The position in the diff continues to increase through lines of whitespace and additional hunks until the beginning of a new file.
    */
  def createReview(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/pulls/{pull_number}/reviews']['response'] */ js.Any
  ]
  def createReview(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/pulls/{pull_number}/reviews']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/pulls/{pull_number}/reviews']['response'] */ js.Any
  ]
  
  /**
    * Creates a review comment in the pull request diff. To add a regular comment to a pull request timeline, see "[Create an issue comment](https://docs.github.com/rest/reference/issues#create-an-issue-comment)." We recommend creating a review comment using `line`, `side`, and optionally `start_line` and `start_side` if your comment applies to more than one line in the pull request diff.
    *
    * The `position` parameter is deprecated. If you use `position`, the `line`, `side`, `start_line`, and `start_side` parameters are not required.
    *
    * **Note:** The position value equals the number of lines down from the first "@@" hunk header in the file you want to add a comment. The line just below the "@@" line is position 1, the next line is position 2, and so on. The position in the diff continues to increase through lines of whitespace and additional hunks until the beginning of a new file.
    *
    * This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.
    */
  def createReviewComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/pulls/{pull_number}/comments']['response'] */ js.Any
  ]
  def createReviewComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/pulls/{pull_number}/comments']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/pulls/{pull_number}/comments']['response'] */ js.Any
  ]
  /**
    * Creates a review comment in the pull request diff. To add a regular comment to a pull request timeline, see "[Create an issue comment](https://docs.github.com/rest/reference/issues#create-an-issue-comment)." We recommend creating a review comment using `line`, `side`, and optionally `start_line` and `start_side` if your comment applies to more than one line in the pull request diff.
    *
    * The `position` parameter is deprecated. If you use `position`, the `line`, `side`, `start_line`, and `start_side` parameters are not required.
    *
    * **Note:** The position value equals the number of lines down from the first "@@" hunk header in the file you want to add a comment. The line just below the "@@" line is position 1, the next line is position 2, and so on. The position in the diff continues to increase through lines of whitespace and additional hunks until the beginning of a new file.
    *
    * This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.
    */
  @JSName("createReviewComment")
  var createReviewComment_Original: `522`
  
  /**
    * This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.
    *
    * Pull request reviews created in the `PENDING` state are not submitted and therefore do not include the `submitted_at` property in the response. To create a pending review for a pull request, leave the `event` parameter blank. For more information about submitting a `PENDING` review, see "[Submit a review for a pull request](https://docs.github.com/rest/pulls#submit-a-review-for-a-pull-request)."
    *
    * **Note:** To comment on a specific line in a file, you need to first determine the _position_ of that line in the diff. The GitHub REST API offers the `application/vnd.github.v3.diff` [media type](https://docs.github.com/rest/overview/media-types#commits-commit-comparison-and-pull-requests). To see a pull request diff, add this media type to the `Accept` header of a call to the [single pull request](https://docs.github.com/rest/reference/pulls#get-a-pull-request) endpoint.
    *
    * The `position` value equals the number of lines down from the first "@@" hunk header in the file you want to add a comment. The line just below the "@@" line is position 1, the next line is position 2, and so on. The position in the diff continues to increase through lines of whitespace and additional hunks until the beginning of a new file.
    */
  @JSName("createReview")
  var createReview_Original: `521`
  
  /**
    * Draft pull requests are available in public repositories with GitHub Free and GitHub Free for organizations, GitHub Pro, and legacy per-repository billing plans, and in public and private repositories with GitHub Team and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * To open or update a pull request in a public repository, you must have write access to the head or the source branch. For organization-owned repositories, you must be a member of the organization that owns the repository to open or update a pull request.
    *
    * This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-rate-limits)" for details.
    */
  @JSName("create")
  var create_Original: `519`
  
  /**
    * Deletes a pull request review that has not been submitted. Submitted reviews cannot be deleted.
    */
  def deletePendingReview(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}']['response'] */ js.Any
  ]
  def deletePendingReview(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}']['response'] */ js.Any
  ]
  /**
    * Deletes a pull request review that has not been submitted. Submitted reviews cannot be deleted.
    */
  @JSName("deletePendingReview")
  var deletePendingReview_Original: `523`
  
  /**
    * Deletes a review comment.
    */
  def deleteReviewComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/pulls/comments/{comment_id}']['response'] */ js.Any
  ]
  def deleteReviewComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/pulls/comments/{comment_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/pulls/comments/{comment_id}']['response'] */ js.Any
  ]
  /**
    * Deletes a review comment.
    */
  @JSName("deleteReviewComment")
  var deleteReviewComment_Original: `524`
  
  /**
    * **Note:** To dismiss a pull request review on a [protected branch](https://docs.github.com/rest/reference/repos#branches), you must be a repository administrator or be included in the list of people or teams who can dismiss pull request reviews.
    */
  def dismissReview(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}/dismissals']['response'] */ js.Any
  ]
  def dismissReview(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}/dismissals']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}/dismissals']['response'] */ js.Any
  ]
  /**
    * **Note:** To dismiss a pull request review on a [protected branch](https://docs.github.com/rest/reference/repos#branches), you must be a repository administrator or be included in the list of people or teams who can dismiss pull request reviews.
    */
  @JSName("dismissReview")
  var dismissReview_Original: `525`
  
  /**
    * Draft pull requests are available in public repositories with GitHub Free and GitHub Free for organizations, GitHub Pro, and legacy per-repository billing plans, and in public and private repositories with GitHub Team and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists details of a pull request by providing its number.
    *
    * When you get, [create](https://docs.github.com/rest/reference/pulls/#create-a-pull-request), or [edit](https://docs.github.com/rest/reference/pulls#update-a-pull-request) a pull request, GitHub creates a merge commit to test whether the pull request can be automatically merged into the base branch. This test commit is not added to the base branch or the head branch. You can review the status of the test commit using the `mergeable` key. For more information, see "[Checking mergeability of pull requests](https://docs.github.com/rest/guides/getting-started-with-the-git-database-api#checking-mergeability-of-pull-requests)".
    *
    * The value of the `mergeable` attribute can be `true`, `false`, or `null`. If the value is `null`, then GitHub has started a background job to compute the mergeability. After giving the job time to complete, resubmit the request. When the job finishes, you will see a non-`null` value for the `mergeable` attribute in the response. If `mergeable` is `true`, then `merge_commit_sha` will be the SHA of the _test_ merge commit.
    *
    * The value of the `merge_commit_sha` attribute changes depending on the state of the pull request. Before merging a pull request, the `merge_commit_sha` attribute holds the SHA of the _test_ merge commit. After merging a pull request, the `merge_commit_sha` attribute changes depending on how you merged the pull request:
    *
    * *   If merged as a [merge commit](https://docs.github.com/articles/about-merge-methods-on-github/), `merge_commit_sha` represents the SHA of the merge commit.
    * *   If merged via a [squash](https://docs.github.com/articles/about-merge-methods-on-github/#squashing-your-merge-commits), `merge_commit_sha` represents the SHA of the squashed commit on the base branch.
    * *   If [rebased](https://docs.github.com/articles/about-merge-methods-on-github/#rebasing-and-merging-your-commits), `merge_commit_sha` represents the commit that the base branch was updated to.
    *
    * Pass the appropriate [media type](https://docs.github.com/rest/overview/media-types/#commits-commit-comparison-and-pull-requests) to fetch diff and patch formats.
    */
  def get(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls/{pull_number}']['response'] */ js.Any
  ]
  def get(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls/{pull_number}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls/{pull_number}']['response'] */ js.Any
  ]
  
  /**
    * Retrieves a pull request review by its ID.
    */
  def getReview(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}']['response'] */ js.Any
  ]
  def getReview(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}']['response'] */ js.Any
  ]
  
  /**
    * Provides details for a review comment.
    */
  def getReviewComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls/comments/{comment_id}']['response'] */ js.Any
  ]
  def getReviewComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls/comments/{comment_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls/comments/{comment_id}']['response'] */ js.Any
  ]
  /**
    * Provides details for a review comment.
    */
  @JSName("getReviewComment")
  var getReviewComment_Original: `528`
  
  /**
    * Retrieves a pull request review by its ID.
    */
  @JSName("getReview")
  var getReview_Original: `527`
  
  /**
    * Draft pull requests are available in public repositories with GitHub Free and GitHub Free for organizations, GitHub Pro, and legacy per-repository billing plans, and in public and private repositories with GitHub Team and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists details of a pull request by providing its number.
    *
    * When you get, [create](https://docs.github.com/rest/reference/pulls/#create-a-pull-request), or [edit](https://docs.github.com/rest/reference/pulls#update-a-pull-request) a pull request, GitHub creates a merge commit to test whether the pull request can be automatically merged into the base branch. This test commit is not added to the base branch or the head branch. You can review the status of the test commit using the `mergeable` key. For more information, see "[Checking mergeability of pull requests](https://docs.github.com/rest/guides/getting-started-with-the-git-database-api#checking-mergeability-of-pull-requests)".
    *
    * The value of the `mergeable` attribute can be `true`, `false`, or `null`. If the value is `null`, then GitHub has started a background job to compute the mergeability. After giving the job time to complete, resubmit the request. When the job finishes, you will see a non-`null` value for the `mergeable` attribute in the response. If `mergeable` is `true`, then `merge_commit_sha` will be the SHA of the _test_ merge commit.
    *
    * The value of the `merge_commit_sha` attribute changes depending on the state of the pull request. Before merging a pull request, the `merge_commit_sha` attribute holds the SHA of the _test_ merge commit. After merging a pull request, the `merge_commit_sha` attribute changes depending on how you merged the pull request:
    *
    * *   If merged as a [merge commit](https://docs.github.com/articles/about-merge-methods-on-github/), `merge_commit_sha` represents the SHA of the merge commit.
    * *   If merged via a [squash](https://docs.github.com/articles/about-merge-methods-on-github/#squashing-your-merge-commits), `merge_commit_sha` represents the SHA of the squashed commit on the base branch.
    * *   If [rebased](https://docs.github.com/articles/about-merge-methods-on-github/#rebasing-and-merging-your-commits), `merge_commit_sha` represents the commit that the base branch was updated to.
    *
    * Pass the appropriate [media type](https://docs.github.com/rest/overview/media-types/#commits-commit-comparison-and-pull-requests) to fetch diff and patch formats.
    */
  @JSName("get")
  var get_Original: `526`
  
  /**
    * Draft pull requests are available in public repositories with GitHub Free and GitHub Free for organizations, GitHub Pro, and legacy per-repository billing plans, and in public and private repositories with GitHub Team and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  def list(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls']['response'] */ js.Any
  ]
  def list(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls']['response'] */ js.Any
  ]
  
  /**
    * List comments for a specific pull request review.
    */
  def listCommentsForReview(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}/comments']['response'] */ js.Any
  ]
  def listCommentsForReview(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}/comments']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}/comments']['response'] */ js.Any
  ]
  /**
    * List comments for a specific pull request review.
    */
  @JSName("listCommentsForReview")
  var listCommentsForReview_Original: `530`
  
  /**
    * Lists a maximum of 250 commits for a pull request. To receive a complete commit list for pull requests with more than 250 commits, use the [List commits](https://docs.github.com/rest/reference/repos#list-commits) endpoint.
    */
  def listCommits(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls/{pull_number}/commits']['response'] */ js.Any
  ]
  def listCommits(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls/{pull_number}/commits']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls/{pull_number}/commits']['response'] */ js.Any
  ]
  /**
    * Lists a maximum of 250 commits for a pull request. To receive a complete commit list for pull requests with more than 250 commits, use the [List commits](https://docs.github.com/rest/reference/repos#list-commits) endpoint.
    */
  @JSName("listCommits")
  var listCommits_Original: `531`
  
  /**
    * **Note:** Responses include a maximum of 3000 files. The paginated response returns 30 files per page by default.
    */
  def listFiles(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls/{pull_number}/files']['response'] */ js.Any
  ]
  def listFiles(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls/{pull_number}/files']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls/{pull_number}/files']['response'] */ js.Any
  ]
  /**
    * **Note:** Responses include a maximum of 3000 files. The paginated response returns 30 files per page by default.
    */
  @JSName("listFiles")
  var listFiles_Original: `532`
  
  /**
    * Gets the users or teams whose review is requested for a pull request. Once a requested reviewer submits a review, they are no longer considered a requested reviewer. Their review will instead be returned by the [List reviews for a pull request](https://docs.github.com/rest/pulls/reviews#list-reviews-for-a-pull-request) operation.
    */
  def listRequestedReviewers(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls/{pull_number}/requested_reviewers']['response'] */ js.Any
  ]
  def listRequestedReviewers(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls/{pull_number}/requested_reviewers']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls/{pull_number}/requested_reviewers']['response'] */ js.Any
  ]
  /**
    * Gets the users or teams whose review is requested for a pull request. Once a requested reviewer submits a review, they are no longer considered a requested reviewer. Their review will instead be returned by the [List reviews for a pull request](https://docs.github.com/rest/pulls/reviews#list-reviews-for-a-pull-request) operation.
    */
  @JSName("listRequestedReviewers")
  var listRequestedReviewers_Original: `533`
  
  /**
    * Lists all review comments for a pull request. By default, review comments are in ascending order by ID.
    */
  def listReviewComments(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls/{pull_number}/comments']['response'] */ js.Any
  ]
  def listReviewComments(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls/{pull_number}/comments']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls/{pull_number}/comments']['response'] */ js.Any
  ]
  
  /**
    * Lists review comments for all pull requests in a repository. By default, review comments are in ascending order by ID.
    */
  def listReviewCommentsForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls/comments']['response'] */ js.Any
  ]
  def listReviewCommentsForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls/comments']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls/comments']['response'] */ js.Any
  ]
  /**
    * Lists review comments for all pull requests in a repository. By default, review comments are in ascending order by ID.
    */
  @JSName("listReviewCommentsForRepo")
  var listReviewCommentsForRepo_Original: `535`
  
  /**
    * Lists all review comments for a pull request. By default, review comments are in ascending order by ID.
    */
  @JSName("listReviewComments")
  var listReviewComments_Original: `534`
  
  /**
    * The list of reviews returns in chronological order.
    */
  def listReviews(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls/{pull_number}/reviews']['response'] */ js.Any
  ]
  def listReviews(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls/{pull_number}/reviews']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls/{pull_number}/reviews']['response'] */ js.Any
  ]
  /**
    * The list of reviews returns in chronological order.
    */
  @JSName("listReviews")
  var listReviews_Original: `536`
  
  /**
    * Draft pull requests are available in public repositories with GitHub Free and GitHub Free for organizations, GitHub Pro, and legacy per-repository billing plans, and in public and private repositories with GitHub Team and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  @JSName("list")
  var list_Original: `529`
  
  /**
    * Merges a pull request into the base branch.
    * This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.
    */
  def merge(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/pulls/{pull_number}/merge']['response'] */ js.Any
  ]
  def merge(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/pulls/{pull_number}/merge']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/pulls/{pull_number}/merge']['response'] */ js.Any
  ]
  /**
    * Merges a pull request into the base branch.
    * This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.
    */
  @JSName("merge")
  var merge_Original: `537`
  
  /**
    * Removes review requests from a pull request for a given set of users and/or teams.
    */
  def removeRequestedReviewers(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/pulls/{pull_number}/requested_reviewers']['response'] */ js.Any
  ]
  def removeRequestedReviewers(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/pulls/{pull_number}/requested_reviewers']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/pulls/{pull_number}/requested_reviewers']['response'] */ js.Any
  ]
  /**
    * Removes review requests from a pull request for a given set of users and/or teams.
    */
  @JSName("removeRequestedReviewers")
  var removeRequestedReviewers_Original: `538`
  
  /**
    * This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.
    */
  def requestReviewers(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/pulls/{pull_number}/requested_reviewers']['response'] */ js.Any
  ]
  def requestReviewers(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/pulls/{pull_number}/requested_reviewers']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/pulls/{pull_number}/requested_reviewers']['response'] */ js.Any
  ]
  /**
    * This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.
    */
  @JSName("requestReviewers")
  var requestReviewers_Original: `539`
  
  /**
    * Submits a pending review for a pull request. For more information about creating a pending review for a pull request, see "[Create a review for a pull request](https://docs.github.com/rest/pulls#create-a-review-for-a-pull-request)."
    */
  def submitReview(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}/events']['response'] */ js.Any
  ]
  def submitReview(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}/events']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}/events']['response'] */ js.Any
  ]
  /**
    * Submits a pending review for a pull request. For more information about creating a pending review for a pull request, see "[Create a review for a pull request](https://docs.github.com/rest/pulls#create-a-review-for-a-pull-request)."
    */
  @JSName("submitReview")
  var submitReview_Original: `540`
  
  /**
    * Draft pull requests are available in public repositories with GitHub Free and GitHub Free for organizations, GitHub Pro, and legacy per-repository billing plans, and in public and private repositories with GitHub Team and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * To open or update a pull request in a public repository, you must have write access to the head or the source branch. For organization-owned repositories, you must be a member of the organization that owns the repository to open or update a pull request.
    */
  def update(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/pulls/{pull_number}']['response'] */ js.Any
  ]
  def update(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/pulls/{pull_number}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/pulls/{pull_number}']['response'] */ js.Any
  ]
  
  /**
    * Updates the pull request branch with the latest upstream changes by merging HEAD from the base branch into the pull request branch.
    */
  def updateBranch(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/pulls/{pull_number}/update-branch']['response'] */ js.Any
  ]
  def updateBranch(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/pulls/{pull_number}/update-branch']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/pulls/{pull_number}/update-branch']['response'] */ js.Any
  ]
  /**
    * Updates the pull request branch with the latest upstream changes by merging HEAD from the base branch into the pull request branch.
    */
  @JSName("updateBranch")
  var updateBranch_Original: `542`
  
  /**
    * Update the review summary comment with new text.
    */
  def updateReview(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}']['response'] */ js.Any
  ]
  def updateReview(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}']['response'] */ js.Any
  ]
  
  /**
    * Enables you to edit a review comment.
    */
  def updateReviewComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/pulls/comments/{comment_id}']['response'] */ js.Any
  ]
  def updateReviewComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/pulls/comments/{comment_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/pulls/comments/{comment_id}']['response'] */ js.Any
  ]
  /**
    * Enables you to edit a review comment.
    */
  @JSName("updateReviewComment")
  var updateReviewComment_Original: `544`
  
  /**
    * Update the review summary comment with new text.
    */
  @JSName("updateReview")
  var updateReview_Original: `543`
  
  /**
    * Draft pull requests are available in public repositories with GitHub Free and GitHub Free for organizations, GitHub Pro, and legacy per-repository billing plans, and in public and private repositories with GitHub Team and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * To open or update a pull request in a public repository, you must have write access to the head or the source branch. For organization-owned repositories, you must be a member of the organization that owns the repository to open or update a pull request.
    */
  @JSName("update")
  var update_Original: `541`
}
object CheckIfMerged {
  
  inline def apply(
    checkIfMerged: `518`,
    create: `519`,
    createReplyForReviewComment: `520`,
    createReview: `521`,
    createReviewComment: `522`,
    deletePendingReview: `523`,
    deleteReviewComment: `524`,
    dismissReview: `525`,
    get: `526`,
    getReview: `527`,
    getReviewComment: `528`,
    list: `529`,
    listCommentsForReview: `530`,
    listCommits: `531`,
    listFiles: `532`,
    listRequestedReviewers: `533`,
    listReviewComments: `534`,
    listReviewCommentsForRepo: `535`,
    listReviews: `536`,
    merge: `537`,
    removeRequestedReviewers: `538`,
    requestReviewers: `539`,
    submitReview: `540`,
    update: `541`,
    updateBranch: `542`,
    updateReview: `543`,
    updateReviewComment: `544`
  ): CheckIfMerged = {
    val __obj = js.Dynamic.literal(checkIfMerged = checkIfMerged.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], createReplyForReviewComment = createReplyForReviewComment.asInstanceOf[js.Any], createReview = createReview.asInstanceOf[js.Any], createReviewComment = createReviewComment.asInstanceOf[js.Any], deletePendingReview = deletePendingReview.asInstanceOf[js.Any], deleteReviewComment = deleteReviewComment.asInstanceOf[js.Any], dismissReview = dismissReview.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getReview = getReview.asInstanceOf[js.Any], getReviewComment = getReviewComment.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listCommentsForReview = listCommentsForReview.asInstanceOf[js.Any], listCommits = listCommits.asInstanceOf[js.Any], listFiles = listFiles.asInstanceOf[js.Any], listRequestedReviewers = listRequestedReviewers.asInstanceOf[js.Any], listReviewComments = listReviewComments.asInstanceOf[js.Any], listReviewCommentsForRepo = listReviewCommentsForRepo.asInstanceOf[js.Any], listReviews = listReviews.asInstanceOf[js.Any], merge = merge.asInstanceOf[js.Any], removeRequestedReviewers = removeRequestedReviewers.asInstanceOf[js.Any], requestReviewers = requestReviewers.asInstanceOf[js.Any], submitReview = submitReview.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateBranch = updateBranch.asInstanceOf[js.Any], updateReview = updateReview.asInstanceOf[js.Any], updateReviewComment = updateReviewComment.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckIfMerged]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckIfMerged] (val x: Self) extends AnyVal {
    
    inline def setCheckIfMerged(value: `518`): Self = StObject.set(x, "checkIfMerged", value.asInstanceOf[js.Any])
    
    inline def setCreate(value: `519`): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setCreateReplyForReviewComment(value: `520`): Self = StObject.set(x, "createReplyForReviewComment", value.asInstanceOf[js.Any])
    
    inline def setCreateReview(value: `521`): Self = StObject.set(x, "createReview", value.asInstanceOf[js.Any])
    
    inline def setCreateReviewComment(value: `522`): Self = StObject.set(x, "createReviewComment", value.asInstanceOf[js.Any])
    
    inline def setDeletePendingReview(value: `523`): Self = StObject.set(x, "deletePendingReview", value.asInstanceOf[js.Any])
    
    inline def setDeleteReviewComment(value: `524`): Self = StObject.set(x, "deleteReviewComment", value.asInstanceOf[js.Any])
    
    inline def setDismissReview(value: `525`): Self = StObject.set(x, "dismissReview", value.asInstanceOf[js.Any])
    
    inline def setGet(value: `526`): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setGetReview(value: `527`): Self = StObject.set(x, "getReview", value.asInstanceOf[js.Any])
    
    inline def setGetReviewComment(value: `528`): Self = StObject.set(x, "getReviewComment", value.asInstanceOf[js.Any])
    
    inline def setList(value: `529`): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListCommentsForReview(value: `530`): Self = StObject.set(x, "listCommentsForReview", value.asInstanceOf[js.Any])
    
    inline def setListCommits(value: `531`): Self = StObject.set(x, "listCommits", value.asInstanceOf[js.Any])
    
    inline def setListFiles(value: `532`): Self = StObject.set(x, "listFiles", value.asInstanceOf[js.Any])
    
    inline def setListRequestedReviewers(value: `533`): Self = StObject.set(x, "listRequestedReviewers", value.asInstanceOf[js.Any])
    
    inline def setListReviewComments(value: `534`): Self = StObject.set(x, "listReviewComments", value.asInstanceOf[js.Any])
    
    inline def setListReviewCommentsForRepo(value: `535`): Self = StObject.set(x, "listReviewCommentsForRepo", value.asInstanceOf[js.Any])
    
    inline def setListReviews(value: `536`): Self = StObject.set(x, "listReviews", value.asInstanceOf[js.Any])
    
    inline def setMerge(value: `537`): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
    
    inline def setRemoveRequestedReviewers(value: `538`): Self = StObject.set(x, "removeRequestedReviewers", value.asInstanceOf[js.Any])
    
    inline def setRequestReviewers(value: `539`): Self = StObject.set(x, "requestReviewers", value.asInstanceOf[js.Any])
    
    inline def setSubmitReview(value: `540`): Self = StObject.set(x, "submitReview", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: `541`): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateBranch(value: `542`): Self = StObject.set(x, "updateBranch", value.asInstanceOf[js.Any])
    
    inline def setUpdateReview(value: `543`): Self = StObject.set(x, "updateReview", value.asInstanceOf[js.Any])
    
    inline def setUpdateReviewComment(value: `544`): Self = StObject.set(x, "updateReviewComment", value.asInstanceOf[js.Any])
  }
}
