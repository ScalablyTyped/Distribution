package typings.mendixmodelsdk.internalMod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.instancesMod.InstanceConstructor
import typings.mendixmodelsdk.structuresMod.IStructure
import typings.mendixmodelsdk.structuresMod.IStructureConstructor
import typings.mendixmodelsdk.transportInterfacesMod.IAbstractElementJson
import typings.mendixmodelsdk.transportInterfacesMod.IAbstractUnitJson
import typings.mendixmodelsdk.unitsMod.IAbstractUnitConstructor
import typings.mendixmodelsdk.unitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "instancehelpers")
@js.native
object instancehelpers extends js.Object {
  /**
    * Given some a (normalized) JSON representation of a unit,
    * creates an instance of the corresponding `unit.AbstractUnit` sub class (structural/model)
    * and populates that from the JSON.
    * Should only be called if this unit was not already in memory.
    */
  def abstractUnitJsonToInstance(
    model: typings.mendixmodelsdk.abstractModelMod.AbstractModel,
    json: IAbstractUnitJson,
    isPartial: Boolean
  ): typings.mendixmodelsdk.unitsMod.AbstractUnit | Null = js.native
  /**
    * Creates a new element for a SDK user.
    */
  def createElement[T /* <: typings.mendixmodelsdk.elementsMod.Element */](owner: IAbstractModel, constructor: IStructureConstructor[T]): T = js.native
  def createElement[T /* <: typings.mendixmodelsdk.elementsMod.Element */](owner: IAbstractModel, constructor: IStructureConstructor[T], parentPropName: String): T = js.native
  def createElement[T /* <: typings.mendixmodelsdk.elementsMod.Element */](
    owner: IAbstractModel,
    constructor: IStructureConstructor[T],
    parentPropName: String,
    parentPropIsList: Boolean
  ): T = js.native
  def createElement[T /* <: typings.mendixmodelsdk.elementsMod.Element */](owner: typings.mendixmodelsdk.elementsMod.AbstractElement, constructor: IStructureConstructor[T]): T = js.native
  def createElement[T /* <: typings.mendixmodelsdk.elementsMod.Element */](
    owner: typings.mendixmodelsdk.elementsMod.AbstractElement,
    constructor: IStructureConstructor[T],
    parentPropName: String
  ): T = js.native
  def createElement[T /* <: typings.mendixmodelsdk.elementsMod.Element */](
    owner: typings.mendixmodelsdk.elementsMod.AbstractElement,
    constructor: IStructureConstructor[T],
    parentPropName: String,
    parentPropIsList: Boolean
  ): T = js.native
  def createNewElementInstanceFromJSON(model: typings.mendixmodelsdk.abstractModelMod.AbstractModel, json: IAbstractElementJson): typings.mendixmodelsdk.elementsMod.Element = js.native
  /**
    * Creates a new unit for a SDK user.
    */
  def createUnit(container: IStructuralUnit, constructor: IAbstractUnitConstructor): js.Any = js.native
  /**
    * Type -> class (the constructor function, technically) lookup, e.g. "DomainModels$Entity" -> DomainModels.Entity
    */
  def lookupClass(qualifiedTypeName: String, classes: js.Any): InstanceConstructor = js.native
  def modelElementJsonToInstance(
    model: typings.mendixmodelsdk.abstractModelMod.AbstractModel,
    unit: typings.mendixmodelsdk.unitsMod.ModelUnit,
    container: typings.mendixmodelsdk.elementsMod.AbstractElement,
    json: Null,
    isPartial: Boolean
  ): typings.mendixmodelsdk.elementsMod.Element | Null = js.native
  /**
    * Given some a (normalized) JSON representation of a model element,
    * creates an instance of the corresponding `elements.Element`
    * and populates that from the JSON.
    * Will update existing elements if this element was created before.
    */
  def modelElementJsonToInstance(
    model: typings.mendixmodelsdk.abstractModelMod.AbstractModel,
    unit: typings.mendixmodelsdk.unitsMod.ModelUnit,
    container: typings.mendixmodelsdk.elementsMod.AbstractElement,
    json: IAbstractElementJson,
    isPartial: Boolean
  ): typings.mendixmodelsdk.elementsMod.Element | Null = js.native
  def structureAffectsQualifiedNames(structure: IStructure): Boolean = js.native
  def structureIsByNameReferrable(structure: IStructure): /* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/elements.AbstractElement */ Boolean = js.native
}

