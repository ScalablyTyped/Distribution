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
    val __obj = js.Dynamic.literal(de = de.asInstanceOf[js.Any], en = en.asInstanceOf[js.Any])
    if (cz != null) __obj.updateDynamic("cz")(cz.asInstanceOf[js.Any])
    if (dk != null) __obj.updateDynamic("dk")(dk.asInstanceOf[js.Any])
    if (es != null) __obj.updateDynamic("es")(es.asInstanceOf[js.Any])
    if (fr != null) __obj.updateDynamic("fr")(fr.asInstanceOf[js.Any])
    if (gr != null) __obj.updateDynamic("gr")(gr.asInstanceOf[js.Any])
    if (it != null) __obj.updateDynamic("it")(it.asInstanceOf[js.Any])
    if (jp != null) __obj.updateDynamic("jp")(jp.asInstanceOf[js.Any])
    if (pl != null) __obj.updateDynamic("pl")(pl.asInstanceOf[js.Any])
    if (tr != null) __obj.updateDynamic("tr")(tr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Translations]
  }
}

