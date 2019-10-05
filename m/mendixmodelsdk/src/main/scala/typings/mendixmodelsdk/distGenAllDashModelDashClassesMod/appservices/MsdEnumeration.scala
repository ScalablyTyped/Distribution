package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.appservices

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "appservices.MsdEnumeration")
@js.native
class MsdEnumeration protected ()
  extends typings.mendixmodelsdk.distGenAppservicesMod.appservices.MsdEnumeration {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "appservices.MsdEnumeration")
@js.native
object MsdEnumeration extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenAppservicesMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new MsdEnumeration instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenAppservicesMod.appservices.MsdEnumeration = js.native
  /**
    * Creates and returns a new MsdEnumeration instance in the SDK and on the server.
    * The new MsdEnumeration will be automatically stored in the 'enumerations' property
    * of the parent MsdEnumerationContainer element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenAppservicesMod.appservices.MsdEnumerationContainer): typings.mendixmodelsdk.distGenAppservicesMod.appservices.MsdEnumeration = js.native
}

