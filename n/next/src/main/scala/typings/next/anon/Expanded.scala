package typings.next.anon

import typings.next.distClientComponentsReactDevOverlayInternalHelpersStackFrameMod.OriginalStackFrame
import typings.next.nextBooleans.`false`
import typings.next.nextBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expanded
  extends StObject
     with OriginalStackFrame {
  
  var error: `true`
  
  var expanded: `false`
  
  var external: `false`
  
  var originalCodeFrame: Null
  
  var originalStackFrame: Null
  
  var reason: String
  
  var sourceStackFrame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StackFrame */ Any
}
object Expanded {
  
  inline def apply(
    originalCodeFrame: Null,
    originalStackFrame: Null,
    reason: String,
    sourceStackFrame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StackFrame */ Any
  ): Expanded = {
    val __obj = js.Dynamic.literal(error = true, expanded = false, external = false, originalCodeFrame = originalCodeFrame.asInstanceOf[js.Any], originalStackFrame = originalStackFrame.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sourceStackFrame = sourceStackFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expanded]
  }
  
  extension [Self <: Expanded](x: Self) {
    
    inline def setError(value: `true`): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setExpanded(value: `false`): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExternal(value: `false`): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    inline def setOriginalCodeFrame(value: Null): Self = StObject.set(x, "originalCodeFrame", value.asInstanceOf[js.Any])
    
    inline def setOriginalStackFrame(value: Null): Self = StObject.set(x, "originalStackFrame", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setSourceStackFrame(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StackFrame */ Any
    ): Self = StObject.set(x, "sourceStackFrame", value.asInstanceOf[js.Any])
  }
}
