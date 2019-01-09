package typings
package padLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pad", JSImport.Namespace)
@js.native
object padMod extends js.Object {
  // tslint:disable-next-line unified-signatures
  /** left pad */
  def apply(length: scala.Double, text: java.lang.String): java.lang.String = js.native
  def apply(length: scala.Double, text: java.lang.String, char: java.lang.String): java.lang.String = js.native
  def apply(length: scala.Double, text: java.lang.String, options: padLib.Anon_Char): java.lang.String = js.native
  // tslint:disable-next-line unified-signatures
  /** Right pad */
  def apply(text: java.lang.String, length: scala.Double): java.lang.String = js.native
  def apply(text: java.lang.String, length: scala.Double, char: java.lang.String): java.lang.String = js.native
  def apply(text: java.lang.String, length: scala.Double, options: padLib.Anon_Char): java.lang.String = js.native
}

