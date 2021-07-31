package typings.normalizePath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(path: String): String = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(path: String, stripTrailing: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], stripTrailing.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("normalize-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
