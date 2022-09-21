package typings.mergeStream

import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T /* <: ReadableStream[Any] */](streams: (T | js.Array[T])*): MergedStream = ^.asInstanceOf[js.Dynamic].apply(streams.asInstanceOf[Seq[js.Any]]*).asInstanceOf[MergedStream]
  
  @JSImport("merge-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ReadWriteStream * / any */ @js.native
  trait MergedStream extends StObject {
    
    def add(source: js.Array[ReadableStream[Any]]): MergedStream = js.native
    def add(source: ReadableStream[Any]): MergedStream = js.native
    
    def isEmpty(): Boolean = js.native
  }
}
