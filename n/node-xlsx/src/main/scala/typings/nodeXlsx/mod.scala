package typings.nodeXlsx

import typings.nodeXlsx.anon.Data
import typings.nodeXlsx.anon.Name
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-xlsx", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def build(worksheets: js.Array[Name]): ArrayBuffer = js.native
  def build(worksheets: js.Array[Name], options: js.Object): ArrayBuffer = js.native
  def parse(mixed: String): js.Array[Data] = js.native
  def parse(mixed: String, options: js.Object): js.Array[Data] = js.native
  def parse(mixed: ArrayBuffer): js.Array[Data] = js.native
  def parse(mixed: ArrayBuffer, options: js.Object): js.Array[Data] = js.native
  @js.native
  object default extends js.Object {
    @JSName("build")
    var build_Original: js.Function2[/* worksheets */ js.Array[Name], /* options */ js.UndefOr[js.Object], ArrayBuffer] = js.native
    @JSName("parse")
    var parse_Original: js.Function2[
        /* mixed */ String | ArrayBuffer, 
        /* options */ js.UndefOr[js.Object], 
        js.Array[Data]
      ] = js.native
    def build(worksheets: js.Array[Name]): ArrayBuffer = js.native
    def build(worksheets: js.Array[Name], options: js.Object): ArrayBuffer = js.native
    def parse(mixed: String): js.Array[Data] = js.native
    def parse(mixed: String, options: js.Object): js.Array[Data] = js.native
    def parse(mixed: ArrayBuffer): js.Array[Data] = js.native
    def parse(mixed: ArrayBuffer, options: js.Object): js.Array[Data] = js.native
  }
  
}

