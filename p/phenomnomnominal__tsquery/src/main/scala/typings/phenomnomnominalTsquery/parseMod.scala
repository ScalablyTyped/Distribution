package typings.phenomnomnominalTsquery

import typings.phenomnomnominalTsquery.tsqueryTypesMod.TSQuerySelectorNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseMod {
  
  @JSImport("@phenomnomnominal/tsquery/dist/src/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def parse(selector: String): TSQuerySelectorNode = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(selector.asInstanceOf[js.Any]).asInstanceOf[TSQuerySelectorNode]
}
