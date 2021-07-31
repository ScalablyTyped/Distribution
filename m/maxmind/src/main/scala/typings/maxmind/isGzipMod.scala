package typings.maxmind

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isGzipMod {
  
  @JSImport("maxmind/lib/is-gzip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(buf: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(buf.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
