package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/obj", JSImport.Namespace)
@js.native
object objMod extends js.Object {
  def clear(`object`: js.Any): Unit = js.native
  def getValues[V](
    `object`: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in string | number ]: V}
    */ typings.ol.olStrings.getValues with js.Any
  ): js.Array[V] = js.native
  def isEmpty(`object`: js.Any): Boolean = js.native
}

