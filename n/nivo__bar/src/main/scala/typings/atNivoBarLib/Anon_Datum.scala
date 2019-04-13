package typings
package atNivoBarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Datum extends js.Object {
  var layers: js.Array[atNivoBarLib.atNivoBarMod.Layer]
  def onClick(
    datum: atNivoBarLib.atNivoBarMod.BarExtendedDatum,
    event: reactLib.reactMod.MouseEvent[stdLib.SVGRectElement, reactLib.NativeMouseEvent]
  ): scala.Unit
}

object Anon_Datum {
  @scala.inline
  def apply(
    layers: js.Array[atNivoBarLib.atNivoBarMod.Layer],
    onClick: (atNivoBarLib.atNivoBarMod.BarExtendedDatum, reactLib.reactMod.MouseEvent[stdLib.SVGRectElement, reactLib.NativeMouseEvent]) => scala.Unit
  ): Anon_Datum = {
    val __obj = js.Dynamic.literal(layers = layers, onClick = js.Any.fromFunction2(onClick))
  
    __obj.asInstanceOf[Anon_Datum]
  }
}

