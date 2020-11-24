package typings.micromark.sharedTypesMod

import typings.micromark.typesMod.Type
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.micromark.anon.Enter
  - typings.micromark.anon.Exit
*/
trait HtmlExtension extends js.Object
object HtmlExtension {
  
  @scala.inline
  def Enter(enter: Record[Type, js.Function0[Unit]]): HtmlExtension = {
    val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlExtension]
  }
  
  @scala.inline
  def Exit(exit: Record[Type, js.Function0[Unit]]): HtmlExtension = {
    val __obj = js.Dynamic.literal(exit = exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlExtension]
  }
}
