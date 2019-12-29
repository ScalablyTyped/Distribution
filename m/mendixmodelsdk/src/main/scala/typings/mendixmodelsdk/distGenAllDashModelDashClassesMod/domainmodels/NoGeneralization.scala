package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodels

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.NoGeneralization")
@js.native
class NoGeneralization protected ()
  extends typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.NoGeneralization {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.NoGeneralization")
@js.native
object NoGeneralization extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new NoGeneralization instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.NoGeneralization = js.native
  /**
    * Creates and returns a new NoGeneralization instance in the SDK and on the server.
    * The new NoGeneralization will be automatically stored in the 'generalization' property
    * of the parent Entity element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.Entity): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.NoGeneralization = js.native
}

