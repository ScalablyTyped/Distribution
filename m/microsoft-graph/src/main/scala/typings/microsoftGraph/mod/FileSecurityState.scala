package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSecurityState extends StObject {
  
  // Complex type containing file hashes (cryptographic and location-sensitive).
  var fileHash: js.UndefOr[NullableOption[FileHash]] = js.native
  
  // File name (without path).
  var name: js.UndefOr[NullableOption[String]] = js.native
  
  // Full file path of the file/imageFile.
  var path: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Provider generated/calculated risk score of the alert file. Recommended value range of 0-1, which equates to a
    * percentage.
    */
  var riskScore: js.UndefOr[NullableOption[String]] = js.native
}
object FileSecurityState {
  
  @scala.inline
  def apply(): FileSecurityState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSecurityState]
  }
  
  @scala.inline
  implicit class FileSecurityStateMutableBuilder[Self <: FileSecurityState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileHash(value: NullableOption[FileHash]): Self = StObject.set(x, "fileHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileHashNull: Self = StObject.set(x, "fileHash", null)
    
    @scala.inline
    def setFileHashUndefined: Self = StObject.set(x, "fileHash", js.undefined)
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPath(value: NullableOption[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathNull: Self = StObject.set(x, "path", null)
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setRiskScore(value: NullableOption[String]): Self = StObject.set(x, "riskScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRiskScoreNull: Self = StObject.set(x, "riskScore", null)
    
    @scala.inline
    def setRiskScoreUndefined: Self = StObject.set(x, "riskScore", js.undefined)
  }
}
