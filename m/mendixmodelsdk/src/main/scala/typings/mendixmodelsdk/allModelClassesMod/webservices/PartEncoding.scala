package typings.mendixmodelsdk.allModelClassesMod.webservices

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

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.PartEncoding")
@js.native
class PartEncoding protected ()
  extends typings.mendixmodelsdk.webservicesMod.webservices.PartEncoding {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object PartEncoding {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.PartEncoding")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new PartEncoding instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): typings.mendixmodelsdk.webservicesMod.webservices.PartEncoding = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.webservicesMod.webservices.PartEncoding]
  
  /**
    * Creates and returns a new PartEncoding instance in the SDK and on the server.
    * The new PartEncoding will be automatically stored in the 'requestBodyPartEncodings' property
    * of the parent OperationInfo element passed as argument.
    */
  /* static member */
  @scala.inline
  def createInOperationInfoUnderRequestBodyPartEncodings(container: typings.mendixmodelsdk.webservicesMod.webservices.OperationInfo): typings.mendixmodelsdk.webservicesMod.webservices.PartEncoding = ^.asInstanceOf[js.Dynamic].applyDynamic("createInOperationInfoUnderRequestBodyPartEncodings")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.webservicesMod.webservices.PartEncoding]
  
  /**
    * Creates and returns a new PartEncoding instance in the SDK and on the server.
    * The new PartEncoding will be automatically stored in the 'requestHeaderPartEncoding' property
    * of the parent OperationInfo element passed as argument.
    */
  /* static member */
  @scala.inline
  def createInOperationInfoUnderRequestHeaderPartEncoding(container: typings.mendixmodelsdk.webservicesMod.webservices.OperationInfo): typings.mendixmodelsdk.webservicesMod.webservices.PartEncoding = ^.asInstanceOf[js.Dynamic].applyDynamic("createInOperationInfoUnderRequestHeaderPartEncoding")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.webservicesMod.webservices.PartEncoding]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.PartEncoding.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.PartEncoding.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
