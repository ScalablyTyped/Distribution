package typings.nightmare.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nightmare", "Cookies")
@js.native
class Cookies () extends js.Object {
  
  def clear(): Nightmare = js.native
  def clear(name: String): Nightmare = js.native
  
  def clearAll(): Nightmare = js.native
  
  def get(): js.Array[ICookie] = js.native
  def get(name: String): ICookie = js.native
  def get(query: ICookieQuery): js.Array[ICookie] = js.native
  
  def set(cookies: js.Array[ICookie]): Nightmare = js.native
  def set(cookie: ICookie): Nightmare = js.native
  def set(name: String, value: String): Nightmare = js.native
}
