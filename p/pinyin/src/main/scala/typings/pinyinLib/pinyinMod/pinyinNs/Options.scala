package typings
package pinyinLib.pinyinMod.pinyinNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * 是否启用多音字模式，默认关闭。
    * 关闭多音字模式时，返回每个汉字第一个匹配的拼音。
    * 启用多音字模式时，返回多音字的所有拼音列表。
    */
  var heteronym: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 是否启用分词模式，默认关闭。
    * 中文分词有助于极大的降低多音字问题。但性能会极大的下降，内存也会使用更多。
    */
  var segment: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 设置拼音风格，默认风格是 {@link STYLE_TONE}
    * @see {@link STYLE_NORMAL}
    * @see {@link STYLE_TONE}
    * @see {@link STYLE_TONE2}
    * @see {@link STYLE_TO3NE}
    * @see {@link STYLE_INITIALS}
    * @see {@link STYLE_FIRST_LETTER}
    */
  var style: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    heteronym: js.UndefOr[scala.Boolean] = js.undefined,
    segment: js.UndefOr[scala.Boolean] = js.undefined,
    style: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(heteronym)) __obj.updateDynamic("heteronym")(heteronym)
    if (!js.isUndefined(segment)) __obj.updateDynamic("segment")(segment)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

