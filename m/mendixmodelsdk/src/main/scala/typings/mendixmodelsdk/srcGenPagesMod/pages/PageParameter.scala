package typings.mendixmodelsdk.srcGenPagesMod.pages

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DataType
import typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IDataType
import typings.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 9.4.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.srcGenPagesMod.pages.IPageParameter because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsPage, name, parameterType */ @JSImport("mendixmodelsdk/src/gen/pages", "pages.PageParameter")
@js.native
open class PageParameter protected ()
  extends Element[IModel]
     with IByNameReferrable {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsPage: Page = js.native
  @JSName("containerAsPage")
  val containerAsPage_FPageParameter: IPage = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  @JSName("name")
  val name_FPageParameter: String = js.native
  
  def parameterType: DataType = js.native
  def parameterType_=(newValue: DataType): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("parameterType")
  val parameterType_FPageParameter: IDataType = js.native
  
  /**
    * Returns the qualified name of this element, or
    * null if this element is not a part of the model,
    * or if it or one of its namespace containers does not have a
    * valid name.
    */
  /* CompleteClass */
  override val qualifiedName: String | Null = js.native
  @JSName("qualifiedName")
  def qualifiedName_MPageParameter: String | Null = js.native
}
object PageParameter {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.PageParameter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new PageParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): PageParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[PageParameter]
  
  /**
    * Creates and returns a new PageParameter instance in the SDK and on the server.
    * The new PageParameter will be automatically stored in the 'parameters' property
    * of the parent Page element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.4.0 and higher
    */
  /* static member */
  inline def createIn(container: Page): PageParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[PageParameter]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.PageParameter.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.PageParameter.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
