package typings.mendixmodelsdk.mod.webservices

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

@JSImport("mendixmodelsdk", "webservices.RpcOperationElement")
@js.native
open class RpcOperationElement protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.webservices.RpcOperationElement {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object RpcOperationElement {
  
  @JSImport("mendixmodelsdk", "webservices.RpcOperationElement")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new RpcOperationElement instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenWebservicesMod.webservices.RpcOperationElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenWebservicesMod.webservices.RpcOperationElement]
  
  /**
    * Creates and returns a new RpcOperationElement instance in the SDK and on the server.
    * The new RpcOperationElement will be automatically stored in the 'requestBodyRpcElement' property
    * of the parent OperationInfo element passed as argument.
    */
  /* static member */
  inline def createInOperationInfoUnderRequestBodyRpcElement(container: typings.mendixmodelsdk.srcGenWebservicesMod.webservices.OperationInfo): typings.mendixmodelsdk.srcGenWebservicesMod.webservices.RpcOperationElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInOperationInfoUnderRequestBodyRpcElement")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenWebservicesMod.webservices.RpcOperationElement]
  
  /**
    * Creates and returns a new RpcOperationElement instance in the SDK and on the server.
    * The new RpcOperationElement will be automatically stored in the 'requestHeaderRpcElement' property
    * of the parent OperationInfo element passed as argument.
    */
  /* static member */
  inline def createInOperationInfoUnderRequestHeaderRpcElement(container: typings.mendixmodelsdk.srcGenWebservicesMod.webservices.OperationInfo): typings.mendixmodelsdk.srcGenWebservicesMod.webservices.RpcOperationElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInOperationInfoUnderRequestHeaderRpcElement")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenWebservicesMod.webservices.RpcOperationElement]
  
  /**
    * Creates and returns a new RpcOperationElement instance in the SDK and on the server.
    * The new RpcOperationElement will be automatically stored in the 'responseBodyRpcElement' property
    * of the parent OperationInfo element passed as argument.
    */
  /* static member */
  inline def createInOperationInfoUnderResponseBodyRpcElement(container: typings.mendixmodelsdk.srcGenWebservicesMod.webservices.OperationInfo): typings.mendixmodelsdk.srcGenWebservicesMod.webservices.RpcOperationElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInOperationInfoUnderResponseBodyRpcElement")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenWebservicesMod.webservices.RpcOperationElement]
  
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.RpcOperationElement.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.RpcOperationElement.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
