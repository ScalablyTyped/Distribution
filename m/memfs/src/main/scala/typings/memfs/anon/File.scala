package typings.memfs.anon

import org.scalablytyped.runtime.Instantiable1
import typings.memfs.libNodeMod.Link
import typings.memfs.libNodeMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait File extends StObject {
  
  var File: Instantiable1[/* args (repeated) */ Any, typings.memfs.libNodeMod.File]
  
  var Link: Instantiable1[/* args (repeated) */ Any, typings.memfs.libNodeMod.Link]
  
  var Node: Instantiable1[/* args (repeated) */ Any, typings.memfs.libNodeMod.Node]
}
object File {
  
  inline def apply(
    File: Instantiable1[/* args (repeated) */ Any, typings.memfs.libNodeMod.File],
    Link: Instantiable1[/* args (repeated) */ Any, Link],
    Node: Instantiable1[/* args (repeated) */ Any, Node]
  ): File = {
    val __obj = js.Dynamic.literal(File = File.asInstanceOf[js.Any], Link = Link.asInstanceOf[js.Any], Node = Node.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: File] (val x: Self) extends AnyVal {
    
    inline def setFile(value: Instantiable1[/* args (repeated) */ Any, typings.memfs.libNodeMod.File]): Self = StObject.set(x, "File", value.asInstanceOf[js.Any])
    
    inline def setLink(value: Instantiable1[/* args (repeated) */ Any, Link]): Self = StObject.set(x, "Link", value.asInstanceOf[js.Any])
    
    inline def setNode(value: Instantiable1[/* args (repeated) */ Any, Node]): Self = StObject.set(x, "Node", value.asInstanceOf[js.Any])
  }
}
