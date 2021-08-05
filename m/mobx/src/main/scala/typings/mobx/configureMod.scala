package typings.mobx

import typings.mobx.anon.ComputedConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configureMod {
  
  @JSImport("mobx/lib/api/configure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def configure(options: ComputedConfigurable): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
