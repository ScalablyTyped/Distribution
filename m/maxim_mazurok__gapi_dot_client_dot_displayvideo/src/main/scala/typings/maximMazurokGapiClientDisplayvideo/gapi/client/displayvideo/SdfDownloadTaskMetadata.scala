package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SdfDownloadTaskMetadata extends StObject {
  
  /** The time when the operation was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** The time when execution was completed. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** The SDF version used to execute this download task. */
  var version: js.UndefOr[String] = js.undefined
}
object SdfDownloadTaskMetadata {
  
  @scala.inline
  def apply(): SdfDownloadTaskMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SdfDownloadTaskMetadata]
  }
  
  @scala.inline
  implicit class SdfDownloadTaskMetadataMutableBuilder[Self <: SdfDownloadTaskMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
