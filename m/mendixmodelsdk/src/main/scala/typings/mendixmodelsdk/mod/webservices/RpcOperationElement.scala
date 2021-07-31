package typings.mendixmodelsdk.mod.webservices

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.webservicesMod.StructureVersionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "webservices.RpcOperationElement")
@js.native
class RpcOperationElement protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.webservices.RpcOperationElement {
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
  @scala.inline
  def create(model: IModel): typings.mendixmodelsdk.webservicesMod.webservices.RpcOperationElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.webservicesMod.webservices.RpcOperationElement]
  
  /**
    * Creates and returns a new RpcOperationElement instance in the SDK and on the server.
    * The new RpcOperationElement will be automatically stored in the 'requestBodyRpcElement' property
    * of the parent OperationInfo element passed as argument.
    */
  /* static member */
  @scala.inline
  def createInOperationInfoUnderRequestBodyRpcElement(container: typings.mendixmodelsdk.webservicesMod.webservices.OperationInfo): typings.mendixmodelsdk.webservicesMod.webservices.RpcOperationElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInOperationInfoUnderRequestBodyRpcElement")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.webservicesMod.webservices.RpcOperationElement]
  
  /**
    * Creates and returns a new RpcOperationElement instance in the SDK and on the server.
    * The new RpcOperationElement will be automatically stored in the 'requestHeaderRpcElement' property
    * of the parent OperationInfo element passed as argument.
    */
  /* static member */
  @scala.inline
  def createInOperationInfoUnderRequestHeaderRpcElement(container: typings.mendixmodelsdk.webservicesMod.webservices.OperationInfo): typings.mendixmodelsdk.webservicesMod.webservices.RpcOperationElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInOperationInfoUnderRequestHeaderRpcElement")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.webservicesMod.webservices.RpcOperationElement]
  
  /**
    * Creates and returns a new RpcOperationElement instance in the SDK and on the server.
    * The new RpcOperationElement will be automatically stored in the 'responseBodyRpcElement' property
    * of the parent OperationInfo element passed as argument.
    */
  /* static member */
  @scala.inline
  def createInOperationInfoUnderResponseBodyRpcElement(container: typings.mendixmodelsdk.webservicesMod.webservices.OperationInfo): typings.mendixmodelsdk.webservicesMod.webservices.RpcOperationElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInOperationInfoUnderResponseBodyRpcElement")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.webservicesMod.webservices.RpcOperationElement]
  
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.RpcOperationElement.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.RpcOperationElement.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
