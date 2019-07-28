package typings.photonui.photonuiNs

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("photonui.MouseManager")
@js.native
class MouseManager () extends Base {
  def this(element: Widget) = this()
  def this(element: HTMLElement) = this()
  def this(params: StringDictionary[js.Any]) = this()
  def this(element: Widget, params: StringDictionary[js.Any]) = this()
  def this(element: HTMLElement, params: StringDictionary[js.Any]) = this()
  var action: String = js.native
   // readonly
  var btnLeft: Boolean = js.native
   // readonly
  var btnMiddle: Boolean = js.native
   // readonly
  var btnRight: Boolean = js.native
   // readonly
  var button: String = js.native
   // readonly
  var deltaX: Double = js.native
   // readonly
  var deltaY: Double = js.native
  var element: HTMLElement = js.native
   // readonly
  var pageX: Double = js.native
   // readonly
  var pageY: Double = js.native
  var threshold: Double = js.native
   // readonly
  var x: Double = js.native
   // readonly
  var y: Double = js.native
}

