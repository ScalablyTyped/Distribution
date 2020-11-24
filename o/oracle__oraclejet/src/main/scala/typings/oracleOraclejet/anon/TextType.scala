package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.billion
import typings.oracleOraclejet.oracleOraclejetStrings.million
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.number
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.percent
import typings.oracleOraclejet.oracleOraclejetStrings.quadrillion
import typings.oracleOraclejet.oracleOraclejetStrings.thousand
import typings.oracleOraclejet.oracleOraclejetStrings.trillion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextType extends js.Object {
  
  var converter: js.UndefOr[typings.oracleOraclejet.ojvalidationBaseMod.Converter[String]] = js.native
  
  var rendered: js.UndefOr[on | off] = js.native
  
  var scaling: js.UndefOr[none | thousand | million | billion | trillion | quadrillion | auto] = js.native
  
  var style: js.UndefOr[js.Object] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var textType: js.UndefOr[percent | number] = js.native
}
object TextType {
  
  @scala.inline
  def apply(): TextType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextType]
  }
  
  @scala.inline
  implicit class TextTypeOps[Self <: TextType] (val x: Self) extends AnyVal {
    
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
    def setConverter(value: typings.oracleOraclejet.ojvalidationBaseMod.Converter[String]): Self = this.set("converter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConverter: Self = this.set("converter", js.undefined)
    
    @scala.inline
    def setRendered(value: on | off): Self = this.set("rendered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRendered: Self = this.set("rendered", js.undefined)
    
    @scala.inline
    def setScaling(value: none | thousand | million | billion | trillion | quadrillion | auto): Self = this.set("scaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaling: Self = this.set("scaling", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextType(value: percent | number): Self = this.set("textType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextType: Self = this.set("textType", js.undefined)
  }
}
