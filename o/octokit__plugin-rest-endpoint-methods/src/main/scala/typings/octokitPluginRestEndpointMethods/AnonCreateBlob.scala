package typings.octokitPluginRestEndpointMethods

import typings.octokitPluginRestEndpointMethods.typesMod.AnyResponse
import typings.octokitPluginRestEndpointMethods.typesMod.GitCreateBlobParams
import typings.octokitPluginRestEndpointMethods.typesMod.GitCreateCommitParams
import typings.octokitPluginRestEndpointMethods.typesMod.GitCreateRefParams
import typings.octokitPluginRestEndpointMethods.typesMod.GitCreateTagParams
import typings.octokitPluginRestEndpointMethods.typesMod.GitCreateTreeParams
import typings.octokitPluginRestEndpointMethods.typesMod.GitDeleteRefParams
import typings.octokitPluginRestEndpointMethods.typesMod.GitGetBlobParams
import typings.octokitPluginRestEndpointMethods.typesMod.GitGetCommitParams
import typings.octokitPluginRestEndpointMethods.typesMod.GitGetRefParams
import typings.octokitPluginRestEndpointMethods.typesMod.GitGetTagParams
import typings.octokitPluginRestEndpointMethods.typesMod.GitGetTreeParams
import typings.octokitPluginRestEndpointMethods.typesMod.GitListMatchingRefsParams
import typings.octokitPluginRestEndpointMethods.typesMod.GitUpdateRefParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCreateBlob extends js.Object {
  @JSName("createBlob")
  var createBlob_Original: Anon131 = js.native
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
  var createCommit_Original: Anon132 = js.native
  /**
    * Creates a reference for your repository. You are unable to create new references for empty repositories, even if the commit SHA-1 hash used exists. Empty repositories are repositories without branches.
    */
  @JSName("createRef")
  var createRef_Original: Anon133 = js.native
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
  var createTag_Original: Anon134 = js.native
  /**
    * The tree creation API accepts nested entries. If you specify both a tree and a nested path modifying that tree, this endpoint will overwrite the contents of the tree with the new path contents, and create a new tree structure.
    *
    * If you use this endpoint to add, delete, or modify the file contents in a tree, you will need to commit the tree and then update a branch to point to the commit. For more information see "[Create a commit](https://developer.github.com/v3/git/commits/#create-a-commit)" and "[Update a reference](https://developer.github.com/v3/git/refs/#update-a-reference)."
    */
  @JSName("createTree")
  var createTree_Original: Anon135 = js.native
  @JSName("deleteRef")
  var deleteRef_Original: Anon136 = js.native
  /**
    * The `content` in the response will always be Base64 encoded.
    *
    * _Note_: This API supports blobs up to 100 megabytes in size.
    */
  @JSName("getBlob")
  var getBlob_Original: Anon137 = js.native
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
  var getCommit_Original: Anon138 = js.native
  /**
    * Returns a single reference from your Git database. The `:ref` in the URL must be formatted as `heads/<branch name>` for branches and `tags/<tag name>` for tags. If the `:ref` doesn't match an existing ref, a `404` is returned.
    *
    * **Note:** You need to explicitly [request a pull request](https://developer.github.com/v3/pulls/#get-a-single-pull-request) to trigger a test merge commit, which checks the mergeability of pull requests. For more information, see "[Checking mergeability of pull requests](https://developer.github.com/v3/git/#checking-mergeability-of-pull-requests)".
    *
    * To get the reference for a branch named `skunkworkz/featureA`, the endpoint route is:
    */
  @JSName("getRef")
  var getRef_Original: Anon139 = js.native
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
  var getTag_Original: Anon140 = js.native
  /**
    * Returns a single tree using the SHA1 value for that tree.
    *
    * If `truncated` is `true` in the response then the number of items in the `tree` array exceeded our maximum limit. If you need to fetch more items, you can clone the repository and iterate over the Git data locally.
    */
  @JSName("getTree")
  var getTree_Original: Anon141 = js.native
  /**
    * Returns an array of references from your Git database that match the supplied name. The `:ref` in the URL must be formatted as `heads/<branch name>` for branches and `tags/<tag name>` for tags. If the `:ref` doesn't exist in the repository, but existing refs start with `:ref`, they will be returned as an array.
    *
    * When you use this endpoint without providing a `:ref`, it will return an array of all the references from your Git database, including notes and stashes if they exist on the server. Anything in the namespace is returned, not just `heads` and `tags`.
    *
    * **Note:** You need to explicitly [request a pull request](https://developer.github.com/v3/pulls/#get-a-single-pull-request) to trigger a test merge commit, which checks the mergeability of pull requests. For more information, see "[Checking mergeability of pull requests](https://developer.github.com/v3/git/#checking-mergeability-of-pull-requests)".
    *
    * If you request matching references for a branch named `feature` but the branch `feature` doesn't exist, the response can still include other matching head refs that start with the word `feature`, such as `featureA` and `featureB`.
    */
  @JSName("listMatchingRefs")
  var listMatchingRefs_Original: Anon142 = js.native
  @JSName("updateRef")
  var updateRef_Original: Anon143 = js.native
  def createBlob(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GitCreateBlobResponse> */ _
  ] = js.native
  def createBlob(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with GitCreateBlobParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GitCreateBlobResponse> */ _
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
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GitCreateCommitResponse> */ _
  ] = js.native
  def createCommit(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with GitCreateCommitParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GitCreateCommitResponse> */ _
  ] = js.native
  /**
    * Creates a reference for your repository. You are unable to create new references for empty repositories, even if the commit SHA-1 hash used exists. Empty repositories are repositories without branches.
    */
  def createRef(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GitCreateRefResponse> */ _
  ] = js.native
  def createRef(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with GitCreateRefParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GitCreateRefResponse> */ _
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
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GitCreateTagResponse> */ _
  ] = js.native
  def createTag(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with GitCreateTagParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GitCreateTagResponse> */ _
  ] = js.native
  /**
    * The tree creation API accepts nested entries. If you specify both a tree and a nested path modifying that tree, this endpoint will overwrite the contents of the tree with the new path contents, and create a new tree structure.
    *
    * If you use this endpoint to add, delete, or modify the file contents in a tree, you will need to commit the tree and then update a branch to point to the commit. For more information see "[Create a commit](https://developer.github.com/v3/git/commits/#create-a-commit)" and "[Update a reference](https://developer.github.com/v3/git/refs/#update-a-reference)."
    */
  def createTree(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GitCreateTreeResponse> */ _
  ] = js.native
  def createTree(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with GitCreateTreeParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GitCreateTreeResponse> */ _
  ] = js.native
  def deleteRef(): js.Promise[AnyResponse] = js.native
  def deleteRef(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with GitDeleteRefParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * The `content` in the response will always be Base64 encoded.
    *
    * _Note_: This API supports blobs up to 100 megabytes in size.
    */
  def getBlob(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GitGetBlobResponse> */ _
  ] = js.native
  def getBlob(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with GitGetBlobParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GitGetBlobResponse> */ _
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
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GitGetCommitResponse> */ _
  ] = js.native
  def getCommit(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with GitGetCommitParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GitGetCommitResponse> */ _
  ] = js.native
  /**
    * Returns a single reference from your Git database. The `:ref` in the URL must be formatted as `heads/<branch name>` for branches and `tags/<tag name>` for tags. If the `:ref` doesn't match an existing ref, a `404` is returned.
    *
    * **Note:** You need to explicitly [request a pull request](https://developer.github.com/v3/pulls/#get-a-single-pull-request) to trigger a test merge commit, which checks the mergeability of pull requests. For more information, see "[Checking mergeability of pull requests](https://developer.github.com/v3/git/#checking-mergeability-of-pull-requests)".
    *
    * To get the reference for a branch named `skunkworkz/featureA`, the endpoint route is:
    */
  def getRef(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GitGetRefResponse> */ _
  ] = js.native
  def getRef(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with GitGetRefParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GitGetRefResponse> */ _
  ] = js.native
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
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GitGetTagResponse> */ _
  ] = js.native
  def getTag(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with GitGetTagParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GitGetTagResponse> */ _
  ] = js.native
  /**
    * Returns a single tree using the SHA1 value for that tree.
    *
    * If `truncated` is `true` in the response then the number of items in the `tree` array exceeded our maximum limit. If you need to fetch more items, you can clone the repository and iterate over the Git data locally.
    */
  def getTree(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GitGetTreeResponse> */ _
  ] = js.native
  def getTree(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with GitGetTreeParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GitGetTreeResponse> */ _
  ] = js.native
  /**
    * Returns an array of references from your Git database that match the supplied name. The `:ref` in the URL must be formatted as `heads/<branch name>` for branches and `tags/<tag name>` for tags. If the `:ref` doesn't exist in the repository, but existing refs start with `:ref`, they will be returned as an array.
    *
    * When you use this endpoint without providing a `:ref`, it will return an array of all the references from your Git database, including notes and stashes if they exist on the server. Anything in the namespace is returned, not just `heads` and `tags`.
    *
    * **Note:** You need to explicitly [request a pull request](https://developer.github.com/v3/pulls/#get-a-single-pull-request) to trigger a test merge commit, which checks the mergeability of pull requests. For more information, see "[Checking mergeability of pull requests](https://developer.github.com/v3/git/#checking-mergeability-of-pull-requests)".
    *
    * If you request matching references for a branch named `feature` but the branch `feature` doesn't exist, the response can still include other matching head refs that start with the word `feature`, such as `featureA` and `featureB`.
    */
  def listMatchingRefs(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GitListMatchingRefsResponse> */ _
  ] = js.native
  def listMatchingRefs(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with GitListMatchingRefsParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GitListMatchingRefsResponse> */ _
  ] = js.native
  def updateRef(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GitUpdateRefResponse> */ _
  ] = js.native
  def updateRef(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with GitUpdateRefParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<GitUpdateRefResponse> */ _
  ] = js.native
}

