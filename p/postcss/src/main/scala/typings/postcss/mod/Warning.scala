package typings.postcss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a plugin warning. It can be created using Result#warn().
  */
@js.native
trait Warning extends StObject {
  
  /**
    * Column in the input file with this warning's source.
    */
  var column: Double = js.native
  
  /**
    * The line in the input file with this warning's source.
    */
  var line: Double = js.native
  
  /**
    * The CSS node that caused the warning.
    */
  var node: Node = js.native
  
  /**
    * Contains the name of the plugin that created this warning. When you
    * call Result#warn(), it will fill this property automatically.
    */
  var plugin: String = js.native
  
  /**
    * Contains the warning message.
    */
  var text: String = js.native
}
object Warning {
  
  @scala.inline
  def apply(column: Double, line: Double, node: Node, plugin: String, text: String): Warning = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Warning]
  }
  
  @scala.inline
  implicit class WarningMutableBuilder[Self <: Warning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
