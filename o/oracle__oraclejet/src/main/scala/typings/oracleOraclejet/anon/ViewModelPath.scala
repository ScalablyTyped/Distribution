package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewModelPath extends StObject {
  
  var require: js.UndefOr[
    (js.Function1[/* module */ String, _]) | (js.Function3[
      /* modules */ js.Array[String], 
      /* ready */ js.UndefOr[js.Any], 
      /* errback */ js.UndefOr[js.Any], 
      Unit
    ])
  ] = js.native
  
  var viewModelPath: String = js.native
}
object ViewModelPath {
  
  @scala.inline
  def apply(viewModelPath: String): ViewModelPath = {
    val __obj = js.Dynamic.literal(viewModelPath = viewModelPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewModelPath]
  }
  
  @scala.inline
  implicit class ViewModelPathMutableBuilder[Self <: ViewModelPath] (val x: Self) extends AnyVal {
    
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
    def setViewModelPath(value: String): Self = StObject.set(x, "viewModelPath", value.asInstanceOf[js.Any])
  }
}
