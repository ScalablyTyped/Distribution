package typings.preact

import typings.preact.mod.ComponentChild
import typings.preact.mod.ComponentChildren
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0`[T] extends StObject {
    
    def children(value: T): ComponentChildren = js.native
  }
  object `0` {
    
    @scala.inline
    def apply[T](children: T => ComponentChildren): `0`[T] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[`0`[T]]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`[_], T] (val x: Self with `0`[T]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: T => ComponentChildren): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Children extends StObject {
    
    var children: ComponentChildren = js.native
  }
  object Children {
    
    @scala.inline
    def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ComponentChildren): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenNull: Self = StObject.set(x, "children", null)
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ComponentChild*): Self = StObject.set(x, "children", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CurrentTarget[Target /* <: EventTarget */] extends StObject {
    
    val currentTarget: Target = js.native
  }
  object CurrentTarget {
    
    @scala.inline
    def apply[Target /* <: EventTarget */](currentTarget: Target): CurrentTarget[Target] = {
      val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrentTarget[Target]]
    }
    
    @scala.inline
    implicit class CurrentTargetMutableBuilder[Self <: CurrentTarget[_], Target /* <: EventTarget */] (val x: Self with CurrentTarget[Target]) extends AnyVal {
      
      @scala.inline
      def setCurrentTarget(value: Target): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DefaultProps extends StObject {
    
    var defaultProps: /* import warning: importer.ImportType#apply Failed type conversion: infer Defaults */ js.Any = js.native
  }
  object DefaultProps {
    
    @scala.inline
    def apply(
      defaultProps: /* import warning: importer.ImportType#apply Failed type conversion: infer Defaults */ js.Any
    ): DefaultProps = {
      val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultProps]
    }
    
    @scala.inline
    implicit class DefaultPropsMutableBuilder[Self <: DefaultProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultProps(
        value: /* import warning: importer.ImportType#apply Failed type conversion: infer Defaults */ js.Any
      ): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Html extends StObject {
    
    var __html: String = js.native
  }
  object Html {
    
    @scala.inline
    def apply(__html: String): Html = {
      val __obj = js.Dynamic.literal(__html = __html.asInstanceOf[js.Any])
      __obj.asInstanceOf[Html]
    }
    
    @scala.inline
    implicit class HtmlMutableBuilder[Self <: Html] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set__html(value: String): Self = StObject.set(x, "__html", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Ref[RefType] extends StObject {
    
    var children: js.UndefOr[ComponentChildren] = js.native
    
    var ref: js.UndefOr[typings.preact.mod.Ref[RefType]] = js.native
  }
  object Ref {
    
    @scala.inline
    def apply[RefType](): Ref[RefType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ref[RefType]]
    }
    
    @scala.inline
    implicit class RefMutableBuilder[Self <: Ref[_], RefType] (val x: Self with Ref[RefType]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ComponentChildren): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenNull: Self = StObject.set(x, "children", null)
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ComponentChild*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setRef(value: typings.preact.mod.Ref[RefType]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ RefType | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  /* Inlined preact.preact/src/jsx.JSXInternal.TargetedEvent<std.EventTarget, std.Event> */
  @js.native
  trait TargetedEventEventTargetE extends StObject {
    
    var AT_TARGET: Double = js.native
    
    var BUBBLING_PHASE: Double = js.native
    
    var CAPTURING_PHASE: Double = js.native
    
    var NONE: Double = js.native
    
    var bubbles: Boolean = js.native
    
    var cancelBubble: Boolean = js.native
    
    var cancelable: Boolean = js.native
    
    var composed: Boolean = js.native
    
    def composedPath(): js.Array[EventTarget] = js.native
    @JSName("composedPath")
    var composedPath_Original: js.Function0[js.Array[EventTarget]] = js.native
    
    val currentTarget: EventTarget = js.native
    
    var defaultPrevented: Boolean = js.native
    
    var eventPhase: Double = js.native
    
    def initEvent(`type`: String): Unit = js.native
    @JSName("initEvent")
    var initEvent_Original: js.Function1[/* type */ String, Unit] = js.native
    
    var isTrusted: Boolean = js.native
    
    def preventDefault(): Unit = js.native
    @JSName("preventDefault")
    var preventDefault_Original: js.Function0[Unit] = js.native
    
    var returnValue: Boolean = js.native
    
    var srcElement: js.UndefOr[EventTarget | Null] = js.native
    
    def stopImmediatePropagation(): Unit = js.native
    @JSName("stopImmediatePropagation")
    var stopImmediatePropagation_Original: js.Function0[Unit] = js.native
    
    def stopPropagation(): Unit = js.native
    @JSName("stopPropagation")
    var stopPropagation_Original: js.Function0[Unit] = js.native
    
    var target: js.UndefOr[EventTarget | Null] = js.native
    
    var timeStamp: Double = js.native
    
    var `type`: String = js.native
  }
  
  @js.native
  trait Value[T] extends StObject {
    
    var children: ComponentChildren = js.native
    
    var value: T = js.native
  }
  object Value {
    
    @scala.inline
    def apply[T](value: T): Value[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value[T]]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value[_], T] (val x: Self with Value[T]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ComponentChildren): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenNull: Self = StObject.set(x, "children", null)
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ComponentChild*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
