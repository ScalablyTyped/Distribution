package typings.mergeAnything

import typings.mergeAnything.mergeMod.IConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("merge-anything", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(origin: js.Any, newComers: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(origin.asInstanceOf[js.Any], newComers.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def default(origin: IConfig, newComers: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(origin.asInstanceOf[js.Any], newComers.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def concatArrays(originVal: js.Any, newVal: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("concatArrays")(originVal.asInstanceOf[js.Any], newVal.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def merge(origin: js.Any, newComers: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(origin.asInstanceOf[js.Any], newComers.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def merge(origin: IConfig, newComers: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(origin.asInstanceOf[js.Any], newComers.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
