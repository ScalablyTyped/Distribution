package typings.mendixmodelsdk

import org.scalablytyped.runtime.Instantiable1
import typings.mendixmodelsdk.abstractModelMod.AbstractModel
import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typings.mendixmodelsdk.elementsMod.AbstractElement
import typings.mendixmodelsdk.elementsMod.IAbstractElement
import typings.mendixmodelsdk.instancesMod.InstanceConstructor
import typings.mendixmodelsdk.structuresMod.IStructure
import typings.mendixmodelsdk.structuresMod.Structure
import typings.mendixmodelsdk.structuresMod.aliases.IContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unitsMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
  - typings.mendixmodelsdk.unitsMod.IAbstractUnit because var conflicts: container, id, isLoaded, model, structureTypeName, unit. Inlined isLoadable, isReadOnly */ @JSImport("mendixmodelsdk/dist/sdk/internal/units", "AbstractUnit")
  @js.native
  abstract class AbstractUnit[TModel /* <: IAbstractModel */] protected () extends Structure[TModel, StructuralUnit[IAbstractModel]] {
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
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
  - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
  - typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
  - typings.mendixmodelsdk.unitsMod.IAbstractUnit because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined isLoadable, isReadOnly
  - typings.mendixmodelsdk.unitsMod.IModelUnit because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/sdk/internal/units", "ModelUnit")
  @js.native
  abstract class ModelUnit[TModel /* <: IAbstractModel */] protected () extends AbstractElement[TModel, StructuralUnit[IAbstractModel]] {
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
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
  - typings.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
  - typings.mendixmodelsdk.unitsMod.IStructuralUnit because var conflicts: id, isLoadable, isLoaded, isReadOnly, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/sdk/internal/units", "StructuralUnit")
  @js.native
  abstract class StructuralUnit[TModel /* <: IAbstractModel */] protected ()
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
    
    @scala.inline
    def apply(
      allProperties: () => js.Array[AbstractProperty[js.Any, js.Any]],
      container: IStructuralUnit,
      delete: () => Unit,
      id: String,
      isLoadable: Boolean,
      isLoaded: Boolean,
      isReadOnly: Boolean,
      loadedProperties: () => js.Array[AbstractProperty[js.Any, js.Any]],
      model: IAbstractModel,
      publicProperties: () => js.Array[AbstractProperty[js.Any, js.Any]],
      structureTypeName: String,
      toJSON: () => js.Object,
      traverse: js.Function1[IAbstractUnit, Unit] => Unit,
      traverseFind: js.Function1[IAbstractUnit, js.Any] => js.Any | Null,
      traversePublicParts: js.Function1[IAbstractUnit, Unit] => Unit,
      unit: IAbstractUnit
    ): IAbstractUnit = {
      val __obj = js.Dynamic.literal(allProperties = js.Any.fromFunction0(allProperties), container = container.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), id = id.asInstanceOf[js.Any], isLoadable = isLoadable.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], loadedProperties = js.Any.fromFunction0(loadedProperties), model = model.asInstanceOf[js.Any], publicProperties = js.Any.fromFunction0(publicProperties), structureTypeName = structureTypeName.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), traverse = js.Any.fromFunction1(traverse), traverseFind = js.Any.fromFunction1(traverseFind), traversePublicParts = js.Any.fromFunction1(traversePublicParts), unit = unit.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAbstractUnit]
    }
    
    @scala.inline
    implicit class IAbstractUnitMutableBuilder[Self <: IAbstractUnit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: IStructuralUnit): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelete(value: () => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsLoadable(value: Boolean): Self = StObject.set(x, "isLoadable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsReadOnly(value: Boolean): Self = StObject.set(x, "isReadOnly", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IAbstractUnitConstructor
    extends StObject
       with Instantiable1[
          /* args (repeated) */ js.Any, 
          ModelUnit[IAbstractModel] | StructuralUnit[IAbstractModel]
        ]
       with InstanceConstructor
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
  - typings.mendixmodelsdk.elementsMod.IAbstractElement because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined load, load, load, load, asLoaded */ @js.native
  trait IModelUnit
    extends StObject
       with IAbstractUnit
       with IContainer {
    
    def asLoaded(): IAbstractElement = js.native
    
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
    
    @scala.inline
    def apply(
      allProperties: () => js.Array[AbstractProperty[js.Any, js.Any]],
      container: IStructuralUnit,
      delete: () => Unit,
      id: String,
      isLoadable: Boolean,
      isLoaded: Boolean,
      isReadOnly: Boolean,
      loadedProperties: () => js.Array[AbstractProperty[js.Any, js.Any]],
      model: IAbstractModel,
      publicProperties: () => js.Array[AbstractProperty[js.Any, js.Any]],
      structureTypeName: String,
      toJSON: () => js.Object,
      traverse: js.Function1[IStructuralUnit, Unit] => Unit,
      traverseFind: js.Function1[IStructuralUnit, js.Any] => js.Any | Null,
      traversePublicParts: js.Function1[IStructuralUnit, Unit] => Unit,
      unit: IAbstractUnit
    ): IStructuralUnit = {
      val __obj = js.Dynamic.literal(allProperties = js.Any.fromFunction0(allProperties), container = container.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), id = id.asInstanceOf[js.Any], isLoadable = isLoadable.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], loadedProperties = js.Any.fromFunction0(loadedProperties), model = model.asInstanceOf[js.Any], publicProperties = js.Any.fromFunction0(publicProperties), structureTypeName = structureTypeName.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), traverse = js.Any.fromFunction1(traverse), traverseFind = js.Any.fromFunction1(traverseFind), traversePublicParts = js.Any.fromFunction1(traversePublicParts), unit = unit.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStructuralUnit]
    }
  }
}
