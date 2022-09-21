package typings.onfidoActiveVideoCapture

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("@onfido/active-video-capture/dist/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def classy(classNames: ClassNames*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("classy")(classNames.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  type ClassName = js.UndefOr[String | Null]
  
  type ClassNameRecord = Record[String, js.UndefOr[Boolean | Null]]
  
  type ClassNames = ClassName | js.Array[ClassName] | ClassNameRecord
}
