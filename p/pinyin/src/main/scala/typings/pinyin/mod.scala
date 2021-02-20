package typings.pinyin

import typings.pinyin.pinyinNumbers.`-1`
import typings.pinyin.pinyinNumbers.`0`
import typings.pinyin.pinyinNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * 转换中文字符为拼音。可以设定拼音风格，可以打开多音字选项，也可以打开分词。
    * @example
    * pinyin("中心") // returns [ [ 'zhōng' ], [ 'xīn' ] ]
    */
  @JSImport("pinyin", JSImport.Namespace)
  @js.native
  def apply(words: String): js.Array[js.Array[String]] = js.native
  @JSImport("pinyin", JSImport.Namespace)
  @js.native
  def apply(words: String, options: Options): js.Array[js.Array[String]] = js.native
  
  /**
    * 首字母风格，只返回拼音的首字母部分。
    * 如：p y
    */
  @JSImport("pinyin", "STYLE_FIRST_LETTER")
  @js.native
  val STYLE_FIRST_LETTER: Double = js.native
  
  /**
    * 声母风格，只返回各个拼音的声母部分。对于没有声母的汉字，返回空白字符串。
    * 如：中国 的拼音 zh g
    * 注：声母风格会区分 zh 和 z，ch 和 c，sh 和 s。
    * 部分汉字没有声母，如 啊，饿 等，另外 y, w, yu 都不是声母， 这些汉字的拼音声母风格会返回 ""
    */
  @JSImport("pinyin", "STYLE_INITIALS")
  @js.native
  val STYLE_INITIALS: Double = js.native
  
  /**
    * 普通风格，即不带声调。
    * 如：pin yin
    */
  @JSImport("pinyin", "STYLE_NORMAL")
  @js.native
  val STYLE_NORMAL: Double = js.native
  
  /**
    * 声调风格 3，即拼音声调以数字形式在注音字符之后，用数字 [0-4] 进行表示。
    * 如：pi1n yi1n
    */
  @JSImport("pinyin", "STYLE_TO3NE")
  @js.native
  val STYLE_TO3NE: Double = js.native
  
  /**
    * 声调风格，拼音声调在韵母第一个字母上。
    * 如：pīn yīn
    */
  @JSImport("pinyin", "STYLE_TONE")
  @js.native
  val STYLE_TONE: Double = js.native
  
  /**
    * 声调风格 2，即拼音声调以数字形式在各个拼音之后，用数字 [0-4] 进行表示。
    * 如：pin1 yin1
    */
  @JSImport("pinyin", "STYLE_TONE2")
  @js.native
  val STYLE_TONE2: Double = js.native
  
  /**
    * 按拼音比较两个字符串 a 和 b 的顺序。
    * 如果返回 -1 表示 a 在 b 前
    * 如果返回  0 表示 a 和 b 顺序相同
    * 如果返回  1 表示 a 在 b 后
    */
  @JSImport("pinyin", "compare")
  @js.native
  def compare(a: String, b: String): `-1` | `0` | `1` = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * 是否启用多音字模式，默认关闭。
      * 关闭多音字模式时，返回每个汉字第一个匹配的拼音。
      * 启用多音字模式时，返回多音字的所有拼音列表。
      */
    var heteronym: js.UndefOr[Boolean] = js.native
    
    /**
      * 是否启用分词模式，默认关闭。
      * 中文分词有助于极大的降低多音字问题。但性能会极大的下降，内存也会使用更多。
      */
    var segment: js.UndefOr[Boolean] = js.native
    
    /**
      * 设置拼音风格，默认风格是 {@link STYLE_TONE}
      * @see {@link STYLE_NORMAL}
      * @see {@link STYLE_TONE}
      * @see {@link STYLE_TONE2}
      * @see {@link STYLE_TO3NE}
      * @see {@link STYLE_INITIALS}
      * @see {@link STYLE_FIRST_LETTER}
      */
    var style: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeteronym(value: Boolean): Self = StObject.set(x, "heteronym", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeteronymUndefined: Self = StObject.set(x, "heteronym", js.undefined)
      
      @scala.inline
      def setSegment(value: Boolean): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
      
      @scala.inline
      def setStyle(value: Double): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
