package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("ol/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/util", "VERSION")
  @js.native
  val VERSION: String = js.native
  
  inline def `abstract`(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("abstract")().asInstanceOf[js.Any]
  
  inline def getUid(obj: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUid")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
}
