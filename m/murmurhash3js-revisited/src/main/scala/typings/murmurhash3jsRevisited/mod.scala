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
  
  trait X64_ extends StObject {
    
    def hash128(bytes: js.typedarray.Uint8Array): String
  }
  object X64_ {
    
    inline def apply(hash128: js.typedarray.Uint8Array => String): X64_ = {
      val __obj = js.Dynamic.literal(hash128 = js.Any.fromFunction1(hash128))
      __obj.asInstanceOf[X64_]
    }
    
    extension [Self <: X64_](x: Self) {
      
      inline def setHash128(value: js.typedarray.Uint8Array => String): Self = StObject.set(x, "hash128", js.Any.fromFunction1(value))
    }
  }
  
  trait X86_ extends StObject {
    
    def hash128(bytes: js.typedarray.Uint8Array): String
    
    def hash32(bytes: js.typedarray.Uint8Array): Double
  }
  object X86_ {
    
    inline def apply(hash128: js.typedarray.Uint8Array => String, hash32: js.typedarray.Uint8Array => Double): X86_ = {
      val __obj = js.Dynamic.literal(hash128 = js.Any.fromFunction1(hash128), hash32 = js.Any.fromFunction1(hash32))
      __obj.asInstanceOf[X86_]
    }
    
    extension [Self <: X86_](x: Self) {
      
      inline def setHash128(value: js.typedarray.Uint8Array => String): Self = StObject.set(x, "hash128", js.Any.fromFunction1(value))
      
      inline def setHash32(value: js.typedarray.Uint8Array => Double): Self = StObject.set(x, "hash32", js.Any.fromFunction1(value))
    }
  }
}
