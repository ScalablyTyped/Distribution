package typings.prettier.anon

import typings.prettier.mod.Parser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Css extends StObject {
  
  var css: Parser[Any]
  
  var less: Parser[Any]
  
  var scss: Parser[Any]
}
object Css {
  
  inline def apply(css: Parser[Any], less: Parser[Any], scss: Parser[Any]): Css = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], less = less.asInstanceOf[js.Any], scss = scss.asInstanceOf[js.Any])
    __obj.asInstanceOf[Css]
  }
  
  extension [Self <: Css](x: Self) {
    
    inline def setCss(value: Parser[Any]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setLess(value: Parser[Any]): Self = StObject.set(x, "less", value.asInstanceOf[js.Any])
    
    inline def setScss(value: Parser[Any]): Self = StObject.set(x, "scss", value.asInstanceOf[js.Any])
  }
}
