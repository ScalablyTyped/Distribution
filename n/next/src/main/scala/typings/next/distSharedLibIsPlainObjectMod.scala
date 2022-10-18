package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibIsPlainObjectMod {
  
  @JSImport("next/dist/shared/lib/is-plain-object", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getObjectClassLabel(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getObjectClassLabel")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isPlainObject(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
