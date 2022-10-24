package typings.next

import typings.next.anon.HybridAmp
import typings.next.distServerRenderMod.RenderOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerPostProcessMod {
  
  @JSImport("next/dist/server/post-process", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def postProcessHTML(pathname: String, content: String, renderOpts: RenderOpts, param3: HybridAmp): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("postProcessHTML")(pathname.asInstanceOf[js.Any], content.asInstanceOf[js.Any], renderOpts.asInstanceOf[js.Any], param3.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
