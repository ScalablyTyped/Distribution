package typings.parse5.distCjsCommonHtmlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ATTRS extends StObject
@JSImport("parse5/dist/cjs/common/html", "ATTRS")
@js.native
object ATTRS extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ATTRS & String] = js.native
  
  @js.native
  sealed trait ACTION
    extends StObject
       with ATTRS
  /* "action" */ val ACTION: typings.parse5.distCjsCommonHtmlMod.ATTRS.ACTION & String = js.native
  
  @js.native
  sealed trait COLOR
    extends StObject
       with ATTRS
  /* "color" */ val COLOR: typings.parse5.distCjsCommonHtmlMod.ATTRS.COLOR & String = js.native
  
  @js.native
  sealed trait ENCODING
    extends StObject
       with ATTRS
  /* "encoding" */ val ENCODING: typings.parse5.distCjsCommonHtmlMod.ATTRS.ENCODING & String = js.native
  
  @js.native
  sealed trait FACE
    extends StObject
       with ATTRS
  /* "face" */ val FACE: typings.parse5.distCjsCommonHtmlMod.ATTRS.FACE & String = js.native
  
  @js.native
  sealed trait NAME
    extends StObject
       with ATTRS
  /* "name" */ val NAME: typings.parse5.distCjsCommonHtmlMod.ATTRS.NAME & String = js.native
  
  @js.native
  sealed trait PROMPT
    extends StObject
       with ATTRS
  /* "prompt" */ val PROMPT: typings.parse5.distCjsCommonHtmlMod.ATTRS.PROMPT & String = js.native
  
  @js.native
  sealed trait SIZE
    extends StObject
       with ATTRS
  /* "size" */ val SIZE: typings.parse5.distCjsCommonHtmlMod.ATTRS.SIZE & String = js.native
  
  @js.native
  sealed trait TYPE
    extends StObject
       with ATTRS
  /* "type" */ val TYPE: typings.parse5.distCjsCommonHtmlMod.ATTRS.TYPE & String = js.native
}
