package typings.pinyin.pinyinMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 声母风格，只返回各个拼音的声母部分。对于没有声母的汉字，返回空白字符串。
  * 如：中国 的拼音 zh g
  * 注：声母风格会区分 zh 和 z，ch 和 c，sh 和 s。
  * 部分汉字没有声母，如 啊，饿 等，另外 y, w, yu 都不是声母， 这些汉字的拼音声母风格会返回 ""
  */
@JSImport("pinyin", "STYLE_INITIALS")
@js.native
object STYLE_INITIALS extends TopLevel[Double]

