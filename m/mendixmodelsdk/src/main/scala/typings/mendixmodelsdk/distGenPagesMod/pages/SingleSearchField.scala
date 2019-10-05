package typings.mendixmodelsdk.distGenPagesMod.pages

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
  /**
    * The value of this property is conceptually of type paths.LegacyAttributePath.
    *
    * In version 7.11.0: deleted
    */
  var attributePath: String = js.native
  /**
    * In version 7.11.0: introduced
    */
  var attributeRef: AttributeRef | Null = js.native
  var operator: SearchFieldOperator = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SingleSearchField")
@js.native
object SingleSearchField extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

