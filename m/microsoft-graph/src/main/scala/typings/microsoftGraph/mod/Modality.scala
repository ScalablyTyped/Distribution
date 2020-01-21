package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.audio
  - typings.microsoftGraph.microsoftGraphStrings.video
  - typings.microsoftGraph.microsoftGraphStrings.videoBasedScreenSharing
  - typings.microsoftGraph.microsoftGraphStrings.data
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait Modality extends js.Object

object Modality {
  @scala.inline
  def audio: typings.microsoftGraph.microsoftGraphStrings.audio = this.cast("audio")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def data: typings.microsoftGraph.microsoftGraphStrings.data = this.cast("data")
  @scala.inline
  def unknownFutureValue: typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
  @scala.inline
  def video: typings.microsoftGraph.microsoftGraphStrings.video = this.cast("video")
  @scala.inline
  def videoBasedScreenSharing: typings.microsoftGraph.microsoftGraphStrings.videoBasedScreenSharing = this.cast("videoBasedScreenSharing")
}

