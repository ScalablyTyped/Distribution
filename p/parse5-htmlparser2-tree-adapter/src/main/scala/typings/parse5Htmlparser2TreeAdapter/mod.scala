package typings.parse5Htmlparser2TreeAdapter

import typings.domhandler.libNodeMod.AnyNode
import typings.domhandler.libNodeMod.ChildNode
import typings.domhandler.libNodeMod.ParentNode
import typings.domhandler.mod.Comment
import typings.domhandler.mod.Document
import typings.domhandler.mod.Element
import typings.domhandler.mod.ProcessingInstruction
import typings.domhandler.mod.Text
import typings.parse5.distTreeAdaptersInterfaceMod.TreeAdapter
import typings.parse5.distTreeAdaptersInterfaceMod.TreeAdapterTypeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parse5-htmlparser2-tree-adapter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("parse5-htmlparser2-tree-adapter", "adapter")
  @js.native
  val adapter: TreeAdapter[Htmlparser2TreeAdapterMap] = js.native
  
  inline def serializeDoctypeContent(name: String, publicId: String, systemId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeDoctypeContent")(name.asInstanceOf[js.Any], publicId.asInstanceOf[js.Any], systemId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Htmlparser2TreeAdapterMap = TreeAdapterTypeMap[
    AnyNode, 
    ParentNode, 
    ChildNode, 
    Document, 
    Document, 
    Element, 
    Comment, 
    Text, 
    Element, 
    ProcessingInstruction
  ]
}
