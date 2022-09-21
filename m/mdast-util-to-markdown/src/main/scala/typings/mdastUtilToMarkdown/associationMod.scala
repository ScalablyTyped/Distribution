package typings.mdastUtilToMarkdown

import typings.mdast.mod.Association
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object associationMod {
  
  @JSImport("mdast-util-to-markdown/lib/util/association", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def association(node: Association_): String = ^.asInstanceOf[js.Dynamic].applyDynamic("association")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type Association_ = Association
}
