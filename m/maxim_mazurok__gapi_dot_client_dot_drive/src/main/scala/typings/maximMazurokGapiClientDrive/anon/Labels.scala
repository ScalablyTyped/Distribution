package typings.maximMazurokGapiClientDrive.anon

import typings.maximMazurokGapiClientDrive.gapi.client.drive.Label
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Labels extends StObject {
  
  /** The set of labels on the file as requested by the label IDs in the includeLabels parameter. By default, no labels are returned. */
  var labels: js.UndefOr[js.Array[Label]] = js.undefined
}
object Labels {
  
  inline def apply(): Labels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Labels]
  }
  
  extension [Self <: Labels](x: Self) {
    
    inline def setLabels(value: js.Array[Label]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: Label*): Self = StObject.set(x, "labels", js.Array(value*))
  }
}
