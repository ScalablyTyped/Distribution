package typings.nextReactDevOverlay

import typings.nextReactDevOverlay.nextReactDevOverlayBooleans.`false`
import typings.nextReactDevOverlay.nextReactDevOverlayBooleans.`true`
import typings.nextReactDevOverlay.stackFrameMod.OriginalStackFrame
import typings.stacktraceParser.mod.StackFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Column extends StObject {
    
    var column: Double | Null
    
    var frame: js.Any
    
    var line: Double
    
    var rootDirectory: String
    
    var source: js.Any
  }
  object Column {
    
    @scala.inline
    def apply(frame: js.Any, line: Double, rootDirectory: String, source: js.Any): Column = {
      val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], rootDirectory = rootDirectory.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], column = null)
      __obj.asInstanceOf[Column]
    }
    
    @scala.inline
    implicit class ColumnMutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnNull: Self = StObject.set(x, "column", null)
      
      @scala.inline
      def setFrame(value: js.Any): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootDirectory(value: String): Self = StObject.set(x, "rootDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComponentStack extends StObject {
    
    var componentStack: js.UndefOr[String | Null] = js.undefined
  }
  object ComponentStack {
    
    @scala.inline
    def apply(): ComponentStack = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentStack]
    }
    
    @scala.inline
    implicit class ComponentStackMutableBuilder[Self <: ComponentStack] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentStack(value: String): Self = StObject.set(x, "componentStack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentStackNull: Self = StObject.set(x, "componentStack", null)
      
      @scala.inline
      def setComponentStackUndefined: Self = StObject.set(x, "componentStack", js.undefined)
    }
  }
  
  trait Error extends StObject {
    
    var error: Null
  }
  object Error {
    
    @scala.inline
    def apply(error: Null): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Null): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait Expanded
    extends StObject
       with OriginalStackFrame {
    
    var error: `true`
    
    var expanded: `false`
    
    var external: `false`
    
    var originalCodeFrame: Null
    
    var originalStackFrame: Null
    
    var reason: String
    
    var sourceStackFrame: StackFrame
  }
  object Expanded {
    
    @scala.inline
    def apply(originalCodeFrame: Null, originalStackFrame: Null, reason: String, sourceStackFrame: StackFrame): Expanded = {
      val __obj = js.Dynamic.literal(error = true, expanded = false, external = false, originalCodeFrame = originalCodeFrame.asInstanceOf[js.Any], originalStackFrame = originalStackFrame.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sourceStackFrame = sourceStackFrame.asInstanceOf[js.Any])
      __obj.asInstanceOf[Expanded]
    }
    
    @scala.inline
    implicit class ExpandedMutableBuilder[Self <: Expanded] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: `true`): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpanded(value: `false`): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal(value: `false`): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalCodeFrame(value: Null): Self = StObject.set(x, "originalCodeFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalStackFrame(value: Null): Self = StObject.set(x, "originalStackFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceStackFrame(value: StackFrame): Self = StObject.set(x, "sourceStackFrame", value.asInstanceOf[js.Any])
    }
  }
  
  trait External
    extends StObject
       with OriginalStackFrame {
    
    var error: `false`
    
    var expanded: Boolean
    
    var external: `false`
    
    var originalCodeFrame: String | Null
    
    var originalStackFrame: StackFrame
    
    var reason: Null
    
    var sourceStackFrame: StackFrame
  }
  object External {
    
    @scala.inline
    def apply(expanded: Boolean, originalStackFrame: StackFrame, reason: Null, sourceStackFrame: StackFrame): External = {
      val __obj = js.Dynamic.literal(error = false, expanded = expanded.asInstanceOf[js.Any], external = false, originalStackFrame = originalStackFrame.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sourceStackFrame = sourceStackFrame.asInstanceOf[js.Any], originalCodeFrame = null)
      __obj.asInstanceOf[External]
    }
    
    @scala.inline
    implicit class ExternalMutableBuilder[Self <: External] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: `false`): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal(value: `false`): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalCodeFrame(value: String): Self = StObject.set(x, "originalCodeFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalCodeFrameNull: Self = StObject.set(x, "originalCodeFrame", null)
      
      @scala.inline
      def setOriginalStackFrame(value: StackFrame): Self = StObject.set(x, "originalStackFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReason(value: Null): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceStackFrame(value: StackFrame): Self = StObject.set(x, "sourceStackFrame", value.asInstanceOf[js.Any])
    }
  }
  
  trait OriginalCodeFrame
    extends StObject
       with OriginalStackFrame {
    
    var error: `false`
    
    var expanded: `false`
    
    var external: `true`
    
    var originalCodeFrame: Null
    
    var originalStackFrame: Null
    
    var reason: Null
    
    var sourceStackFrame: StackFrame
  }
  object OriginalCodeFrame {
    
    @scala.inline
    def apply(originalCodeFrame: Null, originalStackFrame: Null, reason: Null, sourceStackFrame: StackFrame): OriginalCodeFrame = {
      val __obj = js.Dynamic.literal(error = false, expanded = false, external = true, originalCodeFrame = originalCodeFrame.asInstanceOf[js.Any], originalStackFrame = originalStackFrame.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sourceStackFrame = sourceStackFrame.asInstanceOf[js.Any])
      __obj.asInstanceOf[OriginalCodeFrame]
    }
    
    @scala.inline
    implicit class OriginalCodeFrameMutableBuilder[Self <: OriginalCodeFrame] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: `false`): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpanded(value: `false`): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal(value: `true`): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalCodeFrame(value: Null): Self = StObject.set(x, "originalCodeFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalStackFrame(value: Null): Self = StObject.set(x, "originalStackFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReason(value: Null): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceStackFrame(value: StackFrame): Self = StObject.set(x, "sourceStackFrame", value.asInstanceOf[js.Any])
    }
  }
}
