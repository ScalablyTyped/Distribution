package typings.parseurl

import typings.node.httpMod.IncomingMessage
import typings.node.urlMod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(req: IncomingMessage): js.UndefOr[Url] = ^.asInstanceOf[js.Dynamic].apply(req.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Url]]
  
  @JSImport("parseurl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def original(req: IncomingMessage): js.UndefOr[Url] = ^.asInstanceOf[js.Dynamic].applyDynamic("original")(req.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Url]]
}
