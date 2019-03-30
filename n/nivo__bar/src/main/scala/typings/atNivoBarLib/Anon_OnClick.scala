package typings
package atNivoBarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_OnClick extends js.Object {
  @JSName("onClick")
  var onClick_Original: atNivoBarLib.atNivoBarMod.BarClickHandler = js.native
  var pixelRatio: scala.Double = js.native
  def onClick(
    datum: atNivoBarLib.atNivoBarMod.BarExtendedDatum,
    event: reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLCanvasElement, reactLib.NativeMouseEvent]
  ): scala.Unit = js.native
}

