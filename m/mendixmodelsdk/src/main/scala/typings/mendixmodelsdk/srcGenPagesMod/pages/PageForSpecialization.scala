package typings.mendixmodelsdk.srcGenPagesMod.pages

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IEntity
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

@JSImport("mendixmodelsdk/src/gen/pages", "pages.PageForSpecialization")
@js.native
open class PageForSpecialization protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsGridEditButton: GridEditButton = js.native
  
  def containerAsPageClientAction: PageClientAction = js.native
  
  def entity: IEntity = js.native
  
  def entityQualifiedName: String = js.native
  
  def entity_=(newValue: IEntity): Unit = js.native
  
  def pageSettings: PageSettings = js.native
  def pageSettings_=(newValue: PageSettings): Unit = js.native
}
object PageForSpecialization {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.PageForSpecialization")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new PageForSpecialization instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): PageForSpecialization = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[PageForSpecialization]
  
  /**
    * Creates and returns a new PageForSpecialization instance in the SDK and on the server.
    * The new PageForSpecialization will be automatically stored in the 'pagesForSpecializations' property
    * of the parent GridEditButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.16.0
    */
  /* static member */
  inline def createInGridEditButtonUnderPagesForSpecializations(container: GridEditButton): PageForSpecialization = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGridEditButtonUnderPagesForSpecializations")(container.asInstanceOf[js.Any]).asInstanceOf[PageForSpecialization]
  
  /**
    * Creates and returns a new PageForSpecialization instance in the SDK and on the server.
    * The new PageForSpecialization will be automatically stored in the 'pagesForSpecializations' property
    * of the parent PageClientAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  inline def createInPageClientActionUnderPagesForSpecializations(container: PageClientAction): PageForSpecialization = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageClientActionUnderPagesForSpecializations")(container.asInstanceOf[js.Any]).asInstanceOf[PageForSpecialization]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.PageForSpecialization.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.PageForSpecialization.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
