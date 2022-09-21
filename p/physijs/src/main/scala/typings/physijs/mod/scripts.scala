package typings.physijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scripts {
  
  @JSImport("physijs", "scripts")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("physijs", "scripts.ammo")
  @js.native
  def ammo: String = js.native
  inline def ammo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ammo")(x.asInstanceOf[js.Any])
  
  @JSImport("physijs", "scripts.worker")
  @js.native
  def worker: String = js.native
  inline def worker_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("worker")(x.asInstanceOf[js.Any])
}
