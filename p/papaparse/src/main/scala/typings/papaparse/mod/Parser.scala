package typings.papaparse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("papaparse", "Parser")
@js.native
class Parser protected () extends js.Object {
  def this(config: ParseConfig[_]) = this()
  
  // Sets the abort flag
  def abort(): Unit = js.native
  
  // Gets the cursor position
  def getCharIndex(): Double = js.native
  
  def parse(input: String, baseIndex: Double, ignoreLastRow: Boolean): js.Any = js.native
  
  def pause(): Unit = js.native
  
  def resume(): Unit = js.native
}
