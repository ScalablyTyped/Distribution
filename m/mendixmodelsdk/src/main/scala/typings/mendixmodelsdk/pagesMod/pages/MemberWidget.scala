package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.MemberWidget")
@js.native
abstract class MemberWidget protected () extends InputWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FMemberWidget: IModel = js.native
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
  /**
    * In version 6.9.0: introduced
    */
  def readOnlyStyle: ReadOnlyStyle = js.native
  def readOnlyStyle_=(newValue: ReadOnlyStyle): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.MemberWidget")
@js.native
object MemberWidget extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

