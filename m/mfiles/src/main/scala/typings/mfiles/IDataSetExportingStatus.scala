package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDataSetExportingStatus extends StObject {
  
  val CurrentServerTime: ITimestamp = js.native
  
  val IsExporting: Boolean = js.native
  
  val LatestActivity: ITimestamp = js.native
}
object IDataSetExportingStatus {
  
  @scala.inline
  def apply(CurrentServerTime: ITimestamp, IsExporting: Boolean, LatestActivity: ITimestamp): IDataSetExportingStatus = {
    val __obj = js.Dynamic.literal(CurrentServerTime = CurrentServerTime.asInstanceOf[js.Any], IsExporting = IsExporting.asInstanceOf[js.Any], LatestActivity = LatestActivity.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataSetExportingStatus]
  }
  
  @scala.inline
  implicit class IDataSetExportingStatusMutableBuilder[Self <: IDataSetExportingStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentServerTime(value: ITimestamp): Self = StObject.set(x, "CurrentServerTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExporting(value: Boolean): Self = StObject.set(x, "IsExporting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestActivity(value: ITimestamp): Self = StObject.set(x, "LatestActivity", value.asInstanceOf[js.Any])
  }
}
