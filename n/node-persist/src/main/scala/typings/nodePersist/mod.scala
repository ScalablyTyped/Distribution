package typings.nodePersist

import typings.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-persist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node-persist", "LocalStorage")
  @js.native
  open class LocalStorage () extends StObject {
    def this(options: InitOptions) = this()
    
    def calcTTL(): js.UndefOr[Double] = js.native
    def calcTTL(ttl: Double): js.UndefOr[Double] = js.native
    
    def clear(): js.Promise[Unit] = js.native
    
    def copy(value: Any): Any = js.native
    
    def data(): js.Promise[js.Array[Datum]] = js.native
    
    def del(key: String): js.Promise[DeleteFileResult] = js.native
    
    def ensureDirectory(dir: String): js.Promise[EnsureDirectoryResult] = js.native
    
    def forEach(callback: js.Function1[/* data */ Datum, js.Promise[Unit] | Unit]): js.Promise[Unit] = js.native
    
    def get(key: String): js.Promise[Any] = js.native
    
    def getDatum(key: String): Datum | Unit = js.native
    
    def getDatumPath(key: String): String = js.native
    
    def getDatumValue(key: String): Datum | Unit = js.native
    
    def getItem(key: String): js.Promise[Any] = js.native
    
    def getRawDatum(key: String): String | Unit = js.native
    
    def init(): js.Promise[InitOptions] = js.native
    def init(options: InitOptions): js.Promise[InitOptions] = js.native
    
    def keys(): js.Promise[js.Array[String]] = js.native
    def keys(filter: FilterFunction[Datum]): js.Promise[js.Array[String]] = js.native
    
    def length(): js.Promise[Double] = js.native
    def length(filter: FilterFunction[Datum]): js.Promise[Double] = js.native
    
    def log(args: Any*): Unit = js.native
    
    def parse(): Any = js.native
    def parse(str: String): Any = js.native
    
    def readDirectory(dir: String): js.Promise[js.Array[Datum]] = js.native
    
    def readFile(file: String): js.Promise[Datum | String] = js.native
    def readFile(file: String, options: DatumOptions): js.Promise[Datum | String] = js.native
    
    def removeExpiredItems(): js.Promise[Unit] = js.native
    
    def removeItem(key: String): js.Promise[DeleteFileResult] = js.native
    
    def rm(key: String): js.Promise[DeleteFileResult] = js.native
    
    def set(key: String, value: Any): js.Promise[WriteFileResult] = js.native
    def set(key: String, value: Any, options: DatumOptions): js.Promise[WriteFileResult] = js.native
    
    def setItem(key: String, value: Any): js.Promise[WriteFileResult] = js.native
    def setItem(key: String, value: Any, options: DatumOptions): js.Promise[WriteFileResult] = js.native
    
    def setOptions(): Unit = js.native
    def setOptions(options: InitOptions): Unit = js.native
    
    def startExpiredKeysInterval(): Unit = js.native
    
    def stopExpiredKeysInterval(): Unit = js.native
    
    def stringify(obj: Any): String = js.native
    
    def update(key: String, value: Any): js.Promise[WriteFileResult] = js.native
    def update(key: String, value: Any, options: DatumOptions): js.Promise[WriteFileResult] = js.native
    
    def updateItem(key: String, value: Any): js.Promise[WriteFileResult] = js.native
    def updateItem(key: String, value: Any, options: DatumOptions): js.Promise[WriteFileResult] = js.native
    
    def values(): js.Promise[js.Array[Any]] = js.native
    def values(filter: FilterFunction[Datum]): js.Promise[js.Array[Any]] = js.native
    
    def valuesWithKeyMatch(): js.Promise[js.Array[Any]] = js.native
    def valuesWithKeyMatch(`match`: String): js.Promise[js.Array[Any]] = js.native
    def valuesWithKeyMatch(`match`: js.RegExp): js.Promise[js.Array[Any]] = js.native
    
    def writeFile(file: String, content: Datum): js.Promise[WriteFileResult] = js.native
  }
  
  inline def calcTTL(): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("calcTTL")().asInstanceOf[js.UndefOr[Double]]
  inline def calcTTL(ttl: Double): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("calcTTL")(ttl.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def clear(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[js.Promise[Unit]]
  
  inline def copy(value: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def create(): LocalStorage = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[LocalStorage]
  inline def create(options: InitOptions): LocalStorage = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[LocalStorage]
  
  inline def data(): js.Promise[js.Array[Datum]] = ^.asInstanceOf[js.Dynamic].applyDynamic("data")().asInstanceOf[js.Promise[js.Array[Datum]]]
  
  @JSImport("node-persist", "defaultInstance")
  @js.native
  val defaultInstance: js.UndefOr[LocalStorage] = js.native
  
  inline def del(key: String): js.Promise[DeleteFileResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("del")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DeleteFileResult]]
  
  inline def ensureDirectory(dir: String): js.Promise[EnsureDirectoryResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureDirectory")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[EnsureDirectoryResult]]
  
  inline def forEach(callback: js.Function1[/* data */ Datum, js.Promise[Unit] | Unit]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def get(key: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def getDatum(key: String): Datum | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getDatum")(key.asInstanceOf[js.Any]).asInstanceOf[Datum | Unit]
  
  inline def getDatumPath(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDatumPath")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getDatumValue(key: String): Datum | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getDatumValue")(key.asInstanceOf[js.Any]).asInstanceOf[Datum | Unit]
  
  inline def getItem(key: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getItem")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def getRawDatum(key: String): String | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getRawDatum")(key.asInstanceOf[js.Any]).asInstanceOf[String | Unit]
  
  inline def init(): js.Promise[InitOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[js.Promise[InitOptions]]
  inline def init(options: InitOptions): js.Promise[InitOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[InitOptions]]
  
  inline def keys(): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")().asInstanceOf[js.Promise[js.Array[String]]]
  inline def keys(filter: FilterFunction[Datum]): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(filter.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def length(): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("length")().asInstanceOf[js.Promise[Double]]
  inline def length(filter: FilterFunction[Datum]): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("length")(filter.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  
  inline def log(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def parse(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[Any]
  inline def parse(str: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def readDirectory(dir: String): js.Promise[js.Array[Datum]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readDirectory")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Datum]]]
  
  inline def readFile(file: String): js.Promise[Datum | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Datum | String]]
  inline def readFile(file: String, options: DatumOptions): js.Promise[Datum | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Datum | String]]
  
  inline def removeExpiredItems(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeExpiredItems")().asInstanceOf[js.Promise[Unit]]
  
  inline def removeItem(key: String): js.Promise[DeleteFileResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeItem")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DeleteFileResult]]
  
  inline def rm(key: String): js.Promise[DeleteFileResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("rm")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DeleteFileResult]]
  
  inline def set(key: String, value: Any): js.Promise[WriteFileResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WriteFileResult]]
  inline def set(key: String, value: Any, options: DatumOptions): js.Promise[WriteFileResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WriteFileResult]]
  
  inline def setItem(key: String, value: Any): js.Promise[WriteFileResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("setItem")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WriteFileResult]]
  inline def setItem(key: String, value: Any, options: DatumOptions): js.Promise[WriteFileResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("setItem")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WriteFileResult]]
  
  inline def setOptions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")().asInstanceOf[Unit]
  inline def setOptions(options: InitOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def startExpiredKeysInterval(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startExpiredKeysInterval")().asInstanceOf[Unit]
  
  inline def stopExpiredKeysInterval(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopExpiredKeysInterval")().asInstanceOf[Unit]
  
  inline def stringify(obj: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def update(key: String, value: Any): js.Promise[WriteFileResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WriteFileResult]]
  inline def update(key: String, value: Any, options: DatumOptions): js.Promise[WriteFileResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WriteFileResult]]
  
  inline def updateItem(key: String, value: Any): js.Promise[WriteFileResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateItem")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WriteFileResult]]
  inline def updateItem(key: String, value: Any, options: DatumOptions): js.Promise[WriteFileResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateItem")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WriteFileResult]]
  
  inline def values(): js.Promise[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")().asInstanceOf[js.Promise[js.Array[Any]]]
  inline def values(filter: FilterFunction[Datum]): js.Promise[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(filter.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Any]]]
  
  inline def valuesWithKeyMatch(): js.Promise[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("valuesWithKeyMatch")().asInstanceOf[js.Promise[js.Array[Any]]]
  inline def valuesWithKeyMatch(`match`: String): js.Promise[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("valuesWithKeyMatch")(`match`.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Any]]]
  inline def valuesWithKeyMatch(`match`: js.RegExp): js.Promise[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("valuesWithKeyMatch")(`match`.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Any]]]
  
  inline def writeFile(file: String, content: Datum): js.Promise[WriteFileResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WriteFileResult]]
  
  trait Datum extends StObject {
    
    var key: String
    
    var ttl: js.UndefOr[Milliseconds] = js.undefined
    
    var value: Any
  }
  object Datum {
    
    inline def apply(key: String, value: Any): Datum = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Datum]
    }
    
    extension [Self <: Datum](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setTtl(value: Milliseconds): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait DatumOptions extends StObject {
    
    var raw: js.UndefOr[Boolean] = js.undefined
    
    var ttl: js.UndefOr[Milliseconds] = js.undefined
  }
  object DatumOptions {
    
    inline def apply(): DatumOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatumOptions]
    }
    
    extension [Self <: DatumOptions](x: Self) {
      
      inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setTtl(value: Milliseconds): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  trait DeleteFileResult extends StObject {
    
    var existed: Boolean
    
    var file: String
    
    var removed: Boolean
  }
  object DeleteFileResult {
    
    inline def apply(existed: Boolean, file: String, removed: Boolean): DeleteFileResult = {
      val __obj = js.Dynamic.literal(existed = existed.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteFileResult]
    }
    
    extension [Self <: DeleteFileResult](x: Self) {
      
      inline def setExisted(value: Boolean): Self = StObject.set(x, "existed", value.asInstanceOf[js.Any])
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setRemoved(value: Boolean): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    }
  }
  
  trait EnsureDirectoryResult extends StObject {
    
    var dir: String
  }
  object EnsureDirectoryResult {
    
    inline def apply(dir: String): EnsureDirectoryResult = {
      val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnsureDirectoryResult]
    }
    
    extension [Self <: EnsureDirectoryResult](x: Self) {
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    }
  }
  
  type FilterFunction[T] = js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean]
  
  trait InitOptions extends StObject {
    
    var dir: js.UndefOr[String] = js.undefined
    
    var encoding: js.UndefOr[BufferEncoding] = js.undefined
    
    var expiredInterval: js.UndefOr[Milliseconds] = js.undefined
    
    var forgiveParseErrors: js.UndefOr[Boolean] = js.undefined
    
    var logging: js.UndefOr[(js.Function1[/* repeated */ Any, Unit]) | Boolean] = js.undefined
    
    var parse: js.UndefOr[js.Function1[/* str */ String, Any]] = js.undefined
    
    var stringify: js.UndefOr[js.Function1[/* data */ Any, String]] = js.undefined
    
    var ttl: js.UndefOr[Milliseconds] = js.undefined
  }
  object InitOptions {
    
    inline def apply(): InitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitOptions]
    }
    
    extension [Self <: InitOptions](x: Self) {
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setExpiredInterval(value: Milliseconds): Self = StObject.set(x, "expiredInterval", value.asInstanceOf[js.Any])
      
      inline def setExpiredIntervalUndefined: Self = StObject.set(x, "expiredInterval", js.undefined)
      
      inline def setForgiveParseErrors(value: Boolean): Self = StObject.set(x, "forgiveParseErrors", value.asInstanceOf[js.Any])
      
      inline def setForgiveParseErrorsUndefined: Self = StObject.set(x, "forgiveParseErrors", js.undefined)
      
      inline def setLogging(value: (js.Function1[/* repeated */ Any, Unit]) | Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      inline def setLoggingFunction1(value: /* repeated */ Any => Unit): Self = StObject.set(x, "logging", js.Any.fromFunction1(value))
      
      inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      inline def setParse(value: /* str */ String => Any): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      inline def setStringify(value: /* data */ Any => String): Self = StObject.set(x, "stringify", js.Any.fromFunction1(value))
      
      inline def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
      
      inline def setTtl(value: Milliseconds): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  type Milliseconds = Double
  
  trait WriteFileResult extends StObject {
    
    var content: Any
    
    var file: String
  }
  object WriteFileResult {
    
    inline def apply(content: Any, file: String): WriteFileResult = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[WriteFileResult]
    }
    
    extension [Self <: WriteFileResult](x: Self) {
      
      inline def setContent(value: Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
}
