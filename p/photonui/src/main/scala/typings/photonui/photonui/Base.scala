package typings.photonui.photonui

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("photonui.Base")
@js.native
class Base () extends js.Object {
  def this(params: StringDictionary[js.Any]) = this()
  def destroy(): Unit = js.native
  def registerCallback(id: String, wEvent: String, callback: js.Function, thisArg: js.Any): Unit = js.native
  def removeCallback(id: String): Unit = js.native
}

