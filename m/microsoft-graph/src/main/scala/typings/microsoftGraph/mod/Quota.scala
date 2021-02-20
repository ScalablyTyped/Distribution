package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Quota extends StObject {
  
  // Total space consumed by files in the recycle bin, in bytes. Read-only.
  var deleted: js.UndefOr[NullableOption[Double]] = js.native
  
  // Total space remaining before reaching the quota limit, in bytes. Read-only.
  var remaining: js.UndefOr[NullableOption[Double]] = js.native
  
  // Enumeration value that indicates the state of the storage space. Read-only.
  var state: js.UndefOr[NullableOption[String]] = js.native
  
  // Information about the drive's storage quota plans. Only in Personal OneDrive.
  var storagePlanInformation: js.UndefOr[NullableOption[StoragePlanInformation]] = js.native
  
  // Total allowed storage space, in bytes. Read-only.
  var total: js.UndefOr[NullableOption[Double]] = js.native
  
  // Total space used, in bytes. Read-only.
  var used: js.UndefOr[NullableOption[Double]] = js.native
}
object Quota {
  
  @scala.inline
  def apply(): Quota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Quota]
  }
  
  @scala.inline
  implicit class QuotaMutableBuilder[Self <: Quota] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleted(value: NullableOption[Double]): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedNull: Self = StObject.set(x, "deleted", null)
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setRemaining(value: NullableOption[Double]): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemainingNull: Self = StObject.set(x, "remaining", null)
    
    @scala.inline
    def setRemainingUndefined: Self = StObject.set(x, "remaining", js.undefined)
    
    @scala.inline
    def setState(value: NullableOption[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateNull: Self = StObject.set(x, "state", null)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setStoragePlanInformation(value: NullableOption[StoragePlanInformation]): Self = StObject.set(x, "storagePlanInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoragePlanInformationNull: Self = StObject.set(x, "storagePlanInformation", null)
    
    @scala.inline
    def setStoragePlanInformationUndefined: Self = StObject.set(x, "storagePlanInformation", js.undefined)
    
    @scala.inline
    def setTotal(value: NullableOption[Double]): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalNull: Self = StObject.set(x, "total", null)
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    @scala.inline
    def setUsed(value: NullableOption[Double]): Self = StObject.set(x, "used", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedNull: Self = StObject.set(x, "used", null)
    
    @scala.inline
    def setUsedUndefined: Self = StObject.set(x, "used", js.undefined)
  }
}
