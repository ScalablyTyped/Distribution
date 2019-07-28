package typings.pad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pad", JSImport.Namespace)
@js.native
object padMod extends js.Object {
  // tslint:disable-next-line unified-signatures
  /** left pad */
  def apply(length: Double, text: String): String = js.native
  def apply(length: Double, text: String, char: String): String = js.native
  def apply(length: Double, text: String, options: Anon_Char): String = js.native
  // tslint:disable-next-line unified-signatures
  /** Right pad */
  def apply(text: String, length: Double): String = js.native
  def apply(text: String, length: Double, char: String): String = js.native
  def apply(text: String, length: Double, options: Anon_Char): String = js.native
}

