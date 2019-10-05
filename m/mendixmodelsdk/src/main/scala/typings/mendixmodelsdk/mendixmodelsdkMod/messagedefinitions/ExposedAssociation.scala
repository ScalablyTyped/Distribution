package typings.mendixmodelsdk.mendixmodelsdkMod.messagedefinitions

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenJsonstructuresMod.jsonstructures.JsonStructure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.6.0: introduced
  */
@JSImport("mendixmodelsdk", "messagedefinitions.ExposedAssociation")
@js.native
class ExposedAssociation protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.messagedefinitions.ExposedAssociation {
  def this(
    model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
    container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "messagedefinitions.ExposedAssociation")
@js.native
object ExposedAssociation extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenMessagedefinitionsMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new ExposedAssociation instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitions.ExposedAssociation = js.native
  /**
    * Creates and returns a new ExposedAssociation instance in the SDK and on the server.
    * The new ExposedAssociation will be automatically stored in the 'children' property
    * of the parent mappings.Element element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.6.0 and higher
    */
  def createInElementUnderChildren(container: typings.mendixmodelsdk.distGenMappingsMod.mappings.Element): typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitions.ExposedAssociation = js.native
  /**
    * Creates and returns a new ExposedAssociation instance in the SDK and on the server.
    * The new ExposedAssociation will be automatically stored in the 'elements' property
    * of the parent jsonstructures.JsonStructure element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.6.0 and higher
    */
  def createInJsonStructureUnderElements(container: JsonStructure): typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitions.ExposedAssociation = js.native
}

