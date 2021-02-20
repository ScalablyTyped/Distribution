package typings.nextReactDevOverlay

import typings.nextReactDevOverlay.nextReactDevOverlayBooleans.`false`
import typings.nextReactDevOverlay.nextReactDevOverlayBooleans.`true`
import typings.nextReactDevOverlay.stackFrameMod.OriginalStackFrame
import typings.stacktraceParser.mod.StackFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Column extends StObject {
    
    var column: Double | Null = js.native
    
    var frame: js.Any = js.native
    
    var line: Double = js.native
    
    var rootDirectory: String = js.native
    
    var source: js.Any = js.native
  }
  object Column {
    
    @scala.inline
    def apply(frame: js.Any, line: Double, rootDirectory: String, source: js.Any): Column = {
      val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], rootDirectory = rootDirectory.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
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
  
  @js.native
  trait ComponentStack extends StObject {
    
    var componentStack: js.UndefOr[String | Null] = js.native
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
  
  @js.native
  trait Error extends StObject {
    
    var error: Null = js.native
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
  
  @js.native
  trait External extends OriginalStackFrame {
    
    var error: `false` = js.native
    
    var expanded: Boolean = js.native
    
    var external: `false` = js.native
    
    var originalCodeFrame: String | Null = js.native
    
    var originalStackFrame: StackFrame = js.native
    
    var reason: Null = js.native
    
    var sourceStackFrame: StackFrame = js.native
  }
  object External {
    
    @scala.inline
    def apply(
      error: `false`,
      expanded: Boolean,
      external: `false`,
      originalStackFrame: StackFrame,
      reason: Null,
      sourceStackFrame: StackFrame
    ): External = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any], originalStackFrame = originalStackFrame.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sourceStackFrame = sourceStackFrame.asInstanceOf[js.Any])
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
  
  @js.native
  trait OriginalCodeFrame extends OriginalStackFrame {
    
    var error: `false` = js.native
    
    var expanded: `false` = js.native
    
    var external: `true` = js.native
    
    var originalCodeFrame: Null = js.native
    
    var originalStackFrame: Null = js.native
    
    var reason: Null = js.native
    
    var sourceStackFrame: StackFrame = js.native
  }
  object OriginalCodeFrame {
    
    @scala.inline
    def apply(
      error: `false`,
      expanded: `false`,
      external: `true`,
      originalCodeFrame: Null,
      originalStackFrame: Null,
      reason: Null,
      sourceStackFrame: StackFrame
    ): OriginalCodeFrame = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any], originalCodeFrame = originalCodeFrame.asInstanceOf[js.Any], originalStackFrame = originalStackFrame.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sourceStackFrame = sourceStackFrame.asInstanceOf[js.Any])
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
