package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.DesignPropertyValueType")
@js.native
class DesignPropertyValueType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object DesignPropertyValueType {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DesignPropertyValueType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DesignPropertyValueType.DropDown")
  @js.native
  def DropDown: DesignPropertyValueType = js.native
  inline def DropDown_=(x: DesignPropertyValueType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DropDown")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DesignPropertyValueType.Toggle")
  @js.native
  def Toggle: DesignPropertyValueType = js.native
  inline def Toggle_=(x: DesignPropertyValueType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Toggle")(x.asInstanceOf[js.Any])
}
