package typings.meow.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Result extends js.Object {
  
  var flags: StringDictionary[js.Any] = js.native
  
  var help: String = js.native
  
  var input: js.Array[String] = js.native
  
  var pkg: js.Any = js.native
  
  def showHelp(): Unit = js.native
  def showHelp(code: Double): Unit = js.native
  
  def showVersion(): Unit = js.native
}
