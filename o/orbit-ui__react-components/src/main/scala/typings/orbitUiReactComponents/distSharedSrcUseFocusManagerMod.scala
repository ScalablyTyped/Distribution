package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.From
import typings.orbitUiReactComponents.anon.OmitFocusManagerOptionson
import typings.orbitUiReactComponents.distSharedSrcUseFocusScopeMod.DomScope
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedSrcUseFocusManagerMod {
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/useFocusManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/useFocusManager", "ElementIterator")
  @js.native
  open class ElementIterator[T] protected () extends StObject {
    def this(elements: js.Array[T]) = this()
    def this(elements: js.Array[T], param1: From) = this()
    
    def currentIndex: Double = js.native
    
    /* private */ var elements: Any = js.native
    
    /* private */ var index: Any = js.native
    
    def next(): T = js.native
    
    def previous(): T = js.native
    
    def reset(): Unit = js.native
    def reset(param0: From): Unit = js.native
  }
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/useFocusManager", "FocusManager")
  @js.native
  open class FocusManager protected () extends StObject {
    def this(scope: DomScope) = this()
    def this(scope: DomScope, param1: FocusManagerOptions) = this()
    
    def elements: js.Array[HTMLElement] = js.native
    
    /* private */ var focusElement: Any = js.native
    
    def focusFirst(): HTMLElement = js.native
    def focusFirst(param0: FocusOptions): HTMLElement = js.native
    
    def focusKey(key: String): HTMLElement = js.native
    def focusKey(key: String, options: FocusOptions): HTMLElement = js.native
    
    def focusLast(): HTMLElement = js.native
    def focusLast(param0: FocusOptions): HTMLElement = js.native
    
    def focusNext(): HTMLElement = js.native
    def focusNext(param0: FocusOptions): HTMLElement = js.native
    
    def focusPrevious(): HTMLElement = js.native
    def focusPrevious(param0: FocusOptions): HTMLElement = js.native
    
    def focusTarget(target: String): HTMLElement = js.native
    def focusTarget(target: String, options: FocusOptions): HTMLElement = js.native
    
    def getActiveElement(): Element = js.native
    
    def isInScope(element: HTMLElement): Boolean = js.native
    
    /* private */ var isVirtual: Any = js.native
    
    /* private */ var keyProp: Any = js.native
    
    /* private */ var onFocus: Any = js.native
    
    /* private */ var scope: Any = js.native
    
    def search(query: String): HTMLElement = js.native
    def search(query: String, options: FocusOptions): HTMLElement = js.native
  }
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/useFocusManager", "VirtualFocusCssClass")
  @js.native
  val VirtualFocusCssClass: /* "o-ui-focus" */ String = js.native
  
  inline def useFocusManager(scope: DomScope): FocusManager = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusManager")(scope.asInstanceOf[js.Any]).asInstanceOf[FocusManager]
  inline def useFocusManager(scope: DomScope, param1: FocusManagerOptions): FocusManager = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusManager")(scope.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[FocusManager]
  
  trait FocusManagerOptions extends StObject {
    
    var isVirtual: js.UndefOr[Boolean] = js.undefined
    
    var keyProp: js.UndefOr[String] = js.undefined
    
    var onFocus: js.UndefOr[
        js.Function2[/* activeElement */ HTMLElement, /* options */ OmitFocusManagerOptionson, Unit]
      ] = js.undefined
  }
  object FocusManagerOptions {
    
    inline def apply(): FocusManagerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusManagerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FocusManagerOptions] (val x: Self) extends AnyVal {
      
      inline def setIsVirtual(value: Boolean): Self = StObject.set(x, "isVirtual", value.asInstanceOf[js.Any])
      
      inline def setIsVirtualUndefined: Self = StObject.set(x, "isVirtual", js.undefined)
      
      inline def setKeyProp(value: String): Self = StObject.set(x, "keyProp", value.asInstanceOf[js.Any])
      
      inline def setKeyPropUndefined: Self = StObject.set(x, "keyProp", js.undefined)
      
      inline def setOnFocus(value: (/* activeElement */ HTMLElement, /* options */ OmitFocusManagerOptionson) => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction2(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    }
  }
  
  trait FocusOptions extends StObject {
    
    var canFocus: js.UndefOr[js.Function1[/* element */ HTMLElement, Boolean]] = js.undefined
    
    var onFocus: js.UndefOr[
        js.Function2[/* activeElement */ HTMLElement, /* options */ OmitFocusManagerOptionson, Unit]
      ] = js.undefined
    
    var onNotFound: js.UndefOr[js.Function1[/* options */ OmitFocusManagerOptionson, Unit]] = js.undefined
  }
  object FocusOptions {
    
    inline def apply(): FocusOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FocusOptions] (val x: Self) extends AnyVal {
      
      inline def setCanFocus(value: /* element */ HTMLElement => Boolean): Self = StObject.set(x, "canFocus", js.Any.fromFunction1(value))
      
      inline def setCanFocusUndefined: Self = StObject.set(x, "canFocus", js.undefined)
      
      inline def setOnFocus(value: (/* activeElement */ HTMLElement, /* options */ OmitFocusManagerOptionson) => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction2(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnNotFound(value: /* options */ OmitFocusManagerOptionson => Unit): Self = StObject.set(x, "onNotFound", js.Any.fromFunction1(value))
      
      inline def setOnNotFoundUndefined: Self = StObject.set(x, "onNotFound", js.undefined)
    }
  }
}
