package typings.parameterize

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(s: String): String = ^.asInstanceOf[js.Dynamic].apply(s.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(s: String, num_chars: Double): String = (^.asInstanceOf[js.Dynamic].apply(s.asInstanceOf[js.Any], num_chars.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(s: String, num_chars: Double, delimiter: String): String = (^.asInstanceOf[js.Dynamic].apply(s.asInstanceOf[js.Any], num_chars.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(s: String, num_chars: Unit, delimiter: String): String = (^.asInstanceOf[js.Dynamic].apply(s.asInstanceOf[js.Any], num_chars.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("parameterize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
