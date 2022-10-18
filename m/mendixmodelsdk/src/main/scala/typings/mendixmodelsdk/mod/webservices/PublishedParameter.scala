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

@JSImport("mendixmodelsdk", "webservices.PublishedParameter")
@js.native
open class PublishedParameter protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.webservices.PublishedParameter {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object PublishedParameter {
  
  @JSImport("mendixmodelsdk", "webservices.PublishedParameter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new PublishedParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenWebservicesMod.webservices.PublishedParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenWebservicesMod.webservices.PublishedParameter]
  
  /**
    * Creates and returns a new PublishedParameter instance in the SDK and on the server.
    * The new PublishedParameter will be automatically stored in the 'parameters' property
    * of the parent PublishedOperation element passed as argument.
    */
  /* static member */
  inline def createIn(container: typings.mendixmodelsdk.srcGenWebservicesMod.webservices.PublishedOperation): typings.mendixmodelsdk.srcGenWebservicesMod.webservices.PublishedParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenWebservicesMod.webservices.PublishedParameter]
  
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.PublishedParameter.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.PublishedParameter.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
