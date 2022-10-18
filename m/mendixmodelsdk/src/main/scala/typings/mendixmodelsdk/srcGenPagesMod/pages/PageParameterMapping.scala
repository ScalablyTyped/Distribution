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
  * In version 9.7.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/pages", "pages.PageParameterMapping")
@js.native
open class PageParameterMapping protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def argument: String = js.native
  def argument_=(newValue: String): Unit = js.native
  
  def containerAsPageSettings: PageSettings = js.native
  
  def parameter: IPageParameter = js.native
  
  def parameterQualifiedName: String = js.native
  
  def parameter_=(newValue: IPageParameter): Unit = js.native
  
  def variable: PageVariable = js.native
  def variable_=(newValue: PageVariable): Unit = js.native
}
object PageParameterMapping {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.PageParameterMapping")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new PageParameterMapping instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): PageParameterMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[PageParameterMapping]
  
  /**
    * Creates and returns a new PageParameterMapping instance in the SDK and on the server.
    * The new PageParameterMapping will be automatically stored in the 'parameterMappings' property
    * of the parent PageSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.7.0 and higher
    */
  /* static member */
  inline def createIn(container: PageSettings): PageParameterMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[PageParameterMapping]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.PageParameterMapping.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.PageParameterMapping.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
