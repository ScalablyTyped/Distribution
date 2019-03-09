package typings
package oakdexDashPokedexLib.oakdexDashPokedexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Translations extends js.Object {
  var cz: js.UndefOr[java.lang.String] = js.undefined
  var de: java.lang.String
  var dk: js.UndefOr[java.lang.String] = js.undefined
  var en: java.lang.String
  var es: js.UndefOr[java.lang.String] = js.undefined
  var fr: js.UndefOr[java.lang.String] = js.undefined
  var gr: js.UndefOr[java.lang.String] = js.undefined
  var it: js.UndefOr[java.lang.String] = js.undefined
  var jp: js.UndefOr[java.lang.String] = js.undefined
  var pl: js.UndefOr[java.lang.String] = js.undefined
  var tr: js.UndefOr[java.lang.String] = js.undefined
}

object Translations {
  @scala.inline
  def apply(
    de: java.lang.String,
    en: java.lang.String,
    cz: java.lang.String = null,
    dk: java.lang.String = null,
    es: java.lang.String = null,
    fr: java.lang.String = null,
    gr: java.lang.String = null,
    it: java.lang.String = null,
    jp: java.lang.String = null,
    pl: java.lang.String = null,
    tr: java.lang.String = null
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

