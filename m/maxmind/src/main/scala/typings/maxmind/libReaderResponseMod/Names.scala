package typings.maxmind.libReaderResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Names extends js.Object {
  val de: js.UndefOr[String] = js.undefined
  val en: String
  val es: js.UndefOr[String] = js.undefined
  val fr: js.UndefOr[String] = js.undefined
  val ja: js.UndefOr[String] = js.undefined
  val `pt-BR`: js.UndefOr[String] = js.undefined
  val ru: js.UndefOr[String] = js.undefined
  val `zh-CN`: js.UndefOr[String] = js.undefined
}

object Names {
  @scala.inline
  def apply(
    en: String,
    de: String = null,
    es: String = null,
    fr: String = null,
    ja: String = null,
    `pt-BR`: String = null,
    ru: String = null,
    `zh-CN`: String = null
  ): Names = {
    val __obj = js.Dynamic.literal(en = en.asInstanceOf[js.Any])
    if (de != null) __obj.updateDynamic("de")(de.asInstanceOf[js.Any])
    if (es != null) __obj.updateDynamic("es")(es.asInstanceOf[js.Any])
    if (fr != null) __obj.updateDynamic("fr")(fr.asInstanceOf[js.Any])
    if (ja != null) __obj.updateDynamic("ja")(ja.asInstanceOf[js.Any])
    if (`pt-BR` != null) __obj.updateDynamic("pt-BR")(`pt-BR`.asInstanceOf[js.Any])
    if (ru != null) __obj.updateDynamic("ru")(ru.asInstanceOf[js.Any])
    if (`zh-CN` != null) __obj.updateDynamic("zh-CN")(`zh-CN`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Names]
  }
}

