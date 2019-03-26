package typings
package mochaDashEachLib.mochaDashEachMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mocha-each", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * This function takes an array collections of parameters to be used in
    * a series of mocha tests, defined using the `it` notation common to
    * Mocha.
    */
  def apply(parameters: js.Array[_]): mochaDashEachLib.Anon_It = js.native
  def apply(parameters: js.Array[_], defaultIt: mochaLib.MochaNs.ITestDefinition): mochaDashEachLib.Anon_It = js.native
}

