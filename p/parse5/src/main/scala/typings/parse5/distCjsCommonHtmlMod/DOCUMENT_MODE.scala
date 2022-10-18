package typings.parse5.distCjsCommonHtmlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DOCUMENT_MODE extends StObject
@JSImport("parse5/dist/cjs/common/html", "DOCUMENT_MODE")
@js.native
object DOCUMENT_MODE extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DOCUMENT_MODE & String] = js.native
  
  @js.native
  sealed trait LIMITED_QUIRKS
    extends StObject
       with DOCUMENT_MODE
  /* "limited-quirks" */ val LIMITED_QUIRKS: typings.parse5.distCjsCommonHtmlMod.DOCUMENT_MODE.LIMITED_QUIRKS & String = js.native
  
  @js.native
  sealed trait NO_QUIRKS
    extends StObject
       with DOCUMENT_MODE
  /* "no-quirks" */ val NO_QUIRKS: typings.parse5.distCjsCommonHtmlMod.DOCUMENT_MODE.NO_QUIRKS & String = js.native
  
  @js.native
  sealed trait QUIRKS
    extends StObject
       with DOCUMENT_MODE
  /* "quirks" */ val QUIRKS: typings.parse5.distCjsCommonHtmlMod.DOCUMENT_MODE.QUIRKS & String = js.native
}
