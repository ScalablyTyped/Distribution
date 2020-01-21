package typings.parchment

import typings.parchment.blotMod.Blot
import typings.parchment.registryMod.BlotConstructor
import typings.parchment.registryMod.Scope
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parchment", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  object default extends js.Object {
    var Attributor: AnonAttributeClass = js.native
    var Block: TypeofClassBlockBlot = js.native
    var Container: TypeofClassContainerBlot = js.native
    var Embed: TypeofClassEmbedBlot = js.native
    var Format: TypeofClassFormatBlot = js.native
    var Inline: TypeofClassInlineBlot = js.native
    var Leaf: TypeofClassLeafBlot = js.native
    var Scope: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Registry.Scope */ js.Any = js.native
    var Scroll: TypeofClassScrollBlot = js.native
    var Text: TypeofClassTextBlot = js.native
    @JSName("create")
    var create_Original: js.Function2[/* input */ Node | String | Scope, /* value */ js.UndefOr[js.Any], Blot] = js.native
    @JSName("find")
    var find_Original: js.Function2[/* node */ Node | Null, /* bubble */ js.UndefOr[Boolean], Blot | Null] = js.native
    @JSName("query")
    var query_Original: js.Function2[
        /* query */ String | Node | Scope, 
        /* scope */ js.UndefOr[Scope], 
        typings.parchment.attributorMod.default | BlotConstructor | Null
      ] = js.native
    @JSName("register")
    var register_Original: js.Function1[/* repeated */ js.Any, _] = js.native
    def create(input: String): Blot = js.native
    def create(input: String, value: js.Any): Blot = js.native
    def create(input: Scope): Blot = js.native
    def create(input: Scope, value: js.Any): Blot = js.native
    def create(input: Node): Blot = js.native
    def create(input: Node, value: js.Any): Blot = js.native
    def find(): Blot | Null = js.native
    def find(node: Null, bubble: Boolean): Blot | Null = js.native
    def find(node: Node): Blot | Null = js.native
    def find(node: Node, bubble: Boolean): Blot | Null = js.native
    def query(query: String): typings.parchment.attributorMod.default | BlotConstructor | Null = js.native
    def query(query: String, scope: Scope): typings.parchment.attributorMod.default | BlotConstructor | Null = js.native
    def query(query: Scope): typings.parchment.attributorMod.default | BlotConstructor | Null = js.native
    def query(query: Scope, scope: Scope): typings.parchment.attributorMod.default | BlotConstructor | Null = js.native
    def query(query: Node): typings.parchment.attributorMod.default | BlotConstructor | Null = js.native
    def query(query: Node, scope: Scope): typings.parchment.attributorMod.default | BlotConstructor | Null = js.native
    def register(Definitions: js.Any*): js.Any = js.native
  }
  
}

