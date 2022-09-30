package typings.nickThompsonElementary

import org.scalablytyped.runtime.StringDictionary
import typings.nickThompsonElementary.childrenMod.Child
import typings.nickThompsonElementary.childrenMod.ChildrenArray
import typings.nickThompsonElementary.childrenMod.SizedChildrenArray
import typings.nickThompsonElementary.nickThompsonElementaryInts.`0`
import typings.nickThompsonElementary.nickThompsonElementaryInts.`1`
import typings.nickThompsonElementary.nickThompsonElementaryInts.`2`
import typings.nickThompsonElementary.nickThompsonElementaryInts.`3`
import typings.nickThompsonElementary.nickThompsonElementaryInts.`6`
import typings.nickThompsonElementary.propsMod.ConstProps
import typings.nickThompsonElementary.propsMod.ConvolveProps
import typings.nickThompsonElementary.propsMod.DelayProps
import typings.nickThompsonElementary.propsMod.InProps
import typings.nickThompsonElementary.propsMod.KeyProps
import typings.nickThompsonElementary.propsMod.SampleProps
import typings.nickThompsonElementary.propsMod.SeqProps
import typings.nickThompsonElementary.propsMod.TableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictother
    extends StObject
       with /* other */ StringDictionary[KeyProps] {
    
    var const: ConstProps
    
    var convolve: ConvolveProps
    
    var delay: DelayProps
    
    var in: InProps | KeyProps
    
    var sample: SampleProps
    
    var seq: SeqProps
    
    var table: TableProps
  }
  object Dictother {
    
    inline def apply(
      const: ConstProps,
      convolve: ConvolveProps,
      delay: DelayProps,
      in: InProps | KeyProps,
      sample: SampleProps,
      seq: SeqProps,
      table: TableProps
    ): Dictother = {
      val __obj = js.Dynamic.literal(const = const.asInstanceOf[js.Any], convolve = convolve.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any], sample = sample.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictother]
    }
    
    extension [Self <: Dictother](x: Self) {
      
      inline def setConst(value: ConstProps): Self = StObject.set(x, "const", value.asInstanceOf[js.Any])
      
      inline def setConvolve(value: ConvolveProps): Self = StObject.set(x, "convolve", value.asInstanceOf[js.Any])
      
      inline def setDelay(value: DelayProps): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setIn(value: InProps | KeyProps): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setSample(value: SampleProps): Self = StObject.set(x, "sample", value.asInstanceOf[js.Any])
      
      inline def setSeq(value: SeqProps): Self = StObject.set(x, "seq", value.asInstanceOf[js.Any])
      
      inline def setTable(value: TableProps): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ key in 'in' ]: @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.SizedChildrenArray<0> | @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.SizedChildrenArray<1>} & {[ key in 'seq' ]: @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.SizedChildrenArray<1> | @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.SizedChildrenArray<2>} & {[ key in 'rand' | 'sr' | 'z' ]: @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.SizedChildrenArray<0>} & {[ key in 'counter' | 'sin' | 'cos' | 'tan' | 'tanh' | 'asinh' | 'ln' | 'log' | 'log2' | 'ceil' | 'floor' | 'sqrt' | 'exp' | 'abs' | 'convolve' | 'phasor' | 'sample' | 'table' ]: @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.SizedChildrenArray<1>} & {[ key in 'le' | 'leq' | 'ge' | 'geq' | 'pow' | 'mod' | 'min' | 'max' | 'pole' | 'latch' ]: @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.SizedChildrenArray<2>} & {[ key in 'delay' ]: @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.SizedChildrenArray<3>} & {[ key in 'biquad' ]: @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.SizedChildrenArray<6>} & {[other: string] : @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.ChildrenArray} */
  trait keyininSizedChildrenArray
    extends StObject
       with /* other */ StringDictionary[ChildrenArray] {
    
    var abs: SizedChildrenArray[`1`]
    
    var asinh: SizedChildrenArray[`1`]
    
    var biquad: SizedChildrenArray[`6`]
    
    var ceil: SizedChildrenArray[`1`]
    
    var convolve: SizedChildrenArray[`1`]
    
    var cos: SizedChildrenArray[`1`]
    
    var counter: SizedChildrenArray[`1`]
    
    var delay: SizedChildrenArray[`3`]
    
    var exp: SizedChildrenArray[`1`]
    
    var floor: SizedChildrenArray[`1`]
    
    var ge: SizedChildrenArray[`2`]
    
    var geq: SizedChildrenArray[`2`]
    
    var in: SizedChildrenArray[`0` | `1`]
    
    var latch: SizedChildrenArray[`2`]
    
    var le: SizedChildrenArray[`2`]
    
    var leq: SizedChildrenArray[`2`]
    
    var ln: SizedChildrenArray[`1`]
    
    var log: SizedChildrenArray[`1`]
    
    var log2: SizedChildrenArray[`1`]
    
    var max: SizedChildrenArray[`2`]
    
    var min: SizedChildrenArray[`2`]
    
    var mod: SizedChildrenArray[`2`]
    
    var phasor: SizedChildrenArray[`1`]
    
    var pole: SizedChildrenArray[`2`]
    
    var pow: SizedChildrenArray[`2`]
    
    var rand: SizedChildrenArray[`0`]
    
    var sample: SizedChildrenArray[`1`]
    
    var seq: SizedChildrenArray[`1` | `2`]
    
    var sin: SizedChildrenArray[`1`]
    
    var sqrt: SizedChildrenArray[`1`]
    
    var sr: SizedChildrenArray[`0`]
    
    var table: SizedChildrenArray[`1`]
    
    var tan: SizedChildrenArray[`1`]
    
    var tanh: SizedChildrenArray[`1`]
    
    var z: SizedChildrenArray[`0`]
  }
  object keyininSizedChildrenArray {
    
    extension [Self <: keyininSizedChildrenArray](x: Self) {
      
      inline def setAbs(value: SizedChildrenArray[`1`]): Self = StObject.set(x, "abs", value.asInstanceOf[js.Any])
      
      inline def setAbsVarargs(value: (Child | scala.Nothing)*): Self = StObject.set(x, "abs", js.Array(value*))
      
      inline def setAsinh(value: SizedChildrenArray[`1`]): Self = StObject.set(x, "asinh", value.asInstanceOf[js.Any])
      
      inline def setAsinhVarargs(value: (Child | scala.Nothing)*): Self = StObject.set(x, "asinh", js.Array(value*))
      
      inline def setBiquad(value: SizedChildrenArray[`6`]): Self = StObject.set(x, "biquad", value.asInstanceOf[js.Any])
      
      inline def setBiquadVarargs(value: (Child | scala.Nothing)*): Self = StObject.set(x, "biquad", js.Array(value*))
      
      inline def setCeil(value: SizedChildrenArray[`1`]): Self = StObject.set(x, "ceil", value.asInstanceOf[js.Any])
      
      inline def setCeilVarargs(value: (Child | scala.Nothing)*): Self = StObject.set(x, "ceil", js.Array(value*))
      
      inline def setConvolve(value: SizedChildrenArray[`1`]): Self = StObject.set(x, "convolve", value.asInstanceOf[js.Any])
      
      inline def setConvolveVarargs(value: (Child | scala.Nothing)*): Self = StObject.set(x, "convolve", js.Array(value*))
      
      inline def setCos(value: SizedChildrenArray[`1`]): Self = StObject.set(x, "cos", value.asInstanceOf[js.Any])
      
      inline def setCosVarargs(value: (Child | scala.Nothing)*): Self = StObject.set(x, "cos", js.Array(value*))
      
      inline def setCounter(value: SizedChildrenArray[`1`]): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
      
      inline def setCounterVarargs(value: (Child | scala.Nothing)*): Self = StObject.set(x, "counter", js.Array(value*))
      
      inline def setDelay(value: SizedChildrenArray[`3`]): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayVarargs(value: (Child | scala.Nothing)*): Self = StObject.set(x, "delay", js.Array(value*))
      
      inline def setExp(value: SizedChildrenArray[`1`]): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
      
      inline def setExpVarargs(value: (Child | scala.Nothing)*): Self = StObject.set(x, "exp", js.Array(value*))
      
      inline def setFloor(value: SizedChildrenArray[`1`]): Self = StObject.set(x, "floor", value.asInstanceOf[js.Any])
      
      inline def setFloorVarargs(value: (Child | scala.Nothing)*): Self = StObject.set(x, "floor", js.Array(value*))
      
      inline def setGe(value: SizedChildrenArray[`2`]): Self = StObject.set(x, "ge", value.asInstanceOf[js.Any])
      
      inline def setGeVarargs(value: (Child | scala.Nothing)*): Self = StObject.set(x, "ge", js.Array(value*))
      
      inline def setGeq(value: SizedChildrenArray[`2`]): Self = StObject.set(x, "geq", value.asInstanceOf[js.Any])
      
      inline def setGeqVarargs(value: (Child | scala.Nothing)*): Self = StObject.set(x, "geq", js.Array(value*))
      
      inline def setIn(value: SizedChildrenArray[`0` | `1`]): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setInVarargs(value: (Child | scala.Nothing)*): Self = StObject.set(x, "in", js.Array(value*))
      
      inline def setLatch(value: SizedChildrenArray[`2`]): Self = StObject.set(x, "latch", value.asInstanceOf[js.Any])
      
      inline def setLatchVarargs(value: (Child | scala.Nothing)*): Self = StObject.set(x, "latch", js.Array(value*))
      
      inline def setLe(value: SizedChildrenArray[`2`]): Self = StObject.set(x, "le", value.asInstanceOf[js.Any])
      
      inline def setLeVarargs(value: (Child | scala.Nothing)*): Self = StObject.set(x, "le", js.Array(value*))
      
      inline def setLeq(value: SizedChildrenArray[`2`]): Self = StObject.set(x, "leq", value.asInstanceOf[js.Any])
      
      inline def setLeqVarargs(value: (Child | scala.Nothing)*): Self = StObject.set(x, "leq", js.Array(value*))
      
      inline def setLn(value: SizedChildrenArray[`1`]): Self = StObject.set(x, "ln", value.asInstanceOf[js.Any])
      
      inline def setLnVarargs(value: (Child | scala.Nothing)*): Self = StObject.set(x, "ln", js.Array(value*))
      
      inline def setLog(value: SizedChildrenArray[`1`]): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLog2(value: SizedChildrenArray[`1`]): Self = StObject.set(x, "log2", value.asInstanceOf[js.Any])
      
      inline def setLog2Varargs(value: (Child | scala.Nothing)*): Self = StObject.set(x, "log2", js.Array(value*))
      
      inline def setLogVarargs(value: (Child | scala.Nothing)*): Self = StObject.set(x, "log", js.Array(value*))
      
      inline def setMax(value: SizedChildrenArray[`2`]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxVarargs(value: (Child | scala.Nothing)*): Self = StObject.set(x, "max", js.Array(value*))
      
      inline def setMin(value: SizedChildrenArray[`2`]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinVarargs(value: (Child | scala.Nothing)*): Self = StObject.set(x, "min", js.Array(value*))
      
      inline def setMod(value: SizedChildrenArray[`2`]): Self = StObject.set(x, "mod", value.asInstanceOf[js.Any])
      
      inline def setModVarargs(value: (Child | scala.Nothing)*): Self = StObject.set(x, "mod", js.Array(value*))
      
      inline def setPhasor(value: SizedChildrenArray[`1`]): Self = StObject.set(x, "phasor", value.asInstanceOf[js.Any])
      
      inline def setPhasorVarargs(value: (Child | scala.Nothing)*): Self = StObject.set(x, "phasor", js.Array(value*))
      
      inline def setPole(value: SizedChildrenArray[`2`]): Self = StObject.set(x, "pole", value.asInstanceOf[js.Any])
      
      inline def setPoleVarargs(value: (Child | scala.Nothing)*): Self = StObject.set(x, "pole", js.Array(value*))
      
      inline def setPow(value: SizedChildrenArray[`2`]): Self = StObject.set(x, "pow", value.asInstanceOf[js.Any])
      
      inline def setPowVarargs(value: (Child | scala.Nothing)*): Self = StObject.set(x, "pow", js.Array(value*))
      
      inline def setRand(value: SizedChildrenArray[`0`]): Self = StObject.set(x, "rand", value.asInstanceOf[js.Any])
      
      inline def setRandVarargs(value: (Child | scala.Nothing)*): Self = StObject.set(x, "rand", js.Array(value*))
      
      inline def setSample(value: SizedChildrenArray[`1`]): Self = StObject.set(x, "sample", value.asInstanceOf[js.Any])
      
      inline def setSampleVarargs(value: (Child | scala.Nothing)*): Self = StObject.set(x, "sample", js.Array(value*))
      
      inline def setSeq(value: SizedChildrenArray[`1` | `2`]): Self = StObject.set(x, "seq", value.asInstanceOf[js.Any])
      
      inline def setSeqVarargs(value: (Child | scala.Nothing)*): Self = StObject.set(x, "seq", js.Array(value*))
      
      inline def setSin(value: SizedChildrenArray[`1`]): Self = StObject.set(x, "sin", value.asInstanceOf[js.Any])
      
      inline def setSinVarargs(value: (Child | scala.Nothing)*): Self = StObject.set(x, "sin", js.Array(value*))
      
      inline def setSqrt(value: SizedChildrenArray[`1`]): Self = StObject.set(x, "sqrt", value.asInstanceOf[js.Any])
      
      inline def setSqrtVarargs(value: (Child | scala.Nothing)*): Self = StObject.set(x, "sqrt", js.Array(value*))
      
      inline def setSr(value: SizedChildrenArray[`0`]): Self = StObject.set(x, "sr", value.asInstanceOf[js.Any])
      
      inline def setSrVarargs(value: (Child | scala.Nothing)*): Self = StObject.set(x, "sr", js.Array(value*))
      
      inline def setTable(value: SizedChildrenArray[`1`]): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableVarargs(value: (Child | scala.Nothing)*): Self = StObject.set(x, "table", js.Array(value*))
      
      inline def setTan(value: SizedChildrenArray[`1`]): Self = StObject.set(x, "tan", value.asInstanceOf[js.Any])
      
      inline def setTanVarargs(value: (Child | scala.Nothing)*): Self = StObject.set(x, "tan", js.Array(value*))
      
      inline def setTanh(value: SizedChildrenArray[`1`]): Self = StObject.set(x, "tanh", value.asInstanceOf[js.Any])
      
      inline def setTanhVarargs(value: (Child | scala.Nothing)*): Self = StObject.set(x, "tanh", js.Array(value*))
      
      inline def setZ(value: SizedChildrenArray[`0`]): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      inline def setZVarargs(value: (Child | scala.Nothing)*): Self = StObject.set(x, "z", js.Array(value*))
    }
  }
  
  /* Inlined {  path :never | undefined,   data :std.Float32Array | undefined} & @nick-thompson/elementary.@nick-thompson/elementary/src/core/props.KeyProps & {  channel :number | undefined} */
  trait pathneverundefineddataFlo
    extends StObject
       with TableProps {
    
    var channel: js.UndefOr[Double] = js.undefined
    
    var data: js.UndefOr[js.typedarray.Float32Array] = js.undefined
    
    /**
      * Key of the node being created.
      */
    var key: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[scala.Nothing] = js.undefined
  }
  object pathneverundefineddataFlo {
    
    inline def apply(): pathneverundefineddataFlo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[pathneverundefineddataFlo]
    }
    
    extension [Self <: pathneverundefineddataFlo](x: Self) {
      
      inline def setChannel(value: Double): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setData(value: js.typedarray.Float32Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  /* Inlined {  path :string | undefined,   data :never | undefined} & @nick-thompson/elementary.@nick-thompson/elementary/src/core/props.KeyProps & {  channel :number | undefined} */
  trait pathstringundefineddatane
    extends StObject
       with TableProps {
    
    var channel: js.UndefOr[Double] = js.undefined
    
    var data: js.UndefOr[scala.Nothing] = js.undefined
    
    /**
      * Key of the node being created.
      */
    var key: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
  }
  object pathstringundefineddatane {
    
    inline def apply(): pathstringundefineddatane = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[pathstringundefineddatane]
    }
    
    extension [Self <: pathstringundefineddatane](x: Self) {
      
      inline def setChannel(value: Double): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
}
