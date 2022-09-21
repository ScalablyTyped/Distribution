package typings.naja

import typings.naja.anon.ChangeOperation
import typings.naja.anon.Content
import typings.naja.anon.Recordreplaceprependappen
import typings.naja.najaMod.Naja
import typings.naja.najaMod.Options
import typings.naja.najaStrings.afterUpdate
import typings.naja.najaStrings.beforeUpdate
import typings.naja.utilsMod.TypedEventListener
import typings.std.AddEventListenerOptions
import typings.std.CustomEvent
import typings.std.Element
import typings.std.EventTarget
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snippetHandlerMod {
  
  @JSImport("naja/dist/core/SnippetHandler", "SnippetHandler")
  @js.native
  open class SnippetHandler protected ()
    extends StObject
       with EventTarget {
    def this(naja: Naja) = this()
    
    def addEventListener(
      `type`: afterUpdate,
      listener: TypedEventListener[SnippetHandler, CustomEvent[Any] | AfterUpdateEvent]
    ): Unit = js.native
    def addEventListener(
      `type`: afterUpdate,
      listener: TypedEventListener[SnippetHandler, CustomEvent[Any] | AfterUpdateEvent],
      options: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: afterUpdate,
      listener: TypedEventListener[SnippetHandler, CustomEvent[Any] | AfterUpdateEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    def addEventListener(
      `type`: beforeUpdate,
      listener: TypedEventListener[SnippetHandler, CustomEvent[Any] | BeforeUpdateEvent]
    ): Unit = js.native
    def addEventListener(
      `type`: beforeUpdate,
      listener: TypedEventListener[SnippetHandler, CustomEvent[Any] | BeforeUpdateEvent],
      options: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: beforeUpdate,
      listener: TypedEventListener[SnippetHandler, CustomEvent[Any] | BeforeUpdateEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    /* private */ val naja: Any = js.native
    
    val op: Recordreplaceprependappen = js.native
    
    def removeEventListener(
      `type`: String,
      listener: TypedEventListener[
          SnippetHandler, 
          CustomEvent[Any] | (/* import warning: importer.ImportType#apply Failed type conversion: naja.naja/dist/core/SnippetHandler.SnippetHandlerEventMap[string] */ js.Any)
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    def removeEventListener(
      `type`: afterUpdate,
      listener: TypedEventListener[SnippetHandler, CustomEvent[Any] | AfterUpdateEvent]
    ): Unit = js.native
    def removeEventListener(
      `type`: afterUpdate,
      listener: TypedEventListener[SnippetHandler, CustomEvent[Any] | AfterUpdateEvent],
      options: Boolean
    ): Unit = js.native
    def removeEventListener(
      `type`: afterUpdate,
      listener: TypedEventListener[SnippetHandler, CustomEvent[Any] | AfterUpdateEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    def removeEventListener(
      `type`: beforeUpdate,
      listener: TypedEventListener[SnippetHandler, CustomEvent[Any] | BeforeUpdateEvent]
    ): Unit = js.native
    def removeEventListener(
      `type`: beforeUpdate,
      listener: TypedEventListener[SnippetHandler, CustomEvent[Any] | BeforeUpdateEvent],
      options: Boolean
    ): Unit = js.native
    def removeEventListener(
      `type`: beforeUpdate,
      listener: TypedEventListener[SnippetHandler, CustomEvent[Any] | BeforeUpdateEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    def updateSnippet(snippet: HTMLElement, content: String, fromCache: Boolean, options: Options): Unit = js.native
    
    def updateSnippets(snippets: Record[String, String]): Unit = js.native
    def updateSnippets(snippets: Record[String, String], fromCache: Boolean): Unit = js.native
    def updateSnippets(snippets: Record[String, String], fromCache: Boolean, options: Options): Unit = js.native
    def updateSnippets(snippets: Record[String, String], fromCache: Unit, options: Options): Unit = js.native
  }
  /* static members */
  object SnippetHandler {
    
    @JSImport("naja/dist/core/SnippetHandler", "SnippetHandler")
    @js.native
    val ^ : js.Any = js.native
    
    inline def findSnippets(): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("findSnippets")().asInstanceOf[Record[String, String]]
    inline def findSnippets(predicate: js.Function1[/* snippet */ Element, Boolean]): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("findSnippets")(predicate.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
  }
  
  type AfterUpdateEvent = CustomEvent[Content]
  
  type BeforeUpdateEvent = CustomEvent[ChangeOperation]
  
  trait SnippetHandlerEventMap extends StObject {
    
    var afterUpdate: AfterUpdateEvent
    
    var beforeUpdate: BeforeUpdateEvent
  }
  object SnippetHandlerEventMap {
    
    inline def apply(afterUpdate: AfterUpdateEvent, beforeUpdate: BeforeUpdateEvent): SnippetHandlerEventMap = {
      val __obj = js.Dynamic.literal(afterUpdate = afterUpdate.asInstanceOf[js.Any], beforeUpdate = beforeUpdate.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnippetHandlerEventMap]
    }
    
    extension [Self <: SnippetHandlerEventMap](x: Self) {
      
      inline def setAfterUpdate(value: AfterUpdateEvent): Self = StObject.set(x, "afterUpdate", value.asInstanceOf[js.Any])
      
      inline def setBeforeUpdate(value: BeforeUpdateEvent): Self = StObject.set(x, "beforeUpdate", value.asInstanceOf[js.Any])
    }
  }
  
  type SnippetUpdateOperation = js.Function2[/* snippet */ Element, /* content */ String, Unit]
  
  /* augmented module */
  object najaDistNajaAugmentingMod {
    
    trait Payload extends StObject {
      
      var snippets: js.UndefOr[Record[String, String]] = js.undefined
    }
    object Payload {
      
      inline def apply(): Payload = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Payload]
      }
      
      extension [Self <: Payload](x: Self) {
        
        inline def setSnippets(value: Record[String, String]): Self = StObject.set(x, "snippets", value.asInstanceOf[js.Any])
        
        inline def setSnippetsUndefined: Self = StObject.set(x, "snippets", js.undefined)
      }
    }
  }
}
