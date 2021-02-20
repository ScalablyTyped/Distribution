package typings.mendixmodelsdk.webservicesMod.webservices

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.webservicesMod.StructureVersionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.WsdlEntry")
@js.native
class WsdlEntry protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsWsdlDescription: WsdlDescription = js.native
  
  def contents: String = js.native
  def contents_=(newValue: String): Unit = js.native
  
  def localizedContentsFormat: String = js.native
  def localizedContentsFormat_=(newValue: String): Unit = js.native
  
  def localizedLocationFormat: String = js.native
  def localizedLocationFormat_=(newValue: String): Unit = js.native
  
  def location: String = js.native
  def location_=(newValue: String): Unit = js.native
}
object WsdlEntry {
  
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.WsdlEntry")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new WsdlEntry instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.WsdlEntry.create")
  @js.native
  def create(model: IModel): WsdlEntry = js.native
  
  /**
    * Creates and returns a new WsdlEntry instance in the SDK and on the server.
    * The new WsdlEntry will be automatically stored in the 'wsdlEntries' property
    * of the parent WsdlDescription element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.WsdlEntry.createIn")
  @js.native
  def createIn(container: WsdlDescription): WsdlEntry = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.WsdlEntry.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.WsdlEntry.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
