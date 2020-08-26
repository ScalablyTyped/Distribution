package typings.oracleOraclejet.ojrefresherMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojrefresher.ojRefresherSettableProperties> */
@js.native
trait ojRefresherSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var refreshContent: js.UndefOr[js.Function0[js.Promise[_]]] = js.native
  var target: js.UndefOr[Element] = js.native
  var text: js.UndefOr[String] = js.native
  var threshold: js.UndefOr[Double] = js.native
  var translations: js.UndefOr[js.Object | Null] = js.native
}

object ojRefresherSettablePropertiesLenient {
  @scala.inline
  def apply(): ojRefresherSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojRefresherSettablePropertiesLenient]
  }
  @scala.inline
  implicit class ojRefresherSettablePropertiesLenientOps[Self <: ojRefresherSettablePropertiesLenient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRefreshContent(value: () => js.Promise[_]): Self = this.set("refreshContent", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRefreshContent: Self = this.set("refreshContent", js.undefined)
    @scala.inline
    def setTarget(value: Element): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
    @scala.inline
    def setTranslations(value: js.Object): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
    @scala.inline
    def setTranslationsNull: Self = this.set("translations", null)
  }
  
}

