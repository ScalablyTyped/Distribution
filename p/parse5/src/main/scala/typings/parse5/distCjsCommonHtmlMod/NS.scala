package typings.parse5.distCjsCommonHtmlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NS extends StObject
@JSImport("parse5/dist/cjs/common/html", "NS")
@js.native
object NS extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[NS & String] = js.native
  
  @js.native
  sealed trait HTML
    extends StObject
       with NS
  /* "http://www.w3.org/1999/xhtml" */ val HTML: typings.parse5.distCjsCommonHtmlMod.NS.HTML & String = js.native
  
  @js.native
  sealed trait MATHML
    extends StObject
       with NS
  /* "http://www.w3.org/1998/Math/MathML" */ val MATHML: typings.parse5.distCjsCommonHtmlMod.NS.MATHML & String = js.native
  
  @js.native
  sealed trait SVG
    extends StObject
       with NS
  /* "http://www.w3.org/2000/svg" */ val SVG: typings.parse5.distCjsCommonHtmlMod.NS.SVG & String = js.native
  
  @js.native
  sealed trait XLINK
    extends StObject
       with NS
  /* "http://www.w3.org/1999/xlink" */ val XLINK: typings.parse5.distCjsCommonHtmlMod.NS.XLINK & String = js.native
  
  @js.native
  sealed trait XML
    extends StObject
       with NS
  /* "http://www.w3.org/XML/1998/namespace" */ val XML: typings.parse5.distCjsCommonHtmlMod.NS.XML & String = js.native
  
  @js.native
  sealed trait XMLNS
    extends StObject
       with NS
  /* "http://www.w3.org/2000/xmlns/" */ val XMLNS: typings.parse5.distCjsCommonHtmlMod.NS.XMLNS & String = js.native
}
