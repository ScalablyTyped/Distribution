package typings.poi.mod

import typings.poi.mod.ConfigLoader.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigLoader extends StObject {
  
  def load(): js.Any = js.native
  def load(files: js.Array[String]): js.Any = js.native
  def load(files: js.Array[String], cwd: String): js.Any = js.native
  def load(files: js.Array[String], cwd: String, stopDir: String): js.Any = js.native
  def load(files: js.Array[String], cwd: Unit, stopDir: String): js.Any = js.native
  def load(files: Unit, cwd: String): js.Any = js.native
  def load(files: Unit, cwd: String, stopDir: String): js.Any = js.native
  def load(files: Unit, cwd: Unit, stopDir: String): js.Any = js.native
  def load(options: Options): js.Any = js.native
  
  def resolve(): String | Null = js.native
  def resolve(files: js.Array[String]): String | Null = js.native
  def resolve(files: js.Array[String], cwd: String): String | Null = js.native
  def resolve(files: js.Array[String], cwd: String, stopDir: String): String | Null = js.native
  def resolve(files: js.Array[String], cwd: Unit, stopDir: String): String | Null = js.native
  def resolve(files: Unit, cwd: String): String | Null = js.native
  def resolve(files: Unit, cwd: String, stopDir: String): String | Null = js.native
  def resolve(files: Unit, cwd: Unit, stopDir: String): String | Null = js.native
  def resolve(options: Options): String | Null = js.native
}
object ConfigLoader {
  
  trait Options extends StObject {
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var files: js.UndefOr[js.Array[String]] = js.undefined
    
    var packageKey: js.UndefOr[String] = js.undefined
    
    var parseJSON: js.UndefOr[js.Function1[/* str */ String, js.Any]] = js.undefined
    
    var stopDir: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setPackageKey(value: String): Self = StObject.set(x, "packageKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageKeyUndefined: Self = StObject.set(x, "packageKey", js.undefined)
      
      @scala.inline
      def setParseJSON(value: /* str */ String => js.Any): Self = StObject.set(x, "parseJSON", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParseJSONUndefined: Self = StObject.set(x, "parseJSON", js.undefined)
      
      @scala.inline
      def setStopDir(value: String): Self = StObject.set(x, "stopDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopDirUndefined: Self = StObject.set(x, "stopDir", js.undefined)
    }
  }
}
