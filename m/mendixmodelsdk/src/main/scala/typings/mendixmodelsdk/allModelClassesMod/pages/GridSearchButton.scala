package typings.mendixmodelsdk.allModelClassesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/control-bar relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.GridSearchButton")
@js.native
class GridSearchButton protected ()
  extends typings.mendixmodelsdk.pagesMod.pages.GridSearchButton {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object GridSearchButton {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.GridSearchButton")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new GridSearchButton instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.GridSearchButton.create")
  @js.native
  def create(model: IModel): typings.mendixmodelsdk.pagesMod.pages.GridSearchButton = js.native
  
  /**
    * Creates and returns a new GridSearchButton instance in the SDK and on the server.
    * The new GridSearchButton will be automatically stored in the 'items' property
    * of the parent ControlBar element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.GridSearchButton.createIn")
  @js.native
  def createIn(container: typings.mendixmodelsdk.pagesMod.pages.ControlBar): typings.mendixmodelsdk.pagesMod.pages.GridSearchButton = js.native
  
  /**
    * Creates and returns a new GridSearchButton instance in the SDK and on the server.
    * The new GridSearchButton will be automatically stored in the 'items' property
    * of the parent ControlBar element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.GridSearchButton.createInControlBarUnderItems")
  @js.native
  def createInControlBarUnderItems(container: typings.mendixmodelsdk.pagesMod.pages.ControlBar): typings.mendixmodelsdk.pagesMod.pages.GridSearchButton = js.native
  
  /**
    * Creates and returns a new GridSearchButton instance in the SDK and on the server.
    * The new GridSearchButton will be automatically stored in the 'searchButton' property
    * of the parent GridControlBar element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.GridSearchButton.createInGridControlBarUnderSearchButton")
  @js.native
  def createInGridControlBarUnderSearchButton(container: typings.mendixmodelsdk.pagesMod.pages.GridControlBar): typings.mendixmodelsdk.pagesMod.pages.GridSearchButton = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.GridSearchButton.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.GridSearchButton.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
