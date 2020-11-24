package typings.ol

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/obj", JSImport.Namespace)
@js.native
object objMod extends js.Object {
  
  def assign(target: js.Any, var_sources: js.Any*): js.Any = js.native
  
  def clear(`object`: js.Any): Unit = js.native
  
  def getValues[V](
    `object`: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in string | number ]: V}
    */ typings.ol.olStrings.getValues with TopLevel[js.Any]
  ): js.Array[V] = js.native
  
  def isEmpty(`object`: js.Any): Boolean = js.native
}
