package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibRecursiveDeleteMod {
  
  @JSImport("next/dist/lib/recursive-delete", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def recursiveDelete(dir: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("recursiveDelete")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def recursiveDelete(dir: String, exclude: js.RegExp): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("recursiveDelete")(dir.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def recursiveDelete(dir: String, exclude: js.RegExp, previousPath: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("recursiveDelete")(dir.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any], previousPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def recursiveDelete(dir: String, exclude: Unit, previousPath: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("recursiveDelete")(dir.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any], previousPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
