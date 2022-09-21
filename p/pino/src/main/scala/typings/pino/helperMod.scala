package typings.pino

import typings.node.fsMod.PathLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperMod {
  
  @JSImport("pino/test/helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def watchFileCreated(filename: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("watchFileCreated")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def watchForWrite(filename: PathLike, testString: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("watchForWrite")(filename.asInstanceOf[js.Any], testString.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
