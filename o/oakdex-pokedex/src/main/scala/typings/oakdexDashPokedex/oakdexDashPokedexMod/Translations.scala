package typings.oakdexDashPokedex.oakdexDashPokedexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Translations extends js.Object {
  var cz: js.UndefOr[String] = js.undefined
  var de: String
  var dk: js.UndefOr[String] = js.undefined
  var en: String
  var es: js.UndefOr[String] = js.undefined
  var fr: js.UndefOr[String] = js.undefined
  var gr: js.UndefOr[String] = js.undefined
  var it: js.UndefOr[String] = js.undefined
  var jp: js.UndefOr[String] = js.undefined
  var pl: js.UndefOr[String] = js.undefined
  var tr: js.UndefOr[String] = js.undefined
}

object Translations {
  @scala.inline
  def apply(
    de: String,
    en: String,
    cz: String = null,
    dk: String = null,
    es: String = null,
    fr: String = null,
    gr: String = null,
    it: String = null,
    jp: String = null,
    pl: String = null,
    tr: String = null
  ): Translations = {
    val __obj = js.Dynamic.literal(de = de, en = en)
    if (cz != null) __obj.updateDynamic("cz")(cz)
    if (dk != null) __obj.updateDynamic("dk")(dk)
    if (es != null) __obj.updateDynamic("es")(es)
    if (fr != null) __obj.updateDynamic("fr")(fr)
    if (gr != null) __obj.updateDynamic("gr")(gr)
    if (it != null) __obj.updateDynamic("it")(it)
    if (jp != null) __obj.updateDynamic("jp")(jp)
    if (pl != null) __obj.updateDynamic("pl")(pl)
    if (tr != null) __obj.updateDynamic("tr")(tr)
    __obj.asInstanceOf[Translations]
  }
}

