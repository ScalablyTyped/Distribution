package typings.naja.anon

import typings.naja.snippetHandlerMod.SnippetUpdateOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Content extends js.Object {
  
  var content: String = js.native
  
  var fromCache: Boolean = js.native
  
  def operation(snippet: typings.std.Element, content: String): Unit = js.native
  @JSName("operation")
  var operation_Original: SnippetUpdateOperation = js.native
  
  var options: typings.naja.najaMod.Options = js.native
  
  var snippet: typings.std.Element = js.native
}
