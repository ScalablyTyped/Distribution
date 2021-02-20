package typings.mjmlReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MjmlProps extends StObject {
  
  var lang: js.UndefOr[String] = js.native
  
  var owa: js.UndefOr[String] = js.native
}
object MjmlProps {
  
  @scala.inline
  def apply(): MjmlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlProps]
  }
  
  @scala.inline
  implicit class MjmlPropsMutableBuilder[Self <: MjmlProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    @scala.inline
    def setOwa(value: String): Self = StObject.set(x, "owa", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwaUndefined: Self = StObject.set(x, "owa", js.undefined)
  }
}
