package typings
package nodeDashXlsxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-xlsx", JSImport.Namespace)
@js.native
object nodeDashXlsxMod extends js.Object {
  def build(worksheets: js.Array[nodeDashXlsxLib.Anon_DataName]): stdLib.ArrayBuffer = js.native
  def build(worksheets: js.Array[nodeDashXlsxLib.Anon_DataName], options: js.Object): stdLib.ArrayBuffer = js.native
  def parse(mixed: java.lang.String): js.Array[nodeDashXlsxLib.Anon_Data] = js.native
  def parse(mixed: java.lang.String, options: js.Object): js.Array[nodeDashXlsxLib.Anon_Data] = js.native
  def parse(mixed: stdLib.ArrayBuffer): js.Array[nodeDashXlsxLib.Anon_Data] = js.native
  def parse(mixed: stdLib.ArrayBuffer, options: js.Object): js.Array[nodeDashXlsxLib.Anon_Data] = js.native
  @js.native
  object default extends js.Object {
    @JSName("build")
    var build_Original: js.Function2[
        /* worksheets */ js.Array[nodeDashXlsxLib.Anon_DataName], 
        /* options */ js.UndefOr[js.Object], 
        stdLib.ArrayBuffer
      ] = js.native
    @JSName("parse")
    var parse_Original: js.Function2[
        /* mixed */ java.lang.String | stdLib.ArrayBuffer, 
        /* options */ js.UndefOr[js.Object], 
        js.Array[nodeDashXlsxLib.Anon_Data]
      ] = js.native
    def build(worksheets: js.Array[nodeDashXlsxLib.Anon_DataName]): stdLib.ArrayBuffer = js.native
    def build(worksheets: js.Array[nodeDashXlsxLib.Anon_DataName], options: js.Object): stdLib.ArrayBuffer = js.native
    def parse(mixed: java.lang.String): js.Array[nodeDashXlsxLib.Anon_Data] = js.native
    def parse(mixed: java.lang.String, options: js.Object): js.Array[nodeDashXlsxLib.Anon_Data] = js.native
    def parse(mixed: stdLib.ArrayBuffer): js.Array[nodeDashXlsxLib.Anon_Data] = js.native
    def parse(mixed: stdLib.ArrayBuffer, options: js.Object): js.Array[nodeDashXlsxLib.Anon_Data] = js.native
  }
  
}

