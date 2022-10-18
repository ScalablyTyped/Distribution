package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponses201Content509 extends StObject {
  
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
  var post: Responses201Content509
}
object PostResponses201Content509 {
  
  inline def apply(post: Responses201Content509): PostResponses201Content509 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponses201Content509]
  }
  
  extension [Self <: PostResponses201Content509](x: Self) {
    
    inline def setPost(value: Responses201Content509): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
