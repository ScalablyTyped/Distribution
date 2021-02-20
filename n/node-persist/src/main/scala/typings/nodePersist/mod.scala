package typings.nodePersist

import typings.node.BufferEncoding
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-persist", "LocalStorage")
  @js.native
  class LocalStorage () extends StObject {
    def this(options: InitOptions) = this()
    
    def calcTTL(): js.UndefOr[Double] = js.native
    def calcTTL(ttl: Double): js.UndefOr[Double] = js.native
    
    def clear(): js.Promise[Unit] = js.native
    
    def copy(value: js.Any): js.Any = js.native
    
    def data(): js.Promise[js.Array[Datum]] = js.native
    
    def del(key: String): js.Promise[DeleteFileResult] = js.native
    
    def ensureDirectory(dir: String): js.Promise[EnsureDirectoryResult] = js.native
    
    def forEach(callback: js.Function1[/* data */ Datum, js.Promise[Unit] | Unit]): js.Promise[Unit] = js.native
    
    def get(key: String): js.Promise[_] = js.native
    
    def getDatum(key: String): Datum | Unit = js.native
    
    def getDatumPath(key: String): String = js.native
    
    def getDatumValue(key: String): Datum | Unit = js.native
    
    def getItem(key: String): js.Promise[_] = js.native
    
    def getRawDatum(key: String): String | Unit = js.native
    
    def init(): js.Promise[InitOptions] = js.native
    def init(options: InitOptions): js.Promise[InitOptions] = js.native
    
    def keys(): js.Promise[js.Array[String]] = js.native
    def keys(filter: FilterFunction[Datum]): js.Promise[js.Array[String]] = js.native
    
    def length(): js.Promise[Double] = js.native
    def length(filter: FilterFunction[Datum]): js.Promise[Double] = js.native
    
    def log(args: js.Any*): Unit = js.native
    
    def parse(): js.Any = js.native
    def parse(str: String): js.Any = js.native
    
    def readDirectory(dir: String): js.Promise[js.Array[Datum]] = js.native
    
    def readFile(file: String): js.Promise[Datum | String] = js.native
    def readFile(file: String, options: DatumOptions): js.Promise[Datum | String] = js.native
    
    def removeExpiredItems(): js.Promise[Unit] = js.native
    
    def removeItem(key: String): js.Promise[DeleteFileResult] = js.native
    
    def rm(key: String): js.Promise[DeleteFileResult] = js.native
    
    def set(key: String, value: js.Any): js.Promise[WriteFileResult] = js.native
    def set(key: String, value: js.Any, options: DatumOptions): js.Promise[WriteFileResult] = js.native
    
    def setItem(key: String, value: js.Any): js.Promise[WriteFileResult] = js.native
    def setItem(key: String, value: js.Any, options: DatumOptions): js.Promise[WriteFileResult] = js.native
    
    def setOptions(): Unit = js.native
    def setOptions(options: InitOptions): Unit = js.native
    
    def startExpiredKeysInterval(): Unit = js.native
    
    def stopExpiredKeysInterval(): Unit = js.native
    
    def stringify(obj: js.Any): String = js.native
    
    def update(key: String, value: js.Any): js.Promise[WriteFileResult] = js.native
    def update(key: String, value: js.Any, options: DatumOptions): js.Promise[WriteFileResult] = js.native
    
    def updateItem(key: String, value: js.Any): js.Promise[WriteFileResult] = js.native
    def updateItem(key: String, value: js.Any, options: DatumOptions): js.Promise[WriteFileResult] = js.native
    
    def values(): js.Promise[js.Array[_]] = js.native
    def values(filter: FilterFunction[Datum]): js.Promise[js.Array[_]] = js.native
    
    def valuesWithKeyMatch(): js.Promise[js.Array[_]] = js.native
    def valuesWithKeyMatch(`match`: String): js.Promise[js.Array[_]] = js.native
    def valuesWithKeyMatch(`match`: RegExp): js.Promise[js.Array[_]] = js.native
    
    def writeFile(file: String, content: Datum): js.Promise[WriteFileResult] = js.native
  }
  
  @JSImport("node-persist", "calcTTL")
  @js.native
  def calcTTL(): js.UndefOr[Double] = js.native
  @JSImport("node-persist", "calcTTL")
  @js.native
  def calcTTL(ttl: Double): js.UndefOr[Double] = js.native
  
  @JSImport("node-persist", "clear")
  @js.native
  def clear(): js.Promise[Unit] = js.native
  
  @JSImport("node-persist", "copy")
  @js.native
  def copy(value: js.Any): js.Any = js.native
  
  @JSImport("node-persist", "create")
  @js.native
  def create(): LocalStorage = js.native
  @JSImport("node-persist", "create")
  @js.native
  def create(options: InitOptions): LocalStorage = js.native
  
  @JSImport("node-persist", "data")
  @js.native
  def data(): js.Promise[js.Array[Datum]] = js.native
  
  @JSImport("node-persist", "defaultInstance")
  @js.native
  val defaultInstance: js.UndefOr[LocalStorage] = js.native
  
  @JSImport("node-persist", "del")
  @js.native
  def del(key: String): js.Promise[DeleteFileResult] = js.native
  
  @JSImport("node-persist", "ensureDirectory")
  @js.native
  def ensureDirectory(dir: String): js.Promise[EnsureDirectoryResult] = js.native
  
  @JSImport("node-persist", "forEach")
  @js.native
  def forEach(callback: js.Function1[/* data */ Datum, js.Promise[Unit] | Unit]): js.Promise[Unit] = js.native
  
  @JSImport("node-persist", "get")
  @js.native
  def get(key: String): js.Promise[_] = js.native
  
  @JSImport("node-persist", "getDatum")
  @js.native
  def getDatum(key: String): Datum | Unit = js.native
  
  @JSImport("node-persist", "getDatumPath")
  @js.native
  def getDatumPath(key: String): String = js.native
  
  @JSImport("node-persist", "getDatumValue")
  @js.native
  def getDatumValue(key: String): Datum | Unit = js.native
  
  @JSImport("node-persist", "getItem")
  @js.native
  def getItem(key: String): js.Promise[_] = js.native
  
  @JSImport("node-persist", "getRawDatum")
  @js.native
  def getRawDatum(key: String): String | Unit = js.native
  
  @JSImport("node-persist", "init")
  @js.native
  def init(): js.Promise[InitOptions] = js.native
  @JSImport("node-persist", "init")
  @js.native
  def init(options: InitOptions): js.Promise[InitOptions] = js.native
  
  @JSImport("node-persist", "keys")
  @js.native
  def keys(): js.Promise[js.Array[String]] = js.native
  @JSImport("node-persist", "keys")
  @js.native
  def keys(filter: FilterFunction[Datum]): js.Promise[js.Array[String]] = js.native
  
  @JSImport("node-persist", "length")
  @js.native
  def length(): js.Promise[Double] = js.native
  @JSImport("node-persist", "length")
  @js.native
  def length(filter: FilterFunction[Datum]): js.Promise[Double] = js.native
  
  @JSImport("node-persist", "log")
  @js.native
  def log(args: js.Any*): Unit = js.native
  
  @JSImport("node-persist", "parse")
  @js.native
  def parse(): js.Any = js.native
  @JSImport("node-persist", "parse")
  @js.native
  def parse(str: String): js.Any = js.native
  
  @JSImport("node-persist", "readDirectory")
  @js.native
  def readDirectory(dir: String): js.Promise[js.Array[Datum]] = js.native
  
  @JSImport("node-persist", "readFile")
  @js.native
  def readFile(file: String): js.Promise[Datum | String] = js.native
  @JSImport("node-persist", "readFile")
  @js.native
  def readFile(file: String, options: DatumOptions): js.Promise[Datum | String] = js.native
  
  @JSImport("node-persist", "removeExpiredItems")
  @js.native
  def removeExpiredItems(): js.Promise[Unit] = js.native
  
  @JSImport("node-persist", "removeItem")
  @js.native
  def removeItem(key: String): js.Promise[DeleteFileResult] = js.native
  
  @JSImport("node-persist", "rm")
  @js.native
  def rm(key: String): js.Promise[DeleteFileResult] = js.native
  
  @JSImport("node-persist", "set")
  @js.native
  def set(key: String, value: js.Any): js.Promise[WriteFileResult] = js.native
  @JSImport("node-persist", "set")
  @js.native
  def set(key: String, value: js.Any, options: DatumOptions): js.Promise[WriteFileResult] = js.native
  
  @JSImport("node-persist", "setItem")
  @js.native
  def setItem(key: String, value: js.Any): js.Promise[WriteFileResult] = js.native
  @JSImport("node-persist", "setItem")
  @js.native
  def setItem(key: String, value: js.Any, options: DatumOptions): js.Promise[WriteFileResult] = js.native
  
  @JSImport("node-persist", "setOptions")
  @js.native
  def setOptions(): Unit = js.native
  @JSImport("node-persist", "setOptions")
  @js.native
  def setOptions(options: InitOptions): Unit = js.native
  
  @JSImport("node-persist", "startExpiredKeysInterval")
  @js.native
  def startExpiredKeysInterval(): Unit = js.native
  
  @JSImport("node-persist", "stopExpiredKeysInterval")
  @js.native
  def stopExpiredKeysInterval(): Unit = js.native
  
  @JSImport("node-persist", "stringify")
  @js.native
  def stringify(obj: js.Any): String = js.native
  
  @JSImport("node-persist", "update")
  @js.native
  def update(key: String, value: js.Any): js.Promise[WriteFileResult] = js.native
  @JSImport("node-persist", "update")
  @js.native
  def update(key: String, value: js.Any, options: DatumOptions): js.Promise[WriteFileResult] = js.native
  
  @JSImport("node-persist", "updateItem")
  @js.native
  def updateItem(key: String, value: js.Any): js.Promise[WriteFileResult] = js.native
  @JSImport("node-persist", "updateItem")
  @js.native
  def updateItem(key: String, value: js.Any, options: DatumOptions): js.Promise[WriteFileResult] = js.native
  
  @JSImport("node-persist", "values")
  @js.native
  def values(): js.Promise[js.Array[_]] = js.native
  @JSImport("node-persist", "values")
  @js.native
  def values(filter: FilterFunction[Datum]): js.Promise[js.Array[_]] = js.native
  
  @JSImport("node-persist", "valuesWithKeyMatch")
  @js.native
  def valuesWithKeyMatch(): js.Promise[js.Array[_]] = js.native
  @JSImport("node-persist", "valuesWithKeyMatch")
  @js.native
  def valuesWithKeyMatch(`match`: String): js.Promise[js.Array[_]] = js.native
  @JSImport("node-persist", "valuesWithKeyMatch")
  @js.native
  def valuesWithKeyMatch(`match`: RegExp): js.Promise[js.Array[_]] = js.native
  
  @JSImport("node-persist", "writeFile")
  @js.native
  def writeFile(file: String, content: Datum): js.Promise[WriteFileResult] = js.native
  
  @js.native
  trait Datum extends StObject {
    
    var key: String = js.native
    
    var ttl: js.UndefOr[Double] = js.native
    
    var value: js.Any = js.native
  }
  object Datum {
    
    @scala.inline
    def apply(key: String, value: js.Any): Datum = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Datum]
    }
    
    @scala.inline
    implicit class DatumMutableBuilder[Self <: Datum] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DatumOptions extends StObject {
    
    var raw: js.UndefOr[Boolean] = js.native
  }
  object DatumOptions {
    
    @scala.inline
    def apply(): DatumOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatumOptions]
    }
    
    @scala.inline
    implicit class DatumOptionsMutableBuilder[Self <: DatumOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    }
  }
  
  @js.native
  trait DeleteFileResult extends StObject {
    
    var existed: Boolean = js.native
    
    var file: String = js.native
    
    var removed: Boolean = js.native
  }
  object DeleteFileResult {
    
    @scala.inline
    def apply(existed: Boolean, file: String, removed: Boolean): DeleteFileResult = {
      val __obj = js.Dynamic.literal(existed = existed.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteFileResult]
    }
    
    @scala.inline
    implicit class DeleteFileResultMutableBuilder[Self <: DeleteFileResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExisted(value: Boolean): Self = StObject.set(x, "existed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoved(value: Boolean): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EnsureDirectoryResult extends StObject {
    
    var dir: String = js.native
  }
  object EnsureDirectoryResult {
    
    @scala.inline
    def apply(dir: String): EnsureDirectoryResult = {
      val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnsureDirectoryResult]
    }
    
    @scala.inline
    implicit class EnsureDirectoryResultMutableBuilder[Self <: EnsureDirectoryResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    }
  }
  
  type FilterFunction[T] = js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean]
  
  @js.native
  trait InitOptions extends StObject {
    
    var dir: js.UndefOr[String] = js.native
    
    var encoding: js.UndefOr[BufferEncoding] = js.native
    
    var expiredInterval: js.UndefOr[Milliseconds] = js.native
    
    var forgiveParseErrors: js.UndefOr[Boolean] = js.native
    
    var logging: js.UndefOr[(js.Function1[/* repeated */ js.Any, Unit]) | Boolean] = js.native
    
    var parse: js.UndefOr[js.Function1[/* str */ String, _]] = js.native
    
    var stringify: js.UndefOr[js.Function1[/* data */ js.Any, String]] = js.native
    
    var ttl: js.UndefOr[Milliseconds] = js.native
  }
  object InitOptions {
    
    @scala.inline
    def apply(): InitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitOptions]
    }
    
    @scala.inline
    implicit class InitOptionsMutableBuilder[Self <: InitOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setExpiredInterval(value: Milliseconds): Self = StObject.set(x, "expiredInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiredIntervalUndefined: Self = StObject.set(x, "expiredInterval", js.undefined)
      
      @scala.inline
      def setForgiveParseErrors(value: Boolean): Self = StObject.set(x, "forgiveParseErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForgiveParseErrorsUndefined: Self = StObject.set(x, "forgiveParseErrors", js.undefined)
      
      @scala.inline
      def setLogging(value: (js.Function1[/* repeated */ js.Any, Unit]) | Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingFunction1(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "logging", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      @scala.inline
      def setParse(value: /* str */ String => _): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      @scala.inline
      def setStringify(value: /* data */ js.Any => String): Self = StObject.set(x, "stringify", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
      
      @scala.inline
      def setTtl(value: Milliseconds): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  type Milliseconds = Double
  
  @js.native
  trait WriteFileResult extends StObject {
    
    var content: js.Any = js.native
    
    var file: String = js.native
  }
  object WriteFileResult {
    
    @scala.inline
    def apply(content: js.Any, file: String): WriteFileResult = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[WriteFileResult]
    }
    
    @scala.inline
    implicit class WriteFileResultMutableBuilder[Self <: WriteFileResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: js.Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
}
