package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Initialize
  extends /* key */ StringDictionary[js.Any] {
  var initialize: js.UndefOr[js.Function2[/* models */ js.Array[this.type], /* options */ js.Object, Unit]] = js.native
  var parse: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.native
  var parseSave: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.native
  var urlRoot: js.UndefOr[String] = js.native
  var validate: js.UndefOr[
    Null | js.Object | String | (js.Function2[/* attributes */ js.Object, /* options */ js.UndefOr[this.type], Double])
  ] = js.native
}

object Initialize {
  @scala.inline
  def apply(): Initialize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Initialize]
  }
  @scala.inline
  implicit class InitializeOps[Self <: Initialize] (val x: Self) extends AnyVal {
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
    def setInitialize(value: (/* models */ js.Array[Initialize], /* options */ js.Object) => Unit): Self = this.set("initialize", js.Any.fromFunction2(value))
    @scala.inline
    def deleteInitialize: Self = this.set("initialize", js.undefined)
    @scala.inline
    def setParse(value: /* data */ js.Any => _): Self = this.set("parse", js.Any.fromFunction1(value))
    @scala.inline
    def deleteParse: Self = this.set("parse", js.undefined)
    @scala.inline
    def setParseSave(value: /* data */ js.Any => _): Self = this.set("parseSave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteParseSave: Self = this.set("parseSave", js.undefined)
    @scala.inline
    def setUrlRoot(value: String): Self = this.set("urlRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlRoot: Self = this.set("urlRoot", js.undefined)
    @scala.inline
    def setValidateFunction2(value: (/* attributes */ js.Object, /* options */ js.UndefOr[Initialize]) => Double): Self = this.set("validate", js.Any.fromFunction2(value))
    @scala.inline
    def setValidate(
      value: js.Object | String | (js.Function2[/* attributes */ js.Object, /* options */ js.UndefOr[Initialize], Double])
    ): Self = this.set("validate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
    @scala.inline
    def setValidateNull: Self = this.set("validate", null)
  }
  
}

