package typings.nodePersist

import typings.node.BufferEncoding
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-persist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    
    def get(key: String): js.Promise[js.Any] = js.native
    
    def getDatum(key: String): Datum | Unit = js.native
    
    def getDatumPath(key: String): String = js.native
    
    def getDatumValue(key: String): Datum | Unit = js.native
    
    def getItem(key: String): js.Promise[js.Any] = js.native
    
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
    
    def values(): js.Promise[js.Array[js.Any]] = js.native
    def values(filter: FilterFunction[Datum]): js.Promise[js.Array[js.Any]] = js.native
    
    def valuesWithKeyMatch(): js.Promise[js.Array[js.Any]] = js.native
    def valuesWithKeyMatch(`match`: String): js.Promise[js.Array[js.Any]] = js.native
    def valuesWithKeyMatch(`match`: RegExp): js.Promise[js.Array[js.Any]] = js.native
    
    def writeFile(file: String, content: Datum): js.Promise[WriteFileResult] = js.native
  }
  
  @scala.inline
  def calcTTL(): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("calcTTL")().asInstanceOf[js.UndefOr[Double]]
  @scala.inline
  def calcTTL(ttl: Double): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("calcTTL")(ttl.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  @scala.inline
  def clear(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def copy(value: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def create(): LocalStorage = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[LocalStorage]
  @scala.inline
  def create(options: InitOptions): LocalStorage = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[LocalStorage]
  
  @scala.inline
  def data(): js.Promise[js.Array[Datum]] = ^.asInstanceOf[js.Dynamic].applyDynamic("data")().asInstanceOf[js.Promise[js.Array[Datum]]]
  
  @JSImport("node-persist", "defaultInstance")
  @js.native
  val defaultInstance: js.UndefOr[LocalStorage] = js.native
  
  @scala.inline
  def del(key: String): js.Promise[DeleteFileResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("del")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DeleteFileResult]]
  
  @scala.inline
  def ensureDirectory(dir: String): js.Promise[EnsureDirectoryResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureDirectory")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[EnsureDirectoryResult]]
  
  @scala.inline
  def forEach(callback: js.Function1[/* data */ Datum, js.Promise[Unit] | Unit]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def get(key: String): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def getDatum(key: String): Datum | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getDatum")(key.asInstanceOf[js.Any]).asInstanceOf[Datum | Unit]
  
  @scala.inline
  def getDatumPath(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDatumPath")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getDatumValue(key: String): Datum | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getDatumValue")(key.asInstanceOf[js.Any]).asInstanceOf[Datum | Unit]
  
  @scala.inline
  def getItem(key: String): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getItem")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def getRawDatum(key: String): String | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getRawDatum")(key.asInstanceOf[js.Any]).asInstanceOf[String | Unit]
  
  @scala.inline
  def init(): js.Promise[InitOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[js.Promise[InitOptions]]
  @scala.inline
  def init(options: InitOptions): js.Promise[InitOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[InitOptions]]
  
  @scala.inline
  def keys(): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")().asInstanceOf[js.Promise[js.Array[String]]]
  @scala.inline
  def keys(filter: FilterFunction[Datum]): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(filter.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  
  @scala.inline
  def length(): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("length")().asInstanceOf[js.Promise[Double]]
  @scala.inline
  def length(filter: FilterFunction[Datum]): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("length")(filter.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  
  @scala.inline
  def log(args: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def parse(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[js.Any]
  @scala.inline
  def parse(str: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def readDirectory(dir: String): js.Promise[js.Array[Datum]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readDirectory")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Datum]]]
  
  @scala.inline
  def readFile(file: String): js.Promise[Datum | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Datum | String]]
  @scala.inline
  def readFile(file: String, options: DatumOptions): js.Promise[Datum | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Datum | String]]
  
  @scala.inline
  def removeExpiredItems(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeExpiredItems")().asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def removeItem(key: String): js.Promise[DeleteFileResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeItem")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DeleteFileResult]]
  
  @scala.inline
  def rm(key: String): js.Promise[DeleteFileResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("rm")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DeleteFileResult]]
  
  @scala.inline
  def set(key: String, value: js.Any): js.Promise[WriteFileResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WriteFileResult]]
  @scala.inline
  def set(key: String, value: js.Any, options: DatumOptions): js.Promise[WriteFileResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WriteFileResult]]
  
  @scala.inline
  def setItem(key: String, value: js.Any): js.Promise[WriteFileResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("setItem")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WriteFileResult]]
  @scala.inline
  def setItem(key: String, value: js.Any, options: DatumOptions): js.Promise[WriteFileResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("setItem")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WriteFileResult]]
  
  @scala.inline
  def setOptions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")().asInstanceOf[Unit]
  @scala.inline
  def setOptions(options: InitOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def startExpiredKeysInterval(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startExpiredKeysInterval")().asInstanceOf[Unit]
  
  @scala.inline
  def stopExpiredKeysInterval(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopExpiredKeysInterval")().asInstanceOf[Unit]
  
  @scala.inline
  def stringify(obj: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def update(key: String, value: js.Any): js.Promise[WriteFileResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WriteFileResult]]
  @scala.inline
  def update(key: String, value: js.Any, options: DatumOptions): js.Promise[WriteFileResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WriteFileResult]]
  
  @scala.inline
  def updateItem(key: String, value: js.Any): js.Promise[WriteFileResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateItem")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WriteFileResult]]
  @scala.inline
  def updateItem(key: String, value: js.Any, options: DatumOptions): js.Promise[WriteFileResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateItem")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WriteFileResult]]
  
  @scala.inline
  def values(): js.Promise[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")().asInstanceOf[js.Promise[js.Array[js.Any]]]
  @scala.inline
  def values(filter: FilterFunction[Datum]): js.Promise[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(filter.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[js.Any]]]
  
  @scala.inline
  def valuesWithKeyMatch(): js.Promise[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("valuesWithKeyMatch")().asInstanceOf[js.Promise[js.Array[js.Any]]]
  @scala.inline
  def valuesWithKeyMatch(`match`: String): js.Promise[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("valuesWithKeyMatch")(`match`.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[js.Any]]]
  @scala.inline
  def valuesWithKeyMatch(`match`: RegExp): js.Promise[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("valuesWithKeyMatch")(`match`.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[js.Any]]]
  
  @scala.inline
  def writeFile(file: String, content: Datum): js.Promise[WriteFileResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WriteFileResult]]
  
  trait Datum extends StObject {
    
    var key: String
    
    var ttl: js.UndefOr[Double] = js.undefined
    
    var value: js.Any
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
  
  trait DatumOptions extends StObject {
    
    var raw: js.UndefOr[Boolean] = js.undefined
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
  
  trait DeleteFileResult extends StObject {
    
    var existed: Boolean
    
    var file: String
    
    var removed: Boolean
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
  
  trait EnsureDirectoryResult extends StObject {
    
    var dir: String
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
  
  trait InitOptions extends StObject {
    
    var dir: js.UndefOr[String] = js.undefined
    
    var encoding: js.UndefOr[BufferEncoding] = js.undefined
    
    var expiredInterval: js.UndefOr[Milliseconds] = js.undefined
    
    var forgiveParseErrors: js.UndefOr[Boolean] = js.undefined
    
    var logging: js.UndefOr[(js.Function1[/* repeated */ js.Any, Unit]) | Boolean] = js.undefined
    
    var parse: js.UndefOr[js.Function1[/* str */ String, js.Any]] = js.undefined
    
    var stringify: js.UndefOr[js.Function1[/* data */ js.Any, String]] = js.undefined
    
    var ttl: js.UndefOr[Milliseconds] = js.undefined
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
      def setParse(value: /* str */ String => js.Any): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
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
  
  trait WriteFileResult extends StObject {
    
    var content: js.Any
    
    var file: String
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
