package typings.nickThompsonElementary

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  @JSImport("@nick-thompson/elementary/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "abs")
  @js.native
  val abs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'abs', core.KeyProps, [operand: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "add")
  @js.native
  val add: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'add', core.KeyProps, [operands: ...core.VariadicChildrenArray]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "adsr")
  @js.native
  val adsr: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<core.CompositeNodeType, core.KeyProps, [attack: core.Child, delay: core.Child, sustain: core.Child, release: core.Child, gate: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "allpass")
  @js.native
  val allpass: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<core.CompositeNodeType, core.KeyProps, [cutoff: core.Child, Q: core.Child, signal: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "asinh")
  @js.native
  val asinh: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'asinh', core.KeyProps, [operand: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "bandpass")
  @js.native
  val bandpass: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<core.CompositeNodeType, core.KeyProps, [cutoff: core.Child, Q: core.Child, signal: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "biquad")
  @js.native
  val biquad: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'biquad', core.KeyProps, [b0: core.Child, b1: core.Child, b2: core.Child, a1: core.Child, a2: core.Child, signal: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "blepsaw")
  @js.native
  val blepsaw: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<core.CompositeNodeType, core.KeyProps, [frequency: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "blepsquare")
  @js.native
  val blepsquare: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<core.CompositeNodeType, core.KeyProps, [frequency: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "bleptriangle")
  @js.native
  val bleptriangle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<core.CompositeNodeType, core.KeyProps, [frequency: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "ceil")
  @js.native
  val ceil: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'ceil', core.KeyProps, [operand: core.Child]> */ Any = js.native
  
  /**
    * A constant value node whose value is set by the value prop.
    * Commonly, you'll see the const node expressed as a numeric literal.
    *
    * In the following example, the two expressions are equivalent.
    * @example
    *     el.cycle(440)
    *     el.cycle(el.const({value: 440}))
    *
    * @param [props]
    * {@link core.ConstProps} object
    *
    * @returns
    * a {@link core.ConstNode} that returns the given value
    *
    * @see el
    * @see core.KeyProps
    * @see core.ConstProps
    * @see core.Child
    * @see core.ConstNode
    */
  @JSImport("@nick-thompson/elementary/src", "const")
  @js.native
  val const: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'const', core.ConstProps, []> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "convolve")
  @js.native
  val convolve: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'convolve', core.ConvolveProps, [signal: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "cos")
  @js.native
  val cos: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'cos', core.KeyProps, [operand: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "counter")
  @js.native
  val counter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'counter', core.KeyProps, [pulse: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "createNode")
  @js.native
  val createNode: (js.Function3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeType */ /* type */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeProps<T> */ /* props */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeChildren<T> */ /* children */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ConcreteNode<T> */ Any
  ]) & (js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeType */ /* type */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeChildren<T> */ /* children */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ConcreteNode<T> */ Any
  ]) = js.native
  
  inline def createNodeFactory[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeType */ Any */](`type`: T): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createNodeFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@nick-thompson/elementary/src", "cycle")
  @js.native
  val cycle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<core.CompositeNodeType, core.KeyProps, [frequency: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "dcblock")
  @js.native
  val dcblock: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<core.CompositeNodeType, core.KeyProps, [signal: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "delay")
  @js.native
  val delay: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'delay', core.DelayProps, [length: core.Child, feedback: core.Child, signal: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "df11")
  @js.native
  val df11: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<core.CompositeNodeType, core.KeyProps, [b0: core.Child, b1: core.Child, a1: core.Child, signal: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "div")
  @js.native
  val div: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'div', core.KeyProps, [operands: ...core.VariadicChildrenArray]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "exp")
  @js.native
  val exp: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'exp', core.KeyProps, [operand: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "floor")
  @js.native
  val floor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'floor', core.KeyProps, [operand: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "ge")
  @js.native
  val ge: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'ge', core.KeyProps, [first: core.Child, second: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "geq")
  @js.native
  val geq: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'geq', core.KeyProps, [first: core.Child, second: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "hann")
  @js.native
  val hann: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<core.CompositeNodeType, core.KeyProps, [phase: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "highpass")
  @js.native
  val highpass: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<core.CompositeNodeType, core.KeyProps, [cutoff: core.Child, Q: core.Child, signal: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "highshelf")
  @js.native
  val highshelf: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<core.CompositeNodeType, core.KeyProps, [cutoff: core.Child, Q: core.Child, gain: core.Child, signal: core.Child]> */ Any = js.native
  
  /**
    * Either the identity or the input function.
    *
    * @param [props]
    * props object optional key or {@link core.InProps}
    *
    * @param [operand]
    * if using in as the identity function the child of which the result will
    * be returned
    *
    * @returns
    * a {@link core.InNode} that returns the result of the operand or the
    * stream of the input
    *
    * @see identity
    * @see input
    * @see el
    * @see core.InProps
    * @see core.KeyProps
    * @see core.Child
    * @see core.Node
    */
  @JSImport("@nick-thompson/elementary/src", "in")
  @js.native
  val in: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'in', core.KeyProps, [operand: core.Child]> */ Any = js.native
  
  inline def inputs(): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.InNode */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("inputs")().asInstanceOf[js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.InNode */ Any
  ]]
  
  @JSImport("@nick-thompson/elementary/src", "latch")
  @js.native
  val latch: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'latch', core.KeyProps, [control: core.Child, input: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "le")
  @js.native
  val le: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'le', core.KeyProps, [first: core.Child, second: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "leq")
  @js.native
  val leq: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'leq', core.KeyProps, [first: core.Child, second: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "ln")
  @js.native
  val ln: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'ln', core.KeyProps, [operand: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "log")
  @js.native
  val log: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'log', core.KeyProps, [operand: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "log2")
  @js.native
  val log2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'log2', core.KeyProps, [operand: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "lowpass")
  @js.native
  val lowpass: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<core.CompositeNodeType, core.KeyProps, [cutoff: core.Child, Q: core.Child, signal: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "lowshelf")
  @js.native
  val lowshelf: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<core.CompositeNodeType, core.KeyProps, [cutoff: core.Child, Q: core.Child, gain: core.Child, signal: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "max")
  @js.native
  val max: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'max', core.KeyProps, [first: core.Child, second: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "min")
  @js.native
  val min: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'min', core.KeyProps, [first: core.Child, second: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "mod")
  @js.native
  val mod: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'mod', core.KeyProps, [first: core.Child, second: core.Child]> */ Any = js.native
  
  inline def ms2samps(
    child: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Node */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ms2samps")(child.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def ms2samps(time: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ms2samps")(time.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("@nick-thompson/elementary/src", "mul")
  @js.native
  val mul: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'mul', core.KeyProps, [operands: ...core.VariadicChildrenArray]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "noise")
  @js.native
  val noise: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<core.CompositeNodeType, core.KeyProps, []> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "notch")
  @js.native
  val notch: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<core.CompositeNodeType, core.KeyProps, [cutoff: core.Child, Q: core.Child, signal: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "peak")
  @js.native
  val peak: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<core.CompositeNodeType, core.KeyProps, [cutoff: core.Child, Q: core.Child, gain: core.Child, signal: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "phasor")
  @js.native
  val phasor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'phasor', core.KeyProps, [rate: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "pink")
  @js.native
  val pink: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<core.CompositeNodeType, core.KeyProps, [signal: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "pinknoise")
  @js.native
  val pinknoise: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<core.CompositeNodeType, core.KeyProps, []> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "pole")
  @js.native
  val pole: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'pole', core.KeyProps, [polePosition: core.Child, signal: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "pow")
  @js.native
  val pow: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'pow', core.KeyProps, [first: core.Child, second: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "rand")
  @js.native
  val rand: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'rand', core.KeyProps, []> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "sample")
  @js.native
  val sample: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'sample', core.SampleProps, [trigger: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "saw")
  @js.native
  val saw: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<core.CompositeNodeType, core.KeyProps, [frequency: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "select")
  @js.native
  val select: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<core.CompositeNodeType, core.KeyProps, [signal: core.Child, high: core.Child, low: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "seq")
  @js.native
  val seq: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'seq', core.SeqProps, [next: core.Child] | [next: core.Child, last: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "sin")
  @js.native
  val sin: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'sin', core.KeyProps, [operand: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "sm")
  @js.native
  val sm: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<core.CompositeNodeType, core.KeyProps, [signal: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "smooth")
  @js.native
  val smooth: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<core.CompositeNodeType, core.KeyProps, [polePosition: core.Child, signal: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "sqrt")
  @js.native
  val sqrt: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'sqrt', core.KeyProps, [operand: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "square")
  @js.native
  val square: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<core.CompositeNodeType, core.KeyProps, [frequency: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "sr")
  @js.native
  val sr: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'sr', core.KeyProps, []> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "sub")
  @js.native
  val sub: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'sub', core.KeyProps, [operands: ...core.VariadicChildrenArray]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "table")
  @js.native
  val table: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'table', core.KeyProps, [trigger: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "tan")
  @js.native
  val tan: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'tan', core.KeyProps, [operand: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "tanh")
  @js.native
  val tanh: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'tanh', core.KeyProps, [operand: core.Child]> */ Any = js.native
  
  inline def tau2pole(
    child: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Node */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("tau2pole")(child.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def tau2pole(time: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("tau2pole")(time.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("@nick-thompson/elementary/src", "train")
  @js.native
  val train: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<core.CompositeNodeType, core.KeyProps, [rate: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "triangle")
  @js.native
  val triangle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<core.CompositeNodeType, core.KeyProps, [frequency: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "z")
  @js.native
  val z: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'z', core.KeyProps, []> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src", "zero")
  @js.native
  val zero: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<core.CompositeNodeType, core.KeyProps, [b0: core.Child, b1: core.Child, signal: core.Child]> */ Any = js.native
}
