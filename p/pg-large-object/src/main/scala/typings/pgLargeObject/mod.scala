package typings.pgLargeObject

import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.node.streamMod.ReadableOptions
import typings.node.streamMod.Writable
import typings.node.streamMod.WritableOptions
import typings.pg.mod.Client
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pg-large-object", "LargeObject")
  @js.native
  class LargeObject protected () extends StObject {
    def this(query: js.Any, oid: Double, fd: js.Any) = this()
    
    def close(callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
    
    def closeAsync(): js.Promise[js.Any] = js.native
    
    def getReadableStream(): ReadStream = js.native
    def getReadableStream(bufferSize: Double): ReadStream = js.native
    
    def getWritableStream(): WriteStream = js.native
    def getWritableStream(bufferSize: Double): WriteStream = js.native
    
    def read(length: Double, callback: js.Function2[/* error */ Error, /* data */ Buffer, Unit]): Unit = js.native
    
    def readAsync(length: Double): js.Promise[Buffer] = js.native
    
    def seek(position: Double, ref: Double): Unit = js.native
    def seek(
      position: Double,
      ref: Double,
      callback: js.Function2[/* error */ Error, /* position */ Double, Unit]
    ): Unit = js.native
    
    def seekAsync(position: Double, ref: Double): js.Promise[Double] = js.native
    
    def size(callback: js.Function2[/* error */ Error, /* size */ Double, Unit]): Unit = js.native
    
    def sizeAsync(): js.Promise[Double] = js.native
    
    def tell(callback: js.Function2[/* error */ Error, /* position */ Double, Unit]): Unit = js.native
    
    def tellAsync(): js.Promise[Double] = js.native
    
    def truncate(length: Double): Unit = js.native
    def truncate(length: Double, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
    
    def truncateAsync(length: Double): js.Promise[js.Any] = js.native
    
    def write(buffer: Buffer): Unit = js.native
    def write(buffer: Buffer, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
    
    def writeAsync(buffer: Buffer): js.Promise[js.Any] = js.native
  }
  /* static members */
  object LargeObject {
    
    @JSImport("pg-large-object", "LargeObject.SEEK_CUR")
    @js.native
    val SEEK_CUR: Double = js.native
    
    @JSImport("pg-large-object", "LargeObject.SEEK_END")
    @js.native
    val SEEK_END: Double = js.native
    
    @JSImport("pg-large-object", "LargeObject.SEEK_SET")
    @js.native
    val SEEK_SET: Double = js.native
  }
  
  @JSImport("pg-large-object", "LargeObjectManager")
  @js.native
  class LargeObjectManager protected () extends StObject {
    def this(options: js.Object) = this()
    def this(options: LargeObjectManagerSettings) = this()
    
    def create(callback: js.Function2[/* error */ Error, /* oid */ Double, Unit]): Unit = js.native
    
    def createAndWritableStream(): Unit = js.native
    def createAndWritableStream(bufferSize: Double): Unit = js.native
    def createAndWritableStream(
      bufferSize: Double,
      callback: js.Function3[/* error */ Error, /* oid */ Double, /* stream */ WriteStream, Unit]
    ): Unit = js.native
    def createAndWritableStream(
      bufferSize: Unit,
      callback: js.Function3[/* error */ Error, /* oid */ Double, /* stream */ WriteStream, Unit]
    ): Unit = js.native
    
    def createAndWritableStreamAsync(): js.Promise[js.Tuple2[Double, WriteStream]] = js.native
    def createAndWritableStreamAsync(bufferSize: Double): js.Promise[js.Tuple2[Double, WriteStream]] = js.native
    
    def createAsync(): js.Promise[Double] = js.native
    
    def open(
      oid: Double,
      mode: Double,
      callback: js.Function2[/* error */ Error, /* result */ LargeObject, Unit]
    ): Unit = js.native
    
    def openAndReadableStream(
      oid: Double,
      bufferSize: Double,
      callback: js.Function3[/* error */ Error, /* size */ Double, /* stream */ ReadStream, Unit]
    ): Unit = js.native
    
    def openAndReadableStreamAsync(oid: Double): js.Promise[js.Tuple2[Double, ReadStream]] = js.native
    def openAndReadableStreamAsync(oid: Double, bufferSize: Double): js.Promise[js.Tuple2[Double, ReadStream]] = js.native
    
    def openAsync(oid: Double, mode: Double): js.Promise[LargeObject] = js.native
    
    def unlink(oid: Double): Unit = js.native
    def unlink(oid: Double, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
    
    def unlinkAsync(oid: Double): js.Promise[js.Any] = js.native
  }
  /* static members */
  object LargeObjectManager {
    
    @JSImport("pg-large-object", "LargeObjectManager.READ")
    @js.native
    val READ: Double = js.native
    
    @JSImport("pg-large-object", "LargeObjectManager.READWRITE")
    @js.native
    val READWRITE: Double = js.native
    
    @JSImport("pg-large-object", "LargeObjectManager.WRITE")
    @js.native
    val WRITE: Double = js.native
  }
  
  @JSImport("pg-large-object", "ReadStream")
  @js.native
  class ReadStream () extends Readable {
    def this(opts: ReadableOptions) = this()
  }
  
  @JSImport("pg-large-object", "WriteStream")
  @js.native
  class WriteStream () extends Writable {
    def this(opts: WritableOptions) = this()
  }
  
  trait LargeObjectManagerSettings extends StObject {
    
    var pg: js.UndefOr[Client] = js.undefined
    
    var pgPromise: js.UndefOr[js.Object] = js.undefined
  }
  object LargeObjectManagerSettings {
    
    @scala.inline
    def apply(): LargeObjectManagerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LargeObjectManagerSettings]
    }
    
    @scala.inline
    implicit class LargeObjectManagerSettingsMutableBuilder[Self <: LargeObjectManagerSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPg(value: Client): Self = StObject.set(x, "pg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPgPromise(value: js.Object): Self = StObject.set(x, "pgPromise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPgPromiseUndefined: Self = StObject.set(x, "pgPromise", js.undefined)
      
      @scala.inline
      def setPgUndefined: Self = StObject.set(x, "pg", js.undefined)
    }
  }
}
