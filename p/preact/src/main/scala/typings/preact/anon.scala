package typings.preact

import typings.preact.mod.ComponentChild
import typings.preact.mod.ComponentChildren
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`[T] extends StObject {
    
    def children(value: T): ComponentChildren
  }
  object `0` {
    
    @scala.inline
    def apply[T](children: T => ComponentChildren): `0`[T] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[`0`[T]]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`[?], T] (val x: Self & `0`[T]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: T => ComponentChildren): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  trait Children extends StObject {
    
    var children: ComponentChildren
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
  
  trait CurrentTarget[Target /* <: EventTarget */] extends StObject {
    
    val currentTarget: Target
  }
  object CurrentTarget {
    
    @scala.inline
    def apply[Target /* <: EventTarget */](currentTarget: Target): CurrentTarget[Target] = {
      val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrentTarget[Target]]
    }
    
    @scala.inline
    implicit class CurrentTargetMutableBuilder[Self <: CurrentTarget[?], Target /* <: EventTarget */] (val x: Self & CurrentTarget[Target]) extends AnyVal {
      
      @scala.inline
      def setCurrentTarget(value: Target): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefaultProps extends StObject {
    
    var defaultProps: /* import warning: importer.ImportType#apply Failed type conversion: infer Defaults */ js.Any
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
  
  trait Html extends StObject {
    
    var __html: String
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
  
  trait Ref[RefType] extends StObject {
    
    var children: js.UndefOr[ComponentChildren] = js.undefined
    
    var ref: js.UndefOr[typings.preact.mod.Ref[RefType]] = js.undefined
  }
  object Ref {
    
    @scala.inline
    def apply[RefType](): Ref[RefType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ref[RefType]]
    }
    
    @scala.inline
    implicit class RefMutableBuilder[Self <: Ref[?], RefType] (val x: Self & Ref[RefType]) extends AnyVal {
      
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
  trait TargetedEventEventTargetE extends StObject {
    
    var AT_TARGET: Double
    
    var BUBBLING_PHASE: Double
    
    var CAPTURING_PHASE: Double
    
    var NONE: Double
    
    var bubbles: Boolean
    
    var cancelBubble: Boolean
    
    var cancelable: Boolean
    
    var composed: Boolean
    
    def composedPath(): js.Array[EventTarget]
    @JSName("composedPath")
    var composedPath_Original: js.Function0[js.Array[EventTarget]]
    
    val currentTarget: EventTarget
    
    var defaultPrevented: Boolean
    
    var eventPhase: Double
    
    def initEvent(`type`: String): Unit
    @JSName("initEvent")
    var initEvent_Original: js.Function1[/* type */ String, Unit]
    
    var isTrusted: Boolean
    
    def preventDefault(): Unit
    @JSName("preventDefault")
    var preventDefault_Original: js.Function0[Unit]
    
    var returnValue: Boolean
    
    var srcElement: js.UndefOr[EventTarget | Null] = js.undefined
    
    def stopImmediatePropagation(): Unit
    @JSName("stopImmediatePropagation")
    var stopImmediatePropagation_Original: js.Function0[Unit]
    
    def stopPropagation(): Unit
    @JSName("stopPropagation")
    var stopPropagation_Original: js.Function0[Unit]
    
    var target: js.UndefOr[EventTarget | Null] = js.undefined
    
    var timeStamp: Double
    
    var `type`: String
  }
  object TargetedEventEventTargetE {
    
    @scala.inline
    def apply(
      AT_TARGET: Double,
      BUBBLING_PHASE: Double,
      CAPTURING_PHASE: Double,
      NONE: Double,
      bubbles: Boolean,
      cancelBubble: Boolean,
      cancelable: Boolean,
      composed: Boolean,
      composedPath: () => js.Array[EventTarget],
      currentTarget: EventTarget,
      defaultPrevented: Boolean,
      eventPhase: Double,
      initEvent: /* type */ String => Unit,
      isTrusted: Boolean,
      preventDefault: () => Unit,
      returnValue: Boolean,
      stopImmediatePropagation: () => Unit,
      stopPropagation: () => Unit,
      timeStamp: Double,
      `type`: String
    ): TargetedEventEventTargetE = {
      val __obj = js.Dynamic.literal(AT_TARGET = AT_TARGET.asInstanceOf[js.Any], BUBBLING_PHASE = BUBBLING_PHASE.asInstanceOf[js.Any], CAPTURING_PHASE = CAPTURING_PHASE.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], composed = composed.asInstanceOf[js.Any], composedPath = js.Any.fromFunction0(composedPath), currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initEvent = js.Any.fromFunction1(initEvent), isTrusted = isTrusted.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TargetedEventEventTargetE]
    }
    
    @scala.inline
    implicit class TargetedEventEventTargetEMutableBuilder[Self <: TargetedEventEventTargetE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAT_TARGET(value: Double): Self = StObject.set(x, "AT_TARGET", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBUBBLING_PHASE(value: Double): Self = StObject.set(x, "BUBBLING_PHASE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCAPTURING_PHASE(value: Double): Self = StObject.set(x, "CAPTURING_PHASE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelBubble(value: Boolean): Self = StObject.set(x, "cancelBubble", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComposed(value: Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComposedPath(value: () => js.Array[EventTarget]): Self = StObject.set(x, "composedPath", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCurrentTarget(value: EventTarget): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitEvent(value: /* type */ String => Unit): Self = StObject.set(x, "initEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNONE(value: Double): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcElement(value: EventTarget): Self = StObject.set(x, "srcElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcElementNull: Self = StObject.set(x, "srcElement", null)
      
      @scala.inline
      def setSrcElementUndefined: Self = StObject.set(x, "srcElement", js.undefined)
      
      @scala.inline
      def setStopImmediatePropagation(value: () => Unit): Self = StObject.set(x, "stopImmediatePropagation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetNull: Self = StObject.set(x, "target", null)
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value[T] extends StObject {
    
    var children: ComponentChildren
    
    var value: T
  }
  object Value {
    
    @scala.inline
    def apply[T](value: T): Value[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value[T]]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value[?], T] (val x: Self & Value[T]) extends AnyVal {
      
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
