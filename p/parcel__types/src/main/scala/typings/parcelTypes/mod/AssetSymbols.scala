package typings.parcelTypes.mod

import typings.parcelTypes.anon.Loc
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetSymbols
  extends StObject
     with Iterable[js.Tuple2[Symbol, Loc]] {
  
  def exportSymbols(): js.Iterable[Symbol] = js.native
  
  def get(exportSymbol: Symbol): js.UndefOr[Loc | Null] = js.native
  
  def hasExportSymbol(exportSymbol: Symbol): Boolean = js.native
  
  def hasLocalSymbol(local: Symbol): Boolean = js.native
  
  /**
    * The exports of the asset are unknown, rather than just empty.
    * This is the default state.
    */
  val isCleared: Boolean = js.native
}
