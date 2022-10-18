package typings.mendixmodelsdk.srcGenPagesMod.pages

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
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
  * In version 8.6.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/pages", "pages.RetrievalQueryParameter")
@js.native
open class RetrievalQueryParameter protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsRetrievalQuery: RetrievalQuery = js.native
  
  def containerAsRuntimeOperation: RuntimeOperation = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  
  def `type`: String = js.native
  def type_=(newValue: String): Unit = js.native
}
object RetrievalQueryParameter {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.RetrievalQueryParameter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new RetrievalQueryParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): RetrievalQueryParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[RetrievalQueryParameter]
  
  /**
    * Creates and returns a new RetrievalQueryParameter instance in the SDK and on the server.
    * The new RetrievalQueryParameter will be automatically stored in the 'parameters' property
    * of the parent RetrievalQuery element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.6.0 to 9.16.0
    */
  /* static member */
  inline def createIn(container: RetrievalQuery): RetrievalQueryParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[RetrievalQueryParameter]
  
  /**
    * Creates and returns a new RetrievalQueryParameter instance in the SDK and on the server.
    * The new RetrievalQueryParameter will be automatically stored in the 'parameters' property
    * of the parent RetrievalQuery element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.6.0 and higher
    */
  /* static member */
  inline def createInRetrievalQueryUnderParameters(container: RetrievalQuery): RetrievalQueryParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRetrievalQueryUnderParameters")(container.asInstanceOf[js.Any]).asInstanceOf[RetrievalQueryParameter]
  
  /**
    * Creates and returns a new RetrievalQueryParameter instance in the SDK and on the server.
    * The new RetrievalQueryParameter will be automatically stored in the 'parameters' property
    * of the parent RuntimeOperation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.17.0 and higher
    */
  /* static member */
  inline def createInRuntimeOperationUnderParameters(container: RuntimeOperation): RetrievalQueryParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRuntimeOperationUnderParameters")(container.asInstanceOf[js.Any]).asInstanceOf[RetrievalQueryParameter]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.RetrievalQueryParameter.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.RetrievalQueryParameter.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
