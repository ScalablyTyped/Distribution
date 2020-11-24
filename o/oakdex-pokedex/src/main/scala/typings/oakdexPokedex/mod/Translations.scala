package typings.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Translations extends js.Object {
  
  var cz: js.UndefOr[String] = js.native
  
  var de: String = js.native
  
  var dk: js.UndefOr[String] = js.native
  
  var en: String = js.native
  
  var es: js.UndefOr[String] = js.native
  
  var fr: js.UndefOr[String] = js.native
  
  var gr: js.UndefOr[String] = js.native
  
  var it: js.UndefOr[String] = js.native
  
  var jp: js.UndefOr[String] = js.native
  
  var pl: js.UndefOr[String] = js.native
  
  var tr: js.UndefOr[String] = js.native
}
object Translations {
  
  @scala.inline
  def apply(de: String, en: String): Translations = {
    val __obj = js.Dynamic.literal(de = de.asInstanceOf[js.Any], en = en.asInstanceOf[js.Any])
    __obj.asInstanceOf[Translations]
  }
  
  @scala.inline
  implicit class TranslationsOps[Self <: Translations] (val x: Self) extends AnyVal {
    
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
    def setDe(value: String): Self = this.set("de", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEn(value: String): Self = this.set("en", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCz(value: String): Self = this.set("cz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCz: Self = this.set("cz", js.undefined)
    
    @scala.inline
    def setDk(value: String): Self = this.set("dk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDk: Self = this.set("dk", js.undefined)
    
    @scala.inline
    def setEs(value: String): Self = this.set("es", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEs: Self = this.set("es", js.undefined)
    
    @scala.inline
    def setFr(value: String): Self = this.set("fr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFr: Self = this.set("fr", js.undefined)
    
    @scala.inline
    def setGr(value: String): Self = this.set("gr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGr: Self = this.set("gr", js.undefined)
    
    @scala.inline
    def setIt(value: String): Self = this.set("it", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIt: Self = this.set("it", js.undefined)
    
    @scala.inline
    def setJp(value: String): Self = this.set("jp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJp: Self = this.set("jp", js.undefined)
    
    @scala.inline
    def setPl(value: String): Self = this.set("pl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePl: Self = this.set("pl", js.undefined)
    
    @scala.inline
    def setTr(value: String): Self = this.set("tr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTr: Self = this.set("tr", js.undefined)
  }
}
