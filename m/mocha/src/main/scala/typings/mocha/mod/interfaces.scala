package typings.mocha.mod

import typings.mocha.Mocha.Suite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaces {
  
  @JSImport("mocha", "interfaces.bdd")
  @js.native
  def bdd(suite: Suite): Unit = js.native
  
  @JSImport("mocha", "interfaces.exports")
  @js.native
  def exports(suite: Suite): Unit = js.native
  
  @JSImport("mocha", "interfaces.qunit")
  @js.native
  def qunit(suite: Suite): Unit = js.native
  
  @JSImport("mocha", "interfaces.tdd")
  @js.native
  def tdd(suite: Suite): Unit = js.native
}
