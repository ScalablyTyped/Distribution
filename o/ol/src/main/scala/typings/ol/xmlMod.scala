package typings.ol

import typings.std.Document
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/XML", JSImport.Namespace)
@js.native
object xmlMod extends js.Object {
  @js.native
  trait XML extends js.Object {
    def read(source: String): js.Any = js.native
    def read(source: Document): js.Any = js.native
    def read(source: Element): js.Any = js.native
    def readFromDocument(doc: Document): js.Any = js.native
    def readFromNode(node: Element): js.Any = js.native
  }
  
  @js.native
  abstract class default () extends XML
  
}

