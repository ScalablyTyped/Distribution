package typings.postcssSelectorParser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* copied from postcss -- so we don't need to add a dependency */
trait ErrorOptions extends StObject {
  
  var index: js.UndefOr[Double] = js.undefined
  
  var plugin: js.UndefOr[String] = js.undefined
  
  var word: js.UndefOr[String] = js.undefined
}
object ErrorOptions {
  
  @scala.inline
  def apply(): ErrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorOptions]
  }
  
  @scala.inline
  implicit class ErrorOptionsMutableBuilder[Self <: ErrorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
    
    @scala.inline
    def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordUndefined: Self = StObject.set(x, "word", js.undefined)
  }
}
