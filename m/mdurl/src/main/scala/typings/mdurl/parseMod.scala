package typings.mdurl

import typings.mdurl.mod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseMod {
  
  @scala.inline
  def apply(input: String): Url = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[Url]
  @scala.inline
  def apply(input: String, slashesDenoteHost: Boolean): Url = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], slashesDenoteHost.asInstanceOf[js.Any])).asInstanceOf[Url]
  
  @JSImport("mdurl/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
