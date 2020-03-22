package typings.piCamera

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object piCameraStrings {
  @js.native
  sealed trait photo extends js.Object
  
  @js.native
  sealed trait video extends js.Object
  
  @scala.inline
  def photo: photo = "photo".asInstanceOf[photo]
  @scala.inline
  def video: video = "video".asInstanceOf[video]
}

