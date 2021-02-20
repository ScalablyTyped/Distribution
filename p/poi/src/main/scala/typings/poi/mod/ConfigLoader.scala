package typings.poi.mod

import typings.poi.mod.ConfigLoader.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigLoader extends StObject {
  
  def load(): js.Any = js.native
  def load(files: js.UndefOr[scala.Nothing], cwd: js.UndefOr[scala.Nothing], stopDir: String): js.Any = js.native
  def load(files: js.UndefOr[scala.Nothing], cwd: String): js.Any = js.native
  def load(files: js.UndefOr[scala.Nothing], cwd: String, stopDir: String): js.Any = js.native
  def load(files: js.Array[String]): js.Any = js.native
  def load(files: js.Array[String], cwd: js.UndefOr[scala.Nothing], stopDir: String): js.Any = js.native
  def load(files: js.Array[String], cwd: String): js.Any = js.native
  def load(files: js.Array[String], cwd: String, stopDir: String): js.Any = js.native
  def load(options: Options): js.Any = js.native
  
  def resolve(): String | Null = js.native
  def resolve(files: js.UndefOr[scala.Nothing], cwd: js.UndefOr[scala.Nothing], stopDir: String): String | Null = js.native
  def resolve(files: js.UndefOr[scala.Nothing], cwd: String): String | Null = js.native
  def resolve(files: js.UndefOr[scala.Nothing], cwd: String, stopDir: String): String | Null = js.native
  def resolve(files: js.Array[String]): String | Null = js.native
  def resolve(files: js.Array[String], cwd: js.UndefOr[scala.Nothing], stopDir: String): String | Null = js.native
  def resolve(files: js.Array[String], cwd: String): String | Null = js.native
  def resolve(files: js.Array[String], cwd: String, stopDir: String): String | Null = js.native
  def resolve(options: Options): String | Null = js.native
}
object ConfigLoader {
  
  @js.native
  trait Options extends StObject {
    
    var cwd: js.UndefOr[String] = js.native
    
    var files: js.UndefOr[js.Array[String]] = js.native
    
    var packageKey: js.UndefOr[String] = js.native
    
    var parseJSON: js.UndefOr[js.Function1[/* str */ String, _]] = js.native
    
    var stopDir: js.UndefOr[String] = js.native
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
      def setParseJSON(value: /* str */ String => _): Self = StObject.set(x, "parseJSON", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParseJSONUndefined: Self = StObject.set(x, "parseJSON", js.undefined)
      
      @scala.inline
      def setStopDir(value: String): Self = StObject.set(x, "stopDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopDirUndefined: Self = StObject.set(x, "stopDir", js.undefined)
    }
  }
}
