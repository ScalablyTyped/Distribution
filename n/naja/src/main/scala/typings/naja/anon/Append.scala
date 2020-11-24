package typings.naja.anon

import typings.naja.snippetHandlerMod.SnippetUpdateOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Append extends js.Object {
  
  def append(snippet: typings.std.Element, content: String): Unit = js.native
  @JSName("append")
  var append_Original: SnippetUpdateOperation = js.native
  
  def prepend(snippet: typings.std.Element, content: String): Unit = js.native
  @JSName("prepend")
  var prepend_Original: SnippetUpdateOperation = js.native
  
  def replace(snippet: typings.std.Element, content: String): Unit = js.native
  @JSName("replace")
  var replace_Original: SnippetUpdateOperation = js.native
}
