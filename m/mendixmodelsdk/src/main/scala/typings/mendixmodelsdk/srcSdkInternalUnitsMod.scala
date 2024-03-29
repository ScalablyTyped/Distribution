package typings.mendixmodelsdk

import org.scalablytyped.runtime.Instantiable1
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.InstanceConstructor
import typings.mendixmodelsdk.srcSdkInternalPropertiesAbstractPropertyMod.AbstractProperty
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.Structure
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalUnitsMod {
  
  /* note: abstract class */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
  - typings.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit because var conflicts: container, id, isLoaded, model, structureTypeName, unit. Inlined isLoadable, isReadOnly */ @JSImport("mendixmodelsdk/src/sdk/internal/units", "AbstractUnit")
  @js.native
  open class AbstractUnit[TModel /* <: IAbstractModel */] protected () extends Structure[TModel, StructuralUnit[IAbstractModel]] {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IStructuralUnit
    ) = this()
    
    def deepCopyInto(newParent: IStructuralUnit): AbstractUnit[IAbstractModel] = js.native
    
    def isLoadable: Boolean = js.native
    /**
      * Whether this unit and all of its children (recursively) can be loaded.
      */
    @JSName("isLoadable")
    val isLoadable_FAbstractUnit: Boolean = js.native
    
    /**
      * Checks whether all attributes are available at this instant;
      * if false, a load is required to access these properties.
      */
    @JSName("isLoaded")
    def isLoaded_MAbstractUnit: Boolean = js.native
    
    def isReadOnly: Boolean = js.native
    /**
      * Whether this unit and all of its children (recursively) are editable.
      */
    @JSName("isReadOnly")
    val isReadOnly_FAbstractUnit: Boolean = js.native
  }
  
  /* note: abstract class */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
  - typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
  - typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
  - typings.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined isLoadable, isReadOnly
  - typings.mendixmodelsdk.srcSdkInternalUnitsMod.IModelUnit because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/sdk/internal/units", "ModelUnit")
  @js.native
  open class ModelUnit[TModel /* <: IAbstractModel */] protected () extends AbstractElement[TModel, StructuralUnit[IAbstractModel]] {
    def this(model: AbstractModel, structureTypeName: String, id: String, isPartial: Boolean) = this()
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IStructuralUnit
    ) = this()
    
    def isLoadable: Boolean = js.native
    /**
      * Whether this unit and all of its children (recursively) can be loaded.
      */
    @JSName("isLoadable")
    val isLoadable_FModelUnit: Boolean = js.native
    
    @JSName("isLoaded")
    def isLoaded_MModelUnit: Boolean = js.native
    
    def isReadOnly: Boolean = js.native
    /**
      * Whether this unit and all of its children (recursively) are editable.
      */
    @JSName("isReadOnly")
    val isReadOnly_FModelUnit: Boolean = js.native
    
    @JSName("unit")
    def unit_MModelUnit: this.type = js.native
  }
  
  /* note: abstract class */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
  - typings.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit because Already inherited
  - typings.mendixmodelsdk.srcSdkInternalUnitsMod.IStructuralUnit because var conflicts: id, isLoadable, isLoaded, isReadOnly, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/sdk/internal/units", "StructuralUnit")
  @js.native
  open class StructuralUnit[TModel /* <: IAbstractModel */] protected ()
    extends AbstractUnit[TModel]
       with IContainer {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      _ignoredIsPartial: Boolean,
      container: IStructuralUnit
    ) = this()
    
    @JSName("unit")
    def unit_MStructuralUnit: this.type = js.native
  }
  
  trait IAbstractUnit
    extends StObject
       with IStructure {
    
    /**
      * The parent unit of this unit.
      */
    @JSName("container")
    val container_IAbstractUnit: IStructuralUnit
    
    /**
      * Deletes the unit from the model
      */
    def delete(): Unit
    
    /**
      * Whether this unit and all of its children (recursively) can be loaded.
      */
    val isLoadable: Boolean
    
    /**
      * Whether this unit and all of its children (recursively) are editable.
      */
    val isReadOnly: Boolean
  }
  object IAbstractUnit {
    
    inline def apply(
      allProperties: () => js.Array[AbstractProperty[Any, Any]],
      container: IStructuralUnit,
      delete: () => Unit,
      id: String,
      isLoadable: Boolean,
      isLoaded: Boolean,
      isReadOnly: Boolean,
      loadedProperties: () => js.Array[AbstractProperty[Any, Any]],
      model: IAbstractModel,
      publicProperties: () => js.Array[AbstractProperty[Any, Any]],
      structureTypeName: String,
      toJSON: () => js.Object,
      traverse: js.Function1[IAbstractUnit, Unit] => Unit,
      traverseFind: js.Function1[IAbstractUnit, Any] => Any | Null,
      traversePublicParts: js.Function1[IAbstractUnit, Unit] => Unit,
      unit: IAbstractUnit
    ): IAbstractUnit = {
      val __obj = js.Dynamic.literal(allProperties = js.Any.fromFunction0(allProperties), container = container.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), id = id.asInstanceOf[js.Any], isLoadable = isLoadable.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], loadedProperties = js.Any.fromFunction0(loadedProperties), model = model.asInstanceOf[js.Any], publicProperties = js.Any.fromFunction0(publicProperties), structureTypeName = structureTypeName.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), traverse = js.Any.fromFunction1(traverse), traverseFind = js.Any.fromFunction1(traverseFind), traversePublicParts = js.Any.fromFunction1(traversePublicParts), unit = unit.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAbstractUnit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAbstractUnit] (val x: Self) extends AnyVal {
      
      inline def setContainer(value: IStructuralUnit): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setDelete(value: () => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
      
      inline def setIsLoadable(value: Boolean): Self = StObject.set(x, "isLoadable", value.asInstanceOf[js.Any])
      
      inline def setIsReadOnly(value: Boolean): Self = StObject.set(x, "isReadOnly", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IAbstractUnitConstructor
    extends StObject
       with Instantiable1[
          /* args (repeated) */ Any, 
          ModelUnit[IAbstractModel] | StructuralUnit[IAbstractModel]
        ]
       with InstanceConstructor
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
  - typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined load, load, load, load, asLoaded, findElementById */ @js.native
  trait IModelUnit
    extends StObject
       with IAbstractUnit
       with IContainer {
    
    def asLoaded(): IAbstractElement = js.native
    
    def findElementById(id: String): IAbstractElement | Null = js.native
    
    def load(): js.Promise[IAbstractElement] = js.native
    def load(callback: js.Function1[/* element */ this.type, Unit]): Unit = js.native
    def load(callback: js.Function1[/* element */ this.type, Unit], forceRefresh: Boolean): Unit = js.native
    def load(forceRefresh: Boolean): js.Promise[IAbstractElement] = js.native
  }
  
  trait IStructuralUnit
    extends StObject
       with IAbstractUnit
       with IContainer
  object IStructuralUnit {
    
    inline def apply(
      allProperties: () => js.Array[AbstractProperty[Any, Any]],
      container: IStructuralUnit,
      delete: () => Unit,
      id: String,
      isLoadable: Boolean,
      isLoaded: Boolean,
      isReadOnly: Boolean,
      loadedProperties: () => js.Array[AbstractProperty[Any, Any]],
      model: IAbstractModel,
      publicProperties: () => js.Array[AbstractProperty[Any, Any]],
      structureTypeName: String,
      toJSON: () => js.Object,
      traverse: js.Function1[IStructuralUnit, Unit] => Unit,
      traverseFind: js.Function1[IStructuralUnit, Any] => Any | Null,
      traversePublicParts: js.Function1[IStructuralUnit, Unit] => Unit,
      unit: IAbstractUnit
    ): IStructuralUnit = {
      val __obj = js.Dynamic.literal(allProperties = js.Any.fromFunction0(allProperties), container = container.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), id = id.asInstanceOf[js.Any], isLoadable = isLoadable.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], loadedProperties = js.Any.fromFunction0(loadedProperties), model = model.asInstanceOf[js.Any], publicProperties = js.Any.fromFunction0(publicProperties), structureTypeName = structureTypeName.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), traverse = js.Any.fromFunction1(traverse), traverseFind = js.Any.fromFunction1(traverseFind), traversePublicParts = js.Any.fromFunction1(traversePublicParts), unit = unit.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStructuralUnit]
    }
  }
}
