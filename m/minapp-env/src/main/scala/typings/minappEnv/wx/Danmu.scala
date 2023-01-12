package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 弹幕内容 */
trait Danmu extends StObject {
  
  /** 弹幕颜色 */
  var color: js.UndefOr[String] = js.undefined
  
  /** 弹幕文字 */
  var text: String
}
object Danmu {
  
  inline def apply(text: String): Danmu = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Danmu]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Danmu] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
