package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflowParameter
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.19.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.MicroflowParameterMapping")
@js.native
class MicroflowParameterMapping protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsMicroflowSettings: MicroflowSettings = js.native
  
  def parameter: IMicroflowParameter = js.native
  
  def parameterQualifiedName: String = js.native
  
  def parameter_=(newValue: IMicroflowParameter): Unit = js.native
  
  /**
    * In version 8.4.0: deleted
    */
  def useAllPages: Boolean = js.native
  def useAllPages_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 8.4.0: introduced
    */
  def variable: PageVariable = js.native
  def variable_=(newValue: PageVariable): Unit = js.native
  
  /**
    * In version 8.4.0: deleted
    */
  def widget: EntityWidget | Null = js.native
  
  def widgetLocalName: String | Null = js.native
  
  def widget_=(newValue: EntityWidget | Null): Unit = js.native
}
object MicroflowParameterMapping {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.MicroflowParameterMapping")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new MicroflowParameterMapping instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): MicroflowParameterMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[MicroflowParameterMapping]
  
  /**
    * Creates and returns a new MicroflowParameterMapping instance in the SDK and on the server.
    * The new MicroflowParameterMapping will be automatically stored in the 'parameterMappings' property
    * of the parent MicroflowSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.19.0 and higher
    */
  /* static member */
  @scala.inline
  def createIn(container: MicroflowSettings): MicroflowParameterMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[MicroflowParameterMapping]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.MicroflowParameterMapping.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.MicroflowParameterMapping.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
