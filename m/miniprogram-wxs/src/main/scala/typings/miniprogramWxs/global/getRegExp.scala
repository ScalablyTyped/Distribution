package typings.miniprogramWxs.global

import typings.miniprogramWxs.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("getRegExp")
@js.native
object getRegExp extends js.Object {
  
  /**
    * 生成 regexp 对象需要使用 getRegExp函数。
    * @param pattern : 正则表达式的内容
    * @param flags ：修饰符`g`: global;`i`: ignoreCase; `m`: multiline
    */
  def apply(pattern: String): RegExp = js.native
  def apply(pattern: String, flags: String): RegExp = js.native
}
