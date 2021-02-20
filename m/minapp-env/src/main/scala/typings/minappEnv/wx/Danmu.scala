package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 弹幕内容 */
@js.native
trait Danmu extends StObject {
  
  /** 弹幕颜色 */
  var color: js.UndefOr[String] = js.native
  
  /** 弹幕文字 */
  var text: String = js.native
}
object Danmu {
  
  @scala.inline
  def apply(text: String): Danmu = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Danmu]
  }
  
  @scala.inline
  implicit class DanmuMutableBuilder[Self <: Danmu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
