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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.6.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.WidgetValidation")
@js.native
class WidgetValidation protected ()
  extends typings.mendixmodelsdk.pagesMod.pages.WidgetValidation {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object WidgetValidation {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.WidgetValidation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new WidgetValidation instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.pagesMod.pages.WidgetValidation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.WidgetValidation]
  
  /**
    * Creates and returns a new WidgetValidation instance in the SDK and on the server.
    * The new WidgetValidation will be automatically stored in the 'validation' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.6.0 and higher
    */
  /* static member */
  inline def createInAttributeWidgetUnderValidation(container: typings.mendixmodelsdk.pagesMod.pages.AttributeWidget): typings.mendixmodelsdk.pagesMod.pages.WidgetValidation = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderValidation")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.WidgetValidation]
  
  /**
    * Creates and returns a new WidgetValidation instance in the SDK and on the server.
    * The new WidgetValidation will be automatically stored in the 'validation' property
    * of the parent ReferenceSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.6.0 and higher
    */
  /* static member */
  inline def createInReferenceSelectorUnderValidation(container: typings.mendixmodelsdk.pagesMod.pages.ReferenceSelector): typings.mendixmodelsdk.pagesMod.pages.WidgetValidation = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReferenceSelectorUnderValidation")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.WidgetValidation]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.WidgetValidation.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.WidgetValidation.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
