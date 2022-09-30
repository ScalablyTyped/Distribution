package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/microflows", "microflows.RequestProxyType")
@js.native
open class RequestProxyType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object RequestProxyType {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.RequestProxyType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.RequestProxyType.DefaultProxy")
  @js.native
  def DefaultProxy: RequestProxyType = js.native
  inline def DefaultProxy_=(x: RequestProxyType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultProxy")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.RequestProxyType.NoProxy")
  @js.native
  def NoProxy: RequestProxyType = js.native
  inline def NoProxy_=(x: RequestProxyType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NoProxy")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.RequestProxyType.Override")
  @js.native
  def Override: RequestProxyType = js.native
  inline def Override_=(x: RequestProxyType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Override")(x.asInstanceOf[js.Any])
}
