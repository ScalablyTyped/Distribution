package typings.mendixmodelsdk.srcGenMicroflowsMod.microflows

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/microflows", "microflows.SimpleRequestHandling")
@js.native
open class SimpleRequestHandling protected () extends RequestHandling {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * In version 6.7.0: introduced
    */
  def nullValueOption: NullValueOption = js.native
  def nullValueOption_=(newValue: NullValueOption): Unit = js.native
  
  def parameterMappings: IList[WebServiceOperationSimpleParameterMapping] = js.native
}
object SimpleRequestHandling {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.SimpleRequestHandling")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new SimpleRequestHandling instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): SimpleRequestHandling = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[SimpleRequestHandling]
  
  /**
    * Creates and returns a new SimpleRequestHandling instance in the SDK and on the server.
    * The new SimpleRequestHandling will be automatically stored in the 'requestHandling' property
    * of the parent RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 and higher
    */
  /* static member */
  inline def createInRestCallActionUnderRequestHandling(container: RestCallAction): SimpleRequestHandling = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestCallActionUnderRequestHandling")(container.asInstanceOf[js.Any]).asInstanceOf[SimpleRequestHandling]
  
  /**
    * Creates and returns a new SimpleRequestHandling instance in the SDK and on the server.
    * The new SimpleRequestHandling will be automatically stored in the 'requestBodyHandling' property
    * of the parent WebServiceCallAction element passed as argument.
    */
  /* static member */
  inline def createInWebServiceCallActionUnderRequestBodyHandling(container: WebServiceCallAction): SimpleRequestHandling = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebServiceCallActionUnderRequestBodyHandling")(container.asInstanceOf[js.Any]).asInstanceOf[SimpleRequestHandling]
  
  /**
    * Creates and returns a new SimpleRequestHandling instance in the SDK and on the server.
    * The new SimpleRequestHandling will be automatically stored in the 'requestHeaderHandling' property
    * of the parent WebServiceCallAction element passed as argument.
    */
  /* static member */
  inline def createInWebServiceCallActionUnderRequestHeaderHandling(container: WebServiceCallAction): SimpleRequestHandling = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebServiceCallActionUnderRequestHeaderHandling")(container.asInstanceOf[js.Any]).asInstanceOf[SimpleRequestHandling]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.SimpleRequestHandling.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.SimpleRequestHandling.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
