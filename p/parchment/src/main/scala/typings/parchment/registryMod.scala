package typings.parchment

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.parchment.attributorMod.default
import typings.parchment.blotMod.Blot
import typings.parchment.parchmentStrings.__blot
import typings.std.Error
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parchment/dist/src/registry", JSImport.Namespace)
@js.native
object registryMod extends js.Object {
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Scope with Double] = js.native
    /* 15 */ @js.native
    object ANY extends TopLevel[ANY with Double]
    
    /* 13 */ @js.native
    object ATTRIBUTE extends TopLevel[ATTRIBUTE with Double]
    
    /* 11 */ @js.native
    object BLOCK extends TopLevel[BLOCK with Double]
    
    /* 9 */ @js.native
    object BLOCK_ATTRIBUTE extends TopLevel[BLOCK_ATTRIBUTE with Double]
    
    /* 10 */ @js.native
    object BLOCK_BLOT extends TopLevel[BLOCK_BLOT with Double]
    
    /* 14 */ @js.native
    object BLOT extends TopLevel[BLOT with Double]
    
    /* 7 */ @js.native
    object INLINE extends TopLevel[INLINE with Double]
    
    /* 5 */ @js.native
    object INLINE_ATTRIBUTE extends TopLevel[INLINE_ATTRIBUTE with Double]
    
    /* 6 */ @js.native
    object INLINE_BLOT extends TopLevel[INLINE_BLOT with Double]
    
    /* 12 */ @js.native
    object LEVEL extends TopLevel[LEVEL with Double]
    
    /* 3 */ @js.native
    object TYPE extends TopLevel[TYPE with Double]
    
  }
  
}

