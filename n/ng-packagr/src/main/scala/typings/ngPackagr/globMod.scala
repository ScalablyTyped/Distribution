package typings.ngPackagr

import typings.glob.mod.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globMod {
  
  @JSImport("ng-packagr/lib/utils/glob", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def globFiles(pattern: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("globFiles")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def globFiles(pattern: String, options: IOptions): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("globFiles")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  inline def globFiles(pattern: js.Array[String]): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("globFiles")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def globFiles(pattern: js.Array[String], options: IOptions): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("globFiles")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
}
