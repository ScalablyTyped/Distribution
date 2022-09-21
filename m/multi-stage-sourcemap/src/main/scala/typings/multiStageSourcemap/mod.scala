package typings.multiStageSourcemap

import typings.multiStageSourcemap.anon.FromSourceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("multi-stage-sourcemap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transfer(mappingObject: FromSourceMap): String = ^.asInstanceOf[js.Dynamic].applyDynamic("transfer")(mappingObject.asInstanceOf[js.Any]).asInstanceOf[String]
}
