package typings.pgQueryStream

import typings.node.streamMod.Readable
import typings.pg.mod.Connection
import typings.pg.mod.Submittable
import typings.pgQueryStream.pgQueryStreamStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pg-query-stream", JSImport.Namespace)
  @js.native
  open class ^ protected () extends QueryStream {
    def this(text: String) = this()
    def this(text: String, values: js.Array[Any]) = this()
    def this(text: String, values: js.Array[Any], config: QueryStreamConfig) = this()
    def this(text: String, values: Unit, config: QueryStreamConfig) = this()
    
    /* CompleteClass */
    override def submit(connection: Connection): Unit = js.native
  }
  
  @js.native
  trait QueryStream
    extends Readable
       with Submittable {
    
    def _destroy(_err: js.Error, cb: js.Function): Unit = js.native
    
    var _result: Any = js.native
    
    var cursor: Any = js.native
    
    var handleCommandComplete: js.Function = js.native
    
    var handleDataRow: js.Function = js.native
    
    var handleEmptyQuery: js.Function = js.native
    
    var handleError: js.Function = js.native
    
    var handlePortalSuspended: js.Function = js.native
    
    var handleReadyForQuery: js.Function = js.native
    
    var handleRowDescription: js.Function = js.native
  }
  
  trait QueryStreamConfig extends StObject {
    
    var batchSize: js.UndefOr[Double] = js.undefined
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    var rowMode: js.UndefOr[array] = js.undefined
    
    var types: js.UndefOr[Any] = js.undefined
  }
  object QueryStreamConfig {
    
    inline def apply(): QueryStreamConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryStreamConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueryStreamConfig] (val x: Self) extends AnyVal {
      
      inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      inline def setRowMode(value: array): Self = StObject.set(x, "rowMode", value.asInstanceOf[js.Any])
      
      inline def setRowModeUndefined: Self = StObject.set(x, "rowMode", js.undefined)
      
      inline def setTypes(value: Any): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    }
  }
}
