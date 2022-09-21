package typings.oidcProvider.anon

import typings.oidcProvider.mod.CookiesSetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Get extends StObject {
  
  def get(name: String): js.UndefOr[String] = js.native
  def get(name: String, opts: Signed): js.UndefOr[String] = js.native
  
  def set(name: String): Unit = js.native
  def set(name: String, value: String): Unit = js.native
  def set(name: String, value: String, opts: CookiesSetOptions): Unit = js.native
  def set(name: String, value: Null, opts: CookiesSetOptions): Unit = js.native
}
