package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexedHotKey extends StObject {
  
  /**
    * A (sparse) mapping from key bucket index to the index of the specific hot row key for that key bucket. The index of the hot row key can be translated to the actual row key via the
    * ScanData.VisualizationData.indexed_keys repeated field.
    */
  var sparseHotKeys: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: number} */ js.Any
  ] = js.undefined
}
object IndexedHotKey {
  
  inline def apply(): IndexedHotKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexedHotKey]
  }
  
  extension [Self <: IndexedHotKey](x: Self) {
    
    inline def setSparseHotKeys(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: number} */ js.Any
    ): Self = StObject.set(x, "sparseHotKeys", value.asInstanceOf[js.Any])
    
    inline def setSparseHotKeysUndefined: Self = StObject.set(x, "sparseHotKeys", js.undefined)
  }
}
