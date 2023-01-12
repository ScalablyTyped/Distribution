package typings.naja

import typings.naja.distNajaMod.Naja
import typings.naja.distNajaMod.Options
import typings.naja.distNajaMod.Payload
import typings.naja.distUtilsMod.TypedEventListener
import typings.naja.najaStrings.interaction
import typings.std.AddEventListenerOptions
import typings.std.CustomEvent
import typings.std.Element
import typings.std.Event
import typings.std.EventTarget
import typings.std.HTMLElement
import typings.std.HTMLFormElement
import typings.std.MouseEvent
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreUihandlerMod {
  
  @JSImport("naja/dist/core/UIHandler", "UIHandler")
  @js.native
  open class UIHandler protected ()
    extends StObject
       with EventTarget {
    def this(naja: Naja) = this()
    
    @JSName("addEventListener")
    def addEventListener_interaction(
      `type`: String,
      listener: TypedEventListener[
          UIHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: string extends 'interaction' ? naja.naja/dist/core/UIHandler.UIHandlerEventMap[string] : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_interaction(
      `type`: String,
      listener: TypedEventListener[
          UIHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: string extends 'interaction' ? naja.naja/dist/core/UIHandler.UIHandlerEventMap[string] : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_interaction(
      `type`: String,
      listener: TypedEventListener[
          UIHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: string extends 'interaction' ? naja.naja/dist/core/UIHandler.UIHandlerEventMap[string] : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_interaction(
      `type`: interaction,
      listener: TypedEventListener[
          UIHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'interaction' extends 'interaction' ? naja.naja/dist/core/UIHandler.InteractionEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_interaction(
      `type`: interaction,
      listener: TypedEventListener[
          UIHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'interaction' extends 'interaction' ? naja.naja/dist/core/UIHandler.InteractionEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_interaction(
      `type`: interaction,
      listener: TypedEventListener[
          UIHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'interaction' extends 'interaction' ? naja.naja/dist/core/UIHandler.InteractionEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    var allowedOrigins: js.Array[String | URL] = js.native
    
    def bindUI(element: Element): Unit = js.native
    
    def clickElement(element: HTMLElement): js.Promise[Payload] = js.native
    def clickElement(element: HTMLElement, options: Unit, event: MouseEvent): js.Promise[Payload] = js.native
    def clickElement(element: HTMLElement, options: Options): js.Promise[Payload] = js.native
    def clickElement(element: HTMLElement, options: Options, event: MouseEvent): js.Promise[Payload] = js.native
    
    /* private */ var handleUI: Any = js.native
    
    /* private */ var handler: Any = js.native
    
    /* private */ var initialize: Any = js.native
    
    def isUrlAllowed(url: String): Boolean = js.native
    
    /* private */ val naja: Any = js.native
    
    @JSName("removeEventListener")
    def removeEventListener_interaction(
      `type`: String,
      listener: TypedEventListener[
          UIHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: string extends 'interaction' ? naja.naja/dist/core/UIHandler.UIHandlerEventMap[string] : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_interaction(
      `type`: String,
      listener: TypedEventListener[
          UIHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: string extends 'interaction' ? naja.naja/dist/core/UIHandler.UIHandlerEventMap[string] : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_interaction(
      `type`: String,
      listener: TypedEventListener[
          UIHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: string extends 'interaction' ? naja.naja/dist/core/UIHandler.UIHandlerEventMap[string] : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_interaction(
      `type`: interaction,
      listener: TypedEventListener[
          UIHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'interaction' extends 'interaction' ? naja.naja/dist/core/UIHandler.InteractionEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_interaction(
      `type`: interaction,
      listener: TypedEventListener[
          UIHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'interaction' extends 'interaction' ? naja.naja/dist/core/UIHandler.InteractionEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_interaction(
      `type`: interaction,
      listener: TypedEventListener[
          UIHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'interaction' extends 'interaction' ? naja.naja/dist/core/UIHandler.InteractionEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    var selector: String = js.native
    
    def submitForm(form: HTMLFormElement): js.Promise[Payload] = js.native
    def submitForm(form: HTMLFormElement, options: Unit, event: Event): js.Promise[Payload] = js.native
    def submitForm(form: HTMLFormElement, options: Options): js.Promise[Payload] = js.native
    def submitForm(form: HTMLFormElement, options: Options, event: Event): js.Promise[Payload] = js.native
  }
  
  type InteractionEvent = CustomEvent[typings.naja.anon.Element]
  
  trait UIHandlerEventMap extends StObject {
    
    var interaction: InteractionEvent
  }
  object UIHandlerEventMap {
    
    inline def apply(interaction: InteractionEvent): UIHandlerEventMap = {
      val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any])
      __obj.asInstanceOf[UIHandlerEventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UIHandlerEventMap] (val x: Self) extends AnyVal {
      
      inline def setInteraction(value: InteractionEvent): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    }
  }
}
