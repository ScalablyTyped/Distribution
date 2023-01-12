package typings.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportSymbolResolution
  extends StObject
     with SymbolResolution {
  
  val exportAs: Symbol | String
}
object ExportSymbolResolution {
  
  inline def apply(asset: Asset, exportAs: Symbol | String, exportSymbol: Symbol | String): ExportSymbolResolution = {
    val __obj = js.Dynamic.literal(asset = asset.asInstanceOf[js.Any], exportAs = exportAs.asInstanceOf[js.Any], exportSymbol = exportSymbol.asInstanceOf[js.Any], symbol = null)
    __obj.asInstanceOf[ExportSymbolResolution]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportSymbolResolution] (val x: Self) extends AnyVal {
    
    inline def setExportAs(value: Symbol | String): Self = StObject.set(x, "exportAs", value.asInstanceOf[js.Any])
  }
}
