package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSource")
@js.native
class ReferenceSetSource protected () extends GridBaseSource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object ReferenceSetSource {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ReferenceSetSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSource.create")
  @js.native
  def create(model: IModel): ReferenceSetSource = js.native
  
  /**
    * Creates and returns a new ReferenceSetSource instance in the SDK and on the server.
    * The new ReferenceSetSource will be automatically stored in the 'dataSource' property
    * of the parent EntityWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 8.2.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSource.createIn")
  @js.native
  def createIn(container: EntityWidget): ReferenceSetSource = js.native
  
  /**
    * Creates and returns a new ReferenceSetSource instance in the SDK and on the server.
    * The new ReferenceSetSource will be automatically stored in the 'dataSource' property
    * of the parent EntityWidget element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSource.createInEntityWidgetUnderDataSource")
  @js.native
  def createInEntityWidgetUnderDataSource(container: EntityWidget): ReferenceSetSource = js.native
  
  /**
    * Creates and returns a new ReferenceSetSource instance in the SDK and on the server.
    * The new ReferenceSetSource will be automatically stored in the 'dataSource' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.3.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSource.createInWidgetValueUnderDataSource")
  @js.native
  def createInWidgetValueUnderDataSource(container: WidgetValue): ReferenceSetSource = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSource.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSource.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
