package typings.plottable

import typings.d3Shape.mod.Symbol_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object symbolFactoriesMod {
  
  @JSImport("plottable/build/src/core/symbolFactories", "circle")
  @js.native
  def circle(): SymbolFactory = js.native
  
  @JSImport("plottable/build/src/core/symbolFactories", "cross")
  @js.native
  def cross(): SymbolFactory = js.native
  
  @JSImport("plottable/build/src/core/symbolFactories", "diamond")
  @js.native
  def diamond(): SymbolFactory = js.native
  
  @JSImport("plottable/build/src/core/symbolFactories", "square")
  @js.native
  def square(): SymbolFactory = js.native
  
  @JSImport("plottable/build/src/core/symbolFactories", "star")
  @js.native
  def star(): SymbolFactory = js.native
  
  @JSImport("plottable/build/src/core/symbolFactories", "triangle")
  @js.native
  def triangle(): SymbolFactory = js.native
  
  @JSImport("plottable/build/src/core/symbolFactories", "wye")
  @js.native
  def wye(): SymbolFactory = js.native
  
  type SymbolFactory = js.Function1[/* symbolSize */ Double, Symbol_[js.Any, js.Any]]
}
