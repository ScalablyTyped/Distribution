package typings.nrwlDevkit

import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsInvokeNxGeneratorMod {
  
  @JSImport("@nrwl/devkit/src/utils/invoke-nx-generator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertNxGenerator[T](generator: Generator[T, Any, Any]): js.Function1[
    /* generatorOptions */ T, 
    js.Function2[/* tree */ Any, /* context */ Any, js.Promise[Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertNxGenerator")(generator.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* generatorOptions */ T, 
    js.Function2[/* tree */ Any, /* context */ Any, js.Promise[Any]]
  ]]
  inline def convertNxGenerator[T](generator: Generator[T, Any, Any], skipWritingConfigInOldFormat: Boolean): js.Function1[
    /* generatorOptions */ T, 
    js.Function2[/* tree */ Any, /* context */ Any, js.Promise[Any]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertNxGenerator")(generator.asInstanceOf[js.Any], skipWritingConfigInOldFormat.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* generatorOptions */ T, 
    js.Function2[/* tree */ Any, /* context */ Any, js.Promise[Any]]
  ]]
}
