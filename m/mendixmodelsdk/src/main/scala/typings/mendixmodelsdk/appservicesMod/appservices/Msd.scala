package typings.mendixmodelsdk.appservicesMod.appservices

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.appservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.webservicesMod.webservices.WsdlDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.Msd")
@js.native
class Msd protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsConsumedAppService: ConsumedAppService = js.native
  
  def domainModel: MsdDomainModel = js.native
  def domainModel_=(newValue: MsdDomainModel): Unit = js.native
  
  def enumerations: MsdEnumerationContainer = js.native
  def enumerations_=(newValue: MsdEnumerationContainer): Unit = js.native
  
  def metadata: MsdMetadata = js.native
  def metadata_=(newValue: MsdMetadata): Unit = js.native
  
  def version: MsdVersion = js.native
  def version_=(newValue: MsdVersion): Unit = js.native
  
  def wsdl: String = js.native
  
  def wsdlDescription: WsdlDescription = js.native
  def wsdlDescription_=(newValue: WsdlDescription): Unit = js.native
  
  def wsdl_=(newValue: String): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.Msd")
@js.native
object Msd extends js.Object {
  
  /**
    * Creates and returns a new Msd instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): Msd = js.native
  
  /**
    * Creates and returns a new Msd instance in the SDK and on the server.
    * The new Msd will be automatically stored in the 'msd' property
    * of the parent ConsumedAppService element passed as argument.
    */
  def createIn(container: ConsumedAppService): Msd = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
