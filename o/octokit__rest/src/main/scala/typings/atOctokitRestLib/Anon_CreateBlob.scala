package typings
package atOctokitRestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CreateBlob extends js.Object {
  @JSName("createBlob")
  var createBlob_Original: Anon_EndpointParamsGitCreateBlobParams = js.native
  /**
    * Creates a new Git [commit object](https://git-scm.com/book/en/v1/Git-Internals-Git-Objects#Commit-Objects).
    *
    * In this example, the payload of the signature would be:
    *
    *
    *
    * **Signature verification object**
    *
    * The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:
    *
    * These are the possible values for `reason` in the `verification` object:
    *
    * | Value                    | Description                                                                                                                       |
    * | ------------------------ | --------------------------------------------------------------------------------------------------------------------------------- |
    * | `expired_key`            | The key that made the signature is expired.                                                                                       |
    * | `not_signing_key`        | The "signing" flag is not among the usage flags in the GPG key that made the signature.                                           |
    * | `gpgverify_error`        | There was an error communicating with the signature verification service.                                                         |
    * | `gpgverify_unavailable`  | The signature verification service is currently unavailable.                                                                      |
    * | `unsigned`               | The object does not include a signature.                                                                                          |
    * | `unknown_signature_type` | A non-PGP signature was found in the commit.                                                                                      |
    * | `no_user`                | No user was associated with the `committer` email address in the commit.                                                          |
    * | `unverified_email`       | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
    * | `bad_email`              | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature.             |
    * | `unknown_key`            | The key that made the signature has not been registered with any user's account.                                                  |
    * | `malformed_signature`    | There was an error parsing the signature.                                                                                         |
    * | `invalid`                | The signature could not be cryptographically verified using the key whose key-id was found in the signature.                      |
    * | `valid`                  | None of the above errors applied, so the signature is considered to be verified.                                                  |
    */
  @JSName("createCommit")
  var createCommit_Original: Anon_EndpointParamsGitCreateCommitParams = js.native
  /**
    * Creates a reference for your repository. You are unable to create new references for empty repositories, even if the commit SHA-1 hash used exists. Empty repositories are repositories without branches.
    */
  @JSName("createRef")
  var createRef_Original: Anon_EndpointParamsGitCreateRefParams = js.native
  /**
    * Note that creating a tag object does not create the reference that makes a tag in Git. If you want to create an annotated tag in Git, you have to do this call to create the tag object, and then [create](https://developer.github.com/v3/git/refs/#create-a-reference) the `refs/tags/[tag]` reference. If you want to create a lightweight tag, you only have to [create](https://developer.github.com/v3/git/refs/#create-a-reference) the tag reference - this call would be unnecessary.
    *
    * **Signature verification object**
    *
    * The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:
    *
    * These are the possible values for `reason` in the `verification` object:
    *
    * | Value                    | Description                                                                                                                       |
    * | ------------------------ | --------------------------------------------------------------------------------------------------------------------------------- |
    * | `expired_key`            | The key that made the signature is expired.                                                                                       |
    * | `not_signing_key`        | The "signing" flag is not among the usage flags in the GPG key that made the signature.                                           |
    * | `gpgverify_error`        | There was an error communicating with the signature verification service.                                                         |
    * | `gpgverify_unavailable`  | The signature verification service is currently unavailable.                                                                      |
    * | `unsigned`               | The object does not include a signature.                                                                                          |
    * | `unknown_signature_type` | A non-PGP signature was found in the commit.                                                                                      |
    * | `no_user`                | No user was associated with the `committer` email address in the commit.                                                          |
    * | `unverified_email`       | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
    * | `bad_email`              | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature.             |
    * | `unknown_key`            | The key that made the signature has not been registered with any user's account.                                                  |
    * | `malformed_signature`    | There was an error parsing the signature.                                                                                         |
    * | `invalid`                | The signature could not be cryptographically verified using the key whose key-id was found in the signature.                      |
    * | `valid`                  | None of the above errors applied, so the signature is considered to be verified.                                                  |
    */
  @JSName("createTag")
  var createTag_Original: Anon_EndpointParamsGitCreateTagParams = js.native
  /**
    * The tree creation API will take nested entries as well. If both a tree and a nested path modifying that tree are specified, it will overwrite the contents of that tree with the new path contents and write a new tree out.
    */
  @JSName("createTree")
  var createTree_Original: Anon_EndpointParamsGitCreateTreeParams = js.native
  /**
    * ```
    * DELETE /repos/octocat/Hello-World/git/refs/heads/feature-a
    * ```
    *
    * ```
    * DELETE /repos/octocat/Hello-World/git/refs/tags/v1.0
    * ```
    */
  @JSName("deleteRef")
  var deleteRef_Original: Anon_EndpointParamsGitDeleteRefParams = js.native
  /**
    * The `content` in the response will always be Base64 encoded.
    *
    * _Note_: This API supports blobs up to 100 megabytes in size.
    */
  @JSName("getBlob")
  var getBlob_Original: Anon_EndpointParamsGitGetBlobParams = js.native
  /**
    * Gets a Git [commit object](https://git-scm.com/book/en/v1/Git-Internals-Git-Objects#Commit-Objects).
    *
    * **Signature verification object**
    *
    * The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:
    *
    * These are the possible values for `reason` in the `verification` object:
    *
    * | Value                    | Description                                                                                                                       |
    * | ------------------------ | --------------------------------------------------------------------------------------------------------------------------------- |
    * | `expired_key`            | The key that made the signature is expired.                                                                                       |
    * | `not_signing_key`        | The "signing" flag is not among the usage flags in the GPG key that made the signature.                                           |
    * | `gpgverify_error`        | There was an error communicating with the signature verification service.                                                         |
    * | `gpgverify_unavailable`  | The signature verification service is currently unavailable.                                                                      |
    * | `unsigned`               | The object does not include a signature.                                                                                          |
    * | `unknown_signature_type` | A non-PGP signature was found in the commit.                                                                                      |
    * | `no_user`                | No user was associated with the `committer` email address in the commit.                                                          |
    * | `unverified_email`       | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
    * | `bad_email`              | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature.             |
    * | `unknown_key`            | The key that made the signature has not been registered with any user's account.                                                  |
    * | `malformed_signature`    | There was an error parsing the signature.                                                                                         |
    * | `invalid`                | The signature could not be cryptographically verified using the key whose key-id was found in the signature.                      |
    * | `valid`                  | None of the above errors applied, so the signature is considered to be verified.                                                  |
    */
  @JSName("getCommit")
  var getCommit_Original: Anon_EndpointParamsGitGetCommitParams = js.native
  /**
    * Returns a branch or tag reference. Other than the [REST API](https://developer.github.com/v3/git/refs/#get-a-reference) it always returns a single reference. If the REST API returns with an array then the method responds with an error.
    */
  @JSName("getRef")
  var getRef_Original: Anon_EndpointParamsAnyResponseGitGetRefParams = js.native
  /**
    * **Signature verification object**
    *
    * The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:
    *
    * These are the possible values for `reason` in the `verification` object:
    *
    * | Value                    | Description                                                                                                                       |
    * | ------------------------ | --------------------------------------------------------------------------------------------------------------------------------- |
    * | `expired_key`            | The key that made the signature is expired.                                                                                       |
    * | `not_signing_key`        | The "signing" flag is not among the usage flags in the GPG key that made the signature.                                           |
    * | `gpgverify_error`        | There was an error communicating with the signature verification service.                                                         |
    * | `gpgverify_unavailable`  | The signature verification service is currently unavailable.                                                                      |
    * | `unsigned`               | The object does not include a signature.                                                                                          |
    * | `unknown_signature_type` | A non-PGP signature was found in the commit.                                                                                      |
    * | `no_user`                | No user was associated with the `committer` email address in the commit.                                                          |
    * | `unverified_email`       | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
    * | `bad_email`              | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature.             |
    * | `unknown_key`            | The key that made the signature has not been registered with any user's account.                                                  |
    * | `malformed_signature`    | There was an error parsing the signature.                                                                                         |
    * | `invalid`                | The signature could not be cryptographically verified using the key whose key-id was found in the signature.                      |
    * | `valid`                  | None of the above errors applied, so the signature is considered to be verified.                                                  |
    */
  @JSName("getTag")
  var getTag_Original: Anon_EndpointParamsGitGetTagParams = js.native
  /**
    * If `truncated` in the response is `true`, the number of items in the `tree` array exceeded our maximum limit. If you need to fetch more items, omit the `recursive` parameter, and fetch one sub-tree at a time. If you need to fetch even more items, you can clone the repository and iterate over the Git data locally.
    */
  @JSName("getTree")
  var getTree_Original: Anon_EndpointParamsAnyResponseGitGetTreeParams = js.native
  /**
    * This will return an array of all the references on the system, including things like notes and stashes if they exist on the server
    */
  @JSName("listRefs")
  var listRefs_Original: Anon_EndpointParamsAnyResponseGitListRefsParams = js.native
  @JSName("updateRef")
  var updateRef_Original: Anon_EndpointParamsGitUpdateRefParams = js.native
  def createBlob(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GitCreateBlobResponse]
  ] = js.native
  def createBlob(params: atOctokitRestLib.atOctokitRestMod.GitCreateBlobParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GitCreateBlobResponse]
  ] = js.native
  /**
    * Creates a new Git [commit object](https://git-scm.com/book/en/v1/Git-Internals-Git-Objects#Commit-Objects).
    *
    * In this example, the payload of the signature would be:
    *
    *
    *
    * **Signature verification object**
    *
    * The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:
    *
    * These are the possible values for `reason` in the `verification` object:
    *
    * | Value                    | Description                                                                                                                       |
    * | ------------------------ | --------------------------------------------------------------------------------------------------------------------------------- |
    * | `expired_key`            | The key that made the signature is expired.                                                                                       |
    * | `not_signing_key`        | The "signing" flag is not among the usage flags in the GPG key that made the signature.                                           |
    * | `gpgverify_error`        | There was an error communicating with the signature verification service.                                                         |
    * | `gpgverify_unavailable`  | The signature verification service is currently unavailable.                                                                      |
    * | `unsigned`               | The object does not include a signature.                                                                                          |
    * | `unknown_signature_type` | A non-PGP signature was found in the commit.                                                                                      |
    * | `no_user`                | No user was associated with the `committer` email address in the commit.                                                          |
    * | `unverified_email`       | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
    * | `bad_email`              | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature.             |
    * | `unknown_key`            | The key that made the signature has not been registered with any user's account.                                                  |
    * | `malformed_signature`    | There was an error parsing the signature.                                                                                         |
    * | `invalid`                | The signature could not be cryptographically verified using the key whose key-id was found in the signature.                      |
    * | `valid`                  | None of the above errors applied, so the signature is considered to be verified.                                                  |
    */
  def createCommit(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GitCreateCommitResponse]
  ] = js.native
  def createCommit(params: atOctokitRestLib.atOctokitRestMod.GitCreateCommitParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GitCreateCommitResponse]
  ] = js.native
  /**
    * Creates a reference for your repository. You are unable to create new references for empty repositories, even if the commit SHA-1 hash used exists. Empty repositories are repositories without branches.
    */
  def createRef(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GitCreateRefResponse]
  ] = js.native
  def createRef(params: atOctokitRestLib.atOctokitRestMod.GitCreateRefParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GitCreateRefResponse]
  ] = js.native
  /**
    * Note that creating a tag object does not create the reference that makes a tag in Git. If you want to create an annotated tag in Git, you have to do this call to create the tag object, and then [create](https://developer.github.com/v3/git/refs/#create-a-reference) the `refs/tags/[tag]` reference. If you want to create a lightweight tag, you only have to [create](https://developer.github.com/v3/git/refs/#create-a-reference) the tag reference - this call would be unnecessary.
    *
    * **Signature verification object**
    *
    * The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:
    *
    * These are the possible values for `reason` in the `verification` object:
    *
    * | Value                    | Description                                                                                                                       |
    * | ------------------------ | --------------------------------------------------------------------------------------------------------------------------------- |
    * | `expired_key`            | The key that made the signature is expired.                                                                                       |
    * | `not_signing_key`        | The "signing" flag is not among the usage flags in the GPG key that made the signature.                                           |
    * | `gpgverify_error`        | There was an error communicating with the signature verification service.                                                         |
    * | `gpgverify_unavailable`  | The signature verification service is currently unavailable.                                                                      |
    * | `unsigned`               | The object does not include a signature.                                                                                          |
    * | `unknown_signature_type` | A non-PGP signature was found in the commit.                                                                                      |
    * | `no_user`                | No user was associated with the `committer` email address in the commit.                                                          |
    * | `unverified_email`       | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
    * | `bad_email`              | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature.             |
    * | `unknown_key`            | The key that made the signature has not been registered with any user's account.                                                  |
    * | `malformed_signature`    | There was an error parsing the signature.                                                                                         |
    * | `invalid`                | The signature could not be cryptographically verified using the key whose key-id was found in the signature.                      |
    * | `valid`                  | None of the above errors applied, so the signature is considered to be verified.                                                  |
    */
  def createTag(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GitCreateTagResponse]
  ] = js.native
  def createTag(params: atOctokitRestLib.atOctokitRestMod.GitCreateTagParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GitCreateTagResponse]
  ] = js.native
  /**
    * The tree creation API will take nested entries as well. If both a tree and a nested path modifying that tree are specified, it will overwrite the contents of that tree with the new path contents and write a new tree out.
    */
  def createTree(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GitCreateTreeResponse]
  ] = js.native
  def createTree(params: atOctokitRestLib.atOctokitRestMod.GitCreateTreeParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GitCreateTreeResponse]
  ] = js.native
  /**
    * ```
    * DELETE /repos/octocat/Hello-World/git/refs/heads/feature-a
    * ```
    *
    * ```
    * DELETE /repos/octocat/Hello-World/git/refs/tags/v1.0
    * ```
    */
  def deleteRef(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GitDeleteRefResponse]
  ] = js.native
  def deleteRef(params: atOctokitRestLib.atOctokitRestMod.GitDeleteRefParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GitDeleteRefResponse]
  ] = js.native
  /**
    * The `content` in the response will always be Base64 encoded.
    *
    * _Note_: This API supports blobs up to 100 megabytes in size.
    */
  def getBlob(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GitGetBlobResponse]
  ] = js.native
  def getBlob(params: atOctokitRestLib.atOctokitRestMod.GitGetBlobParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GitGetBlobResponse]
  ] = js.native
  /**
    * Gets a Git [commit object](https://git-scm.com/book/en/v1/Git-Internals-Git-Objects#Commit-Objects).
    *
    * **Signature verification object**
    *
    * The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:
    *
    * These are the possible values for `reason` in the `verification` object:
    *
    * | Value                    | Description                                                                                                                       |
    * | ------------------------ | --------------------------------------------------------------------------------------------------------------------------------- |
    * | `expired_key`            | The key that made the signature is expired.                                                                                       |
    * | `not_signing_key`        | The "signing" flag is not among the usage flags in the GPG key that made the signature.                                           |
    * | `gpgverify_error`        | There was an error communicating with the signature verification service.                                                         |
    * | `gpgverify_unavailable`  | The signature verification service is currently unavailable.                                                                      |
    * | `unsigned`               | The object does not include a signature.                                                                                          |
    * | `unknown_signature_type` | A non-PGP signature was found in the commit.                                                                                      |
    * | `no_user`                | No user was associated with the `committer` email address in the commit.                                                          |
    * | `unverified_email`       | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
    * | `bad_email`              | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature.             |
    * | `unknown_key`            | The key that made the signature has not been registered with any user's account.                                                  |
    * | `malformed_signature`    | There was an error parsing the signature.                                                                                         |
    * | `invalid`                | The signature could not be cryptographically verified using the key whose key-id was found in the signature.                      |
    * | `valid`                  | None of the above errors applied, so the signature is considered to be verified.                                                  |
    */
  def getCommit(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GitGetCommitResponse]
  ] = js.native
  def getCommit(params: atOctokitRestLib.atOctokitRestMod.GitGetCommitParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GitGetCommitResponse]
  ] = js.native
  /**
    * Returns a branch or tag reference. Other than the [REST API](https://developer.github.com/v3/git/refs/#get-a-reference) it always returns a single reference. If the REST API returns with an array then the method responds with an error.
    */
  def getRef(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def getRef(params: atOctokitRestLib.atOctokitRestMod.GitGetRefParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  /**
    * **Signature verification object**
    *
    * The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:
    *
    * These are the possible values for `reason` in the `verification` object:
    *
    * | Value                    | Description                                                                                                                       |
    * | ------------------------ | --------------------------------------------------------------------------------------------------------------------------------- |
    * | `expired_key`            | The key that made the signature is expired.                                                                                       |
    * | `not_signing_key`        | The "signing" flag is not among the usage flags in the GPG key that made the signature.                                           |
    * | `gpgverify_error`        | There was an error communicating with the signature verification service.                                                         |
    * | `gpgverify_unavailable`  | The signature verification service is currently unavailable.                                                                      |
    * | `unsigned`               | The object does not include a signature.                                                                                          |
    * | `unknown_signature_type` | A non-PGP signature was found in the commit.                                                                                      |
    * | `no_user`                | No user was associated with the `committer` email address in the commit.                                                          |
    * | `unverified_email`       | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
    * | `bad_email`              | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature.             |
    * | `unknown_key`            | The key that made the signature has not been registered with any user's account.                                                  |
    * | `malformed_signature`    | There was an error parsing the signature.                                                                                         |
    * | `invalid`                | The signature could not be cryptographically verified using the key whose key-id was found in the signature.                      |
    * | `valid`                  | None of the above errors applied, so the signature is considered to be verified.                                                  |
    */
  def getTag(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GitGetTagResponse]
  ] = js.native
  def getTag(params: atOctokitRestLib.atOctokitRestMod.GitGetTagParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GitGetTagResponse]
  ] = js.native
  /**
    * If `truncated` in the response is `true`, the number of items in the `tree` array exceeded our maximum limit. If you need to fetch more items, omit the `recursive` parameter, and fetch one sub-tree at a time. If you need to fetch even more items, you can clone the repository and iterate over the Git data locally.
    */
  def getTree(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def getTree(params: atOctokitRestLib.atOctokitRestMod.GitGetTreeParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  /**
    * This will return an array of all the references on the system, including things like notes and stashes if they exist on the server
    */
  def listRefs(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def listRefs(params: atOctokitRestLib.atOctokitRestMod.GitListRefsParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def updateRef(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GitUpdateRefResponse]
  ] = js.native
  def updateRef(params: atOctokitRestLib.atOctokitRestMod.GitUpdateRefParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GitUpdateRefResponse]
  ] = js.native
}

