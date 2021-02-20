package typings.parentPackageJson

import org.scalablytyped.runtime.StringDictionary
import typings.parentPackageJson.parentPackageJsonBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parent-package-json", JSImport.Namespace)
  @js.native
  def apply(): ParentPackage | `false` = js.native
  @JSImport("parent-package-json", JSImport.Namespace)
  @js.native
  def apply(startPath: js.UndefOr[scala.Nothing], ignore: Double): ParentPackage | `false` = js.native
  @JSImport("parent-package-json", JSImport.Namespace)
  @js.native
  def apply(startPath: String): ParentPackage | `false` = js.native
  @JSImport("parent-package-json", JSImport.Namespace)
  @js.native
  def apply(startPath: String, ignore: Double): ParentPackage | `false` = js.native
  @JSImport("parent-package-json", JSImport.Namespace)
  @js.native
  def apply(startPath: Null, ignore: Double): ParentPackage | `false` = js.native
  
  @js.native
  trait ParentPackage extends StObject {
    
    def parse(): StringDictionary[js.Any] = js.native
    
    var path: String = js.native
    
    def read(): String = js.native
  }
  object ParentPackage {
    
    @scala.inline
    def apply(parse: () => StringDictionary[js.Any], path: String, read: () => String): ParentPackage = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction0(parse), path = path.asInstanceOf[js.Any], read = js.Any.fromFunction0(read))
      __obj.asInstanceOf[ParentPackage]
    }
    
    @scala.inline
    implicit class ParentPackageMutableBuilder[Self <: ParentPackage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParse(value: () => StringDictionary[js.Any]): Self = StObject.set(x, "parse", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRead(value: () => String): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
    }
  }
}
