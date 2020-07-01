package typings.mendixmodelsdk.mod.domainmodels

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 8.11.0: introduced
  */
@JSImport("mendixmodelsdk", "domainmodels.AssociationCapabilities")
@js.native
class AssociationCapabilities protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.domainmodels.AssociationCapabilities {
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
@JSImport("mendixmodelsdk", "domainmodels.AssociationCapabilities")
@js.native
object AssociationCapabilities extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new AssociationCapabilities instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.domainmodelsMod.domainmodels.AssociationCapabilities = js.native
  /**
    * Creates and returns a new AssociationCapabilities instance in the SDK and on the server.
    * The new AssociationCapabilities will be automatically stored in the 'capabilities' property
    * of the parent AssociationBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.11.0 and higher
    */
  def createIn(container: typings.mendixmodelsdk.domainmodelsMod.domainmodels.AssociationBase): typings.mendixmodelsdk.domainmodelsMod.domainmodels.AssociationCapabilities = js.native
}

