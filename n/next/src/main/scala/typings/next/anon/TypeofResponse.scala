package typings.next.anon

import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofResponse extends StObject {
  
  /* standard dom */
  def error(): typings.std.Response = js.native
  
  /* standard dom */
  def redirect(url: String): typings.std.Response = js.native
  def redirect(url: String, status: Double): typings.std.Response = js.native
  def redirect(url: URL): typings.std.Response = js.native
  def redirect(url: URL, status: Double): typings.std.Response = js.native
}
