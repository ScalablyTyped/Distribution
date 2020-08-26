package typings.mendixmodelsdk.allModelClassesMod.pages

import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/image relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.Icon")
@js.native
abstract class Icon protected ()
  extends typings.mendixmodelsdk.pagesMod.pages.Icon {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.Icon")
@js.native
object Icon extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

