package typings.micromark.libSharedTypesMod

import typings.micromark.constantTypesMod.Type
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.micromark.anon.EnterRecord
  - typings.micromark.anon.ExitRecord
*/
trait HtmlExtension extends js.Object
object HtmlExtension {
  
  @scala.inline
  def EnterRecord(enter: Record[Type, js.Function0[Unit]]): HtmlExtension = {
    val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlExtension]
  }
  
  @scala.inline
  def ExitRecord(exit: Record[Type, js.Function0[Unit]]): HtmlExtension = {
    val __obj = js.Dynamic.literal(exit = exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlExtension]
  }
}
