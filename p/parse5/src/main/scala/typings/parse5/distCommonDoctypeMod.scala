package typings.parse5

import typings.parse5.distCommonHtmlMod.DOCUMENT_MODE
import typings.parse5.distCommonTokenMod.DoctypeToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonDoctypeMod {
  
  @JSImport("parse5/dist/common/doctype", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDocumentMode(token: DoctypeToken): DOCUMENT_MODE = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentMode")(token.asInstanceOf[js.Any]).asInstanceOf[DOCUMENT_MODE]
  
  inline def isConforming(token: DoctypeToken): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConforming")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
