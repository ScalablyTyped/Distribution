package typings.postcss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeErrorOptions extends StObject {
  
  /**
    * An index inside a node's string that should be highlighted as source
    * of error.
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * Plugin name that created this error. PostCSS will set it automatically.
    */
  var plugin: js.UndefOr[String] = js.native
  
  /**
    * A word inside a node's string, that should be highlighted as source
    * of error.
    */
  var word: js.UndefOr[String] = js.native
}
object NodeErrorOptions {
  
  @scala.inline
  def apply(): NodeErrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeErrorOptions]
  }
  
  @scala.inline
  implicit class NodeErrorOptionsMutableBuilder[Self <: NodeErrorOptions] (val x: Self) extends AnyVal {
    
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
