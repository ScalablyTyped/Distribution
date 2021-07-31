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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "pages.StaticOrDynamicString")
@js.native
class StaticOrDynamicString protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.pages.StaticOrDynamicString {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object StaticOrDynamicString {
  
  @JSImport("mendixmodelsdk", "pages.StaticOrDynamicString")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new StaticOrDynamicString instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): typings.mendixmodelsdk.pagesMod.pages.StaticOrDynamicString = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.StaticOrDynamicString]
  
  /**
    * Creates and returns a new StaticOrDynamicString instance in the SDK and on the server.
    * The new StaticOrDynamicString will be automatically stored in the 'address' property
    * of the parent LinkButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.2.0
    */
  /* static member */
  @scala.inline
  def createInLinkButtonUnderAddress(container: typings.mendixmodelsdk.pagesMod.pages.LinkButton): typings.mendixmodelsdk.pagesMod.pages.StaticOrDynamicString = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLinkButtonUnderAddress")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.StaticOrDynamicString]
  
  /**
    * Creates and returns a new StaticOrDynamicString instance in the SDK and on the server.
    * The new StaticOrDynamicString will be automatically stored in the 'address' property
    * of the parent OpenLinkClientAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.3.0 and higher
    */
  /* static member */
  @scala.inline
  def createInOpenLinkClientActionUnderAddress(container: typings.mendixmodelsdk.pagesMod.pages.OpenLinkClientAction): typings.mendixmodelsdk.pagesMod.pages.StaticOrDynamicString = ^.asInstanceOf[js.Dynamic].applyDynamic("createInOpenLinkClientActionUnderAddress")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.StaticOrDynamicString]
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.StaticOrDynamicString.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.StaticOrDynamicString.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
