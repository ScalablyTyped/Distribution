package typings.photoshop.domCoreModulesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLayerParentOptions extends StObject {
  
  var documentID: Double
  
  var layerID: Double
}
object GetLayerParentOptions {
  
  inline def apply(documentID: Double, layerID: Double): GetLayerParentOptions = {
    val __obj = js.Dynamic.literal(documentID = documentID.asInstanceOf[js.Any], layerID = layerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLayerParentOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLayerParentOptions] (val x: Self) extends AnyVal {
    
    inline def setDocumentID(value: Double): Self = StObject.set(x, "documentID", value.asInstanceOf[js.Any])
    
    inline def setLayerID(value: Double): Self = StObject.set(x, "layerID", value.asInstanceOf[js.Any])
  }
}
