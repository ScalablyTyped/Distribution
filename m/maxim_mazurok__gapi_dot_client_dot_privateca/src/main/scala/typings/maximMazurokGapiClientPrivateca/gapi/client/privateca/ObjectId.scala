package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectId extends StObject {
  
  /** Required. The parts of an OID path. The most significant parts of the path come first. */
  var objectIdPath: js.UndefOr[js.Array[Double]] = js.undefined
}
object ObjectId {
  
  @scala.inline
  def apply(): ObjectId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectId]
  }
  
  @scala.inline
  implicit class ObjectIdMutableBuilder[Self <: ObjectId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectIdPath(value: js.Array[Double]): Self = StObject.set(x, "objectIdPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdPathUndefined: Self = StObject.set(x, "objectIdPath", js.undefined)
    
    @scala.inline
    def setObjectIdPathVarargs(value: Double*): Self = StObject.set(x, "objectIdPath", js.Array(value :_*))
  }
}
