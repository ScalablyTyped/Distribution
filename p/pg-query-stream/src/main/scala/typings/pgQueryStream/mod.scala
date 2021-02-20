package typings.pgQueryStream

import typings.node.NodeJS.WritableStream
import typings.node.anon.End
import typings.node.streamMod.Readable
import typings.pg.mod.Submittable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pg-query-stream", JSImport.Namespace)
  @js.native
  class ^ protected () extends QueryStream {
    def this(text: String) = this()
    def this(text: String, values: js.Array[_]) = this()
    def this(text: String, values: js.UndefOr[scala.Nothing], options: Options) = this()
    def this(text: String, values: js.Array[_], options: Options) = this()
  }
  
  @js.native
  trait Options extends StObject {
    
    var batchSize: js.UndefOr[Double] = js.native
    
    var highWaterMark: js.UndefOr[Double] = js.native
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
      def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
      
      @scala.inline
      def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
    }
  }
  
  @js.native
  trait QueryStream
    extends Readable
       with Submittable {
    
    var batchSize: Double = js.native
    
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
    
    var text: String = js.native
    
    var values: js.UndefOr[js.Array[_]] = js.native
  }
}
