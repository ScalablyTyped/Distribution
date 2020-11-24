package typings.oracleOraclejet.ojfilmstripMod

import typings.oracleOraclejet.anon.Id
import typings.oracleOraclejet.anon.LabelAccArrowNextPage
import typings.oracleOraclejet.mod.baseComponentSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.adjacent
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.hidden
import typings.oracleOraclejet.oracleOraclejetStrings.horizontal
import typings.oracleOraclejet.oracleOraclejetStrings.hover
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.overlay
import typings.oracleOraclejet.oracleOraclejetStrings.page
import typings.oracleOraclejet.oracleOraclejetStrings.vertical
import typings.oracleOraclejet.oracleOraclejetStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojFilmStripSettableProperties extends baseComponentSettableProperties {
  
  var arrowPlacement: adjacent | overlay = js.native
  
  var arrowVisibility: visible | hidden | hover | auto = js.native
  
  var currentItem: Id = js.native
  
  var looping: off | page = js.native
  
  var maxItemsPerPage: Double = js.native
  
  var orientation: horizontal | vertical = js.native
  
  @JSName("translations")
  var translations_ojFilmStripSettableProperties: LabelAccArrowNextPage = js.native
}
object ojFilmStripSettableProperties {
  
  @scala.inline
  def apply(
    arrowPlacement: adjacent | overlay,
    arrowVisibility: visible | hidden | hover | auto,
    currentItem: Id,
    looping: off | page,
    maxItemsPerPage: Double,
    orientation: horizontal | vertical,
    translations: LabelAccArrowNextPage
  ): ojFilmStripSettableProperties = {
    val __obj = js.Dynamic.literal(arrowPlacement = arrowPlacement.asInstanceOf[js.Any], arrowVisibility = arrowVisibility.asInstanceOf[js.Any], currentItem = currentItem.asInstanceOf[js.Any], looping = looping.asInstanceOf[js.Any], maxItemsPerPage = maxItemsPerPage.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojFilmStripSettableProperties]
  }
  
  @scala.inline
  implicit class ojFilmStripSettablePropertiesOps[Self <: ojFilmStripSettableProperties] (val x: Self) extends AnyVal {
    
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
    def setArrowPlacement(value: adjacent | overlay): Self = this.set("arrowPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowVisibility(value: visible | hidden | hover | auto): Self = this.set("arrowVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentItem(value: Id): Self = this.set("currentItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLooping(value: off | page): Self = this.set("looping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemsPerPage(value: Double): Self = this.set("maxItemsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: horizontal | vertical): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslations(value: LabelAccArrowNextPage): Self = this.set("translations", value.asInstanceOf[js.Any])
  }
}
