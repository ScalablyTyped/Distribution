package typings.ol

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objMod {
  
  @JSImport("ol/obj", "assign")
  @js.native
  def assign(target: js.Any, var_sources: js.Any*): js.Any = js.native
  
  @JSImport("ol/obj", "clear")
  @js.native
  def clear(`object`: js.Any): Unit = js.native
  
  @JSImport("ol/obj", "getValues")
  @js.native
  def getValues[V](
    `object`: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in string | number ]: V}
    */ typings.ol.olStrings.getValues with TopLevel[js.Any]
  ): js.Array[V] = js.native
  
  @JSImport("ol/obj", "isEmpty")
  @js.native
  def isEmpty(`object`: js.Any): Boolean = js.native
}
