package typings.plaidLink.mod.Plaid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkHandler extends StObject {
  
  def destroy(): Unit = js.native
  
  def exit(): Unit = js.native
  def exit(options: ExitOptions): Unit = js.native
  
  var institutions: js.Array[Institution] = js.native
  
  def open(): Unit = js.native
}
