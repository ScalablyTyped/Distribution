package typings.mendixmodelsdk.srcGenPagesMod.pages

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/pages", "pages.GridXPathSource")
@js.native
open class GridXPathSource protected () extends GridBaseSource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * In version 8.0.0: deleted
    */
  def applyContext: Boolean = js.native
  def applyContext_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 8.0.0: deleted
    */
  def removeAllFromContext: Boolean = js.native
  def removeAllFromContext_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 8.0.0: deleted
    */
  def removeFromContextIds: IList[IEntity] = js.native
  
  def removeFromContextIdsQualifiedNames: js.Array[String] = js.native
  
  /**
    * The value of this property is conceptually of type xPathConstraints.XPathConstraint.
    */
  def xPathConstraint: String = js.native
  def xPathConstraint_=(newValue: String): Unit = js.native
}
object GridXPathSource {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.GridXPathSource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new GridXPathSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): GridXPathSource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[GridXPathSource]
  
  /**
    * Creates and returns a new GridXPathSource instance in the SDK and on the server.
    * The new GridXPathSource will be automatically stored in the 'dataSource' property
    * of the parent EntityWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 8.2.0
    */
  /* static member */
  inline def createIn(container: EntityWidget): GridXPathSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[GridXPathSource]
  
  /**
    * Creates and returns a new GridXPathSource instance in the SDK and on the server.
    * The new GridXPathSource will be automatically stored in the 'dataSource' property
    * of the parent EntityWidget element passed as argument.
    */
  /* static member */
  inline def createInEntityWidgetUnderDataSource(container: EntityWidget): GridXPathSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createInEntityWidgetUnderDataSource")(container.asInstanceOf[js.Any]).asInstanceOf[GridXPathSource]
  
  /**
    * Creates and returns a new GridXPathSource instance in the SDK and on the server.
    * The new GridXPathSource will be automatically stored in the 'dataSource' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.3.0 and higher
    */
  /* static member */
  inline def createInWidgetValueUnderDataSource(container: WidgetValue): GridXPathSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderDataSource")(container.asInstanceOf[js.Any]).asInstanceOf[GridXPathSource]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.GridXPathSource.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.GridXPathSource.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
