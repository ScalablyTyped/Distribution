package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelSelector extends StObject {
  
  /** Resource labels for this selector. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientGameservices.maximMazurokGapiClientGameservicesStrings.LabelSelector with TopLevel[js.Any]
  ] = js.native
}
object LabelSelector {
  
  @scala.inline
  def apply(): LabelSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelSelector]
  }
  
  @scala.inline
  implicit class LabelSelectorMutableBuilder[Self <: LabelSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientGameservices.maximMazurokGapiClientGameservicesStrings.LabelSelector with TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
  }
}
