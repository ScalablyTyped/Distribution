package typings.mendixmodelsdk.distSdkInternalMod

import typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod.IAbstractModel
import typings.mendixmodelsdk.distSdkInternalInstancesMod.InstanceConstructor
import typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure
import typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructureConstructor
import typings.mendixmodelsdk.distSdkInternalTransportDashInterfacesMod.IAbstractElementJson
import typings.mendixmodelsdk.distSdkInternalTransportDashInterfacesMod.IAbstractUnitJson
import typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnitConstructor
import typings.mendixmodelsdk.distSdkInternalUnitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "instancehelpers")
@js.native
object instancehelpersNs extends js.Object {
  /**
    * Given some a (normalized) JSON representation of a unit,
    * creates an instance of the corresponding `unit.AbstractUnit` sub class (structural/model)
    * and populates that from the JSON.
    * Should only be called if this unit was not already in memory.
    */
  def abstractUnitJsonToInstance(
    model: typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod.AbstractModel,
    json: IAbstractUnitJson,
    isPartial: Boolean
  ): typings.mendixmodelsdk.distSdkInternalUnitsMod.AbstractUnit | Null = js.native
  /**
    * Creates a new element for a SDK user.
    */
  def createElement[T /* <: typings.mendixmodelsdk.distSdkInternalElementsMod.Element */](owner: IAbstractModel, constructor: IStructureConstructor[T]): T = js.native
  def createElement[T /* <: typings.mendixmodelsdk.distSdkInternalElementsMod.Element */](owner: IAbstractModel, constructor: IStructureConstructor[T], parentPropName: String): T = js.native
  def createElement[T /* <: typings.mendixmodelsdk.distSdkInternalElementsMod.Element */](
    owner: IAbstractModel,
    constructor: IStructureConstructor[T],
    parentPropName: String,
    parentPropIsList: Boolean
  ): T = js.native
  def createElement[T /* <: typings.mendixmodelsdk.distSdkInternalElementsMod.Element */](
    owner: typings.mendixmodelsdk.distSdkInternalElementsMod.AbstractElement,
    constructor: IStructureConstructor[T]
  ): T = js.native
  def createElement[T /* <: typings.mendixmodelsdk.distSdkInternalElementsMod.Element */](
    owner: typings.mendixmodelsdk.distSdkInternalElementsMod.AbstractElement,
    constructor: IStructureConstructor[T],
    parentPropName: String
  ): T = js.native
  def createElement[T /* <: typings.mendixmodelsdk.distSdkInternalElementsMod.Element */](
    owner: typings.mendixmodelsdk.distSdkInternalElementsMod.AbstractElement,
    constructor: IStructureConstructor[T],
    parentPropName: String,
    parentPropIsList: Boolean
  ): T = js.native
  def createNewElementInstanceFromJSON(
    model: typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod.AbstractModel,
    json: IAbstractElementJson
  ): typings.mendixmodelsdk.distSdkInternalElementsMod.Element = js.native
  /**
    * Creates a new unit for a SDK user.
    */
  def createUnit(container: IStructuralUnit, constructor: IAbstractUnitConstructor): js.Any = js.native
  /**
    * Type -> class (the constructor function, technically) lookup, e.g. "DomainModels$Entity" -> DomainModels.Entity
    */
  def lookupClass(qualifiedTypeName: String, classes: js.Any): InstanceConstructor = js.native
  def modelElementJsonToInstance(
    model: typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod.AbstractModel,
    unit: typings.mendixmodelsdk.distSdkInternalUnitsMod.ModelUnit,
    container: typings.mendixmodelsdk.distSdkInternalElementsMod.AbstractElement,
    json: Null,
    isPartial: Boolean
  ): typings.mendixmodelsdk.distSdkInternalElementsMod.Element | Null = js.native
  /**
    * Given some a (normalized) JSON representation of a model element,
    * creates an instance of the corresponding `elements.Element`
    * and populates that from the JSON.
    * Will update existing elements if this element was created before.
    */
  def modelElementJsonToInstance(
    model: typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod.AbstractModel,
    unit: typings.mendixmodelsdk.distSdkInternalUnitsMod.ModelUnit,
    container: typings.mendixmodelsdk.distSdkInternalElementsMod.AbstractElement,
    json: IAbstractElementJson,
    isPartial: Boolean
  ): typings.mendixmodelsdk.distSdkInternalElementsMod.Element | Null = js.native
  def structureAffectsQualifiedNames(structure: IStructure): Boolean = js.native
  def structureIsByNameReferrable(structure: IStructure): /* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/elements.AbstractElement */ Boolean = js.native
}

