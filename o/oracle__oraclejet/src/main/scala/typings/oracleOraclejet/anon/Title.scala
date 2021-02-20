package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Title extends StObject {
  
  var title: String = js.native
  
  var titleHalign: center | end | start = js.native
  
  var titleStyle: js.Object = js.native
}
object Title {
  
  @scala.inline
  def apply(title: String, titleHalign: center | end | start, titleStyle: js.Object): Title = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], titleHalign = titleHalign.asInstanceOf[js.Any], titleStyle = titleStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Title]
  }
  
  @scala.inline
  implicit class TitleMutableBuilder[Self <: Title] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleHalign(value: center | end | start): Self = StObject.set(x, "titleHalign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleStyle(value: js.Object): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
  }
}
