package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.DataViewReadOnlyStyle")
@js.native
class DataViewReadOnlyStyle protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object DataViewReadOnlyStyle {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DataViewReadOnlyStyle")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DataViewReadOnlyStyle.Control")
  @js.native
  def Control: DataViewReadOnlyStyle = js.native
  inline def Control_=(x: DataViewReadOnlyStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Control")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DataViewReadOnlyStyle.Text")
  @js.native
  def Text: DataViewReadOnlyStyle = js.native
  inline def Text_=(x: DataViewReadOnlyStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Text")(x.asInstanceOf[js.Any])
}
