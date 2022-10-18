package typings.node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domEventsMod {
  
  // Make this an ambient declaration
  object global {
    
    @JSGlobal("Event")
    @js.native
    def Event: /* import warning: importer.ImportType#apply Failed type conversion: / * globalThis * / any extends {  onmessage :any,   Event :infer T} ? T : {new (type : string): node.node/dom-events.__Event, new (type : string, eventInitDict : node.node/dom-events.EventInit): node.node/dom-events.__Event} */ js.Any = js.native
    
    @JSGlobal("EventTarget")
    @js.native
    def EventTarget: /* import warning: importer.ImportType#apply Failed type conversion: / * globalThis * / any extends {  onmessage :any,   EventTarget :infer T} ? T : {new (): node.node/dom-events.__EventTarget} */ js.Any = js.native
    inline def EventTarget_=(
      x: /* import warning: importer.ImportType#apply Failed type conversion: / * globalThis * / any extends {  onmessage :any,   EventTarget :infer T} ? T : {new (): node.node/dom-events.__EventTarget} */ js.Any
    ): Unit = js.Dynamic.global.updateDynamic("EventTarget")(x.asInstanceOf[js.Any])
    
    inline def Event_=(
      x: /* import warning: importer.ImportType#apply Failed type conversion: / * globalThis * / any extends {  onmessage :any,   Event :infer T} ? T : {new (type : string): node.node/dom-events.__Event, new (type : string, eventInitDict : node.node/dom-events.EventInit): node.node/dom-events.__Event} */ js.Any
    ): Unit = js.Dynamic.global.updateDynamic("Event")(x.asInstanceOf[js.Any])
  }
  
  trait AddEventListenerOptions
    extends StObject
       with EventListenerOptions {
    
    /** When `true`, the listener is automatically removed when it is first invoked. Default: `false`. */
    var once: js.UndefOr[Boolean] = js.undefined
    
    /** When `true`, serves as a hint that the listener will not call the `Event` object's `preventDefault()` method. Default: false. */
    var passive: js.UndefOr[Boolean] = js.undefined
  }
  object AddEventListenerOptions {
    
    inline def apply(): AddEventListenerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddEventListenerOptions]
    }
    
    extension [Self <: AddEventListenerOptions](x: Self) {
      
      inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
      
      inline def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
      
      inline def setPassiveUndefined: Self = StObject.set(x, "passive", js.undefined)
    }
  }
  
  // Don't export anything!
  //// DOM-like Events
  // NB: The Event / EventTarget / EventListener implementations below were copied
  // from lib.dom.d.ts, then edited to reflect Node's documentation at
  // https://nodejs.org/api/events.html#class-eventtarget.
  // Please read that link to understand important implementation differences.
  // This conditional type will be the existing global Event in a browser, or
  // the copy below in a Node environment.
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    / * globalThis * / any extends {  onmessage :any,   Event :infer T} ? T : { readonly bubbles :boolean, cancelBubble (): void,  readonly cancelable :boolean,  readonly composed :boolean, composedPath (): [std.EventTarget | undefined],  readonly currentTarget :std.EventTarget | null,  readonly defaultPrevented :boolean,  readonly eventPhase :0 | 2,  readonly isTrusted :boolean, preventDefault (): void,   returnValue :boolean,  readonly srcElement :std.EventTarget | null, stopImmediatePropagation (): void, stopPropagation (): void,  readonly target :std.EventTarget | null,  readonly timeStamp :number,  readonly type :string}
    }}}
    */
  @js.native
  trait Event extends StObject
  
  trait EventInit extends StObject {
    
    var bubbles: js.UndefOr[Boolean] = js.undefined
    
    var cancelable: js.UndefOr[Boolean] = js.undefined
    
    var composed: js.UndefOr[Boolean] = js.undefined
  }
  object EventInit {
    
    inline def apply(): EventInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventInit]
    }
    
    extension [Self <: EventInit](x: Self) {
      
      inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      inline def setBubblesUndefined: Self = StObject.set(x, "bubbles", js.undefined)
      
      inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      inline def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
      
      inline def setComposed(value: Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
      
      inline def setComposedUndefined: Self = StObject.set(x, "composed", js.undefined)
    }
  }
  
  type EventListener = js.Function1[/* evt */ typings.std.Event, Unit]
  
  trait EventListenerObject extends StObject {
    
    def handleEvent(`object`: typings.std.Event): Unit
  }
  object EventListenerObject {
    
    inline def apply(handleEvent: typings.std.Event => Unit): EventListenerObject = {
      val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
      __obj.asInstanceOf[EventListenerObject]
    }
    
    extension [Self <: EventListenerObject](x: Self) {
      
      inline def setHandleEvent(value: typings.std.Event => Unit): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
    }
  }
  
  trait EventListenerOptions extends StObject {
    
    /** Not directly used by Node.js. Added for API completeness. Default: `false`. */
    var capture: js.UndefOr[Boolean] = js.undefined
  }
  object EventListenerOptions {
    
    inline def apply(): EventListenerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventListenerOptions]
    }
    
    extension [Self <: EventListenerOptions](x: Self) {
      
      inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    }
  }
  
  // See comment above explaining conditional type
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    / * globalThis * / any extends {  onmessage :any,   EventTarget :infer T} ? T : {addEventListener (type : string, listener : node.node/dom-events.EventListener): void, addEventListener (type : string, listener : node.node/dom-events.EventListenerObject): void, addEventListener (type : string, listener : node.node/dom-events.EventListener, options : node.node/dom-events.AddEventListenerOptions): void, addEventListener (type : string, listener : node.node/dom-events.EventListenerObject, options : node.node/dom-events.AddEventListenerOptions): void, addEventListener (type : string, listener : node.node/dom-events.EventListener, options : boolean): void, addEventListener (type : string, listener : node.node/dom-events.EventListenerObject, options : boolean): void, dispatchEvent (event : std.Event): boolean, removeEventListener (type : string, listener : node.node/dom-events.EventListener): void, removeEventListener (type : string, listener : node.node/dom-events.EventListenerObject): void, removeEventListener (type : string, listener : node.node/dom-events.EventListener, options : node.node/dom-events.EventListenerOptions): void, removeEventListener (type : string, listener : node.node/dom-events.EventListenerObject, options : node.node/dom-events.EventListenerOptions): void, removeEventListener (type : string, listener : node.node/dom-events.EventListener, options : boolean): void, removeEventListener (type : string, listener : node.node/dom-events.EventListenerObject, options : boolean): void}
    }}}
    */
  @js.native
  trait EventTarget extends StObject
}
