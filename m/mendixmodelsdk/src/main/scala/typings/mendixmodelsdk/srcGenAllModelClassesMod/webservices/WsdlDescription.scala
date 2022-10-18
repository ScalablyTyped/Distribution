package typings.mendixmodelsdk.srcGenAllModelClassesMod.webservices

import typings.mendixmodelsdk.srcGenAppservicesMod.appservices.Msd
import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenWebservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/all-model-classes", "webservices.WsdlDescription")
@js.native
open class WsdlDescription protected ()
  extends typings.mendixmodelsdk.srcGenWebservicesMod.webservices.WsdlDescription {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object WsdlDescription {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "webservices.WsdlDescription")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new WsdlDescription instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenWebservicesMod.webservices.WsdlDescription = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenWebservicesMod.webservices.WsdlDescription]
  
  /**
    * Creates and returns a new WsdlDescription instance in the SDK and on the server.
    * The new WsdlDescription will be automatically stored in the 'wsdlDescription' property
    * of the parent ImportedWebService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createIn(container: typings.mendixmodelsdk.srcGenWebservicesMod.webservices.ImportedWebService): typings.mendixmodelsdk.srcGenWebservicesMod.webservices.WsdlDescription = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenWebservicesMod.webservices.WsdlDescription]
  
  /**
    * Creates and returns a new WsdlDescription instance in the SDK and on the server.
    * The new WsdlDescription will be automatically stored in the 'wsdlDescription' property
    * of the parent ImportedWebService element passed as argument.
    */
  /* static member */
  inline def createInImportedWebServiceUnderWsdlDescription(container: typings.mendixmodelsdk.srcGenWebservicesMod.webservices.ImportedWebService): typings.mendixmodelsdk.srcGenWebservicesMod.webservices.WsdlDescription = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImportedWebServiceUnderWsdlDescription")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenWebservicesMod.webservices.WsdlDescription]
  
  /**
    * Creates and returns a new WsdlDescription instance in the SDK and on the server.
    * The new WsdlDescription will be automatically stored in the 'wsdlDescription' property
    * of the parent appservices.Msd element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 9.0.1
    */
  /* static member */
  inline def createInMsdUnderWsdlDescription(container: Msd): typings.mendixmodelsdk.srcGenWebservicesMod.webservices.WsdlDescription = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMsdUnderWsdlDescription")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenWebservicesMod.webservices.WsdlDescription]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "webservices.WsdlDescription.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "webservices.WsdlDescription.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
