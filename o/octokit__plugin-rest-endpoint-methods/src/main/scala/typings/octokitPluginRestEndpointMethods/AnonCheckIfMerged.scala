package typings.octokitPluginRestEndpointMethods

import typings.octokitPluginRestEndpointMethods.typesMod.AnyResponse
import typings.octokitPluginRestEndpointMethods.typesMod.PullsCheckIfMergedParams
import typings.octokitPluginRestEndpointMethods.typesMod.PullsCreateCommentParams
import typings.octokitPluginRestEndpointMethods.typesMod.PullsCreateParams
import typings.octokitPluginRestEndpointMethods.typesMod.PullsCreateReviewCommentReplyParams
import typings.octokitPluginRestEndpointMethods.typesMod.PullsCreateReviewParams
import typings.octokitPluginRestEndpointMethods.typesMod.PullsCreateReviewRequestParams
import typings.octokitPluginRestEndpointMethods.typesMod.PullsDeleteCommentParams
import typings.octokitPluginRestEndpointMethods.typesMod.PullsDeletePendingReviewParams
import typings.octokitPluginRestEndpointMethods.typesMod.PullsDeleteReviewRequestParams
import typings.octokitPluginRestEndpointMethods.typesMod.PullsDismissReviewParams
import typings.octokitPluginRestEndpointMethods.typesMod.PullsGetCommentParams
import typings.octokitPluginRestEndpointMethods.typesMod.PullsGetCommentsForReviewParams
import typings.octokitPluginRestEndpointMethods.typesMod.PullsGetParams
import typings.octokitPluginRestEndpointMethods.typesMod.PullsGetReviewParams
import typings.octokitPluginRestEndpointMethods.typesMod.PullsListCommentsForRepoParams
import typings.octokitPluginRestEndpointMethods.typesMod.PullsListCommentsParams
import typings.octokitPluginRestEndpointMethods.typesMod.PullsListCommitsParams
import typings.octokitPluginRestEndpointMethods.typesMod.PullsListFilesParams
import typings.octokitPluginRestEndpointMethods.typesMod.PullsListParams
import typings.octokitPluginRestEndpointMethods.typesMod.PullsListReviewRequestsParams
import typings.octokitPluginRestEndpointMethods.typesMod.PullsListReviewsParams
import typings.octokitPluginRestEndpointMethods.typesMod.PullsMergeParams
import typings.octokitPluginRestEndpointMethods.typesMod.PullsSubmitReviewParams
import typings.octokitPluginRestEndpointMethods.typesMod.PullsUpdateBranchParams
import typings.octokitPluginRestEndpointMethods.typesMod.PullsUpdateCommentParams
import typings.octokitPluginRestEndpointMethods.typesMod.PullsUpdateParams
import typings.octokitPluginRestEndpointMethods.typesMod.PullsUpdateReviewParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCheckIfMerged extends js.Object {
  @JSName("checkIfMerged")
  var checkIfMerged_Original: Anon278 = js.native
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
  var createComment_Original: Anon280 = js.native
  /**
    * Creates a reply to a review comment for a pull request. For the `comment_id`, provide the ID of the review comment you are replying to. This must be the ID of a _top-level review comment_, not a reply to that comment. Replies to replies are not supported.
    *
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  @JSName("createReviewCommentReply")
  var createReviewCommentReply_Original: Anon282 = js.native
  /**
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  @JSName("createReviewRequest")
  var createReviewRequest_Original: Anon283 = js.native
  /**
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    *
    * **Note:** To comment on a specific line in a file, you need to first determine the _position_ of that line in the diff. The GitHub REST API v3 offers the `application/vnd.github.v3.diff` [media type](https://developer.github.com/v3/media/#commits-commit-comparison-and-pull-requests). To see a pull request diff, add this media type to the `Accept` header of a call to the [single pull request](https://developer.github.com/v3/pulls/#get-a-single-pull-request) endpoint.
    *
    * The `position` value equals the number of lines down from the first "@@" hunk header in the file you want to add a comment. The line just below the "@@" line is position 1, the next line is position 2, and so on. The position in the diff continues to increase through lines of whitespace and additional hunks until the beginning of a new file.
    */
  @JSName("createReview")
  var createReview_Original: Anon281 = js.native
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
  var create_Original: Anon279 = js.native
  /**
    * Deletes a review comment.
    */
  @JSName("deleteComment")
  var deleteComment_Original: Anon284 = js.native
  @JSName("deletePendingReview")
  var deletePendingReview_Original: Anon285 = js.native
  @JSName("deleteReviewRequest")
  var deleteReviewRequest_Original: Anon286 = js.native
  /**
    * **Note:** To dismiss a pull request review on a [protected branch](https://developer.github.com/v3/repos/branches/), you must be a repository administrator or be included in the list of people or teams who can dismiss pull request reviews.
    */
  @JSName("dismissReview")
  var dismissReview_Original: Anon287 = js.native
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
  var getComment_Original: Anon289 = js.native
  @JSName("getCommentsForReview")
  var getCommentsForReview_Original: Anon290 = js.native
  @JSName("getReview")
  var getReview_Original: Anon291 = js.native
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
  var get_Original: Anon288 = js.native
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
  var listCommentsForRepo_Original: Anon294 = js.native
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
  var listComments_Original: Anon293 = js.native
  /**
    * Lists a maximum of 250 commits for a pull request. To receive a complete commit list for pull requests with more than 250 commits, use the [Commit List API](https://developer.github.com/v3/repos/commits/#list-commits-on-a-repository).
    */
  @JSName("listCommits")
  var listCommits_Original: Anon295 = js.native
  /**
    * **Note:** Responses include a maximum of 3000 files. The paginated response returns 30 files per page by default.
    */
  @JSName("listFiles")
  var listFiles_Original: Anon296 = js.native
  @JSName("listReviewRequests")
  var listReviewRequests_Original: Anon297 = js.native
  /**
    * The list of reviews returns in chronological order.
    */
  @JSName("listReviews")
  var listReviews_Original: Anon298 = js.native
  /**
    * Draft pull requests are available in public repositories with GitHub Free and GitHub Pro, and in public and private repositories with GitHub Team and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  @JSName("list")
  var list_Original: Anon292 = js.native
  /**
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  @JSName("merge")
  var merge_Original: Anon299 = js.native
  @JSName("submitReview")
  var submitReview_Original: Anon300 = js.native
  /**
    * Updates the pull request branch with the latest upstream changes by merging HEAD from the base branch into the pull request branch.
    */
  @JSName("updateBranch")
  var updateBranch_Original: Anon302 = js.native
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
  var updateComment_Original: Anon303 = js.native
  /**
    * Update the review summary comment with new text.
    */
  @JSName("updateReview")
  var updateReview_Original: Anon304 = js.native
  /**
    * Draft pull requests are available in public repositories with GitHub Free and GitHub Pro, and in public and private repositories with GitHub Team and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * To open or update a pull request in a public repository, you must have write access to the head or the source branch. For organization-owned repositories, you must be a member of the organization that owns the repository to open or update a pull request.
    */
  @JSName("update")
  var update_Original: Anon301 = js.native
  def checkIfMerged(): js.Promise[AnyResponse] = js.native
  def checkIfMerged(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with PullsCheckIfMergedParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Draft pull requests are available in public repositories with GitHub Free and GitHub Pro, and in public and private repositories with GitHub Team and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * To open or update a pull request in a public repository, you must have write access to the head or the source branch. For organization-owned repositories, you must be a member of the organization that owns the repository to open or update a pull request.
    *
    * You can create a new pull request.
    *
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  def create(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsCreateResponse> */ _
  ] = js.native
  def create(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with PullsCreateParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsCreateResponse> */ _
  ] = js.native
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
  def createComment(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsCreateCommentResponse> */ _
  ] = js.native
  def createComment(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with PullsCreateCommentParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsCreateCommentResponse> */ _
  ] = js.native
  /**
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    *
    * **Note:** To comment on a specific line in a file, you need to first determine the _position_ of that line in the diff. The GitHub REST API v3 offers the `application/vnd.github.v3.diff` [media type](https://developer.github.com/v3/media/#commits-commit-comparison-and-pull-requests). To see a pull request diff, add this media type to the `Accept` header of a call to the [single pull request](https://developer.github.com/v3/pulls/#get-a-single-pull-request) endpoint.
    *
    * The `position` value equals the number of lines down from the first "@@" hunk header in the file you want to add a comment. The line just below the "@@" line is position 1, the next line is position 2, and so on. The position in the diff continues to increase through lines of whitespace and additional hunks until the beginning of a new file.
    */
  def createReview(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsCreateReviewResponse> */ _
  ] = js.native
  def createReview(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with PullsCreateReviewParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsCreateReviewResponse> */ _
  ] = js.native
  /**
    * Creates a reply to a review comment for a pull request. For the `comment_id`, provide the ID of the review comment you are replying to. This must be the ID of a _top-level review comment_, not a reply to that comment. Replies to replies are not supported.
    *
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  def createReviewCommentReply(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsCreateReviewCommentReplyResponse> */ _
  ] = js.native
  def createReviewCommentReply(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with PullsCreateReviewCommentReplyParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsCreateReviewCommentReplyResponse> */ _
  ] = js.native
  /**
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  def createReviewRequest(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsCreateReviewRequestResponse> */ _
  ] = js.native
  def createReviewRequest(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with PullsCreateReviewRequestParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsCreateReviewRequestResponse> */ _
  ] = js.native
  /**
    * Deletes a review comment.
    */
  def deleteComment(): js.Promise[AnyResponse] = js.native
  def deleteComment(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with PullsDeleteCommentParams
  ): js.Promise[AnyResponse] = js.native
  def deletePendingReview(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsDeletePendingReviewResponse> */ _
  ] = js.native
  def deletePendingReview(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with PullsDeletePendingReviewParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsDeletePendingReviewResponse> */ _
  ] = js.native
  def deleteReviewRequest(): js.Promise[AnyResponse] = js.native
  def deleteReviewRequest(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with PullsDeleteReviewRequestParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * **Note:** To dismiss a pull request review on a [protected branch](https://developer.github.com/v3/repos/branches/), you must be a repository administrator or be included in the list of people or teams who can dismiss pull request reviews.
    */
  def dismissReview(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsDismissReviewResponse> */ _
  ] = js.native
  def dismissReview(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with PullsDismissReviewParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsDismissReviewResponse> */ _
  ] = js.native
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
  def get(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsGetResponse> */ _
  ] = js.native
  def get(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with PullsGetParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsGetResponse> */ _
  ] = js.native
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
  def getComment(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsGetCommentResponse> */ _
  ] = js.native
  def getComment(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with PullsGetCommentParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsGetCommentResponse> */ _
  ] = js.native
  def getCommentsForReview(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsGetCommentsForReviewResponse> */ _
  ] = js.native
  def getCommentsForReview(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with PullsGetCommentsForReviewParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsGetCommentsForReviewResponse> */ _
  ] = js.native
  def getReview(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsGetReviewResponse> */ _
  ] = js.native
  def getReview(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with PullsGetReviewParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsGetReviewResponse> */ _
  ] = js.native
  /**
    * Draft pull requests are available in public repositories with GitHub Free and GitHub Pro, and in public and private repositories with GitHub Team and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  def list(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsListResponse> */ _
  ] = js.native
  def list(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with PullsListParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsListResponse> */ _
  ] = js.native
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
  def listComments(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsListCommentsResponse> */ _
  ] = js.native
  def listComments(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with PullsListCommentsParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsListCommentsResponse> */ _
  ] = js.native
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
  def listCommentsForRepo(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsListCommentsForRepoResponse> */ _
  ] = js.native
  def listCommentsForRepo(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with PullsListCommentsForRepoParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsListCommentsForRepoResponse> */ _
  ] = js.native
  /**
    * Lists a maximum of 250 commits for a pull request. To receive a complete commit list for pull requests with more than 250 commits, use the [Commit List API](https://developer.github.com/v3/repos/commits/#list-commits-on-a-repository).
    */
  def listCommits(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsListCommitsResponse> */ _
  ] = js.native
  def listCommits(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with PullsListCommitsParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsListCommitsResponse> */ _
  ] = js.native
  /**
    * **Note:** Responses include a maximum of 3000 files. The paginated response returns 30 files per page by default.
    */
  def listFiles(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsListFilesResponse> */ _
  ] = js.native
  def listFiles(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with PullsListFilesParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsListFilesResponse> */ _
  ] = js.native
  def listReviewRequests(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsListReviewRequestsResponse> */ _
  ] = js.native
  def listReviewRequests(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with PullsListReviewRequestsParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsListReviewRequestsResponse> */ _
  ] = js.native
  /**
    * The list of reviews returns in chronological order.
    */
  def listReviews(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsListReviewsResponse> */ _
  ] = js.native
  def listReviews(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with PullsListReviewsParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsListReviewsResponse> */ _
  ] = js.native
  /**
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  def merge(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsMergeResponse> */ _
  ] = js.native
  def merge(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with PullsMergeParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsMergeResponse> */ _
  ] = js.native
  def submitReview(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsSubmitReviewResponse> */ _
  ] = js.native
  def submitReview(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with PullsSubmitReviewParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsSubmitReviewResponse> */ _
  ] = js.native
  /**
    * Draft pull requests are available in public repositories with GitHub Free and GitHub Pro, and in public and private repositories with GitHub Team and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * To open or update a pull request in a public repository, you must have write access to the head or the source branch. For organization-owned repositories, you must be a member of the organization that owns the repository to open or update a pull request.
    */
  def update(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsUpdateResponse> */ _
  ] = js.native
  def update(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with PullsUpdateParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsUpdateResponse> */ _
  ] = js.native
  /**
    * Updates the pull request branch with the latest upstream changes by merging HEAD from the base branch into the pull request branch.
    */
  def updateBranch(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsUpdateBranchResponse> */ _
  ] = js.native
  def updateBranch(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with PullsUpdateBranchParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsUpdateBranchResponse> */ _
  ] = js.native
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
  def updateComment(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsUpdateCommentResponse> */ _
  ] = js.native
  def updateComment(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with PullsUpdateCommentParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsUpdateCommentResponse> */ _
  ] = js.native
  /**
    * Update the review summary comment with new text.
    */
  def updateReview(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsUpdateReviewResponse> */ _
  ] = js.native
  def updateReview(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with PullsUpdateReviewParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsUpdateReviewResponse> */ _
  ] = js.native
}

