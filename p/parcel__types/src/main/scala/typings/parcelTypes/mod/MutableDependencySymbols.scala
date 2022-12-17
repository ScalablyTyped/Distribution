package typings.parcelTypes.mod

import typings.parcelTypes.anon.IsWeak
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MutableDependencySymbols
  extends StObject
     with Iterable[js.Tuple2[Symbol, IsWeak]] {
  
  def delete(exportSymbol: Symbol): Unit = js.native
  
  /**
    * Initilizes the map, sets isCleared to false.
    */
  def ensure(): Unit = js.native
  
  def exportSymbols(): js.Iterable[Symbol] = js.native
  
  def get(exportSymbol: Symbol): js.UndefOr[IsWeak | Null] = js.native
  
  def hasExportSymbol(exportSymbol: Symbol): Boolean = js.native
  
  def hasLocalSymbol(local: Symbol): Boolean = js.native
  
  /**
    * The symbols taht are imports are unknown, rather than just empty.
    * This is the default state.
    */
  val isCleared: Boolean = js.native
  
  def set(exportSymbol: Symbol, local: Symbol): Unit = js.native
  def set(exportSymbol: Symbol, local: Symbol, loc: Null, isWeak: Boolean): Unit = js.native
  def set(exportSymbol: Symbol, local: Symbol, loc: Unit, isWeak: Boolean): Unit = js.native
  def set(exportSymbol: Symbol, local: Symbol, loc: SourceLocation): Unit = js.native
  def set(exportSymbol: Symbol, local: Symbol, loc: SourceLocation, isWeak: Boolean): Unit = js.native
}
