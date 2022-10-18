package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassdefReduceFieldDefsMod {
  
  inline def apply(classKey: Double, fldExpr: String, f: js.Function2[/* arg0 */ Any, /* arg1 */ Field, Any]): Any = (^.asInstanceOf[js.Dynamic].apply(classKey.asInstanceOf[js.Any], fldExpr.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    classKey: Double,
    fldExpr: String,
    f: js.Function2[/* arg0 */ Any, /* arg1 */ Field, Any],
    `val`: Any
  ): Any = (^.asInstanceOf[js.Dynamic].apply(classKey.asInstanceOf[js.Any], fldExpr.asInstanceOf[js.Any], f.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    classKey: Double,
    fldExpr: String,
    f: js.Function2[/* arg0 */ Any, /* arg1 */ Field, Any],
    `val`: Any,
    opt_obj: Any
  ): Any = (^.asInstanceOf[js.Dynamic].apply(classKey.asInstanceOf[js.Any], fldExpr.asInstanceOf[js.Any], f.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], opt_obj.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    classKey: Double,
    fldExpr: String,
    f: js.Function2[/* arg0 */ Any, /* arg1 */ Field, Any],
    `val`: Unit,
    opt_obj: Any
  ): Any = (^.asInstanceOf[js.Dynamic].apply(classKey.asInstanceOf[js.Any], fldExpr.asInstanceOf[js.Any], f.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], opt_obj.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("@nginstack/engine/lib/classdef/reduceFieldDefs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Field = typings.nginstackEngine.libClassdefFieldMod.^
}
