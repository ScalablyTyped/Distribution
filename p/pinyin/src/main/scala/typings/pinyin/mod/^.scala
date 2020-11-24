package typings.pinyin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pinyin", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * 转换中文字符为拼音。可以设定拼音风格，可以打开多音字选项，也可以打开分词。
    * @example
    * pinyin("中心") // returns [ [ 'zhōng' ], [ 'xīn' ] ]
    */
  def apply(words: String): js.Array[js.Array[String]] = js.native
  def apply(words: String, options: Options): js.Array[js.Array[String]] = js.native
}
