package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDataSetExportingStatus extends StObject {
  
  val CurrentServerTime: ITimestamp
  
  val IsExporting: Boolean
  
  val LatestActivity: ITimestamp
}
object IDataSetExportingStatus {
  
  inline def apply(CurrentServerTime: ITimestamp, IsExporting: Boolean, LatestActivity: ITimestamp): IDataSetExportingStatus = {
    val __obj = js.Dynamic.literal(CurrentServerTime = CurrentServerTime.asInstanceOf[js.Any], IsExporting = IsExporting.asInstanceOf[js.Any], LatestActivity = LatestActivity.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataSetExportingStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDataSetExportingStatus] (val x: Self) extends AnyVal {
    
    inline def setCurrentServerTime(value: ITimestamp): Self = StObject.set(x, "CurrentServerTime", value.asInstanceOf[js.Any])
    
    inline def setIsExporting(value: Boolean): Self = StObject.set(x, "IsExporting", value.asInstanceOf[js.Any])
    
    inline def setLatestActivity(value: ITimestamp): Self = StObject.set(x, "LatestActivity", value.asInstanceOf[js.Any])
  }
}
