package typings.parchment

import typings.parchment.blotMod.Blot
import typings.parchment.blotMod.BlotConstructor
import typings.parchment.blotMod.Root
import typings.parchment.scopeMod.Scope
import typings.std.Node
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registryMod {
  
  @JSImport("parchment/dist/typings/registry", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Registry
  /* static members */
  object default {
    
    @JSImport("parchment/dist/typings/registry", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("parchment/dist/typings/registry", "default.blots")
    @js.native
    def blots: WeakMap[Node, Blot] = js.native
    inline def blots_=(x: WeakMap[Node, Blot]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blots")(x.asInstanceOf[js.Any])
    
    inline def find(): Blot | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("find")().asInstanceOf[Blot | Null]
    inline def find(node: Null, bubble: Boolean): Blot | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(node.asInstanceOf[js.Any], bubble.asInstanceOf[js.Any])).asInstanceOf[Blot | Null]
    inline def find(node: Node): Blot | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(node.asInstanceOf[js.Any]).asInstanceOf[Blot | Null]
    inline def find(node: Node, bubble: Boolean): Blot | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(node.asInstanceOf[js.Any], bubble.asInstanceOf[js.Any])).asInstanceOf[Blot | Null]
  }
  
  @js.native
  trait Registry
    extends StObject
       with RegistryInterface {
    
    /* private */ var attributes: Any = js.native
    
    /* private */ var classes: Any = js.native
    
    def find(): Blot | Null = js.native
    def find(node: Null, bubble: Boolean): Blot | Null = js.native
    def find(node: Node): Blot | Null = js.native
    def find(node: Node, bubble: Boolean): Blot | Null = js.native
    
    def query(query: String): typings.parchment.attributorMod.default | BlotConstructor | Null = js.native
    def query(query: Scope): typings.parchment.attributorMod.default | BlotConstructor | Null = js.native
    def query(query: Node): typings.parchment.attributorMod.default | BlotConstructor | Null = js.native
    
    /* private */ var tags: Any = js.native
    
    /* private */ var types: Any = js.native
  }
  
  @js.native
  trait RegistryInterface extends StObject {
    
    def create(sroll: Root, input: String): Blot = js.native
    def create(sroll: Root, input: String, value: Any): Blot = js.native
    def create(sroll: Root, input: Scope): Blot = js.native
    def create(sroll: Root, input: Scope, value: Any): Blot = js.native
    def create(sroll: Root, input: Node): Blot = js.native
    def create(sroll: Root, input: Node, value: Any): Blot = js.native
    
    def query(query: String, scope: Scope): typings.parchment.attributorMod.default | BlotConstructor | Null = js.native
    def query(query: Scope, scope: Scope): typings.parchment.attributorMod.default | BlotConstructor | Null = js.native
    def query(query: Node, scope: Scope): typings.parchment.attributorMod.default | BlotConstructor | Null = js.native
    
    def register(definitions: Any*): Any = js.native
  }
}
