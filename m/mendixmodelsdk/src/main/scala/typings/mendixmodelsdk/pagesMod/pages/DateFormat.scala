package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.DateFormat")
@js.native
class DateFormat protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object DateFormat {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DateFormat")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DateFormat.Custom")
  @js.native
  def Custom: DateFormat = js.native
  @scala.inline
  def Custom_=(x: DateFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Custom")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DateFormat.Date")
  @js.native
  def Date: DateFormat = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DateFormat.DateTime")
  @js.native
  def DateTime: DateFormat = js.native
  @scala.inline
  def DateTime_=(x: DateFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DateTime")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def Date_=(x: DateFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Date")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DateFormat.Time")
  @js.native
  def Time: DateFormat = js.native
  @scala.inline
  def Time_=(x: DateFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Time")(x.asInstanceOf[js.Any])
}
