package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/pages", "pages.NewButtonEditLocation")
@js.native
open class NewButtonEditLocation protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object NewButtonEditLocation {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.NewButtonEditLocation")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.NewButtonEditLocation.Form")
  @js.native
  def Form: NewButtonEditLocation = js.native
  inline def Form_=(x: NewButtonEditLocation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Form")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.NewButtonEditLocation.InlineAtBottom")
  @js.native
  def InlineAtBottom: NewButtonEditLocation = js.native
  inline def InlineAtBottom_=(x: NewButtonEditLocation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InlineAtBottom")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.NewButtonEditLocation.InlineAtTop")
  @js.native
  def InlineAtTop: NewButtonEditLocation = js.native
  inline def InlineAtTop_=(x: NewButtonEditLocation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InlineAtTop")(x.asInstanceOf[js.Any])
}
