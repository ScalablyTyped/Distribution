package typings.octokitCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Debug extends js.Object {
  
  def debug(message: String): js.Any = js.native
  
  def error(message: String): js.Any = js.native
  
  def info(message: String): js.Any = js.native
  
  def warn(message: String): js.Any = js.native
}
object Debug {
  
  @scala.inline
  def apply(debug: String => js.Any, error: String => js.Any, info: String => js.Any, warn: String => js.Any): Debug = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[Debug]
  }
  
  @scala.inline
  implicit class DebugOps[Self <: Debug] (val x: Self) extends AnyVal {
    
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
    def setDebug(value: String => js.Any): Self = this.set("debug", js.Any.fromFunction1(value))
    
    @scala.inline
    def setError(value: String => js.Any): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInfo(value: String => js.Any): Self = this.set("info", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWarn(value: String => js.Any): Self = this.set("warn", js.Any.fromFunction1(value))
  }
}
