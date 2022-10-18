package typings.mendixmodelsdk

import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalElementsMod.Element
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructureConstructor
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.Structure
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer
import typings.mendixmodelsdk.srcSdkInternalTransportInterfacesMod.IAbstractElementJson
import typings.mendixmodelsdk.srcSdkInternalTransportInterfacesMod.IAbstractUnitJson
import typings.mendixmodelsdk.srcSdkInternalUnitsMod.AbstractUnit
import typings.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit
import typings.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnitConstructor
import typings.mendixmodelsdk.srcSdkInternalUnitsMod.IStructuralUnit
import typings.mendixmodelsdk.srcSdkInternalUnitsMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.LifeCycle
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.Version
import typings.mendixmodelsdk.srcSdkUtilsMod.utils.IMap
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalInstancesMod {
  
  @JSImport("mendixmodelsdk/src/sdk/internal/instances", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("mendixmodelsdk/src/sdk/internal/instances", "AbstractEnum")
  @js.native
  open class AbstractEnum protected () extends StObject {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    
    def checkEnumVersion(metaModelVersion: Version, includeWarnings: Boolean): Unit = js.native
    
    def name: String = js.native
    
    def qualifiedTsLiteralName(): String = js.native
    
    /* protected */ var qualifiedTsTypeName: String = js.native
    
    var versionInfo: LifeCycle = js.native
  }
  
  inline def createElementFromJSON(model: IAbstractModel, json: IAbstractElementJson): Element[IAbstractModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElementFromJSON")(model.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[Element[IAbstractModel]]
  inline def createElementFromJSON(
    model: IAbstractModel,
    json: IAbstractElementJson,
    idToStructureMap: IMap[Structure[IAbstractModel, IContainer | Null]]
  ): Element[IAbstractModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElementFromJSON")(model.asInstanceOf[js.Any], json.asInstanceOf[js.Any], idToStructureMap.asInstanceOf[js.Any])).asInstanceOf[Element[IAbstractModel]]
  
  inline def createModelUnitFromJSON(containerUnit: IStructuralUnit, containmentName: String, contents: IAbstractElementJson): ModelUnit[IAbstractModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("createModelUnitFromJSON")(containerUnit.asInstanceOf[js.Any], containmentName.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[ModelUnit[IAbstractModel]]
  
  object instancehelpers {
    
    @JSImport("mendixmodelsdk/src/sdk/internal/instances", "instancehelpers")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Given some a (normalized) JSON representation of a unit,
      * creates an instance of the corresponding `unit.AbstractUnit` sub class (structural/model)
      * and populates that from the JSON.
      * Should only be called if this unit was not already in memory.
      */
    inline def abstractUnitJsonToInstance(model: AbstractModel, json: IAbstractUnitJson, isPartial: Boolean): AbstractUnit[IAbstractModel] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("abstractUnitJsonToInstance")(model.asInstanceOf[js.Any], json.asInstanceOf[js.Any], isPartial.asInstanceOf[js.Any])).asInstanceOf[AbstractUnit[IAbstractModel] | Null]
    
    /**
      * Creates a new element for a SDK user.
      */
    inline def createElement[T /* <: Element[IAbstractModel] */](owner: IAbstractModel, constructor: IStructureConstructor[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(owner.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def createElement[T /* <: Element[IAbstractModel] */](owner: IAbstractModel, constructor: IStructureConstructor[T], parentPropName: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(owner.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any], parentPropName.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def createElement[T /* <: Element[IAbstractModel] */](
      owner: IAbstractModel,
      constructor: IStructureConstructor[T],
      parentPropName: String,
      parentPropIsList: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(owner.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any], parentPropName.asInstanceOf[js.Any], parentPropIsList.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def createElement[T /* <: Element[IAbstractModel] */](
      owner: IAbstractModel,
      constructor: IStructureConstructor[T],
      parentPropName: Unit,
      parentPropIsList: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(owner.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any], parentPropName.asInstanceOf[js.Any], parentPropIsList.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def createElement[T /* <: Element[IAbstractModel] */](owner: AbstractElement[IAbstractModel, Container], constructor: IStructureConstructor[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(owner.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def createElement[T /* <: Element[IAbstractModel] */](
      owner: AbstractElement[IAbstractModel, Container],
      constructor: IStructureConstructor[T],
      parentPropName: String
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(owner.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any], parentPropName.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def createElement[T /* <: Element[IAbstractModel] */](
      owner: AbstractElement[IAbstractModel, Container],
      constructor: IStructureConstructor[T],
      parentPropName: String,
      parentPropIsList: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(owner.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any], parentPropName.asInstanceOf[js.Any], parentPropIsList.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def createElement[T /* <: Element[IAbstractModel] */](
      owner: AbstractElement[IAbstractModel, Container],
      constructor: IStructureConstructor[T],
      parentPropName: Unit,
      parentPropIsList: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(owner.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any], parentPropName.asInstanceOf[js.Any], parentPropIsList.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def createNewElementInstanceFromJSON(model: AbstractModel, json: IAbstractElementJson): Element[IAbstractModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("createNewElementInstanceFromJSON")(model.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[Element[IAbstractModel]]
    
    /**
      * Creates a new unit for a SDK user.
      */
    inline def createUnit(container: IStructuralUnit, constructor: IAbstractUnitConstructor): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createUnit")(container.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def createUnitFromJSON(model: AbstractModel, json: IAbstractUnitJson): IAbstractUnit = (^.asInstanceOf[js.Dynamic].applyDynamic("createUnitFromJSON")(model.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[IAbstractUnit]
    inline def createUnitFromJSON(model: AbstractModel, json: IAbstractUnitJson, resolveByIdReferences: Boolean): IAbstractUnit = (^.asInstanceOf[js.Dynamic].applyDynamic("createUnitFromJSON")(model.asInstanceOf[js.Any], json.asInstanceOf[js.Any], resolveByIdReferences.asInstanceOf[js.Any])).asInstanceOf[IAbstractUnit]
    
    /**
      * Type -> class (the constructor function, technically) lookup, e.g. "DomainModels$Entity" -> DomainModels.Entity
      */
    inline def lookupClass(qualifiedTypeName: String, classes: Any): InstanceConstructor = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupClass")(qualifiedTypeName.asInstanceOf[js.Any], classes.asInstanceOf[js.Any])).asInstanceOf[InstanceConstructor]
    
    inline def modelElementJsonToInstance(
      model: AbstractModel,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container],
      json: Null,
      isPartial: Boolean
    ): Element[IAbstractModel] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("modelElementJsonToInstance")(model.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], container.asInstanceOf[js.Any], json.asInstanceOf[js.Any], isPartial.asInstanceOf[js.Any])).asInstanceOf[Element[IAbstractModel] | Null]
    /**
      * Given some a (normalized) JSON representation of a model element,
      * creates an instance of the corresponding `elements.Element`
      * and populates that from the JSON.
      * Will update existing elements if this element was created before.
      */
    inline def modelElementJsonToInstance(
      model: AbstractModel,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container],
      json: IAbstractElementJson,
      isPartial: Boolean
    ): Element[IAbstractModel] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("modelElementJsonToInstance")(model.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], container.asInstanceOf[js.Any], json.asInstanceOf[js.Any], isPartial.asInstanceOf[js.Any])).asInstanceOf[Element[IAbstractModel] | Null]
    
    inline def structureAffectsQualifiedNames(structure: IStructure): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("structureAffectsQualifiedNames")(structure.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def structureIsByNameReferrable(structure: IStructure): /* is mendixmodelsdk.mendixmodelsdk/src/sdk/internal/elements.AbstractElement<mendixmodelsdk.mendixmodelsdk/src/sdk/internal/AbstractModel.IAbstractModel, mendixmodelsdk.mendixmodelsdk/src/sdk/internal/structures.aliases.Container> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("structureIsByNameReferrable")(structure.asInstanceOf[js.Any]).asInstanceOf[/* is mendixmodelsdk.mendixmodelsdk/src/sdk/internal/elements.AbstractElement<mendixmodelsdk.mendixmodelsdk/src/sdk/internal/AbstractModel.IAbstractModel, mendixmodelsdk.mendixmodelsdk/src/sdk/internal/structures.aliases.Container> */ Boolean]
  }
  
  @js.native
  trait IList[T]
    extends StObject
       with Array[T] {
    
    def clear(): js.Array[T] = js.native
    
    def find(
      predicate: js.Function3[/* item */ T, /* index */ Double, /* array */ js.Array[T], Boolean],
      thisArg: Any,
      fromIndex: Double
    ): js.UndefOr[T] = js.native
    def find(
      predicate: js.Function3[/* item */ T, /* index */ Double, /* array */ js.Array[T], Boolean],
      thisArg: Unit,
      fromIndex: Double
    ): js.UndefOr[T] = js.native
    
    def remove(value: T): Boolean = js.native
    
    def replace(newItems: js.Array[T]): js.Array[T] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IElementConstructor
    - typings.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnitConstructor
  */
  trait InstanceConstructor extends StObject
}
