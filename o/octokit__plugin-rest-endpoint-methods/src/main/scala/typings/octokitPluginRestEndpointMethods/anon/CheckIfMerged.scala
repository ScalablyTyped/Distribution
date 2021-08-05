package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckIfMerged extends StObject {
  
  def checkIfMerged(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls/:pull_number/merge']['response'] */ js.Any
  ]
  def checkIfMerged(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls/:pull_number/merge']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls/:pull_number/merge']['response'] */ js.Any
  ]
  @JSName("checkIfMerged")
  var checkIfMerged_Original: `292`
  
  /**
    * Draft pull requests are available in public repositories with GitHub Free and GitHub Free for organizations, GitHub Pro, and legacy per-repository billing plans, and in public and private repositories with GitHub Team and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * To open or update a pull request in a public repository, you must have write access to the head or the source branch. For organization-owned repositories, you must be a member of the organization that owns the repository to open or update a pull request.
    *
    * You can create a new pull request.
    *
    * This endpoint triggers [notifications](https://docs.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  def create(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/pulls']['response'] */ js.Any
  ]
  def create(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/pulls']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/pulls']['response'] */ js.Any
  ]
  
  /**
    * Creates a reply to a review comment for a pull request. For the `comment_id`, provide the ID of the review comment you are replying to. This must be the ID of a _top-level review comment_, not a reply to that comment. Replies to replies are not supported.
    *
    * This endpoint triggers [notifications](https://docs.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  def createReplyForReviewComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/pulls/:pull_number/comments/:comment_id/replies']['response'] */ js.Any
  ]
  def createReplyForReviewComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/pulls/:pull_number/comments/:comment_id/replies']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/pulls/:pull_number/comments/:comment_id/replies']['response'] */ js.Any
  ]
  /**
    * Creates a reply to a review comment for a pull request. For the `comment_id`, provide the ID of the review comment you are replying to. This must be the ID of a _top-level review comment_, not a reply to that comment. Replies to replies are not supported.
    *
    * This endpoint triggers [notifications](https://docs.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  @JSName("createReplyForReviewComment")
  var createReplyForReviewComment_Original: `294`
  
  /**
    * This endpoint triggers [notifications](https://docs.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    *
    * Pull request reviews created in the `PENDING` state do not include the `submitted_at` property in the response.
    *
    * **Note:** To comment on a specific line in a file, you need to first determine the _position_ of that line in the diff. The GitHub REST API v3 offers the `application/vnd.github.v3.diff` [media type](https://developer.github.com/v3/media/#commits-commit-comparison-and-pull-requests). To see a pull request diff, add this media type to the `Accept` header of a call to the [single pull request](https://developer.github.com/v3/pulls/#get-a-pull-request) endpoint.
    *
    * The `position` value equals the number of lines down from the first "@@" hunk header in the file you want to add a comment. The line just below the "@@" line is position 1, the next line is position 2, and so on. The position in the diff continues to increase through lines of whitespace and additional hunks until the beginning of a new file.
    */
  def createReview(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/pulls/:pull_number/reviews']['response'] */ js.Any
  ]
  def createReview(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/pulls/:pull_number/reviews']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/pulls/:pull_number/reviews']['response'] */ js.Any
  ]
  
  /**
    * **Note:** Multi-line comments on pull requests are currently in public beta and subject to change.
    *
    * Creates a review comment in the pull request diff. To add a regular comment to a pull request timeline, see "[Create an issue comment](https://developer.github.com/v3/issues/comments/#create-an-issue-comment)." We recommend creating a review comment using `line`, `side`, and optionally `start_line` and `start_side` if your comment applies to more than one line in the pull request diff.
    *
    * You can still create a review comment using the `position` parameter. When you use `position`, the `line`, `side`, `start_line`, and `start_side` parameters are not required. For more information, see [Multi-line comment summary](https://developer.github.com/v3/pulls/comments/#multi-line-comment-summary-3).
    *
    * **Note:** The position value equals the number of lines down from the first "@@" hunk header in the file you want to add a comment. The line just below the "@@" line is position 1, the next line is position 2, and so on. The position in the diff continues to increase through lines of whitespace and additional hunks until the beginning of a new file.
    *
    * This endpoint triggers [notifications](https://docs.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    *
    * **Multi-line comment summary**
    *
    * **Note:** New parameters and response fields are available for developers to preview. During the preview period, these response fields may change without advance notice. Please see the [blog post](https://developer.github.com/changes/2019-10-03-multi-line-comments) for full details.
    *
    * Use the `comfort-fade` preview header and the `line` parameter to show multi-line comment-supported fields in the response.
    *
    * If you use the `comfort-fade` preview header, your response will show:
    *
    * *   For multi-line comments, values for `start_line`, `original_start_line`, `start_side`, `line`, `original_line`, and `side`.
    * *   For single-line comments, values for `line`, `original_line`, and `side` and a `null` value for `start_line`, `original_start_line`, and `start_side`.
    *
    * If you don't use the `comfort-fade` preview header, multi-line and single-line comments will appear the same way in the response with a single `position` attribute. Your response will show:
    *
    * *   For multi-line comments, the last line of the comment range for the `position` attribute.
    * *   For single-line comments, the diff-positioned way of referencing comments for the `position` attribute. For more information, see `position` in the [input parameters](https://developer.github.com/v3/pulls/comments/#parameters-2) table.
    */
  def createReviewComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/pulls/:pull_number/comments']['response'] */ js.Any
  ]
  def createReviewComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/pulls/:pull_number/comments']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/pulls/:pull_number/comments']['response'] */ js.Any
  ]
  /**
    * **Note:** Multi-line comments on pull requests are currently in public beta and subject to change.
    *
    * Creates a review comment in the pull request diff. To add a regular comment to a pull request timeline, see "[Create an issue comment](https://developer.github.com/v3/issues/comments/#create-an-issue-comment)." We recommend creating a review comment using `line`, `side`, and optionally `start_line` and `start_side` if your comment applies to more than one line in the pull request diff.
    *
    * You can still create a review comment using the `position` parameter. When you use `position`, the `line`, `side`, `start_line`, and `start_side` parameters are not required. For more information, see [Multi-line comment summary](https://developer.github.com/v3/pulls/comments/#multi-line-comment-summary-3).
    *
    * **Note:** The position value equals the number of lines down from the first "@@" hunk header in the file you want to add a comment. The line just below the "@@" line is position 1, the next line is position 2, and so on. The position in the diff continues to increase through lines of whitespace and additional hunks until the beginning of a new file.
    *
    * This endpoint triggers [notifications](https://docs.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    *
    * **Multi-line comment summary**
    *
    * **Note:** New parameters and response fields are available for developers to preview. During the preview period, these response fields may change without advance notice. Please see the [blog post](https://developer.github.com/changes/2019-10-03-multi-line-comments) for full details.
    *
    * Use the `comfort-fade` preview header and the `line` parameter to show multi-line comment-supported fields in the response.
    *
    * If you use the `comfort-fade` preview header, your response will show:
    *
    * *   For multi-line comments, values for `start_line`, `original_start_line`, `start_side`, `line`, `original_line`, and `side`.
    * *   For single-line comments, values for `line`, `original_line`, and `side` and a `null` value for `start_line`, `original_start_line`, and `start_side`.
    *
    * If you don't use the `comfort-fade` preview header, multi-line and single-line comments will appear the same way in the response with a single `position` attribute. Your response will show:
    *
    * *   For multi-line comments, the last line of the comment range for the `position` attribute.
    * *   For single-line comments, the diff-positioned way of referencing comments for the `position` attribute. For more information, see `position` in the [input parameters](https://developer.github.com/v3/pulls/comments/#parameters-2) table.
    */
  @JSName("createReviewComment")
  var createReviewComment_Original: `296`
  
  /**
    * This endpoint triggers [notifications](https://docs.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    *
    * Pull request reviews created in the `PENDING` state do not include the `submitted_at` property in the response.
    *
    * **Note:** To comment on a specific line in a file, you need to first determine the _position_ of that line in the diff. The GitHub REST API v3 offers the `application/vnd.github.v3.diff` [media type](https://developer.github.com/v3/media/#commits-commit-comparison-and-pull-requests). To see a pull request diff, add this media type to the `Accept` header of a call to the [single pull request](https://developer.github.com/v3/pulls/#get-a-pull-request) endpoint.
    *
    * The `position` value equals the number of lines down from the first "@@" hunk header in the file you want to add a comment. The line just below the "@@" line is position 1, the next line is position 2, and so on. The position in the diff continues to increase through lines of whitespace and additional hunks until the beginning of a new file.
    */
  @JSName("createReview")
  var createReview_Original: `295`
  
  /**
    * Draft pull requests are available in public repositories with GitHub Free and GitHub Free for organizations, GitHub Pro, and legacy per-repository billing plans, and in public and private repositories with GitHub Team and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * To open or update a pull request in a public repository, you must have write access to the head or the source branch. For organization-owned repositories, you must be a member of the organization that owns the repository to open or update a pull request.
    *
    * You can create a new pull request.
    *
    * This endpoint triggers [notifications](https://docs.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  @JSName("create")
  var create_Original: `293`
  
  def deletePendingReview(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id']['response'] */ js.Any
  ]
  def deletePendingReview(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id']['response'] */ js.Any
  ]
  @JSName("deletePendingReview")
  var deletePendingReview_Original: `297`
  
  /**
    * Deletes a review comment.
    */
  def deleteReviewComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/pulls/comments/:comment_id']['response'] */ js.Any
  ]
  def deleteReviewComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/pulls/comments/:comment_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/pulls/comments/:comment_id']['response'] */ js.Any
  ]
  /**
    * Deletes a review comment.
    */
  @JSName("deleteReviewComment")
  var deleteReviewComment_Original: `298`
  
  /**
    * **Note:** To dismiss a pull request review on a [protected branch](https://developer.github.com/v3/repos/branches/), you must be a repository administrator or be included in the list of people or teams who can dismiss pull request reviews.
    */
  def dismissReview(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id/dismissals']['response'] */ js.Any
  ]
  def dismissReview(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id/dismissals']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id/dismissals']['response'] */ js.Any
  ]
  /**
    * **Note:** To dismiss a pull request review on a [protected branch](https://developer.github.com/v3/repos/branches/), you must be a repository administrator or be included in the list of people or teams who can dismiss pull request reviews.
    */
  @JSName("dismissReview")
  var dismissReview_Original: `299`
  
  /**
    * Draft pull requests are available in public repositories with GitHub Free and GitHub Free for organizations, GitHub Pro, and legacy per-repository billing plans, and in public and private repositories with GitHub Team and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists details of a pull request by providing its number.
    *
    * When you get, [create](https://developer.github.com/v3/pulls/#create-a-pull-request), or [edit](https://developer.github.com/v3/pulls/#update-a-pull-request) a pull request, GitHub creates a merge commit to test whether the pull request can be automatically merged into the base branch. This test commit is not added to the base branch or the head branch. You can review the status of the test commit using the `mergeable` key. For more information, see "[Checking mergeability of pull requests](https://developer.github.com/v3/git/#checking-mergeability-of-pull-requests)".
    *
    * The value of the `mergeable` attribute can be `true`, `false`, or `null`. If the value is `null`, then GitHub has started a background job to compute the mergeability. After giving the job time to complete, resubmit the request. When the job finishes, you will see a non-`null` value for the `mergeable` attribute in the response. If `mergeable` is `true`, then `merge_commit_sha` will be the SHA of the _test_ merge commit.
    *
    * The value of the `merge_commit_sha` attribute changes depending on the state of the pull request. Before merging a pull request, the `merge_commit_sha` attribute holds the SHA of the _test_ merge commit. After merging a pull request, the `merge_commit_sha` attribute changes depending on how you merged the pull request:
    *
    * *   If merged as a [merge commit](https://docs.github.com/articles/about-merge-methods-on-github/), `merge_commit_sha` represents the SHA of the merge commit.
    * *   If merged via a [squash](https://docs.github.com/articles/about-merge-methods-on-github/#squashing-your-merge-commits), `merge_commit_sha` represents the SHA of the squashed commit on the base branch.
    * *   If [rebased](https://docs.github.com/articles/about-merge-methods-on-github/#rebasing-and-merging-your-commits), `merge_commit_sha` represents the commit that the base branch was updated to.
    *
    * Pass the appropriate [media type](https://developer.github.com/v3/media/#commits-commit-comparison-and-pull-requests) to fetch diff and patch formats.
    */
  def get(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls/:pull_number']['response'] */ js.Any
  ]
  def get(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls/:pull_number']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls/:pull_number']['response'] */ js.Any
  ]
  
  def getReview(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id']['response'] */ js.Any
  ]
  def getReview(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id']['response'] */ js.Any
  ]
  
  /**
    * **Note:** Multi-line comments on pull requests are currently in public beta and subject to change.
    *
    * Provides details for a review comment.
    *
    * **Multi-line comment summary**
    *
    * **Note:** New parameters and response fields are available for developers to preview. During the preview period, these response fields may change without advance notice. Please see the [blog post](https://developer.github.com/changes/2019-10-03-multi-line-comments) for full details.
    *
    * Use the `comfort-fade` preview header and the `line` parameter to show multi-line comment-supported fields in the response.
    *
    * If you use the `comfort-fade` preview header, your response will show:
    *
    * *   For multi-line comments, values for `start_line`, `original_start_line`, `start_side`, `line`, `original_line`, and `side`.
    * *   For single-line comments, values for `line`, `original_line`, and `side` and a `null` value for `start_line`, `original_start_line`, and `start_side`.
    *
    * If you don't use the `comfort-fade` preview header, multi-line and single-line comments will appear the same way in the response with a single `position` attribute. Your response will show:
    *
    * *   For multi-line comments, the last line of the comment range for the `position` attribute.
    * *   For single-line comments, the diff-positioned way of referencing comments for the `position` attribute. For more information, see `position` in the [input parameters](https://developer.github.com/v3/pulls/comments/#parameters-2) table.
    *
    * The `reactions` key will have the following payload where `url` can be used to construct the API location for [listing and creating](https://developer.github.com/v3/reactions) reactions.
    */
  def getReviewComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls/comments/:comment_id']['response'] */ js.Any
  ]
  def getReviewComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls/comments/:comment_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls/comments/:comment_id']['response'] */ js.Any
  ]
  /**
    * **Note:** Multi-line comments on pull requests are currently in public beta and subject to change.
    *
    * Provides details for a review comment.
    *
    * **Multi-line comment summary**
    *
    * **Note:** New parameters and response fields are available for developers to preview. During the preview period, these response fields may change without advance notice. Please see the [blog post](https://developer.github.com/changes/2019-10-03-multi-line-comments) for full details.
    *
    * Use the `comfort-fade` preview header and the `line` parameter to show multi-line comment-supported fields in the response.
    *
    * If you use the `comfort-fade` preview header, your response will show:
    *
    * *   For multi-line comments, values for `start_line`, `original_start_line`, `start_side`, `line`, `original_line`, and `side`.
    * *   For single-line comments, values for `line`, `original_line`, and `side` and a `null` value for `start_line`, `original_start_line`, and `start_side`.
    *
    * If you don't use the `comfort-fade` preview header, multi-line and single-line comments will appear the same way in the response with a single `position` attribute. Your response will show:
    *
    * *   For multi-line comments, the last line of the comment range for the `position` attribute.
    * *   For single-line comments, the diff-positioned way of referencing comments for the `position` attribute. For more information, see `position` in the [input parameters](https://developer.github.com/v3/pulls/comments/#parameters-2) table.
    *
    * The `reactions` key will have the following payload where `url` can be used to construct the API location for [listing and creating](https://developer.github.com/v3/reactions) reactions.
    */
  @JSName("getReviewComment")
  var getReviewComment_Original: `302`
  
  @JSName("getReview")
  var getReview_Original: `301`
  
  /**
    * Draft pull requests are available in public repositories with GitHub Free and GitHub Free for organizations, GitHub Pro, and legacy per-repository billing plans, and in public and private repositories with GitHub Team and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists details of a pull request by providing its number.
    *
    * When you get, [create](https://developer.github.com/v3/pulls/#create-a-pull-request), or [edit](https://developer.github.com/v3/pulls/#update-a-pull-request) a pull request, GitHub creates a merge commit to test whether the pull request can be automatically merged into the base branch. This test commit is not added to the base branch or the head branch. You can review the status of the test commit using the `mergeable` key. For more information, see "[Checking mergeability of pull requests](https://developer.github.com/v3/git/#checking-mergeability-of-pull-requests)".
    *
    * The value of the `mergeable` attribute can be `true`, `false`, or `null`. If the value is `null`, then GitHub has started a background job to compute the mergeability. After giving the job time to complete, resubmit the request. When the job finishes, you will see a non-`null` value for the `mergeable` attribute in the response. If `mergeable` is `true`, then `merge_commit_sha` will be the SHA of the _test_ merge commit.
    *
    * The value of the `merge_commit_sha` attribute changes depending on the state of the pull request. Before merging a pull request, the `merge_commit_sha` attribute holds the SHA of the _test_ merge commit. After merging a pull request, the `merge_commit_sha` attribute changes depending on how you merged the pull request:
    *
    * *   If merged as a [merge commit](https://docs.github.com/articles/about-merge-methods-on-github/), `merge_commit_sha` represents the SHA of the merge commit.
    * *   If merged via a [squash](https://docs.github.com/articles/about-merge-methods-on-github/#squashing-your-merge-commits), `merge_commit_sha` represents the SHA of the squashed commit on the base branch.
    * *   If [rebased](https://docs.github.com/articles/about-merge-methods-on-github/#rebasing-and-merging-your-commits), `merge_commit_sha` represents the commit that the base branch was updated to.
    *
    * Pass the appropriate [media type](https://developer.github.com/v3/media/#commits-commit-comparison-and-pull-requests) to fetch diff and patch formats.
    */
  @JSName("get")
  var get_Original: `300`
  
  /**
    * Draft pull requests are available in public repositories with GitHub Free and GitHub Free for organizations, GitHub Pro, and legacy per-repository billing plans, and in public and private repositories with GitHub Team and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  def list(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls']['response'] */ js.Any
  ]
  def list(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls']['response'] */ js.Any
  ]
  
  /**
    * List comments for a specific pull request review.
    */
  def listCommentsForReview(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id/comments']['response'] */ js.Any
  ]
  def listCommentsForReview(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id/comments']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id/comments']['response'] */ js.Any
  ]
  /**
    * List comments for a specific pull request review.
    */
  @JSName("listCommentsForReview")
  var listCommentsForReview_Original: `304`
  
  /**
    * Lists a maximum of 250 commits for a pull request. To receive a complete commit list for pull requests with more than 250 commits, use the [List commits](https://developer.github.com/v3/repos/commits/#list-commits) endpoint.
    */
  def listCommits(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls/:pull_number/commits']['response'] */ js.Any
  ]
  def listCommits(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls/:pull_number/commits']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls/:pull_number/commits']['response'] */ js.Any
  ]
  /**
    * Lists a maximum of 250 commits for a pull request. To receive a complete commit list for pull requests with more than 250 commits, use the [List commits](https://developer.github.com/v3/repos/commits/#list-commits) endpoint.
    */
  @JSName("listCommits")
  var listCommits_Original: `305`
  
  /**
    * **Note:** Responses include a maximum of 3000 files. The paginated response returns 30 files per page by default.
    */
  def listFiles(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls/:pull_number/files']['response'] */ js.Any
  ]
  def listFiles(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls/:pull_number/files']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls/:pull_number/files']['response'] */ js.Any
  ]
  /**
    * **Note:** Responses include a maximum of 3000 files. The paginated response returns 30 files per page by default.
    */
  @JSName("listFiles")
  var listFiles_Original: `306`
  
  def listRequestedReviewers(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls/:pull_number/requested_reviewers']['response'] */ js.Any
  ]
  def listRequestedReviewers(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls/:pull_number/requested_reviewers']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls/:pull_number/requested_reviewers']['response'] */ js.Any
  ]
  @JSName("listRequestedReviewers")
  var listRequestedReviewers_Original: `307`
  
  /**
    * **Note:** Multi-line comments on pull requests are currently in public beta and subject to change.
    *
    * Lists all review comments for a pull request. By default, review comments are in ascending order by ID.
    *
    * **Multi-line comment summary**
    *
    * **Note:** New parameters and response fields are available for developers to preview. During the preview period, these response fields may change without advance notice. Please see the [blog post](https://developer.github.com/changes/2019-10-03-multi-line-comments) for full details.
    *
    * Use the `comfort-fade` preview header and the `line` parameter to show multi-line comment-supported fields in the response.
    *
    * If you use the `comfort-fade` preview header, your response will show:
    *
    * *   For multi-line comments, values for `start_line`, `original_start_line`, `start_side`, `line`, `original_line`, and `side`.
    * *   For single-line comments, values for `line`, `original_line`, and `side` and a `null` value for `start_line`, `original_start_line`, and `start_side`.
    *
    * If you don't use the `comfort-fade` preview header, multi-line and single-line comments will appear the same way in the response with a single `position` attribute. Your response will show:
    *
    * *   For multi-line comments, the last line of the comment range for the `position` attribute.
    * *   For single-line comments, the diff-positioned way of referencing comments for the `position` attribute. For more information, see `position` in the [input parameters](https://developer.github.com/v3/pulls/comments/#parameters-2) table.
    *
    * The `reactions` key will have the following payload where `url` can be used to construct the API location for [listing and creating](https://developer.github.com/v3/reactions) reactions.
    */
  def listReviewComments(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls/:pull_number/comments']['response'] */ js.Any
  ]
  def listReviewComments(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls/:pull_number/comments']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls/:pull_number/comments']['response'] */ js.Any
  ]
  
  /**
    * **Note:** Multi-line comments on pull requests are currently in public beta and subject to change.
    *
    * Lists review comments for all pull requests in a repository. By default, review comments are in ascending order by ID.
    *
    * **Multi-line comment summary**
    *
    * **Note:** New parameters and response fields are available for developers to preview. During the preview period, these response fields may change without advance notice. Please see the [blog post](https://developer.github.com/changes/2019-10-03-multi-line-comments) for full details.
    *
    * Use the `comfort-fade` preview header and the `line` parameter to show multi-line comment-supported fields in the response.
    *
    * If you use the `comfort-fade` preview header, your response will show:
    *
    * *   For multi-line comments, values for `start_line`, `original_start_line`, `start_side`, `line`, `original_line`, and `side`.
    * *   For single-line comments, values for `line`, `original_line`, and `side` and a `null` value for `start_line`, `original_start_line`, and `start_side`.
    *
    * If you don't use the `comfort-fade` preview header, multi-line and single-line comments will appear the same way in the response with a single `position` attribute. Your response will show:
    *
    * *   For multi-line comments, the last line of the comment range for the `position` attribute.
    * *   For single-line comments, the diff-positioned way of referencing comments for the `position` attribute. For more information, see `position` in the [input parameters](https://developer.github.com/v3/pulls/comments/#parameters-2) table.
    *
    * The `reactions` key will have the following payload where `url` can be used to construct the API location for [listing and creating](https://developer.github.com/v3/reactions) reactions.
    */
  def listReviewCommentsForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls/comments']['response'] */ js.Any
  ]
  def listReviewCommentsForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls/comments']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls/comments']['response'] */ js.Any
  ]
  /**
    * **Note:** Multi-line comments on pull requests are currently in public beta and subject to change.
    *
    * Lists review comments for all pull requests in a repository. By default, review comments are in ascending order by ID.
    *
    * **Multi-line comment summary**
    *
    * **Note:** New parameters and response fields are available for developers to preview. During the preview period, these response fields may change without advance notice. Please see the [blog post](https://developer.github.com/changes/2019-10-03-multi-line-comments) for full details.
    *
    * Use the `comfort-fade` preview header and the `line` parameter to show multi-line comment-supported fields in the response.
    *
    * If you use the `comfort-fade` preview header, your response will show:
    *
    * *   For multi-line comments, values for `start_line`, `original_start_line`, `start_side`, `line`, `original_line`, and `side`.
    * *   For single-line comments, values for `line`, `original_line`, and `side` and a `null` value for `start_line`, `original_start_line`, and `start_side`.
    *
    * If you don't use the `comfort-fade` preview header, multi-line and single-line comments will appear the same way in the response with a single `position` attribute. Your response will show:
    *
    * *   For multi-line comments, the last line of the comment range for the `position` attribute.
    * *   For single-line comments, the diff-positioned way of referencing comments for the `position` attribute. For more information, see `position` in the [input parameters](https://developer.github.com/v3/pulls/comments/#parameters-2) table.
    *
    * The `reactions` key will have the following payload where `url` can be used to construct the API location for [listing and creating](https://developer.github.com/v3/reactions) reactions.
    */
  @JSName("listReviewCommentsForRepo")
  var listReviewCommentsForRepo_Original: `309`
  
  /**
    * **Note:** Multi-line comments on pull requests are currently in public beta and subject to change.
    *
    * Lists all review comments for a pull request. By default, review comments are in ascending order by ID.
    *
    * **Multi-line comment summary**
    *
    * **Note:** New parameters and response fields are available for developers to preview. During the preview period, these response fields may change without advance notice. Please see the [blog post](https://developer.github.com/changes/2019-10-03-multi-line-comments) for full details.
    *
    * Use the `comfort-fade` preview header and the `line` parameter to show multi-line comment-supported fields in the response.
    *
    * If you use the `comfort-fade` preview header, your response will show:
    *
    * *   For multi-line comments, values for `start_line`, `original_start_line`, `start_side`, `line`, `original_line`, and `side`.
    * *   For single-line comments, values for `line`, `original_line`, and `side` and a `null` value for `start_line`, `original_start_line`, and `start_side`.
    *
    * If you don't use the `comfort-fade` preview header, multi-line and single-line comments will appear the same way in the response with a single `position` attribute. Your response will show:
    *
    * *   For multi-line comments, the last line of the comment range for the `position` attribute.
    * *   For single-line comments, the diff-positioned way of referencing comments for the `position` attribute. For more information, see `position` in the [input parameters](https://developer.github.com/v3/pulls/comments/#parameters-2) table.
    *
    * The `reactions` key will have the following payload where `url` can be used to construct the API location for [listing and creating](https://developer.github.com/v3/reactions) reactions.
    */
  @JSName("listReviewComments")
  var listReviewComments_Original: `308`
  
  /**
    * The list of reviews returns in chronological order.
    */
  def listReviews(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls/:pull_number/reviews']['response'] */ js.Any
  ]
  def listReviews(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls/:pull_number/reviews']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/pulls/:pull_number/reviews']['response'] */ js.Any
  ]
  /**
    * The list of reviews returns in chronological order.
    */
  @JSName("listReviews")
  var listReviews_Original: `310`
  
  /**
    * Draft pull requests are available in public repositories with GitHub Free and GitHub Free for organizations, GitHub Pro, and legacy per-repository billing plans, and in public and private repositories with GitHub Team and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  @JSName("list")
  var list_Original: `303`
  
  /**
    * This endpoint triggers [notifications](https://docs.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  def merge(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/pulls/:pull_number/merge']['response'] */ js.Any
  ]
  def merge(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/pulls/:pull_number/merge']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/pulls/:pull_number/merge']['response'] */ js.Any
  ]
  /**
    * This endpoint triggers [notifications](https://docs.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  @JSName("merge")
  var merge_Original: `311`
  
  def removeRequestedReviewers(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/pulls/:pull_number/requested_reviewers']['response'] */ js.Any
  ]
  def removeRequestedReviewers(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/pulls/:pull_number/requested_reviewers']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/pulls/:pull_number/requested_reviewers']['response'] */ js.Any
  ]
  @JSName("removeRequestedReviewers")
  var removeRequestedReviewers_Original: `312`
  
  /**
    * This endpoint triggers [notifications](https://docs.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  def requestReviewers(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/pulls/:pull_number/requested_reviewers']['response'] */ js.Any
  ]
  def requestReviewers(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/pulls/:pull_number/requested_reviewers']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/pulls/:pull_number/requested_reviewers']['response'] */ js.Any
  ]
  /**
    * This endpoint triggers [notifications](https://docs.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  @JSName("requestReviewers")
  var requestReviewers_Original: `313`
  
  def submitReview(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id/events']['response'] */ js.Any
  ]
  def submitReview(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id/events']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id/events']['response'] */ js.Any
  ]
  @JSName("submitReview")
  var submitReview_Original: `314`
  
  /**
    * Draft pull requests are available in public repositories with GitHub Free and GitHub Free for organizations, GitHub Pro, and legacy per-repository billing plans, and in public and private repositories with GitHub Team and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * To open or update a pull request in a public repository, you must have write access to the head or the source branch. For organization-owned repositories, you must be a member of the organization that owns the repository to open or update a pull request.
    */
  def update(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/pulls/:pull_number']['response'] */ js.Any
  ]
  def update(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/pulls/:pull_number']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/pulls/:pull_number']['response'] */ js.Any
  ]
  
  /**
    * Updates the pull request branch with the latest upstream changes by merging HEAD from the base branch into the pull request branch.
    */
  def updateBranch(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/pulls/:pull_number/update-branch']['response'] */ js.Any
  ]
  def updateBranch(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/pulls/:pull_number/update-branch']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/pulls/:pull_number/update-branch']['response'] */ js.Any
  ]
  /**
    * Updates the pull request branch with the latest upstream changes by merging HEAD from the base branch into the pull request branch.
    */
  @JSName("updateBranch")
  var updateBranch_Original: `316`
  
  /**
    * Update the review summary comment with new text.
    */
  def updateReview(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id']['response'] */ js.Any
  ]
  def updateReview(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id']['response'] */ js.Any
  ]
  
  /**
    * **Note:** Multi-line comments on pull requests are currently in public beta and subject to change.
    *
    * Enables you to edit a review comment.
    *
    * **Multi-line comment summary**
    *
    * **Note:** New parameters and response fields are available for developers to preview. During the preview period, these response fields may change without advance notice. Please see the [blog post](https://developer.github.com/changes/2019-10-03-multi-line-comments) for full details.
    *
    * Use the `comfort-fade` preview header and the `line` parameter to show multi-line comment-supported fields in the response.
    *
    * If you use the `comfort-fade` preview header, your response will show:
    *
    * *   For multi-line comments, values for `start_line`, `original_start_line`, `start_side`, `line`, `original_line`, and `side`.
    * *   For single-line comments, values for `line`, `original_line`, and `side` and a `null` value for `start_line`, `original_start_line`, and `start_side`.
    *
    * If you don't use the `comfort-fade` preview header, multi-line and single-line comments will appear the same way in the response with a single `position` attribute. Your response will show:
    *
    * *   For multi-line comments, the last line of the comment range for the `position` attribute.
    * *   For single-line comments, the diff-positioned way of referencing comments for the `position` attribute. For more information, see `position` in the [input parameters](https://developer.github.com/v3/pulls/comments/#parameters-2) table.
    */
  def updateReviewComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/pulls/comments/:comment_id']['response'] */ js.Any
  ]
  def updateReviewComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/pulls/comments/:comment_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/pulls/comments/:comment_id']['response'] */ js.Any
  ]
  /**
    * **Note:** Multi-line comments on pull requests are currently in public beta and subject to change.
    *
    * Enables you to edit a review comment.
    *
    * **Multi-line comment summary**
    *
    * **Note:** New parameters and response fields are available for developers to preview. During the preview period, these response fields may change without advance notice. Please see the [blog post](https://developer.github.com/changes/2019-10-03-multi-line-comments) for full details.
    *
    * Use the `comfort-fade` preview header and the `line` parameter to show multi-line comment-supported fields in the response.
    *
    * If you use the `comfort-fade` preview header, your response will show:
    *
    * *   For multi-line comments, values for `start_line`, `original_start_line`, `start_side`, `line`, `original_line`, and `side`.
    * *   For single-line comments, values for `line`, `original_line`, and `side` and a `null` value for `start_line`, `original_start_line`, and `start_side`.
    *
    * If you don't use the `comfort-fade` preview header, multi-line and single-line comments will appear the same way in the response with a single `position` attribute. Your response will show:
    *
    * *   For multi-line comments, the last line of the comment range for the `position` attribute.
    * *   For single-line comments, the diff-positioned way of referencing comments for the `position` attribute. For more information, see `position` in the [input parameters](https://developer.github.com/v3/pulls/comments/#parameters-2) table.
    */
  @JSName("updateReviewComment")
  var updateReviewComment_Original: `318`
  
  /**
    * Update the review summary comment with new text.
    */
  @JSName("updateReview")
  var updateReview_Original: `317`
  
  /**
    * Draft pull requests are available in public repositories with GitHub Free and GitHub Free for organizations, GitHub Pro, and legacy per-repository billing plans, and in public and private repositories with GitHub Team and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * To open or update a pull request in a public repository, you must have write access to the head or the source branch. For organization-owned repositories, you must be a member of the organization that owns the repository to open or update a pull request.
    */
  @JSName("update")
  var update_Original: `315`
}
object CheckIfMerged {
  
  inline def apply(
    checkIfMerged: `292`,
    create: `293`,
    createReplyForReviewComment: `294`,
    createReview: `295`,
    createReviewComment: `296`,
    deletePendingReview: `297`,
    deleteReviewComment: `298`,
    dismissReview: `299`,
    get: `300`,
    getReview: `301`,
    getReviewComment: `302`,
    list: `303`,
    listCommentsForReview: `304`,
    listCommits: `305`,
    listFiles: `306`,
    listRequestedReviewers: `307`,
    listReviewComments: `308`,
    listReviewCommentsForRepo: `309`,
    listReviews: `310`,
    merge: `311`,
    removeRequestedReviewers: `312`,
    requestReviewers: `313`,
    submitReview: `314`,
    update: `315`,
    updateBranch: `316`,
    updateReview: `317`,
    updateReviewComment: `318`
  ): CheckIfMerged = {
    val __obj = js.Dynamic.literal(checkIfMerged = checkIfMerged.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], createReplyForReviewComment = createReplyForReviewComment.asInstanceOf[js.Any], createReview = createReview.asInstanceOf[js.Any], createReviewComment = createReviewComment.asInstanceOf[js.Any], deletePendingReview = deletePendingReview.asInstanceOf[js.Any], deleteReviewComment = deleteReviewComment.asInstanceOf[js.Any], dismissReview = dismissReview.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getReview = getReview.asInstanceOf[js.Any], getReviewComment = getReviewComment.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listCommentsForReview = listCommentsForReview.asInstanceOf[js.Any], listCommits = listCommits.asInstanceOf[js.Any], listFiles = listFiles.asInstanceOf[js.Any], listRequestedReviewers = listRequestedReviewers.asInstanceOf[js.Any], listReviewComments = listReviewComments.asInstanceOf[js.Any], listReviewCommentsForRepo = listReviewCommentsForRepo.asInstanceOf[js.Any], listReviews = listReviews.asInstanceOf[js.Any], merge = merge.asInstanceOf[js.Any], removeRequestedReviewers = removeRequestedReviewers.asInstanceOf[js.Any], requestReviewers = requestReviewers.asInstanceOf[js.Any], submitReview = submitReview.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateBranch = updateBranch.asInstanceOf[js.Any], updateReview = updateReview.asInstanceOf[js.Any], updateReviewComment = updateReviewComment.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckIfMerged]
  }
  
  extension [Self <: CheckIfMerged](x: Self) {
    
    inline def setCheckIfMerged(value: `292`): Self = StObject.set(x, "checkIfMerged", value.asInstanceOf[js.Any])
    
    inline def setCreate(value: `293`): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setCreateReplyForReviewComment(value: `294`): Self = StObject.set(x, "createReplyForReviewComment", value.asInstanceOf[js.Any])
    
    inline def setCreateReview(value: `295`): Self = StObject.set(x, "createReview", value.asInstanceOf[js.Any])
    
    inline def setCreateReviewComment(value: `296`): Self = StObject.set(x, "createReviewComment", value.asInstanceOf[js.Any])
    
    inline def setDeletePendingReview(value: `297`): Self = StObject.set(x, "deletePendingReview", value.asInstanceOf[js.Any])
    
    inline def setDeleteReviewComment(value: `298`): Self = StObject.set(x, "deleteReviewComment", value.asInstanceOf[js.Any])
    
    inline def setDismissReview(value: `299`): Self = StObject.set(x, "dismissReview", value.asInstanceOf[js.Any])
    
    inline def setGet(value: `300`): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setGetReview(value: `301`): Self = StObject.set(x, "getReview", value.asInstanceOf[js.Any])
    
    inline def setGetReviewComment(value: `302`): Self = StObject.set(x, "getReviewComment", value.asInstanceOf[js.Any])
    
    inline def setList(value: `303`): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListCommentsForReview(value: `304`): Self = StObject.set(x, "listCommentsForReview", value.asInstanceOf[js.Any])
    
    inline def setListCommits(value: `305`): Self = StObject.set(x, "listCommits", value.asInstanceOf[js.Any])
    
    inline def setListFiles(value: `306`): Self = StObject.set(x, "listFiles", value.asInstanceOf[js.Any])
    
    inline def setListRequestedReviewers(value: `307`): Self = StObject.set(x, "listRequestedReviewers", value.asInstanceOf[js.Any])
    
    inline def setListReviewComments(value: `308`): Self = StObject.set(x, "listReviewComments", value.asInstanceOf[js.Any])
    
    inline def setListReviewCommentsForRepo(value: `309`): Self = StObject.set(x, "listReviewCommentsForRepo", value.asInstanceOf[js.Any])
    
    inline def setListReviews(value: `310`): Self = StObject.set(x, "listReviews", value.asInstanceOf[js.Any])
    
    inline def setMerge(value: `311`): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
    
    inline def setRemoveRequestedReviewers(value: `312`): Self = StObject.set(x, "removeRequestedReviewers", value.asInstanceOf[js.Any])
    
    inline def setRequestReviewers(value: `313`): Self = StObject.set(x, "requestReviewers", value.asInstanceOf[js.Any])
    
    inline def setSubmitReview(value: `314`): Self = StObject.set(x, "submitReview", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: `315`): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateBranch(value: `316`): Self = StObject.set(x, "updateBranch", value.asInstanceOf[js.Any])
    
    inline def setUpdateReview(value: `317`): Self = StObject.set(x, "updateReview", value.asInstanceOf[js.Any])
    
    inline def setUpdateReviewComment(value: `318`): Self = StObject.set(x, "updateReviewComment", value.asInstanceOf[js.Any])
  }
}
