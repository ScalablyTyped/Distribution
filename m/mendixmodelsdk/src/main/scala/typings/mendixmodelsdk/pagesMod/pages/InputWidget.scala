package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.textsMod.texts.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputWidget")
@js.native
abstract class InputWidget protected () extends ConditionallyEditableWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * In version 7.18.0: deleted
    */
  def label: Text | Null = js.native
  
  /**
    * In version 7.18.0: introduced
    */
  def labelTemplate: ClientTemplate | Null = js.native
  def labelTemplate_=(newValue: ClientTemplate | Null): Unit = js.native
  
  def label_=(newValue: Text | Null): Unit = js.native
  
  /**
    * In version 8.12.0: introduced
    */
  def screenReaderLabel: ClientTemplate | Null = js.native
  def screenReaderLabel_=(newValue: ClientTemplate | Null): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputWidget")
@js.native
object InputWidget extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
