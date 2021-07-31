package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutGridAlignment")
@js.native
class LayoutGridAlignment protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object LayoutGridAlignment {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutGridAlignment")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutGridAlignment.Center")
  @js.native
  def Center: LayoutGridAlignment = js.native
  @scala.inline
  def Center_=(x: LayoutGridAlignment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Center")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutGridAlignment.End")
  @js.native
  def End: LayoutGridAlignment = js.native
  @scala.inline
  def End_=(x: LayoutGridAlignment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("End")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutGridAlignment.None")
  @js.native
  def None: LayoutGridAlignment = js.native
  @scala.inline
  def None_=(x: LayoutGridAlignment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutGridAlignment.Start")
  @js.native
  def Start: LayoutGridAlignment = js.native
  @scala.inline
  def Start_=(x: LayoutGridAlignment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Start")(x.asInstanceOf[js.Any])
}
