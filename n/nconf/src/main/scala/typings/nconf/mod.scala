package typings.nconf

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nconf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("nconf", "Provider")
  @js.native
  open class Provider () extends StObject {
    def this(options: IOptions) = this()
    
    def add(name: String): Provider = js.native
    def add(name: String, options: IOptions): Provider = js.native
    
    def any(keys: js.Array[String]): Any = js.native
    def any(keys: js.Array[String], callback: ICallbackFunction): Any = js.native
    
    def argv(): Provider = js.native
    def argv(options: IOptions): Provider = js.native
    
    def clear(key: String): Any = js.native
    def clear(key: String, callback: ICallbackFunction): Any = js.native
    
    def create(name: String, options: IOptions): IStore = js.native
    
    def defaults(): Provider = js.native
    def defaults(options: IOptions): Provider = js.native
    
    def env(): Provider = js.native
    def env(options: IOptions): Provider = js.native
    def env(separator: String): Provider = js.native
    
    def file(name: String): Provider = js.native
    def file(name: String, filename: String): Provider = js.native
    def file(name: String, options: IFileOptions): Provider = js.native
    def file(options: IFileOptions): Provider = js.native
    
    def get(): Any = js.native
    def get(key: String): Any = js.native
    def get(key: String, callback: ICallbackFunction): Any = js.native
    def get(key: Unit, callback: ICallbackFunction): Any = js.native
    
    def init(): Unit = js.native
    def init(options: IOptions): Unit = js.native
    
    def load(): Any = js.native
    def load(callback: ICallbackFunction): Any = js.native
    
    def loadSources(): Any = js.native
    
    def merge(key: String, value: Any): Any = js.native
    def merge(key: String, value: Any, callback: ICallbackFunction): Any = js.native
    
    def mergeSources(data: Any): Unit = js.native
    
    def overrides(): Provider = js.native
    def overrides(options: IOptions): Provider = js.native
    
    def remove(name: String): Unit = js.native
    
    def required(keys: js.Array[String]): Provider = js.native
    
    def reset(): Any = js.native
    def reset(callback: ICallbackFunction): Any = js.native
    
    def save(value: Any): Any = js.native
    def save(value: Any, callback: ICallbackFunction): Any = js.native
    
    def set(key: String, value: Any): Any = js.native
    def set(key: String, value: Any, callback: ICallbackFunction): Any = js.native
    
    var sources: js.Array[Any] = js.native
    
    var stores: Any = js.native
    
    def use(name: String): Provider = js.native
    def use(name: String, options: IOptions): Provider = js.native
  }
  
  inline def add(name: String): Provider = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any]).asInstanceOf[Provider]
  inline def add(name: String, options: IOptions): Provider = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Provider]
  
  inline def any(keys: js.Array[String]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("any")(keys.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def any(keys: js.Array[String], callback: ICallbackFunction): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(keys.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def argv(): Provider = ^.asInstanceOf[js.Dynamic].applyDynamic("argv")().asInstanceOf[Provider]
  inline def argv(options: IOptions): Provider = ^.asInstanceOf[js.Dynamic].applyDynamic("argv")(options.asInstanceOf[js.Any]).asInstanceOf[Provider]
  
  inline def clear(key: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(key.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def clear(key: String, callback: ICallbackFunction): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("clear")(key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def create(name: String, options: IOptions): IStore = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IStore]
  
  inline def defaults(): Provider = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")().asInstanceOf[Provider]
  inline def defaults(options: IOptions): Provider = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(options.asInstanceOf[js.Any]).asInstanceOf[Provider]
  
  inline def env(): Provider = ^.asInstanceOf[js.Dynamic].applyDynamic("env")().asInstanceOf[Provider]
  inline def env(options: IOptions): Provider = ^.asInstanceOf[js.Dynamic].applyDynamic("env")(options.asInstanceOf[js.Any]).asInstanceOf[Provider]
  inline def env(separator: String): Provider = ^.asInstanceOf[js.Dynamic].applyDynamic("env")(separator.asInstanceOf[js.Any]).asInstanceOf[Provider]
  
  inline def file(name: String): Provider = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(name.asInstanceOf[js.Any]).asInstanceOf[Provider]
  inline def file(name: String, filename: String): Provider = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(name.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Provider]
  inline def file(name: String, options: IFileOptions): Provider = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Provider]
  inline def file(options: IFileOptions): Provider = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(options.asInstanceOf[js.Any]).asInstanceOf[Provider]
  
  @JSImport("nconf", "formats")
  @js.native
  def formats: IFormats = js.native
  inline def formats_=(x: IFormats): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formats")(x.asInstanceOf[js.Any])
  
  inline def get(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[Any]
  inline def get(key: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def get(key: String, callback: ICallbackFunction): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def get(key: Unit, callback: ICallbackFunction): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
  inline def init(options: IOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def key(values: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("key")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def load(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("load")().asInstanceOf[Any]
  inline def load(callback: ICallbackFunction): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(callback.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def loadFiles(files: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFiles")(files.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def loadFiles(files: Any, callback: ICallbackFunction): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFiles")(files.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def loadFilesSync(files: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFilesSync")(files.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def loadFilesSync(files: Any, callback: ICallbackFunction): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFilesSync")(files.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def loadSources(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSources")().asInstanceOf[Any]
  
  inline def merge(key: String, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def merge(key: String, value: Any, callback: ICallbackFunction): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def mergeSources(data: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeSources")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def overrides(): Provider = ^.asInstanceOf[js.Dynamic].applyDynamic("overrides")().asInstanceOf[Provider]
  inline def overrides(options: IOptions): Provider = ^.asInstanceOf[js.Dynamic].applyDynamic("overrides")(options.asInstanceOf[js.Any]).asInstanceOf[Provider]
  
  inline def path(key: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("path")(key.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def remove(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def required(keys: js.Array[String]): Provider = ^.asInstanceOf[js.Dynamic].applyDynamic("required")(keys.asInstanceOf[js.Any]).asInstanceOf[Provider]
  
  inline def reset(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Any]
  inline def reset(callback: ICallbackFunction): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")(callback.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def save(value: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("save")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def save(value: Any, callback: ICallbackFunction): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("save")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def set(key: String, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def set(key: String, value: Any, callback: ICallbackFunction): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("nconf", "sources")
  @js.native
  def sources: js.Array[Any] = js.native
  inline def sources_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sources")(x.asInstanceOf[js.Any])
  
  @JSImport("nconf", "stores")
  @js.native
  def stores: Any = js.native
  inline def stores_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stores")(x.asInstanceOf[js.Any])
  
  inline def use(name: String): Provider = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(name.asInstanceOf[js.Any]).asInstanceOf[Provider]
  inline def use(name: String, options: IOptions): Provider = (^.asInstanceOf[js.Dynamic].applyDynamic("use")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Provider]
  
  @JSImport("nconf", "version")
  @js.native
  def version: String = js.native
  inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  type ICallbackFunction = js.Function1[/* err */ js.Error, Unit]
  
  trait IFileOptions extends StObject {
    
    var dir: js.UndefOr[String] = js.undefined
    
    var file: js.UndefOr[String] = js.undefined
    
    var format: js.UndefOr[IFormat] = js.undefined
    
    var json_spacing: js.UndefOr[Double] = js.undefined
    
    var search: js.UndefOr[Boolean] = js.undefined
    
    var secure: js.UndefOr[ISecureFileOptions] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object IFileOptions {
    
    inline def apply(): IFileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFileOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFileOptions] (val x: Self) extends AnyVal {
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setFormat(value: IFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setJson_spacing(value: Double): Self = StObject.set(x, "json_spacing", value.asInstanceOf[js.Any])
      
      inline def setJson_spacingUndefined: Self = StObject.set(x, "json_spacing", js.undefined)
      
      inline def setSearch(value: Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setSecure(value: ISecureFileOptions): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait IFormat extends StObject {
    
    def parse(str: String): Any = js.native
    
    def stringify(obj: Any, replacer: Any): String = js.native
    def stringify(obj: Any, replacer: Any, spacing: Any): String = js.native
  }
  
  trait IFormats extends StObject {
    
    var ini: IFormat
    
    var json: IFormat
  }
  object IFormats {
    
    inline def apply(ini: IFormat, json: IFormat): IFormats = {
      val __obj = js.Dynamic.literal(ini = ini.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFormats]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFormats] (val x: Self) extends AnyVal {
      
      inline def setIni(value: IFormat): Self = StObject.set(x, "ini", value.asInstanceOf[js.Any])
      
      inline def setJson(value: IFormat): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    }
  }
  
  type IOptions = StringDictionary[Any]
  
  trait ISecureFileOptions extends StObject {
    
    var alg: js.UndefOr[String] = js.undefined
    
    var secret: String
  }
  object ISecureFileOptions {
    
    inline def apply(secret: String): ISecureFileOptions = {
      val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISecureFileOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISecureFileOptions] (val x: Self) extends AnyVal {
      
      inline def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      inline def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IStore extends StObject {
    
    def clear(key: String): Boolean = js.native
    
    def get(key: String): Any = js.native
    
    def merge(key: String, value: Any): Boolean = js.native
    
    def reset(): Boolean = js.native
    def reset(callback: ICallbackFunction): Boolean = js.native
    
    def set(key: String, value: Any): Boolean = js.native
    
    var `type`: String = js.native
  }
}
