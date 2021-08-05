package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.LogLevel")
@js.native
class LogLevel protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object LogLevel {
  
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.LogLevel")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.LogLevel.Critical")
  @js.native
  def Critical: LogLevel = js.native
  inline def Critical_=(x: LogLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Critical")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.LogLevel.Debug")
  @js.native
  def Debug: LogLevel = js.native
  inline def Debug_=(x: LogLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Debug")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.LogLevel.Error")
  @js.native
  def Error: LogLevel = js.native
  inline def Error_=(x: LogLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Error")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.LogLevel.Info")
  @js.native
  def Info: LogLevel = js.native
  inline def Info_=(x: LogLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Info")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.LogLevel.Trace")
  @js.native
  def Trace: LogLevel = js.native
  inline def Trace_=(x: LogLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Trace")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.LogLevel.Warning")
  @js.native
  def Warning: LogLevel = js.native
  inline def Warning_=(x: LogLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Warning")(x.asInstanceOf[js.Any])
}
