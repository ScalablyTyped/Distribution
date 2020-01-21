package typings.octokitRest

import typings.octokitRest.mod.AnyResponse
import typings.octokitRest.mod.PullsCheckIfMergedParams
import typings.octokitRest.mod.PullsCheckIfMergedParamsDeprecatedNumber
import typings.octokitRest.mod.PullsCreateCommentParams
import typings.octokitRest.mod.PullsCreateCommentParamsDeprecatedInReplyTo
import typings.octokitRest.mod.PullsCreateCommentParamsDeprecatedNumber
import typings.octokitRest.mod.PullsCreateCommentReplyParams
import typings.octokitRest.mod.PullsCreateCommentReplyParamsDeprecatedInReplyTo
import typings.octokitRest.mod.PullsCreateCommentReplyParamsDeprecatedNumber
import typings.octokitRest.mod.PullsCreateCommentReplyResponse
import typings.octokitRest.mod.PullsCreateCommentResponse
import typings.octokitRest.mod.PullsCreateFromIssueParams
import typings.octokitRest.mod.PullsCreateFromIssueResponse
import typings.octokitRest.mod.PullsCreateParams
import typings.octokitRest.mod.PullsCreateResponse
import typings.octokitRest.mod.PullsCreateReviewCommentReplyParams
import typings.octokitRest.mod.PullsCreateReviewCommentReplyResponse
import typings.octokitRest.mod.PullsCreateReviewParams
import typings.octokitRest.mod.PullsCreateReviewParamsDeprecatedNumber
import typings.octokitRest.mod.PullsCreateReviewRequestParams
import typings.octokitRest.mod.PullsCreateReviewRequestParamsDeprecatedNumber
import typings.octokitRest.mod.PullsCreateReviewRequestResponse
import typings.octokitRest.mod.PullsCreateReviewResponse
import typings.octokitRest.mod.PullsDeleteCommentParams
import typings.octokitRest.mod.PullsDeletePendingReviewParams
import typings.octokitRest.mod.PullsDeletePendingReviewParamsDeprecatedNumber
import typings.octokitRest.mod.PullsDeletePendingReviewResponse
import typings.octokitRest.mod.PullsDeleteReviewRequestParams
import typings.octokitRest.mod.PullsDeleteReviewRequestParamsDeprecatedNumber
import typings.octokitRest.mod.PullsDismissReviewParams
import typings.octokitRest.mod.PullsDismissReviewParamsDeprecatedNumber
import typings.octokitRest.mod.PullsDismissReviewResponse
import typings.octokitRest.mod.PullsGetCommentParams
import typings.octokitRest.mod.PullsGetCommentResponse
import typings.octokitRest.mod.PullsGetCommentsForReviewParams
import typings.octokitRest.mod.PullsGetCommentsForReviewParamsDeprecatedNumber
import typings.octokitRest.mod.PullsGetCommentsForReviewResponse
import typings.octokitRest.mod.PullsGetParams
import typings.octokitRest.mod.PullsGetParamsDeprecatedNumber
import typings.octokitRest.mod.PullsGetResponse
import typings.octokitRest.mod.PullsGetReviewParams
import typings.octokitRest.mod.PullsGetReviewParamsDeprecatedNumber
import typings.octokitRest.mod.PullsGetReviewResponse
import typings.octokitRest.mod.PullsListCommentsForRepoParams
import typings.octokitRest.mod.PullsListCommentsForRepoResponse
import typings.octokitRest.mod.PullsListCommentsParams
import typings.octokitRest.mod.PullsListCommentsParamsDeprecatedNumber
import typings.octokitRest.mod.PullsListCommentsResponse
import typings.octokitRest.mod.PullsListCommitsParams
import typings.octokitRest.mod.PullsListCommitsParamsDeprecatedNumber
import typings.octokitRest.mod.PullsListCommitsResponse
import typings.octokitRest.mod.PullsListFilesParams
import typings.octokitRest.mod.PullsListFilesParamsDeprecatedNumber
import typings.octokitRest.mod.PullsListFilesResponse
import typings.octokitRest.mod.PullsListParams
import typings.octokitRest.mod.PullsListResponse
import typings.octokitRest.mod.PullsListReviewRequestsParams
import typings.octokitRest.mod.PullsListReviewRequestsParamsDeprecatedNumber
import typings.octokitRest.mod.PullsListReviewRequestsResponse
import typings.octokitRest.mod.PullsListReviewsParams
import typings.octokitRest.mod.PullsListReviewsParamsDeprecatedNumber
import typings.octokitRest.mod.PullsListReviewsResponse
import typings.octokitRest.mod.PullsMergeParams
import typings.octokitRest.mod.PullsMergeParamsDeprecatedNumber
import typings.octokitRest.mod.PullsMergeResponse
import typings.octokitRest.mod.PullsSubmitReviewParams
import typings.octokitRest.mod.PullsSubmitReviewParamsDeprecatedNumber
import typings.octokitRest.mod.PullsSubmitReviewResponse
import typings.octokitRest.mod.PullsUpdateBranchParams
import typings.octokitRest.mod.PullsUpdateBranchResponse
import typings.octokitRest.mod.PullsUpdateCommentParams
import typings.octokitRest.mod.PullsUpdateCommentResponse
import typings.octokitRest.mod.PullsUpdateParams
import typings.octokitRest.mod.PullsUpdateParamsDeprecatedNumber
import typings.octokitRest.mod.PullsUpdateResponse
import typings.octokitRest.mod.PullsUpdateReviewParams
import typings.octokitRest.mod.PullsUpdateReviewParamsDeprecatedNumber
import typings.octokitRest.mod.PullsUpdateReviewResponse
import typings.octokitRest.mod.RequestOptions
import typings.octokitRest.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCheckIfMerged extends js.Object {
  @JSName("checkIfMerged")
  var checkIfMerged_Original: AnonEndpointParamsAnyResponsePromise = js.native
  /**
    * **Note:** Multi-line comments on pull requests are currently in public beta and subject to change.
    *
    * Creates a review comment in the pull request diff. To add a regular comment to a pull request timeline, see "[Comments](https://developer.github.com/v3/issues/comments/#create-a-comment)." We recommend creating a review comment using `line`, `side`, and optionally `start_line` and `start_side` if your comment applies to more than one line in the pull request diff.
    *
    * You can still create a review comment using the `position` parameter. When you use `position`, the `line`, `side`, `start_line`, and `start_side` parameters are not required. For more information, see [Multi-line comment summary](https://developer.github.com/v3/pulls/comments/#multi-line-comment-summary-3).
    *
    * **Note:** The position value equals the number of lines down from the first "@@" hunk header in the file you want to add a comment. The line just below the "@@" line is position 1, the next line is position 2, and so on. The position in the diff continues to increase through lines of whitespace and additional hunks until the beginning of a new file.
    *
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
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
    * @deprecated octokit.pulls.createCommentReply() has been renamed to octokit.pulls.createComment() (2019-09-09)
    */
  @JSName("createCommentReply")
  var createCommentReply_Original: AnonEndpointParamsPromisePullsCreateCommentReplyParams = js.native
  /**
    * **Note:** Multi-line comments on pull requests are currently in public beta and subject to change.
    *
    * Creates a review comment in the pull request diff. To add a regular comment to a pull request timeline, see "[Comments](https://developer.github.com/v3/issues/comments/#create-a-comment)." We recommend creating a review comment using `line`, `side`, and optionally `start_line` and `start_side` if your comment applies to more than one line in the pull request diff.
    *
    * You can still create a review comment using the `position` parameter. When you use `position`, the `line`, `side`, `start_line`, and `start_side` parameters are not required. For more information, see [Multi-line comment summary](https://developer.github.com/v3/pulls/comments/#multi-line-comment-summary-3).
    *
    * **Note:** The position value equals the number of lines down from the first "@@" hunk header in the file you want to add a comment. The line just below the "@@" line is position 1, the next line is position 2, and so on. The position in the diff continues to increase through lines of whitespace and additional hunks until the beginning of a new file.
    *
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
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
  @JSName("createComment")
  var createComment_Original: AnonEndpointParamsPromisePullsCreateCommentParams = js.native
  @JSName("createFromIssue")
  var createFromIssue_Original: AnonEndpointParamsPromisePullsCreateFromIssueParams = js.native
  /**
    * Creates a reply to a review comment for a pull request. For the `comment_id`, provide the ID of the review comment you are replying to. This must be the ID of a _top-level review comment_, not a reply to that comment. Replies to replies are not supported.
    *
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  @JSName("createReviewCommentReply")
  var createReviewCommentReply_Original: AnonEndpointParamsPromisePullsCreateReviewCommentReplyParams = js.native
  /**
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  @JSName("createReviewRequest")
  var createReviewRequest_Original: AnonEndpointParamsPromisePullsCreateReviewRequestParams = js.native
  /**
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    *
    * **Note:** To comment on a specific line in a file, you need to first determine the _position_ of that line in the diff. The GitHub REST API v3 offers the `application/vnd.github.v3.diff` [media type](https://developer.github.com/v3/media/#commits-commit-comparison-and-pull-requests). To see a pull request diff, add this media type to the `Accept` header of a call to the [single pull request](https://developer.github.com/v3/pulls/#get-a-single-pull-request) endpoint.
    *
    * The `position` value equals the number of lines down from the first "@@" hunk header in the file you want to add a comment. The line just below the "@@" line is position 1, the next line is position 2, and so on. The position in the diff continues to increase through lines of whitespace and additional hunks until the beginning of a new file.
    */
  @JSName("createReview")
  var createReview_Original: AnonEndpointParamsPromisePullsCreateReviewParams = js.native
  /**
    * Draft pull requests are available in public repositories with GitHub Free and GitHub Pro, and in public and private repositories with GitHub Team and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * To open or update a pull request in a public repository, you must have write access to the head or the source branch. For organization-owned repositories, you must be a member of the organization that owns the repository to open or update a pull request.
    *
    * You can create a new pull request.
    *
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  @JSName("create")
  var create_Original: AnonEndpointParamsPromise = js.native
  /**
    * Deletes a review comment.
    */
  @JSName("deleteComment")
  var deleteComment_Original: AnonEndpointParamsAnyResponsePromisePullsDeleteCommentParams = js.native
  @JSName("deletePendingReview")
  var deletePendingReview_Original: AnonEndpointParamsPromisePullsDeletePendingReviewParams = js.native
  @JSName("deleteReviewRequest")
  var deleteReviewRequest_Original: AnonEndpointParamsAnyResponsePromisePullsDeleteReviewRequestParams = js.native
  /**
    * **Note:** To dismiss a pull request review on a [protected branch](https://developer.github.com/v3/repos/branches/), you must be a repository administrator or be included in the list of people or teams who can dismiss pull request reviews.
    */
  @JSName("dismissReview")
  var dismissReview_Original: AnonEndpointParamsPromisePullsDismissReviewParams = js.native
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
  @JSName("getComment")
  var getComment_Original: AnonEndpointParamsPromisePullsGetCommentParams = js.native
  @JSName("getCommentsForReview")
  var getCommentsForReview_Original: AnonEndpointParamsPromisePullsGetCommentsForReviewParams = js.native
  @JSName("getReview")
  var getReview_Original: AnonEndpointParamsPromisePullsGetReviewParams = js.native
  /**
    * Draft pull requests are available in public repositories with GitHub Free and GitHub Pro, and in public and private repositories with GitHub Team and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists details of a pull request by providing its number.
    *
    * When you get, [create](https://developer.github.com/v3/pulls/#create-a-pull-request), or [edit](https://developer.github.com/v3/pulls/#update-a-pull-request) a pull request, GitHub creates a merge commit to test whether the pull request can be automatically merged into the base branch. This test commit is not added to the base branch or the head branch. You can review the status of the test commit using the `mergeable` key. For more information, see "[Checking mergeability of pull requests](https://developer.github.com/v3/git/#checking-mergeability-of-pull-requests)".
    *
    * The value of the `mergeable` attribute can be `true`, `false`, or `null`. If the value is `null`, then GitHub has started a background job to compute the mergeability. After giving the job time to complete, resubmit the request. When the job finishes, you will see a non-`null` value for the `mergeable` attribute in the response. If `mergeable` is `true`, then `merge_commit_sha` will be the SHA of the _test_ merge commit.
    *
    * The value of the `merge_commit_sha` attribute changes depending on the state of the pull request. Before merging a pull request, the `merge_commit_sha` attribute holds the SHA of the _test_ merge commit. After merging a pull request, the `merge_commit_sha` attribute changes depending on how you merged the pull request:
    *
    * *   If merged as a [merge commit](https://help.github.com/articles/about-merge-methods-on-github/), `merge_commit_sha` represents the SHA of the merge commit.
    * *   If merged via a [squash](https://help.github.com/articles/about-merge-methods-on-github/#squashing-your-merge-commits), `merge_commit_sha` represents the SHA of the squashed commit on the base branch.
    * *   If [rebased](https://help.github.com/articles/about-merge-methods-on-github/#rebasing-and-merging-your-commits), `merge_commit_sha` represents the commit that the base branch was updated to.
    *
    * Pass the appropriate [media type](https://developer.github.com/v3/media/#commits-commit-comparison-and-pull-requests) to fetch diff and patch formats.
    */
  @JSName("get")
  var get_Original: AnonEndpointParamsPromisePullsGetParams = js.native
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
  @JSName("listCommentsForRepo")
  var listCommentsForRepo_Original: AnonEndpointParamsPromisePullsListCommentsForRepoParams = js.native
  /**
    * **Note:** Multi-line comments on pull requests are currently in public beta and subject to change.
    *
    * Lists review comments for a pull request. By default, review comments are in ascending order by ID.
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
  @JSName("listComments")
  var listComments_Original: AnonEndpointParamsPromisePullsListCommentsParams = js.native
  /**
    * Lists a maximum of 250 commits for a pull request. To receive a complete commit list for pull requests with more than 250 commits, use the [Commit List API](https://developer.github.com/v3/repos/commits/#list-commits-on-a-repository).
    */
  @JSName("listCommits")
  var listCommits_Original: AnonEndpointParamsPromisePullsListCommitsParams = js.native
  /**
    * **Note:** The response includes a maximum of 300 files.
    */
  @JSName("listFiles")
  var listFiles_Original: AnonEndpointParamsPromisePullsListFilesParams = js.native
  @JSName("listReviewRequests")
  var listReviewRequests_Original: AnonEndpointParamsPromisePullsListReviewRequestsParams = js.native
  /**
    * The list of reviews returns in chronological order.
    */
  @JSName("listReviews")
  var listReviews_Original: AnonEndpointParamsPromisePullsListReviewsParams = js.native
  /**
    * Draft pull requests are available in public repositories with GitHub Free and GitHub Pro, and in public and private repositories with GitHub Team and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  @JSName("list")
  var list_Original: AnonEndpointParamsPromisePullsListParams = js.native
  /**
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  @JSName("merge")
  var merge_Original: AnonEndpointParamsPromisePullsMergeParams = js.native
  @JSName("submitReview")
  var submitReview_Original: AnonEndpointParamsPromisePullsSubmitReviewParams = js.native
  /**
    * Updates the pull request branch with the latest upstream changes by merging HEAD from the base branch into the pull request branch.
    */
  @JSName("updateBranch")
  var updateBranch_Original: AnonEndpointParamsPromisePullsUpdateBranchParams = js.native
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
  @JSName("updateComment")
  var updateComment_Original: AnonEndpointParamsPromisePullsUpdateCommentParams = js.native
  /**
    * Update the review summary comment with new text.
    */
  @JSName("updateReview")
  var updateReview_Original: AnonEndpointParamsPromisePullsUpdateReviewParams = js.native
  /**
    * Draft pull requests are available in public repositories with GitHub Free and GitHub Pro, and in public and private repositories with GitHub Team and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * To open or update a pull request in a public repository, you must have write access to the head or the source branch. For organization-owned repositories, you must be a member of the organization that owns the repository to open or update a pull request.
    */
  @JSName("update")
  var update_Original: AnonEndpointParamsPromisePullsUpdateParams = js.native
  def checkIfMerged(): js.Promise[AnyResponse] = js.native
  def checkIfMerged(params: RequestOptions with PullsCheckIfMergedParamsDeprecatedNumber with PullsCheckIfMergedParams): js.Promise[AnyResponse] = js.native
  /**
    * Draft pull requests are available in public repositories with GitHub Free and GitHub Pro, and in public and private repositories with GitHub Team and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * To open or update a pull request in a public repository, you must have write access to the head or the source branch. For organization-owned repositories, you must be a member of the organization that owns the repository to open or update a pull request.
    *
    * You can create a new pull request.
    *
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  def create(): js.Promise[Response[PullsCreateResponse]] = js.native
  def create(params: RequestOptions with PullsCreateParams): js.Promise[Response[PullsCreateResponse]] = js.native
  /**
    * **Note:** Multi-line comments on pull requests are currently in public beta and subject to change.
    *
    * Creates a review comment in the pull request diff. To add a regular comment to a pull request timeline, see "[Comments](https://developer.github.com/v3/issues/comments/#create-a-comment)." We recommend creating a review comment using `line`, `side`, and optionally `start_line` and `start_side` if your comment applies to more than one line in the pull request diff.
    *
    * You can still create a review comment using the `position` parameter. When you use `position`, the `line`, `side`, `start_line`, and `start_side` parameters are not required. For more information, see [Multi-line comment summary](https://developer.github.com/v3/pulls/comments/#multi-line-comment-summary-3).
    *
    * **Note:** The position value equals the number of lines down from the first "@@" hunk header in the file you want to add a comment. The line just below the "@@" line is position 1, the next line is position 2, and so on. The position in the diff continues to increase through lines of whitespace and additional hunks until the beginning of a new file.
    *
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
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
  def createComment(): js.Promise[Response[PullsCreateCommentResponse]] = js.native
  def createComment(
    params: RequestOptions with PullsCreateCommentParamsDeprecatedNumber with PullsCreateCommentParamsDeprecatedInReplyTo with PullsCreateCommentParams
  ): js.Promise[Response[PullsCreateCommentResponse]] = js.native
  /**
    * **Note:** Multi-line comments on pull requests are currently in public beta and subject to change.
    *
    * Creates a review comment in the pull request diff. To add a regular comment to a pull request timeline, see "[Comments](https://developer.github.com/v3/issues/comments/#create-a-comment)." We recommend creating a review comment using `line`, `side`, and optionally `start_line` and `start_side` if your comment applies to more than one line in the pull request diff.
    *
    * You can still create a review comment using the `position` parameter. When you use `position`, the `line`, `side`, `start_line`, and `start_side` parameters are not required. For more information, see [Multi-line comment summary](https://developer.github.com/v3/pulls/comments/#multi-line-comment-summary-3).
    *
    * **Note:** The position value equals the number of lines down from the first "@@" hunk header in the file you want to add a comment. The line just below the "@@" line is position 1, the next line is position 2, and so on. The position in the diff continues to increase through lines of whitespace and additional hunks until the beginning of a new file.
    *
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
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
    * @deprecated octokit.pulls.createCommentReply() has been renamed to octokit.pulls.createComment() (2019-09-09)
    */
  def createCommentReply(): js.Promise[Response[PullsCreateCommentReplyResponse]] = js.native
  def createCommentReply(
    params: RequestOptions with PullsCreateCommentReplyParamsDeprecatedNumber with PullsCreateCommentReplyParamsDeprecatedInReplyTo with PullsCreateCommentReplyParams
  ): js.Promise[Response[PullsCreateCommentReplyResponse]] = js.native
  def createFromIssue(): js.Promise[Response[PullsCreateFromIssueResponse]] = js.native
  def createFromIssue(params: RequestOptions with PullsCreateFromIssueParams): js.Promise[Response[PullsCreateFromIssueResponse]] = js.native
  /**
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    *
    * **Note:** To comment on a specific line in a file, you need to first determine the _position_ of that line in the diff. The GitHub REST API v3 offers the `application/vnd.github.v3.diff` [media type](https://developer.github.com/v3/media/#commits-commit-comparison-and-pull-requests). To see a pull request diff, add this media type to the `Accept` header of a call to the [single pull request](https://developer.github.com/v3/pulls/#get-a-single-pull-request) endpoint.
    *
    * The `position` value equals the number of lines down from the first "@@" hunk header in the file you want to add a comment. The line just below the "@@" line is position 1, the next line is position 2, and so on. The position in the diff continues to increase through lines of whitespace and additional hunks until the beginning of a new file.
    */
  def createReview(): js.Promise[Response[PullsCreateReviewResponse]] = js.native
  def createReview(params: RequestOptions with PullsCreateReviewParamsDeprecatedNumber with PullsCreateReviewParams): js.Promise[Response[PullsCreateReviewResponse]] = js.native
  /**
    * Creates a reply to a review comment for a pull request. For the `comment_id`, provide the ID of the review comment you are replying to. This must be the ID of a _top-level review comment_, not a reply to that comment. Replies to replies are not supported.
    *
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  def createReviewCommentReply(): js.Promise[Response[PullsCreateReviewCommentReplyResponse]] = js.native
  def createReviewCommentReply(params: RequestOptions with PullsCreateReviewCommentReplyParams): js.Promise[Response[PullsCreateReviewCommentReplyResponse]] = js.native
  /**
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  def createReviewRequest(): js.Promise[Response[PullsCreateReviewRequestResponse]] = js.native
  def createReviewRequest(
    params: RequestOptions with PullsCreateReviewRequestParamsDeprecatedNumber with PullsCreateReviewRequestParams
  ): js.Promise[Response[PullsCreateReviewRequestResponse]] = js.native
  /**
    * Deletes a review comment.
    */
  def deleteComment(): js.Promise[AnyResponse] = js.native
  def deleteComment(params: RequestOptions with PullsDeleteCommentParams): js.Promise[AnyResponse] = js.native
  def deletePendingReview(): js.Promise[Response[PullsDeletePendingReviewResponse]] = js.native
  def deletePendingReview(
    params: RequestOptions with PullsDeletePendingReviewParamsDeprecatedNumber with PullsDeletePendingReviewParams
  ): js.Promise[Response[PullsDeletePendingReviewResponse]] = js.native
  def deleteReviewRequest(): js.Promise[AnyResponse] = js.native
  def deleteReviewRequest(
    params: RequestOptions with PullsDeleteReviewRequestParamsDeprecatedNumber with PullsDeleteReviewRequestParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * **Note:** To dismiss a pull request review on a [protected branch](https://developer.github.com/v3/repos/branches/), you must be a repository administrator or be included in the list of people or teams who can dismiss pull request reviews.
    */
  def dismissReview(): js.Promise[Response[PullsDismissReviewResponse]] = js.native
  def dismissReview(params: RequestOptions with PullsDismissReviewParamsDeprecatedNumber with PullsDismissReviewParams): js.Promise[Response[PullsDismissReviewResponse]] = js.native
  /**
    * Draft pull requests are available in public repositories with GitHub Free and GitHub Pro, and in public and private repositories with GitHub Team and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists details of a pull request by providing its number.
    *
    * When you get, [create](https://developer.github.com/v3/pulls/#create-a-pull-request), or [edit](https://developer.github.com/v3/pulls/#update-a-pull-request) a pull request, GitHub creates a merge commit to test whether the pull request can be automatically merged into the base branch. This test commit is not added to the base branch or the head branch. You can review the status of the test commit using the `mergeable` key. For more information, see "[Checking mergeability of pull requests](https://developer.github.com/v3/git/#checking-mergeability-of-pull-requests)".
    *
    * The value of the `mergeable` attribute can be `true`, `false`, or `null`. If the value is `null`, then GitHub has started a background job to compute the mergeability. After giving the job time to complete, resubmit the request. When the job finishes, you will see a non-`null` value for the `mergeable` attribute in the response. If `mergeable` is `true`, then `merge_commit_sha` will be the SHA of the _test_ merge commit.
    *
    * The value of the `merge_commit_sha` attribute changes depending on the state of the pull request. Before merging a pull request, the `merge_commit_sha` attribute holds the SHA of the _test_ merge commit. After merging a pull request, the `merge_commit_sha` attribute changes depending on how you merged the pull request:
    *
    * *   If merged as a [merge commit](https://help.github.com/articles/about-merge-methods-on-github/), `merge_commit_sha` represents the SHA of the merge commit.
    * *   If merged via a [squash](https://help.github.com/articles/about-merge-methods-on-github/#squashing-your-merge-commits), `merge_commit_sha` represents the SHA of the squashed commit on the base branch.
    * *   If [rebased](https://help.github.com/articles/about-merge-methods-on-github/#rebasing-and-merging-your-commits), `merge_commit_sha` represents the commit that the base branch was updated to.
    *
    * Pass the appropriate [media type](https://developer.github.com/v3/media/#commits-commit-comparison-and-pull-requests) to fetch diff and patch formats.
    */
  def get(): js.Promise[Response[PullsGetResponse]] = js.native
  def get(params: RequestOptions with PullsGetParamsDeprecatedNumber with PullsGetParams): js.Promise[Response[PullsGetResponse]] = js.native
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
  def getComment(): js.Promise[Response[PullsGetCommentResponse]] = js.native
  def getComment(params: RequestOptions with PullsGetCommentParams): js.Promise[Response[PullsGetCommentResponse]] = js.native
  def getCommentsForReview(): js.Promise[Response[PullsGetCommentsForReviewResponse]] = js.native
  def getCommentsForReview(
    params: RequestOptions with PullsGetCommentsForReviewParamsDeprecatedNumber with PullsGetCommentsForReviewParams
  ): js.Promise[Response[PullsGetCommentsForReviewResponse]] = js.native
  def getReview(): js.Promise[Response[PullsGetReviewResponse]] = js.native
  def getReview(params: RequestOptions with PullsGetReviewParamsDeprecatedNumber with PullsGetReviewParams): js.Promise[Response[PullsGetReviewResponse]] = js.native
  /**
    * Draft pull requests are available in public repositories with GitHub Free and GitHub Pro, and in public and private repositories with GitHub Team and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  def list(): js.Promise[Response[PullsListResponse]] = js.native
  def list(params: RequestOptions with PullsListParams): js.Promise[Response[PullsListResponse]] = js.native
  /**
    * **Note:** Multi-line comments on pull requests are currently in public beta and subject to change.
    *
    * Lists review comments for a pull request. By default, review comments are in ascending order by ID.
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
  def listComments(): js.Promise[Response[PullsListCommentsResponse]] = js.native
  def listComments(params: RequestOptions with PullsListCommentsParamsDeprecatedNumber with PullsListCommentsParams): js.Promise[Response[PullsListCommentsResponse]] = js.native
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
  def listCommentsForRepo(): js.Promise[Response[PullsListCommentsForRepoResponse]] = js.native
  def listCommentsForRepo(params: RequestOptions with PullsListCommentsForRepoParams): js.Promise[Response[PullsListCommentsForRepoResponse]] = js.native
  /**
    * Lists a maximum of 250 commits for a pull request. To receive a complete commit list for pull requests with more than 250 commits, use the [Commit List API](https://developer.github.com/v3/repos/commits/#list-commits-on-a-repository).
    */
  def listCommits(): js.Promise[Response[PullsListCommitsResponse]] = js.native
  def listCommits(params: RequestOptions with PullsListCommitsParamsDeprecatedNumber with PullsListCommitsParams): js.Promise[Response[PullsListCommitsResponse]] = js.native
  /**
    * **Note:** The response includes a maximum of 300 files.
    */
  def listFiles(): js.Promise[Response[PullsListFilesResponse]] = js.native
  def listFiles(params: RequestOptions with PullsListFilesParamsDeprecatedNumber with PullsListFilesParams): js.Promise[Response[PullsListFilesResponse]] = js.native
  def listReviewRequests(): js.Promise[Response[PullsListReviewRequestsResponse]] = js.native
  def listReviewRequests(
    params: RequestOptions with PullsListReviewRequestsParamsDeprecatedNumber with PullsListReviewRequestsParams
  ): js.Promise[Response[PullsListReviewRequestsResponse]] = js.native
  /**
    * The list of reviews returns in chronological order.
    */
  def listReviews(): js.Promise[Response[PullsListReviewsResponse]] = js.native
  def listReviews(params: RequestOptions with PullsListReviewsParamsDeprecatedNumber with PullsListReviewsParams): js.Promise[Response[PullsListReviewsResponse]] = js.native
  /**
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  def merge(): js.Promise[Response[PullsMergeResponse]] = js.native
  def merge(params: RequestOptions with PullsMergeParamsDeprecatedNumber with PullsMergeParams): js.Promise[Response[PullsMergeResponse]] = js.native
  def submitReview(): js.Promise[Response[PullsSubmitReviewResponse]] = js.native
  def submitReview(params: RequestOptions with PullsSubmitReviewParamsDeprecatedNumber with PullsSubmitReviewParams): js.Promise[Response[PullsSubmitReviewResponse]] = js.native
  /**
    * Draft pull requests are available in public repositories with GitHub Free and GitHub Pro, and in public and private repositories with GitHub Team and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * To open or update a pull request in a public repository, you must have write access to the head or the source branch. For organization-owned repositories, you must be a member of the organization that owns the repository to open or update a pull request.
    */
  def update(): js.Promise[Response[PullsUpdateResponse]] = js.native
  def update(params: RequestOptions with PullsUpdateParamsDeprecatedNumber with PullsUpdateParams): js.Promise[Response[PullsUpdateResponse]] = js.native
  /**
    * Updates the pull request branch with the latest upstream changes by merging HEAD from the base branch into the pull request branch.
    */
  def updateBranch(): js.Promise[Response[PullsUpdateBranchResponse]] = js.native
  def updateBranch(params: RequestOptions with PullsUpdateBranchParams): js.Promise[Response[PullsUpdateBranchResponse]] = js.native
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
  def updateComment(): js.Promise[Response[PullsUpdateCommentResponse]] = js.native
  def updateComment(params: RequestOptions with PullsUpdateCommentParams): js.Promise[Response[PullsUpdateCommentResponse]] = js.native
  /**
    * Update the review summary comment with new text.
    */
  def updateReview(): js.Promise[Response[PullsUpdateReviewResponse]] = js.native
  def updateReview(params: RequestOptions with PullsUpdateReviewParamsDeprecatedNumber with PullsUpdateReviewParams): js.Promise[Response[PullsUpdateReviewResponse]] = js.native
}

