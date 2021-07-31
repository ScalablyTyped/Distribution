package typings.mendixmodelsdk

import org.scalablytyped.runtime.Instantiable1
import typings.mendixmodelsdk.abstractModelMod.AbstractModel
import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.anon.Copy
import typings.mendixmodelsdk.instancesMod.InstanceConstructor
import typings.mendixmodelsdk.structuresMod.IStructure
import typings.mendixmodelsdk.structuresMod.Structure
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.structuresMod.aliases.IContainer
import typings.mendixmodelsdk.unitsMod.ModelUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementsMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
  - typings.mendixmodelsdk.elementsMod.IAbstractElement because var conflicts: container, id, isLoaded, model, structureTypeName, unit. Inlined load, load, load, load, asLoaded */ @JSImport("mendixmodelsdk/dist/sdk/internal/elements", "AbstractElement")
  @js.native
  abstract class AbstractElement[TModel /* <: IAbstractModel */, TContainer /* <: Container */] protected ()
    extends Structure[TModel, TContainer]
       with IContainer {
    def this(model: AbstractModel, structureTypeName: String, id: String, isPartial: Boolean) = this()
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IContainer
    ) = this()
    
    /**
      * Transforms a IElement interface into a Element class, loading the containing unit if necessary.
      * (Those are technically already the same, but this function makes sure its properties are available.)
      *
      * - If invoked without callback, it checks whether the properties are available or it will throw;
      * - If invoked with callback, it will load the data from the server if needed, and then invoke the callback.
      */
    def asLoaded(): this.type = js.native
    @JSName("asLoaded")
    def asLoaded_IAbstractElement(): IAbstractElement = js.native
    
    /**
      * Given an element id, returns the element in this abstract element with that id, otherwise null.
      */
    def findElementById(id: String): (AbstractElement[IAbstractModel, Container]) | Null = js.native
    
    /**
      * Checks whether all properties are available at the moment
      *  - if false, a load is required to access these properties.
      */
    @JSName("isLoaded")
    def isLoaded_MAbstractElement: Boolean = js.native
    
    def load(): js.Promise[this.type] = js.native
    /**
      * Transforms a IElement interface into a Element class, loading the containing unit if necessary.
      * (Those are technically already the same, but this function makes sure its properties are available.)
      *
      * - If invoked without callback, it checks whether the properties are available or it will throw;
      * - If invoked with callback, it will load the data from the server if needed, and then invoke the callback.
      */
    def load(callback: js.Function1[/* elem */ /* element */ this.type, Unit]): Unit = js.native
    def load(callback: js.Function1[/* elem */ /* element */ this.type, Unit], forceRefresh: Boolean): Unit = js.native
    def load(forceRefresh: Boolean): js.Promise[this.type] = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
  - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
  - typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
  - typings.mendixmodelsdk.elementsMod.IElement because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/sdk/internal/elements", "Element")
  @js.native
  abstract class Element[TModel /* <: IAbstractModel */] protected () extends AbstractElement[TModel, AbstractElement[IAbstractModel, Container]] {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
    
    var _deepCopyElement: js.Any = js.native
    
    /**
      * Creates a deep copy of this element and its children.
      */
    def deepCopy(targetModel: IAbstractModel): this.type = js.native
    
    /**
      * Creates a deep copy of this element and its children. Also returns a map from original to new IDs.
      */
    def deepCopyWithIdMap(targetModel: IAbstractModel): Copy = js.native
    
    /**
      * Detaches this element from the model, so that it can be attached in a different place.
      */
    def detach(): this.type = js.native
    
    /**
      * Checks whether all attributes are available ATM
      *  -  if false, a load is required to access these properties.
      */
    @JSName("isLoaded")
    def isLoaded_MElement: Boolean = js.native
    
    @JSName("unit")
    def unit_MElement: ModelUnit[IAbstractModel] = js.native
  }
  
  @js.native
  trait IAbstractElement
    extends StObject
       with IStructure
       with IContainer {
    
    def asLoaded(): IAbstractElement = js.native
    
    def load(): js.Promise[IAbstractElement] = js.native
    def load(callback: js.Function1[/* element */ this.type, Unit]): Unit = js.native
    def load(callback: js.Function1[/* element */ this.type, Unit], forceRefresh: Boolean): Unit = js.native
    def load(forceRefresh: Boolean): js.Promise[IAbstractElement] = js.native
  }
  
  trait IByNameReferrable extends StObject {
    
    /**
      * Returns the qualified name of this element, or
      * null if this element is not a part of the model,
      * or if it or one of its namespace containers does not have a
      * valid name.
      */
    val qualifiedName: String | Null
  }
  object IByNameReferrable {
    
    @scala.inline
    def apply(): IByNameReferrable = {
      val __obj = js.Dynamic.literal(qualifiedName = null)
      __obj.asInstanceOf[IByNameReferrable]
    }
    
    @scala.inline
    implicit class IByNameReferrableMutableBuilder[Self <: IByNameReferrable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQualifiedName(value: String): Self = StObject.set(x, "qualifiedName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualifiedNameNull: Self = StObject.set(x, "qualifiedName", null)
    }
  }
  
  @js.native
  trait IElement
    extends StObject
       with IAbstractElement {
    
    @JSName("container")
    val container_IElement: IAbstractElement = js.native
  }
  
  @js.native
  trait IElementConstructor
    extends StObject
       with Instantiable1[/* args (repeated) */ js.Any, Element[IAbstractModel]]
       with InstanceConstructor
}
