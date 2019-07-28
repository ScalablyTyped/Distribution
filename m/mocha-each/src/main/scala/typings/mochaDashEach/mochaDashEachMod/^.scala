package typings.mochaDashEach.mochaDashEachMod

import typings.mocha.MochaNs.ITestDefinition
import typings.mochaDashEach.Anon_It
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
  def apply(parameters: js.Array[_]): Anon_It = js.native
  def apply(parameters: js.Array[_], defaultIt: ITestDefinition): Anon_It = js.native
}

