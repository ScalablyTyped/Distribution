package typings.mendixmodelsdk.mod.customwidgets

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenPagesMod.pages.EntityWidget
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.5.0: introduced
  */
@JSImport("mendixmodelsdk", "customwidgets.CustomWidgetXPathSource")
@js.native
open class CustomWidgetXPathSource protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.customwidgets.CustomWidgetXPathSource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object CustomWidgetXPathSource {
  
  @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetXPathSource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new CustomWidgetXPathSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetXPathSource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetXPathSource]
  
  /**
    * Creates and returns a new CustomWidgetXPathSource instance in the SDK and on the server.
    * The new CustomWidgetXPathSource will be automatically stored in the 'dataSource' property
    * of the parent pages.EntityWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  /* static member */
  inline def createInEntityWidgetUnderDataSource(container: EntityWidget): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetXPathSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createInEntityWidgetUnderDataSource")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetXPathSource]
  
  /**
    * Creates and returns a new CustomWidgetXPathSource instance in the SDK and on the server.
    * The new CustomWidgetXPathSource will be automatically stored in the 'dataSource' property
    * of the parent WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  /* static member */
  inline def createInWidgetValueUnderDataSource(container: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetXPathSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderDataSource")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetXPathSource]
  
  /* static member */
  @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetXPathSource.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetXPathSource.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
