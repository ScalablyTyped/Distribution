package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClickTypeType")
@js.native
class ClickTypeType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object ClickTypeType {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClickTypeType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClickTypeType.Double")
  @js.native
  def Double: ClickTypeType = js.native
  @scala.inline
  def Double_=(x: ClickTypeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Double")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClickTypeType.Single")
  @js.native
  def Single: ClickTypeType = js.native
  @scala.inline
  def Single_=(x: ClickTypeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Single")(x.asInstanceOf[js.Any])
}
