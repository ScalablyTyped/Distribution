package typings.pprofFormat.mod

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pprof-format", "StringTable")
@js.native
open class StringTable ()
  extends StObject
     with Array[
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
    ] {
  
  def dedup(string: String): Double = js.native
  
  def encode(buffer: js.typedarray.Uint8Array, offset: Double): Double = js.native
  
  def encodedLength: Double = js.native
  
  /* private */ var `private`: Any = js.native
}
/* static members */
object StringTable {
  
  @JSImport("pprof-format", "StringTable")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _encodeString(string: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("_encodeString")(string.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def from(values: js.Array[String]): StringTable = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(values.asInstanceOf[js.Any]).asInstanceOf[StringTable]
  inline def from(values: StringTable): StringTable = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(values.asInstanceOf[js.Any]).asInstanceOf[StringTable]
}
