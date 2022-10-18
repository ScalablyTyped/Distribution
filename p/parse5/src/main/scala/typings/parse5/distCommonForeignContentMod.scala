package typings.parse5

import typings.parse5.distCommonHtmlMod.NS
import typings.parse5.distCommonHtmlMod.TAG_ID
import typings.parse5.distCommonTokenMod.Attribute
import typings.parse5.distCommonTokenMod.TagToken
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonForeignContentMod {
  
  @JSImport("parse5/dist/common/foreign-content", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("parse5/dist/common/foreign-content", "SVG_TAG_NAMES_ADJUSTMENT_MAP")
  @js.native
  val SVG_TAG_NAMES_ADJUSTMENT_MAP: Map[String, String] = js.native
  
  inline def adjustTokenMathMLAttrs(token: TagToken): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("adjustTokenMathMLAttrs")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def adjustTokenSVGAttrs(token: TagToken): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("adjustTokenSVGAttrs")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def adjustTokenSVGTagName(token: TagToken): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("adjustTokenSVGTagName")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def adjustTokenXMLAttrs(token: TagToken): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("adjustTokenXMLAttrs")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def causesExit(startTagToken: TagToken): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("causesExit")(startTagToken.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIntegrationPoint(tn: TAG_ID, ns: NS, attrs: js.Array[Attribute]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIntegrationPoint")(tn.asInstanceOf[js.Any], ns.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isIntegrationPoint(tn: TAG_ID, ns: NS, attrs: js.Array[Attribute], foreignNS: NS): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIntegrationPoint")(tn.asInstanceOf[js.Any], ns.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], foreignNS.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
