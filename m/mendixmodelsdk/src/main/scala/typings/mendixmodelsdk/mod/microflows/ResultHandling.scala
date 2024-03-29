package typings.mendixmodelsdk.mod.microflows

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "microflows.ResultHandling")
@js.native
open class ResultHandling protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.microflows.ResultHandling {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object ResultHandling {
  
  @JSImport("mendixmodelsdk", "microflows.ResultHandling")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ResultHandling instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.ResultHandling = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.ResultHandling]
  
  /**
    * Creates and returns a new ResultHandling instance in the SDK and on the server.
    * The new ResultHandling will be automatically stored in the 'resultHandling' property
    * of the parent ImportXmlAction element passed as argument.
    */
  /* static member */
  inline def createInImportXmlActionUnderResultHandling(container: typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.ImportXmlAction): typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.ResultHandling = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImportXmlActionUnderResultHandling")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.ResultHandling]
  
  /**
    * Creates and returns a new ResultHandling instance in the SDK and on the server.
    * The new ResultHandling will be automatically stored in the 'resultHandling' property
    * of the parent RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 and higher
    */
  /* static member */
  inline def createInRestCallActionUnderResultHandling(container: typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.RestCallAction): typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.ResultHandling = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestCallActionUnderResultHandling")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.ResultHandling]
  
  /**
    * Creates and returns a new ResultHandling instance in the SDK and on the server.
    * The new ResultHandling will be automatically stored in the 'resultHandling' property
    * of the parent WebServiceCallAction element passed as argument.
    */
  /* static member */
  inline def createInWebServiceCallActionUnderResultHandling(container: typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.WebServiceCallAction): typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.ResultHandling = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebServiceCallActionUnderResultHandling")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.ResultHandling]
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.ResultHandling.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.ResultHandling.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
