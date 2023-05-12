package typings.mongodbClientEncryption.mod

import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataKey extends StObject {
  
  var _id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Binary */ Any
  
  var creationDate: js.Date
  
  var keyAltNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var keyMaterial: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Binary */ Any
  
  var masterKey: Document
  
  var status: Double
  
  var updateDate: js.Date
  
  var version: js.UndefOr[Double] = js.undefined
}
object DataKey {
  
  inline def apply(
    _id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Binary */ Any,
    creationDate: js.Date,
    keyMaterial: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Binary */ Any,
    masterKey: Document,
    status: Double,
    updateDate: js.Date
  ): DataKey = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], keyMaterial = keyMaterial.asInstanceOf[js.Any], masterKey = masterKey.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], updateDate = updateDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataKey] (val x: Self) extends AnyVal {
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setKeyAltNames(value: js.Array[String]): Self = StObject.set(x, "keyAltNames", value.asInstanceOf[js.Any])
    
    inline def setKeyAltNamesUndefined: Self = StObject.set(x, "keyAltNames", js.undefined)
    
    inline def setKeyAltNamesVarargs(value: String*): Self = StObject.set(x, "keyAltNames", js.Array(value*))
    
    inline def setKeyMaterial(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Binary */ Any
    ): Self = StObject.set(x, "keyMaterial", value.asInstanceOf[js.Any])
    
    inline def setMasterKey(value: Document): Self = StObject.set(x, "masterKey", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUpdateDate(value: js.Date): Self = StObject.set(x, "updateDate", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_id(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Binary */ Any
    ): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
