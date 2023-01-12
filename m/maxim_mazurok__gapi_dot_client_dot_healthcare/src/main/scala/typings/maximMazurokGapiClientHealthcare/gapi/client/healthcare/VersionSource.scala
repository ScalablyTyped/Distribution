package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VersionSource extends StObject {
  
  /** The field to extract from the MSH segment. For example, "3.1" or "18[1].1". */
  var mshField: js.UndefOr[String] = js.undefined
  
  /** The value to match with the field. For example, "My Application Name" or "2.3". */
  var value: js.UndefOr[String] = js.undefined
}
object VersionSource {
  
  inline def apply(): VersionSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VersionSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VersionSource] (val x: Self) extends AnyVal {
    
    inline def setMshField(value: String): Self = StObject.set(x, "mshField", value.asInstanceOf[js.Any])
    
    inline def setMshFieldUndefined: Self = StObject.set(x, "mshField", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
