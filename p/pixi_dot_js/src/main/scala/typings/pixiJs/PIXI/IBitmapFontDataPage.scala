package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @memberof PIXI
  * @typedef {object} IBitmapFontDataPage
  * @property {number} id
  * @property {string} file
  */
@js.native
trait IBitmapFontDataPage extends StObject {
  
  var file: String = js.native
  
  var id: Double = js.native
}
object IBitmapFontDataPage {
  
  @scala.inline
  def apply(file: String, id: Double): IBitmapFontDataPage = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBitmapFontDataPage]
  }
  
  @scala.inline
  implicit class IBitmapFontDataPageMutableBuilder[Self <: IBitmapFontDataPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
