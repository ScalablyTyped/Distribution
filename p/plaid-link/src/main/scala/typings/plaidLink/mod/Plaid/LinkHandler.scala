package typings.plaidLink.mod.Plaid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkHandler extends js.Object {
  
  def destroy(): Unit = js.native
  
  def exit(): Unit = js.native
  def exit(options: ExitOptions): Unit = js.native
  
  var institutions: js.Array[Institution] = js.native
  
  def open(): Unit = js.native
}
