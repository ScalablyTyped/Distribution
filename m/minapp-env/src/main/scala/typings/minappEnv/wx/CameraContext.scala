package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CameraContext extends StObject {
  
  /** [CameraContext.startRecord(Object object)](CameraContext.startRecord.md)
    *
    * 开始录像 */
  def startRecord(option: CameraContextStartRecordOption): Unit = js.native
  
  /** [CameraContext.stopRecord(Object object)](CameraContext.stopRecord.md)
    *
    * 结束录像 */
  def stopRecord(): Unit = js.native
  def stopRecord(option: StopRecordOption): Unit = js.native
  
  /** [CameraContext.takePhoto(Object object)](CameraContext.takePhoto.md)
    *
    * 拍摄照片 */
  def takePhoto(option: TakePhotoOption): Unit = js.native
}
