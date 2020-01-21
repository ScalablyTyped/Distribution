package typings.plottable

import typings.d3Shape.mod.Symbol_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/core/symbolFactories", JSImport.Namespace)
@js.native
object symbolFactoriesMod extends js.Object {
  def circle(): SymbolFactory = js.native
  def cross(): SymbolFactory = js.native
  def diamond(): SymbolFactory = js.native
  def square(): SymbolFactory = js.native
  def star(): SymbolFactory = js.native
  def triangle(): SymbolFactory = js.native
  def wye(): SymbolFactory = js.native
  type SymbolFactory = js.Function1[/* symbolSize */ Double, Symbol_[js.Any, js.Any]]
}

