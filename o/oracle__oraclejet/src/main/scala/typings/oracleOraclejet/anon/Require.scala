package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Require extends StObject {
  
  var require: js.UndefOr[
    (js.Function1[/* module */ String, _]) | (js.Function3[
      /* modules */ js.Array[String], 
      /* ready */ js.UndefOr[js.Any], 
      /* errback */ js.UndefOr[js.Any], 
      Unit
    ])
  ] = js.native
  
  var viewPath: String = js.native
}
object Require {
  
  @scala.inline
  def apply(viewPath: String): Require = {
    val __obj = js.Dynamic.literal(viewPath = viewPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Require]
  }
  
  @scala.inline
  implicit class RequireMutableBuilder[Self <: Require] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequire(
      value: (js.Function1[/* module */ String, _]) | (js.Function3[
          /* modules */ js.Array[String], 
          /* ready */ js.UndefOr[js.Any], 
          /* errback */ js.UndefOr[js.Any], 
          Unit
        ])
    ): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireFunction1(value: /* module */ String => _): Self = StObject.set(x, "require", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequireFunction3(
      value: (/* modules */ js.Array[String], /* ready */ js.UndefOr[js.Any], /* errback */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "require", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
    
    @scala.inline
    def setViewPath(value: String): Self = StObject.set(x, "viewPath", value.asInstanceOf[js.Any])
  }
}
