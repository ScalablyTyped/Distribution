package typings.next.anon

import typings.next.distClientComponentsReactDevOverlayInternalHelpersStackFrameMod.OriginalStackFrame
import typings.next.nextBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait External
  extends StObject
     with OriginalStackFrame {
  
  var error: `false`
  
  var expanded: Boolean
  
  var external: `false`
  
  var originalCodeFrame: String | Null
  
  var originalStackFrame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StackFrame */ Any
  
  var reason: Null
  
  var sourceStackFrame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StackFrame */ Any
}
object External {
  
  inline def apply(
    expanded: Boolean,
    originalStackFrame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StackFrame */ Any,
    reason: Null,
    sourceStackFrame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StackFrame */ Any
  ): External = {
    val __obj = js.Dynamic.literal(error = false, expanded = expanded.asInstanceOf[js.Any], external = false, originalStackFrame = originalStackFrame.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sourceStackFrame = sourceStackFrame.asInstanceOf[js.Any], originalCodeFrame = null)
    __obj.asInstanceOf[External]
  }
  
  extension [Self <: External](x: Self) {
    
    inline def setError(value: `false`): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExternal(value: `false`): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    inline def setOriginalCodeFrame(value: String): Self = StObject.set(x, "originalCodeFrame", value.asInstanceOf[js.Any])
    
    inline def setOriginalCodeFrameNull: Self = StObject.set(x, "originalCodeFrame", null)
    
    inline def setOriginalStackFrame(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StackFrame */ Any
    ): Self = StObject.set(x, "originalStackFrame", value.asInstanceOf[js.Any])
    
    inline def setReason(value: Null): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setSourceStackFrame(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StackFrame */ Any
    ): Self = StObject.set(x, "sourceStackFrame", value.asInstanceOf[js.Any])
  }
}
