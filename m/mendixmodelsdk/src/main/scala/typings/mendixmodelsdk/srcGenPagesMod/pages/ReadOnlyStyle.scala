package typings.mendixmodelsdk.srcGenPagesMod.pages

import typings.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/pages", "pages.ReadOnlyStyle")
@js.native
open class ReadOnlyStyle protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object ReadOnlyStyle {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.ReadOnlyStyle")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.ReadOnlyStyle.Control")
  @js.native
  def Control: ReadOnlyStyle = js.native
  inline def Control_=(x: ReadOnlyStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Control")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.ReadOnlyStyle.Inherit")
  @js.native
  def Inherit: ReadOnlyStyle = js.native
  inline def Inherit_=(x: ReadOnlyStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Inherit")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.ReadOnlyStyle.Text")
  @js.native
  def Text: ReadOnlyStyle = js.native
  inline def Text_=(x: ReadOnlyStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Text")(x.asInstanceOf[js.Any])
}
