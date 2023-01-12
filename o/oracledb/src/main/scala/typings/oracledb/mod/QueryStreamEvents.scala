package typings.oracledb.mod

import typings.oracledb.oracledbStrings.metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryStreamEvents[T] extends StObject {
  
  @JSName("addListener")
  def addListener_metadata(event: metadata, listener: js.Function1[/* metadata */ js.Array[Metadata[T]], Unit]): this.type
  
  @JSName("emit")
  def emit_metadata(event: metadata, metadata: js.Array[Metadata[T]]): Boolean
  
  @JSName("on")
  def on_metadata(event: metadata, listener: js.Function1[/* metadata */ js.Array[Metadata[T]], Unit]): this.type
  
  @JSName("once")
  def once_metadata(event: metadata, listener: js.Function1[/* metadata */ js.Array[Metadata[T]], Unit]): this.type
  
  @JSName("prependListener")
  def prependListener_metadata(event: metadata, listener: js.Function1[/* metadata */ js.Array[Metadata[T]], Unit]): this.type
  
  @JSName("prependOnceListener")
  def prependOnceListener_metadata(event: metadata, listener: js.Function1[/* metadata */ js.Array[Metadata[T]], Unit]): this.type
  
  @JSName("removeListener")
  def removeListener_metadata(event: metadata, listener: js.Function1[/* metadata */ js.Array[Metadata[T]], Unit]): this.type
}
object QueryStreamEvents {
  
  inline def apply[T](
    addListener: (metadata, js.Function1[/* metadata */ js.Array[Metadata[T]], Unit]) => QueryStreamEvents[T],
    emit: (metadata, js.Array[Metadata[T]]) => Boolean,
    on: (metadata, js.Function1[/* metadata */ js.Array[Metadata[T]], Unit]) => QueryStreamEvents[T],
    once: (metadata, js.Function1[/* metadata */ js.Array[Metadata[T]], Unit]) => QueryStreamEvents[T],
    prependListener: (metadata, js.Function1[/* metadata */ js.Array[Metadata[T]], Unit]) => QueryStreamEvents[T],
    prependOnceListener: (metadata, js.Function1[/* metadata */ js.Array[Metadata[T]], Unit]) => QueryStreamEvents[T],
    removeListener: (metadata, js.Function1[/* metadata */ js.Array[Metadata[T]], Unit]) => QueryStreamEvents[T]
  ): QueryStreamEvents[T] = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), emit = js.Any.fromFunction2(emit), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), prependListener = js.Any.fromFunction2(prependListener), prependOnceListener = js.Any.fromFunction2(prependOnceListener), removeListener = js.Any.fromFunction2(removeListener))
    __obj.asInstanceOf[QueryStreamEvents[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryStreamEvents[?], T] (val x: Self & QueryStreamEvents[T]) extends AnyVal {
    
    inline def setAddListener(
      value: (metadata, js.Function1[/* metadata */ js.Array[Metadata[T]], Unit]) => QueryStreamEvents[T]
    ): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
    
    inline def setEmit(value: (metadata, js.Array[Metadata[T]]) => Boolean): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
    
    inline def setOn(
      value: (metadata, js.Function1[/* metadata */ js.Array[Metadata[T]], Unit]) => QueryStreamEvents[T]
    ): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setOnce(
      value: (metadata, js.Function1[/* metadata */ js.Array[Metadata[T]], Unit]) => QueryStreamEvents[T]
    ): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
    
    inline def setPrependListener(
      value: (metadata, js.Function1[/* metadata */ js.Array[Metadata[T]], Unit]) => QueryStreamEvents[T]
    ): Self = StObject.set(x, "prependListener", js.Any.fromFunction2(value))
    
    inline def setPrependOnceListener(
      value: (metadata, js.Function1[/* metadata */ js.Array[Metadata[T]], Unit]) => QueryStreamEvents[T]
    ): Self = StObject.set(x, "prependOnceListener", js.Any.fromFunction2(value))
    
    inline def setRemoveListener(
      value: (metadata, js.Function1[/* metadata */ js.Array[Metadata[T]], Unit]) => QueryStreamEvents[T]
    ): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
  }
}
