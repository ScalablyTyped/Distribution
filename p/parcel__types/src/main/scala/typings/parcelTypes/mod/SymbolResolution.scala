package typings.parcelTypes.mod

import typings.parcelTypes.parcelTypesBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SymbolResolution extends StObject {
  
  /** The Asset which exports the symbol. */
  val asset: Asset
  
  /** under which name the symbol is exported */
  val exportSymbol: Symbol | String
  
  /** The location of the specifier that lead to this result. */
  val loc: js.UndefOr[SourceLocation | Null] = js.undefined
  
  /** The identifier under which the symbol can be referenced. */
  val symbol: Unit | Null | `false` | Symbol
}
object SymbolResolution {
  
  inline def apply(asset: Asset, exportSymbol: Symbol | String): SymbolResolution = {
    val __obj = js.Dynamic.literal(asset = asset.asInstanceOf[js.Any], exportSymbol = exportSymbol.asInstanceOf[js.Any], symbol = null)
    __obj.asInstanceOf[SymbolResolution]
  }
  
  extension [Self <: SymbolResolution](x: Self) {
    
    inline def setAsset(value: Asset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    inline def setExportSymbol(value: Symbol | String): Self = StObject.set(x, "exportSymbol", value.asInstanceOf[js.Any])
    
    inline def setLoc(value: SourceLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setSymbol(value: Unit | `false` | Symbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolNull: Self = StObject.set(x, "symbol", null)
  }
}
