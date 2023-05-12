package typings.miscUtilsOfMineGeneric

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcStringEvaluateMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/string/evaluate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def evaluate[T](s: String, defaultValue: Unit): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluate")(s.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def stringToObject(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToObject")().asInstanceOf[Any]
  inline def stringToObject(s: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToObject")(s.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def stringToObject(s: String, propSep: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToObject")(s.asInstanceOf[js.Any], propSep.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def stringToObject(s: String, propSep: String, nameValueSep: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToObject")(s.asInstanceOf[js.Any], propSep.asInstanceOf[js.Any], nameValueSep.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def stringToObject(s: String, propSep: Unit, nameValueSep: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToObject")(s.asInstanceOf[js.Any], propSep.asInstanceOf[js.Any], nameValueSep.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def stringToObject(s: Unit, propSep: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToObject")(s.asInstanceOf[js.Any], propSep.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def stringToObject(s: Unit, propSep: String, nameValueSep: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToObject")(s.asInstanceOf[js.Any], propSep.asInstanceOf[js.Any], nameValueSep.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def stringToObject(s: Unit, propSep: Unit, nameValueSep: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToObject")(s.asInstanceOf[js.Any], propSep.asInstanceOf[js.Any], nameValueSep.asInstanceOf[js.Any])).asInstanceOf[Any]
}
