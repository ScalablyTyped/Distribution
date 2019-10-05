package typings.mendixmodelsdk.mendixmodelsdkMod.domainmodels

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "domainmodels.AutoNumberAttributeType")
@js.native
class AutoNumberAttributeType protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodels.AutoNumberAttributeType {
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
@JSImport("mendixmodelsdk", "domainmodels.AutoNumberAttributeType")
@js.native
object AutoNumberAttributeType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new AutoNumberAttributeType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AutoNumberAttributeType = js.native
  /**
    * Creates and returns a new AutoNumberAttributeType instance in the SDK and on the server.
    * The new AutoNumberAttributeType will be automatically stored in the 'type' property
    * of the parent Attribute element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.Attribute): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AutoNumberAttributeType = js.native
}

