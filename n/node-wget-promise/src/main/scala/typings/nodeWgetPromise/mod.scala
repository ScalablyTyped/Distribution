package typings.nodeWgetPromise

import typings.nodeWgetPromise.anon.OnProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(source: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def apply(source: String, options: OnProgress): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("node-wget-promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
