package typings.minappEnv.WXNS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProgressUpdateEvent extends js.Object {
  var progress: Double
  var totalBytesExpectedToWrite: Double
  var totalBytesWritten: Double
}

object IProgressUpdateEvent {
  @scala.inline
  def apply(progress: Double, totalBytesExpectedToWrite: Double, totalBytesWritten: Double): IProgressUpdateEvent = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any], totalBytesExpectedToWrite = totalBytesExpectedToWrite.asInstanceOf[js.Any], totalBytesWritten = totalBytesWritten.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IProgressUpdateEvent]
  }
}

