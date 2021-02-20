package typings.mendixmodelsdk.mod.pages

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
  * In version 8.13.0: introduced
  */
@JSImport("mendixmodelsdk", "pages.EditPageTemplateType")
@js.native
class EditPageTemplateType protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.pages.EditPageTemplateType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object EditPageTemplateType {
  
  @JSImport("mendixmodelsdk", "pages.EditPageTemplateType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new EditPageTemplateType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.EditPageTemplateType.create")
  @js.native
  def create(model: IModel): typings.mendixmodelsdk.pagesMod.pages.EditPageTemplateType = js.native
  
  /**
    * Creates and returns a new EditPageTemplateType instance in the SDK and on the server.
    * The new EditPageTemplateType will be automatically stored in the 'templateType' property
    * of the parent PageTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.EditPageTemplateType.createIn")
  @js.native
  def createIn(container: typings.mendixmodelsdk.pagesMod.pages.PageTemplate): typings.mendixmodelsdk.pagesMod.pages.EditPageTemplateType = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.EditPageTemplateType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.EditPageTemplateType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
