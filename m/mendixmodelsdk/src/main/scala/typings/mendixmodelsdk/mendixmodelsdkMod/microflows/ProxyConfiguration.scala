package typings.mendixmodelsdk.mendixmodelsdkMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.15.0: introduced
  */
@JSImport("mendixmodelsdk", "microflows.ProxyConfiguration")
@js.native
class ProxyConfiguration protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.microflows.ProxyConfiguration {
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
@JSImport("mendixmodelsdk", "microflows.ProxyConfiguration")
@js.native
object ProxyConfiguration extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new ProxyConfiguration instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.ProxyConfiguration = js.native
  /**
    * Creates and returns a new ProxyConfiguration instance in the SDK and on the server.
    * The new ProxyConfiguration will be automatically stored in the 'proxyConfiguration' property
    * of the parent RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInRestCallActionUnderProxyConfiguration(container: typings.mendixmodelsdk.distGenMicroflowsMod.microflows.RestCallAction): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.ProxyConfiguration = js.native
  /**
    * Creates and returns a new ProxyConfiguration instance in the SDK and on the server.
    * The new ProxyConfiguration will be automatically stored in the 'proxyConfiguration' property
    * of the parent WebServiceCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInWebServiceCallActionUnderProxyConfiguration(container: typings.mendixmodelsdk.distGenMicroflowsMod.microflows.WebServiceCallAction): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.ProxyConfiguration = js.native
}

