package typings.nodeJsonDb

import typings.nodeJsonDb.distAdapterIadapterMod.IFileAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAdapterFileAtomicFileAdapterMod {
  
  @JSImport("node-json-db/dist/adapter/file/AtomicFileAdapter", "AtomicFileAdapter")
  @js.native
  open class AtomicFileAdapter protected ()
    extends StObject
       with IFileAdapter[String] {
    def this(filename: String, fsync: Boolean) = this()
    
    /**
      * Name of the file used by the file adapter
      */
    /* CompleteClass */
    override val filename: String = js.native
    
    /* private */ var fsync: Any = js.native
    
    /**
      * Read the data from the medium
      */
    /* CompleteClass */
    override def readAsync(): js.Promise[String | Null] = js.native
    
    /**
      * Write date into the medium
      * @param data
      */
    /* CompleteClass */
    override def writeAsync(data: String): js.Promise[Unit] = js.native
  }
}
