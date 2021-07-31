package typings.ol

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objMod {
  
  @JSImport("ol/obj", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def assign(target: js.Any, var_sources: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], var_sources.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def clear(`object`: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def getValues[V](
    `object`: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in string | number ]: V}
    */ typings.ol.olStrings.getValues & TopLevel[js.Any]
  ): js.Array[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("getValues")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[V]]
  
  @scala.inline
  def isEmpty(`object`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
