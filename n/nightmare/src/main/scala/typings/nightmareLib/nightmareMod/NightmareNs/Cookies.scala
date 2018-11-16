package typings
package nightmareLib.nightmareMod.NightmareNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cookies extends js.Object {
  def clear(): nightmareLib.nightmareMod.Nightmare = js.native
  def clear(name: java.lang.String): nightmareLib.nightmareMod.Nightmare = js.native
  def clearAll(): nightmareLib.nightmareMod.Nightmare = js.native
  def get(): js.Array[ICookie] = js.native
  def get(name: java.lang.String): ICookie = js.native
  def get(query: ICookieQuery): js.Array[ICookie] = js.native
  def set(cookie: ICookie): nightmareLib.nightmareMod.Nightmare = js.native
  def set(cookies: js.Array[ICookie]): nightmareLib.nightmareMod.Nightmare = js.native
  def set(name: java.lang.String, value: java.lang.String): nightmareLib.nightmareMod.Nightmare = js.native
}

