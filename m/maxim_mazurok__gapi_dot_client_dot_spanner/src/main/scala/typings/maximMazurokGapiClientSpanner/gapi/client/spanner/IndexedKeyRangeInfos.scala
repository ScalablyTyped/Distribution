package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexedKeyRangeInfos extends StObject {
  
  /** A (sparse) mapping from key bucket index to the KeyRangeInfos for that key bucket. */
  var keyRangeInfos: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.spanner.gapi.client.spanner.KeyRangeInfos} */ js.Any
  ] = js.undefined
}
object IndexedKeyRangeInfos {
  
  inline def apply(): IndexedKeyRangeInfos = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexedKeyRangeInfos]
  }
  
  extension [Self <: IndexedKeyRangeInfos](x: Self) {
    
    inline def setKeyRangeInfos(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.spanner.gapi.client.spanner.KeyRangeInfos} */ js.Any
    ): Self = StObject.set(x, "keyRangeInfos", value.asInstanceOf[js.Any])
    
    inline def setKeyRangeInfosUndefined: Self = StObject.set(x, "keyRangeInfos", js.undefined)
  }
}
