package typings.mendixmodelsdk.deltasDeltasMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.CREATE_UNIT_TREE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICreateUnitTreeDelta
  extends StObject
     with IDelta
     with Delta {
  
  /**
    * The ID of the containing unit.
    * (This relates to the project tree.)
    */
  var containerId: String
  
  /**
    * The name of the property of the containing unit which will contain the unit-to-create.
    * (This relates to the project tree.)
    */
  var containmentName: String
  
  /**
    * The qualified name of the type of unit to create.
    */
  var contentType: String
  
  var deltaType: CREATE_UNIT_TREE
  
  /**
    * The JSON of the unit tree to create.
    */
  var unitTree: IStructureJSON
}
object ICreateUnitTreeDelta {
  
  @scala.inline
  def apply(
    containerId: String,
    containmentName: String,
    contentType: String,
    unitId: String,
    unitTree: IStructureJSON
  ): ICreateUnitTreeDelta = {
    val __obj = js.Dynamic.literal(containerId = containerId.asInstanceOf[js.Any], containmentName = containmentName.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], deltaType = "CREATE_UNIT_TREE", unitId = unitId.asInstanceOf[js.Any], unitTree = unitTree.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateUnitTreeDelta]
  }
  
  @scala.inline
  implicit class ICreateUnitTreeDeltaMutableBuilder[Self <: ICreateUnitTreeDelta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainmentName(value: String): Self = StObject.set(x, "containmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaType(value: CREATE_UNIT_TREE): Self = StObject.set(x, "deltaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitTree(value: IStructureJSON): Self = StObject.set(x, "unitTree", value.asInstanceOf[js.Any])
  }
}
