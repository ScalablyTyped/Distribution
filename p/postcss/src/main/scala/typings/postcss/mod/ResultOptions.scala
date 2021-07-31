package typings.postcss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultOptions
  extends StObject
     with ProcessOptions {
  
  /**
    * The CSS node that was the source of the warning.
    */
  var node: js.UndefOr[Node] = js.undefined
  
  /**
    * Name of plugin that created this warning. Result#warn() will fill it
    * automatically with plugin.postcssPlugin value.
    */
  var plugin: js.UndefOr[String] = js.undefined
}
object ResultOptions {
  
  @scala.inline
  def apply(): ResultOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultOptions]
  }
  
  @scala.inline
  implicit class ResultOptionsMutableBuilder[Self <: ResultOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    @scala.inline
    def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
  }
}
