package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postman-collection", "Cookie")
@js.native
class Cookie ()
  extends PropertyBase[CookieDefinition]
     with CookieDefinition {
  def this(options: CookieDefinition) = this()
  /* CompleteClass */
  override var domain: java.lang.String = js.native
  @JSName("expires")
  var expires_Cookie: stdLib.Date = js.native
  /* CompleteClass */
  override var path: java.lang.String = js.native
  def update(options: CookieDefinition): scala.Unit = js.native
}

@JSImport("postman-collection", "Cookie")
@js.native
object Cookie extends js.Object {
  def isCookie(obj: js.Any): scala.Boolean = js.native
  def parse(str: java.lang.String): postmanDashCollectionLib.postmanDashCollectionMod.CookieDefinition = js.native
  def splitParam(param: java.lang.String): postmanDashCollectionLib.Anon_KeyValue = js.native
}

