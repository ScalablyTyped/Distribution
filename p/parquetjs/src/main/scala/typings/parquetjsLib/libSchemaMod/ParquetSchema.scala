package typings
package parquetjsLib.libSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parquetjs/lib/schema", "ParquetSchema")
@js.native
class ParquetSchema protected () extends js.Object {
  def this(schema: parquetjsLib.libSchemaDotInterfaceMod.SchemaInterface) = this()
  var fieldList: js.Array[parquetjsLib.libFieldDotInterfaceMod.FieldInterface] = js.native
  var fields: org.scalablytyped.runtime.StringDictionary[parquetjsLib.libFieldDotInterfaceMod.FieldInterface] = js.native
  var schema: parquetjsLib.libSchemaDotInterfaceMod.SchemaInterface = js.native
  def findField(path: java.lang.String): parquetjsLib.libFieldDotInterfaceMod.FieldInterface = js.native
  def findField(path: js.Array[js.Array[java.lang.String] | java.lang.String]): parquetjsLib.libFieldDotInterfaceMod.FieldInterface = js.native
  def findFieldBranch(path: java.lang.String): js.Array[parquetjsLib.libFieldDotInterfaceMod.FieldInterface] = js.native
  def findFieldBranch(path: js.Array[java.lang.String]): js.Array[parquetjsLib.libFieldDotInterfaceMod.FieldInterface] = js.native
}

