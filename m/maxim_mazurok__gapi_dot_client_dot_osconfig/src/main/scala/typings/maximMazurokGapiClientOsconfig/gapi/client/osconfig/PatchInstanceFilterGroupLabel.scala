package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchInstanceFilterGroupLabel extends js.Object {
  
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
  implicit class PatchInstanceFilterGroupLabelOps[Self <: PatchInstanceFilterGroupLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientOsconfig.maximMazurokGapiClientOsconfigStrings.PatchInstanceFilterGroupLabel with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
  }
}
