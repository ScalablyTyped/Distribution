package typings.nginstackWebFramework.anon

import typings.nginstackWebFramework.libSimpleLayoutFooterMod.Mail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Colspan extends StObject {
  
  var colspan: js.UndefOr[Double] = js.undefined
  
  var css: js.UndefOr[String] = js.undefined
  
  var mailObject: js.UndefOr[Mail] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
}
object Colspan {
  
  inline def apply(): Colspan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Colspan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Colspan] (val x: Self) extends AnyVal {
    
    inline def setColspan(value: Double): Self = StObject.set(x, "colspan", value.asInstanceOf[js.Any])
    
    inline def setColspanUndefined: Self = StObject.set(x, "colspan", js.undefined)
    
    inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    inline def setMailObject(value: Mail): Self = StObject.set(x, "mailObject", value.asInstanceOf[js.Any])
    
    inline def setMailObjectUndefined: Self = StObject.set(x, "mailObject", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
