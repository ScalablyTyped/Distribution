package typings.mendixmodelsdk

import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalDeltasDeltasMod.Delta
import typings.mendixmodelsdk.srcSdkInternalDeltasDeltasMod.Mutator
import typings.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalPropertiesMod.AbstractProperty
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.Structure
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer
import typings.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit
import typings.mendixmodelsdk.srcSdkInternalUnitsMod.ModelUnit
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalDeltasDeltaUtilsMod {
  
  @JSImport("mendixmodelsdk/src/sdk/internal/deltas/deltaUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mendixmodelsdk/src/sdk/internal/deltas/deltaUtils", "UnknownPropertyError")
  @js.native
  open class UnknownPropertyError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def asModelUnit(unit: IAbstractUnit, delta: Delta): ModelUnit[IAbstractModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("asModelUnit")(unit.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[ModelUnit[IAbstractModel]]
  
  inline def checkInsertionIndex(index: Double, property: AbstractProperty[js.Array[Any], Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkInsertionIndex")(index.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkMutator(mutator: Mutator, property: AbstractProperty[Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkMutator")(mutator.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkUpdateOrRemovalIndex(index: Double, property: AbstractProperty[js.Array[Any], Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkUpdateOrRemovalIndex")(index.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def findElement(model: AbstractModel, unit: ModelUnit[IAbstractModel], elementId: String): (AbstractElement[IAbstractModel, Container]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findElement")(model.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], elementId.asInstanceOf[js.Any])).asInstanceOf[(AbstractElement[IAbstractModel, Container]) | Null]
  
  inline def getContainmentInfo(unit: ModelUnit[IAbstractModel], model: AbstractModel, elementId: String): IContainmentInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getContainmentInfo")(unit.asInstanceOf[js.Any], model.asInstanceOf[js.Any], elementId.asInstanceOf[js.Any])).asInstanceOf[IContainmentInfo]
  
  inline def getElement(model: AbstractModel, unit: ModelUnit[IAbstractModel], elementId: String): AbstractElement[IAbstractModel, Container] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(model.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], elementId.asInstanceOf[js.Any])).asInstanceOf[AbstractElement[IAbstractModel, Container]]
  
  inline def getElementNotFoundError(unit: ModelUnit[IAbstractModel], elementId: String): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementNotFoundError")(unit.asInstanceOf[js.Any], elementId.asInstanceOf[js.Any])).asInstanceOf[js.Error]
  
  inline def getProperty(structure: IStructure, propertyName: String): AbstractProperty[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getProperty")(structure.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[AbstractProperty[Any, Any]]
  
  inline def getUnit(model: AbstractModel, unitId: String): IAbstractUnit = (^.asInstanceOf[js.Dynamic].applyDynamic("getUnit")(model.asInstanceOf[js.Any], unitId.asInstanceOf[js.Any])).asInstanceOf[IAbstractUnit]
  
  inline def isListProperty(property: AbstractProperty[Any, Any]): /* is mendixmodelsdk.mendixmodelsdk/src/sdk/internal/properties.AbstractProperty<std.Array<any>, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isListProperty")(property.asInstanceOf[js.Any]).asInstanceOf[/* is mendixmodelsdk.mendixmodelsdk/src/sdk/internal/properties.AbstractProperty<std.Array<any>, any> */ Boolean]
  
  inline def rawList(property: AbstractProperty[js.Array[Any], Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("rawList")(property.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def rawValue(property: AbstractProperty[Any, Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("rawValue")(property.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def removeUselessDeltas(deltas: js.Array[Delta]): js.Array[Delta] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeUselessDeltas")(deltas.asInstanceOf[js.Any]).asInstanceOf[js.Array[Delta]]
  
  inline def updateStructure(
    structure: Structure[IAbstractModel, IContainer | Null],
    isReverting: Boolean,
    updateAction: js.Function0[Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateStructure")(structure.asInstanceOf[js.Any], isReverting.asInstanceOf[js.Any], updateAction.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait IContainmentInfo extends StObject {
    
    var element: AbstractElement[IAbstractModel, Container]
    
    var index: js.UndefOr[Double] = js.undefined
    
    var parentId: String
    
    var parentPropertyName: String
  }
  object IContainmentInfo {
    
    inline def apply(element: AbstractElement[IAbstractModel, Container], parentId: String, parentPropertyName: String): IContainmentInfo = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], parentPropertyName = parentPropertyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[IContainmentInfo]
    }
    
    extension [Self <: IContainmentInfo](x: Self) {
      
      inline def setElement(value: AbstractElement[IAbstractModel, Container]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentPropertyName(value: String): Self = StObject.set(x, "parentPropertyName", value.asInstanceOf[js.Any])
    }
  }
}
