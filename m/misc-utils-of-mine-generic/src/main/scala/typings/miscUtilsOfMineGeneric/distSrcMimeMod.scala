package typings.miscUtilsOfMineGeneric

import typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMimeMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/mime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getExtensionsForMimeType(mimeType: String): js.UndefOr[_empty | js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtensionsForMimeType")(mimeType.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[_empty | js.Array[String]]]
  
  inline def getMimeTypeForExtension(`extension`: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMimeTypeForExtension")(`extension`.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
}
