package typings.next.anon

import typings.next.distClientComponentsReactDevOverlayInternalHelpersStackFrameMod.OriginalStackFrame
import typings.next.nextBooleans.`false`
import typings.next.nextBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginalCodeFrame
  extends StObject
     with OriginalStackFrame {
  
  var error: `false`
  
  var expanded: `false`
  
  var external: `true`
  
  var originalCodeFrame: Null
  
  var originalStackFrame: Null
  
  var reason: Null
  
  var sourceStackFrame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StackFrame */ Any
}
object OriginalCodeFrame {
  
  inline def apply(
    originalCodeFrame: Null,
    originalStackFrame: Null,
    reason: Null,
    sourceStackFrame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StackFrame */ Any
  ): OriginalCodeFrame = {
    val __obj = js.Dynamic.literal(error = false, expanded = false, external = true, originalCodeFrame = originalCodeFrame.asInstanceOf[js.Any], originalStackFrame = originalStackFrame.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sourceStackFrame = sourceStackFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalCodeFrame]
  }
  
  extension [Self <: OriginalCodeFrame](x: Self) {
    
    inline def setError(value: `false`): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setExpanded(value: `false`): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExternal(value: `true`): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    inline def setOriginalCodeFrame(value: Null): Self = StObject.set(x, "originalCodeFrame", value.asInstanceOf[js.Any])
    
    inline def setOriginalStackFrame(value: Null): Self = StObject.set(x, "originalStackFrame", value.asInstanceOf[js.Any])
    
    inline def setReason(value: Null): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setSourceStackFrame(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StackFrame */ Any
    ): Self = StObject.set(x, "sourceStackFrame", value.asInstanceOf[js.Any])
  }
}
