package typings.mendixmodelsdk.mod.microflows

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenRestMod.rest.ConsumedODataService
import typings.mendixmodelsdk.srcGenRestMod.rest.InteractiveRest
import typings.mendixmodelsdk.srcGenRestMod.rest.InteractiveRestOperation
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "microflows.HttpConfiguration")
@js.native
open class HttpConfiguration protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.microflows.HttpConfiguration {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object HttpConfiguration {
  
  @JSImport("mendixmodelsdk", "microflows.HttpConfiguration")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.HttpConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.HttpConfiguration]
  
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
    * of the parent WebServiceCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.5.0
    */
  /* static member */
  inline def createIn(container: typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.WebServiceCallAction): typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.HttpConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.HttpConfiguration]
  
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
    * of the parent rest.ConsumedODataService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInConsumedODataServiceUnderHttpConfiguration(container: ConsumedODataService): typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.HttpConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConsumedODataServiceUnderHttpConfiguration")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.HttpConfiguration]
  
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
    * of the parent rest.InteractiveRestOperation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.22.0 and higher
    */
  /* static member */
  inline def createInInteractiveRestOperationUnderHttpConfiguration(container: InteractiveRestOperation): typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.HttpConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("createInInteractiveRestOperationUnderHttpConfiguration")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.HttpConfiguration]
  
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
    * of the parent rest.InteractiveRest element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.18.0 to 9.22.0
    */
  /* static member */
  inline def createInInteractiveRestUnderHttpConfiguration(container: InteractiveRest): typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.HttpConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("createInInteractiveRestUnderHttpConfiguration")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.HttpConfiguration]
  
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
    * of the parent RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 and higher
    */
  /* static member */
  inline def createInRestCallActionUnderHttpConfiguration(container: typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.RestCallAction): typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.HttpConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestCallActionUnderHttpConfiguration")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.HttpConfiguration]
  
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
    * of the parent WebServiceCallAction element passed as argument.
    */
  /* static member */
  inline def createInWebServiceCallActionUnderHttpConfiguration(container: typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.WebServiceCallAction): typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.HttpConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebServiceCallActionUnderHttpConfiguration")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.HttpConfiguration]
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.HttpConfiguration.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.HttpConfiguration.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
