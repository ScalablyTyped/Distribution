package typings.mendixmodelsdk.distSdkInternalInstancesMod

import typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod.IAbstractModel
import typings.mendixmodelsdk.distSdkInternalElementsMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalElementsMod.Element
import typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure
import typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructureConstructor
import typings.mendixmodelsdk.distSdkInternalTransportDashInterfacesMod.IAbstractElementJson
import typings.mendixmodelsdk.distSdkInternalTransportDashInterfacesMod.IAbstractUnitJson
import typings.mendixmodelsdk.distSdkInternalUnitsMod.AbstractUnit
import typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnitConstructor
import typings.mendixmodelsdk.distSdkInternalUnitsMod.IStructuralUnit
import typings.mendixmodelsdk.distSdkInternalUnitsMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/instances", "instancehelpers")
@js.native
object instancehelpersNs extends js.Object {
  /**
    * Given some a (normalized) JSON representation of a unit,
    * creates an instance of the corresponding `unit.AbstractUnit` sub class (structural/model)
    * and populates that from the JSON.
    * Should only be called if this unit was not already in memory.
    */
  def abstractUnitJsonToInstance(model: AbstractModel, json: IAbstractUnitJson, isPartial: Boolean): AbstractUnit | Null = js.native
  /**
    * Creates a new element for a SDK user.
    */
  def createElement[T /* <: Element */](owner: IAbstractModel, constructor: IStructureConstructor[T]): T = js.native
  def createElement[T /* <: Element */](owner: IAbstractModel, constructor: IStructureConstructor[T], parentPropName: String): T = js.native
  def createElement[T /* <: Element */](
    owner: IAbstractModel,
    constructor: IStructureConstructor[T],
    parentPropName: String,
    parentPropIsList: Boolean
  ): T = js.native
  def createElement[T /* <: Element */](owner: AbstractElement, constructor: IStructureConstructor[T]): T = js.native
  def createElement[T /* <: Element */](owner: AbstractElement, constructor: IStructureConstructor[T], parentPropName: String): T = js.native
  def createElement[T /* <: Element */](
    owner: AbstractElement,
    constructor: IStructureConstructor[T],
    parentPropName: String,
    parentPropIsList: Boolean
  ): T = js.native
  def createNewElementInstanceFromJSON(model: AbstractModel, json: IAbstractElementJson): Element = js.native
  /**
    * Creates a new unit for a SDK user.
    */
  def createUnit(container: IStructuralUnit, constructor: IAbstractUnitConstructor): js.Any = js.native
  /**
    * Type -> class (the constructor function, technically) lookup, e.g. "DomainModels$Entity" -> DomainModels.Entity
    */
  def lookupClass(qualifiedTypeName: String, classes: js.Any): InstanceConstructor = js.native
  def modelElementJsonToInstance(model: AbstractModel, unit: ModelUnit, container: AbstractElement, json: Null, isPartial: Boolean): Element | Null = js.native
  /**
    * Given some a (normalized) JSON representation of a model element,
    * creates an instance of the corresponding `elements.Element`
    * and populates that from the JSON.
    * Will update existing elements if this element was created before.
    */
  def modelElementJsonToInstance(
    model: AbstractModel,
    unit: ModelUnit,
    container: AbstractElement,
    json: IAbstractElementJson,
    isPartial: Boolean
  ): Element | Null = js.native
  def structureAffectsQualifiedNames(structure: IStructure): Boolean = js.native
  def structureIsByNameReferrable(structure: IStructure): /* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/elements.AbstractElement */ Boolean = js.native
}

