package typings.node.eventsMod

import typings.node.anon.Once
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMEventTarget extends js.Object {
  
  def addEventListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): js.Any = js.native
  def addEventListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit], opts: Once): js.Any = js.native
}
