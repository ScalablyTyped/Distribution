package typings.monacoEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "KeyMod")
@js.native
class KeyMod () extends js.Object

/* static members */
@JSImport("monaco-editor", "KeyMod")
@js.native
object KeyMod extends js.Object {
  val Alt: Double = js.native
  val CtrlCmd: Double = js.native
  val Shift: Double = js.native
  val WinCtrl: Double = js.native
  def chord(firstPart: Double, secondPart: Double): Double = js.native
}

