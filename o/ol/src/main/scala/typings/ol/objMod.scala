package typings.ol

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objMod {
  
  @JSImport("ol/obj", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assign(target: Any, var_sources: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(List(target.asInstanceOf[js.Any]).`++`(var_sources.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  inline def clear(`object`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getValues[V](
    `object`: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in string | number ]: V}
    */ typings.ol.olStrings.getValues & TopLevel[Any]
  ): js.Array[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("getValues")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[V]]
  
  inline def isEmpty(`object`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
