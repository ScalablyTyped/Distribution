package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldReference extends StObject {
  
  var fieldPath: js.UndefOr[String] = js.native
}
object FieldReference {
  
  @scala.inline
  def apply(): FieldReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldReference]
  }
  
  @scala.inline
  implicit class FieldReferenceMutableBuilder[Self <: FieldReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldPath(value: String): Self = StObject.set(x, "fieldPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldPathUndefined: Self = StObject.set(x, "fieldPath", js.undefined)
  }
}
