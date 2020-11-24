package typings.memfs.anon

import org.scalablytyped.runtime.Instantiable1
import typings.memfs.nodeMod.Link
import typings.memfs.nodeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait File extends js.Object {
  
  var File: Instantiable1[/* args (repeated) */ js.Any, typings.memfs.nodeMod.File] = js.native
  
  var Link: Instantiable1[/* args (repeated) */ js.Any, typings.memfs.nodeMod.Link] = js.native
  
  var Node: Instantiable1[/* args (repeated) */ js.Any, typings.memfs.nodeMod.Node] = js.native
}
object File {
  
  @scala.inline
  def apply(
    File: Instantiable1[/* args (repeated) */ js.Any, typings.memfs.nodeMod.File],
    Link: Instantiable1[/* args (repeated) */ js.Any, Link],
    Node: Instantiable1[/* args (repeated) */ js.Any, Node]
  ): File = {
    val __obj = js.Dynamic.literal(File = File.asInstanceOf[js.Any], Link = Link.asInstanceOf[js.Any], Node = Node.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFile(value: Instantiable1[/* args (repeated) */ js.Any, typings.memfs.nodeMod.File]): Self = this.set("File", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: Instantiable1[/* args (repeated) */ js.Any, Link]): Self = this.set("Link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: Instantiable1[/* args (repeated) */ js.Any, Node]): Self = this.set("Node", value.asInstanceOf[js.Any])
  }
}
