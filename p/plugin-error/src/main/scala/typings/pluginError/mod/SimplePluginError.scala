package typings.pluginError.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `SimplePluginError` interface defines the properties available on all the the instances of `PluginError`.
  *
  * @internal
  */
@js.native
trait SimplePluginError extends Error {
  
  /**
    * File name where the error occurred
    */
  var fileName: js.UndefOr[String] = js.native
  
  /**
    * Line number where the error occurred
    */
  var lineNumber: js.UndefOr[Double] = js.native
  
  /**
    * Plugin name
    */
  var plugin: String = js.native
  
  /**
    * Boolean controlling if properties will be shown in `err.toString()`.
    */
  var showProperties: Boolean = js.native
  
  /**
    * Boolean controlling if the stack will be shown in `err.toString()`.
    */
  var showStack: Boolean = js.native
}
object SimplePluginError {
  
  @scala.inline
  def apply(message: String, name: String, plugin: String, showProperties: Boolean, showStack: Boolean): SimplePluginError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], showProperties = showProperties.asInstanceOf[js.Any], showStack = showStack.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimplePluginError]
  }
  
  @scala.inline
  implicit class SimplePluginErrorOps[Self <: SimplePluginError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPlugin(value: String): Self = this.set("plugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowProperties(value: Boolean): Self = this.set("showProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowStack(value: Boolean): Self = this.set("showStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    
    @scala.inline
    def setLineNumber(value: Double): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineNumber: Self = this.set("lineNumber", js.undefined)
  }
}
