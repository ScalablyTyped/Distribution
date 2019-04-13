package typings
package nightmareLib.nightmareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nightmare", "Cookies")
@js.native
class Cookies () extends js.Object {
  def clear(): Nightmare = js.native
  def clear(name: java.lang.String): Nightmare = js.native
  def clearAll(): Nightmare = js.native
  def get(): js.Array[ICookie] = js.native
  def get(name: java.lang.String): ICookie = js.native
  def get(query: ICookieQuery): js.Array[ICookie] = js.native
  def set(cookie: ICookie): Nightmare = js.native
  def set(cookies: js.Array[ICookie]): Nightmare = js.native
  def set(name: java.lang.String, value: java.lang.String): Nightmare = js.native
}

