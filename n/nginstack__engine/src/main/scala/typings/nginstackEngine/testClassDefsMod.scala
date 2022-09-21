package typings.nginstackEngine

import typings.nginstackEngine.anon.BaseClass
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testClassDefsMod {
  
  inline def apply(testFn: js.Function1[/* arg0 */ Double, Any]): Double = ^.asInstanceOf[js.Dynamic].apply(testFn.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def apply(testFn: js.Function1[/* arg0 */ Double, Any], opt_options: BaseClass): Double = (^.asInstanceOf[js.Dynamic].apply(testFn.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(testFn: js.Function1[/* arg0 */ Double, Any], opt_options: Record[Any, Any]): Double = (^.asInstanceOf[js.Dynamic].apply(testFn.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("@nginstack/engine/lib/testing/classdef/testClassDefs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
