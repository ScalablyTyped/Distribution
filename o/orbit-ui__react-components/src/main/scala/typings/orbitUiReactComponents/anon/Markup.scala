package typings.orbitUiReactComponents.anon

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Markup extends StObject {
  
  var markup: Element
  
  var tileProps: ClassNameString
}
object Markup {
  
  inline def apply(markup: Element, tileProps: ClassNameString): Markup = {
    val __obj = js.Dynamic.literal(markup = markup.asInstanceOf[js.Any], tileProps = tileProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Markup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Markup] (val x: Self) extends AnyVal {
    
    inline def setMarkup(value: Element): Self = StObject.set(x, "markup", value.asInstanceOf[js.Any])
    
    inline def setTileProps(value: ClassNameString): Self = StObject.set(x, "tileProps", value.asInstanceOf[js.Any])
  }
}
