package typings.nickThompsonElementary

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.nickThompsonElementary.nickThompsonElementaryStrings.abs
import typings.nickThompsonElementary.nickThompsonElementaryStrings.add
import typings.nickThompsonElementary.nickThompsonElementaryStrings.asinh
import typings.nickThompsonElementary.nickThompsonElementaryStrings.biquad
import typings.nickThompsonElementary.nickThompsonElementaryStrings.ceil
import typings.nickThompsonElementary.nickThompsonElementaryStrings.const
import typings.nickThompsonElementary.nickThompsonElementaryStrings.convolve
import typings.nickThompsonElementary.nickThompsonElementaryStrings.cos
import typings.nickThompsonElementary.nickThompsonElementaryStrings.counter
import typings.nickThompsonElementary.nickThompsonElementaryStrings.delay
import typings.nickThompsonElementary.nickThompsonElementaryStrings.div
import typings.nickThompsonElementary.nickThompsonElementaryStrings.exp
import typings.nickThompsonElementary.nickThompsonElementaryStrings.floor
import typings.nickThompsonElementary.nickThompsonElementaryStrings.ge
import typings.nickThompsonElementary.nickThompsonElementaryStrings.geq
import typings.nickThompsonElementary.nickThompsonElementaryStrings.in
import typings.nickThompsonElementary.nickThompsonElementaryStrings.latch
import typings.nickThompsonElementary.nickThompsonElementaryStrings.le
import typings.nickThompsonElementary.nickThompsonElementaryStrings.leq
import typings.nickThompsonElementary.nickThompsonElementaryStrings.ln
import typings.nickThompsonElementary.nickThompsonElementaryStrings.log
import typings.nickThompsonElementary.nickThompsonElementaryStrings.log2
import typings.nickThompsonElementary.nickThompsonElementaryStrings.max
import typings.nickThompsonElementary.nickThompsonElementaryStrings.min
import typings.nickThompsonElementary.nickThompsonElementaryStrings.mod
import typings.nickThompsonElementary.nickThompsonElementaryStrings.mul
import typings.nickThompsonElementary.nickThompsonElementaryStrings.phasor
import typings.nickThompsonElementary.nickThompsonElementaryStrings.pole
import typings.nickThompsonElementary.nickThompsonElementaryStrings.pow
import typings.nickThompsonElementary.nickThompsonElementaryStrings.rand
import typings.nickThompsonElementary.nickThompsonElementaryStrings.root
import typings.nickThompsonElementary.nickThompsonElementaryStrings.sample
import typings.nickThompsonElementary.nickThompsonElementaryStrings.seq
import typings.nickThompsonElementary.nickThompsonElementaryStrings.sin
import typings.nickThompsonElementary.nickThompsonElementaryStrings.sqrt
import typings.nickThompsonElementary.nickThompsonElementaryStrings.sr
import typings.nickThompsonElementary.nickThompsonElementaryStrings.sub
import typings.nickThompsonElementary.nickThompsonElementaryStrings.table
import typings.nickThompsonElementary.nickThompsonElementaryStrings.tan
import typings.nickThompsonElementary.nickThompsonElementaryStrings.tanh
import typings.nickThompsonElementary.nickThompsonElementaryStrings.z
import typings.nickThompsonElementary.srcCoreChildrenMod.NodeChildren
import typings.nickThompsonElementary.srcCorePropsMod.NodeProps
import typings.nickThompsonElementary.srcCoreTypesMod.CompositeNodeType
import typings.nickThompsonElementary.srcCoreTypesMod.NativeNodeType
import typings.nickThompsonElementary.srcCoreTypesMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreNodeMod {
  
  type AbsNode = NativeNode[abs]
  
  type AddNode = NativeNode[add]
  
  type AsinhNode = NativeNode[asinh]
  
  type BiquadNode = NativeNode[biquad]
  
  type CeilNode = NativeNode[ceil]
  
  trait CompositeNode[T /* <: CompositeNodeType */]
    extends StObject
       with Node
  object CompositeNode {
    
    inline def apply[T /* <: CompositeNodeType */](DollarDollartypeof: Any): CompositeNode[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompositeNode[T]]
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends @nick-thompson/elementary.@nick-thompson/elementary/src/core/types.NativeNodeType ? @nick-thompson/elementary.@nick-thompson/elementary/src/core/node.NativeNode<T> : T extends @nick-thompson/elementary.@nick-thompson/elementary/src/core/types.CompositeNodeType ? @nick-thompson/elementary.@nick-thompson/elementary/src/core/node.CompositeNode<T> : never
    }}}
    */
  @js.native
  trait ConcreteNode[T /* <: NodeType */] extends StObject
  
  type ConstNode = NativeNode[const]
  
  type ConvolveNode = NativeNode[convolve]
  
  type CosNode = NativeNode[cos]
  
  type CounterNode = NativeNode[counter]
  
  type DelayNode = NativeNode[delay]
  
  type DivNode = NativeNode[div]
  
  type ExpNode = NativeNode[exp]
  
  type FloorNode = NativeNode[floor]
  
  type GeNode = NativeNode[ge]
  
  type GeqNode = NativeNode[geq]
  
  type InNode = NativeNode[in]
  
  type LatchNode = NativeNode[latch]
  
  type LeNode = NativeNode[le]
  
  type LeqNode = NativeNode[leq]
  
  type LnNode = NativeNode[ln]
  
  type Log2Node = NativeNode[log2]
  
  type LogNode = NativeNode[log]
  
  type MaxNode = NativeNode[max]
  
  type MinNode = NativeNode[min]
  
  type ModNode = NativeNode[mod]
  
  type MulNode = NativeNode[mul]
  
  trait NativeNode[T /* <: NativeNodeType */]
    extends StObject
       with Node
  object NativeNode {
    
    inline def apply[T /* <: NativeNodeType */](DollarDollartypeof: Any): NativeNode[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeNode[T]]
    }
  }
  
  trait Node extends StObject {
    
    /**
      * Do not use this! It is only here to differentiate {@link Node} and
      * {@link Props} types.
      *
      * @see Node
      * @see Props
      */
    @JSName("$$typeof")
    var DollarDollartypeof: Any
  }
  object Node {
    
    inline def apply(DollarDollartypeof: Any): Node = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setDollarDollartypeof(value: Any): Self = StObject.set(x, "$$typeof", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NodeConstructor
    extends StObject
       with Instantiable2[/* type */ NodeType, /* children */ NodeChildren[NodeType], ConcreteNode[NodeType]]
       with Instantiable3[
          /* type */ NodeType, 
          /* props */ NodeProps[NodeType], 
          /* children */ NodeChildren[NodeType], 
          ConcreteNode[NodeType]
        ]
  
  type NodeFactory[T /* <: NodeType */, P /* <: NodeProps[T] */, C /* <: NodeChildren[T] */, R /* <: ConcreteNode[T] */] = (js.Function2[/* props */ P, /* children */ C, R]) & (js.Function1[/* children */ C, R])
  
  @js.native
  trait NodeStatic
    extends StObject
       with NodeConstructor {
    
    /**
      * Checks whether an object is a {@link Node}
      *
      * @param toCheck
      * object to check whether it is a {@link Node}
      *
      * @returns
      * whether toCheck is a {@link Node}
      *
      * @see NodeStatic
      * @see Node
      */
    def isNode(toCheck: Any): /* is @nick-thompson/elementary.@nick-thompson/elementary/src/core/node.Node */ Boolean = js.native
  }
  
  type PhasorNode = NativeNode[phasor]
  
  type PoleNode = NativeNode[pole]
  
  type PowNode = NativeNode[pow]
  
  type RandNode = NativeNode[rand]
  
  type RootNode = NativeNode[root]
  
  type SampleNode = NativeNode[sample]
  
  type SeqNode = NativeNode[seq]
  
  type SinNode = NativeNode[sin]
  
  type SqrtNode = NativeNode[sqrt]
  
  type SrNode = NativeNode[sr]
  
  type SubNode = NativeNode[sub]
  
  type TableNode = NativeNode[table]
  
  type TanNode = NativeNode[tan]
  
  type TanhNode = NativeNode[tanh]
  
  type ZNode = NativeNode[z]
}
