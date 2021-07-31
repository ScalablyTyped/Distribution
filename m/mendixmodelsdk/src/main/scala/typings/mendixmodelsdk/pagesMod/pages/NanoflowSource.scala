package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.microflows.INanoflow
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.12.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.NanoflowSource")
@js.native
class NanoflowSource protected () extends DataSource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def nanoflow: INanoflow | Null = js.native
  
  def nanoflowQualifiedName: String | Null = js.native
  
  def nanoflow_=(newValue: INanoflow | Null): Unit = js.native
  
  /**
    * In version 7.19.0: introduced
    */
  def parameterMappings: IList[NanoflowParameterMapping] = js.native
}
object NanoflowSource {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NanoflowSource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new NanoflowSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): NanoflowSource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[NanoflowSource]
  
  /**
    * Creates and returns a new NanoflowSource instance in the SDK and on the server.
    * The new NanoflowSource will be automatically stored in the 'dataSource' property
    * of the parent EntityWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.12.0 to 8.2.0
    */
  /* static member */
  @scala.inline
  def createIn(container: EntityWidget): NanoflowSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[NanoflowSource]
  
  /**
    * Creates and returns a new NanoflowSource instance in the SDK and on the server.
    * The new NanoflowSource will be automatically stored in the 'dataSource' property
    * of the parent EntityWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.12.0 and higher
    */
  /* static member */
  @scala.inline
  def createInEntityWidgetUnderDataSource(container: EntityWidget): NanoflowSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createInEntityWidgetUnderDataSource")(container.asInstanceOf[js.Any]).asInstanceOf[NanoflowSource]
  
  /**
    * Creates and returns a new NanoflowSource instance in the SDK and on the server.
    * The new NanoflowSource will be automatically stored in the 'dataSource' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.3.0 and higher
    */
  /* static member */
  @scala.inline
  def createInWidgetValueUnderDataSource(container: WidgetValue): NanoflowSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderDataSource")(container.asInstanceOf[js.Any]).asInstanceOf[NanoflowSource]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NanoflowSource.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NanoflowSource.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
