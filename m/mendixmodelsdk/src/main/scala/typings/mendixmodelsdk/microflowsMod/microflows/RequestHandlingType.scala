package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.RequestHandlingType")
@js.native
class RequestHandlingType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object RequestHandlingType {
  
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.RequestHandlingType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.RequestHandlingType.Advanced")
  @js.native
  def Advanced: RequestHandlingType = js.native
  @scala.inline
  def Advanced_=(x: RequestHandlingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Advanced")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.RequestHandlingType.Binary")
  @js.native
  def Binary: RequestHandlingType = js.native
  @scala.inline
  def Binary_=(x: RequestHandlingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Binary")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.RequestHandlingType.Custom")
  @js.native
  def Custom: RequestHandlingType = js.native
  @scala.inline
  def Custom_=(x: RequestHandlingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Custom")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.RequestHandlingType.FormData")
  @js.native
  def FormData: RequestHandlingType = js.native
  @scala.inline
  def FormData_=(x: RequestHandlingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FormData")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.RequestHandlingType.Mapping")
  @js.native
  def Mapping: RequestHandlingType = js.native
  @scala.inline
  def Mapping_=(x: RequestHandlingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Mapping")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.RequestHandlingType.Simple")
  @js.native
  def Simple: RequestHandlingType = js.native
  @scala.inline
  def Simple_=(x: RequestHandlingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Simple")(x.asInstanceOf[js.Any])
}
