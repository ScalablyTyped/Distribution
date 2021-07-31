package typings.plottable

import typings.d3Shape.mod.Symbol_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object symbolFactoriesMod {
  
  @JSImport("plottable/build/src/core/symbolFactories", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def circle(): SymbolFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("circle")().asInstanceOf[SymbolFactory]
  
  @scala.inline
  def cross(): SymbolFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("cross")().asInstanceOf[SymbolFactory]
  
  @scala.inline
  def diamond(): SymbolFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("diamond")().asInstanceOf[SymbolFactory]
  
  @scala.inline
  def square(): SymbolFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("square")().asInstanceOf[SymbolFactory]
  
  @scala.inline
  def star(): SymbolFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("star")().asInstanceOf[SymbolFactory]
  
  @scala.inline
  def triangle(): SymbolFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("triangle")().asInstanceOf[SymbolFactory]
  
  @scala.inline
  def wye(): SymbolFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("wye")().asInstanceOf[SymbolFactory]
  
  type SymbolFactory = js.Function1[/* symbolSize */ Double, Symbol_[js.Any, js.Any]]
}
