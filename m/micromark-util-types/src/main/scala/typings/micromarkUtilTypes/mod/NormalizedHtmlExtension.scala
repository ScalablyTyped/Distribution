package typings.micromarkUtilTypes.mod

import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ Key in keyof micromark-util-types.micromark-util-types.HtmlExtension ]: -? std.Exclude<micromark-util-types.micromark-util-types.HtmlExtension[Key], undefined>} */
trait NormalizedHtmlExtension extends StObject {
  
  var enter: Exclude[js.UndefOr[Handles], Unit]
  
  var exit: Exclude[js.UndefOr[Handles], Unit]
}
object NormalizedHtmlExtension {
  
  inline def apply(): NormalizedHtmlExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NormalizedHtmlExtension]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NormalizedHtmlExtension] (val x: Self) extends AnyVal {
    
    inline def setEnter(value: Exclude[js.UndefOr[Handles], Unit]): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: Exclude[js.UndefOr[Handles], Unit]): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
