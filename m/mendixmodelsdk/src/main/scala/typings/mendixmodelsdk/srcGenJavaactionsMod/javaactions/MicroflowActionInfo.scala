package typings.mendixmodelsdk.srcGenJavaactionsMod.javaactions

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenImagesMod.images.IImage
import typings.mendixmodelsdk.srcGenJavaactionsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.21.0: deleted
  * In version 6.10.0: removed experimental
  * In version 6.6.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.srcGenJavaactionsMod.javaactions.IMicroflowActionInfo because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsJavaAction, caption, category, icon, iconQualifiedName */ @JSImport("mendixmodelsdk/src/gen/javaactions", "javaactions.MicroflowActionInfo")
@js.native
open class MicroflowActionInfo protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def caption: String = js.native
  def caption_=(newValue: String): Unit = js.native
  @JSName("caption")
  val caption_FMicroflowActionInfo: String = js.native
  
  def category: String = js.native
  def category_=(newValue: String): Unit = js.native
  @JSName("category")
  val category_FMicroflowActionInfo: String = js.native
  
  def containerAsJavaAction: JavaAction = js.native
  @JSName("containerAsJavaAction")
  val containerAsJavaAction_FMicroflowActionInfo: IJavaAction = js.native
  
  def icon: IImage | Null = js.native
  
  def iconQualifiedName: String | Null = js.native
  @JSName("iconQualifiedName")
  val iconQualifiedName_FMicroflowActionInfo: String | Null = js.native
  
  def icon_=(newValue: IImage | Null): Unit = js.native
  @JSName("icon")
  val icon_FMicroflowActionInfo: IImage | Null = js.native
}
object MicroflowActionInfo {
  
  @JSImport("mendixmodelsdk/src/gen/javaactions", "javaactions.MicroflowActionInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new MicroflowActionInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): MicroflowActionInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[MicroflowActionInfo]
  
  /**
    * Creates and returns a new MicroflowActionInfo instance in the SDK and on the server.
    * The new MicroflowActionInfo will be automatically stored in the 'microflowActionInfo' property
    * of the parent JavaAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 to 7.20.0
    */
  /* static member */
  inline def createIn(container: JavaAction): MicroflowActionInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[MicroflowActionInfo]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/javaactions", "javaactions.MicroflowActionInfo.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/javaactions", "javaactions.MicroflowActionInfo.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
