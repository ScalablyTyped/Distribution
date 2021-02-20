package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceObjectReferences extends StObject {
  
  /** The references. */
  var references: js.UndefOr[js.Array[DataSourceObjectReference]] = js.native
}
object DataSourceObjectReferences {
  
  @scala.inline
  def apply(): DataSourceObjectReferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceObjectReferences]
  }
  
  @scala.inline
  implicit class DataSourceObjectReferencesMutableBuilder[Self <: DataSourceObjectReferences] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReferences(value: js.Array[DataSourceObjectReference]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
    
    @scala.inline
    def setReferencesVarargs(value: DataSourceObjectReference*): Self = StObject.set(x, "references", js.Array(value :_*))
  }
}
