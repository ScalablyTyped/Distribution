package typings.mendixmodelsdk.srcGenAllModelClassesMod.webservices

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

@JSImport("mendixmodelsdk/src/gen/all-model-classes", "webservices.PartEncoding")
@js.native
open class PartEncoding protected ()
  extends typings.mendixmodelsdk.srcGenWebservicesMod.webservices.PartEncoding {
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
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "webservices.PartEncoding")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new PartEncoding instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenWebservicesMod.webservices.PartEncoding = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenWebservicesMod.webservices.PartEncoding]
  
  /**
    * Creates and returns a new PartEncoding instance in the SDK and on the server.
    * The new PartEncoding will be automatically stored in the 'requestBodyPartEncodings' property
    * of the parent OperationInfo element passed as argument.
    */
  /* static member */
  inline def createInOperationInfoUnderRequestBodyPartEncodings(container: typings.mendixmodelsdk.srcGenWebservicesMod.webservices.OperationInfo): typings.mendixmodelsdk.srcGenWebservicesMod.webservices.PartEncoding = ^.asInstanceOf[js.Dynamic].applyDynamic("createInOperationInfoUnderRequestBodyPartEncodings")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenWebservicesMod.webservices.PartEncoding]
  
  /**
    * Creates and returns a new PartEncoding instance in the SDK and on the server.
    * The new PartEncoding will be automatically stored in the 'requestHeaderPartEncoding' property
    * of the parent OperationInfo element passed as argument.
    */
  /* static member */
  inline def createInOperationInfoUnderRequestHeaderPartEncoding(container: typings.mendixmodelsdk.srcGenWebservicesMod.webservices.OperationInfo): typings.mendixmodelsdk.srcGenWebservicesMod.webservices.PartEncoding = ^.asInstanceOf[js.Dynamic].applyDynamic("createInOperationInfoUnderRequestHeaderPartEncoding")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenWebservicesMod.webservices.PartEncoding]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "webservices.PartEncoding.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "webservices.PartEncoding.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
