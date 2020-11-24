package typings.mocha.mod

import typings.mocha.Mocha.Suite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mocha", "interfaces")
@js.native
object interfaces extends js.Object {
  
  def bdd(suite: Suite): Unit = js.native
  
  def exports(suite: Suite): Unit = js.native
  
  def qunit(suite: Suite): Unit = js.native
  
  def tdd(suite: Suite): Unit = js.native
}
