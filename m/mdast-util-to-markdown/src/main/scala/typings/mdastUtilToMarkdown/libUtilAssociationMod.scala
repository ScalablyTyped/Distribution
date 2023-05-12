package typings.mdastUtilToMarkdown

import typings.mdast.mod.Association
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilAssociationMod {
  
  @JSImport("mdast-util-to-markdown/lib/util/association", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def association(node: Association): String = ^.asInstanceOf[js.Dynamic].applyDynamic("association")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type AssociationId = typings.mdastUtilToMarkdown.libTypesMod.AssociationId
}
