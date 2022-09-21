package typings.parse5.commonHtmlMod

import typings.parse5.commonHtmlMod.^
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def SPECIAL_ELEMENTS: Record[NS, Set[TAG_ID]] = ^.asInstanceOf[js.Dynamic].selectDynamic("SPECIAL_ELEMENTS").asInstanceOf[Record[NS, Set[TAG_ID]]]

inline def getTagID(tagName: String): TAG_ID = ^.asInstanceOf[js.Dynamic].applyDynamic("getTagID")(tagName.asInstanceOf[js.Any]).asInstanceOf[TAG_ID]

inline def hasUnescapedText(tn: String, scriptingEnabled: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasUnescapedText")(tn.asInstanceOf[js.Any], scriptingEnabled.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isNumberedHeader(tn: TAG_ID): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumberedHeader")(tn.asInstanceOf[js.Any]).asInstanceOf[Boolean]
