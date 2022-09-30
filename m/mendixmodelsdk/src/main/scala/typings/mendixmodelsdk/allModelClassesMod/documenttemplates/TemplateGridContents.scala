package typings.mendixmodelsdk.allModelClassesMod.documenttemplates

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/all-model-classes", "documenttemplates.TemplateGridContents")
@js.native
open class TemplateGridContents protected ()
  extends typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.TemplateGridContents {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object TemplateGridContents {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "documenttemplates.TemplateGridContents")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new TemplateGridContents instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.TemplateGridContents = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.TemplateGridContents]
  
  /**
    * Creates and returns a new TemplateGridContents instance in the SDK and on the server.
    * The new TemplateGridContents will be automatically stored in the 'evenRowsContents' property
    * of the parent TemplateGrid element passed as argument.
    */
  /* static member */
  inline def createInTemplateGridUnderEvenRowsContents(container: typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.TemplateGrid): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.TemplateGridContents = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridUnderEvenRowsContents")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.TemplateGridContents]
  
  /**
    * Creates and returns a new TemplateGridContents instance in the SDK and on the server.
    * The new TemplateGridContents will be automatically stored in the 'oddRowsContents' property
    * of the parent TemplateGrid element passed as argument.
    */
  /* static member */
  inline def createInTemplateGridUnderOddRowsContents(container: typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.TemplateGrid): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.TemplateGridContents = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridUnderOddRowsContents")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.TemplateGridContents]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "documenttemplates.TemplateGridContents.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "documenttemplates.TemplateGridContents.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
