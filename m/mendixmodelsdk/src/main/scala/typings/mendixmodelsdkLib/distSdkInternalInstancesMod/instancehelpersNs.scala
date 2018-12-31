package typings
package mendixmodelsdkLib.distSdkInternalInstancesMod

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
  def abstractUnitJsonToInstance(
    model: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.AbstractModel,
    json: mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IAbstractUnitJson,
    isPartial: scala.Boolean
  ): mendixmodelsdkLib.distSdkInternalUnitsMod.AbstractUnit | scala.Null = js.native
  /**
    * Creates a new element for a SDK user.
    */
  def createElement[T /* <: mendixmodelsdkLib.distSdkInternalElementsMod.Element */](
    owner: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.IAbstractModel,
    constructor: mendixmodelsdkLib.distSdkInternalStructuresMod.IStructureConstructor[T]
  ): T = js.native
  def createElement[T /* <: mendixmodelsdkLib.distSdkInternalElementsMod.Element */](
    owner: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.IAbstractModel,
    constructor: mendixmodelsdkLib.distSdkInternalStructuresMod.IStructureConstructor[T],
    parentPropName: java.lang.String
  ): T = js.native
  def createElement[T /* <: mendixmodelsdkLib.distSdkInternalElementsMod.Element */](
    owner: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.IAbstractModel,
    constructor: mendixmodelsdkLib.distSdkInternalStructuresMod.IStructureConstructor[T],
    parentPropName: java.lang.String,
    parentPropIsList: scala.Boolean
  ): T = js.native
  def createElement[T /* <: mendixmodelsdkLib.distSdkInternalElementsMod.Element */](
    owner: mendixmodelsdkLib.distSdkInternalElementsMod.AbstractElement,
    constructor: mendixmodelsdkLib.distSdkInternalStructuresMod.IStructureConstructor[T]
  ): T = js.native
  def createElement[T /* <: mendixmodelsdkLib.distSdkInternalElementsMod.Element */](
    owner: mendixmodelsdkLib.distSdkInternalElementsMod.AbstractElement,
    constructor: mendixmodelsdkLib.distSdkInternalStructuresMod.IStructureConstructor[T],
    parentPropName: java.lang.String
  ): T = js.native
  def createElement[T /* <: mendixmodelsdkLib.distSdkInternalElementsMod.Element */](
    owner: mendixmodelsdkLib.distSdkInternalElementsMod.AbstractElement,
    constructor: mendixmodelsdkLib.distSdkInternalStructuresMod.IStructureConstructor[T],
    parentPropName: java.lang.String,
    parentPropIsList: scala.Boolean
  ): T = js.native
  def createNewElementInstanceFromJSON(
    model: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.AbstractModel,
    json: mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IAbstractElementJson
  ): mendixmodelsdkLib.distSdkInternalElementsMod.Element = js.native
  /**
    * Creates a new unit for a SDK user.
    */
  def createUnit(
    container: mendixmodelsdkLib.distSdkInternalUnitsMod.IStructuralUnit,
    constructor: mendixmodelsdkLib.distSdkInternalUnitsMod.IAbstractUnitConstructor
  ): js.Any = js.native
  /**
    * Type -> class (the constructor function, technically) lookup, e.g. "DomainModels$Entity" -> DomainModels.Entity
    */
  def lookupClass(qualifiedTypeName: java.lang.String, classes: js.Any): mendixmodelsdkLib.distSdkInternalInstancesMod.InstanceConstructor = js.native
  /**
    * Given some a (normalized) JSON representation of a model element,
    * creates an instance of the corresponding `elements.Element`
    * and populates that from the JSON.
    * Will update existing elements if this element was created before.
    */
  def modelElementJsonToInstance(
    model: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.AbstractModel,
    unit: mendixmodelsdkLib.distSdkInternalUnitsMod.ModelUnit,
    container: mendixmodelsdkLib.distSdkInternalElementsMod.AbstractElement,
    json: mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IAbstractElementJson,
    isPartial: scala.Boolean
  ): mendixmodelsdkLib.distSdkInternalElementsMod.Element | scala.Null = js.native
  def modelElementJsonToInstance(
    model: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.AbstractModel,
    unit: mendixmodelsdkLib.distSdkInternalUnitsMod.ModelUnit,
    container: mendixmodelsdkLib.distSdkInternalElementsMod.AbstractElement,
    json: scala.Null,
    isPartial: scala.Boolean
  ): mendixmodelsdkLib.distSdkInternalElementsMod.Element | scala.Null = js.native
  def structureAffectsQualifiedNames(structure: mendixmodelsdkLib.distSdkInternalStructuresMod.IStructure): scala.Boolean = js.native
  def structureIsByNameReferrable(structure: mendixmodelsdkLib.distSdkInternalStructuresMod.IStructure): /* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/elements.AbstractElement */ scala.Boolean = js.native
}

