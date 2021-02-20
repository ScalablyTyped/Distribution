package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchInstanceFilterGroupLabel extends StObject {
  
  /** Compute Engine instance labels that must be present for a VM instance to be targeted by this filter. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientOsconfig.maximMazurokGapiClientOsconfigStrings.PatchInstanceFilterGroupLabel with TopLevel[js.Any]
  ] = js.native
}
object PatchInstanceFilterGroupLabel {
  
  @scala.inline
  def apply(): PatchInstanceFilterGroupLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchInstanceFilterGroupLabel]
  }
  
  @scala.inline
  implicit class PatchInstanceFilterGroupLabelMutableBuilder[Self <: PatchInstanceFilterGroupLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientOsconfig.maximMazurokGapiClientOsconfigStrings.PatchInstanceFilterGroupLabel with TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
  }
}
