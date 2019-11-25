package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.audio
  - typings.microsoftDashGraph.microsoftDashGraphStrings.video
  - typings.microsoftDashGraph.microsoftDashGraphStrings.videoBasedScreenSharing
  - typings.microsoftDashGraph.microsoftDashGraphStrings.data
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue
*/
trait Modality extends js.Object

object Modality {
  @scala.inline
  def audio: typings.microsoftDashGraph.microsoftDashGraphStrings.audio = this.cast("audio")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def data: typings.microsoftDashGraph.microsoftDashGraphStrings.data = this.cast("data")
  @scala.inline
  def unknownFutureValue: typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
  @scala.inline
  def video: typings.microsoftDashGraph.microsoftDashGraphStrings.video = this.cast("video")
  @scala.inline
  def videoBasedScreenSharing: typings.microsoftDashGraph.microsoftDashGraphStrings.videoBasedScreenSharing = this.cast("videoBasedScreenSharing")
}

