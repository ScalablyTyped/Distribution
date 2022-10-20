package typings.mendixmodelsdk.srcGenRestMod.rest

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.srcGenRestMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/published-odata-microflow relevant section in reference guide}
  *
  * In version 9.19.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/rest", "rest.PublishedODataMicroflow")
@js.native
open class PublishedODataMicroflow protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsPublishedODataService: PublishedODataService = js.native
  
  def description: String = js.native
  def description_=(newValue: String): Unit = js.native
  
  def exposedName: String = js.native
  def exposedName_=(newValue: String): Unit = js.native
  
  def microflow: IMicroflow = js.native
  
  def microflowQualifiedName: String = js.native
  
  def microflow_=(newValue: IMicroflow): Unit = js.native
  
  def summary: String = js.native
  def summary_=(newValue: String): Unit = js.native
}
object PublishedODataMicroflow {
  
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.PublishedODataMicroflow")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new PublishedODataMicroflow instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): PublishedODataMicroflow = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[PublishedODataMicroflow]
  
  /**
    * Creates and returns a new PublishedODataMicroflow instance in the SDK and on the server.
    * The new PublishedODataMicroflow will be automatically stored in the 'microflows' property
    * of the parent PublishedODataService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.19.0 and higher
    */
  /* static member */
  inline def createIn(container: PublishedODataService): PublishedODataMicroflow = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[PublishedODataMicroflow]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.PublishedODataMicroflow.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.PublishedODataMicroflow.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
