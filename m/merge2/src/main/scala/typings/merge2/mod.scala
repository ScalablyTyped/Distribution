package typings.merge2

import typings.merge2.merge2Strings.queueDrain
import typings.node.NodeJS.ReadableStream
import typings.node.streamMod.PassThrough
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(args: Streams*): Merge2Stream = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any]).asInstanceOf[Merge2Stream]
  /**
    * @summary        This function takes an arbitrary number of streams and returns a
    *                 Merge2Stream.
    *
    * @description    If a DuplexOption is specified, it has to be specified last in the
    *                 argument list
    *
    * @see            { @link https://github.com/teambition/merge2#api }
    *
    * @param          args  StreamTypes
    * @param          opts  Optional DuplexOption to be specified last
    *
    * @return         A merged duplex stream
    */
  @scala.inline
  def apply(a: Streams): Merge2Stream = ^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any]).asInstanceOf[Merge2Stream]
  @scala.inline
  def apply(a: Streams, b: Streams): Merge2Stream = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Merge2Stream]
  @scala.inline
  def apply(a: Streams, b: Streams, c: Streams): Merge2Stream = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Merge2Stream]
  @scala.inline
  def apply(a: Streams, b: Streams, c: Streams, d: Streams): Merge2Stream = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Merge2Stream]
  @scala.inline
  def apply(a: Streams, b: Streams, c: Streams, d: Streams, e: Streams): Merge2Stream = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Merge2Stream]
  @scala.inline
  def apply(a: Streams, b: Streams, c: Streams, d: Streams, e: Streams, options: Options): Merge2Stream = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Merge2Stream]
  @scala.inline
  def apply(a: Streams, b: Streams, c: Streams, d: Streams, options: Options): Merge2Stream = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Merge2Stream]
  @scala.inline
  def apply(a: Streams, b: Streams, c: Streams, options: Options): Merge2Stream = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Merge2Stream]
  @scala.inline
  def apply(a: Streams, b: Streams, options: Options): Merge2Stream = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Merge2Stream]
  @scala.inline
  def apply(a: Streams, options: Options): Merge2Stream = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Merge2Stream]
  
  @JSImport("merge2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Merge2Stream extends PassThrough {
    
    /**
      * @summary    Add more streams to an existing merged stream
      *
      * @param      args  streams to add
      *
      * @return     The merged stream
      */
    def add(args: Streams*): Merge2Stream = js.native
    
    /**
      * @summary    It will emit 'queueDrain' when all streams merged.
      *             If you set end === false in options, this event give you a notice that
      *             you should add more streams to merge, or end the mergedStream.
      *
      * @param event The 'queueDrain' event
      *
      * @return     This stream
      */
    @JSName("on")
    def on_queueDrain(event: queueDrain, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("once")
    def once_queueDrain(event: queueDrain, listener: js.Function0[Unit]): this.type = js.native
  }
  
  trait Options extends StObject {
    
    var end: js.UndefOr[Boolean] = js.undefined
    
    var objectMode: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
    }
  }
  
  type StreamType = ReadableStream | Merge2Stream
  
  type Streams = StreamType | js.Array[StreamType]
}
