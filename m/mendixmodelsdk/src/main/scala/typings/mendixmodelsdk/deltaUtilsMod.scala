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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deltaUtilsMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/deltas/deltaUtils", "asModelUnit")
  @js.native
  def asModelUnit(unit: IAbstractUnit, delta: Delta): ModelUnit[IAbstractModel] = js.native
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/deltas/deltaUtils", "checkInsertionIndex")
  @js.native
  def checkInsertionIndex(index: Double, property: AbstractProperty[js.Array[_], _]): Unit = js.native
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/deltas/deltaUtils", "checkMutator")
  @js.native
  def checkMutator(mutator: Mutator, property: AbstractProperty[_, _]): Unit = js.native
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/deltas/deltaUtils", "checkUpdateOrRemovalIndex")
  @js.native
  def checkUpdateOrRemovalIndex(index: Double, property: AbstractProperty[js.Array[_], _]): Unit = js.native
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/deltas/deltaUtils", "findElement")
  @js.native
  def findElement(model: AbstractModel, unit: ModelUnit[IAbstractModel], elementId: String): (AbstractElement[IAbstractModel, Container]) | Null = js.native
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/deltas/deltaUtils", "getContainmentInfo")
  @js.native
  def getContainmentInfo(unit: ModelUnit[IAbstractModel], model: AbstractModel, elementId: String): IContainmentInfo = js.native
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/deltas/deltaUtils", "getElement")
  @js.native
  def getElement(model: AbstractModel, unit: ModelUnit[IAbstractModel], elementId: String): AbstractElement[IAbstractModel, Container] = js.native
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/deltas/deltaUtils", "getElementNotFoundError")
  @js.native
  def getElementNotFoundError(unit: ModelUnit[IAbstractModel], elementId: String): Error = js.native
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/deltas/deltaUtils", "getProperty")
  @js.native
  def getProperty(structure: IStructure, propertyName: String): AbstractProperty[_, _] = js.native
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/deltas/deltaUtils", "getUnit")
  @js.native
  def getUnit(model: AbstractModel, unitId: String): IAbstractUnit = js.native
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/deltas/deltaUtils", "isListProperty")
  @js.native
  def isListProperty(property: AbstractProperty[_, _]): /* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/properties.AbstractProperty<std.Array<any>, any> */ Boolean = js.native
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/deltas/deltaUtils", "rawList")
  @js.native
  def rawList(property: AbstractProperty[js.Array[_], _]): js.Array[_] = js.native
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/deltas/deltaUtils", "rawValue")
  @js.native
  def rawValue(property: AbstractProperty[_, _]): js.Any = js.native
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/deltas/deltaUtils", "removeUselessDeltas")
  @js.native
  def removeUselessDeltas(deltas: js.Array[Delta]): js.Array[Delta] = js.native
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/deltas/deltaUtils", "updateStructure")
  @js.native
  def updateStructure(
    structure: Structure[IAbstractModel, IContainer | Null],
    isReverting: Boolean,
    updateAction: js.Function0[Unit]
  ): Unit = js.native
  
  @js.native
  trait IContainmentInfo extends StObject {
    
    var element: AbstractElement[IAbstractModel, Container] = js.native
    
    var index: js.UndefOr[Double] = js.native
    
    var parentId: String = js.native
    
    var parentPropertyName: String = js.native
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
