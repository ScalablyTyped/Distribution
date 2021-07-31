package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentitytoolkitRelyingpartyUploadAccountRequest extends StObject {
  
  /** Whether allow overwrite existing account when user local_id exists. */
  var allowOverwrite: js.UndefOr[Boolean] = js.undefined
  
  var blockSize: js.UndefOr[Double] = js.undefined
  
  /** The following 4 fields are for standard scrypt algorithm. */
  var cpuMemCost: js.UndefOr[Double] = js.undefined
  
  /** GCP project number of the requesting delegated app. Currently only intended for Firebase V1 migration. */
  var delegatedProjectNumber: js.UndefOr[String] = js.undefined
  
  var dkLen: js.UndefOr[Double] = js.undefined
  
  /** The password hash algorithm. */
  var hashAlgorithm: js.UndefOr[String] = js.undefined
  
  /** Memory cost for hash calculation. Used by scrypt similar algorithms. */
  var memoryCost: js.UndefOr[Double] = js.undefined
  
  var parallelization: js.UndefOr[Double] = js.undefined
  
  /** Rounds for hash calculation. Used by scrypt and similar algorithms. */
  var rounds: js.UndefOr[Double] = js.undefined
  
  /** The salt separator. */
  var saltSeparator: js.UndefOr[String] = js.undefined
  
  /** If true, backend will do sanity check(including duplicate email and federated id) when uploading account. */
  var sanityCheck: js.UndefOr[Boolean] = js.undefined
  
  /** The key for to hash the password. */
  var signerKey: js.UndefOr[String] = js.undefined
  
  /** Specify which project (field value is actually project id) to operate. Only used when provided credential. */
  var targetProjectId: js.UndefOr[String] = js.undefined
  
  /** The account info to be stored. */
  var users: js.UndefOr[js.Array[UserInfo]] = js.undefined
}
object IdentitytoolkitRelyingpartyUploadAccountRequest {
  
  @scala.inline
  def apply(): IdentitytoolkitRelyingpartyUploadAccountRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyUploadAccountRequest]
  }
  
  @scala.inline
  implicit class IdentitytoolkitRelyingpartyUploadAccountRequestMutableBuilder[Self <: IdentitytoolkitRelyingpartyUploadAccountRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowOverwrite(value: Boolean): Self = StObject.set(x, "allowOverwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowOverwriteUndefined: Self = StObject.set(x, "allowOverwrite", js.undefined)
    
    @scala.inline
    def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockSizeUndefined: Self = StObject.set(x, "blockSize", js.undefined)
    
    @scala.inline
    def setCpuMemCost(value: Double): Self = StObject.set(x, "cpuMemCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuMemCostUndefined: Self = StObject.set(x, "cpuMemCost", js.undefined)
    
    @scala.inline
    def setDelegatedProjectNumber(value: String): Self = StObject.set(x, "delegatedProjectNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegatedProjectNumberUndefined: Self = StObject.set(x, "delegatedProjectNumber", js.undefined)
    
    @scala.inline
    def setDkLen(value: Double): Self = StObject.set(x, "dkLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDkLenUndefined: Self = StObject.set(x, "dkLen", js.undefined)
    
    @scala.inline
    def setHashAlgorithm(value: String): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashAlgorithmUndefined: Self = StObject.set(x, "hashAlgorithm", js.undefined)
    
    @scala.inline
    def setMemoryCost(value: Double): Self = StObject.set(x, "memoryCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryCostUndefined: Self = StObject.set(x, "memoryCost", js.undefined)
    
    @scala.inline
    def setParallelization(value: Double): Self = StObject.set(x, "parallelization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelizationUndefined: Self = StObject.set(x, "parallelization", js.undefined)
    
    @scala.inline
    def setRounds(value: Double): Self = StObject.set(x, "rounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundsUndefined: Self = StObject.set(x, "rounds", js.undefined)
    
    @scala.inline
    def setSaltSeparator(value: String): Self = StObject.set(x, "saltSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaltSeparatorUndefined: Self = StObject.set(x, "saltSeparator", js.undefined)
    
    @scala.inline
    def setSanityCheck(value: Boolean): Self = StObject.set(x, "sanityCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSanityCheckUndefined: Self = StObject.set(x, "sanityCheck", js.undefined)
    
    @scala.inline
    def setSignerKey(value: String): Self = StObject.set(x, "signerKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerKeyUndefined: Self = StObject.set(x, "signerKey", js.undefined)
    
    @scala.inline
    def setTargetProjectId(value: String): Self = StObject.set(x, "targetProjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetProjectIdUndefined: Self = StObject.set(x, "targetProjectId", js.undefined)
    
    @scala.inline
    def setUsers(value: js.Array[UserInfo]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: UserInfo*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
