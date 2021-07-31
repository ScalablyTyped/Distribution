package typings.mendixmodelsdk.transportInterfacesMod

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
  
  @scala.inline
  def apply($ID: String, $Type: String, containerId: String, containmentName: String): IAbstractUnitJson = {
    val __obj = js.Dynamic.literal($ID = $ID.asInstanceOf[js.Any], $Type = $Type.asInstanceOf[js.Any], containerId = containerId.asInstanceOf[js.Any], containmentName = containmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAbstractUnitJson]
  }
  
  @scala.inline
  implicit class IAbstractUnitJsonMutableBuilder[Self <: IAbstractUnitJson] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainmentName(value: String): Self = StObject.set(x, "containmentName", value.asInstanceOf[js.Any])
  }
}
