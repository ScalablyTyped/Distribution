package typings.parse5

import typings.parse5.htmlMod.DOCUMENT_MODE
import typings.parse5.tokenMod.DoctypeToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object doctypeMod {
  
  @JSImport("parse5/dist/cjs/common/doctype", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDocumentMode(token: DoctypeToken): DOCUMENT_MODE = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentMode")(token.asInstanceOf[js.Any]).asInstanceOf[DOCUMENT_MODE]
  
  inline def isConforming(token: DoctypeToken): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConforming")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
