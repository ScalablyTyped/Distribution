package typings.nconf

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nconf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("nconf", "Provider")
  @js.native
  class Provider () extends StObject {
    def this(options: IOptions) = this()
    
    def add(name: String): Provider = js.native
    def add(name: String, options: IOptions): Provider = js.native
    
    def any(keys: js.Array[String]): js.Any = js.native
    def any(keys: js.Array[String], callback: ICallbackFunction): js.Any = js.native
    
    def argv(): Provider = js.native
    def argv(options: IOptions): Provider = js.native
    
    def clear(key: String): js.Any = js.native
    def clear(key: String, callback: ICallbackFunction): js.Any = js.native
    
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
    
    def get(): js.Any = js.native
    def get(key: js.UndefOr[scala.Nothing], callback: ICallbackFunction): js.Any = js.native
    def get(key: String): js.Any = js.native
    def get(key: String, callback: ICallbackFunction): js.Any = js.native
    
    def init(): Unit = js.native
    def init(options: IOptions): Unit = js.native
    
    def load(): js.Any = js.native
    def load(callback: ICallbackFunction): js.Any = js.native
    
    def loadSources(): js.Any = js.native
    
    def merge(key: String, value: js.Any): js.Any = js.native
    def merge(key: String, value: js.Any, callback: ICallbackFunction): js.Any = js.native
    
    def mergeSources(data: js.Any): Unit = js.native
    
    def overrides(): Provider = js.native
    def overrides(options: IOptions): Provider = js.native
    
    def remove(name: String): Unit = js.native
    
    def required(keys: js.Array[String]): Provider = js.native
    
    def reset(): js.Any = js.native
    def reset(callback: ICallbackFunction): js.Any = js.native
    
    def save(value: js.Any): js.Any = js.native
    def save(value: js.Any, callback: ICallbackFunction): js.Any = js.native
    
    def set(key: String, value: js.Any): js.Any = js.native
    def set(key: String, value: js.Any, callback: ICallbackFunction): js.Any = js.native
    
    var sources: js.Array[_] = js.native
    
    var stores: js.Any = js.native
    
    def use(name: String): Provider = js.native
    def use(name: String, options: IOptions): Provider = js.native
  }
  
  @JSImport("nconf", "add")
  @js.native
  def add(name: String): Provider = js.native
  @JSImport("nconf", "add")
  @js.native
  def add(name: String, options: IOptions): Provider = js.native
  
  @JSImport("nconf", "any")
  @js.native
  def any(keys: js.Array[String]): js.Any = js.native
  @JSImport("nconf", "any")
  @js.native
  def any(keys: js.Array[String], callback: ICallbackFunction): js.Any = js.native
  
  @JSImport("nconf", "argv")
  @js.native
  def argv(): Provider = js.native
  @JSImport("nconf", "argv")
  @js.native
  def argv(options: IOptions): Provider = js.native
  
  @JSImport("nconf", "clear")
  @js.native
  def clear(key: String): js.Any = js.native
  @JSImport("nconf", "clear")
  @js.native
  def clear(key: String, callback: ICallbackFunction): js.Any = js.native
  
  @JSImport("nconf", "create")
  @js.native
  def create(name: String, options: IOptions): IStore = js.native
  
  @JSImport("nconf", "defaults")
  @js.native
  def defaults(): Provider = js.native
  @JSImport("nconf", "defaults")
  @js.native
  def defaults(options: IOptions): Provider = js.native
  
  @JSImport("nconf", "env")
  @js.native
  def env(): Provider = js.native
  @JSImport("nconf", "env")
  @js.native
  def env(options: IOptions): Provider = js.native
  @JSImport("nconf", "env")
  @js.native
  def env(separator: String): Provider = js.native
  
  @JSImport("nconf", "file")
  @js.native
  def file(name: String): Provider = js.native
  @JSImport("nconf", "file")
  @js.native
  def file(name: String, filename: String): Provider = js.native
  @JSImport("nconf", "file")
  @js.native
  def file(name: String, options: IFileOptions): Provider = js.native
  @JSImport("nconf", "file")
  @js.native
  def file(options: IFileOptions): Provider = js.native
  
  @JSImport("nconf", "formats")
  @js.native
  def formats: IFormats = js.native
  @scala.inline
  def formats_=(x: IFormats): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formats")(x.asInstanceOf[js.Any])
  
  @JSImport("nconf", "get")
  @js.native
  def get(): js.Any = js.native
  @JSImport("nconf", "get")
  @js.native
  def get(key: js.UndefOr[scala.Nothing], callback: ICallbackFunction): js.Any = js.native
  @JSImport("nconf", "get")
  @js.native
  def get(key: String): js.Any = js.native
  @JSImport("nconf", "get")
  @js.native
  def get(key: String, callback: ICallbackFunction): js.Any = js.native
  
  @JSImport("nconf", "init")
  @js.native
  def init(): Unit = js.native
  @JSImport("nconf", "init")
  @js.native
  def init(options: IOptions): Unit = js.native
  
  @JSImport("nconf", "key")
  @js.native
  def key(values: js.Any*): String = js.native
  
  @JSImport("nconf", "load")
  @js.native
  def load(): js.Any = js.native
  @JSImport("nconf", "load")
  @js.native
  def load(callback: ICallbackFunction): js.Any = js.native
  
  @JSImport("nconf", "loadFiles")
  @js.native
  def loadFiles(files: js.Any): Unit = js.native
  @JSImport("nconf", "loadFiles")
  @js.native
  def loadFiles(files: js.Any, callback: ICallbackFunction): Unit = js.native
  
  @JSImport("nconf", "loadFilesSync")
  @js.native
  def loadFilesSync(files: js.Any): Unit = js.native
  @JSImport("nconf", "loadFilesSync")
  @js.native
  def loadFilesSync(files: js.Any, callback: ICallbackFunction): Unit = js.native
  
  @JSImport("nconf", "loadSources")
  @js.native
  def loadSources(): js.Any = js.native
  
  @JSImport("nconf", "merge")
  @js.native
  def merge(key: String, value: js.Any): js.Any = js.native
  @JSImport("nconf", "merge")
  @js.native
  def merge(key: String, value: js.Any, callback: ICallbackFunction): js.Any = js.native
  
  @JSImport("nconf", "mergeSources")
  @js.native
  def mergeSources(data: js.Any): Unit = js.native
  
  @JSImport("nconf", "overrides")
  @js.native
  def overrides(): Provider = js.native
  @JSImport("nconf", "overrides")
  @js.native
  def overrides(options: IOptions): Provider = js.native
  
  @JSImport("nconf", "path")
  @js.native
  def path(key: js.Any): js.Array[_] = js.native
  
  @JSImport("nconf", "remove")
  @js.native
  def remove(name: String): Unit = js.native
  
  @JSImport("nconf", "required")
  @js.native
  def required(keys: js.Array[String]): Provider = js.native
  
  @JSImport("nconf", "reset")
  @js.native
  def reset(): js.Any = js.native
  @JSImport("nconf", "reset")
  @js.native
  def reset(callback: ICallbackFunction): js.Any = js.native
  
  @JSImport("nconf", "save")
  @js.native
  def save(value: js.Any): js.Any = js.native
  @JSImport("nconf", "save")
  @js.native
  def save(value: js.Any, callback: ICallbackFunction): js.Any = js.native
  
  @JSImport("nconf", "set")
  @js.native
  def set(key: String, value: js.Any): js.Any = js.native
  @JSImport("nconf", "set")
  @js.native
  def set(key: String, value: js.Any, callback: ICallbackFunction): js.Any = js.native
  
  @JSImport("nconf", "sources")
  @js.native
  def sources: js.Array[js.Any] = js.native
  @scala.inline
  def sources_=(x: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sources")(x.asInstanceOf[js.Any])
  
  @JSImport("nconf", "stores")
  @js.native
  def stores: js.Any = js.native
  @scala.inline
  def stores_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stores")(x.asInstanceOf[js.Any])
  
  @JSImport("nconf", "use")
  @js.native
  def use(name: String): Provider = js.native
  @JSImport("nconf", "use")
  @js.native
  def use(name: String, options: IOptions): Provider = js.native
  
  @JSImport("nconf", "version")
  @js.native
  def version: Double = js.native
  @scala.inline
  def version_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  type ICallbackFunction = js.Function1[/* err */ Error, Unit]
  
  @js.native
  trait IFileOptions extends StObject {
    
    var dir: js.UndefOr[String] = js.native
    
    var file: js.UndefOr[String] = js.native
    
    var format: js.UndefOr[IFormat] = js.native
    
    var json_spacing: js.UndefOr[Double] = js.native
    
    var search: js.UndefOr[Boolean] = js.native
    
    var secure: js.UndefOr[ISecureFileOptions] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object IFileOptions {
    
    @scala.inline
    def apply(): IFileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFileOptions]
    }
    
    @scala.inline
    implicit class IFileOptionsMutableBuilder[Self <: IFileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setFormat(value: IFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setJson_spacing(value: Double): Self = StObject.set(x, "json_spacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJson_spacingUndefined: Self = StObject.set(x, "json_spacing", js.undefined)
      
      @scala.inline
      def setSearch(value: Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      @scala.inline
      def setSecure(value: ISecureFileOptions): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait IFormat extends StObject {
    
    def parse(str: String): js.Any = js.native
    
    def stringify(obj: js.Any, replacer: js.Any): String = js.native
    def stringify(obj: js.Any, replacer: js.Any, spacing: js.Any): String = js.native
  }
  
  @js.native
  trait IFormats extends StObject {
    
    var ini: IFormat = js.native
    
    var json: IFormat = js.native
  }
  object IFormats {
    
    @scala.inline
    def apply(ini: IFormat, json: IFormat): IFormats = {
      val __obj = js.Dynamic.literal(ini = ini.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFormats]
    }
    
    @scala.inline
    implicit class IFormatsMutableBuilder[Self <: IFormats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIni(value: IFormat): Self = StObject.set(x, "ini", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJson(value: IFormat): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    }
  }
  
  type IOptions = StringDictionary[js.Any]
  
  @js.native
  trait ISecureFileOptions extends StObject {
    
    var alg: js.UndefOr[String] = js.native
    
    var secret: String = js.native
  }
  object ISecureFileOptions {
    
    @scala.inline
    def apply(secret: String): ISecureFileOptions = {
      val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISecureFileOptions]
    }
    
    @scala.inline
    implicit class ISecureFileOptionsMutableBuilder[Self <: ISecureFileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
      
      @scala.inline
      def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IStore extends StObject {
    
    def clear(key: String): Boolean = js.native
    
    def get(key: String): js.Any = js.native
    
    def merge(key: String, value: js.Any): Boolean = js.native
    
    def reset(): Boolean = js.native
    def reset(callback: ICallbackFunction): Boolean = js.native
    
    def set(key: String, value: js.Any): Boolean = js.native
    
    var `type`: String = js.native
  }
}
