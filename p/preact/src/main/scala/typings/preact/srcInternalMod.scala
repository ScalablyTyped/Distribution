package typings.preact

import typings.preact.anon.Children
import typings.preact.mod.Consumer
import typings.preact.mod.Context
import typings.preact.mod.Key
import typings.preact.mod.Options_
import typings.preact.mod.Provider
import typings.std.AddEventListenerOptions
import typings.std.Document
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.Event
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import typings.std.Record
import typings.std.SVGElement
import typings.std.ShadowRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcInternalMod {
  
  @js.native
  sealed trait HookType extends StObject
  @JSImport("preact/src/internal", "HookType")
  @js.native
  object HookType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[HookType & Double] = js.native
    
    @js.native
    sealed trait useCallback
      extends StObject
         with HookType
    /* 8 */ val useCallback: typings.preact.srcInternalMod.HookType.useCallback & Double = js.native
    
    @js.native
    sealed trait useContext
      extends StObject
         with HookType
    /* 9 */ val useContext: typings.preact.srcInternalMod.HookType.useContext & Double = js.native
    
    // Not a real hook, but the devtools treat is as such
    @js.native
    sealed trait useDebugvalue
      extends StObject
         with HookType
    /* 11 */ val useDebugvalue: typings.preact.srcInternalMod.HookType.useDebugvalue & Double = js.native
    
    @js.native
    sealed trait useEffect
      extends StObject
         with HookType
    /* 3 */ val useEffect: typings.preact.srcInternalMod.HookType.useEffect & Double = js.native
    
    @js.native
    sealed trait useErrorBoundary
      extends StObject
         with HookType
    /* 10 */ val useErrorBoundary: typings.preact.srcInternalMod.HookType.useErrorBoundary & Double = js.native
    
    @js.native
    sealed trait useImperativeHandle
      extends StObject
         with HookType
    /* 6 */ val useImperativeHandle: typings.preact.srcInternalMod.HookType.useImperativeHandle & Double = js.native
    
    @js.native
    sealed trait useLayoutEffect
      extends StObject
         with HookType
    /* 4 */ val useLayoutEffect: typings.preact.srcInternalMod.HookType.useLayoutEffect & Double = js.native
    
    @js.native
    sealed trait useMemo
      extends StObject
         with HookType
    /* 7 */ val useMemo: typings.preact.srcInternalMod.HookType.useMemo & Double = js.native
    
    @js.native
    sealed trait useReducer
      extends StObject
         with HookType
    /* 2 */ val useReducer: typings.preact.srcInternalMod.HookType.useReducer & Double = js.native
    
    @js.native
    sealed trait useRef
      extends StObject
         with HookType
    /* 5 */ val useRef: typings.preact.srcInternalMod.HookType.useRef & Double = js.native
    
    @js.native
    sealed trait useState
      extends StObject
         with HookType
    /* 1 */ val useState: typings.preact.srcInternalMod.HookType.useState & Double = js.native
  }
  
  @js.native
  trait Component[P, S]
    extends typings.preact.mod.Component[P, S] {
    
    var _dirty: Boolean = js.native
    
    var _force: js.UndefOr[Boolean] = js.native
    
    // Only class components
    var _globalContext: js.UndefOr[Any] = js.native
    
    var _nextState: js.UndefOr[S | Null] = js.native
    
    /**
    	 * Pointer to the parent dom node. This is only needed for top-level Fragment
    	 * components or array returns.
    	 */
    var _parentDom: js.UndefOr[PreactElement | Null] = js.native
    
    // Always read, set only when handling error. This is used to indicate at diffTime to set _processingException
    var _pendingError: js.UndefOr[(Component[Any, Any]) | Null] = js.native
    
    // Only class components
    /** Only used in the devtools to later dirty check if state has changed */
    var _prevState: js.UndefOr[S | Null] = js.native
    
    // Always read, set only when handling error
    var _processingException: js.UndefOr[(Component[Any, Any]) | Null] = js.native
    
    var _renderCallbacks: js.Array[js.Function0[Unit]] = js.native
    
    // Only class components
    var _stateCallbacks: js.Array[js.Function0[Unit]] = js.native
    
    var _vnode: js.UndefOr[VNode[P] | Null] = js.native
    
    // When component is functional component, this is reset to functional component
    var constructor: ComponentType[P] = js.native
  }
  
  type ComponentChild = js.UndefOr[VNode[Any] | String | Double | Boolean | Null]
  
  type ComponentChildren = js.Array[ComponentChild] | ComponentChild
  
  @js.native
  trait ComponentClass[P]
    extends StObject
       with typings.preact.mod.ComponentClass[P, js.Object]
       with ComponentType[P] {
    
    var _contextRef: js.UndefOr[Any] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.preact.srcInternalMod.ComponentClass[P]
    - typings.preact.srcInternalMod.FunctionComponent[P]
  */
  trait ComponentType[P] extends StObject
  
  trait DevSource extends StObject {
    
    var fileName: String
    
    var lineNumber: Double
  }
  object DevSource {
    
    inline def apply(fileName: String, lineNumber: Double): DevSource = {
      val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[DevSource]
    }
    
    extension [Self <: DevSource](x: Self) {
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErrorInfo extends StObject {
    
    var componentStack: js.UndefOr[String] = js.undefined
  }
  object ErrorInfo {
    
    inline def apply(): ErrorInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorInfo]
    }
    
    extension [Self <: ErrorInfo](x: Self) {
      
      inline def setComponentStack(value: String): Self = StObject.set(x, "componentStack", value.asInstanceOf[js.Any])
      
      inline def setComponentStackUndefined: Self = StObject.set(x, "componentStack", js.undefined)
    }
  }
  
  @js.native
  trait FunctionComponent[P]
    extends StObject
       with typings.preact.mod.FunctionComponent[P]
       with ComponentType[P] {
    
    // Internally, createContext stores a ref to the context object on the Provider
    // Function component to help devtools
    var _contextRef: js.UndefOr[PreactContext] = js.native
    
    // Internally, createContext uses `contextType` on a Function component to
    // implement the Consumer component
    var contextType: js.UndefOr[PreactContext] = js.native
    
    var getDerivedStateFromError: Unit = js.native
    
    // Define these properties as undefined on FunctionComponent to get rid of
    // some errors in `diff()`
    var getDerivedStateFromProps: Unit = js.native
  }
  
  @js.native
  trait Options
    extends StObject
       with Options_ {
    
    /** Attach a hook that is invoked after an error is caught in a component but before calling lifecycle hooks */
    def _catchError(error: Any, vnode: VNode[js.Object]): Unit = js.native
    def _catchError(error: Any, vnode: VNode[js.Object], oldVNode: Unit, errorInfo: ErrorInfo): Unit = js.native
    def _catchError(error: Any, vnode: VNode[js.Object], oldVNode: VNode[js.Object]): Unit = js.native
    def _catchError(error: Any, vnode: VNode[js.Object], oldVNode: VNode[js.Object], errorInfo: ErrorInfo): Unit = js.native
    
    /** Attach a hook that is invoked after a tree was mounted or was updated. */
    var _commit: js.UndefOr[
        js.Function2[
          /* vnode */ VNode[js.Object], 
          /* commitQueue */ js.Array[Component[js.Object, js.Object]], 
          Unit
        ]
      ] = js.native
    
    /** Attach a hook that is invoked before a vnode is diffed. */
    var _diff: js.UndefOr[js.Function1[/* vnode */ VNode[js.Object], Unit]] = js.native
    
    /** Attach a hook that is invoked before a hook's state is queried. */
    var _hook: js.UndefOr[
        js.Function3[
          /* component */ Component[js.Object, js.Object], 
          /* index */ Double, 
          /* type */ HookType, 
          Unit
        ]
      ] = js.native
    
    /** Attach a hook that is invoked before a vnode has rendered. */
    var _render: js.UndefOr[js.Function1[/* vnode */ VNode[js.Object], Unit]] = js.native
    
    /** Attach a hook that is invoked before render, mainly to check the arguments. */
    var _root: js.UndefOr[
        js.Function2[
          /* vnode */ ComponentChild, 
          /* parent */ Element | Document | ShadowRoot | DocumentFragment, 
          Unit
        ]
      ] = js.native
    
    /** Bypass effect execution. Currenty only used in devtools for hooks inspection */
    var _skipEffects: js.UndefOr[Boolean] = js.native
  }
  
  trait PreactContext
    extends StObject
       with Context[Any] {
    
    var _defaultValue: Any
    
    var _id: String
  }
  object PreactContext {
    
    inline def apply(Consumer: Consumer[Any], Provider: Provider[Any], _defaultValue: Any, _id: String): PreactContext = {
      val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any], _defaultValue = _defaultValue.asInstanceOf[js.Any], _id = _id.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreactContext]
    }
    
    extension [Self <: PreactContext](x: Self) {
      
      inline def set_defaultValue(value: Any): Self = StObject.set(x, "_defaultValue", value.asInstanceOf[js.Any])
      
      inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PreactElement
    extends StObject
       with HTMLElement {
    
    var _children: js.UndefOr[VNode[Any] | Null] = js.native
    
    /** Event listeners to support event delegation */
    var _listeners: js.UndefOr[Record[String, js.Function1[/* e */ Event, Unit]]] = js.native
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    // style: HTMLElement["style"]; // From HTMLElement
    var data: js.UndefOr[String | Double] = js.native
    
    // Preact uses this attribute to detect SVG nodes
    var ownerSVGElement: js.UndefOr[SVGElement | Null] = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.preact.srcInternalMod.RefObject[T]
    - typings.preact.srcInternalMod.RefCallback[T]
  */
  trait Ref[T] extends StObject
  
  @js.native
  trait RefCallback[T]
    extends StObject
       with Ref[T] {
    
    def apply(): Unit = js.native
    def apply(instance: T): Unit = js.native
    
    var current: Unit = js.native
  }
  
  // We use the `current` property to differentiate between the two kinds of Refs so
  // internally we'll define `current` on both to make TypeScript happy
  trait RefObject[T]
    extends StObject
       with Ref[T] {
    
    var current: T | Null
  }
  object RefObject {
    
    inline def apply[T](): RefObject[T] = {
      val __obj = js.Dynamic.literal(current = null)
      __obj.asInstanceOf[RefObject[T]]
    }
    
    extension [Self <: RefObject[?], T](x: Self & RefObject[T]) {
      
      inline def setCurrent(value: T): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentNull: Self = StObject.set(x, "current", null)
    }
  }
  
  trait VNode[P]
    extends StObject
       with typings.preact.mod.VNode[P] {
    
    var _children: js.Array[VNode[Any]] | Null
    
    var _component: (Component[js.Object, js.Object]) | Null
    
    var _depth: Double | Null
    
    /**
    	 * The [first (for Fragments)] DOM child of a VNode
    	 */
    var _dom: PreactElement | Null
    
    var _hydrating: Boolean | Null
    
    /**
    	 * The last dom child of a Fragment, or components that return a Fragment
    	 */
    var _nextDom: PreactElement | Null
    
    var _original: Double
    
    var _parent: VNode[js.Object] | Null
    
    var constructor: Unit
  }
  object VNode {
    
    inline def apply[P](
      _original: Double,
      constructor: Unit,
      key: Key,
      props: P & Children,
      `type`: typings.preact.mod.ComponentType[P] | String
    ): VNode[P] = {
      val __obj = js.Dynamic.literal(_original = _original.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], _children = null, _component = null, _depth = null, _dom = null, _hydrating = null, _nextDom = null, _parent = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[VNode[P]]
    }
    
    extension [Self <: VNode[?], P](x: Self & VNode[P]) {
      
      inline def setConstructor(value: Unit): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
      
      inline def set_children(value: js.Array[VNode[Any]]): Self = StObject.set(x, "_children", value.asInstanceOf[js.Any])
      
      inline def set_childrenNull: Self = StObject.set(x, "_children", null)
      
      inline def set_childrenVarargs(value: VNode[Any]*): Self = StObject.set(x, "_children", js.Array(value*))
      
      inline def set_component(value: Component[js.Object, js.Object]): Self = StObject.set(x, "_component", value.asInstanceOf[js.Any])
      
      inline def set_componentNull: Self = StObject.set(x, "_component", null)
      
      inline def set_depth(value: Double): Self = StObject.set(x, "_depth", value.asInstanceOf[js.Any])
      
      inline def set_depthNull: Self = StObject.set(x, "_depth", null)
      
      inline def set_dom(value: PreactElement): Self = StObject.set(x, "_dom", value.asInstanceOf[js.Any])
      
      inline def set_domNull: Self = StObject.set(x, "_dom", null)
      
      inline def set_hydrating(value: Boolean): Self = StObject.set(x, "_hydrating", value.asInstanceOf[js.Any])
      
      inline def set_hydratingNull: Self = StObject.set(x, "_hydrating", null)
      
      inline def set_nextDom(value: PreactElement): Self = StObject.set(x, "_nextDom", value.asInstanceOf[js.Any])
      
      inline def set_nextDomNull: Self = StObject.set(x, "_nextDom", null)
      
      inline def set_original(value: Double): Self = StObject.set(x, "_original", value.asInstanceOf[js.Any])
      
      inline def set_parent(value: VNode[js.Object]): Self = StObject.set(x, "_parent", value.asInstanceOf[js.Any])
      
      inline def set_parentNull: Self = StObject.set(x, "_parent", null)
    }
  }
}
