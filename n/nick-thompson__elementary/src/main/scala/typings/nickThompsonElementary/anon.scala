package typings.nickThompsonElementary

import org.scalablytyped.runtime.StringDictionary
import typings.nickThompsonElementary.nickThompsonElementaryInts.`0`
import typings.nickThompsonElementary.nickThompsonElementaryInts.`1`
import typings.nickThompsonElementary.nickThompsonElementaryInts.`2`
import typings.nickThompsonElementary.nickThompsonElementaryInts.`3`
import typings.nickThompsonElementary.nickThompsonElementaryInts.`6`
import typings.nickThompsonElementary.srcCoreChildrenMod.ChildrenArray
import typings.nickThompsonElementary.srcCoreChildrenMod.SizedChildrenArray
import typings.nickThompsonElementary.srcCorePropsMod.ConstProps
import typings.nickThompsonElementary.srcCorePropsMod.ConvolveProps
import typings.nickThompsonElementary.srcCorePropsMod.DelayProps
import typings.nickThompsonElementary.srcCorePropsMod.InProps
import typings.nickThompsonElementary.srcCorePropsMod.KeyProps
import typings.nickThompsonElementary.srcCorePropsMod.SampleProps
import typings.nickThompsonElementary.srcCorePropsMod.SeqProps
import typings.nickThompsonElementary.srcCorePropsMod.TableProps
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
    
    inline def apply(
      abs: SizedChildrenArray[`1`],
      asinh: SizedChildrenArray[`1`],
      biquad: SizedChildrenArray[`6`],
      ceil: SizedChildrenArray[`1`],
      convolve: SizedChildrenArray[`1`],
      cos: SizedChildrenArray[`1`],
      counter: SizedChildrenArray[`1`],
      delay: SizedChildrenArray[`3`],
      exp: SizedChildrenArray[`1`],
      floor: SizedChildrenArray[`1`],
      ge: SizedChildrenArray[`2`],
      geq: SizedChildrenArray[`2`],
      in: SizedChildrenArray[`0` | `1`],
      latch: SizedChildrenArray[`2`],
      le: SizedChildrenArray[`2`],
      leq: SizedChildrenArray[`2`],
      ln: SizedChildrenArray[`1`],
      log: SizedChildrenArray[`1`],
      log2: SizedChildrenArray[`1`],
      max: SizedChildrenArray[`2`],
      min: SizedChildrenArray[`2`],
      mod: SizedChildrenArray[`2`],
      phasor: SizedChildrenArray[`1`],
      pole: SizedChildrenArray[`2`],
      pow: SizedChildrenArray[`2`],
      rand: SizedChildrenArray[`0`],
      sample: SizedChildrenArray[`1`],
      seq: SizedChildrenArray[`1` | `2`],
      sin: SizedChildrenArray[`1`],
      sqrt: SizedChildrenArray[`1`],
      sr: SizedChildrenArray[`0`],
      table: SizedChildrenArray[`1`],
      tan: SizedChildrenArray[`1`],
      tanh: SizedChildrenArray[`1`],
      z: SizedChildrenArray[`0`]
    ): keyininSizedChildrenArray = {
      val __obj = js.Dynamic.literal(abs = abs.asInstanceOf[js.Any], asinh = asinh.asInstanceOf[js.Any], biquad = biquad.asInstanceOf[js.Any], ceil = ceil.asInstanceOf[js.Any], convolve = convolve.asInstanceOf[js.Any], cos = cos.asInstanceOf[js.Any], counter = counter.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], floor = floor.asInstanceOf[js.Any], ge = ge.asInstanceOf[js.Any], geq = geq.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any], latch = latch.asInstanceOf[js.Any], le = le.asInstanceOf[js.Any], leq = leq.asInstanceOf[js.Any], ln = ln.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], log2 = log2.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], mod = mod.asInstanceOf[js.Any], phasor = phasor.asInstanceOf[js.Any], pole = pole.asInstanceOf[js.Any], pow = pow.asInstanceOf[js.Any], rand = rand.asInstanceOf[js.Any], sample = sample.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], sin = sin.asInstanceOf[js.Any], sqrt = sqrt.asInstanceOf[js.Any], sr = sr.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], tan = tan.asInstanceOf[js.Any], tanh = tanh.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[keyininSizedChildrenArray]
    }
    
    extension [Self <: keyininSizedChildrenArray](x: Self) {
      
      inline def setAbs(value: SizedChildrenArray[`1`]): Self = StObject.set(x, "abs", value.asInstanceOf[js.Any])
      
      inline def setAsinh(value: SizedChildrenArray[`1`]): Self = StObject.set(x, "asinh", value.asInstanceOf[js.Any])
      
      inline def setBiquad(value: SizedChildrenArray[`6`]): Self = StObject.set(x, "biquad", value.asInstanceOf[js.Any])
      
      inline def setCeil(value: SizedChildrenArray[`1`]): Self = StObject.set(x, "ceil", value.asInstanceOf[js.Any])
      
      inline def setConvolve(value: SizedChildrenArray[`1`]): Self = StObject.set(x, "convolve", value.asInstanceOf[js.Any])
      
      inline def setCos(value: SizedChildrenArray[`1`]): Self = StObject.set(x, "cos", value.asInstanceOf[js.Any])
      
      inline def setCounter(value: SizedChildrenArray[`1`]): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
      
      inline def setDelay(value: SizedChildrenArray[`3`]): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setExp(value: SizedChildrenArray[`1`]): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
      
      inline def setFloor(value: SizedChildrenArray[`1`]): Self = StObject.set(x, "floor", value.asInstanceOf[js.Any])
      
      inline def setGe(value: SizedChildrenArray[`2`]): Self = StObject.set(x, "ge", value.asInstanceOf[js.Any])
      
      inline def setGeq(value: SizedChildrenArray[`2`]): Self = StObject.set(x, "geq", value.asInstanceOf[js.Any])
      
      inline def setIn(value: SizedChildrenArray[`0` | `1`]): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setLatch(value: SizedChildrenArray[`2`]): Self = StObject.set(x, "latch", value.asInstanceOf[js.Any])
      
      inline def setLe(value: SizedChildrenArray[`2`]): Self = StObject.set(x, "le", value.asInstanceOf[js.Any])
      
      inline def setLeq(value: SizedChildrenArray[`2`]): Self = StObject.set(x, "leq", value.asInstanceOf[js.Any])
      
      inline def setLn(value: SizedChildrenArray[`1`]): Self = StObject.set(x, "ln", value.asInstanceOf[js.Any])
      
      inline def setLog(value: SizedChildrenArray[`1`]): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLog2(value: SizedChildrenArray[`1`]): Self = StObject.set(x, "log2", value.asInstanceOf[js.Any])
      
      inline def setMax(value: SizedChildrenArray[`2`]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: SizedChildrenArray[`2`]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMod(value: SizedChildrenArray[`2`]): Self = StObject.set(x, "mod", value.asInstanceOf[js.Any])
      
      inline def setPhasor(value: SizedChildrenArray[`1`]): Self = StObject.set(x, "phasor", value.asInstanceOf[js.Any])
      
      inline def setPole(value: SizedChildrenArray[`2`]): Self = StObject.set(x, "pole", value.asInstanceOf[js.Any])
      
      inline def setPow(value: SizedChildrenArray[`2`]): Self = StObject.set(x, "pow", value.asInstanceOf[js.Any])
      
      inline def setRand(value: SizedChildrenArray[`0`]): Self = StObject.set(x, "rand", value.asInstanceOf[js.Any])
      
      inline def setSample(value: SizedChildrenArray[`1`]): Self = StObject.set(x, "sample", value.asInstanceOf[js.Any])
      
      inline def setSeq(value: SizedChildrenArray[`1` | `2`]): Self = StObject.set(x, "seq", value.asInstanceOf[js.Any])
      
      inline def setSin(value: SizedChildrenArray[`1`]): Self = StObject.set(x, "sin", value.asInstanceOf[js.Any])
      
      inline def setSqrt(value: SizedChildrenArray[`1`]): Self = StObject.set(x, "sqrt", value.asInstanceOf[js.Any])
      
      inline def setSr(value: SizedChildrenArray[`0`]): Self = StObject.set(x, "sr", value.asInstanceOf[js.Any])
      
      inline def setTable(value: SizedChildrenArray[`1`]): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTan(value: SizedChildrenArray[`1`]): Self = StObject.set(x, "tan", value.asInstanceOf[js.Any])
      
      inline def setTanh(value: SizedChildrenArray[`1`]): Self = StObject.set(x, "tanh", value.asInstanceOf[js.Any])
      
      inline def setZ(value: SizedChildrenArray[`0`]): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
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
