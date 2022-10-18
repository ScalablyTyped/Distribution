package typings.mendixmodelsdk.mod.pages

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.17.0: added public
  */
@JSImport("mendixmodelsdk", "pages.LayoutCall")
@js.native
open class LayoutCall protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.pages.LayoutCall {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object LayoutCall {
  
  @JSImport("mendixmodelsdk", "pages.LayoutCall")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new LayoutCall instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenPagesMod.pages.LayoutCall = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.LayoutCall]
  
  /**
    * Creates and returns a new LayoutCall instance in the SDK and on the server.
    * The new LayoutCall will be automatically stored in the 'layoutCall' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.23.0
    */
  /* static member */
  inline def createInLayoutUnderLayoutCall(container: typings.mendixmodelsdk.srcGenPagesMod.pages.Layout): typings.mendixmodelsdk.srcGenPagesMod.pages.LayoutCall = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderLayoutCall")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.LayoutCall]
  
  /**
    * Creates and returns a new LayoutCall instance in the SDK and on the server.
    * The new LayoutCall will be automatically stored in the 'layoutCall' property
    * of the parent PageTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 and higher
    */
  /* static member */
  inline def createInPageTemplateUnderLayoutCall(container: typings.mendixmodelsdk.srcGenPagesMod.pages.PageTemplate): typings.mendixmodelsdk.srcGenPagesMod.pages.LayoutCall = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageTemplateUnderLayoutCall")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.LayoutCall]
  
  /**
    * Creates and returns a new LayoutCall instance in the SDK and on the server.
    * The new LayoutCall will be automatically stored in the 'layoutCall' property
    * of the parent Page element passed as argument.
    */
  /* static member */
  inline def createInPageUnderLayoutCall(container: typings.mendixmodelsdk.srcGenPagesMod.pages.Page): typings.mendixmodelsdk.srcGenPagesMod.pages.LayoutCall = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageUnderLayoutCall")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.LayoutCall]
  
  /**
    * Creates and returns a new LayoutCall instance in the SDK and on the server.
    * The new LayoutCall will be automatically stored in the 'layoutCall' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInWebLayoutContentUnderLayoutCall(container: typings.mendixmodelsdk.srcGenPagesMod.pages.WebLayoutContent): typings.mendixmodelsdk.srcGenPagesMod.pages.LayoutCall = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebLayoutContentUnderLayoutCall")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.LayoutCall]
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LayoutCall.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LayoutCall.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
