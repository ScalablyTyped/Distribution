package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchInstanceFilterGroupLabel extends StObject {
  
  /** Compute Engine instance labels that must be present for a VM instance to be targeted by this filter. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
}
object PatchInstanceFilterGroupLabel {
  
  inline def apply(): PatchInstanceFilterGroupLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchInstanceFilterGroupLabel]
  }
  
  extension [Self <: PatchInstanceFilterGroupLabel](x: Self) {
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
  }
}
