package typings.nblas

import typings.nblas.builtTypesMod.FloatArray
import typings.nblas.nblasStrings.d
import typings.nblas.nblasStrings.s
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtUtilMod {
  
  @JSImport("nblas/built/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def prefix(x: FloatArray): d | s = ^.asInstanceOf[js.Dynamic].applyDynamic("prefix")(x.asInstanceOf[js.Any]).asInstanceOf[d | s]
}
