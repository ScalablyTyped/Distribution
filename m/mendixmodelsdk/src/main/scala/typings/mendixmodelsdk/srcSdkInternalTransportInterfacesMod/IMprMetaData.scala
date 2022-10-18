package typings.mendixmodelsdk.srcSdkInternalTransportInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMprMetaData extends StObject {
  
  /** docs:keep */ var _BuildVersion: String
  
  /** docs:keep */ var _ProductVersion: String
  
  /** docs:keep */ var _SchemaHash: String
}
object IMprMetaData {
  
  inline def apply(_BuildVersion: String, _ProductVersion: String, _SchemaHash: String): IMprMetaData = {
    val __obj = js.Dynamic.literal(_BuildVersion = _BuildVersion.asInstanceOf[js.Any], _ProductVersion = _ProductVersion.asInstanceOf[js.Any], _SchemaHash = _SchemaHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMprMetaData]
  }
  
  extension [Self <: IMprMetaData](x: Self) {
    
    inline def set_BuildVersion(value: String): Self = StObject.set(x, "_BuildVersion", value.asInstanceOf[js.Any])
    
    inline def set_ProductVersion(value: String): Self = StObject.set(x, "_ProductVersion", value.asInstanceOf[js.Any])
    
    inline def set_SchemaHash(value: String): Self = StObject.set(x, "_SchemaHash", value.asInstanceOf[js.Any])
  }
}
