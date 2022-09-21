package typings.papaparse.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("papaparse", "Parser")
@js.native
open class Parser protected () extends StObject {
  def this(config: ParseConfig[Any, Unit]) = this()
  
  // Sets the abort flag
  def abort(): Unit = js.native
  
  // Gets the cursor position
  def getCharIndex(): Double = js.native
  
  def parse(input: String, baseIndex: Double, ignoreLastRow: Boolean): Any = js.native
  
  def pause(): Unit = js.native
  
  def resume(): Unit = js.native
}
