package typings.mendixmodelsdk.srcGenPagesMod.pages

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.EntityRef
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

@JSImport("mendixmodelsdk/src/gen/pages", "pages.SelectorXPathSource")
@js.native
open class SelectorXPathSource protected () extends SelectorSource {
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
    * The value of this property is conceptually of type paths.LegacyEntityPath.
    *
    * In version 7.11.0: deleted
    */
  def constrainedBy: IList[String] = js.native
  
  /**
    * In version 7.11.0: introduced
    */
  def constrainedByRefs: IList[EntityRef] = js.native
  
  /**
    * In version 8.0.0: deleted
    */
  def removeAllFromContext: Boolean = js.native
  def removeAllFromContext_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 8.0.0: deleted
    */
  def removeFromContextEntities: IList[IEntity] = js.native
  
  def removeFromContextEntitiesQualifiedNames: js.Array[String] = js.native
  
  def sortBar: GridSortBar = js.native
  def sortBar_=(newValue: GridSortBar): Unit = js.native
  
  /**
    * The value of this property is conceptually of type xPathConstraints.XPathConstraint.
    */
  def xPathConstraint: String = js.native
  def xPathConstraint_=(newValue: String): Unit = js.native
}
object SelectorXPathSource {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SelectorXPathSource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new SelectorXPathSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): SelectorXPathSource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[SelectorXPathSource]
  
  /**
    * Creates and returns a new SelectorXPathSource instance in the SDK and on the server.
    * The new SelectorXPathSource will be automatically stored in the 'selectorSource' property
    * of the parent AssociationWidget element passed as argument.
    */
  /* static member */
  inline def createIn(container: AssociationWidget): SelectorXPathSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[SelectorXPathSource]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SelectorXPathSource.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SelectorXPathSource.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
