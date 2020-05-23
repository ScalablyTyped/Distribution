package typings.photonui.photonui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontSelect extends Select {
  var fonts: js.Array[String] = js.native
  def addFont(fontName: String): Unit = js.native
}

