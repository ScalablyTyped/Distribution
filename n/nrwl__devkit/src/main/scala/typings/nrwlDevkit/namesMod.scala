package typings.nrwlDevkit

import typings.nrwlDevkit.anon.ClassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namesMod {
  
  @JSImport("@nrwl/devkit/src/utils/names", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def names(name: String): ClassName = ^.asInstanceOf[js.Dynamic].applyDynamic("names")(name.asInstanceOf[js.Any]).asInstanceOf[ClassName]
}
