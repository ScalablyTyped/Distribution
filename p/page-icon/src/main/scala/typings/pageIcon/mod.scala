package typings.pageIcon

import typings.pageIcon.PageIcon.FetchOptions
import typings.pageIcon.PageIcon.Icon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(url: String): js.Promise[Icon] = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Icon]]
  inline def apply(url: String, opts: FetchOptions): js.Promise[Icon] = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Icon]]
  
  @JSImport("page-icon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
