package typings.nextReactDevOverlay.anon

import typings.nextReactDevOverlay.nextReactDevOverlayBooleans.`false`
import typings.nextReactDevOverlay.nextReactDevOverlayBooleans.`true`
import typings.nextReactDevOverlay.stackFrameMod.OriginalStackFrame
import typings.stacktraceParser.mod.StackFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Expanded extends OriginalStackFrame {
  
  var error: `true` = js.native
  
  var expanded: `false` = js.native
  
  var external: `false` = js.native
  
  var originalCodeFrame: Null = js.native
  
  var originalStackFrame: Null = js.native
  
  var reason: String = js.native
  
  var sourceStackFrame: StackFrame = js.native
}
object Expanded {
  
  @scala.inline
  def apply(
    error: `true`,
    expanded: `false`,
    external: `false`,
    originalCodeFrame: Null,
    originalStackFrame: Null,
    reason: String,
    sourceStackFrame: StackFrame
  ): Expanded = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any], originalCodeFrame = originalCodeFrame.asInstanceOf[js.Any], originalStackFrame = originalStackFrame.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sourceStackFrame = sourceStackFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expanded]
  }
  
  @scala.inline
  implicit class ExpandedOps[Self <: Expanded] (val x: Self) extends AnyVal {
    
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
    def setError(value: `true`): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpanded(value: `false`): Self = this.set("expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal(value: `false`): Self = this.set("external", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalCodeFrame(value: Null): Self = this.set("originalCodeFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalStackFrame(value: Null): Self = this.set("originalStackFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceStackFrame(value: StackFrame): Self = this.set("sourceStackFrame", value.asInstanceOf[js.Any])
  }
}
