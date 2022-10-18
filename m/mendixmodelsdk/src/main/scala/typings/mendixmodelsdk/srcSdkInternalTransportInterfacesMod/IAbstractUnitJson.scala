package typings.mendixmodelsdk.srcSdkInternalTransportInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAbstractUnitJson
  extends StObject
     with IStructureJson {
  
  var containerId: String
  
  var containmentName: String
}
object IAbstractUnitJson {
  
  inline def apply($ID: String, $Type: String, containerId: String, containmentName: String): IAbstractUnitJson = {
    val __obj = js.Dynamic.literal($ID = $ID.asInstanceOf[js.Any], $Type = $Type.asInstanceOf[js.Any], containerId = containerId.asInstanceOf[js.Any], containmentName = containmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAbstractUnitJson]
  }
  
  extension [Self <: IAbstractUnitJson](x: Self) {
    
    inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setContainmentName(value: String): Self = StObject.set(x, "containmentName", value.asInstanceOf[js.Any])
  }
}
