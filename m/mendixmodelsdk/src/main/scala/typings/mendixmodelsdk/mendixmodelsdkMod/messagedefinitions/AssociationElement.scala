package typings.mendixmodelsdk.mendixmodelsdkMod.messagedefinitions

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenJsonstructuresMod.jsonstructures.JsonStructure
import typings.mendixmodelsdk.distGenMappingsMod.mappings.Element
import typings.mendixmodelsdk.distGenMessagedefinitionsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `MessageDefinitions`.
  */
/**
  * In version 7.10.0: introduced
  */
@JSImport("mendixmodelsdk", "messagedefinitions.AssociationElement")
@js.native
class AssociationElement protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.messagedefinitions.AssociationElement {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "messagedefinitions.AssociationElement")
@js.native
object AssociationElement extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new AssociationElement instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitions.AssociationElement = js.native
  /**
    * Creates and returns a new AssociationElement instance in the SDK and on the server.
    * The new AssociationElement will be automatically stored in the 'children' property
    * of the parent mappings.Element element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.10.0 and higher
    */
  def createInElementUnderChildren(container: Element): typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitions.AssociationElement = js.native
  /**
    * Creates and returns a new AssociationElement instance in the SDK and on the server.
    * The new AssociationElement will be automatically stored in the 'elements' property
    * of the parent jsonstructures.JsonStructure element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.10.0 and higher
    */
  def createInJsonStructureUnderElements(container: JsonStructure): typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitions.AssociationElement = js.native
}

