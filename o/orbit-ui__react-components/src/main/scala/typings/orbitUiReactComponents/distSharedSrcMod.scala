package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.Add
import typings.orbitUiReactComponents.anon.Dispose
import typings.orbitUiReactComponents.anon.From
import typings.orbitUiReactComponents.anon.IsDisabled
import typings.orbitUiReactComponents.anon.KeyProp
import typings.orbitUiReactComponents.anon.OnBlurOnFocus
import typings.orbitUiReactComponents.anon.OnKeyDownKeyboardEventHandler
import typings.orbitUiReactComponents.anon.`2`
import typings.orbitUiReactComponents.anon.`3`
import typings.orbitUiReactComponents.distSharedSrcAugmentElementMod.RecordWithSize
import typings.orbitUiReactComponents.distSharedSrcCheckableContextMod.CheckableContextType
import typings.orbitUiReactComponents.distSharedSrcCheckableContextMod.UseCheckablePropsReturn
import typings.orbitUiReactComponents.distSharedSrcFocusableTreeWalkerMod.FocusableTreeWalkerOptions
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.AsRef
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.distSharedSrcMergePropsMod.Props
import typings.orbitUiReactComponents.distSharedSrcMergePropsMod.TupleTypes
import typings.orbitUiReactComponents.distSharedSrcMergePropsMod.UnionToIntersection
import typings.orbitUiReactComponents.distSharedSrcSizeMod.Size
import typings.orbitUiReactComponents.distSharedSrcSizeMod.SizeAdapter
import typings.orbitUiReactComponents.distSharedSrcSlotsMod.GetSlotsReturn
import typings.orbitUiReactComponents.distSharedSrcSlotsMod.SlotOptions
import typings.orbitUiReactComponents.distSharedSrcSlotsMod.UseSlotsReturn
import typings.orbitUiReactComponents.distSharedSrcStyleContextMod.StyleContextType
import typings.orbitUiReactComponents.distSharedSrcUseAutoFocusMod.AutoFocusChildOptions
import typings.orbitUiReactComponents.distSharedSrcUseAutoFocusMod.AutoFocusOptions
import typings.orbitUiReactComponents.distSharedSrcUseChainedEventCallbackMod.ChainableFunction
import typings.orbitUiReactComponents.distSharedSrcUseControllableStateMod.ControllableStateOptions
import typings.orbitUiReactComponents.distSharedSrcUseFocusManagerMod.FocusManagerOptions
import typings.orbitUiReactComponents.distSharedSrcUseFocusScopeMod.ChangeEventHandler
import typings.orbitUiReactComponents.distSharedSrcUseFocusWithinMod.UseFocusWithinOptions
import typings.orbitUiReactComponents.distSharedSrcUseKeyboardNavigationMod.KeyboardNavigationBindings
import typings.orbitUiReactComponents.distSharedSrcUseKeyboardNavigationMod.KeyboardNavigationOptions
import typings.orbitUiReactComponents.distSharedSrcUseMergedRefsMod.AssignableRef
import typings.orbitUiReactComponents.distSharedSrcUseMergedRefsMod.MergedRef
import typings.orbitUiReactComponents.distSharedSrcUseMergedRefsMod.UnwrapStateType
import typings.orbitUiReactComponents.distSharedSrcUseResizeObserverMod.UseResizeObserverOptions
import typings.orbitUiReactComponents.orbitUiReactComponentsBooleans.`false`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.md
import typings.react.mod.Context
import typings.react.mod.ForwardRefRenderFunction
import typings.react.mod.Provider
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.react.mod.RefCallback
import typings.react.mod.RefObject
import typings.std.Element
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.EventTarget
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.Omit
import typings.std.Record
import typings.std.ResizeObserverEntry
import typings.std.TreeWalker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/shared/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/shared/src", "CheckableContext")
  @js.native
  val CheckableContext: Context[CheckableContextType] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/shared/src", "CompositeKeyWeakMap")
  @js.native
  open class CompositeKeyWeakMap[T] ()
    extends typings.orbitUiReactComponents.distSharedSrcMergePropsMod.CompositeKeyWeakMap[T]
  
  @JSImport("@orbit-ui/react-components/dist/shared/src", "DomScope")
  @js.native
  open class DomScope protected ()
    extends typings.orbitUiReactComponents.distSharedSrcUseFocusScopeMod.DomScope {
    def this(scopeRef: RefObject[js.Array[HTMLElement]], handlersRef: RefObject[js.Array[ChangeEventHandler]]) = this()
  }
  
  @JSImport("@orbit-ui/react-components/dist/shared/src", "ElementIterator")
  @js.native
  open class ElementIterator[T] protected ()
    extends typings.orbitUiReactComponents.distSharedSrcUseFocusManagerMod.ElementIterator[T] {
    def this(elements: js.Array[T]) = this()
    def this(elements: js.Array[T], param1: From) = this()
  }
  
  @JSImport("@orbit-ui/react-components/dist/shared/src", "FocusManager")
  @js.native
  open class FocusManager protected ()
    extends typings.orbitUiReactComponents.distSharedSrcUseFocusManagerMod.FocusManager {
    def this(scope: typings.orbitUiReactComponents.distSharedSrcUseFocusScopeMod.DomScope) = this()
    def this(
      scope: typings.orbitUiReactComponents.distSharedSrcUseFocusScopeMod.DomScope,
      param1: FocusManagerOptions
    ) = this()
  }
  
  @JSImport("@orbit-ui/react-components/dist/shared/src", "FocusTarget")
  @js.native
  object FocusTarget extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.orbitUiReactComponents.distSharedSrcFocusTargetMod.FocusTarget & String] = js.native
    
    /* "first" */ val first: typings.orbitUiReactComponents.distSharedSrcFocusTargetMod.FocusTarget.first & String = js.native
    
    /* "last" */ val last: typings.orbitUiReactComponents.distSharedSrcFocusTargetMod.FocusTarget.last & String = js.native
  }
  
  @JSImport("@orbit-ui/react-components/dist/shared/src", "FocusableElementSelector")
  @js.native
  val FocusableElementSelector: String = js.native
  
  @JSImport("@orbit-ui/react-components/dist/shared/src", "Keys")
  @js.native
  object Keys extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.orbitUiReactComponents.distSharedSrcKeysMod.Keys & String] = js.native
    
    /* "ArrowDown" */ val arrowDown: typings.orbitUiReactComponents.distSharedSrcKeysMod.Keys.arrowDown & String = js.native
    
    /* "ArrowLeft" */ val arrowLeft: typings.orbitUiReactComponents.distSharedSrcKeysMod.Keys.arrowLeft & String = js.native
    
    /* "ArrowRight" */ val arrowRight: typings.orbitUiReactComponents.distSharedSrcKeysMod.Keys.arrowRight & String = js.native
    
    /* "ArrowUp" */ val arrowUp: typings.orbitUiReactComponents.distSharedSrcKeysMod.Keys.arrowUp & String = js.native
    
    /* "Backspace" */ val backspace: typings.orbitUiReactComponents.distSharedSrcKeysMod.Keys.backspace & String = js.native
    
    /* "Delete" */ val delete: typings.orbitUiReactComponents.distSharedSrcKeysMod.Keys.delete & String = js.native
    
    /* "End" */ val end: typings.orbitUiReactComponents.distSharedSrcKeysMod.Keys.end & String = js.native
    
    /* "Enter" */ val enter: typings.orbitUiReactComponents.distSharedSrcKeysMod.Keys.enter & String = js.native
    
    /* "Escape" */ val esc: typings.orbitUiReactComponents.distSharedSrcKeysMod.Keys.esc & String = js.native
    
    /* "Home" */ val home: typings.orbitUiReactComponents.distSharedSrcKeysMod.Keys.home & String = js.native
    
    /* " " */ val space: typings.orbitUiReactComponents.distSharedSrcKeysMod.Keys.space & String = js.native
    
    /* "Tab" */ val tab: typings.orbitUiReactComponents.distSharedSrcKeysMod.Keys.tab & String = js.native
  }
  
  @JSImport("@orbit-ui/react-components/dist/shared/src", "StyleContext")
  @js.native
  val StyleContext: Context[StyleContextType] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/shared/src", "StyleProvider")
  @js.native
  val StyleProvider: Provider[StyleContextType] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/shared/src", "TabbableElementSelector")
  @js.native
  val TabbableElementSelector: String = js.native
  
  @JSImport("@orbit-ui/react-components/dist/shared/src", "VirtualFocusCssClass")
  @js.native
  val VirtualFocusCssClass: /* "o-ui-focus" */ String = js.native
  
  inline def adaptSize[T /* <: Size */](size: Size, adapter: SizeAdapter[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("adaptSize")(size.asInstanceOf[js.Any], adapter.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def appendEventKey(str: String, key: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("appendEventKey")(str.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def arrayify[T](value: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def arrayify[T](value: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def assignRef[T](ref: AssignableRef[T], node: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assignRef")(ref.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def augmentElement(element: ReactElement & RefAttributes[Any], newProps: Record[String, Any]): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("augmentElement")(element.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  
  inline def createChainedFunction_false[T /* <: ChainableFunction */](funcs: (T | `false`)*): ChainableFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("createChainedFunction")(funcs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ChainableFunction]
  
  inline def createDisposables(): Add = ^.asInstanceOf[js.Dynamic].applyDynamic("createDisposables")().asInstanceOf[Add]
  
  inline def createEmbeddableAdapter[T /* <: Size */](sizeAdapter: SizeAdapter[T]): js.Function2[/* element */ ReactElement, /* param1 */ RecordWithSize, ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmbeddableAdapter")(sizeAdapter.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* element */ ReactElement, /* param1 */ RecordWithSize, ReactElement]]
  
  inline def createFocusableTreeWalker(root: HTMLElement): TreeWalker = ^.asInstanceOf[js.Dynamic].applyDynamic("createFocusableTreeWalker")(root.asInstanceOf[js.Any]).asInstanceOf[TreeWalker]
  inline def createFocusableTreeWalker(root: HTMLElement, param1: FocusableTreeWalkerOptions): TreeWalker = (^.asInstanceOf[js.Dynamic].applyDynamic("createFocusableTreeWalker")(root.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[TreeWalker]
  
  inline def createSizeAdapter[T /* <: Size */](adapter: SizeAdapter[T]): js.Function1[/* size */ Size, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSizeAdapter")(adapter.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* size */ Size, T]]
  
  inline def cssModule_false(moduleName: String, values: (`false` | String)*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cssModule")(scala.List(moduleName.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def forwardRef[P /* <: Record[String, Any] */, T](render: ForwardRefRenderFunction[AsRef[T], P]): OrbitComponent[T, P] = ^.asInstanceOf[js.Dynamic].applyDynamic("forwardRef")(render.asInstanceOf[js.Any]).asInstanceOf[OrbitComponent[T, P]]
  
  inline def getRawSlots(children: ReactNode, slots: js.Array[String]): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRawSlots")(children.asInstanceOf[js.Any], slots.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  
  inline def getSlotKey(element: ReactElement): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getSlotKey")(element.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getSlots[T /* <: SlotOptions */](children: ReactNode, param1: T): GetSlotsReturn[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSlots")(children.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[GetSlotsReturn[T]]
  
  inline def isArray[T](value: Any): /* is std.Array<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<T> */ Boolean]
  
  inline def isDefined(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEmptyArray(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyArray")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFunction(value: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isNil(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNil")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNilOrEmpty(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNilOrEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNull(value: Any): /* is null */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(value.asInstanceOf[js.Any]).asInstanceOf[/* is null */ Boolean]
  
  inline def isNumber(value: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(value.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def isPlainObject(value: Any): /* is std.Record<string, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Record<string, any> */ Boolean]
  
  inline def isPromise(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isString(value: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(value.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isUndefined(value: Any): /* is undefined */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[/* is undefined */ Boolean]
  
  inline def mergeClasses_false(values: (String | `false`)*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeClasses")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def mergeProps[T /* <: js.Array[Props] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): UnionToIntersection[TupleTypes[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeProps")(args.asInstanceOf[js.Any]).asInstanceOf[UnionToIntersection[TupleTypes[T]]]
  
  inline def mergeRefs[T](refs: AssignableRef[T]*): MergedRef[UnwrapStateType[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeRefs")(refs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[MergedRef[UnwrapStateType[T]]]
  
  inline def normalizeSize[T /* <: Size */](): md | T = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeSize")().asInstanceOf[md | T]
  inline def normalizeSize[T /* <: Size */](size: T): md | T = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeSize")(size.asInstanceOf[js.Any]).asInstanceOf[md | T]
  
  inline def omitProps[TObject /* <: Record[String, Any] */, TKey /* <: String */](obj: TObject, omit: js.Array[TKey]): Omit[TObject, TKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("omitProps")(obj.asInstanceOf[js.Any], omit.asInstanceOf[js.Any])).asInstanceOf[Omit[TObject, TKey]]
  
  inline def resolveChildren(children: ReactNode): ReactNode = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveChildren")(children.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
  inline def resolveChildren(children: ReactNode, renderProps: Record[String, Any]): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveChildren")(children.asInstanceOf[js.Any], renderProps.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  
  inline def resolveFragment(children: ReactNode): ReactNode = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveFragment")(children.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
  
  inline def slot[P](slotName: String, ElementType: P): P = (^.asInstanceOf[js.Dynamic].applyDynamic("slot")(slotName.asInstanceOf[js.Any], ElementType.asInstanceOf[js.Any])).asInstanceOf[P]
  
  inline def useAutoFocus(targetRef: RefObject[HTMLElement]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useAutoFocus")(targetRef.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useAutoFocus(targetRef: RefObject[HTMLElement], param1: AutoFocusOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useAutoFocus")(targetRef.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useAutoFocusChild(focusManager: typings.orbitUiReactComponents.distSharedSrcUseFocusManagerMod.FocusManager): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useAutoFocusChild")(focusManager.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useAutoFocusChild(
    focusManager: typings.orbitUiReactComponents.distSharedSrcUseFocusManagerMod.FocusManager,
    param1: AutoFocusChildOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useAutoFocusChild")(focusManager.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useChainedEventCallback_false[T /* <: ChainableFunction */](callbacks: (T | `false`)*): ChainableFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("useChainedEventCallback")(callbacks.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ChainableFunction]
  
  inline def useCheckableContext(): js.Tuple2[CheckableContextType, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCheckableContext")().asInstanceOf[js.Tuple2[CheckableContextType, Boolean]]
  
  inline def useCheckableProps(param0: `3`): js.Tuple2[UseCheckablePropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCheckableProps")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[UseCheckablePropsReturn, Boolean]]
  
  inline def useCommittedRef[T](value: T): RefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCommittedRef")(value.asInstanceOf[js.Any]).asInstanceOf[RefObject[T]]
  
  inline def useControllableState[T](): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")().asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](controlledValue: T): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](controlledValue: T, initialValue: T): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](controlledValue: T, initialValue: T, defaultValue: T): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](controlledValue: T, initialValue: T, defaultValue: T, param3: ControllableStateOptions[T]): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], param3.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](controlledValue: T, initialValue: T, defaultValue: Unit, param3: ControllableStateOptions[T]): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], param3.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](controlledValue: T, initialValue: Unit, defaultValue: T): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](controlledValue: T, initialValue: Unit, defaultValue: T, param3: ControllableStateOptions[T]): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], param3.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](controlledValue: T, initialValue: Unit, defaultValue: Unit, param3: ControllableStateOptions[T]): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], param3.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](controlledValue: Unit, initialValue: T): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](controlledValue: Unit, initialValue: T, defaultValue: T): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](controlledValue: Unit, initialValue: T, defaultValue: T, param3: ControllableStateOptions[T]): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], param3.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](controlledValue: Unit, initialValue: T, defaultValue: Unit, param3: ControllableStateOptions[T]): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], param3.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](controlledValue: Unit, initialValue: Unit, defaultValue: T): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](controlledValue: Unit, initialValue: Unit, defaultValue: T, param3: ControllableStateOptions[T]): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], param3.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](controlledValue: Unit, initialValue: Unit, defaultValue: Unit, param3: ControllableStateOptions[T]): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], param3.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  
  inline def useDisposables(): Dispose = ^.asInstanceOf[js.Dynamic].applyDynamic("useDisposables")().asInstanceOf[Dispose]
  
  inline def useDocumentListener(eventName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useDocumentListener(eventName: String, listener: Null, active: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDocumentListener(eventName: String, listener: Null, active: Boolean, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDocumentListener(eventName: String, listener: Null, active: Boolean, options: EventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDocumentListener(eventName: String, listener: Null, active: Unit, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDocumentListener(eventName: String, listener: Null, active: Unit, options: EventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDocumentListener(eventName: String, listener: EventListenerOrEventListenerObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDocumentListener(eventName: String, listener: EventListenerOrEventListenerObject, active: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDocumentListener(eventName: String, listener: EventListenerOrEventListenerObject, active: Boolean, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDocumentListener(
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Boolean,
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDocumentListener(eventName: String, listener: EventListenerOrEventListenerObject, active: Unit, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDocumentListener(
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Unit,
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventCallback[TCallback /* <: js.Function1[/* repeated */ Any, Unit] */](): TCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("useEventCallback")().asInstanceOf[TCallback]
  inline def useEventCallback[TCallback /* <: js.Function1[/* repeated */ Any, Unit] */](callback: TCallback): TCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("useEventCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[TCallback]
  
  inline def useEventListener(eventTarget: js.Function0[EventTarget], eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(eventTarget: js.Function0[EventTarget], eventName: String, listener: Null, active: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: js.Function0[EventTarget],
    eventName: String,
    listener: Null,
    active: Boolean,
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: js.Function0[EventTarget],
    eventName: String,
    listener: Null,
    active: Boolean,
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: js.Function0[EventTarget],
    eventName: String,
    listener: Null,
    active: Unit,
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: js.Function0[EventTarget],
    eventName: String,
    listener: Null,
    active: Unit,
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: js.Function0[EventTarget],
    eventName: String,
    listener: EventListenerOrEventListenerObject
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: js.Function0[EventTarget],
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: js.Function0[EventTarget],
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Boolean,
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: js.Function0[EventTarget],
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Boolean,
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: js.Function0[EventTarget],
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Unit,
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: js.Function0[EventTarget],
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Unit,
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(eventTarget: EventTarget, eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(eventTarget: EventTarget, eventName: String, listener: Null, active: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(eventTarget: EventTarget, eventName: String, listener: Null, active: Boolean, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: EventTarget,
    eventName: String,
    listener: Null,
    active: Boolean,
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(eventTarget: EventTarget, eventName: String, listener: Null, active: Unit, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: EventTarget,
    eventName: String,
    listener: Null,
    active: Unit,
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(eventTarget: EventTarget, eventName: String, listener: EventListenerOrEventListenerObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: EventTarget,
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: EventTarget,
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Boolean,
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: EventTarget,
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Boolean,
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: EventTarget,
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Unit,
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: EventTarget,
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Unit,
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useFocusManager(scope: typings.orbitUiReactComponents.distSharedSrcUseFocusScopeMod.DomScope): typings.orbitUiReactComponents.distSharedSrcUseFocusManagerMod.FocusManager = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusManager")(scope.asInstanceOf[js.Any]).asInstanceOf[typings.orbitUiReactComponents.distSharedSrcUseFocusManagerMod.FocusManager]
  inline def useFocusManager(
    scope: typings.orbitUiReactComponents.distSharedSrcUseFocusScopeMod.DomScope,
    param1: FocusManagerOptions
  ): typings.orbitUiReactComponents.distSharedSrcUseFocusManagerMod.FocusManager = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusManager")(scope.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[typings.orbitUiReactComponents.distSharedSrcUseFocusManagerMod.FocusManager]
  
  inline def useFocusScope(): js.Tuple2[
    typings.orbitUiReactComponents.distSharedSrcUseFocusScopeMod.DomScope, 
    js.Function1[/* rootElement */ HTMLElement, Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusScope")().asInstanceOf[js.Tuple2[
    typings.orbitUiReactComponents.distSharedSrcUseFocusScopeMod.DomScope, 
    js.Function1[/* rootElement */ HTMLElement, Unit]
  ]]
  
  inline def useFocusWithin(): OnBlurOnFocus | `2` = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusWithin")().asInstanceOf[OnBlurOnFocus | `2`]
  inline def useFocusWithin(param0: UseFocusWithinOptions): OnBlurOnFocus | `2` = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusWithin")(param0.asInstanceOf[js.Any]).asInstanceOf[OnBlurOnFocus | `2`]
  
  inline def useForceRender(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useForceRender")().asInstanceOf[js.Function0[Unit]]
  
  inline def useForwardInputApi(inputRef: RefObject[HTMLInputElement]): js.Function1[/* targetRef */ RefObject[HTMLInputElement], HTMLInputElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("useForwardInputApi")(inputRef.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* targetRef */ RefObject[HTMLInputElement], HTMLInputElement]]
  
  inline def useHasChild(querySelector: String, rootRef: RefObject[HTMLElement]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useHasChild")(querySelector.asInstanceOf[js.Any], rootRef.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def useHasChildren(querySelectors: Record[String, String], rootRef: RefObject[HTMLElement]): Record[String, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useHasChildren")(querySelectors.asInstanceOf[js.Any], rootRef.asInstanceOf[js.Any])).asInstanceOf[Record[String, Boolean]]
  
  inline def useId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useId")().asInstanceOf[String]
  inline def useId(userId: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useId")(userId.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def useId(userId: String, prefix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("useId")(userId.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def useId(userId: Unit, prefix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("useId")(userId.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def useIsInitialRender(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsInitialRender")().asInstanceOf[Boolean]
  
  inline def useKeyboardNavigation(
    focusManager: typings.orbitUiReactComponents.distSharedSrcUseFocusManagerMod.FocusManager,
    param1: KeyboardNavigationBindings
  ): OnKeyDownKeyboardEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardNavigation")(focusManager.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[OnKeyDownKeyboardEventHandler]
  inline def useKeyboardNavigation(
    focusManager: typings.orbitUiReactComponents.distSharedSrcUseFocusManagerMod.FocusManager,
    param1: KeyboardNavigationBindings,
    param2: KeyboardNavigationOptions
  ): OnKeyDownKeyboardEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardNavigation")(focusManager.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[OnKeyDownKeyboardEventHandler]
  
  inline def useKeyedRovingFocus(scope: typings.orbitUiReactComponents.distSharedSrcUseFocusScopeMod.DomScope, currentKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useKeyedRovingFocus")(scope.asInstanceOf[js.Any], currentKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useKeyedRovingFocus(
    scope: typings.orbitUiReactComponents.distSharedSrcUseFocusScopeMod.DomScope,
    currentKey: String,
    param2: KeyProp
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useKeyedRovingFocus")(scope.asInstanceOf[js.Any], currentKey.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useMediaQuery(query: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def useMergedRefs[T](refs: AssignableRef[T]*): MergedRef[UnwrapStateType[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMergedRefs")(refs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[MergedRef[UnwrapStateType[T]]]
  
  inline def useRawSlots(children: ReactNode, slots: js.Array[String]): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useRawSlots")(children.asInstanceOf[js.Any], slots.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  
  inline def useRefState[T](): js.Tuple2[
    RefObject[T], 
    js.Function2[/* newValue */ T, /* rerender */ js.UndefOr[Boolean], Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRefState")().asInstanceOf[js.Tuple2[
    RefObject[T], 
    js.Function2[/* newValue */ T, /* rerender */ js.UndefOr[Boolean], Unit]
  ]]
  inline def useRefState[T](initialValue: T): js.Tuple2[
    RefObject[T], 
    js.Function2[/* newValue */ T, /* rerender */ js.UndefOr[Boolean], Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRefState")(initialValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    RefObject[T], 
    js.Function2[/* newValue */ T, /* rerender */ js.UndefOr[Boolean], Unit]
  ]]
  
  inline def useResizeObserver(onResize: js.Function1[/* entry */ ResizeObserverEntry, Unit]): RefCallback[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("useResizeObserver")(onResize.asInstanceOf[js.Any]).asInstanceOf[RefCallback[HTMLElement]]
  inline def useResizeObserver(onResize: js.Function1[/* entry */ ResizeObserverEntry, Unit], param1: UseResizeObserverOptions): RefCallback[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("useResizeObserver")(onResize.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[RefCallback[HTMLElement]]
  
  inline def useRovingFocus(scope: typings.orbitUiReactComponents.distSharedSrcUseFocusScopeMod.DomScope): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useRovingFocus")(scope.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useRovingFocus(scope: typings.orbitUiReactComponents.distSharedSrcUseFocusScopeMod.DomScope, param1: IsDisabled): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useRovingFocus")(scope.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useSlots[T /* <: SlotOptions */](children: ReactNode, slots: T): UseSlotsReturn[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useSlots")(children.asInstanceOf[js.Any], slots.asInstanceOf[js.Any])).asInstanceOf[UseSlotsReturn[T]]
  
  inline def useStyleContext(): StyleContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useStyleContext")().asInstanceOf[StyleContextType]
  
  inline def useStyleProps(key: String): js.Tuple2[StyleContextType, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useStyleProps")(key.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[StyleContextType, Boolean]]
  
  inline def useWindowListener(eventName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useWindowListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useWindowListener(eventName: String, listener: Null, active: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useWindowListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useWindowListener(eventName: String, listener: Null, active: Boolean, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useWindowListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useWindowListener(eventName: String, listener: Null, active: Boolean, options: EventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useWindowListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useWindowListener(eventName: String, listener: Null, active: Unit, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useWindowListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useWindowListener(eventName: String, listener: Null, active: Unit, options: EventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useWindowListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useWindowListener(eventName: String, listener: EventListenerOrEventListenerObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useWindowListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useWindowListener(eventName: String, listener: EventListenerOrEventListenerObject, active: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useWindowListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useWindowListener(eventName: String, listener: EventListenerOrEventListenerObject, active: Boolean, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useWindowListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useWindowListener(
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Boolean,
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useWindowListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useWindowListener(eventName: String, listener: EventListenerOrEventListenerObject, active: Unit, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useWindowListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useWindowListener(
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Unit,
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useWindowListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def walkFocusableElements(
    root: HTMLElement,
    onElement: js.Function2[/* element */ Element, /* index */ js.UndefOr[Double], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walkFocusableElements")(root.asInstanceOf[js.Any], onElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
