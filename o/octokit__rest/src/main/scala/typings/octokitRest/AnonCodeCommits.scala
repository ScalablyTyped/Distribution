package typings.octokitRest

import typings.octokitRest.mod.RequestOptions
import typings.octokitRest.mod.Response
import typings.octokitRest.mod.SearchCodeParams
import typings.octokitRest.mod.SearchCodeResponse
import typings.octokitRest.mod.SearchCommitsParams
import typings.octokitRest.mod.SearchCommitsResponse
import typings.octokitRest.mod.SearchEmailLegacyParams
import typings.octokitRest.mod.SearchEmailLegacyResponse
import typings.octokitRest.mod.SearchIssuesAndPullRequestsParams
import typings.octokitRest.mod.SearchIssuesAndPullRequestsResponse
import typings.octokitRest.mod.SearchIssuesLegacyParams
import typings.octokitRest.mod.SearchIssuesLegacyResponse
import typings.octokitRest.mod.SearchIssuesParams
import typings.octokitRest.mod.SearchIssuesResponse
import typings.octokitRest.mod.SearchLabelsParams
import typings.octokitRest.mod.SearchLabelsResponse
import typings.octokitRest.mod.SearchReposLegacyParams
import typings.octokitRest.mod.SearchReposLegacyResponse
import typings.octokitRest.mod.SearchReposParams
import typings.octokitRest.mod.SearchReposResponse
import typings.octokitRest.mod.SearchTopicsParams
import typings.octokitRest.mod.SearchTopicsResponse
import typings.octokitRest.mod.SearchUsersLegacyParams
import typings.octokitRest.mod.SearchUsersLegacyResponse
import typings.octokitRest.mod.SearchUsersParams
import typings.octokitRest.mod.SearchUsersResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCodeCommits extends js.Object {
  /**
    * Find file contents via various criteria. This method returns up to 100 results [per page](https://developer.github.com/v3/#pagination).
    *
    * When searching for code, you can get text match metadata for the file **content** and file **path** fields when you pass the `text-match` media type. For more details about how to receive highlighted search results, see [Text match metadata](https://developer.github.com/v3/search/#text-match-metadata).
    *
    * **Note:** You must [authenticate](https://developer.github.com/v3/#authentication) to search for code across all public repositories.
    *
    * **Considerations for code search**
    *
    * Due to the complexity of searching code, there are a few restrictions on how searches are performed:
    *
    * *   Only the _default branch_ is considered. In most cases, this will be the `master` branch.
    * *   Only files smaller than 384 KB are searchable.
    * *   You must always include at least one search term when searching source code. For example, searching for [`language:go`](https://github.com/search?utf8=%E2%9C%93&q=language%3Ago&type=Code) is not valid, while [`amazing language:go`](https://github.com/search?utf8=%E2%9C%93&q=amazing+language%3Ago&type=Code) is.
    *
    * Suppose you want to find the definition of the `addClass` function inside [jQuery](https://github.com/jquery/jquery). Your query would look something like this:
    *
    * Here, we're searching for the keyword `addClass` within a file's contents. We're making sure that we're only looking in files where the language is JavaScript. And we're scoping the search to the `repo:jquery/jquery` repository.
    */
  @JSName("code")
  var code_Original: AnonEndpointParamsPromiseRequestOptions = js.native
  /**
    * Find commits via various criteria. This method returns up to 100 results [per page](https://developer.github.com/v3/#pagination).
    *
    * When searching for commits, you can get text match metadata for the **message** field when you provide the `text-match` media type. For more details about how to receive highlighted search results, see [Text match metadata](https://developer.github.com/v3/search/#text-match-metadata).
    *
    * **Considerations for commit search**
    *
    * Only the _default branch_ is considered. In most cases, this will be the `master` branch.
    *
    * Suppose you want to find commits related to CSS in the [octocat/Spoon-Knife](https://github.com/octocat/Spoon-Knife) repository. Your query would look something like this:
    */
  @JSName("commits")
  var commits_Original: AnonEndpointParamsPromiseRequestOptionsResponse = js.native
  /**
    * This API call is added for compatibility reasons only. There's no guarantee that full email searches will always be available. The `@` character in the address must be left unencoded. Searches only against public email addresses (as configured on the user's GitHub profile).
    * @deprecated octokit.search.emailLegacy() is deprecated, see https://developer.github.com/v3/search/legacy/#email-search
    */
  @JSName("emailLegacy")
  var emailLegacy_Original: AnonEndpointParamsPromiseRequestOptionsResponseSearchEmailLegacyParams = js.native
  /**
    * Find issues by state and keyword. This method returns up to 100 results [per page](https://developer.github.com/v3/#pagination).
    *
    * When searching for issues, you can get text match metadata for the issue **title**, issue **body**, and issue **comment body** fields when you pass the `text-match` media type. For more details about how to receive highlighted search results, see [Text match metadata](https://developer.github.com/v3/search/#text-match-metadata).
    *
    * Let's say you want to find the oldest unresolved Python bugs on Windows. Your query might look something like this.
    *
    * In this query, we're searching for the keyword `windows`, within any open issue that's labeled as `bug`. The search runs across repositories whose primary language is Python. We’re sorting by creation date in ascending order, so that the oldest issues appear first in the search results.
    */
  @JSName("issuesAndPullRequests")
  var issuesAndPullRequests_Original: AnonEndpointParamsPromiseRequestOptionsResponseSearchIssuesAndPullRequestsParams = js.native
  /**
    * Find issues by state and keyword.
    * @deprecated octokit.search.issuesLegacy() is deprecated, see https://developer.github.com/v3/search/legacy/#search-issues
    */
  @JSName("issuesLegacy")
  var issuesLegacy_Original: AnonEndpointParamsPromiseRequestOptionsResponseSearchIssuesLegacyParams = js.native
  /**
    * Find issues by state and keyword. This method returns up to 100 results [per page](https://developer.github.com/v3/#pagination).
    *
    * When searching for issues, you can get text match metadata for the issue **title**, issue **body**, and issue **comment body** fields when you pass the `text-match` media type. For more details about how to receive highlighted search results, see [Text match metadata](https://developer.github.com/v3/search/#text-match-metadata).
    *
    * Let's say you want to find the oldest unresolved Python bugs on Windows. Your query might look something like this.
    *
    * In this query, we're searching for the keyword `windows`, within any open issue that's labeled as `bug`. The search runs across repositories whose primary language is Python. We’re sorting by creation date in ascending order, so that the oldest issues appear first in the search results.
    * @deprecated octokit.search.issues() has been renamed to octokit.search.issuesAndPullRequests() (2018-12-27)
    */
  @JSName("issues")
  var issues_Original: AnonEndpointParamsPromiseRequestOptionsResponseSearchIssuesParams = js.native
  /**
    * Find labels in a repository with names or descriptions that match search keywords. Returns up to 100 results [per page](https://developer.github.com/v3/#pagination).
    *
    * When searching for labels, you can get text match metadata for the label **name** and **description** fields when you pass the `text-match` media type. For more details about how to receive highlighted search results, see [Text match metadata](https://developer.github.com/v3/search/#text-match-metadata).
    *
    * Suppose you want to find labels in the `linguist` repository that match `bug`, `defect`, or `enhancement`. Your query might look like this:
    *
    * The labels that best match for the query appear first in the search results.
    */
  @JSName("labels")
  var labels_Original: AnonEndpointParamsPromiseRequestOptionsResponseSearchLabelsParams = js.native
  /**
    * Find repositories by keyword. Note, this legacy method does not follow the v3 pagination pattern. This method returns up to 100 results per page and pages can be fetched using the `start_page` parameter.
    * @deprecated octokit.search.reposLegacy() is deprecated, see https://developer.github.com/v3/search/legacy/#search-repositories
    */
  @JSName("reposLegacy")
  var reposLegacy_Original: AnonEndpointParamsPromiseRequestOptionsResponseSearchReposLegacyParams = js.native
  /**
    * Find repositories via various criteria. This method returns up to 100 results [per page](https://developer.github.com/v3/#pagination).
    *
    * When searching for repositories, you can get text match metadata for the **name** and **description** fields when you pass the `text-match` media type. For more details about how to receive highlighted search results, see [Text match metadata](https://developer.github.com/v3/search/#text-match-metadata).
    *
    * Suppose you want to search for popular Tetris repositories written in Assembly. Your query might look like this.
    *
    * You can search for multiple topics by adding more `topic:` instances, and including the `mercy-preview` header. For example:
    *
    * In this request, we're searching for repositories with the word `tetris` in the name, the description, or the README. We're limiting the results to only find repositories where the primary language is Assembly. We're sorting by stars in descending order, so that the most popular repositories appear first in the search results.
    */
  @JSName("repos")
  var repos_Original: AnonEndpointParamsPromiseRequestOptionsResponseSearchReposParams = js.native
  /**
    * Find topics via various criteria. Results are sorted by best match. This method returns up to 100 results [per page](https://developer.github.com/v3/#pagination).
    *
    * When searching for topics, you can get text match metadata for the topic's **short\_description**, **description**, **name**, or **display\_name** field when you pass the `text-match` media type. For more details about how to receive highlighted search results, see [Text match metadata](https://developer.github.com/v3/search/#text-match-metadata).
    *
    * See "[Searching topics](https://help.github.com/articles/searching-topics/)" for a detailed list of qualifiers.
    *
    * Suppose you want to search for topics related to Ruby that are featured on [https://github.com/topics](https://github.com/topics). Your query might look like this:
    *
    * In this request, we're searching for topics with the keyword `ruby`, and we're limiting the results to find only topics that are featured. The topics that are the best match for the query appear first in the search results.
    *
    * **Note:** A search for featured Ruby topics only has 6 total results, so a [Link header](https://developer.github.com/v3/#link-header) indicating pagination is not included in the response.
    */
  @JSName("topics")
  var topics_Original: AnonEndpointParamsPromiseRequestOptionsResponseSearchTopicsParams = js.native
  /**
    * Find users by keyword.
    * @deprecated octokit.search.usersLegacy() is deprecated, see https://developer.github.com/v3/search/legacy/#search-users
    */
  @JSName("usersLegacy")
  var usersLegacy_Original: AnonEndpointParamsPromiseRequestOptionsResponseSearchUsersLegacyParams = js.native
  /**
    * Find users via various criteria. This method returns up to 100 results [per page](https://developer.github.com/v3/#pagination).
    *
    * When searching for users, you can get text match metadata for the issue **login**, **email**, and **name** fields when you pass the `text-match` media type. For more details about highlighting search results, see [Text match metadata](https://developer.github.com/v3/search/#text-match-metadata). For more details about how to receive highlighted search results, see [Text match metadata](https://developer.github.com/v3/search/#text-match-metadata).
    *
    * Imagine you're looking for a list of popular users. You might try out this query:
    *
    * Here, we're looking at users with the name Tom. We're only interested in those with more than 42 repositories, and only if they have over 1,000 followers.
    */
  @JSName("users")
  var users_Original: AnonEndpointParamsPromiseRequestOptionsResponseSearchUsersParams = js.native
  /**
    * Find file contents via various criteria. This method returns up to 100 results [per page](https://developer.github.com/v3/#pagination).
    *
    * When searching for code, you can get text match metadata for the file **content** and file **path** fields when you pass the `text-match` media type. For more details about how to receive highlighted search results, see [Text match metadata](https://developer.github.com/v3/search/#text-match-metadata).
    *
    * **Note:** You must [authenticate](https://developer.github.com/v3/#authentication) to search for code across all public repositories.
    *
    * **Considerations for code search**
    *
    * Due to the complexity of searching code, there are a few restrictions on how searches are performed:
    *
    * *   Only the _default branch_ is considered. In most cases, this will be the `master` branch.
    * *   Only files smaller than 384 KB are searchable.
    * *   You must always include at least one search term when searching source code. For example, searching for [`language:go`](https://github.com/search?utf8=%E2%9C%93&q=language%3Ago&type=Code) is not valid, while [`amazing language:go`](https://github.com/search?utf8=%E2%9C%93&q=amazing+language%3Ago&type=Code) is.
    *
    * Suppose you want to find the definition of the `addClass` function inside [jQuery](https://github.com/jquery/jquery). Your query would look something like this:
    *
    * Here, we're searching for the keyword `addClass` within a file's contents. We're making sure that we're only looking in files where the language is JavaScript. And we're scoping the search to the `repo:jquery/jquery` repository.
    */
  def code(): js.Promise[Response[SearchCodeResponse]] = js.native
  def code(params: RequestOptions with SearchCodeParams): js.Promise[Response[SearchCodeResponse]] = js.native
  /**
    * Find commits via various criteria. This method returns up to 100 results [per page](https://developer.github.com/v3/#pagination).
    *
    * When searching for commits, you can get text match metadata for the **message** field when you provide the `text-match` media type. For more details about how to receive highlighted search results, see [Text match metadata](https://developer.github.com/v3/search/#text-match-metadata).
    *
    * **Considerations for commit search**
    *
    * Only the _default branch_ is considered. In most cases, this will be the `master` branch.
    *
    * Suppose you want to find commits related to CSS in the [octocat/Spoon-Knife](https://github.com/octocat/Spoon-Knife) repository. Your query would look something like this:
    */
  def commits(): js.Promise[Response[SearchCommitsResponse]] = js.native
  def commits(params: RequestOptions with SearchCommitsParams): js.Promise[Response[SearchCommitsResponse]] = js.native
  /**
    * This API call is added for compatibility reasons only. There's no guarantee that full email searches will always be available. The `@` character in the address must be left unencoded. Searches only against public email addresses (as configured on the user's GitHub profile).
    * @deprecated octokit.search.emailLegacy() is deprecated, see https://developer.github.com/v3/search/legacy/#email-search
    */
  def emailLegacy(): js.Promise[Response[SearchEmailLegacyResponse]] = js.native
  def emailLegacy(params: RequestOptions with SearchEmailLegacyParams): js.Promise[Response[SearchEmailLegacyResponse]] = js.native
  /**
    * Find issues by state and keyword. This method returns up to 100 results [per page](https://developer.github.com/v3/#pagination).
    *
    * When searching for issues, you can get text match metadata for the issue **title**, issue **body**, and issue **comment body** fields when you pass the `text-match` media type. For more details about how to receive highlighted search results, see [Text match metadata](https://developer.github.com/v3/search/#text-match-metadata).
    *
    * Let's say you want to find the oldest unresolved Python bugs on Windows. Your query might look something like this.
    *
    * In this query, we're searching for the keyword `windows`, within any open issue that's labeled as `bug`. The search runs across repositories whose primary language is Python. We’re sorting by creation date in ascending order, so that the oldest issues appear first in the search results.
    * @deprecated octokit.search.issues() has been renamed to octokit.search.issuesAndPullRequests() (2018-12-27)
    */
  def issues(): js.Promise[Response[SearchIssuesResponse]] = js.native
  def issues(params: RequestOptions with SearchIssuesParams): js.Promise[Response[SearchIssuesResponse]] = js.native
  /**
    * Find issues by state and keyword. This method returns up to 100 results [per page](https://developer.github.com/v3/#pagination).
    *
    * When searching for issues, you can get text match metadata for the issue **title**, issue **body**, and issue **comment body** fields when you pass the `text-match` media type. For more details about how to receive highlighted search results, see [Text match metadata](https://developer.github.com/v3/search/#text-match-metadata).
    *
    * Let's say you want to find the oldest unresolved Python bugs on Windows. Your query might look something like this.
    *
    * In this query, we're searching for the keyword `windows`, within any open issue that's labeled as `bug`. The search runs across repositories whose primary language is Python. We’re sorting by creation date in ascending order, so that the oldest issues appear first in the search results.
    */
  def issuesAndPullRequests(): js.Promise[Response[SearchIssuesAndPullRequestsResponse]] = js.native
  def issuesAndPullRequests(params: RequestOptions with SearchIssuesAndPullRequestsParams): js.Promise[Response[SearchIssuesAndPullRequestsResponse]] = js.native
  /**
    * Find issues by state and keyword.
    * @deprecated octokit.search.issuesLegacy() is deprecated, see https://developer.github.com/v3/search/legacy/#search-issues
    */
  def issuesLegacy(): js.Promise[Response[SearchIssuesLegacyResponse]] = js.native
  def issuesLegacy(params: RequestOptions with SearchIssuesLegacyParams): js.Promise[Response[SearchIssuesLegacyResponse]] = js.native
  /**
    * Find labels in a repository with names or descriptions that match search keywords. Returns up to 100 results [per page](https://developer.github.com/v3/#pagination).
    *
    * When searching for labels, you can get text match metadata for the label **name** and **description** fields when you pass the `text-match` media type. For more details about how to receive highlighted search results, see [Text match metadata](https://developer.github.com/v3/search/#text-match-metadata).
    *
    * Suppose you want to find labels in the `linguist` repository that match `bug`, `defect`, or `enhancement`. Your query might look like this:
    *
    * The labels that best match for the query appear first in the search results.
    */
  def labels(): js.Promise[Response[SearchLabelsResponse]] = js.native
  def labels(params: RequestOptions with SearchLabelsParams): js.Promise[Response[SearchLabelsResponse]] = js.native
  /**
    * Find repositories via various criteria. This method returns up to 100 results [per page](https://developer.github.com/v3/#pagination).
    *
    * When searching for repositories, you can get text match metadata for the **name** and **description** fields when you pass the `text-match` media type. For more details about how to receive highlighted search results, see [Text match metadata](https://developer.github.com/v3/search/#text-match-metadata).
    *
    * Suppose you want to search for popular Tetris repositories written in Assembly. Your query might look like this.
    *
    * You can search for multiple topics by adding more `topic:` instances, and including the `mercy-preview` header. For example:
    *
    * In this request, we're searching for repositories with the word `tetris` in the name, the description, or the README. We're limiting the results to only find repositories where the primary language is Assembly. We're sorting by stars in descending order, so that the most popular repositories appear first in the search results.
    */
  def repos(): js.Promise[Response[SearchReposResponse]] = js.native
  def repos(params: RequestOptions with SearchReposParams): js.Promise[Response[SearchReposResponse]] = js.native
  /**
    * Find repositories by keyword. Note, this legacy method does not follow the v3 pagination pattern. This method returns up to 100 results per page and pages can be fetched using the `start_page` parameter.
    * @deprecated octokit.search.reposLegacy() is deprecated, see https://developer.github.com/v3/search/legacy/#search-repositories
    */
  def reposLegacy(): js.Promise[Response[SearchReposLegacyResponse]] = js.native
  def reposLegacy(params: RequestOptions with SearchReposLegacyParams): js.Promise[Response[SearchReposLegacyResponse]] = js.native
  /**
    * Find topics via various criteria. Results are sorted by best match. This method returns up to 100 results [per page](https://developer.github.com/v3/#pagination).
    *
    * When searching for topics, you can get text match metadata for the topic's **short\_description**, **description**, **name**, or **display\_name** field when you pass the `text-match` media type. For more details about how to receive highlighted search results, see [Text match metadata](https://developer.github.com/v3/search/#text-match-metadata).
    *
    * See "[Searching topics](https://help.github.com/articles/searching-topics/)" for a detailed list of qualifiers.
    *
    * Suppose you want to search for topics related to Ruby that are featured on [https://github.com/topics](https://github.com/topics). Your query might look like this:
    *
    * In this request, we're searching for topics with the keyword `ruby`, and we're limiting the results to find only topics that are featured. The topics that are the best match for the query appear first in the search results.
    *
    * **Note:** A search for featured Ruby topics only has 6 total results, so a [Link header](https://developer.github.com/v3/#link-header) indicating pagination is not included in the response.
    */
  def topics(): js.Promise[Response[SearchTopicsResponse]] = js.native
  def topics(params: RequestOptions with SearchTopicsParams): js.Promise[Response[SearchTopicsResponse]] = js.native
  /**
    * Find users via various criteria. This method returns up to 100 results [per page](https://developer.github.com/v3/#pagination).
    *
    * When searching for users, you can get text match metadata for the issue **login**, **email**, and **name** fields when you pass the `text-match` media type. For more details about highlighting search results, see [Text match metadata](https://developer.github.com/v3/search/#text-match-metadata). For more details about how to receive highlighted search results, see [Text match metadata](https://developer.github.com/v3/search/#text-match-metadata).
    *
    * Imagine you're looking for a list of popular users. You might try out this query:
    *
    * Here, we're looking at users with the name Tom. We're only interested in those with more than 42 repositories, and only if they have over 1,000 followers.
    */
  def users(): js.Promise[Response[SearchUsersResponse]] = js.native
  def users(params: RequestOptions with SearchUsersParams): js.Promise[Response[SearchUsersResponse]] = js.native
  /**
    * Find users by keyword.
    * @deprecated octokit.search.usersLegacy() is deprecated, see https://developer.github.com/v3/search/legacy/#search-users
    */
  def usersLegacy(): js.Promise[Response[SearchUsersLegacyResponse]] = js.native
  def usersLegacy(params: RequestOptions with SearchUsersLegacyParams): js.Promise[Response[SearchUsersLegacyResponse]] = js.native
}

