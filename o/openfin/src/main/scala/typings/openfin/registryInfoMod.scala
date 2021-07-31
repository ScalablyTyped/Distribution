package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registryInfoMod {
  
  trait RegistryInfo extends StObject {
    
    var data: js.Any
    
    var rootKey: String
    
    var subkey: String
    
    var `type`: String
    
    var value: String
  }
  object RegistryInfo {
    
    @scala.inline
    def apply(data: js.Any, rootKey: String, subkey: String, `type`: String, value: String): RegistryInfo = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], rootKey = rootKey.asInstanceOf[js.Any], subkey = subkey.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegistryInfo]
    }
    
    @scala.inline
    implicit class RegistryInfoMutableBuilder[Self <: RegistryInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootKey(value: String): Self = StObject.set(x, "rootKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubkey(value: String): Self = StObject.set(x, "subkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
