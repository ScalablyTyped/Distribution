package typings.ol

import typings.std.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workerWebglMod {
  
  @JSImport("ol/worker/webgl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(): Worker = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Worker]
}
