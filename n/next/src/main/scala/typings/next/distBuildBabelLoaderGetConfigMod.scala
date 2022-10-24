package typings.next

import typings.next.anon.Filename
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildBabelLoaderGetConfigMod {
  
  @JSImport("next/dist/build/babel/loader/get-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param1: Filename): BabelConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param1.asInstanceOf[js.Any]).asInstanceOf[BabelConfig]
  
  type BabelConfig = Any
}
