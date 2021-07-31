package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractModelMod.AbstractModel
import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.deltasDeltasMod.Delta
import typings.mendixmodelsdk.deltasDeltasMod.Mutator
import typings.mendixmodelsdk.elementsMod.AbstractElement
import typings.mendixmodelsdk.propertiesMod.AbstractProperty
import typings.mendixmodelsdk.structuresMod.IStructure
import typings.mendixmodelsdk.structuresMod.Structure
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.structuresMod.aliases.IContainer
import typings.mendixmodelsdk.unitsMod.IAbstractUnit
import typings.mendixmodelsdk.unitsMod.ModelUnit
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deltaUtilsMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/deltas/deltaUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def asModelUnit(unit: IAbstractUnit, delta: Delta): ModelUnit[IAbstractModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("asModelUnit")(unit.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[ModelUnit[IAbstractModel]]
  
  @scala.inline
  def checkInsertionIndex(index: Double, property: AbstractProperty[js.Array[js.Any], js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkInsertionIndex")(index.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def checkMutator(mutator: Mutator, property: AbstractProperty[js.Any, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkMutator")(mutator.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def checkUpdateOrRemovalIndex(index: Double, property: AbstractProperty[js.Array[js.Any], js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkUpdateOrRemovalIndex")(index.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def findElement(model: AbstractModel, unit: ModelUnit[IAbstractModel], elementId: String): (AbstractElement[IAbstractModel, Container]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findElement")(model.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], elementId.asInstanceOf[js.Any])).asInstanceOf[(AbstractElement[IAbstractModel, Container]) | Null]
  
  @scala.inline
  def getContainmentInfo(unit: ModelUnit[IAbstractModel], model: AbstractModel, elementId: String): IContainmentInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getContainmentInfo")(unit.asInstanceOf[js.Any], model.asInstanceOf[js.Any], elementId.asInstanceOf[js.Any])).asInstanceOf[IContainmentInfo]
  
  @scala.inline
  def getElement(model: AbstractModel, unit: ModelUnit[IAbstractModel], elementId: String): AbstractElement[IAbstractModel, Container] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(model.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], elementId.asInstanceOf[js.Any])).asInstanceOf[AbstractElement[IAbstractModel, Container]]
  
  @scala.inline
  def getElementNotFoundError(unit: ModelUnit[IAbstractModel], elementId: String): Error = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementNotFoundError")(unit.asInstanceOf[js.Any], elementId.asInstanceOf[js.Any])).asInstanceOf[Error]
  
  @scala.inline
  def getProperty(structure: IStructure, propertyName: String): AbstractProperty[js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getProperty")(structure.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[AbstractProperty[js.Any, js.Any]]
  
  @scala.inline
  def getUnit(model: AbstractModel, unitId: String): IAbstractUnit = (^.asInstanceOf[js.Dynamic].applyDynamic("getUnit")(model.asInstanceOf[js.Any], unitId.asInstanceOf[js.Any])).asInstanceOf[IAbstractUnit]
  
  @scala.inline
  def isListProperty(property: AbstractProperty[js.Any, js.Any]): /* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/properties.AbstractProperty<std.Array<any>, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isListProperty")(property.asInstanceOf[js.Any]).asInstanceOf[/* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/properties.AbstractProperty<std.Array<any>, any> */ Boolean]
  
  @scala.inline
  def rawList(property: AbstractProperty[js.Array[js.Any], js.Any]): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("rawList")(property.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  @scala.inline
  def rawValue(property: AbstractProperty[js.Any, js.Any]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("rawValue")(property.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def removeUselessDeltas(deltas: js.Array[Delta]): js.Array[Delta] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeUselessDeltas")(deltas.asInstanceOf[js.Any]).asInstanceOf[js.Array[Delta]]
  
  @scala.inline
  def updateStructure(
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
    
    @scala.inline
    def apply(element: AbstractElement[IAbstractModel, Container], parentId: String, parentPropertyName: String): IContainmentInfo = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], parentPropertyName = parentPropertyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[IContainmentInfo]
    }
    
    @scala.inline
    implicit class IContainmentInfoMutableBuilder[Self <: IContainmentInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: AbstractElement[IAbstractModel, Container]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentPropertyName(value: String): Self = StObject.set(x, "parentPropertyName", value.asInstanceOf[js.Any])
    }
  }
}
