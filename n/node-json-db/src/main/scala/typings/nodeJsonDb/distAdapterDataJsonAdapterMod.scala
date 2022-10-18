package typings.nodeJsonDb

import typings.nodeJsonDb.distAdapterIadapterMod.IAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAdapterDataJsonAdapterMod {
  
  @JSImport("node-json-db/dist/adapter/data/JsonAdapter", "JsonAdapter")
  @js.native
  open class JsonAdapter protected ()
    extends StObject
       with IAdapter[Any] {
    def this(adapter: IAdapter[String]) = this()
    def this(adapter: IAdapter[String], humanReadable: Boolean) = this()
    
    /* private */ val adapter: Any = js.native
    
    /* private */ val dateRegex: Any = js.native
    
    /* private */ val humanReadable: Any = js.native
    
    /**
      * Read the data from the medium
      */
    /* CompleteClass */
    override def readAsync(): js.Promise[Any | Null] = js.native
    
    /* private */ var replacer: Any = js.native
    
    /* private */ var reviver: Any = js.native
    
    /**
      * Write date into the medium
      * @param data
      */
    /* CompleteClass */
    override def writeAsync(data: Any): js.Promise[Unit] = js.native
  }
}
