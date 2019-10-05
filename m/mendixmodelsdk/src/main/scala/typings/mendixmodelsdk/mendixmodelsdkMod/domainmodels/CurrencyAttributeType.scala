package typings.mendixmodelsdk.mendixmodelsdkMod.domainmodels

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 6.0.0: deprecated
  */
@JSImport("mendixmodelsdk", "domainmodels.CurrencyAttributeType")
@js.native
class CurrencyAttributeType protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodels.CurrencyAttributeType {
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
@JSImport("mendixmodelsdk", "domainmodels.CurrencyAttributeType")
@js.native
object CurrencyAttributeType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new CurrencyAttributeType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.CurrencyAttributeType = js.native
  /**
    * Creates and returns a new CurrencyAttributeType instance in the SDK and on the server.
    * The new CurrencyAttributeType will be automatically stored in the 'type' property
    * of the parent Attribute element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.Attribute): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.CurrencyAttributeType = js.native
}

