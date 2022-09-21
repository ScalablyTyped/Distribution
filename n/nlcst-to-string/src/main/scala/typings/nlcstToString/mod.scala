package typings.nlcstToString

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nlcst-to-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toString_(node: js.Array[Content]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toString_(node: js.Array[Content], separator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(node.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toString_(node: Content): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toString_(node: Content, separator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(node.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toString_(node: Root): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toString_(node: Root, separator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(node.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Content = typings.nlcst.mod.Content
  
  type Root = typings.nlcst.mod.Root
}
