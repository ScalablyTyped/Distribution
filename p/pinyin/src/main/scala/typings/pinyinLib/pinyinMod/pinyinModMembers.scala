package typings
package pinyinLib.pinyinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pinyin", JSImport.Namespace)
@js.native
object pinyinModMembers extends js.Object {
  /**
    * 首字母风格，只返回拼音的首字母部分。
    * 如：p y
    */
  val STYLE_FIRST_LETTER: scala.Double = js.native
  /**
    * 声母风格，只返回各个拼音的声母部分。对于没有声母的汉字，返回空白字符串。
    * 如：中国 的拼音 zh g
    * 注：声母风格会区分 zh 和 z，ch 和 c，sh 和 s。
    * 部分汉字没有声母，如 啊，饿 等，另外 y, w, yu 都不是声母， 这些汉字的拼音声母风格会返回 ""
    */
  val STYLE_INITIALS: scala.Double = js.native
  /**
    * 普通风格，即不带声调。
    * 如：pin yin
    */
  val STYLE_NORMAL: scala.Double = js.native
  /**
    * 声调风格 3，即拼音声调以数字形式在注音字符之后，用数字 [0-4] 进行表示。
    * 如：pi1n yi1n
    */
  val STYLE_TO3NE: scala.Double = js.native
  /**
    * 声调风格，拼音声调在韵母第一个字母上。
    * 如：pīn yīn
    */
  val STYLE_TONE: scala.Double = js.native
  /**
    * 声调风格 2，即拼音声调以数字形式在各个拼音之后，用数字 [0-4] 进行表示。
    * 如：pin1 yin1
    */
  val STYLE_TONE2: scala.Double = js.native
  /**
    * 转换中文字符为拼音。可以设定拼音风格，可以打开多音字选项，也可以打开分词。
    * @example
    * pinyin("中心") // returns [ [ 'zhōng' ], [ 'xīn' ] ]
    */
  def apply(words: java.lang.String): js.Array[js.Array[java.lang.String]] = js.native
  def apply(words: java.lang.String, options: pinyinLib.pinyinMod.pinyinNs.Options): js.Array[js.Array[java.lang.String]] = js.native
  /**
    * 按拼音比较两个字符串 a 和 b 的顺序。
    * 如果返回 -1 表示 a 在 b 前
    * 如果返回  0 表示 a 和 b 顺序相同
    * 如果返回  1 表示 a 在 b 后
    */
  def compare(a: java.lang.String, b: java.lang.String): pinyinLib.pinyinLibNumbers.`-1` | pinyinLib.pinyinLibNumbers.`0` | pinyinLib.pinyinLibNumbers.`1` = js.native
}

