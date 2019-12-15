package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SingleSearchField")
@js.native
abstract class SingleSearchField protected () extends SearchField {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FSingleSearchField: IModel = js.native
  /**
    * The value of this property is conceptually of type paths.LegacyAttributePath.
    *
    * In version 7.11.0: deleted
    */
  def attributePath(): String = js.native
  def attributePath(newValue: String): js.Any = js.native
  /**
    * In version 7.11.0: introduced
    */
  def attributeRef(): AttributeRef | Null = js.native
  def attributeRef(newValue: AttributeRef): js.Any = js.native
  @JSName("attributeRef")
  def attributeRef_Any(): js.Any = js.native
  def operator(): SearchFieldOperator = js.native
  def operator(newValue: SearchFieldOperator): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SingleSearchField")
@js.native
object SingleSearchField extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

