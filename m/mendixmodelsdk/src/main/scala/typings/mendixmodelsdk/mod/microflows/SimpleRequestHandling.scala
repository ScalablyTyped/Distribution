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

@JSImport("mendixmodelsdk", "microflows.SimpleRequestHandling")
@js.native
open class SimpleRequestHandling protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.microflows.SimpleRequestHandling {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object SimpleRequestHandling {
  
  @JSImport("mendixmodelsdk", "microflows.SimpleRequestHandling")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new SimpleRequestHandling instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.SimpleRequestHandling = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.SimpleRequestHandling]
  
  /**
    * Creates and returns a new SimpleRequestHandling instance in the SDK and on the server.
    * The new SimpleRequestHandling will be automatically stored in the 'requestHandling' property
    * of the parent RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 and higher
    */
  /* static member */
  inline def createInRestCallActionUnderRequestHandling(container: typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.RestCallAction): typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.SimpleRequestHandling = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestCallActionUnderRequestHandling")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.SimpleRequestHandling]
  
  /**
    * Creates and returns a new SimpleRequestHandling instance in the SDK and on the server.
    * The new SimpleRequestHandling will be automatically stored in the 'requestBodyHandling' property
    * of the parent WebServiceCallAction element passed as argument.
    */
  /* static member */
  inline def createInWebServiceCallActionUnderRequestBodyHandling(container: typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.WebServiceCallAction): typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.SimpleRequestHandling = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebServiceCallActionUnderRequestBodyHandling")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.SimpleRequestHandling]
  
  /**
    * Creates and returns a new SimpleRequestHandling instance in the SDK and on the server.
    * The new SimpleRequestHandling will be automatically stored in the 'requestHeaderHandling' property
    * of the parent WebServiceCallAction element passed as argument.
    */
  /* static member */
  inline def createInWebServiceCallActionUnderRequestHeaderHandling(container: typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.WebServiceCallAction): typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.SimpleRequestHandling = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebServiceCallActionUnderRequestHeaderHandling")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.SimpleRequestHandling]
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.SimpleRequestHandling.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.SimpleRequestHandling.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
