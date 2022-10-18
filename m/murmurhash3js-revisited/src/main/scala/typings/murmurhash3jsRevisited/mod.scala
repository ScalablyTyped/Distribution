package typings.murmurhash3jsRevisited

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object MurmurHash3 {
    
    @JSImport("murmurhash3js-revisited", "MurmurHash3")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("murmurhash3js-revisited", "MurmurHash3.x64")
    @js.native
    def x64: X64_ = js.native
    inline def x64_=(x: X64_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("x64")(x.asInstanceOf[js.Any])
    
    @JSImport("murmurhash3js-revisited", "MurmurHash3.x86")
    @js.native
    def x86: X86_ = js.native
    inline def x86_=(x: X86_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("x86")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("murmurhash3js-revisited", "x64")
  @js.native
  val x64: X64_ = js.native
  
  @JSImport("murmurhash3js-revisited", "x86")
  @js.native
  val x86: X86_ = js.native
  
  @js.native
  trait X64_ extends StObject {
    
    def hash128(bytes: js.typedarray.Uint8Array): String = js.native
    def hash128(bytes: js.typedarray.Uint8Array, seed: Double): String = js.native
  }
  
  @js.native
  trait X86_ extends StObject {
    
    def hash128(bytes: js.typedarray.Uint8Array): String = js.native
    def hash128(bytes: js.typedarray.Uint8Array, seed: Double): String = js.native
    
    def hash32(bytes: js.typedarray.Uint8Array): Double = js.native
    def hash32(bytes: js.typedarray.Uint8Array, seed: Double): Double = js.native
  }
}
