package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentitytoolkitRelyingpartyUploadAccountRequest extends js.Object {
  
  /** Whether allow overwrite existing account when user local_id exists. */
  var allowOverwrite: js.UndefOr[Boolean] = js.native
  
  var blockSize: js.UndefOr[Double] = js.native
  
  /** The following 4 fields are for standard scrypt algorithm. */
  var cpuMemCost: js.UndefOr[Double] = js.native
  
  /** GCP project number of the requesting delegated app. Currently only intended for Firebase V1 migration. */
  var delegatedProjectNumber: js.UndefOr[String] = js.native
  
  var dkLen: js.UndefOr[Double] = js.native
  
  /** The password hash algorithm. */
  var hashAlgorithm: js.UndefOr[String] = js.native
  
  /** Memory cost for hash calculation. Used by scrypt similar algorithms. */
  var memoryCost: js.UndefOr[Double] = js.native
  
  var parallelization: js.UndefOr[Double] = js.native
  
  /** Rounds for hash calculation. Used by scrypt and similar algorithms. */
  var rounds: js.UndefOr[Double] = js.native
  
  /** The salt separator. */
  var saltSeparator: js.UndefOr[String] = js.native
  
  /** If true, backend will do sanity check(including duplicate email and federated id) when uploading account. */
  var sanityCheck: js.UndefOr[Boolean] = js.native
  
  /** The key for to hash the password. */
  var signerKey: js.UndefOr[String] = js.native
  
  /** Specify which project (field value is actually project id) to operate. Only used when provided credential. */
  var targetProjectId: js.UndefOr[String] = js.native
  
  /** The account info to be stored. */
  var users: js.UndefOr[js.Array[UserInfo]] = js.native
}
object IdentitytoolkitRelyingpartyUploadAccountRequest {
  
  @scala.inline
  def apply(): IdentitytoolkitRelyingpartyUploadAccountRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyUploadAccountRequest]
  }
  
  @scala.inline
  implicit class IdentitytoolkitRelyingpartyUploadAccountRequestOps[Self <: IdentitytoolkitRelyingpartyUploadAccountRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowOverwrite(value: Boolean): Self = this.set("allowOverwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowOverwrite: Self = this.set("allowOverwrite", js.undefined)
    
    @scala.inline
    def setBlockSize(value: Double): Self = this.set("blockSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockSize: Self = this.set("blockSize", js.undefined)
    
    @scala.inline
    def setCpuMemCost(value: Double): Self = this.set("cpuMemCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpuMemCost: Self = this.set("cpuMemCost", js.undefined)
    
    @scala.inline
    def setDelegatedProjectNumber(value: String): Self = this.set("delegatedProjectNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelegatedProjectNumber: Self = this.set("delegatedProjectNumber", js.undefined)
    
    @scala.inline
    def setDkLen(value: Double): Self = this.set("dkLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDkLen: Self = this.set("dkLen", js.undefined)
    
    @scala.inline
    def setHashAlgorithm(value: String): Self = this.set("hashAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashAlgorithm: Self = this.set("hashAlgorithm", js.undefined)
    
    @scala.inline
    def setMemoryCost(value: Double): Self = this.set("memoryCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemoryCost: Self = this.set("memoryCost", js.undefined)
    
    @scala.inline
    def setParallelization(value: Double): Self = this.set("parallelization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallelization: Self = this.set("parallelization", js.undefined)
    
    @scala.inline
    def setRounds(value: Double): Self = this.set("rounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRounds: Self = this.set("rounds", js.undefined)
    
    @scala.inline
    def setSaltSeparator(value: String): Self = this.set("saltSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaltSeparator: Self = this.set("saltSeparator", js.undefined)
    
    @scala.inline
    def setSanityCheck(value: Boolean): Self = this.set("sanityCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSanityCheck: Self = this.set("sanityCheck", js.undefined)
    
    @scala.inline
    def setSignerKey(value: String): Self = this.set("signerKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerKey: Self = this.set("signerKey", js.undefined)
    
    @scala.inline
    def setTargetProjectId(value: String): Self = this.set("targetProjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetProjectId: Self = this.set("targetProjectId", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: UserInfo*): Self = this.set("users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: js.Array[UserInfo]): Self = this.set("users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsers: Self = this.set("users", js.undefined)
  }
}
