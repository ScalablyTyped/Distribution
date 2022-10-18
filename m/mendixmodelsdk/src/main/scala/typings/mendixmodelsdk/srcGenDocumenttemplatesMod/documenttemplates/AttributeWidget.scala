package typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates

import typings.mendixmodelsdk.srcGenDocumenttemplatesMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("mendixmodelsdk/src/gen/documenttemplates", "documenttemplates.AttributeWidget")
@js.native
open class AttributeWidget protected () extends Widget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * The value of this property is conceptually of type paths.LegacyAttributePath.
    *
    * In version 7.11.0: deleted
    */
  def attributePath: String = js.native
  def attributePath_=(newValue: String): Unit = js.native
  
  /**
    * In version 7.11.0: introduced
    */
  def attributeRef: AttributeRef | Null = js.native
  def attributeRef_=(newValue: AttributeRef | Null): Unit = js.native
}
object AttributeWidget {
  
  @JSImport("mendixmodelsdk/src/gen/documenttemplates", "documenttemplates.AttributeWidget")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/documenttemplates", "documenttemplates.AttributeWidget.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/documenttemplates", "documenttemplates.AttributeWidget.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
