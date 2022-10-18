package typings.mendixmodelsdk.srcGenSettingsMod.settings

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenSettingsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/settings", "settings.Language")
@js.native
open class Language protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def checkCompleteness: Boolean = js.native
  def checkCompleteness_=(newValue: Boolean): Unit = js.native
  
  def code: String = js.native
  def code_=(newValue: String): Unit = js.native
  
  def containerAsLanguageSettings: LanguageSettings = js.native
  
  def customDateFormat: String = js.native
  def customDateFormat_=(newValue: String): Unit = js.native
  
  def customDateTimeFormat: String = js.native
  def customDateTimeFormat_=(newValue: String): Unit = js.native
  
  def customTimeFormat: String = js.native
  def customTimeFormat_=(newValue: String): Unit = js.native
}
object Language {
  
  @JSImport("mendixmodelsdk/src/gen/settings", "settings.Language")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new Language instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): Language = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[Language]
  
  /**
    * Creates and returns a new Language instance in the SDK and on the server.
    * The new Language will be automatically stored in the 'languages' property
    * of the parent LanguageSettings element passed as argument.
    */
  /* static member */
  inline def createIn(container: LanguageSettings): Language = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[Language]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/settings", "settings.Language.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/settings", "settings.Language.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
