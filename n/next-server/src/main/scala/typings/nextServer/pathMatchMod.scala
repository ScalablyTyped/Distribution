package typings.nextServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathMatchMod {
  
  @JSImport("next-server/dist/server/lib/path-match", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Function1[
    /* path */ String, 
    js.Function2[/* pathname */ js.UndefOr[String], /* params */ js.UndefOr[Any], Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function1[
    /* path */ String, 
    js.Function2[/* pathname */ js.UndefOr[String], /* params */ js.UndefOr[Any], Any]
  ]]
}
