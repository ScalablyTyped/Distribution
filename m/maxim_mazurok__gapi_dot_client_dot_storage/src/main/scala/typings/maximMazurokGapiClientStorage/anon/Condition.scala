package typings.maximMazurokGapiClientStorage.anon

import typings.maximMazurokGapiClientStorage.gapi.client.storage.Expr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Condition extends StObject {
  
  /**
    * The condition that is associated with this binding. NOTE: an unsatisfied condition will not allow user access via current binding. Different bindings, including their
    * conditions, are examined independently.
    */
  var condition: js.UndefOr[Expr] = js.undefined
  
  /**
    * A collection of identifiers for members who may assume the provided role. Recognized identifiers are as follows:
    * - allUsers — A special identifier that represents anyone on the internet; with or without a Google account.
    * - allAuthenticatedUsers — A special identifier that represents anyone who is authenticated with a Google account or a service account.
    * - user:emailid — An email address that represents a specific account. For example, user:alice@gmail.com or user:joe@example.com.
    * - serviceAccount:emailid — An email address that represents a service account. For example,  serviceAccount:my-other-app@appspot.gserviceaccount.com .
    * - group:emailid — An email address that represents a Google group. For example, group:admins@example.com.
    * - domain:domain — A Google Apps domain name that represents all the users of that domain. For example, domain:google.com or domain:example.com.
    * - projectOwner:projectid — Owners of the given project. For example, projectOwner:my-example-project
    * - projectEditor:projectid — Editors of the given project. For example, projectEditor:my-example-project
    * - projectViewer:projectid — Viewers of the given project. For example, projectViewer:my-example-project
    */
  var members: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The role to which members belong. Two types of roles are supported: new IAM roles, which grant permissions that do not map directly to those provided by ACLs, and legacy IAM
    * roles, which do map directly to ACL permissions. All roles are of the format roles/storage.specificRole.
    * The new IAM roles are:
    * - roles/storage.admin — Full control of Google Cloud Storage resources.
    * - roles/storage.objectViewer — Read-Only access to Google Cloud Storage objects.
    * - roles/storage.objectCreator — Access to create objects in Google Cloud Storage.
    * - roles/storage.objectAdmin — Full control of Google Cloud Storage objects.   The legacy IAM roles are:
    * - roles/storage.legacyObjectReader — Read-only access to objects without listing. Equivalent to an ACL entry on an object with the READER role.
    * - roles/storage.legacyObjectOwner — Read/write access to existing objects without listing. Equivalent to an ACL entry on an object with the OWNER role.
    * - roles/storage.legacyBucketReader — Read access to buckets with object listing. Equivalent to an ACL entry on a bucket with the READER role.
    * - roles/storage.legacyBucketWriter — Read access to buckets with object listing/creation/deletion. Equivalent to an ACL entry on a bucket with the WRITER role.
    * - roles/storage.legacyBucketOwner — Read and write access to existing buckets with object listing/creation/deletion. Equivalent to an ACL entry on a bucket with the OWNER role.
    */
  var role: js.UndefOr[String] = js.undefined
}
object Condition {
  
  @scala.inline
  def apply(): Condition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Condition]
  }
  
  @scala.inline
  implicit class ConditionMutableBuilder[Self <: Condition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: Expr): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setMembers(value: js.Array[String]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    @scala.inline
    def setMembersVarargs(value: String*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
