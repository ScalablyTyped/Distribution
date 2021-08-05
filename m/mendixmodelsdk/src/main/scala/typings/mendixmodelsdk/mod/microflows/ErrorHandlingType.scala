package typings.mendixmodelsdk.mod.microflows

import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "microflows.ErrorHandlingType")
@js.native
class ErrorHandlingType protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.microflows.ErrorHandlingType {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object ErrorHandlingType {
  
  @JSImport("mendixmodelsdk", "microflows.ErrorHandlingType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.ErrorHandlingType.Abort")
  @js.native
  def Abort: typings.mendixmodelsdk.microflowsMod.microflows.ErrorHandlingType = js.native
  inline def Abort_=(x: typings.mendixmodelsdk.microflowsMod.microflows.ErrorHandlingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Abort")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.ErrorHandlingType.Continue")
  @js.native
  def Continue: typings.mendixmodelsdk.microflowsMod.microflows.ErrorHandlingType = js.native
  inline def Continue_=(x: typings.mendixmodelsdk.microflowsMod.microflows.ErrorHandlingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Continue")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.ErrorHandlingType.Custom")
  @js.native
  def Custom: typings.mendixmodelsdk.microflowsMod.microflows.ErrorHandlingType = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.ErrorHandlingType.CustomWithoutRollBack")
  @js.native
  def CustomWithoutRollBack: typings.mendixmodelsdk.microflowsMod.microflows.ErrorHandlingType = js.native
  inline def CustomWithoutRollBack_=(x: typings.mendixmodelsdk.microflowsMod.microflows.ErrorHandlingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CustomWithoutRollBack")(x.asInstanceOf[js.Any])
  
  inline def Custom_=(x: typings.mendixmodelsdk.microflowsMod.microflows.ErrorHandlingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Custom")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.ErrorHandlingType.Rollback")
  @js.native
  def Rollback: typings.mendixmodelsdk.microflowsMod.microflows.ErrorHandlingType = js.native
  inline def Rollback_=(x: typings.mendixmodelsdk.microflowsMod.microflows.ErrorHandlingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Rollback")(x.asInstanceOf[js.Any])
}
