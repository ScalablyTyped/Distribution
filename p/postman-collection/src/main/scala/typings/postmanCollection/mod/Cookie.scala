package typings.postmanCollection.mod

import typings.postmanCollection.AnonKey
import typings.postmanCollection.AnonValue
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped postman-collection.postman-collection.CookieDefinition extends 'key' ? never : postman-collection.postman-collection.CookieDefinition */ @JSImport("postman-collection", "Cookie")
@js.native
class Cookie () extends PropertyBase[CookieDefinition] {
  def this(options: CookieDefinition) = this()
  var domain: String = js.native
  var expires: Date = js.native
  var extensions: js.UndefOr[js.Array[AnonKey]] = js.native
  var hostOnly: js.UndefOr[Boolean] = js.native
  var httpOnly: js.UndefOr[Boolean] = js.native
  var maxAge: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var path: String = js.native
  var secure: js.UndefOr[Boolean] = js.native
  var session: js.UndefOr[Boolean] = js.native
  var value: js.UndefOr[String] = js.native
  def update(options: CookieDefinition): Unit = js.native
}

/* static members */
@JSImport("postman-collection", "Cookie")
@js.native
object Cookie extends js.Object {
  def isCookie(obj: js.Any): Boolean = js.native
  def parse(str: String): CookieDefinition = js.native
  def splitParam(param: String): AnonValue = js.native
}

