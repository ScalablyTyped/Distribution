package typings.moviedb.mod.MovieDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpokenLanguage extends js.Object {
  var iso_639_1: Double = js.native
  var name: String = js.native
}

object SpokenLanguage {
  @scala.inline
  def apply(iso_639_1: Double, name: String): SpokenLanguage = {
    val __obj = js.Dynamic.literal(iso_639_1 = iso_639_1.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpokenLanguage]
  }
  @scala.inline
  implicit class SpokenLanguageOps[Self <: SpokenLanguage] (val x: Self) extends AnyVal {
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
    def setIso_639_1(value: Double): Self = this.set("iso_639_1", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

