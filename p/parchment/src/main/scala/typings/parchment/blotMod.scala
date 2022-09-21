package typings.parchment

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import typings.parchment.anon.AllowedChildren
import typings.parchment.linkedListMod.default
import typings.parchment.linkedNodeMod.LinkedNode
import typings.parchment.scopeMod.Scope
import typings.std.HTMLElement
import typings.std.MutationRecord
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blotMod {
  
  @js.native
  trait Blot
    extends StObject
       with LinkedNode {
    
    def attach(): Unit = js.native
    
    def deleteAt(index: Double, length: Double): Unit = js.native
    
    def detach(): Unit = js.native
    
    var domNode: Node = js.native
    
    def formatAt(index: Double, length: Double, name: String, value: Any): Unit = js.native
    
    def insertAt(index: Double, value: String): Unit = js.native
    def insertAt(index: Double, value: String, `def`: Any): Unit = js.native
    
    def isolate(index: Double, length: Double): Blot = js.native
    
    @JSName("next")
    var next_Blot: Blot | Null = js.native
    
    def offset(): Double = js.native
    def offset(root: Blot): Double = js.native
    
    def optimize(context: StringDictionary[Any]): Unit = js.native
    def optimize(mutations: js.Array[MutationRecord], context: StringDictionary[Any]): Unit = js.native
    
    var parent: Parent = js.native
    
    @JSName("prev")
    var prev_Blot: Blot | Null = js.native
    
    def remove(): Unit = js.native
    
    def replaceWith(name: String, value: Any): Blot = js.native
    def replaceWith(replacement: Blot): Blot = js.native
    
    var scroll: Root = js.native
    
    def split(index: Double): Blot | Null = js.native
    def split(index: Double, force: Boolean): Blot | Null = js.native
    
    var statics: AllowedChildren = js.native
    
    def update(mutations: js.Array[MutationRecord], context: StringDictionary[Any]): Unit = js.native
    
    def wrap(name: String, value: Any): Parent = js.native
    def wrap(wrapper: Parent): Parent = js.native
  }
  
  @js.native
  trait BlotConstructor
    extends StObject
       with Instantiable2[/* scroll */ Root, /* node */ Node, Blot]
       with Instantiable3[/* scroll */ Root, /* node */ Node, /* value */ Any, Blot] {
    
    var blotName: String = js.native
    
    var className: js.UndefOr[String] = js.native
    
    def create(): Node = js.native
    def create(value: Any): Node = js.native
    
    var tagName: String = js.native
  }
  
  @js.native
  trait Formattable
    extends StObject
       with Blot {
    
    def format(name: String, value: Any): Unit = js.native
    
    def formats(): StringDictionary[Any] = js.native
  }
  
  @js.native
  trait Leaf
    extends StObject
       with Blot {
    
    def index(node: Node, offset: Double): Double = js.native
    
    def position(index: Double, inclusive: Boolean): js.Tuple2[Node, Double] = js.native
    
    def value(): Any = js.native
  }
  
  @js.native
  trait Parent
    extends StObject
       with Blot {
    
    def appendChild(child: Blot): Unit = js.native
    
    var children: default[Blot] = js.native
    
    def descendant[T](matcher: js.Function1[/* blot */ Blot, Boolean], index: Double): js.Tuple2[T, Double] = js.native
    def descendant[T](`type`: Instantiable0[T], index: Double): js.Tuple2[T, Double] = js.native
    
    def descendants[T](matcher: js.Function1[/* blot */ Blot, Boolean], index: Double, length: Double): js.Array[T] = js.native
    def descendants[T](`type`: Instantiable0[T], index: Double, length: Double): js.Array[T] = js.native
    
    @JSName("domNode")
    var domNode_Parent: HTMLElement = js.native
    
    def insertBefore(child: Blot): Unit = js.native
    def insertBefore(child: Blot, refNode: Blot): Unit = js.native
    
    def moveChildren(parent: Parent): Unit = js.native
    def moveChildren(parent: Parent, refNode: Blot): Unit = js.native
    
    def path(index: Double): js.Array[js.Tuple2[Blot, Double]] = js.native
    def path(index: Double, inclusive: Boolean): js.Array[js.Tuple2[Blot, Double]] = js.native
    
    def removeChild(child: Blot): Unit = js.native
    
    def unwrap(): Unit = js.native
  }
  
  @js.native
  trait Root
    extends StObject
       with Parent {
    
    def create(input: String): Blot = js.native
    def create(input: String, value: Any): Blot = js.native
    def create(input: Scope): Blot = js.native
    def create(input: Scope, value: Any): Blot = js.native
    def create(input: Node): Blot = js.native
    def create(input: Node, value: Any): Blot = js.native
    
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
  }
}
