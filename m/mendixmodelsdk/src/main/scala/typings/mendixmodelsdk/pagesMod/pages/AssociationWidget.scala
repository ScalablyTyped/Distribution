package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.AssociationWidget")
@js.native
abstract class AssociationWidget protected () extends MemberWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * In version 7.13.0: introduced
    */
  def onChangeAction: ClientAction = js.native
  def onChangeAction_=(newValue: ClientAction): Unit = js.native
  
  /**
    * In version 7.13.0: deleted
    */
  def onChangeMicroflowSettings: MicroflowSettings = js.native
  def onChangeMicroflowSettings_=(newValue: MicroflowSettings): Unit = js.native
  
  def selectPageSettings: PageSettings = js.native
  def selectPageSettings_=(newValue: PageSettings): Unit = js.native
  
  def selectorSource: SelectorSource = js.native
  def selectorSource_=(newValue: SelectorSource): Unit = js.native
}
object AssociationWidget {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.AssociationWidget")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.AssociationWidget.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.AssociationWidget.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
