package typings
package maxmindLib.maxmindMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Names extends js.Object {
  val de: js.UndefOr[java.lang.String] = js.undefined
  val en: java.lang.String
  val es: js.UndefOr[java.lang.String] = js.undefined
  val fr: js.UndefOr[java.lang.String] = js.undefined
  val ja: js.UndefOr[java.lang.String] = js.undefined
  val `pt-BR`: js.UndefOr[java.lang.String] = js.undefined
  val ru: js.UndefOr[java.lang.String] = js.undefined
  val `zh-CN`: js.UndefOr[java.lang.String] = js.undefined
}

object Names {
  @scala.inline
  def apply(
    en: java.lang.String,
    de: java.lang.String = null,
    es: java.lang.String = null,
    fr: java.lang.String = null,
    ja: java.lang.String = null,
    `pt-BR`: java.lang.String = null,
    ru: java.lang.String = null,
    `zh-CN`: java.lang.String = null
  ): Names = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("en")(en)
    if (de != null) __obj.updateDynamic("de")(de)
    if (es != null) __obj.updateDynamic("es")(es)
    if (fr != null) __obj.updateDynamic("fr")(fr)
    if (ja != null) __obj.updateDynamic("ja")(ja)
    if (`pt-BR` != null) __obj.updateDynamic("pt-BR")(`pt-BR`)
    if (ru != null) __obj.updateDynamic("ru")(ru)
    if (`zh-CN` != null) __obj.updateDynamic("zh-CN")(`zh-CN`)
    __obj.asInstanceOf[Names]
  }
}

