package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBlob extends StObject {
  
  def createBlob(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/git/blobs']['response'] */ js.Any
  ]
  def createBlob(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/git/blobs']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/git/blobs']['response'] */ js.Any
  ]
  @JSName("createBlob")
  var createBlob_Original: `273`
  
  /**
    * Creates a new Git [commit object](https://git-scm.com/book/en/v1/Git-Internals-Git-Objects#Commit-Objects).
    *
    * **Signature verification object**
    *
    * The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:
    *
    * | Name | Type | Description |
    * | ---- | ---- | ----------- |
    * | `verified` | `boolean` | Indicates whether GitHub considers the signature in this commit to be verified. |
    * | `reason` | `string` | The reason for verified value. Possible values and their meanings are enumerated in the table below. |
    * | `signature` | `string` | The signature that was extracted from the commit. |
    * | `payload` | `string` | The value that was signed. |
    *
    * These are the possible values for `reason` in the `verification` object:
    *
    * | Value | Description |
    * | ----- | ----------- |
    * | `expired_key` | The key that made the signature is expired. |
    * | `not_signing_key` | The "signing" flag is not among the usage flags in the GPG key that made the signature. |
    * | `gpgverify_error` | There was an error communicating with the signature verification service. |
    * | `gpgverify_unavailable` | The signature verification service is currently unavailable. |
    * | `unsigned` | The object does not include a signature. |
    * | `unknown_signature_type` | A non-PGP signature was found in the commit. |
    * | `no_user` | No user was associated with the `committer` email address in the commit. |
    * | `unverified_email` | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
    * | `bad_email` | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature. |
    * | `unknown_key` | The key that made the signature has not been registered with any user's account. |
    * | `malformed_signature` | There was an error parsing the signature. |
    * | `invalid` | The signature could not be cryptographically verified using the key whose key-id was found in the signature. |
    * | `valid` | None of the above errors applied, so the signature is considered to be verified. |
    */
  def createCommit(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/git/commits']['response'] */ js.Any
  ]
  def createCommit(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/git/commits']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/git/commits']['response'] */ js.Any
  ]
  /**
    * Creates a new Git [commit object](https://git-scm.com/book/en/v1/Git-Internals-Git-Objects#Commit-Objects).
    *
    * **Signature verification object**
    *
    * The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:
    *
    * | Name | Type | Description |
    * | ---- | ---- | ----------- |
    * | `verified` | `boolean` | Indicates whether GitHub considers the signature in this commit to be verified. |
    * | `reason` | `string` | The reason for verified value. Possible values and their meanings are enumerated in the table below. |
    * | `signature` | `string` | The signature that was extracted from the commit. |
    * | `payload` | `string` | The value that was signed. |
    *
    * These are the possible values for `reason` in the `verification` object:
    *
    * | Value | Description |
    * | ----- | ----------- |
    * | `expired_key` | The key that made the signature is expired. |
    * | `not_signing_key` | The "signing" flag is not among the usage flags in the GPG key that made the signature. |
    * | `gpgverify_error` | There was an error communicating with the signature verification service. |
    * | `gpgverify_unavailable` | The signature verification service is currently unavailable. |
    * | `unsigned` | The object does not include a signature. |
    * | `unknown_signature_type` | A non-PGP signature was found in the commit. |
    * | `no_user` | No user was associated with the `committer` email address in the commit. |
    * | `unverified_email` | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
    * | `bad_email` | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature. |
    * | `unknown_key` | The key that made the signature has not been registered with any user's account. |
    * | `malformed_signature` | There was an error parsing the signature. |
    * | `invalid` | The signature could not be cryptographically verified using the key whose key-id was found in the signature. |
    * | `valid` | None of the above errors applied, so the signature is considered to be verified. |
    */
  @JSName("createCommit")
  var createCommit_Original: `274`
  
  /**
    * Creates a reference for your repository. You are unable to create new references for empty repositories, even if the commit SHA-1 hash used exists. Empty repositories are repositories without branches.
    */
  def createRef(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/git/refs']['response'] */ js.Any
  ]
  def createRef(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/git/refs']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/git/refs']['response'] */ js.Any
  ]
  /**
    * Creates a reference for your repository. You are unable to create new references for empty repositories, even if the commit SHA-1 hash used exists. Empty repositories are repositories without branches.
    */
  @JSName("createRef")
  var createRef_Original: `275`
  
  /**
    * Note that creating a tag object does not create the reference that makes a tag in Git. If you want to create an annotated tag in Git, you have to do this call to create the tag object, and then [create](https://docs.github.com/rest/reference/git#create-a-reference) the `refs/tags/[tag]` reference. If you want to create a lightweight tag, you only have to [create](https://docs.github.com/rest/reference/git#create-a-reference) the tag reference - this call would be unnecessary.
    *
    * **Signature verification object**
    *
    * The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:
    *
    * | Name | Type | Description |
    * | ---- | ---- | ----------- |
    * | `verified` | `boolean` | Indicates whether GitHub considers the signature in this commit to be verified. |
    * | `reason` | `string` | The reason for verified value. Possible values and their meanings are enumerated in table below. |
    * | `signature` | `string` | The signature that was extracted from the commit. |
    * | `payload` | `string` | The value that was signed. |
    *
    * These are the possible values for `reason` in the `verification` object:
    *
    * | Value | Description |
    * | ----- | ----------- |
    * | `expired_key` | The key that made the signature is expired. |
    * | `not_signing_key` | The "signing" flag is not among the usage flags in the GPG key that made the signature. |
    * | `gpgverify_error` | There was an error communicating with the signature verification service. |
    * | `gpgverify_unavailable` | The signature verification service is currently unavailable. |
    * | `unsigned` | The object does not include a signature. |
    * | `unknown_signature_type` | A non-PGP signature was found in the commit. |
    * | `no_user` | No user was associated with the `committer` email address in the commit. |
    * | `unverified_email` | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
    * | `bad_email` | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature. |
    * | `unknown_key` | The key that made the signature has not been registered with any user's account. |
    * | `malformed_signature` | There was an error parsing the signature. |
    * | `invalid` | The signature could not be cryptographically verified using the key whose key-id was found in the signature. |
    * | `valid` | None of the above errors applied, so the signature is considered to be verified. |
    */
  def createTag(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/git/tags']['response'] */ js.Any
  ]
  def createTag(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/git/tags']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/git/tags']['response'] */ js.Any
  ]
  /**
    * Note that creating a tag object does not create the reference that makes a tag in Git. If you want to create an annotated tag in Git, you have to do this call to create the tag object, and then [create](https://docs.github.com/rest/reference/git#create-a-reference) the `refs/tags/[tag]` reference. If you want to create a lightweight tag, you only have to [create](https://docs.github.com/rest/reference/git#create-a-reference) the tag reference - this call would be unnecessary.
    *
    * **Signature verification object**
    *
    * The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:
    *
    * | Name | Type | Description |
    * | ---- | ---- | ----------- |
    * | `verified` | `boolean` | Indicates whether GitHub considers the signature in this commit to be verified. |
    * | `reason` | `string` | The reason for verified value. Possible values and their meanings are enumerated in table below. |
    * | `signature` | `string` | The signature that was extracted from the commit. |
    * | `payload` | `string` | The value that was signed. |
    *
    * These are the possible values for `reason` in the `verification` object:
    *
    * | Value | Description |
    * | ----- | ----------- |
    * | `expired_key` | The key that made the signature is expired. |
    * | `not_signing_key` | The "signing" flag is not among the usage flags in the GPG key that made the signature. |
    * | `gpgverify_error` | There was an error communicating with the signature verification service. |
    * | `gpgverify_unavailable` | The signature verification service is currently unavailable. |
    * | `unsigned` | The object does not include a signature. |
    * | `unknown_signature_type` | A non-PGP signature was found in the commit. |
    * | `no_user` | No user was associated with the `committer` email address in the commit. |
    * | `unverified_email` | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
    * | `bad_email` | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature. |
    * | `unknown_key` | The key that made the signature has not been registered with any user's account. |
    * | `malformed_signature` | There was an error parsing the signature. |
    * | `invalid` | The signature could not be cryptographically verified using the key whose key-id was found in the signature. |
    * | `valid` | None of the above errors applied, so the signature is considered to be verified. |
    */
  @JSName("createTag")
  var createTag_Original: `276`
  
  /**
    * The tree creation API accepts nested entries. If you specify both a tree and a nested path modifying that tree, this endpoint will overwrite the contents of the tree with the new path contents, and create a new tree structure.
    *
    * If you use this endpoint to add, delete, or modify the file contents in a tree, you will need to commit the tree and then update a branch to point to the commit. For more information see "[Create a commit](https://docs.github.com/rest/reference/git#create-a-commit)" and "[Update a reference](https://docs.github.com/rest/reference/git#update-a-reference)."
    *
    * Returns an error if you try to delete a file that does not exist.
    */
  def createTree(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/git/trees']['response'] */ js.Any
  ]
  def createTree(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/git/trees']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/git/trees']['response'] */ js.Any
  ]
  /**
    * The tree creation API accepts nested entries. If you specify both a tree and a nested path modifying that tree, this endpoint will overwrite the contents of the tree with the new path contents, and create a new tree structure.
    *
    * If you use this endpoint to add, delete, or modify the file contents in a tree, you will need to commit the tree and then update a branch to point to the commit. For more information see "[Create a commit](https://docs.github.com/rest/reference/git#create-a-commit)" and "[Update a reference](https://docs.github.com/rest/reference/git#update-a-reference)."
    *
    * Returns an error if you try to delete a file that does not exist.
    */
  @JSName("createTree")
  var createTree_Original: `277`
  
  def deleteRef(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/git/refs/{ref}']['response'] */ js.Any
  ]
  def deleteRef(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/git/refs/{ref}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/git/refs/{ref}']['response'] */ js.Any
  ]
  @JSName("deleteRef")
  var deleteRef_Original: `278`
  
  /**
    * The `content` in the response will always be Base64 encoded.
    *
    * _Note_: This API supports blobs up to 100 megabytes in size.
    */
  def getBlob(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/git/blobs/{file_sha}']['response'] */ js.Any
  ]
  def getBlob(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/git/blobs/{file_sha}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/git/blobs/{file_sha}']['response'] */ js.Any
  ]
  /**
    * The `content` in the response will always be Base64 encoded.
    *
    * _Note_: This API supports blobs up to 100 megabytes in size.
    */
  @JSName("getBlob")
  var getBlob_Original: `279`
  
  /**
    * Gets a Git [commit object](https://git-scm.com/book/en/v1/Git-Internals-Git-Objects#Commit-Objects).
    *
    * **Signature verification object**
    *
    * The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:
    *
    * | Name | Type | Description |
    * | ---- | ---- | ----------- |
    * | `verified` | `boolean` | Indicates whether GitHub considers the signature in this commit to be verified. |
    * | `reason` | `string` | The reason for verified value. Possible values and their meanings are enumerated in the table below. |
    * | `signature` | `string` | The signature that was extracted from the commit. |
    * | `payload` | `string` | The value that was signed. |
    *
    * These are the possible values for `reason` in the `verification` object:
    *
    * | Value | Description |
    * | ----- | ----------- |
    * | `expired_key` | The key that made the signature is expired. |
    * | `not_signing_key` | The "signing" flag is not among the usage flags in the GPG key that made the signature. |
    * | `gpgverify_error` | There was an error communicating with the signature verification service. |
    * | `gpgverify_unavailable` | The signature verification service is currently unavailable. |
    * | `unsigned` | The object does not include a signature. |
    * | `unknown_signature_type` | A non-PGP signature was found in the commit. |
    * | `no_user` | No user was associated with the `committer` email address in the commit. |
    * | `unverified_email` | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
    * | `bad_email` | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature. |
    * | `unknown_key` | The key that made the signature has not been registered with any user's account. |
    * | `malformed_signature` | There was an error parsing the signature. |
    * | `invalid` | The signature could not be cryptographically verified using the key whose key-id was found in the signature. |
    * | `valid` | None of the above errors applied, so the signature is considered to be verified. |
    */
  def getCommit(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/git/commits/{commit_sha}']['response'] */ js.Any
  ]
  def getCommit(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/git/commits/{commit_sha}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/git/commits/{commit_sha}']['response'] */ js.Any
  ]
  /**
    * Gets a Git [commit object](https://git-scm.com/book/en/v1/Git-Internals-Git-Objects#Commit-Objects).
    *
    * **Signature verification object**
    *
    * The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:
    *
    * | Name | Type | Description |
    * | ---- | ---- | ----------- |
    * | `verified` | `boolean` | Indicates whether GitHub considers the signature in this commit to be verified. |
    * | `reason` | `string` | The reason for verified value. Possible values and their meanings are enumerated in the table below. |
    * | `signature` | `string` | The signature that was extracted from the commit. |
    * | `payload` | `string` | The value that was signed. |
    *
    * These are the possible values for `reason` in the `verification` object:
    *
    * | Value | Description |
    * | ----- | ----------- |
    * | `expired_key` | The key that made the signature is expired. |
    * | `not_signing_key` | The "signing" flag is not among the usage flags in the GPG key that made the signature. |
    * | `gpgverify_error` | There was an error communicating with the signature verification service. |
    * | `gpgverify_unavailable` | The signature verification service is currently unavailable. |
    * | `unsigned` | The object does not include a signature. |
    * | `unknown_signature_type` | A non-PGP signature was found in the commit. |
    * | `no_user` | No user was associated with the `committer` email address in the commit. |
    * | `unverified_email` | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
    * | `bad_email` | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature. |
    * | `unknown_key` | The key that made the signature has not been registered with any user's account. |
    * | `malformed_signature` | There was an error parsing the signature. |
    * | `invalid` | The signature could not be cryptographically verified using the key whose key-id was found in the signature. |
    * | `valid` | None of the above errors applied, so the signature is considered to be verified. |
    */
  @JSName("getCommit")
  var getCommit_Original: `280`
  
  /**
    * Returns a single reference from your Git database. The `:ref` in the URL must be formatted as `heads/<branch name>` for branches and `tags/<tag name>` for tags. If the `:ref` doesn't match an existing ref, a `404` is returned.
    *
    * **Note:** You need to explicitly [request a pull request](https://docs.github.com/rest/reference/pulls#get-a-pull-request) to trigger a test merge commit, which checks the mergeability of pull requests. For more information, see "[Checking mergeability of pull requests](https://docs.github.com/rest/guides/getting-started-with-the-git-database-api#checking-mergeability-of-pull-requests)".
    */
  def getRef(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/git/ref/{ref}']['response'] */ js.Any
  ]
  def getRef(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/git/ref/{ref}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/git/ref/{ref}']['response'] */ js.Any
  ]
  /**
    * Returns a single reference from your Git database. The `:ref` in the URL must be formatted as `heads/<branch name>` for branches and `tags/<tag name>` for tags. If the `:ref` doesn't match an existing ref, a `404` is returned.
    *
    * **Note:** You need to explicitly [request a pull request](https://docs.github.com/rest/reference/pulls#get-a-pull-request) to trigger a test merge commit, which checks the mergeability of pull requests. For more information, see "[Checking mergeability of pull requests](https://docs.github.com/rest/guides/getting-started-with-the-git-database-api#checking-mergeability-of-pull-requests)".
    */
  @JSName("getRef")
  var getRef_Original: `281`
  
  /**
    * **Signature verification object**
    *
    * The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:
    *
    * | Name | Type | Description |
    * | ---- | ---- | ----------- |
    * | `verified` | `boolean` | Indicates whether GitHub considers the signature in this commit to be verified. |
    * | `reason` | `string` | The reason for verified value. Possible values and their meanings are enumerated in table below. |
    * | `signature` | `string` | The signature that was extracted from the commit. |
    * | `payload` | `string` | The value that was signed. |
    *
    * These are the possible values for `reason` in the `verification` object:
    *
    * | Value | Description |
    * | ----- | ----------- |
    * | `expired_key` | The key that made the signature is expired. |
    * | `not_signing_key` | The "signing" flag is not among the usage flags in the GPG key that made the signature. |
    * | `gpgverify_error` | There was an error communicating with the signature verification service. |
    * | `gpgverify_unavailable` | The signature verification service is currently unavailable. |
    * | `unsigned` | The object does not include a signature. |
    * | `unknown_signature_type` | A non-PGP signature was found in the commit. |
    * | `no_user` | No user was associated with the `committer` email address in the commit. |
    * | `unverified_email` | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
    * | `bad_email` | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature. |
    * | `unknown_key` | The key that made the signature has not been registered with any user's account. |
    * | `malformed_signature` | There was an error parsing the signature. |
    * | `invalid` | The signature could not be cryptographically verified using the key whose key-id was found in the signature. |
    * | `valid` | None of the above errors applied, so the signature is considered to be verified. |
    */
  def getTag(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/git/tags/{tag_sha}']['response'] */ js.Any
  ]
  def getTag(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/git/tags/{tag_sha}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/git/tags/{tag_sha}']['response'] */ js.Any
  ]
  /**
    * **Signature verification object**
    *
    * The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:
    *
    * | Name | Type | Description |
    * | ---- | ---- | ----------- |
    * | `verified` | `boolean` | Indicates whether GitHub considers the signature in this commit to be verified. |
    * | `reason` | `string` | The reason for verified value. Possible values and their meanings are enumerated in table below. |
    * | `signature` | `string` | The signature that was extracted from the commit. |
    * | `payload` | `string` | The value that was signed. |
    *
    * These are the possible values for `reason` in the `verification` object:
    *
    * | Value | Description |
    * | ----- | ----------- |
    * | `expired_key` | The key that made the signature is expired. |
    * | `not_signing_key` | The "signing" flag is not among the usage flags in the GPG key that made the signature. |
    * | `gpgverify_error` | There was an error communicating with the signature verification service. |
    * | `gpgverify_unavailable` | The signature verification service is currently unavailable. |
    * | `unsigned` | The object does not include a signature. |
    * | `unknown_signature_type` | A non-PGP signature was found in the commit. |
    * | `no_user` | No user was associated with the `committer` email address in the commit. |
    * | `unverified_email` | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
    * | `bad_email` | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature. |
    * | `unknown_key` | The key that made the signature has not been registered with any user's account. |
    * | `malformed_signature` | There was an error parsing the signature. |
    * | `invalid` | The signature could not be cryptographically verified using the key whose key-id was found in the signature. |
    * | `valid` | None of the above errors applied, so the signature is considered to be verified. |
    */
  @JSName("getTag")
  var getTag_Original: `282`
  
  /**
    * Returns a single tree using the SHA1 value for that tree.
    *
    * If `truncated` is `true` in the response then the number of items in the `tree` array exceeded our maximum limit. If you need to fetch more items, use the non-recursive method of fetching trees, and fetch one sub-tree at a time.
    *
    *
    * **Note**: The limit for the `tree` array is 100,000 entries with a maximum size of 7 MB when using the `recursive` parameter.
    */
  def getTree(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/git/trees/{tree_sha}']['response'] */ js.Any
  ]
  def getTree(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/git/trees/{tree_sha}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/git/trees/{tree_sha}']['response'] */ js.Any
  ]
  /**
    * Returns a single tree using the SHA1 value for that tree.
    *
    * If `truncated` is `true` in the response then the number of items in the `tree` array exceeded our maximum limit. If you need to fetch more items, use the non-recursive method of fetching trees, and fetch one sub-tree at a time.
    *
    *
    * **Note**: The limit for the `tree` array is 100,000 entries with a maximum size of 7 MB when using the `recursive` parameter.
    */
  @JSName("getTree")
  var getTree_Original: `283`
  
  /**
    * Returns an array of references from your Git database that match the supplied name. The `:ref` in the URL must be formatted as `heads/<branch name>` for branches and `tags/<tag name>` for tags. If the `:ref` doesn't exist in the repository, but existing refs start with `:ref`, they will be returned as an array.
    *
    * When you use this endpoint without providing a `:ref`, it will return an array of all the references from your Git database, including notes and stashes if they exist on the server. Anything in the namespace is returned, not just `heads` and `tags`.
    *
    * **Note:** You need to explicitly [request a pull request](https://docs.github.com/rest/reference/pulls#get-a-pull-request) to trigger a test merge commit, which checks the mergeability of pull requests. For more information, see "[Checking mergeability of pull requests](https://docs.github.com/rest/guides/getting-started-with-the-git-database-api#checking-mergeability-of-pull-requests)".
    *
    * If you request matching references for a branch named `feature` but the branch `feature` doesn't exist, the response can still include other matching head refs that start with the word `feature`, such as `featureA` and `featureB`.
    */
  def listMatchingRefs(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/git/matching-refs/{ref}']['response'] */ js.Any
  ]
  def listMatchingRefs(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/git/matching-refs/{ref}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/git/matching-refs/{ref}']['response'] */ js.Any
  ]
  /**
    * Returns an array of references from your Git database that match the supplied name. The `:ref` in the URL must be formatted as `heads/<branch name>` for branches and `tags/<tag name>` for tags. If the `:ref` doesn't exist in the repository, but existing refs start with `:ref`, they will be returned as an array.
    *
    * When you use this endpoint without providing a `:ref`, it will return an array of all the references from your Git database, including notes and stashes if they exist on the server. Anything in the namespace is returned, not just `heads` and `tags`.
    *
    * **Note:** You need to explicitly [request a pull request](https://docs.github.com/rest/reference/pulls#get-a-pull-request) to trigger a test merge commit, which checks the mergeability of pull requests. For more information, see "[Checking mergeability of pull requests](https://docs.github.com/rest/guides/getting-started-with-the-git-database-api#checking-mergeability-of-pull-requests)".
    *
    * If you request matching references for a branch named `feature` but the branch `feature` doesn't exist, the response can still include other matching head refs that start with the word `feature`, such as `featureA` and `featureB`.
    */
  @JSName("listMatchingRefs")
  var listMatchingRefs_Original: `284`
  
  def updateRef(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/git/refs/{ref}']['response'] */ js.Any
  ]
  def updateRef(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/git/refs/{ref}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/git/refs/{ref}']['response'] */ js.Any
  ]
  @JSName("updateRef")
  var updateRef_Original: `285`
}
object CreateBlob {
  
  inline def apply(
    createBlob: `273`,
    createCommit: `274`,
    createRef: `275`,
    createTag: `276`,
    createTree: `277`,
    deleteRef: `278`,
    getBlob: `279`,
    getCommit: `280`,
    getRef: `281`,
    getTag: `282`,
    getTree: `283`,
    listMatchingRefs: `284`,
    updateRef: `285`
  ): CreateBlob = {
    val __obj = js.Dynamic.literal(createBlob = createBlob.asInstanceOf[js.Any], createCommit = createCommit.asInstanceOf[js.Any], createRef = createRef.asInstanceOf[js.Any], createTag = createTag.asInstanceOf[js.Any], createTree = createTree.asInstanceOf[js.Any], deleteRef = deleteRef.asInstanceOf[js.Any], getBlob = getBlob.asInstanceOf[js.Any], getCommit = getCommit.asInstanceOf[js.Any], getRef = getRef.asInstanceOf[js.Any], getTag = getTag.asInstanceOf[js.Any], getTree = getTree.asInstanceOf[js.Any], listMatchingRefs = listMatchingRefs.asInstanceOf[js.Any], updateRef = updateRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBlob]
  }
  
  extension [Self <: CreateBlob](x: Self) {
    
    inline def setCreateBlob(value: `273`): Self = StObject.set(x, "createBlob", value.asInstanceOf[js.Any])
    
    inline def setCreateCommit(value: `274`): Self = StObject.set(x, "createCommit", value.asInstanceOf[js.Any])
    
    inline def setCreateRef(value: `275`): Self = StObject.set(x, "createRef", value.asInstanceOf[js.Any])
    
    inline def setCreateTag(value: `276`): Self = StObject.set(x, "createTag", value.asInstanceOf[js.Any])
    
    inline def setCreateTree(value: `277`): Self = StObject.set(x, "createTree", value.asInstanceOf[js.Any])
    
    inline def setDeleteRef(value: `278`): Self = StObject.set(x, "deleteRef", value.asInstanceOf[js.Any])
    
    inline def setGetBlob(value: `279`): Self = StObject.set(x, "getBlob", value.asInstanceOf[js.Any])
    
    inline def setGetCommit(value: `280`): Self = StObject.set(x, "getCommit", value.asInstanceOf[js.Any])
    
    inline def setGetRef(value: `281`): Self = StObject.set(x, "getRef", value.asInstanceOf[js.Any])
    
    inline def setGetTag(value: `282`): Self = StObject.set(x, "getTag", value.asInstanceOf[js.Any])
    
    inline def setGetTree(value: `283`): Self = StObject.set(x, "getTree", value.asInstanceOf[js.Any])
    
    inline def setListMatchingRefs(value: `284`): Self = StObject.set(x, "listMatchingRefs", value.asInstanceOf[js.Any])
    
    inline def setUpdateRef(value: `285`): Self = StObject.set(x, "updateRef", value.asInstanceOf[js.Any])
  }
}
