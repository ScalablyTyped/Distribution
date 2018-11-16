package typings
package papaparseLib.papaparseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("papaparse", "Parser")
@js.native
class Parser protected () extends js.Object {
  def this(config: ParseConfig) = this()
  // Sets the abort flag
  def abort(): scala.Unit = js.native
  // Gets the cursor position
  def getCharIndex(): scala.Double = js.native
  def parse(input: java.lang.String, baseIndex: scala.Double, ignoreLastRow: scala.Boolean): js.Any = js.native
  def pause(): scala.Unit = js.native
  def resume(): scala.Unit = js.native
}

