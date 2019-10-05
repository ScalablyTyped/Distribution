package typings.parchment

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.parchment.distSrcAttributorAttributorMod.default
import typings.parchment.distSrcBlotAbstractBlotMod.Blot
import typings.parchment.distSrcRegistryMod.BlotConstructor
import typings.parchment.distSrcRegistryMod.Scope
import typings.parchment.parchmentStrings.__blot
import typings.std.Error
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parchment/dist/src/registry", JSImport.Namespace)
@js.native
object distSrcRegistryMod extends js.Object {
  @js.native
  trait BlotConstructor
    extends Instantiable1[/* node */ Node, Blot]
       with Instantiable2[/* node */ Node, /* value */ js.Any, Blot] {
    var blotName: String = js.native
    def create(): Node = js.native
    def create(value: js.Any): Node = js.native
  }
  
  @js.native
  class ParchmentError protected () extends Error {
    def this(message: String) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    @JSName("stack")
    var stack_ParchmentError: String = js.native
  }
  
  @js.native
  sealed trait Scope extends js.Object
  
  val DATA_KEY: __blot = js.native
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
  def query(query: String): default | BlotConstructor | Null = js.native
  def query(query: String, scope: Scope): default | BlotConstructor | Null = js.native
  def query(query: Scope): default | BlotConstructor | Null = js.native
  def query(query: Scope, scope: Scope): default | BlotConstructor | Null = js.native
  def query(query: Node): default | BlotConstructor | Null = js.native
  def query(query: Node, scope: Scope): default | BlotConstructor | Null = js.native
  def register(Definitions: js.Any*): js.Any = js.native
  @js.native
  object Scope extends js.Object {
    @js.native
    sealed trait ANY extends Scope
    
    @js.native
    sealed trait ATTRIBUTE extends Scope
    
    @js.native
    sealed trait BLOCK extends Scope
    
    @js.native
    sealed trait BLOCK_ATTRIBUTE extends Scope
    
    @js.native
    sealed trait BLOCK_BLOT extends Scope
    
    @js.native
    sealed trait BLOT extends Scope
    
    @js.native
    sealed trait INLINE extends Scope
    
    @js.native
    sealed trait INLINE_ATTRIBUTE extends Scope
    
    @js.native
    sealed trait INLINE_BLOT extends Scope
    
    @js.native
    sealed trait LEVEL extends Scope
    
    @js.native
    sealed trait TYPE extends Scope
    
    /* 15 */ val ANY: typings.parchment.distSrcRegistryMod.Scope.ANY with Double = js.native
    /* 13 */ val ATTRIBUTE: typings.parchment.distSrcRegistryMod.Scope.ATTRIBUTE with Double = js.native
    /* 11 */ val BLOCK: typings.parchment.distSrcRegistryMod.Scope.BLOCK with Double = js.native
    /* 9 */ val BLOCK_ATTRIBUTE: typings.parchment.distSrcRegistryMod.Scope.BLOCK_ATTRIBUTE with Double = js.native
    /* 10 */ val BLOCK_BLOT: typings.parchment.distSrcRegistryMod.Scope.BLOCK_BLOT with Double = js.native
    /* 14 */ val BLOT: typings.parchment.distSrcRegistryMod.Scope.BLOT with Double = js.native
    /* 7 */ val INLINE: typings.parchment.distSrcRegistryMod.Scope.INLINE with Double = js.native
    /* 5 */ val INLINE_ATTRIBUTE: typings.parchment.distSrcRegistryMod.Scope.INLINE_ATTRIBUTE with Double = js.native
    /* 6 */ val INLINE_BLOT: typings.parchment.distSrcRegistryMod.Scope.INLINE_BLOT with Double = js.native
    /* 12 */ val LEVEL: typings.parchment.distSrcRegistryMod.Scope.LEVEL with Double = js.native
    /* 3 */ val TYPE: typings.parchment.distSrcRegistryMod.Scope.TYPE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Scope with Double] = js.native
  }
  
}

