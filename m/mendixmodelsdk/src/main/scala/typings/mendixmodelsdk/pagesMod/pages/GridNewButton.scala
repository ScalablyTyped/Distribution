package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/control-bar relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.GridNewButton")
@js.native
class GridNewButton protected () extends GridControlBarButton {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def editLocation: NewButtonEditLocation = js.native
  def editLocation_=(newValue: NewButtonEditLocation): Unit = js.native
  
  def entity: IEntity | Null = js.native
  
  def entityQualifiedName: String | Null = js.native
  
  def entity_=(newValue: IEntity | Null): Unit = js.native
  
  /**
    * In version 6.2.0: deleted
    * In version 6.0.0: deprecated
    */
  def isPersistent: Boolean = js.native
  def isPersistent_=(newValue: Boolean): Unit = js.native
  
  def pageSettings: PageSettings = js.native
  def pageSettings_=(newValue: PageSettings): Unit = js.native
}
object GridNewButton {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.GridNewButton")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new GridNewButton instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): GridNewButton = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[GridNewButton]
  
  /**
    * Creates and returns a new GridNewButton instance in the SDK and on the server.
    * The new GridNewButton will be automatically stored in the 'items' property
    * of the parent ControlBar element passed as argument.
    */
  /* static member */
  @scala.inline
  def createIn(container: ControlBar): GridNewButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[GridNewButton]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.GridNewButton.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.GridNewButton.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
