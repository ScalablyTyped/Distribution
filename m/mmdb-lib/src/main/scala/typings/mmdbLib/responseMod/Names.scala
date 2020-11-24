package typings.mmdbLib.responseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Names extends js.Object {
  
  val de: js.UndefOr[String] = js.native
  
  val en: String = js.native
  
  val es: js.UndefOr[String] = js.native
  
  val fr: js.UndefOr[String] = js.native
  
  val ja: js.UndefOr[String] = js.native
  
  val `pt-BR`: js.UndefOr[String] = js.native
  
  val ru: js.UndefOr[String] = js.native
  
  val `zh-CN`: js.UndefOr[String] = js.native
}
object Names {
  
  @scala.inline
  def apply(en: String): Names = {
    val __obj = js.Dynamic.literal(en = en.asInstanceOf[js.Any])
    __obj.asInstanceOf[Names]
  }
  
  @scala.inline
  implicit class NamesOps[Self <: Names] (val x: Self) extends AnyVal {
    
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
    def setEn(value: String): Self = this.set("en", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDe(value: String): Self = this.set("de", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDe: Self = this.set("de", js.undefined)
    
    @scala.inline
    def setEs(value: String): Self = this.set("es", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEs: Self = this.set("es", js.undefined)
    
    @scala.inline
    def setFr(value: String): Self = this.set("fr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFr: Self = this.set("fr", js.undefined)
    
    @scala.inline
    def setJa(value: String): Self = this.set("ja", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJa: Self = this.set("ja", js.undefined)
    
    @scala.inline
    def `setPt-BR`(value: String): Self = this.set("pt-BR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deletePt-BR`: Self = this.set("pt-BR", js.undefined)
    
    @scala.inline
    def setRu(value: String): Self = this.set("ru", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRu: Self = this.set("ru", js.undefined)
    
    @scala.inline
    def `setZh-CN`(value: String): Self = this.set("zh-CN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteZh-CN`: Self = this.set("zh-CN", js.undefined)
  }
}
