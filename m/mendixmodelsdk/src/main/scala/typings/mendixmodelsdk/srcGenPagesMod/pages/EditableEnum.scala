package typings.mendixmodelsdk.srcGenPagesMod.pages

import typings.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/pages", "pages.EditableEnum")
@js.native
open class EditableEnum protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object EditableEnum {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.EditableEnum")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.EditableEnum.Always")
  @js.native
  def Always: EditableEnum = js.native
  inline def Always_=(x: EditableEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Always")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.EditableEnum.Conditional")
  @js.native
  def Conditional: EditableEnum = js.native
  inline def Conditional_=(x: EditableEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Conditional")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.EditableEnum.Never")
  @js.native
  def Never: EditableEnum = js.native
  inline def Never_=(x: EditableEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Never")(x.asInstanceOf[js.Any])
}
