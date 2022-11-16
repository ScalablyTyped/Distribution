package typings.nickThompsonElementary

import org.scalablytyped.runtime.StringDictionary
import typings.nickThompsonElementary.nickThompsonElementaryStrings.gate
import typings.nickThompsonElementary.nickThompsonElementaryStrings.loop
import typings.nickThompsonElementary.nickThompsonElementaryStrings.trigger
import typings.nickThompsonElementary.srcCoreTypesMod.CompositeNodeType
import typings.nickThompsonElementary.srcCoreTypesMod.NativeNodeType
import typings.nickThompsonElementary.srcCoreTypesMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCorePropsMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    std.Parameters<T> extends [] ? @nick-thompson/elementary.@nick-thompson/elementary/src/core/props.KeyProps : std.Parameters<T> extends [infer IProps, ...any] ? IProps extends @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child ? @nick-thompson/elementary.@nick-thompson/elementary/src/core/props.KeyProps : IProps & @nick-thompson/elementary.@nick-thompson/elementary/src/core/props.KeyProps : never
    }}}
    */
  type CompositeNodeProps[T /* <: CompositeNodeType */] = KeyProps
  
  trait ConstProps
    extends StObject
       with KeyProps {
    
    /**
      * Value of the el.const node.
      *
      * @see ConstProps
      * @see el.const
      */
    var value: Double
  }
  object ConstProps {
    
    inline def apply(value: Double): ConstProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConstProps]
    }
    
    extension [Self <: ConstProps](x: Self) {
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConvolveProps
    extends StObject
       with KeyProps {
    
    /**
      * Path to the file of the impulse response on disk.
      *
      * @see ConvolveProps
      * @see el.convolve
      */
    var path: js.UndefOr[String] = js.undefined
  }
  object ConvolveProps {
    
    inline def apply(): ConvolveProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConvolveProps]
    }
    
    extension [Self <: ConvolveProps](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  trait DelayProps
    extends StObject
       with KeyProps {
    
    /**
      * Maximum delay line in samples.
      *
      * @see el.delay
      * @see DelayProps
      */
    var size: js.UndefOr[Double] = js.undefined
  }
  object DelayProps {
    
    inline def apply(): DelayProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DelayProps]
    }
    
    extension [Self <: DelayProps](x: Self) {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait InProps
    extends StObject
       with KeyProps {
    
    /**
      * Input channel of the el.in node.
      *
      * @see InProps
      * @see el.in
      */
    var channel: js.UndefOr[Double] = js.undefined
  }
  object InProps {
    
    inline def apply(): InProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InProps]
    }
    
    extension [Self <: InProps](x: Self) {
      
      inline def setChannel(value: Double): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    }
  }
  
  trait KeyProps extends StObject {
    
    /**
      * Key of the node being created.
      */
    var key: js.UndefOr[String] = js.undefined
  }
  object KeyProps {
    
    inline def apply(): KeyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyProps]
    }
    
    extension [Self <: KeyProps](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  type NativeNodeProps[T /* <: NativeNodeType */] = /* import warning: importer.ImportType#apply Failed type conversion: @nick-thompson/elementary.anon.Dictother[T] */ js.Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    @nick-thompson/elementary.@nick-thompson/elementary/src/core/types.NodeType extends T ? @nick-thompson/elementary.@nick-thompson/elementary/src/core/props.Props : T extends @nick-thompson/elementary.@nick-thompson/elementary/src/core/types.NativeNodeType ? @nick-thompson/elementary.@nick-thompson/elementary/src/core/props.NativeNodeProps<T> : T extends @nick-thompson/elementary.@nick-thompson/elementary/src/core/types.CompositeNodeType ? @nick-thompson/elementary.@nick-thompson/elementary/src/core/props.CompositeNodeProps<T> : never
    }}}
    */
  type NodeProps[T /* <: NodeType */] = Props
  
  type Props = StringDictionary[Any]
  
  trait SampleProps
    extends StObject
       with KeyProps {
    
    /**
      * Nodes can output only one channel so you have to select the channel
      * to read from the sample.
      *
      * @see SampleProps
      * @see el.sample
      */
    var channel: js.UndefOr[Double] = js.undefined
    
    /**
      * - trigger: plays the sample once fully on a rising edge of the pulse
      *   train
      * - gate: resumes playing the sample on a rising edge and pauses on a
      *   falling edge of the pulse train until the end of the sample
      * - loop: same as gate but it doesn't stop at the end of the sample,
      *   instead it continues playing it back from the start in a loop
      *
      * @see SampleProps
      * @see el.sample
      */
    var mode: js.UndefOr[trigger | gate | loop] = js.undefined
    
    /**
      * Path to the file of the sample.
      *
      * @see SampleProps
      * @see el.sample
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * Offset in samples from the start of the sample where playback starts.
      *
      * @see SampleProps
      * @see el.sample
      */
    var startOffset: js.UndefOr[Double] = js.undefined
    
    /**
      * Offset in samples from the end of the sample where playback ends.
      *
      * @see SampleProps
      * @see el.sample
      */
    var stopOffset: js.UndefOr[Double] = js.undefined
  }
  object SampleProps {
    
    inline def apply(): SampleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SampleProps]
    }
    
    extension [Self <: SampleProps](x: Self) {
      
      inline def setChannel(value: Double): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setMode(value: trigger | gate | loop): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
      
      inline def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
      
      inline def setStopOffset(value: Double): Self = StObject.set(x, "stopOffset", value.asInstanceOf[js.Any])
      
      inline def setStopOffsetUndefined: Self = StObject.set(x, "stopOffset", js.undefined)
    }
  }
  
  trait SeqProps
    extends StObject
       with KeyProps {
    
    /**
      * When true, continues to output the sequence value until the next trigger.
      *
      * @see SeqProps
      * @see el.seq
      */
    var hold: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When true, sequence repeats, looping from start to end, indefinitely.
      *
      * @see SeqProps
      * @see el.seq
      */
    var loop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sequence of values to generate.
      *
      * @see SeqProps
      * @see el.seq
      */
    var seq: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object SeqProps {
    
    inline def apply(): SeqProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeqProps]
    }
    
    extension [Self <: SeqProps](x: Self) {
      
      inline def setHold(value: Boolean): Self = StObject.set(x, "hold", value.asInstanceOf[js.Any])
      
      inline def setHoldUndefined: Self = StObject.set(x, "hold", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setSeq(value: js.Array[Double]): Self = StObject.set(x, "seq", value.asInstanceOf[js.Any])
      
      inline def setSeqUndefined: Self = StObject.set(x, "seq", js.undefined)
      
      inline def setSeqVarargs(value: Double*): Self = StObject.set(x, "seq", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nickThompsonElementary.anon.pathstringundefineddatane
    - typings.nickThompsonElementary.anon.pathneverundefineddataFlo
  */
  trait TableProps extends StObject
  object TableProps {
    
    inline def pathneverundefineddataFlo(): typings.nickThompsonElementary.anon.pathneverundefineddataFlo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.nickThompsonElementary.anon.pathneverundefineddataFlo]
    }
    
    inline def pathstringundefineddatane(): typings.nickThompsonElementary.anon.pathstringundefineddatane = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.nickThompsonElementary.anon.pathstringundefineddatane]
    }
  }
}
