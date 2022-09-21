package typings.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MutableAssetSymbols
  extends StObject
     with AssetSymbols {
  
  def delete(exportSymbol: Symbol): Unit = js.native
  
  /**
    * Initilizes the map, sets isCleared to false.
    */
  def ensure(): Unit = js.native
  
  def set(exportSymbol: Symbol, local: Symbol): Unit = js.native
  def set(exportSymbol: Symbol, local: Symbol, loc: Null, meta: Meta): Unit = js.native
  def set(exportSymbol: Symbol, local: Symbol, loc: Unit, meta: Meta): Unit = js.native
  def set(exportSymbol: Symbol, local: Symbol, loc: SourceLocation): Unit = js.native
  def set(exportSymbol: Symbol, local: Symbol, loc: SourceLocation, meta: Meta): Unit = js.native
}
